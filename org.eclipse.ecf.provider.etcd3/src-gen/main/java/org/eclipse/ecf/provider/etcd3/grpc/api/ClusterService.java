package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface ClusterService {

    
    /**
     * <pre>
     *  MemberAdd adds a member into the cluster.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> memberAdd(Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> memberRemove(Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  MemberUpdate updates the member configuration.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> memberUpdate(Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  MemberList lists all the members in the cluster.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> memberList(Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest> requests)  {
        return null;
    }
}
