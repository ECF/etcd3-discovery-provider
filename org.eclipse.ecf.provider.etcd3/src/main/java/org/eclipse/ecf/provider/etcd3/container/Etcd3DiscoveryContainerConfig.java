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
import java.net.URISyntaxException;
import java.util.UUID;

import org.eclipse.ecf.core.identity.IDCreateException;
import org.eclipse.ecf.core.identity.IDFactory;
import org.eclipse.ecf.discovery.DiscoveryContainerConfig;
import org.eclipse.ecf.discovery.identity.ServiceIDFactory;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3Namespace;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3ServiceID;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;

public class Etcd3DiscoveryContainerConfig extends DiscoveryContainerConfig {

	public static final String ETCD_DISABLED_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".disabled";

	public static final String ETCD_TARGETID_PROTOCOL_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".protocol"; //$NON-NLS-1$
	public static final String ETCD_TARGETID_PROTOCOL_DEFAULT = System.getProperty(ETCD_TARGETID_PROTOCOL_PROP, "http"); //$NON-NLS-1$
	public static final String ETCD_TARGETID_HOSTNAME_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".hostname"; //$NON-NLS-1$
	public static final String ETCD_TARGETID_HOSTNAME_DEFAULT = System.getProperty(ETCD_TARGETID_HOSTNAME_PROP,
			"127.0.0.1"); //$NON-NLS-1$
	public static final String ETCD_TARGETID_PORT_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".port"; //$NON-NLS-1$
	public static final Integer ETCD_TARGETID_PORT_DEFAULT = Integer.getInteger(ETCD_TARGETID_PORT_PROP, 2379);

	public static final String ETCD_TARGETID_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".targetid"; //$NON-NLS-1$
	public static final String ETCD_TARGETID_DEFAULT = System.getProperty(ETCD_TARGETID_PROP);

	public static final String ETCD_SESSIONID_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".sessionid"; //$NON-NLS-1$
	public static final String ETCD_SESSIONID_DEFAULT = System.getProperty(ETCD_SESSIONID_PROP);

	public static final String ETCD_TTL_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".ttl"; //$NON-NLS-1$
	public static final Integer ETCD_TTL_DEFAULT = Integer.getInteger(ETCD_TTL_PROP, 30);

	public static final String ETCD_CONTAINERID_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".containerId"; //$NON-NLS-1$
	public static final String ETCD_CONTAINERID_DEFAULT = System.getProperty(ETCD_CONTAINERID_PROP,
			Etcd3DiscoveryContainer.class.getName());

	public static final String ETCD_KEYPREFIX_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".keyPrefix"; //$NON-NLS-1$
	public static final String ETCD_KEYPREFIX_DEFAULT = System.getProperty(ETCD_KEYPREFIX_PROP,
			Etcd3DiscoveryContainer.class.getName());
	public static final String ETCD_KEEPALIVE_UPDATE_TIME_PROP = Etcd3DiscoveryContainerInstantiator.NAME
			+ ".keepAliveUpdateTime"; //$NON-NLS-1$
	public static final Integer ETCD_KEEPALIVE_UPDATE_TIME_DEFAULT = Integer.getInteger(ETCD_KEEPALIVE_UPDATE_TIME_PROP,
			5);

	public static final String ETCD_USEPLAINTEXT_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".usePlaintext";;
	public static final Boolean ETCD_USEPLAINTEXT_DEFAULT = Boolean
			.valueOf(System.getProperty(ETCD_USEPLAINTEXT_PROP, "false"));

	public static final String ETCD_RETRY_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".retry";
	public static final Boolean ETCD_RETRY_DEFAULT = Boolean.valueOf(System.getProperty(ETCD_RETRY_PROP, "false"));

	private Etcd3ServiceID targetID;
	private String sessionId = ETCD_SESSIONID_DEFAULT == null ? UUID.randomUUID().toString() : ETCD_SESSIONID_DEFAULT;
	private long ttl = ETCD_TTL_DEFAULT.longValue();
	private String keyPrefix = ETCD_KEYPREFIX_DEFAULT;
	private int keepAliveUpdateTime = ETCD_KEEPALIVE_UPDATE_TIME_DEFAULT.intValue();
	private boolean usePlaintext = ETCD_USEPLAINTEXT_DEFAULT;
	private boolean retry = ETCD_RETRY_DEFAULT;

	public static class Builder {

		private String protocol = ETCD_TARGETID_PROTOCOL_DEFAULT;
		private String hostname = ETCD_TARGETID_HOSTNAME_DEFAULT;
		private int port = ETCD_TARGETID_PORT_DEFAULT;

		public Builder setProtocol(String protocol) {
			this.protocol = protocol;
			return this;
		}

		public Builder setHostname(String hostname) {
			this.hostname = hostname;
			return this;
		}

		public Builder setPort(int port) {
			this.port = port;
			return this;
		}

		public Builder setTtl(long ttl) {
			this.config.ttl = ttl;
			return this;
		}

		public Builder setKeyPrefix(String keyPrefix) {
			this.config.keyPrefix = keyPrefix;
			return this;
		}

		public Builder setKeepAliveUpdateTime(int keepAliveUpdateTime) {
			this.config.keepAliveUpdateTime = keepAliveUpdateTime;
			return this;
		}

		public Builder setSessionId(String sessionId) {
			this.config.sessionId = sessionId;
			return this;
		}

		public Builder setUsePlaintext() {
			this.config.usePlaintext = true;
			return this;
		}

		public Builder setUseRetry() {
			this.config.retry = true;
			return this;
		}

		private Etcd3DiscoveryContainerConfig config;

		private Builder(String containerId) {
			config = new Etcd3DiscoveryContainerConfig(containerId);
		}

		public Etcd3DiscoveryContainerConfig build() throws IDCreateException {
			URI uri = null;
			try {
				uri = new URI(this.protocol, null, this.hostname, this.port, null, null, null);
			} catch (URISyntaxException e) {
				throw new IDCreateException(
						"Cannot create uri from protocol=" + protocol + ",hostname=" + hostname + ",port=" + port);
			}
			config.setTargetID((Etcd3ServiceID) IDFactory.getDefault().createID(Etcd3Namespace.NAME, new Object[] {
					ServiceIDFactory.getDefault().createServiceTypeID(Etcd3Namespace.INSTANCE, Etcd3Namespace.SCHEME),
					uri }));
			return config;
		}
	}

	public static Etcd3DiscoveryContainerConfig.Builder newBuilder() {
		return new Builder(ETCD_CONTAINERID_DEFAULT);
	}

	public static Etcd3DiscoveryContainerConfig.Builder newBuilder(String containerId) {
		return new Builder(containerId);
	}

	private Etcd3DiscoveryContainerConfig(String containerId) {
		super(IDFactory.getDefault().createStringID(containerId));
	}

	private void setTargetID(Etcd3ServiceID aTargetId) {
		this.targetID = aTargetId;
	}

	public Etcd3ServiceID getTargetID() {
		return targetID;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setTTL(long ttl) {
		this.ttl = ttl;
	}

	public long getTTL() {
		return this.ttl;
	}

	public String getKeyPrefix() {
		return this.keyPrefix;
	}

	public void setKeyPrefix(String keyPrefix) {
		this.keyPrefix = keyPrefix;
	}

	public String getSessionKey() {
		return String.join("/", getKeyPrefix(), getSessionId());
	}

	public int getKeepAliveUpdateTime() {
		return this.keepAliveUpdateTime;
	}

	public URI getTargetLocation() {
		return getTargetID().getLocation();
	}

	@SuppressWarnings("rawtypes")
	protected ManagedChannelBuilder createManagedChannelBuilder() {
		URI uri = getTargetLocation();
		ManagedChannelBuilder mcBuilder = ManagedChannelBuilder.forAddress(uri.getHost(), uri.getPort());
		if (this.usePlaintext) {
			mcBuilder.usePlaintext();
		}
		if (this.retry) {
			mcBuilder.enableRetry();
		}
		return mcBuilder;
	}

	public Channel createChannel() {
		return createManagedChannelBuilder().build();
	}
}
