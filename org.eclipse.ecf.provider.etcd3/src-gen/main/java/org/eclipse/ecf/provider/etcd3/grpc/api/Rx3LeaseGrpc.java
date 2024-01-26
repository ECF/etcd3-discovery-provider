package org.eclipse.ecf.provider.etcd3.grpc.api;

import static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: rpc.proto")
public final class Rx3LeaseGrpc {
    private Rx3LeaseGrpc() {}

    public static RxLeaseStub newRxStub(io.grpc.Channel channel) {
        return new RxLeaseStub(channel);
    }

    public static final class RxLeaseStub extends io.grpc.stub.AbstractStub<RxLeaseStub> {
        private LeaseGrpc.LeaseStub delegateStub;

        private RxLeaseStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = LeaseGrpc.newStub(channel);
        }

        private RxLeaseStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = LeaseGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxLeaseStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxLeaseStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> observer) {
                        delegateStub.leaseGrant(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> observer) {
                        delegateStub.leaseRevoke(request, observer);
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
        public io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> leaseKeepAlive(io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.manyToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse>, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> apply(io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> observer) {
                        return delegateStub.leaseKeepAlive(observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> observer) {
                        delegateStub.leaseTimeToLive(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> observer) {
                        delegateStub.leaseGrant(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> observer) {
                        delegateStub.leaseRevoke(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> observer) {
                        delegateStub.leaseTimeToLive(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class LeaseImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request) {
            return leaseGrant(io.reactivex.rxjava3.core.Single.just(request));
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request) {
            return leaseRevoke(io.reactivex.rxjava3.core.Single.just(request));
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }


        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> leaseKeepAlive(io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> request) {
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request) {
            return leaseTimeToLive(io.reactivex.rxjava3.core.Single.just(request));
        }

        /**
         * <pre>
         *  Txn processes multiple requests in a single transaction.
         *  A txn request increments the revision of the key-value store
         *  and generates events with the same revision for every completed request.
         *  It is not allowed to modify the same key several times within one txn.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrpc.getLeaseGrantMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>(
                                            this, METHODID_LEASE_GRANT)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrpc.getLeaseRevokeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>(
                                            this, METHODID_LEASE_REVOKE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrpc.getLeaseKeepAliveMethod(),
                            asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse>(
                                            this, METHODID_LEASE_KEEP_ALIVE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrpc.getLeaseTimeToLiveMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>(
                                            this, METHODID_LEASE_TIME_TO_LIVE)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

        protected Throwable onErrorMap(Throwable throwable) {
            return com.salesforce.rx3grpc.stub.ServerCalls.prepareError(throwable);
        }

    }

    public static final int METHODID_LEASE_GRANT = 0;
    public static final int METHODID_LEASE_REVOKE = 1;
    public static final int METHODID_LEASE_KEEP_ALIVE = 2;
    public static final int METHODID_LEASE_TIME_TO_LIVE = 3;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final LeaseImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(LeaseImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_LEASE_GRANT:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> apply(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest single) {
                                    return serviceImpl.leaseGrant(single);
                                }
                            }, serviceImpl::onErrorMap);
                    break;
                case METHODID_LEASE_REVOKE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> apply(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest single) {
                                    return serviceImpl.leaseRevoke(single);
                                }
                            }, serviceImpl::onErrorMap);
                    break;
                case METHODID_LEASE_TIME_TO_LIVE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> apply(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest single) {
                                    return serviceImpl.leaseTimeToLive(single);
                                }
                            }, serviceImpl::onErrorMap);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_LEASE_KEEP_ALIVE:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.rx3grpc.stub.ServerCalls.manyToMany(
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse>) responseObserver,
                            serviceImpl::leaseKeepAlive, serviceImpl::onErrorMap, serviceImpl.getCallOptions(methodId));
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
