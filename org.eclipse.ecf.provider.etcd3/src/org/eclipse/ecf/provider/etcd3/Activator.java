/*******************************************************************************
 * Copyright (c) 2014 Composent, Inc. All rights reserved. This
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
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;
import org.osgi.service.log.Logger;
import org.osgi.util.tracker.ServiceTracker;

@SuppressWarnings("rawtypes")
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

	private ContainerTypeDescription ctd = new ContainerTypeDescription(Etcd3DiscoveryContainerInstantiator.NAME,
			new Etcd3DiscoveryContainerInstantiator(), "Etcd Discovery Container", true, false); //$NON-NLS-1$

	// Logging
	private ServiceTracker logServiceTracker = null;
	private LogService logService = null;
	private Etcd3DiscoveryContainer container;
	private ServiceTracker cfTracker;

	@SuppressWarnings("unchecked")
	public void start(BundleContext ctxt) throws Exception {
		plugin = this;
		context = ctxt;

		// Register Namespace and ContainerTypeDescription first
		context.registerService(Namespace.class, new Etcd3Namespace(), null);
		context.registerService(ContainerTypeDescription.class, ctd, null);

		final Hashtable props = new Hashtable();
		props.put(IDiscoveryLocator.CONTAINER_NAME, Etcd3DiscoveryContainerInstantiator.NAME);
		props.put(Constants.SERVICE_RANKING, 500);
		final Etcd3DiscoveryContainerConfig config = new Etcd3DiscoveryContainerConfig();
		context.registerService(
				new String[] { IDiscoveryAdvertiser.class.getName(), IDiscoveryLocator.class.getName() },
				new ServiceFactory() {
					public Object getService(Bundle bundle, ServiceRegistration registration) {
						return getEtcdContainer(config);
					}

					public void ungetService(Bundle bundle, ServiceRegistration registration, Object service) {
						ungetEtcdContainer();
					}
				}, props);
	}

	synchronized void ungetEtcdContainer() {
		if (container != null) {
			container.disconnect();
			container = null;
		}
	}

	synchronized Etcd3DiscoveryContainer getEtcdContainer(Etcd3DiscoveryContainerConfig config) {
		if (container == null) {
			try {
				container = (Etcd3DiscoveryContainer) getContainerFactory().createContainer(ctd,
						(Object[]) new Object[] { config });
				container.connect(null, null);
				LogUtility.logInfo("getEtcdContainer", DebugOptions.DEBUG, this.getClass(), //$NON-NLS-1$
						"Discovery connected to Etcd server at url=" + config.getTargetID().getLocation().toString()); //$NON-NLS-1$
			} catch (Exception e) {
				LogUtility.logError("getEtcdContainer", DebugOptions.DEBUG, this.getClass(), //$NON-NLS-1$
						"Etcd discovery setup failed", e); //$NON-NLS-1$
				container = null;
			}
		}
		return container;
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
			cfTracker = new ServiceTracker(context, IContainerFactory.class, null);
			cfTracker.open();
		}
		return (IContainerFactory) cfTracker.getService();
	}

	@SuppressWarnings("unchecked")
	public LogService getLogService() {
		if (logServiceTracker == null) {
			logServiceTracker = new ServiceTracker(context, LogService.class.getName(), null);
			logServiceTracker.open();
		}
		logService = (LogService) logServiceTracker.getService();
		if (logService == null)
			logService = new SystemLogService(PLUGIN_ID);
		return logService;
	}

	public Logger getLogger() {
		return getLogService().getLogger(PLUGIN_ID);
	}

	public void log(IStatus status) {
		Logger logger = getLogger();
		if (logger != null) {
			switch (status.getCode()) {
			case IStatus.ERROR:
				logger.error(status.getMessage(), status.getException());
				break;
			case IStatus.INFO:
				logger.info(status.getMessage());
				break;
			case IStatus.WARNING:
				logger.warn(status.getMessage());
			default:
				logger.trace(status.getMessage());
			}
		}
	}
}
