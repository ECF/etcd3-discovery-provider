package org.eclipse.ecf.provider.etcd3.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc.proto")
public final class MaintenanceGrpc {

  private MaintenanceGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Maintenance";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> getAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Alarm",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> getAlarmMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> getAlarmMethod;
    if ((getAlarmMethod = MaintenanceGrpc.getAlarmMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getAlarmMethod = MaintenanceGrpc.getAlarmMethod) == null) {
          MaintenanceGrpc.getAlarmMethod = getAlarmMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Alarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Alarm"))
              .build();
        }
      }
    }
    return getAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest, org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> getStatusMethod;
    if ((getStatusMethod = MaintenanceGrpc.getStatusMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getStatusMethod = MaintenanceGrpc.getStatusMethod) == null) {
          MaintenanceGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest, org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> getDefragmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Defragment",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> getDefragmentMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest, org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> getDefragmentMethod;
    if ((getDefragmentMethod = MaintenanceGrpc.getDefragmentMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getDefragmentMethod = MaintenanceGrpc.getDefragmentMethod) == null) {
          MaintenanceGrpc.getDefragmentMethod = getDefragmentMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest, org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Defragment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Defragment"))
              .build();
        }
      }
    }
    return getDefragmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> getHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hash",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> getHashMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest, org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> getHashMethod;
    if ((getHashMethod = MaintenanceGrpc.getHashMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getHashMethod = MaintenanceGrpc.getHashMethod) == null) {
          MaintenanceGrpc.getHashMethod = getHashMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest, org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Hash"))
              .build();
        }
      }
    }
    return getHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> getHashKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HashKV",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> getHashKVMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest, org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> getHashKVMethod;
    if ((getHashKVMethod = MaintenanceGrpc.getHashKVMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getHashKVMethod = MaintenanceGrpc.getHashKVMethod) == null) {
          MaintenanceGrpc.getHashKVMethod = getHashKVMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest, org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HashKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("HashKV"))
              .build();
        }
      }
    }
    return getHashKVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> getSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Snapshot",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> getSnapshotMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest, org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> getSnapshotMethod;
    if ((getSnapshotMethod = MaintenanceGrpc.getSnapshotMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getSnapshotMethod = MaintenanceGrpc.getSnapshotMethod) == null) {
          MaintenanceGrpc.getSnapshotMethod = getSnapshotMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest, org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Snapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("Snapshot"))
              .build();
        }
      }
    }
    return getSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> getMoveLeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveLeader",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> getMoveLeaderMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> getMoveLeaderMethod;
    if ((getMoveLeaderMethod = MaintenanceGrpc.getMoveLeaderMethod) == null) {
      synchronized (MaintenanceGrpc.class) {
        if ((getMoveLeaderMethod = MaintenanceGrpc.getMoveLeaderMethod) == null) {
          MaintenanceGrpc.getMoveLeaderMethod = getMoveLeaderMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest, org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveLeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MaintenanceMethodDescriptorSupplier("MoveLeader"))
              .build();
        }
      }
    }
    return getMoveLeaderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MaintenanceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaintenanceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaintenanceStub>() {
        @java.lang.Override
        public MaintenanceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaintenanceStub(channel, callOptions);
        }
      };
    return MaintenanceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MaintenanceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaintenanceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaintenanceBlockingStub>() {
        @java.lang.Override
        public MaintenanceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaintenanceBlockingStub(channel, callOptions);
        }
      };
    return MaintenanceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MaintenanceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MaintenanceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MaintenanceFutureStub>() {
        @java.lang.Override
        public MaintenanceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MaintenanceFutureStub(channel, callOptions);
        }
      };
    return MaintenanceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MaintenanceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public void alarm(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public void status(org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public void defragment(org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefragmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public void hash(org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public void hashKV(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHashKVMethod(), responseObserver);
    }

    /**
     * <pre>
     * Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    public void snapshot(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnapshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public void moveLeader(org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveLeaderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlarmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>(
                  this, METHODID_ALARM)))
          .addMethod(
            getStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            getDefragmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>(
                  this, METHODID_DEFRAGMENT)))
          .addMethod(
            getHashMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>(
                  this, METHODID_HASH)))
          .addMethod(
            getHashKVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>(
                  this, METHODID_HASH_KV)))
          .addMethod(
            getSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>(
                  this, METHODID_SNAPSHOT)))
          .addMethod(
            getMoveLeaderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>(
                  this, METHODID_MOVE_LEADER)))
          .build();
    }
  }

  /**
   */
  public static final class MaintenanceStub extends io.grpc.stub.AbstractAsyncStub<MaintenanceStub> {
    private MaintenanceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaintenanceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public void alarm(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public void status(org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public void defragment(org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefragmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public void hash(org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public void hashKV(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHashKVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    public void snapshot(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public void moveLeader(org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveLeaderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MaintenanceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MaintenanceBlockingStub> {
    private MaintenanceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaintenanceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse alarm(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse status(org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse defragment(org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefragmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse hash(org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse hashKV(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHashKVMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Snapshot sends a snapshot of the entire backend from a member over a stream to a client.
     * </pre>
     */
    public java.util.Iterator<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse> snapshot(
        org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSnapshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse moveLeader(org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveLeaderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MaintenanceFutureStub extends io.grpc.stub.AbstractFutureStub<MaintenanceFutureStub> {
    private MaintenanceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MaintenanceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MaintenanceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Alarm activates, deactivates, and queries alarms regarding cluster health.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse> alarm(
        org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Status gets the status of the member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse> status(
        org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Defragment defragments a member's backend database to recover storage space.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse> defragment(
        org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefragmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hash returns the hash of the local KV state for consistency checking purpose.
     * This is designed for testing; do not use this in production when there
     * are ongoing transactions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse> hash(
        org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HashKV computes the hash of all MVCC keys up to a given revision.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse> hashKV(
        org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHashKVMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveLeader requests current leader node to transfer its leadership to transferee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse> moveLeader(
        org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveLeaderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALARM = 0;
  private static final int METHODID_STATUS = 1;
  private static final int METHODID_DEFRAGMENT = 2;
  private static final int METHODID_HASH = 3;
  private static final int METHODID_HASH_KV = 4;
  private static final int METHODID_SNAPSHOT = 5;
  private static final int METHODID_MOVE_LEADER = 6;

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
          serviceImpl.alarm((org.eclipse.ecf.provider.etcd3.grpc.api.AlarmRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((org.eclipse.ecf.provider.etcd3.grpc.api.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse>) responseObserver);
          break;
        case METHODID_DEFRAGMENT:
          serviceImpl.defragment((org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.DefragmentResponse>) responseObserver);
          break;
        case METHODID_HASH:
          serviceImpl.hash((org.eclipse.ecf.provider.etcd3.grpc.api.HashRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashResponse>) responseObserver);
          break;
        case METHODID_HASH_KV:
          serviceImpl.hashKV((org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.HashKVResponse>) responseObserver);
          break;
        case METHODID_SNAPSHOT:
          serviceImpl.snapshot((org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse>) responseObserver);
          break;
        case METHODID_MOVE_LEADER:
          serviceImpl.moveLeader((org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.MoveLeaderResponse>) responseObserver);
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

  private static abstract class MaintenanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MaintenanceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Maintenance");
    }
  }

  private static final class MaintenanceFileDescriptorSupplier
      extends MaintenanceBaseDescriptorSupplier {
    MaintenanceFileDescriptorSupplier() {}
  }

  private static final class MaintenanceMethodDescriptorSupplier
      extends MaintenanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MaintenanceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MaintenanceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MaintenanceFileDescriptorSupplier())
              .addMethod(getAlarmMethod())
              .addMethod(getStatusMethod())
              .addMethod(getDefragmentMethod())
              .addMethod(getHashMethod())
              .addMethod(getHashKVMethod())
              .addMethod(getSnapshotMethod())
              .addMethod(getMoveLeaderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
