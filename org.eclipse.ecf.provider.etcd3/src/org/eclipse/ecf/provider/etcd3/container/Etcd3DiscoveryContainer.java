/*******************************************************************************
 * Copyright (c) 2014 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.container;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecf.core.ContainerConnectException;
import org.eclipse.ecf.core.events.ContainerConnectedEvent;
import org.eclipse.ecf.core.events.ContainerConnectingEvent;
import org.eclipse.ecf.core.events.ContainerDisconnectedEvent;
import org.eclipse.ecf.core.events.ContainerDisconnectingEvent;
import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.security.IConnectContext;
import org.eclipse.ecf.discovery.AbstractDiscoveryContainerAdapter;
import org.eclipse.ecf.discovery.IServiceInfo;
import org.eclipse.ecf.discovery.ServiceContainerEvent;
import org.eclipse.ecf.discovery.ServiceInfo;
import org.eclipse.ecf.discovery.ServiceTypeContainerEvent;
import org.eclipse.ecf.discovery.identity.IServiceID;
import org.eclipse.ecf.discovery.identity.IServiceTypeID;
import org.eclipse.ecf.provider.etcd3.Activator;
import org.eclipse.ecf.provider.etcd3.DebugOptions;
import org.eclipse.ecf.provider.etcd3.LogUtility;
import org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.KVService;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse;
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

import com.google.protobuf.ByteString;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class Etcd3DiscoveryContainer extends AbstractDiscoveryContainerAdapter {

	public class EtcdServiceInfoKey {
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

	public Etcd3DiscoveryContainer(Etcd3DiscoveryContainerConfig config) {
		super(Etcd3Namespace.NAME, config);
	}

	public Etcd3DiscoveryContainer() throws MalformedURLException, URISyntaxException {
		super(Etcd3Namespace.NAME, new Etcd3DiscoveryContainerConfig());
	}

	public void registerService(IServiceInfo serviceInfo) {
		trace("registerService", "serviceInfo=" + serviceInfo); //$NON-NLS-1$ //$NON-NLS-2$
		long ttl = serviceInfo.getTTL();
		if (ttl == ServiceInfo.DEFAULT_TTL)
			ttl = ((Etcd3DiscoveryContainerConfig) getConfig()).getTTL();
		Etcd3ServiceInfo si = (serviceInfo instanceof Etcd3ServiceInfo) ? (Etcd3ServiceInfo) serviceInfo
				: new Etcd3ServiceInfo(serviceInfo, ttl);
		String endpointid = serviceInfo.getServiceProperties().getPropertyString("endpoint.id"); //$NON-NLS-1$
		EtcdServiceInfoKey siKey = (endpointid == null) ? new EtcdServiceInfoKey() : new EtcdServiceInfoKey(endpointid);
		String siString = null;
		try {
			siString = si.serializeToJsonString();
		} catch (JSONException e) {
			throw new IllegalArgumentException("Exception serializing serviceInfo=" + si, e); //$NON-NLS-1$
		}
		String fullKey = siKey.getFullKey();
		synchronized (services) {
			services.put(siKey, si);
			grpcPutKeyValue(fullKey, siString);
		}
		fireServiceTypeDiscovered(si.getServiceID().getServiceTypeID());
		fireServiceDiscovered(fullKey, si);
	}

	public void unregisterService(IServiceInfo serviceInfo) {
		trace("unregisterService", "serviceInfo=" + serviceInfo); //$NON-NLS-1$ //$NON-NLS-2$
		EtcdServiceInfoKey siKey = findEtcdServiceInfoKey(serviceInfo.getServiceID(), true);
		if (siKey == null) {
			logEtcdError("unregisterService", "Could not find serviceInfo=" + serviceInfo, null); //$NON-NLS-1$ //$NON-NLS-2$
			return;
		}
		String fullKey = siKey.getFullKey();
		Etcd3ServiceInfo si = null;
		synchronized (services) {
			si = services.remove(siKey);
			etcd3DeleteKey(fullKey, false);
		}
		if (si != null)
			fireServiceUndiscovered(fullKey, si);
	}

	private ByteString getByteString(String s) {
		return ByteString.copyFromUtf8(s);
	}

	private void etcd3DeleteKey(String key, boolean prefix) {
		DeleteRangeRequest.Builder b = DeleteRangeRequest.newBuilder().setKey(getByteString(key));
		if (prefix) {
			b.setRangeEnd(getByteString(key + "\\0"));
		}
		DeleteRangeResponse resp = this.kvService.deleteRange(Single.just(b.build())).blockingGet();
		trace("etcd3DeleteKey", "delete response=" + resp);
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

	public void connect(ID aTargetID, IConnectContext connectContext) throws ContainerConnectException {
		fireContainerEvent(new ContainerConnectingEvent(getID(), aTargetID, connectContext));

		synchronized (connectLock) {
			URI uri = getTargetID().getLocation();
			// Setup channel builder
			ManagedChannelBuilder<?> managedChannelBuilder = ManagedChannelBuilder.forAddress(uri.getHost(),
					uri.getPort());
			Channel channel = managedChannelBuilder.usePlaintext().build();
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
					.interval(ttl - getKeepAliveUpdateTime(), TimeUnit.SECONDS, this.leaseKeepAliveScheduler).map(l -> {
						trace("keepAlive", "sending keepalive for leaseid=" + this.leaseId);
						return leaseTTLBuilder.build();
					});
			// Stream keep alive requests
			this.leaseService.leaseKeepAlive(client).subscribe(lkar -> {
				trace("keepAlive", "received keepAlive response=" + lkar);
			});

			// Setup watch create
			String keyPrefix = getKeyPrefix();
			WatchCreateRequest.Builder watchCreateRequestBuilder = WatchCreateRequest.newBuilder()
					.setKey(getByteString(keyPrefix)).setRangeEnd(getByteString(keyPrefix + "\\0"));
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
			watchService.watch(watchRequestFlowable).subscribe(watchResponse -> {
				if (watchResponse.getCreated() && this.watchId == -1) {
					this.watchId = watchResponse.getWatchId();
					trace("watch", "watchId=" + this.watchId);
					this.watchLatch.countDown();
				}
				watchResponse.getEventsList().forEach(e -> handleWatchEvent(e));
			});
			// put session key
			grpcPutKeyValue(getSessionKey(), getSessionId());
			// Now get existing keys from remote store
			grpcGetKeyValueList(keyPrefix, true).forEach(kv -> {
				handlePutWatchEvent(kv);
			});
		}

		// Fire container connected event
		fireContainerEvent(new ContainerConnectedEvent(this.getID(), aTargetID));
	}

	protected RangeRequest.Builder createRangeRequestBuilder() {
		return RangeRequest.newBuilder();
	}

	protected List<KeyValue> grpcGetKeyValueList(String key, boolean prefix) {
		RangeRequest.Builder builder = createRangeRequestBuilder().setKey(ByteString.copyFromUtf8(key));
		if (prefix) {
			builder.setRangeEnd(ByteString.copyFromUtf8(prefix + "\\0"));
		}
		return kvService.range(Single.just(builder.build())).blockingGet().getKvsList();
	}

	protected void grpcPutKeyValue(String key, String value) {
		try {
			PutRequest.Builder builder = PutRequest.newBuilder().setKey(ByteString.copyFromUtf8(key));
			// setup lease
			builder.setLease(this.leaseId);
			// set value
			builder.setValue(ByteString.copyFromUtf8(value));
			// Make blocking call
			kvService.put(Single.just(builder.build())).blockingGet();
			trace("grpcPutValue", "put succeeded with key=" + key + ",value=" + value);
		} catch (Exception e) {
			logEtcdError("grpcPutKeyValue", "Could not put key=" + key + ",value=" + value + " into etd3 store", e);
		}
	}

	private Etcd3ServiceID getTargetID() {
		return getEtcdConfig().getTargetID();
	}

	void handleWatchEvent(Event event) {
		EventType eventType = event.getType();
		if (eventType == EventType.DELETE) {
			handleDeleteWatchEvent(event.getKv());
		} else if (eventType == EventType.PUT) {
			handlePutWatchEvent(event.getKv());
		}
	}

	private EtcdServiceInfoKey parseServiceInfoKey(String key) {
		if (key != null && !"".equals(key)) {
			String[] splitKey = key.split("/");
			if (splitKey.length >= 1) {
				// valid key has <prefix>/<sessionId>
				if (splitKey[0].equals(getKeyPrefix()))
					if (splitKey.length > 2) {
						String sessionKey = splitKey[1];
						String siKey = splitKey[2];
						try {
							UUID.fromString(sessionKey);
						} catch (IllegalArgumentException e) {
							logEtcdError("parseServiceInfoKey",
									"Could not parse sessionKey=" + sessionKey + " into UUID", e);
							return null;
						}
						try {
							UUID.fromString(siKey);
						} catch (IllegalArgumentException e) {
							logEtcdError("parseServiceInfoKey", "Could not parse siKey=" + siKey + " into UUID", e);
							return null;
						}
						return new EtcdServiceInfoKey(sessionKey, siKey);
					}
			}
		}
		return null;
	}

	protected void handlePutWatchEvent(KeyValue keyValue) {
		trace("handlePutEvent", "keyValue=" + keyValue);
		String key = keyValue.getKey().toStringUtf8();
		EtcdServiceInfoKey siKey = parseServiceInfoKey(key);
		if (siKey != null && !siKey.matchSessionId(getSessionId())) {
			try {
				Etcd3ServiceInfo si = null;
				si = Etcd3ServiceInfo.deserializeFromString(keyValue.getValue().toStringUtf8());
				synchronized (services) {
					services.put(siKey, si);
				}
				fireServiceTypeDiscovered(si.getServiceID().getServiceTypeID());
				fireServiceDiscovered(siKey.getFullKey(), si);
			} catch (JSONException e) {
				logEtcdError("handleEtcdServiceInfoAdd", "Error deserializing value for keyValue=" + keyValue, //$NON-NLS-1$ //$NON-NLS-2$
						e);
			}
		} else {
			trace("handlePutWatchEvent", "Could not get service info key from keyValue=" + keyValue); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	protected void handleDeleteWatchEvent(KeyValue keyValue) {
		trace("handleDeleteEvent", "event=" + keyValue);
		EtcdServiceInfoKey siKey = parseServiceInfoKey(keyValue.getKey().toStringUtf8());
		if (siKey != null) {
			Etcd3ServiceInfo si = null;
			synchronized (services) {
				si = services.remove(siKey);
			}
			if (si != null)
				fireServiceUndiscovered(siKey.getFullKey(), si);

		} else {
			logEtcdError("handleDeleteWatchEvent", "Could not get EtcdServiceInfoKey for keyValue=" + keyValue); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	private long getKeepAliveUpdateTime() {
		return getEtcdConfig().getKeepAliveUpdateTime();
	}

	private void leaseRevoke() {
		try {
			LeaseRevokeResponse resp = this.leaseService
					.leaseRevoke(Single.just(LeaseRevokeRequest.newBuilder().setID(this.leaseId).build()))
					.blockingGet();
			trace("leaseRevoke", "leaseResponse=" + resp);
		} catch (Exception e) {
			logEtcdError("grpcLeaseRevoke", "Could not revoke lease for leaseId=" + this.leaseId, e);
		}
	}

	Etcd3DiscoveryContainerConfig getEtcdConfig() {
		return (Etcd3DiscoveryContainerConfig) getConfig();
	}

	public ID getConnectedID() {
		return getEtcdConfig().getTargetID();
	}

	public String getSessionId() {
		return getEtcdConfig().getSessionId();
	}

	private Object connectLock = new Object();

	public void disconnect() {
		fireContainerEvent(new ContainerDisconnectingEvent(this.getID(), getConnectedID()));
		synchronized (connectLock) {
			// Stop keep alive scheduler first
			if (this.leaseKeepAliveScheduler != null) {
				this.leaseKeepAliveScheduler.shutdown();
				this.leaseKeepAliveScheduler = null;
			}
			// revoke lease. This will delete all keys in etcd server for this session
			// including both the sessionKey and any EtcdServiceInfo instances
			leaseRevoke();
			// Finally send watch cancel request
			if (this.watchLatch != null) {
				this.watchLatch.countDown();
				this.watchLatch = null;
			}
		}
		fireContainerEvent(new ContainerDisconnectedEvent(this.getID(), getConnectedID()));
	}

	IStatus createErrorStatus(String message) {
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, message);
	}

	IStatus createErrorStatus(String message, Throwable t) {
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, t);
	}

	private void fireServiceUndiscovered(String key, IServiceInfo iinfo) {
		trace("fireServiceUndiscovered", "key=" + key + ",serviceInfo=" + iinfo); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		fireServiceUndiscovered(new ServiceContainerEvent(iinfo, getConfig().getID()));
	}

	private void fireServiceDiscovered(String key, IServiceInfo iinfo) {
		trace("fireServiceDiscovered", "key=" + key + ",serviceInfo=" + iinfo); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		fireServiceDiscovered(new ServiceContainerEvent(iinfo, getConfig().getID()));
	}

	private void fireServiceTypeDiscovered(IServiceTypeID serviceTypeID) {
		fireServiceTypeDiscovered(new ServiceTypeContainerEvent(serviceTypeID, getConfig().getID()));
	}

	private void trace(String methodName, String message) {
		System.out.println("methodName=" + methodName + ",message=" + message);
		// LogUtility.trace(methodName, DebugOptions.DEBUG, getClass(), message);
	}

	private void logEtcdError(String method, String message, Throwable e) {
		LogUtility.logError(method, DebugOptions.EXCEPTIONS_THROWING, getClass(), message, e);
	}

	private void logEtcdError(String method, String message) {
		logEtcdError(method, message, null);
	}

	private void logAndThrowEtcdError(String method, String message, Exception e) {
		logEtcdError(method, message, e);
		throw new RuntimeException(message, e);
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
}