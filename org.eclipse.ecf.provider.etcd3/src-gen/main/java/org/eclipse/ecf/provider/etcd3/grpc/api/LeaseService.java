package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Flowable;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface LeaseService {

    
    /**
     * <pre>
     *  LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     *  within a given time to live period. All keys attached to the lease will be expired and
     *  deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  LeaseKeepAlive keeps the lease alive by streaming keep alive requests from the client
     *  to the server and streaming keep alive responses from the server to the client.
     * </pre>
     */
    default Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> leaseKeepAlive(Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> requests)  {
        return null;
    }
}
