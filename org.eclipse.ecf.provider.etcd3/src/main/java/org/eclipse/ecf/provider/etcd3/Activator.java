/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3;

import java.util.Hashtable;

import org.eclipse.ecf.core.ContainerConnectException;
import org.eclipse.ecf.core.ContainerCreateException;
import org.eclipse.ecf.core.ContainerTypeDescription;
import org.eclipse.ecf.core.IContainerFactory;
import org.eclipse.ecf.core.identity.IDFactory;
import org.eclipse.ecf.core.identity.Namespace;
import org.eclipse.ecf.discovery.IDiscoveryAdvertiser;
import org.eclipse.ecf.discovery.IDiscoveryLocator;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainer;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainerConfig;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainerInstantiator;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3Namespace;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.osgi.framework.Bundle;

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

	private Etcd3DiscoveryContainer container;
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
			logger.debug("starting Etcd3 discovery provider");
			@SuppressWarnings("rawtypes")
			final Hashtable props = new Hashtable();
			props.put(IDiscoveryLocator.CONTAINER_NAME, Etcd3DiscoveryContainerInstantiator.NAME);
			context.registerService(
					new String[] { IDiscoveryAdvertiser.class.getName(), IDiscoveryLocator.class.getName() },
					new ServiceFactory<Etcd3DiscoveryContainer>() {
						public Etcd3DiscoveryContainer getService(Bundle bundle,
								ServiceRegistration<Etcd3DiscoveryContainer> registration) {
							if (container == null) {
								try {
									container = (Etcd3DiscoveryContainer) getContainerFactory()
											.createContainer(Etcd3DiscoveryContainerInstantiator.NAME);
									logger.debug("Etcd3 discovery container created with name="+ Etcd3DiscoveryContainerInstantiator.NAME);
								} catch (ContainerCreateException e) {
									logger.error("Could not create Etcd3 discovery="+ Etcd3DiscoveryContainerInstantiator.NAME, e);
									container = null;
								}
							}
							// Connect
							try {
								container.connect(null, null);
								logger.debug("Etcd3 discovery container connected with name="+ Etcd3DiscoveryContainerInstantiator.NAME);
							} catch (ContainerConnectException e) {
								logger.error("Could not connect Etcd3 discovery="+ Etcd3DiscoveryContainerInstantiator.NAME, e);
								container = null;
							}
							return container;
						}

						public void ungetService(Bundle bundle,
								ServiceRegistration<Etcd3DiscoveryContainer> registration,
								Etcd3DiscoveryContainer service) {
							if (container != null) {
								container.disconnect();
								container = null;
							}
						}
					}, props);
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

	@SuppressWarnings("unchecked")
	IContainerFactory getContainerFactory() {
		if (cfTracker == null) {
			cfTracker = new ServiceTracker<IContainerFactory, IContainerFactory>(context, IContainerFactory.class,
					null);
			cfTracker.open();
		}
		return (IContainerFactory) cfTracker.getService();
	}

}
