/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.container;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.eclipse.ecf.core.ContainerConnectException;
import org.eclipse.ecf.core.events.ContainerConnectedEvent;
import org.eclipse.ecf.core.events.ContainerConnectingEvent;
import org.eclipse.ecf.core.events.ContainerDisconnectedEvent;
import org.eclipse.ecf.core.events.ContainerDisconnectingEvent;
import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.security.IConnectContext;
import org.eclipse.ecf.discovery.AbstractDiscoveryContainerAdapter;
import org.eclipse.ecf.discovery.IServiceInfo;
import org.eclipse.ecf.discovery.IServiceListener;
import org.eclipse.ecf.discovery.IServiceTypeListener;
import org.eclipse.ecf.discovery.ServiceContainerEvent;
import org.eclipse.ecf.discovery.ServiceTypeContainerEvent;
import org.eclipse.ecf.discovery.identity.IServiceID;
import org.eclipse.ecf.discovery.identity.IServiceTypeID;
import org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.KVService;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseService;
import org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchCancelRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchCreateRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchService;
import org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event;
import org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType;
import org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue;
import org.eclipse.ecf.provider.etcd3.grpc.client.KVServiceClient;
import org.eclipse.ecf.provider.etcd3.grpc.client.LeaseServiceClient;
import org.eclipse.ecf.provider.etcd3.grpc.client.WatchServiceClient;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3Namespace;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3ServiceID;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;

import io.grpc.Channel;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class Etcd3DiscoveryContainer extends AbstractDiscoveryContainerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(Etcd3DiscoveryContainer.class);
	
	class EtcdServiceInfoKey {
		private final String sessId;
		private final String serviceInfoId;
		private final String fullKey;

		public EtcdServiceInfoKey() {
			this(UUID.randomUUID().toString());
		}

		public EtcdServiceInfoKey(String serviceInfoId) {
			this(getEtcdConfig().getSessionId(), serviceInfoId);
		}

		public EtcdServiceInfoKey(String sessionId, String serviceInfoId) {
			this.sessId = sessionId;
			this.serviceInfoId = serviceInfoId;
			this.fullKey = String.join("/", this.sessId, this.serviceInfoId);
		}

		public String getFullKey() {
			return this.fullKey;
		}

		public boolean matchSessionId(String sId) {
			if (sessId == null)
				return true;
			return sessId.equals(sId);
		}

		public boolean matchFullKey(String otherFullKey) {
			if (otherFullKey == null)
				return true;
			return this.fullKey.equals(otherFullKey);
		}

		public int hashCode() {
			return this.fullKey.hashCode();
		}

		public boolean equals(Object other) {
			if (other == null)
				return false;
			if (!(other instanceof EtcdServiceInfoKey))
				return false;
			EtcdServiceInfoKey ok = (EtcdServiceInfoKey) other;
			return this.fullKey.equals(ok.fullKey);
		}
	}

	// services
	private final Map<EtcdServiceInfoKey, Etcd3ServiceInfo> services = new HashMap<EtcdServiceInfoKey, Etcd3ServiceInfo>();
	private LeaseService leaseService;
	private KVService kvService;
	private WatchService watchService;
	private long leaseId;
	private Scheduler leaseKeepAliveScheduler;

	private long watchId = -1;
	private CountDownLatch watchLatch;

	private boolean initializedFromServer = false;
	private Object connectLock = new Object();
	private Etcd3ServiceID connectedID;

	Etcd3DiscoveryContainer(Etcd3DiscoveryContainerConfig config) {
		super(Etcd3Namespace.NAME, config);
	}

	public void registerService(IServiceInfo serviceInfo) {
		debug("registerService", "serviceInfo=" + serviceInfo); //$NON-NLS-1$ //$NON-NLS-2$
		Etcd3ServiceInfo si = (serviceInfo instanceof Etcd3ServiceInfo) ? (Etcd3ServiceInfo) serviceInfo
				: new Etcd3ServiceInfo(serviceInfo, getEtcdConfig().getTTL());
		String endpointid = serviceInfo.getServiceProperties().getPropertyString("endpoint.id"); //$NON-NLS-1$
		EtcdServiceInfoKey siKey = (endpointid == null) ? new EtcdServiceInfoKey() : new EtcdServiceInfoKey(endpointid);
		String siString = null;
		try {
			siString = si.serializeToJsonString();
		} catch (JSONException e) {
			logEtcdError("registerService", "Cannot serialize serviceInfo=" + si + " for etcd3 publish", e);
			throw new IllegalArgumentException("Exception serializing serviceInfo=" + si, e); //$NON-NLS-1$
		}
		synchronized (services) {
			// First put into etcd remote key store
			grpcPutKeyValue(getFullKey(siKey), siString);
			// then put into local services map
			services.put(siKey, si);
		}
		// Fire events
		fireServiceTypeDiscovered(si.getServiceID().getServiceTypeID());
		fireServiceDiscovered(siKey.getFullKey(), si);
	}

	private String getFullKey(EtcdServiceInfoKey siKey) {
		return getKeyPrefix() + "/" + siKey.getFullKey();
	}

	public void unregisterService(IServiceInfo serviceInfo) {
		debug("unregisterService", "serviceInfo=" + serviceInfo); //$NON-NLS-1$ //$NON-NLS-2$
		EtcdServiceInfoKey siKey = findEtcdServiceInfoKey(serviceInfo.getServiceID(), true);
		if (siKey == null) {
			logEtcdError("unregisterService", "Could not find serviceInfo=" + serviceInfo, null); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		Etcd3ServiceInfo si = null;
		synchronized (services) {
			// Delete from etcd3 remote key store
			etcd3DeleteKey(getFullKey(siKey), false);
			// And remove from local services map
			si = services.remove(siKey);
		}
		if (si != null)
			fireServiceUndiscovered(siKey.getFullKey(), si);
	}

	private void etcd3DeleteKey(String key, boolean prefix) {
		DeleteRangeRequest.Builder b = DeleteRangeRequest.newBuilder().setKey(ByteString.copyFromUtf8(key));
		if (prefix) {
			b.setRangeEnd(ByteString.copyFromUtf8(key + "\\0"));
		}
		this.kvService.deleteRange(Single.just(b.build())).blockingGet();
	}

	@Override
	public String getContainerName() {
		return Etcd3DiscoveryContainerInstantiator.NAME;
	}

	private String getKeyPrefix() {
		return getEtcdConfig().getKeyPrefix();
	}

	private String getSessionKey() {
		return getEtcdConfig().getSessionKey();
	}

	private void initializeFromServer() {
		synchronized (connectLock) {
			if (!initializedFromServer) {
				grpcGetKeyValueList(getKeyPrefix(), true).forEach(kv -> {
					handlePutWatchEvent(kv);
				});
				this.initializedFromServer = true;
			}
		}
	}

	public void connect(ID aTargetID, IConnectContext connectContext) throws ContainerConnectException {
		fireContainerEvent(new ContainerConnectingEvent(getID(), aTargetID, connectContext));

		synchronized (connectLock) {
			try {
				Etcd3DiscoveryContainerConfig config = (connectContext instanceof Etcd3ConfigConnectContext)
						? ((Etcd3ConfigConnectContext) connectContext).getConfig()
						: getEtcdConfig();
				// Setup channel builder
				Channel channel = config.createChannel();
				// Create service instances with channel
				kvService = new KVServiceClient(channel);
				leaseService = new LeaseServiceClient(channel);
				watchService = new WatchServiceClient(channel);

				// Create lease for ttl
				final long ttl = getEtcdConfig().getTTL();
				LeaseGrantResponse resp = leaseService
						.leaseGrant(Single.just(LeaseGrantRequest.newBuilder().setTTL(ttl).build())).blockingGet();
				String error = resp.getError();
				if (!"".equals(error)) {
					throw new ContainerConnectException("Could not create lease for ttl=" + ttl + ". Error: " + error);
				}
				this.leaseId = resp.getID();
				this.leaseKeepAliveScheduler = Schedulers.io();
				// Set up keepAlive requests
				LeaseKeepAliveRequest.Builder leaseTTLBuilder = LeaseKeepAliveRequest.newBuilder().setID(this.leaseId);
				Flowable<LeaseKeepAliveRequest> client = Flowable
						.interval(ttl - getKeepAliveUpdateTime(), TimeUnit.SECONDS, this.leaseKeepAliveScheduler)
						.map(l -> {
							debug("keepAlive", "sending keepalive for leaseid=" + this.leaseId);
							return leaseTTLBuilder.build();
						});
				// Stream keep alive requests
				this.leaseService.leaseKeepAlive(client).subscribe(lkar -> {
					debug("keepAlive", "received keepAlive response=" + lkar);
				});

				// put session key
				grpcPutKeyValue(getSessionKey(), getSessionId());

				String keyPrefix = getKeyPrefix();
				WatchCreateRequest.Builder watchCreateRequestBuilder = WatchCreateRequest.newBuilder()
						.setKey(ByteString.copyFromUtf8(keyPrefix))
						.setRangeEnd(ByteString.copyFromUtf8(keyPrefix + "\\0"));
				// Create watch latch so that watch cancel request can be sent
				this.watchLatch = new CountDownLatch(2);
				Flowable<WatchRequest> watchRequestFlowable = Flowable.create(new FlowableOnSubscribe<WatchRequest>() {
					@Override
					public void subscribe(FlowableEmitter<WatchRequest> emitter) throws Exception {
						// emit create request
						emitter.onNext(
								WatchRequest.newBuilder().setCreateRequest(watchCreateRequestBuilder.build()).build());
						// once create request is sent, watch for latch
						watchLatch.await();
						// if cancelled forget it
						if (emitter.isCancelled()) {
							return;
						}
						// Now send cancel
						emitter.onNext(WatchRequest.newBuilder()
								.setCancelRequest(WatchCancelRequest.newBuilder().setWatchId(watchId).build()).build());
						emitter.onComplete();

					}
				}, BackpressureStrategy.BUFFER).subscribeOn(Schedulers.newThread(), false);
				// setup watch
				watchService.watch(watchRequestFlowable).subscribe(watchResponse -> {
					if (watchResponse.getCreated() && this.watchId == -1) {
						this.watchId = watchResponse.getWatchId();
						this.watchLatch.countDown();
					}
					watchResponse.getEventsList().forEach(e -> handleWatchEvent(e));
				});
				this.initializedFromServer = false;
				this.connectedID = getEtcdConfig().getTargetID();

			} catch (Exception e) {
				URI uri = getEtcdConfig().getTargetLocation();
				ContainerConnectException e1 = new ContainerConnectException(
						"Cannot connect to Etcd3 server "+ uri, e);
				e1.setStackTrace(e.getStackTrace());
				throw e1;
			}

		}
		// Fire container connected event
		fireContainerEvent(new ContainerConnectedEvent(this.getID(), aTargetID));
	}

	private List<KeyValue> grpcGetKeyValueList(String key, boolean prefix) {
		RangeRequest.Builder builder = RangeRequest.newBuilder().setKey(ByteString.copyFromUtf8(key));
		if (prefix) {
			builder.setRangeEnd(ByteString.copyFromUtf8(prefix + "\\0"));
		}
		return kvService.range(Single.just(builder.build())).blockingGet().getKvsList();
	}

	private void grpcPutKeyValue(String key, String value) {
		PutRequest.Builder builder = PutRequest.newBuilder().setKey(ByteString.copyFromUtf8(key));
		// setup lease
		builder.setLease(this.leaseId);
		// set value
		builder.setValue(ByteString.copyFromUtf8(value));
		// Make blocking call here
		kvService.put(Single.just(builder.build())).blockingGet();
	}

	private void handleWatchEvent(Event event) {
		EventType eventType = event.getType();
		if (eventType == EventType.DELETE) {
			handleDeleteWatchEvent(event.getKv());
		} else if (eventType == EventType.PUT) {
			handlePutWatchEvent(event.getKv());
		}
	}

	private EtcdServiceInfoKey parseServiceInfoKey(String key) {
		String[] splitKey = key.split("/");
		switch (splitKey.length) {
		case 0:
		case 1:
			// The key has no '/'s...so it's invalid
			debug("parseServiceInfoKey", "Ignoring invalid key=" + key);
			return null;
		case 2:
			if (getKeyPrefix().equals(splitKey[0])) {
				if (getSessionId().equals(splitKey[1])) {
					debug("parseServiceInfoKey", "Ignoring local sessionId=" + splitKey[1]);
				} else {
					debug("parseServiceInfoKey", "Ignoring remote sessionId=" + splitKey[1]);
				}
			} else {
				debug("parseServiceInfoKey", "Ignoring invalid keyPrefix=" + splitKey[0]);
			}
			return null;
		case 3:
		default:
			String sessionKey = splitKey[1];
			String siKey = splitKey[2];
			try {
				UUID.fromString(sessionKey);
			} catch (IllegalArgumentException e) {
				debug("parseServiceInfoKey", "Could not parse sessionKey=" + sessionKey + " into UUID");
				return null;
			}
			try {
				UUID.fromString(siKey);
			} catch (IllegalArgumentException e) {
				debug("parseServiceInfoKey", "Could not parse siKey=" + siKey + " into UUID");
				return null;
			}
			return new EtcdServiceInfoKey(sessionKey, siKey);
		}
	}

	private void handlePutWatchEvent(KeyValue keyValue) {
		String key = keyValue.getKey().toStringUtf8();
		debug("handlePutWatchEvent","key="+key);
		EtcdServiceInfoKey siKey = parseServiceInfoKey(key);
		if (siKey != null) {
			if (!siKey.matchSessionId(getSessionId())) {
				try {
					Etcd3ServiceInfo si = null;
					si = Etcd3ServiceInfo.deserializeFromString(keyValue.getValue().toStringUtf8());
					synchronized (services) {
						services.put(siKey, si);
					}
					fireServiceTypeDiscovered(si.getServiceID().getServiceTypeID());
					fireServiceDiscovered(siKey.getFullKey(), si);
				} catch (JSONException e) {
					logEtcdError("handleEtcdServiceInfoAdd", //$NON-NLS-1$
							"Error deserializing serviceInfo for key=" + siKey.getFullKey(), //$NON-NLS-1$
							e);
				}
			} else {
				debug("handlePutWatchEvent", "Ignoring serviceInfo from local sessionId=" + getSessionId());
			}
		}
	}

	private void handleDeleteWatchEvent(KeyValue keyValue) {
		String key = keyValue.getKey().toStringUtf8();
		debug("handleDeleteWatchEvent","key="+key);
		EtcdServiceInfoKey siKey = parseServiceInfoKey(key);
		if (siKey != null) {
			if (!siKey.matchSessionId(getSessionId())) {
				Etcd3ServiceInfo si = null;
				synchronized (services) {
					si = services.remove(siKey);
				}
				if (si != null)
					fireServiceUndiscovered(siKey.getFullKey(), si);
			} else {
				debug("handleDeleteWatchEvent", "Ignoring delete for local sessionId=" + getSessionId());
			}
		}
	}

	private long getKeepAliveUpdateTime() {
		return getEtcdConfig().getKeepAliveUpdateTime();
	}

	private Etcd3DiscoveryContainerConfig getEtcdConfig() {
		return (Etcd3DiscoveryContainerConfig) getConfig();
	}

	public ID getConnectedID() {
		return this.connectedID;
	}

	public String getSessionId() {
		return getEtcdConfig().getSessionId();
	}

	public void disconnect() {
		ID connectedID = getConnectedID();
		if (connectedID != null) {
			fireContainerEvent(new ContainerDisconnectingEvent(this.getID(), connectedID));
			synchronized (connectLock) {
				// Stop keep alive scheduler first
				if (this.leaseKeepAliveScheduler != null) {
					this.leaseKeepAliveScheduler.shutdown();
					this.leaseKeepAliveScheduler = null;
				}
				// send watch cancel request
				if (this.watchLatch != null) {
					this.watchLatch.countDown();
					this.watchLatch = null;
				}
				// revoke lease. This will delete all keys in etcd server for this session
				// including both the sessionKey and any EtcdServiceInfo instances
				this.leaseService.leaseRevoke(Single.just(LeaseRevokeRequest.newBuilder().setID(this.leaseId).build()))
						.blockingGet();
				this.connectedID = null;
				this.leaseId = -1;
			}
			fireContainerEvent(new ContainerDisconnectedEvent(this.getID(), connectedID));
		}
	}

	private void fireServiceUndiscovered(String key, IServiceInfo iinfo) {
		debug("fireServiceUndiscovered", "key=" + key + ",serviceInfo=" + iinfo); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		fireServiceUndiscovered(new ServiceContainerEvent(iinfo, getConfig().getID()));
	}

	private void fireServiceDiscovered(String key, IServiceInfo iinfo) {
		debug("fireServiceDiscovered", "key=" + key + ",serviceInfo=" + iinfo); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		fireServiceDiscovered(new ServiceContainerEvent(iinfo, getConfig().getID()));
	}

	private void fireServiceTypeDiscovered(IServiceTypeID serviceTypeID) {
		fireServiceTypeDiscovered(new ServiceTypeContainerEvent(serviceTypeID, getConfig().getID()));
	}

	private void debug(String methodName, String message) {
		logger.debug("methodName="+methodName+",msg="+message);
	}

	private void logEtcdError(String method, String message, Throwable e) {
		logger.error("methodName="+method+",msg="+message,e);
	}

	public IServiceInfo getServiceInfo(IServiceID aServiceID) {
		synchronized (services) {
			for (Etcd3ServiceInfo info : services.values())
				if (info.getServiceID().equals(aServiceID))
					return info;
		}
		return null;
	}

	public IServiceInfo[] getServices() {
		return services.values().toArray(new IServiceInfo[services.size()]);
	}

	private Collection<Etcd3ServiceInfo> getLocalServices() {
		synchronized (services) {
			return services.keySet().stream().filter(k -> k.matchSessionId(getSessionId())).map(k -> services.get(k))
					.collect(Collectors.toList());
		}
	}

	@Override
	public void unregisterAllServices() {
		synchronized (services) {
			getLocalServices().forEach(si -> unregisterService(si));
		}
	}

	public IServiceInfo[] getServices(IServiceTypeID aServiceTypeID) {
		synchronized (services) {
			List<IServiceInfo> results = services.values().stream()
					.filter(v -> v.getServiceID().getServiceTypeID().equals(aServiceTypeID))
					.collect(Collectors.toList());
			return results.toArray(new IServiceInfo[results.size()]);
		}
	}

	public IServiceTypeID[] getServiceTypes() {
		synchronized (services) {
			Set<IServiceTypeID> results = services.values().stream().map(si -> si.getServiceID().getServiceTypeID())
					.collect(Collectors.toSet());
			return results.toArray(new IServiceTypeID[results.size()]);
		}
	}

	private EtcdServiceInfoKey findEtcdServiceInfoKey(IServiceID serviceID, boolean matchSessionId) {
		synchronized (services) {
			return services.keySet().stream().filter(k -> {
				return services.get(k).getServiceID().equals(serviceID) && k.matchSessionId(getSessionId());
			}).findFirst().get();
		}
	}

	public void addServiceListener(final IServiceListener aListener) {
		synchronized (services) {
			initializeFromServer();
		}
		super.addServiceListener(aListener);
	}

	public void addServiceListener(final IServiceTypeID aType, final IServiceListener aListener) {
		synchronized (services) {
			initializeFromServer();
		}
		super.addServiceListener(aType, aListener);
	}

	public void addServiceTypeListener(IServiceTypeListener aListener) {
		synchronized (services) {
			initializeFromServer();
		}
		super.addServiceTypeListener(aListener);
	}

}
