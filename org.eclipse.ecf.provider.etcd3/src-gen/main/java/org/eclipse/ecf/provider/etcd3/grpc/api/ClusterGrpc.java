package org.eclipse.ecf.provider.etcd3.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterGrpc {

  private ClusterGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Cluster";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> getMemberAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberAdd",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> getMemberAddMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> getMemberAddMethod;
    if ((getMemberAddMethod = ClusterGrpc.getMemberAddMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberAddMethod = ClusterGrpc.getMemberAddMethod) == null) {
          ClusterGrpc.getMemberAddMethod = getMemberAddMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemberAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberAdd"))
              .build();
        }
      }
    }
    return getMemberAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> getMemberRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberRemove",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> getMemberRemoveMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> getMemberRemoveMethod;
    if ((getMemberRemoveMethod = ClusterGrpc.getMemberRemoveMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberRemoveMethod = ClusterGrpc.getMemberRemoveMethod) == null) {
          ClusterGrpc.getMemberRemoveMethod = getMemberRemoveMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemberRemove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberRemove"))
              .build();
        }
      }
    }
    return getMemberRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> getMemberUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberUpdate",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> getMemberUpdateMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> getMemberUpdateMethod;
    if ((getMemberUpdateMethod = ClusterGrpc.getMemberUpdateMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberUpdateMethod = ClusterGrpc.getMemberUpdateMethod) == null) {
          ClusterGrpc.getMemberUpdateMethod = getMemberUpdateMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemberUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberUpdate"))
              .build();
        }
      }
    }
    return getMemberUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> getMemberListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MemberList",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> getMemberListMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> getMemberListMethod;
    if ((getMemberListMethod = ClusterGrpc.getMemberListMethod) == null) {
      synchronized (ClusterGrpc.class) {
        if ((getMemberListMethod = ClusterGrpc.getMemberListMethod) == null) {
          ClusterGrpc.getMemberListMethod = getMemberListMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MemberList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterMethodDescriptorSupplier("MemberList"))
              .build();
        }
      }
    }
    return getMemberListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterStub>() {
        @java.lang.Override
        public ClusterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterStub(channel, callOptions);
        }
      };
    return ClusterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterBlockingStub>() {
        @java.lang.Override
        public ClusterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterBlockingStub(channel, callOptions);
        }
      };
    return ClusterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterFutureStub>() {
        @java.lang.Override
        public ClusterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterFutureStub(channel, callOptions);
        }
      };
    return ClusterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    default void memberAdd(org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemberAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    default void memberRemove(org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemberRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    default void memberUpdate(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemberUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    default void memberList(org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMemberListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Cluster.
   */
  public static abstract class ClusterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClusterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Cluster.
   */
  public static final class ClusterStub
      extends io.grpc.stub.AbstractAsyncStub<ClusterStub> {
    private ClusterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterStub(channel, callOptions);
    }

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public void memberAdd(org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemberAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public void memberRemove(org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemberRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public void memberUpdate(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemberUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public void memberList(org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMemberListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Cluster.
   */
  public static final class ClusterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClusterBlockingStub> {
    private ClusterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse memberAdd(org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemberAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse memberRemove(org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemberRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse memberUpdate(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemberUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse memberList(org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMemberListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Cluster.
   */
  public static final class ClusterFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClusterFutureStub> {
    private ClusterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * MemberAdd adds a member into the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse> memberAdd(
        org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemberAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MemberRemove removes an existing member from the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse> memberRemove(
        org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemberRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MemberUpdate updates the member configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse> memberUpdate(
        org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemberUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MemberList lists all the members in the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse> memberList(
        org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMemberListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MEMBER_ADD = 0;
  private static final int METHODID_MEMBER_REMOVE = 1;
  private static final int METHODID_MEMBER_UPDATE = 2;
  private static final int METHODID_MEMBER_LIST = 3;

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
        case METHODID_MEMBER_ADD:
          serviceImpl.memberAdd((org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>) responseObserver);
          break;
        case METHODID_MEMBER_REMOVE:
          serviceImpl.memberRemove((org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>) responseObserver);
          break;
        case METHODID_MEMBER_UPDATE:
          serviceImpl.memberUpdate((org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>) responseObserver);
          break;
        case METHODID_MEMBER_LIST:
          serviceImpl.memberList((org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>) responseObserver);
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
          getMemberAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberAddResponse>(
                service, METHODID_MEMBER_ADD)))
        .addMethod(
          getMemberRemoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberRemoveResponse>(
                service, METHODID_MEMBER_REMOVE)))
        .addMethod(
          getMemberUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse>(
                service, METHODID_MEMBER_UPDATE)))
        .addMethod(
          getMemberListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberListRequest,
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberListResponse>(
                service, METHODID_MEMBER_LIST)))
        .build();
  }

  private static abstract class ClusterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cluster");
    }
  }

  private static final class ClusterFileDescriptorSupplier
      extends ClusterBaseDescriptorSupplier {
    ClusterFileDescriptorSupplier() {}
  }

  private static final class ClusterMethodDescriptorSupplier
      extends ClusterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterFileDescriptorSupplier())
              .addMethod(getMemberAddMethod())
              .addMethod(getMemberRemoveMethod())
              .addMethod(getMemberUpdateMethod())
              .addMethod(getMemberListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
