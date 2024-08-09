/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3;

import org.eclipse.ecf.core.ContainerTypeDescription;
import org.eclipse.ecf.core.IContainerFactory;
import org.eclipse.ecf.core.identity.IDFactory;
import org.eclipse.ecf.core.identity.Namespace;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainer;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainerConfig;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainerInstantiator;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3Namespace;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {

	public static final String PLUGIN_ID = "org.eclipse.ecf.provider.etcd3"; //$NON-NLS-1$

	private static final Logger logger = LoggerFactory.getLogger(Activator.class);

	private static Activator plugin;

	public static Activator getDefault() {
		return plugin;
	}

	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}

	private ServiceTracker<IContainerFactory, IContainerFactory> cfTracker;

	@SuppressWarnings("unchecked")
	public void start(BundleContext ctxt) throws Exception {
		plugin = this;
		context = ctxt;
		// Register Namespace
		
		Etcd3Namespace.INSTANCE = new Etcd3Namespace();
		context.registerService(Namespace.class, Etcd3Namespace.INSTANCE, null);
		IDFactory.getDefault().addNamespace(Etcd3Namespace.INSTANCE);
		// register ContainerTypeDescription
		context.registerService(ContainerTypeDescription.class,
				new ContainerTypeDescription(Etcd3DiscoveryContainerInstantiator.NAME,
						new Etcd3DiscoveryContainerInstantiator(), "Etcd3 Discovery Container", true, false),
				null);
		// Only create/setup if not explicitly disabled
		if (!Boolean.parseBoolean(System.getProperty(Etcd3DiscoveryContainerConfig.ETCD_DISABLED_PROP, "false"))) {
			context.registerService(new String[] { Etcd3DiscoveryContainerConfig.class.getName()},Etcd3DiscoveryContainerConfig.newBuilder().build(),null);
		} else {
			logger.debug("Etcd3 discovery provider DISABLED");
		}
	}

	public void stop(BundleContext context) throws Exception {
		if (cfTracker != null) {
			cfTracker.close();
			cfTracker = null;
		}
		context = null;
		plugin = null;
	}

}
