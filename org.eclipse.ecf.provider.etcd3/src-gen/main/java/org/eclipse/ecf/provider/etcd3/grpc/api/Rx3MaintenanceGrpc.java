package org.eclipse.ecf.provider.etcd3.grpc.api;

import static org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by RxGrpc generator",
comments = "Source: rpc.proto")
public final class Rx3MaintenanceGrpc {
    private Rx3MaintenanceGrpc() {}

    public static RxMaintenanceStub newRxStub(io.grpc.Channel channel) {
        return new RxMaintenanceStub(channel);
    }

    public static final class RxMaintenanceStub extends io.grpc.stub.AbstractStub<RxMaintenanceStub> {
        private MaintenanceGrpc.MaintenanceStub delegateStub;

        private RxMaintenanceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MaintenanceGrpc.newStub(channel);
        }

        private RxMaintenanceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MaintenanceGrpc.newStub(channel).build(channel, callOptions);
        }

        @java.lang.Override
        protected RxMaintenanceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new RxMaintenanceStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> alarm(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> observer) {
                        delegateStub.alarm(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> status(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> observer) {
                        delegateStub.status(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> defragment(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> observer) {
                        delegateStub.defragment(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> hash(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> observer) {
                        delegateStub.hash(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> hashKV(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> observer) {
                        delegateStub.hashKV(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> snapshot(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToMany(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> observer) {
                        delegateStub.snapshot(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  MoveLeader requests current leader node to transfer its leadership to transferee.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> moveLeader(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest> rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(rxRequest,
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> observer) {
                        delegateStub.moveLeader(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> alarm(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> observer) {
                        delegateStub.alarm(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> status(org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> observer) {
                        delegateStub.status(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> defragment(org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> observer) {
                        delegateStub.defragment(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> hash(org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> observer) {
                        delegateStub.hash(request, observer);
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> hashKV(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> observer) {
                        delegateStub.hashKV(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> snapshot(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToMany(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> observer) {
                        delegateStub.snapshot(request, observer);
                    }
                }, getCallOptions());
        }

        /**
         * <pre>
         *  MoveLeader requests current leader node to transfer its leadership to transferee.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> moveLeader(org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest rxRequest) {
            return com.salesforce.rx3grpc.stub.ClientCalls.oneToOne(io.reactivex.rxjava3.core.Single.just(rxRequest),
                new com.salesforce.reactivegrpc.common.BiConsumer<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>>() {
                    @java.lang.Override
                    public void accept(org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest request, io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> observer) {
                        delegateStub.moveLeader(request, observer);
                    }
                }, getCallOptions());
        }

    }

    public static abstract class MaintenanceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         *  Range gets the keys in the range from the key-value store.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> alarm(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Put puts the given key into the key-value store.
         *  A put request increments the revision of the key-value store
         *  and generates one event in the event history.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> status(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  DeleteRange deletes the given range from the key-value store.
         *  A delete request increments the revision of the key-value store
         *  and generates a delete event in the event history for every deleted key.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> defragment(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest> request) {
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
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> hash(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Compact compacts the event history in the etcd key-value store. The key-value
         *  store should be periodically compacted or the event history will continue to grow
         *  indefinitely.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> hashKV(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> snapshot(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  MoveLeader requests current leader node to transfer its leadership to transferee.
         * </pre>
         */
        public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> moveLeader(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getAlarmMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>(
                                            this, METHODID_ALARM)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getStatusMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>(
                                            this, METHODID_STATUS)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getDefragmentMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>(
                                            this, METHODID_DEFRAGMENT)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getHashMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>(
                                            this, METHODID_HASH)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getHashKVMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>(
                                            this, METHODID_HASH_KV)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getSnapshotMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>(
                                            this, METHODID_SNAPSHOT)))
                    .addMethod(
                            org.eclipse.ecf.provider.etcd3.grpc.api.MaintenanceGrpc.getMoveLeaderMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest,
                                            org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>(
                                            this, METHODID_MOVE_LEADER)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_ALARM = 0;
    public static final int METHODID_STATUS = 1;
    public static final int METHODID_DEFRAGMENT = 2;
    public static final int METHODID_HASH = 3;
    public static final int METHODID_HASH_KV = 4;
    public static final int METHODID_SNAPSHOT = 5;
    public static final int METHODID_MOVE_LEADER = 6;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final MaintenanceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(MaintenanceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_ALARM:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest> single) {
                                    return serviceImpl.alarm(single);
                                }
                            });
                    break;
                case METHODID_STATUS:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest> single) {
                                    return serviceImpl.status(single);
                                }
                            });
                    break;
                case METHODID_DEFRAGMENT:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest> single) {
                                    return serviceImpl.defragment(single);
                                }
                            });
                    break;
                case METHODID_HASH:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest> single) {
                                    return serviceImpl.hash(single);
                                }
                            });
                    break;
                case METHODID_HASH_KV:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest> single) {
                                    return serviceImpl.hashKV(single);
                                }
                            });
                    break;
                case METHODID_SNAPSHOT:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToMany((org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest>, io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest> single) {
                                    return serviceImpl.snapshot(single);
                                }
                            });
                    break;
                case METHODID_MOVE_LEADER:
                    com.salesforce.rx3grpc.stub.ServerCalls.oneToOne((org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest) request,
                            (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>) responseObserver,
                            new com.salesforce.reactivegrpc.common.Function<io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest>, io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>>() {
                                @java.lang.Override
                                public io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> apply(io.reactivex.rxjava3.core.Single<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest> single) {
                                    return serviceImpl.moveLeader(single);
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
