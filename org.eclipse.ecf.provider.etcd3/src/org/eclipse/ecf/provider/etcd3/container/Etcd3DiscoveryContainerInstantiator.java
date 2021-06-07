/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.container;

import org.eclipse.ecf.core.ContainerCreateException;
import org.eclipse.ecf.core.ContainerTypeDescription;
import org.eclipse.ecf.core.IContainer;
import org.eclipse.ecf.core.provider.IContainerInstantiator;
import org.eclipse.ecf.discovery.IDiscoveryAdvertiser;
import org.eclipse.ecf.discovery.IDiscoveryLocator;

public class Etcd3DiscoveryContainerInstantiator implements IContainerInstantiator {

	public static final String NAME = "ecf.discovery.etcd3"; //$NON-NLS-1$

	public IContainer createInstance(ContainerTypeDescription description, Object[] parameters)
			throws ContainerCreateException {

		Etcd3DiscoveryContainerConfig config = null;
		if (parameters != null && parameters.length > 0 && parameters[0] instanceof Etcd3DiscoveryContainerConfig) {
			config = (Etcd3DiscoveryContainerConfig) parameters[0];
		} else {
			config = Etcd3DiscoveryContainerConfig.newBuilder().build();
		}
		try {
			return new Etcd3DiscoveryContainer(config);
		} catch (Exception e) {
			ContainerCreateException cce = new ContainerCreateException("Could not create etcd3 discovery container", //$NON-NLS-1$
					e);
			cce.setStackTrace(e.getStackTrace());
			throw cce;
		}
	}

	public String[] getSupportedAdapterTypes(ContainerTypeDescription description) {
		if (description.getName().equals(NAME))
			return new String[] { IContainer.class.getName(), IDiscoveryAdvertiser.class.getName(),
					IDiscoveryLocator.class.getName() };
		return new String[0];
	}

	@SuppressWarnings("rawtypes")
	public Class[][] getSupportedParameterTypes(ContainerTypeDescription description) {
		return new Class[][] { { Etcd3DiscoveryContainerConfig.class }, { Void.class } };
	}

	public String[] getSupportedIntents(ContainerTypeDescription description) {
		return null;
	}

}
