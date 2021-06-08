package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Single;
import io.reactivex.Flowable;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface MaintenanceService {

    
    /**
     * <pre>
     *  Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> alarm(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Status gets the status of the member.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> status(Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Defragment defragments a member&#39;s backend database to recover storage space.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> defragment(Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Hash returns the hash of the local KV state for consistency checking purpose.
     *  This is designed for testing; do not use this in production when there
     *  are ongoing transactions.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> hash(Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  HashKV computes the hash of all MVCC keys up to a given revision.
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
