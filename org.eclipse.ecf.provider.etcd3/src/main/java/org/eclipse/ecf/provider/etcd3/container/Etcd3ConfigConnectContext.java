/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.container;

import java.io.IOException;

import org.eclipse.ecf.core.security.Callback;
import org.eclipse.ecf.core.security.CallbackHandler;
import org.eclipse.ecf.core.security.IConnectContext;
import org.eclipse.ecf.core.security.UnsupportedCallbackException;

public class Etcd3ConfigConnectContext implements IConnectContext {

	private final Etcd3DiscoveryContainerConfig config;

	public Etcd3ConfigConnectContext(Etcd3DiscoveryContainerConfig config) {
		this.config = config;
	}

	public Etcd3DiscoveryContainerConfig getConfig() {
		return config;
	}

	@Override
	public CallbackHandler getCallbackHandler() {
		return null;
	}
}
