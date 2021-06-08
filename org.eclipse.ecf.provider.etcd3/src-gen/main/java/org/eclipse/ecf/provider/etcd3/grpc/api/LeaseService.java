package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Flowable;
import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface LeaseService {

    
    /**
     * <pre>
     *  Range gets the keys in the range from the key-value store.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Put puts the given key into the key-value store.
     *  A put request increments the revision of the key-value store
     *  and generates one event in the event history.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest> requests)  {
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
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  DeleteRange deletes the given range from the key-value store.
     *  A delete request increments the revision of the key-value store
     *  and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    default Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> leaseKeepAlive(Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> requests)  {
        return null;
    }
}
