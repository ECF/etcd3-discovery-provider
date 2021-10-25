/*******************************************************************************
 * Copyright (c) 2021 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.etcd3.grpc.client;

import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseService;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.Rx3LeaseGrpc;
import org.eclipse.ecf.provider.etcd3.grpc.api.Rx3LeaseGrpc.RxLeaseStub;

import io.grpc.Channel;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

public class LeaseServiceClient implements LeaseService {

	private RxLeaseStub stub;

	public LeaseServiceClient(Channel channel) {
		this.stub = Rx3LeaseGrpc.newRxStub(channel);
	}

	public Single<LeaseGrantResponse> leaseGrant(Single<LeaseGrantRequest> requests) {
		return stub.leaseGrant(requests);
	}

	public Single<LeaseRevokeResponse> leaseRevoke(Single<LeaseRevokeRequest> requests) {
		return stub.leaseRevoke(requests);
	}

	public Single<LeaseTimeToLiveResponse> leaseTimeToLive(Single<LeaseTimeToLiveRequest> requests) {
		return stub.leaseTimeToLive(requests);
	}

	public Flowable<LeaseKeepAliveResponse> leaseKeepAlive(Flowable<LeaseKeepAliveRequest> requests) {
		return stub.leaseKeepAlive(requests);
	}

}
