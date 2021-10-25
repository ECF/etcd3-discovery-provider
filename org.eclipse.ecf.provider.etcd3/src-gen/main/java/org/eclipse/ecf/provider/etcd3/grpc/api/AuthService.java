package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.rxjava3.core.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface AuthService {

    
    /**
     * <pre>
     *  AuthEnable enables authentication.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> authEnable(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  AuthDisable disables authentication.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> authDisable(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  Authenticate processes an authenticate request.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> authenticate(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserAdd adds a new user.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> userAdd(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserGet gets detailed user information.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> userGet(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserList gets a list of all users.
     * </pre>
     */
    default Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> userList(Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest> requests)  {
        return null;
    }
    
    /**
     * <pre>
     *  UserDelete deletes a specified user.
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
