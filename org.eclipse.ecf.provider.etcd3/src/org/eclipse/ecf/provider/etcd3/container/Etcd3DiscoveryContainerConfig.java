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
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.eclipse.ecf.core.identity.IDFactory;
import org.eclipse.ecf.discovery.DiscoveryContainerConfig;
import org.eclipse.ecf.discovery.identity.IServiceTypeID;
import org.eclipse.ecf.discovery.identity.ServiceIDFactory;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3Namespace;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3ServiceID;

public class Etcd3DiscoveryContainerConfig extends DiscoveryContainerConfig {

	public static final String ETCD_TARGETID_PROTOCOL_PROP = Etcd3DiscoveryContainerInstantiator.NAME
			+ ".protocol"; //$NON-NLS-1$
	public static final String ETCD_TARGETID_PROTOCOL_DEFAULT = System
			.getProperty(ETCD_TARGETID_PROTOCOL_PROP, "http"); //$NON-NLS-1$
	public static final String ETCD_TARGETID_HOSTNAME_PROP = Etcd3DiscoveryContainerInstantiator.NAME
			+ ".hostname"; //$NON-NLS-1$
	public static final String ETCD_TARGETID_HOSTNAME_DEFAULT = System
			.getProperty(ETCD_TARGETID_HOSTNAME_PROP, "127.0.0.1"); //$NON-NLS-1$
	public static final String ETCD_TARGETID_PORT_PROP = Etcd3DiscoveryContainerInstantiator.NAME
			+ ".port"; //$NON-NLS-1$
	public static final Integer ETCD_TARGETID_PORT_DEFAULT = Integer
			.getInteger(ETCD_TARGETID_PORT_PROP, 2379);

	public static final String ETCD_TARGETID_PROP = Etcd3DiscoveryContainerInstantiator.NAME
			+ ".targetid"; //$NON-NLS-1$
	public static final String ETCD_TARGETID_DEFAULT = System
			.getProperty(ETCD_TARGETID_PROP);

	public static final String ETCD_SESSIONID_PROP = Etcd3DiscoveryContainerInstantiator.NAME
			+ ".sessionid"; //$NON-NLS-1$
	public static final String ETCD_SESSIONID_DEFAULT = System
			.getProperty(ETCD_SESSIONID_PROP);

	public static final String ETCD_TTL_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".ttl"; //$NON-NLS-1$
	public static final Integer ETCD_TTL_DEFAULT = Integer.getInteger(ETCD_TTL_PROP, 30);
	
	public static final String ETCD_CONTAINERID_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".containerId"; //$NON-NLS-1$
	public static final String ETCD_CONTAINERID_DEFAULT = System.getProperty(ETCD_CONTAINERID_PROP,Etcd3DiscoveryContainer.class.getName());
	
	public static final String ETCD_KEYPREFIX_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".keyPrefix"; //$NON-NLS-1$
	public static final String ETCD_KEYPREFIX_DEFAULT = System.getProperty(ETCD_KEYPREFIX_PROP,Etcd3DiscoveryContainer.class.getName());
	public static final String ETCD_KEEPALIVE_UPDATE_TIME_PROP = Etcd3DiscoveryContainerInstantiator.NAME + ".keepAliveUpdateTime"; //$NON-NLS-1$
	public static final Integer ETCD_KEEPALIVE_UPDATE_TIME_DEFAULT = Integer.getInteger(ETCD_KEEPALIVE_UPDATE_TIME_PROP, 5);

	private Etcd3ServiceID targetID;
	private String sessionId;
	private long ttl = ETCD_TTL_DEFAULT.longValue();
	private String keyPrefix = ETCD_KEYPREFIX_DEFAULT;
	private int keepAliveUpdateTime = ETCD_KEEPALIVE_UPDATE_TIME_DEFAULT.intValue();
	
	public Etcd3DiscoveryContainerConfig() throws MalformedURLException, URISyntaxException {
		this(ETCD_CONTAINERID_DEFAULT);
	}
	
	public Etcd3DiscoveryContainerConfig(String containerId)
			throws MalformedURLException, URISyntaxException {
		super(IDFactory.getDefault().createStringID(containerId));
		setTargetID(null);
		setSessionId(null);
	}

	private void setSessionId(String id) {
		if (id == null) {
			if (ETCD_SESSIONID_DEFAULT == null) {
				id = UUID.randomUUID().toString();
			} else
				id = ETCD_SESSIONID_DEFAULT;
		}
		this.sessionId = id;
	}

	public Etcd3DiscoveryContainerConfig(String containerId, String targetId)
			throws MalformedURLException, URISyntaxException {
		this(containerId);
		setTargetID(targetId);
		setSessionId(sessionId);
	}

	public Etcd3DiscoveryContainerConfig(String containerId, String targetId, long ttl) 
		throws MalformedURLException, URISyntaxException {
		this(containerId);
		setTargetID(targetId);
		setSessionId(sessionId);
		setTTL(ttl);
	}
	private void setTargetID(String aTargetId) throws MalformedURLException,
			URISyntaxException {
		URL url = null;
		if (aTargetId == null)
			url = (ETCD_TARGETID_DEFAULT != null) ? new URL(
					ETCD_TARGETID_DEFAULT) : new URL(
					ETCD_TARGETID_PROTOCOL_DEFAULT,
					ETCD_TARGETID_HOSTNAME_DEFAULT,
					ETCD_TARGETID_PORT_DEFAULT.intValue(),
					"");
		else
			url = new URL(aTargetId);
		IServiceTypeID serviceTypeID = ServiceIDFactory.getDefault()
				.createServiceTypeID(Etcd3Namespace.INSTANCE,
						Etcd3Namespace.SCHEME);
		this.targetID = (Etcd3ServiceID) IDFactory.getDefault()
				.createID(Etcd3Namespace.NAME,
						new Object[] { serviceTypeID, url.toURI() });
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

	public void setKeepAliveUpdateTime(int keepAliveUpdateTime) {
		this.keepAliveUpdateTime = keepAliveUpdateTime;
	}
	public int getKeepAliveUpdateTime() {
		return this.keepAliveUpdateTime;
	}
}
