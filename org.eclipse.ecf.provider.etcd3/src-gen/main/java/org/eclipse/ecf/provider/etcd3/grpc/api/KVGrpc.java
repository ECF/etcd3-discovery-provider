package org.eclipse.ecf.provider.etcd3.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KVGrpc {

  private KVGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.KV";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Range",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> getRangeMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest, org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> getRangeMethod;
    if ((getRangeMethod = KVGrpc.getRangeMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getRangeMethod = KVGrpc.getRangeMethod) == null) {
          KVGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest, org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVMethodDescriptorSupplier("Range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest, org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> getPutMethod;
    if ((getPutMethod = KVGrpc.getPutMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getPutMethod = KVGrpc.getPutMethod) == null) {
          KVGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest, org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> getDeleteRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRange",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> getDeleteRangeMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest, org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> getDeleteRangeMethod;
    if ((getDeleteRangeMethod = KVGrpc.getDeleteRangeMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getDeleteRangeMethod = KVGrpc.getDeleteRangeMethod) == null) {
          KVGrpc.getDeleteRangeMethod = getDeleteRangeMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest, org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVMethodDescriptorSupplier("DeleteRange"))
              .build();
        }
      }
    }
    return getDeleteRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> getTxnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Txn",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> getTxnMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest, org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> getTxnMethod;
    if ((getTxnMethod = KVGrpc.getTxnMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getTxnMethod = KVGrpc.getTxnMethod) == null) {
          KVGrpc.getTxnMethod = getTxnMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest, org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Txn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVMethodDescriptorSupplier("Txn"))
              .build();
        }
      }
    }
    return getTxnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> getCompactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compact",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> getCompactMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest, org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> getCompactMethod;
    if ((getCompactMethod = KVGrpc.getCompactMethod) == null) {
      synchronized (KVGrpc.class) {
        if ((getCompactMethod = KVGrpc.getCompactMethod) == null) {
          KVGrpc.getCompactMethod = getCompactMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest, org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVMethodDescriptorSupplier("Compact"))
              .build();
        }
      }
    }
    return getCompactMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStub>() {
        @java.lang.Override
        public KVStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStub(channel, callOptions);
        }
      };
    return KVStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVBlockingStub>() {
        @java.lang.Override
        public KVBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVBlockingStub(channel, callOptions);
        }
      };
    return KVBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVFutureStub>() {
        @java.lang.Override
        public KVFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVFutureStub(channel, callOptions);
        }
      };
    return KVFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    default void range(org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    default void put(org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    default void deleteRange(org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    default void txn(org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTxnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    default void compact(org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompactMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KV.
   */
  public static abstract class KVImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KVGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KV.
   */
  public static final class KVStub
      extends io.grpc.stub.AbstractAsyncStub<KVStub> {
    private KVStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public void range(org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void deleteRange(org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTxnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public void compact(org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KV.
   */
  public static final class KVBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KVBlockingStub> {
    private KVBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse range(org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse put(org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse deleteRange(org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse txn(org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTxnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse compact(org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompactMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KV.
   */
  public static final class KVFutureStub
      extends io.grpc.stub.AbstractFutureStub<KVFutureStub> {
    private KVFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse> range(
        org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse> put(
        org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse> deleteRange(
        org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse> txn(
        org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTxnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compact compacts the event history in the etcd key-value store. The key-value
     * store should be periodically compacted or the event history will continue to grow
     * indefinitely.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse> compact(
        org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompactMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RANGE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_DELETE_RANGE = 2;
  private static final int METHODID_TXN = 3;
  private static final int METHODID_COMPACT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RANGE:
          serviceImpl.range((org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>) responseObserver);
          break;
        case METHODID_DELETE_RANGE:
          serviceImpl.deleteRange((org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>) responseObserver);
          break;
        case METHODID_TXN:
          serviceImpl.txn((org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>) responseObserver);
          break;
        case METHODID_COMPACT:
          serviceImpl.compact((org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.RangeResponse>(
                service, METHODID_RANGE)))
        .addMethod(
          getPutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.PutResponse>(
                service, METHODID_PUT)))
        .addMethod(
          getDeleteRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeResponse>(
                service, METHODID_DELETE_RANGE)))
        .addMethod(
          getTxnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.TxnResponse>(
                service, METHODID_TXN)))
        .addMethod(
          getCompactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.CompactionRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.CompactionResponse>(
                service, METHODID_COMPACT)))
        .build();
  }

  private static abstract class KVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KV");
    }
  }

  private static final class KVFileDescriptorSupplier
      extends KVBaseDescriptorSupplier {
    KVFileDescriptorSupplier() {}
  }

  private static final class KVMethodDescriptorSupplier
      extends KVBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KVMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KVGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVFileDescriptorSupplier())
              .addMethod(getRangeMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteRangeMethod())
              .addMethod(getTxnMethod())
              .addMethod(getCompactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
