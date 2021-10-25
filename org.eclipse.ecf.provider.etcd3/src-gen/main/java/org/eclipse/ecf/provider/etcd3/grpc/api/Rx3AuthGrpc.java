package org.eclipse.ecf.provider.etcd3.grpc.api;

import static org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: rpc.proto")
public final class Rx3AuthGrpc {
    private Rx3AuthGrpc() {}

    public static RxAuthStub newRxStub(io.grpc.Channel channel) {
        return new RxAuthStub(channel);
    }

    public static final class RxAuthStub extends io.grpc.stub.AbstractStub<RxAuthStub> {
        private AuthGrpc.AuthStub delegateStub;

        private RxAuthStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = AuthGrpc.newStub(channel);
        }

        private RxAuthStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = AuthGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxAuthStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxAuthStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> authEnable(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> observer) {
                        delegateStub.authEnable(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> authDisable(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> observer) {
                        delegateStub.authDisable(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> authenticate(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> observer) {
                        delegateStub.authenticate(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Txn processes multiple requests in a single transaction.
         *  A txn request increments the revision of the key-value store
         *  and generates events with the same revision for every completed request.
         *  It is not allowed to modify the same key several times within one txn.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> userAdd(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> observer) {
                        delegateStub.userAdd(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Compact compacts the event history in the etcd key-value store. The key-value
         *  store should be periodically compacted or the event history will continue to grow
         *  indefinitely.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> userGet(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> observer) {
                        delegateStub.userGet(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> userList(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> observer) {
                        delegateStub.userList(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  MoveLeader requests current leader node to transfer its leadership to transferee.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> userDelete(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> observer) {
                        delegateStub.userDelete(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  UserChangePassword changes the password of a specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> userChangePassword(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> observer) {
                        delegateStub.userChangePassword(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  UserGrant grants a role to a specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> userGrantRole(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> observer) {
                        delegateStub.userGrantRole(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  UserRevokeRole revokes a role of specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> userRevokeRole(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> observer) {
                        delegateStub.userRevokeRole(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleAdd adds a new role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> roleAdd(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> observer) {
                        delegateStub.roleAdd(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleGet gets detailed role information.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> roleGet(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> observer) {
                        delegateStub.roleGet(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleList gets lists of all roles.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> roleList(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> observer) {
                        delegateStub.roleList(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleDelete deletes a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> roleDelete(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> observer) {
                        delegateStub.roleDelete(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleGrantPermission grants a permission of a specified key or range to a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> roleGrantPermission(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> observer) {
                        delegateStub.roleGrantPermission(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleRevokePermission revokes a key or range permission of a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> roleRevokePermission(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> observer) {
                        delegateStub.roleRevokePermission(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> authEnable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> observer) {
                        delegateStub.authEnable(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> authDisable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> observer) {
                        delegateStub.authDisable(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> authenticate(org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> observer) {
                        delegateStub.authenticate(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Txn processes multiple requests in a single transaction.
         *  A txn request increments the revision of the key-value store
         *  and generates events with the same revision for every completed request.
         *  It is not allowed to modify the same key several times within one txn.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> userAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> observer) {
                        delegateStub.userAdd(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Compact compacts the event history in the etcd key-value store. The key-value
         *  store should be periodically compacted or the event history will continue to grow
         *  indefinitely.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> userGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> observer) {
                        delegateStub.userGet(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> userList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> observer) {
                        delegateStub.userList(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  MoveLeader requests current leader node to transfer its leadership to transferee.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> userDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> observer) {
                        delegateStub.userDelete(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  UserChangePassword changes the password of a specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> userChangePassword(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> observer) {
                        delegateStub.userChangePassword(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  UserGrant grants a role to a specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> userGrantRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> observer) {
                        delegateStub.userGrantRole(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  UserRevokeRole revokes a role of specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> userRevokeRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> observer) {
                        delegateStub.userRevokeRole(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleAdd adds a new role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> roleAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> observer) {
                        delegateStub.roleAdd(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleGet gets detailed role information.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> roleGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> observer) {
                        delegateStub.roleGet(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleList gets lists of all roles.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> roleList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> observer) {
                        delegateStub.roleList(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleDelete deletes a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> roleDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> observer) {
                        delegateStub.roleDelete(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleGrantPermission grants a permission of a specified key or range to a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> roleGrantPermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> observer) {
                        delegateStub.roleGrantPermission(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  RoleRevokePermission revokes a key or range permission of a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> roleRevokePermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> observer) {
                        delegateStub.roleRevokePermission(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class AuthImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> authEnable(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> authDisable(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> authenticate(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Txn processes multiple requests in a single transaction.
         *  A txn request increments the revision of the key-value store
         *  and generates events with the same revision for every completed request.
         *  It is not allowed to modify the same key several times within one txn.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> userAdd(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Compact compacts the event history in the etcd key-value store. The key-value
         *  store should be periodically compacted or the event history will continue to grow
         *  indefinitely.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> userGet(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> userList(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  MoveLeader requests current leader node to transfer its leadership to transferee.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> userDelete(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  UserChangePassword changes the password of a specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> userChangePassword(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  UserGrant grants a role to a specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> userGrantRole(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  UserRevokeRole revokes a role of specified user.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> userRevokeRole(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  RoleAdd adds a new role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> roleAdd(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  RoleGet gets detailed role information.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> roleGet(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  RoleList gets lists of all roles.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> roleList(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  RoleDelete deletes a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> roleDelete(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  RoleGrantPermission grants a permission of a specified key or range to a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> roleGrantPermission(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  RoleRevokePermission revokes a key or range permission of a specified role.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> roleRevokePermission(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getAuthEnableMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>(
                                            this, METHODID_AUTH_ENABLE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getAuthDisableMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>(
                                            this, METHODID_AUTH_DISABLE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getAuthenticateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>(
                                            this, METHODID_AUTHENTICATE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserAddMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>(
                                            this, METHODID_USER_ADD)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserGetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>(
                                            this, METHODID_USER_GET)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserListMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>(
                                            this, METHODID_USER_LIST)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserDeleteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>(
                                            this, METHODID_USER_DELETE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserChangePasswordMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>(
                                            this, METHODID_USER_CHANGE_PASSWORD)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserGrantRoleMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>(
                                            this, METHODID_USER_GRANT_ROLE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getUserRevokeRoleMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>(
                                            this, METHODID_USER_REVOKE_ROLE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getRoleAddMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>(
                                            this, METHODID_ROLE_ADD)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getRoleGetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>(
                                            this, METHODID_ROLE_GET)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getRoleListMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>(
                                            this, METHODID_ROLE_LIST)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getRoleDeleteMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>(
                                            this, METHODID_ROLE_DELETE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getRoleGrantPermissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>(
                                            this, METHODID_ROLE_GRANT_PERMISSION)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthGrpc.getRoleRevokePermissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>(
                                            this, METHODID_ROLE_REVOKE_PERMISSION)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_AUTH_ENABLE = 0;
    public static final int METHODID_AUTH_DISABLE = 1;
    public static final int METHODID_AUTHENTICATE = 2;
    public static final int METHODID_USER_ADD = 3;
    public static final int METHODID_USER_GET = 4;
    public static final int METHODID_USER_LIST = 5;
    public static final int METHODID_USER_DELETE = 6;
    public static final int METHODID_USER_CHANGE_PASSWORD = 7;
    public static final int METHODID_USER_GRANT_ROLE = 8;
    public static final int METHODID_USER_REVOKE_ROLE = 9;
    public static final int METHODID_ROLE_ADD = 10;
    public static final int METHODID_ROLE_GET = 11;
    public static final int METHODID_ROLE_LIST = 12;
    public static final int METHODID_ROLE_DELETE = 13;
    public static final int METHODID_ROLE_GRANT_PERMISSION = 14;
    public static final int METHODID_ROLE_REVOKE_PERMISSION = 15;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final AuthImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(AuthImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_AUTH_ENABLE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest> single) {
                                    return serviceImpl.authEnable(single);
                                }
                            });
                    break;
                case METHODID_AUTH_DISABLE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest> single) {
                                    return serviceImpl.authDisable(single);
                                }
                            });
                    break;
                case METHODID_AUTHENTICATE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest> single) {
                                    return serviceImpl.authenticate(single);
                                }
                            });
                    break;
                case METHODID_USER_ADD:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest> single) {
                                    return serviceImpl.userAdd(single);
                                }
                            });
                    break;
                case METHODID_USER_GET:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest> single) {
                                    return serviceImpl.userGet(single);
                                }
                            });
                    break;
                case METHODID_USER_LIST:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest> single) {
                                    return serviceImpl.userList(single);
                                }
                            });
                    break;
                case METHODID_USER_DELETE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest> single) {
                                    return serviceImpl.userDelete(single);
                                }
                            });
                    break;
                case METHODID_USER_CHANGE_PASSWORD:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest> single) {
                                    return serviceImpl.userChangePassword(single);
                                }
                            });
                    break;
                case METHODID_USER_GRANT_ROLE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest> single) {
                                    return serviceImpl.userGrantRole(single);
                                }
                            });
                    break;
                case METHODID_USER_REVOKE_ROLE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest> single) {
                                    return serviceImpl.userRevokeRole(single);
                                }
                            });
                    break;
                case METHODID_ROLE_ADD:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest> single) {
                                    return serviceImpl.roleAdd(single);
                                }
                            });
                    break;
                case METHODID_ROLE_GET:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest> single) {
                                    return serviceImpl.roleGet(single);
                                }
                            });
                    break;
                case METHODID_ROLE_LIST:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest> single) {
                                    return serviceImpl.roleList(single);
                                }
                            });
                    break;
                case METHODID_ROLE_DELETE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest> single) {
                                    return serviceImpl.roleDelete(single);
                                }
                            });
                    break;
                case METHODID_ROLE_GRANT_PERMISSION:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest> single) {
                                    return serviceImpl.roleGrantPermission(single);
                                }
                            });
                    break;
                case METHODID_ROLE_REVOKE_PERMISSION:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest> single) {
                                    return serviceImpl.roleRevokePermission(single);
                                }
                            });
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
