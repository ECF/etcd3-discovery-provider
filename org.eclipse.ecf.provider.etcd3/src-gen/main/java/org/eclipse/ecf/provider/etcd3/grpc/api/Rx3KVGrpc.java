package org.eclipse.ecf.provider.etcd3.grpc.api;

import static org.eclipse.ecf.provider.etcd3.grpc.api.KVGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: rpc.proto")
public final class Rx3KVGrpc {
    private Rx3KVGrpc() {}

    public static RxKVStub newRxStub(io.grpc.Channel channel) {
        return new RxKVStub(channel);
    }

    public static final class RxKVStub extends io.grpc.stub.AbstractStub<RxKVStub> {
        private KVGrpc.KVStub delegateStub;

        private RxKVStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = KVGrpc.newStub(channel);
        }

        private RxKVStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = KVGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxKVStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxKVStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> range(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> observer) {
                        delegateStub.range(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> put(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> observer) {
                        delegateStub.put(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> deleteRange(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> observer) {
                        delegateStub.deleteRange(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> txn(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> observer) {
                        delegateStub.txn(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> compact(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> observer) {
                        delegateStub.compact(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> range(org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> observer) {
                        delegateStub.range(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> put(org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> observer) {
                        delegateStub.put(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> deleteRange(org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> observer) {
                        delegateStub.deleteRange(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> txn(org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> observer) {
                        delegateStub.txn(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> compact(org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> observer) {
                        delegateStub.compact(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class KVImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> range(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> put(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> deleteRange(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest> request) {
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> txn(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Compact compacts the event history in the etcd key-value store. The key-value
         *  store should be periodically compacted or the event history will continue to grow
         *  indefinitely.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> compact(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.KVGrpc.getRangeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>(
                                            this, METHODID_RANGE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.KVGrpc.getPutMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>(
                                            this, METHODID_PUT)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.KVGrpc.getDeleteRangeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>(
                                            this, METHODID_DELETE_RANGE)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.KVGrpc.getTxnMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>(
                                            this, METHODID_TXN)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.KVGrpc.getCompactMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>(
                                            this, METHODID_COMPACT)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_RANGE = 0;
    public static final int METHODID_PUT = 1;
    public static final int METHODID_DELETE_RANGE = 2;
    public static final int METHODID_TXN = 3;
    public static final int METHODID_COMPACT = 4;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final KVImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(KVImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_RANGE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest> single) {
                                    return serviceImpl.range(single);
                                }
                            });
                    break;
                case METHODID_PUT:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest> single) {
                                    return serviceImpl.put(single);
                                }
                            });
                    break;
                case METHODID_DELETE_RANGE:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest> single) {
                                    return serviceImpl.deleteRange(single);
                                }
                            });
                    break;
                case METHODID_TXN:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest> single) {
                                    return serviceImpl.txn(single);
                                }
                            });
                    break;
                case METHODID_COMPACT:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest> single) {
                                    return serviceImpl.compact(single);
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
