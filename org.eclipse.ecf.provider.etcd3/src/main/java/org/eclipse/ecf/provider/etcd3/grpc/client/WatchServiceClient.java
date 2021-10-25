/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.grpc.client;

import org.eclipse.ecf.provider.etcd3.grpc.api.Rx3WatchGrpc;
import org.eclipse.ecf.provider.etcd3.grpc.api.Rx3WatchGrpc.RxWatchStub;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.WatchService;

import io.grpc.Channel;
import io.reactivex.rxjava3.core.Flowable;

public class WatchServiceClient implements WatchService {

	private RxWatchStub stub;

	public WatchServiceClient(Channel channel) {
		this.stub = Rx3WatchGrpc.newRxStub(channel);
	}

	public Flowable<WatchResponse> watch(Flowable<WatchRequest> rxRequest) {
		return stub.watch(rxRequest);
	}

}
