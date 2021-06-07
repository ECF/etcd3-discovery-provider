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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecf.core.ContainerTypeDescription;
import org.eclipse.ecf.core.IContainerFactory;
import org.eclipse.ecf.core.identity.Namespace;
import org.eclipse.ecf.core.util.SystemLogService;
import org.eclipse.ecf.discovery.IDiscoveryAdvertiser;
import org.eclipse.ecf.discovery.IDiscoveryLocator;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainer;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainerConfig;
import org.eclipse.ecf.provider.etcd3.container.Etcd3DiscoveryContainerInstantiator;
import org.eclipse.ecf.provider.etcd3.identity.Etcd3Namespace;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	public static final String PLUGIN_ID = "org.eclipse.ecf.provider.etcd3"; //$NON-NLS-1$

	private static Activator plugin;

	public static Activator getDefault() {
		return plugin;
	}

	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}

	// Logging
	private ServiceTracker<LogService, LogService> logServiceTracker = null;
	private LogService logService = null;
	private Etcd3DiscoveryContainer container;
	private ServiceTracker<IContainerFactory, IContainerFactory> cfTracker;

	@SuppressWarnings("unchecked")
	public void start(BundleContext ctxt) throws Exception {
		plugin = this;
		context = ctxt;
		// Only create/setup if not disabled
		if (!Boolean.parseBoolean(System.getProperty(Etcd3DiscoveryContainerConfig.ETCD_DISABLED_PROP, "false"))) {
			// Register Namespace
			context.registerService(Namespace.class, new Etcd3Namespace(), null);
			// register ContainerTypeDescription
			context.registerService(ContainerTypeDescription.class,
					new ContainerTypeDescription(Etcd3DiscoveryContainerInstantiator.NAME,
							new Etcd3DiscoveryContainerInstantiator(), "Etcd3 Discovery Container", true, false),
					null);
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
									container.connect(null, null);
								} catch (Exception e) {
									container = null;
								}
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
		}
	}

	public void stop(BundleContext context) throws Exception {
		if (cfTracker != null) {
			cfTracker.close();
			cfTracker = null;
		}
		if (logServiceTracker != null) {
			logServiceTracker.close();
			logServiceTracker = null;
			logService = null;
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

	public LogService getLogService() {
		if (logServiceTracker == null) {
			logServiceTracker = new ServiceTracker<LogService, LogService>(context, LogService.class.getName(), null);
			logServiceTracker.open();
		}
		logService = (LogService) logServiceTracker.getService();
		if (logService == null)
			logService = new SystemLogService(PLUGIN_ID);
		return logService;
	}

	@SuppressWarnings("deprecation")
	public void log(IStatus status) {
		int statusCode = status.getCode();
		String logMessage = status.getMessage();
		Throwable t = status.getException();
		LogService logService = getLogService();
		switch (statusCode) {
		case IStatus.OK:
		case IStatus.INFO:
			logService.log(LogService.LOG_INFO, logMessage);
			break;
		case IStatus.WARNING:
			logService.log(LogService.LOG_WARNING, logMessage);
			break;
		case IStatus.ERROR:
			logService.log(LogService.LOG_ERROR, logMessage, t);
			break;
		default:
			logService.log(LogService.LOG_DEBUG, logMessage);
		}
	}
}
