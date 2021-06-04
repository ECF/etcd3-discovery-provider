package org.eclipse.ecf.provider.etcd3.grpc.client;

import org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.KVService;
import org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse;
import org.eclipse.ecf.provider.etcd3.grpc.api.RxKVGrpc;
import org.eclipse.ecf.provider.etcd3.grpc.api.RxKVGrpc.RxKVStub;
import org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest;
import org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse;

import io.grpc.Channel;
import io.reactivex.Single;

public class KVServiceClient implements KVService {

	private RxKVStub stub;
	
	public KVServiceClient(Channel channel) {
		this.stub = RxKVGrpc.newRxStub(channel);
	}
	
	public Single<RangeResponse> range(Single<RangeRequest> rxRequest) {
		return stub.range(rxRequest);
	}

	public Single<PutResponse> put(Single<PutRequest> rxRequest) {
		return stub.put(rxRequest);
	}

	public Single<DeleteRangeResponse> deleteRange(Single<DeleteRangeRequest> rxRequest) {
		return stub.deleteRange(rxRequest);
	}

	public Single<TxnResponse> txn(Single<TxnRequest> rxRequest) {
		return stub.txn(rxRequest);
	}

	public Single<CompactionResponse> compact(Single<CompactionRequest> rxRequest) {
		return stub.compact(rxRequest);
	}

	public Single<RangeResponse> range(RangeRequest rxRequest) {
		return stub.range(rxRequest);
	}

	public Single<PutResponse> put(PutRequest rxRequest) {
		return stub.put(rxRequest);
	}

	public Single<DeleteRangeResponse> deleteRange(DeleteRangeRequest rxRequest) {
		return stub.deleteRange(rxRequest);
	}

	public Single<TxnResponse> txn(TxnRequest rxRequest) {
		return stub.txn(rxRequest);
	}

	public Single<CompactionResponse> compact(CompactionRequest rxRequest) {
		return stub.compact(rxRequest);
	}

	
}
