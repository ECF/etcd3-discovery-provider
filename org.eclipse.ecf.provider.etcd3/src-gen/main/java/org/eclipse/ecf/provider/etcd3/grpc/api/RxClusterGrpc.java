package org.eclipse.ecf.provider.etcd3.grpc.api;

import static org.eclipse.ecf.provider.etcd3.grpc.api.ClusterGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: rpc.proto")
public final class RxClusterGrpc {
    private RxClusterGrpc() {}

    public static RxClusterStub newRxStub(io.grpc.Channel channel) {
        return new RxClusterStub(channel);
    }

    public static final class RxClusterStub extends io.grpc.stub.AbstractStub<RxClusterStub> {
        private ClusterGrpc.ClusterStub delegateStub;

        private RxClusterStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ClusterGrpc.newStub(channel);
        }

        private RxClusterStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ClusterGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxClusterStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxClusterStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> memberAdd(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> observer) {
                        delegateStub.memberAdd(request, observer);
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> memberRemove(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> observer) {
                        delegateStub.memberRemove(request, observer);
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> memberUpdate(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> observer) {
                        delegateStub.memberUpdate(request, observer);
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> memberList(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> observer) {
                        delegateStub.memberList(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> memberAdd(org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> observer) {
                        delegateStub.memberAdd(request, observer);
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> memberRemove(org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> observer) {
                        delegateStub.memberRemove(request, observer);
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> memberUpdate(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> observer) {
                        delegateStub.memberUpdate(request, observer);
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> memberList(org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.oneToOne(io.reactivex.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> observer) {
                        delegateStub.memberList(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class ClusterImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> memberAdd(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> memberRemove(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> memberUpdate(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest> request) {
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
        public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> memberList(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.ClusterGrpc.getMemberAddMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>(
                                            this, METHODID_MEMBER_ADD)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.ClusterGrpc.getMemberRemoveMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>(
                                            this, METHODID_MEMBER_REMOVE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.ClusterGrpc.getMemberUpdateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>(
                                            this, METHODID_MEMBER_UPDATE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.ClusterGrpc.getMemberListMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>(
                                            this, METHODID_MEMBER_LIST)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_MEMBER_ADD = 0;
    public static final int METHODID_MEMBER_REMOVE = 1;
    public static final int METHODID_MEMBER_UPDATE = 2;
    public static final int METHODID_MEMBER_LIST = 3;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final ClusterImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(ClusterImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_MEMBER_ADD:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest>, io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> apply(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest> single) {
                                    return serviceImpl.memberAdd(single);
                                }
                            });
                    break;
                case METHODID_MEMBER_REMOVE:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest>, io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> apply(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest> single) {
                                    return serviceImpl.memberRemove(single);
                                }
                            });
                    break;
                case METHODID_MEMBER_UPDATE:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest>, io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> apply(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest> single) {
                                    return serviceImpl.memberUpdate(single);
                                }
                            });
                    break;
                case METHODID_MEMBER_LIST:
                    com.salesforce.rxgrpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest>, io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>>() {
                                @java.lang.Override
                                public io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> apply(io.reactivex.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest> single) {
                                    return serviceImpl.memberList(single);
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
