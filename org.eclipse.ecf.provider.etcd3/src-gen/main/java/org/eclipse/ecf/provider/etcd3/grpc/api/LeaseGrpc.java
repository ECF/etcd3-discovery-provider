package org.eclipse.ecf.provider.etcd3.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LeaseGrpc {

  private LeaseGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Lease";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> getLeaseGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseGrant",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> getLeaseGrantMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> getLeaseGrantMethod;
    if ((getLeaseGrantMethod = LeaseGrpc.getLeaseGrantMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseGrantMethod = LeaseGrpc.getLeaseGrantMethod) == null) {
          LeaseGrpc.getLeaseGrantMethod = getLeaseGrantMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseGrant"))
              .build();
        }
      }
    }
    return getLeaseGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> getLeaseRevokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseRevoke",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> getLeaseRevokeMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> getLeaseRevokeMethod;
    if ((getLeaseRevokeMethod = LeaseGrpc.getLeaseRevokeMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseRevokeMethod = LeaseGrpc.getLeaseRevokeMethod) == null) {
          LeaseGrpc.getLeaseRevokeMethod = getLeaseRevokeMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseRevoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseRevoke"))
              .build();
        }
      }
    }
    return getLeaseRevokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> getLeaseKeepAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseKeepAlive",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> getLeaseKeepAliveMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> getLeaseKeepAliveMethod;
    if ((getLeaseKeepAliveMethod = LeaseGrpc.getLeaseKeepAliveMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseKeepAliveMethod = LeaseGrpc.getLeaseKeepAliveMethod) == null) {
          LeaseGrpc.getLeaseKeepAliveMethod = getLeaseKeepAliveMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseKeepAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseKeepAlive"))
              .build();
        }
      }
    }
    return getLeaseKeepAliveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> getLeaseTimeToLiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LeaseTimeToLive",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> getLeaseTimeToLiveMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> getLeaseTimeToLiveMethod;
    if ((getLeaseTimeToLiveMethod = LeaseGrpc.getLeaseTimeToLiveMethod) == null) {
      synchronized (LeaseGrpc.class) {
        if ((getLeaseTimeToLiveMethod = LeaseGrpc.getLeaseTimeToLiveMethod) == null) {
          LeaseGrpc.getLeaseTimeToLiveMethod = getLeaseTimeToLiveMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LeaseTimeToLive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaseMethodDescriptorSupplier("LeaseTimeToLive"))
              .build();
        }
      }
    }
    return getLeaseTimeToLiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaseStub>() {
        @java.lang.Override
        public LeaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaseStub(channel, callOptions);
        }
      };
    return LeaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaseBlockingStub>() {
        @java.lang.Override
        public LeaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaseBlockingStub(channel, callOptions);
        }
      };
    return LeaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaseFutureStub>() {
        @java.lang.Override
        public LeaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaseFutureStub(channel, callOptions);
        }
      };
    return LeaseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    default void leaseGrant(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaseGrantMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    default void leaseRevoke(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaseRevokeMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaseKeepAlive keeps the lease alive by streaming keep alive requests from the client
     * to the server and streaming keep alive responses from the server to the client.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> leaseKeepAlive(
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLeaseKeepAliveMethod(), responseObserver);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    default void leaseTimeToLive(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaseTimeToLiveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Lease.
   */
  public static abstract class LeaseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LeaseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Lease.
   */
  public static final class LeaseStub
      extends io.grpc.stub.AbstractAsyncStub<LeaseStub> {
    private LeaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaseStub(channel, callOptions);
    }

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public void leaseGrant(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaseGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public void leaseRevoke(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaseRevokeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LeaseKeepAlive keeps the lease alive by streaming keep alive requests from the client
     * to the server and streaming keep alive responses from the server to the client.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest> leaseKeepAlive(
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLeaseKeepAliveMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public void leaseTimeToLive(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaseTimeToLiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Lease.
   */
  public static final class LeaseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LeaseBlockingStub> {
    private LeaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaseBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse leaseGrant(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaseGrantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse leaseRevoke(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaseRevokeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse leaseTimeToLive(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaseTimeToLiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Lease.
   */
  public static final class LeaseFutureStub
      extends io.grpc.stub.AbstractFutureStub<LeaseFutureStub> {
    private LeaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaseFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * LeaseGrant creates a lease which expires if the server does not receive a keepAlive
     * within a given time to live period. All keys attached to the lease will be expired and
     * deleted if the lease expires. Each expired key generates a delete event in the event history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse> leaseGrant(
        org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaseGrantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeaseRevoke revokes a lease. All keys attached to the lease will expire and be deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse> leaseRevoke(
        org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaseRevokeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LeaseTimeToLive retrieves lease information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse> leaseTimeToLive(
        org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaseTimeToLiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LEASE_GRANT = 0;
  private static final int METHODID_LEASE_REVOKE = 1;
  private static final int METHODID_LEASE_TIME_TO_LIVE = 2;
  private static final int METHODID_LEASE_KEEP_ALIVE = 3;

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
        case METHODID_LEASE_GRANT:
          serviceImpl.leaseGrant((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>) responseObserver);
          break;
        case METHODID_LEASE_REVOKE:
          serviceImpl.leaseRevoke((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>) responseObserver);
          break;
        case METHODID_LEASE_TIME_TO_LIVE:
          serviceImpl.leaseTimeToLive((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>) responseObserver);
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
        case METHODID_LEASE_KEEP_ALIVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.leaseKeepAlive(
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLeaseGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseGrantResponse>(
                service, METHODID_LEASE_GRANT)))
        .addMethod(
          getLeaseRevokeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseRevokeResponse>(
                service, METHODID_LEASE_REVOKE)))
        .addMethod(
          getLeaseKeepAliveMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseKeepAliveResponse>(
                service, METHODID_LEASE_KEEP_ALIVE)))
        .addMethod(
          getLeaseTimeToLiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse>(
                service, METHODID_LEASE_TIME_TO_LIVE)))
        .build();
  }

  private static abstract class LeaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lease");
    }
  }

  private static final class LeaseFileDescriptorSupplier
      extends LeaseBaseDescriptorSupplier {
    LeaseFileDescriptorSupplier() {}
  }

  private static final class LeaseMethodDescriptorSupplier
      extends LeaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaseMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaseFileDescriptorSupplier())
              .addMethod(getLeaseGrantMethod())
              .addMethod(getLeaseRevokeMethod())
              .addMethod(getLeaseKeepAliveMethod())
              .addMethod(getLeaseTimeToLiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
