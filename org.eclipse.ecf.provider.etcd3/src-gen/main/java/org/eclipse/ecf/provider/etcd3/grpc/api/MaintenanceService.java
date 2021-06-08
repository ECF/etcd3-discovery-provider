package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Flowable;
import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface MaintenanceService {

    
    /**
     * <pre>
     *  Range gets the keys in the range from the key-value store.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> alarm(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Put puts the given key into the key-value store.
     *  A put request increments the revision of the key-value store
     *  and generates one event in the event history.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> status(Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  DeleteRange deletes the given range from the key-value store.
     *  A delete request increments the revision of the key-value store
     *  and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> defragment(Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Txn processes multiple requests in a single transaction.
     *  A txn request increments the revision of the key-value store
     *  and generates events with the same revision for every completed request.
     *  It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> hash(Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Compact compacts the event history in the etcd key-value store. The key-value
     *  store should be periodically compacted or the event history will continue to grow
     *  indefinitely.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> hashKV(Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> moveLeader(Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    default Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> snapshot(Single<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest> requests)  {
        return null;
    }
}
