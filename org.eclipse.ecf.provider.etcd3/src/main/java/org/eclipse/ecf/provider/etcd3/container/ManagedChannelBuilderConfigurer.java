/*******************************************************************************
 * Copyright (c) 2024 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.container;

import io.grpc.ManagedChannelBuilder;

public interface ManagedChannelBuilderConfigurer {

	ManagedChannelBuilder<?> createAndConfigureManagedChannelBuilder(Etcd3DiscoveryContainerConfig config);

}
