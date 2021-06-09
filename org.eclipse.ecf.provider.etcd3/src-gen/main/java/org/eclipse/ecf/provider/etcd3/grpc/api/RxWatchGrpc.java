package org.eclipse.ecf.provider.etcd3.grpc.api;

import static org.eclipse.ecf.provider.etcd3.grpc.api.WatchGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: rpc.proto")
public final class RxWatchGrpc {
    private RxWatchGrpc() {}

    public static RxWatchStub newRxStub(io.grpc.Channel channel) {
        return new RxWatchStub(channel);
    }

    public static final class RxWatchStub extends io.grpc.stub.AbstractStub<RxWatchStub> {
        private WatchGrpc.WatchStub delegateStub;

        private RxWatchStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = WatchGrpc.newStub(channel);
        }

        private RxWatchStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = WatchGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxWatchStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxWatchStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse> watch(io.reactivex.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest> rxRequest) {
            return com.salesforce.rxgrpc.stub.ClientCalls.manyToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.Function<io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse>, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest>>() {
                    @java.lang.Override
                    public io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest> apply(io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse> observer) {
                        return delegateStub.watch(observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class WatchImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse> watch(io.reactivex.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.WatchGrpc.getWatchMethod(),
                            asyncBidiStreamingCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse>(
                                            this, METHODID_WATCH)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_WATCH = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final WatchImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(WatchImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_WATCH:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.rxgrpc.stub.ServerCalls.manyToMany(
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse>) responseObserver,
                            serviceImpl::watch, serviceImpl.getCallOptions(methodId));
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
