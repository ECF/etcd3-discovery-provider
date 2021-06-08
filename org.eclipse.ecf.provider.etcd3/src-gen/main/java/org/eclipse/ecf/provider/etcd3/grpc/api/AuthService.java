package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Flowable;
import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface AuthService {

    
    /**
     * <pre>
     *  Range gets the keys in the range from the key-value store.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> authEnable(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Put puts the given key into the key-value store.
     *  A put request increments the revision of the key-value store
     *  and generates one event in the event history.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> authDisable(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  DeleteRange deletes the given range from the key-value store.
     *  A delete request increments the revision of the key-value store
     *  and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> authenticate(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest> requests)  {
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
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> userAdd(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Compact compacts the event history in the etcd key-value store. The key-value
     *  store should be periodically compacted or the event history will continue to grow
     *  indefinitely.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> userGet(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> userList(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> userDelete(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserChangePassword changes the password of a specified user.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> userChangePassword(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserGrant grants a role to a specified user.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> userGrantRole(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> userRevokeRole(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  RoleAdd adds a new role.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> roleAdd(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  RoleGet gets detailed role information.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> roleGet(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  RoleList gets lists of all roles.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> roleList(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  RoleDelete deletes a specified role.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> roleDelete(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> roleGrantPermission(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> roleRevokePermission(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest> requests)  {
        return null;
    }
}
