package org.eclipse.ecf.provider.etcd3.grpc.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: rpc.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "etcdserverpb.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> getAuthEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthEnable",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> getAuthEnableMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> getAuthEnableMethod;
    if ((getAuthEnableMethod = AuthGrpc.getAuthEnableMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthEnableMethod = AuthGrpc.getAuthEnableMethod) == null) {
          AuthGrpc.getAuthEnableMethod = getAuthEnableMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthEnable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("AuthEnable"))
              .build();
        }
      }
    }
    return getAuthEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> getAuthDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthDisable",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> getAuthDisableMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> getAuthDisableMethod;
    if ((getAuthDisableMethod = AuthGrpc.getAuthDisableMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthDisableMethod = AuthGrpc.getAuthDisableMethod) == null) {
          AuthGrpc.getAuthDisableMethod = getAuthDisableMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthDisable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("AuthDisable"))
              .build();
        }
      }
    }
    return getAuthDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
          AuthGrpc.getAuthenticateMethod = getAuthenticateMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Authenticate"))
              .build();
        }
      }
    }
    return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> getUserAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserAdd",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> getUserAddMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> getUserAddMethod;
    if ((getUserAddMethod = AuthGrpc.getUserAddMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserAddMethod = AuthGrpc.getUserAddMethod) == null) {
          AuthGrpc.getUserAddMethod = getUserAddMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserAdd"))
              .build();
        }
      }
    }
    return getUserAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> getUserGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGet",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> getUserGetMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> getUserGetMethod;
    if ((getUserGetMethod = AuthGrpc.getUserGetMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserGetMethod = AuthGrpc.getUserGetMethod) == null) {
          AuthGrpc.getUserGetMethod = getUserGetMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserGet"))
              .build();
        }
      }
    }
    return getUserGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> getUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserList",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> getUserListMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> getUserListMethod;
    if ((getUserListMethod = AuthGrpc.getUserListMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserListMethod = AuthGrpc.getUserListMethod) == null) {
          AuthGrpc.getUserListMethod = getUserListMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserList"))
              .build();
        }
      }
    }
    return getUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> getUserDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserDelete",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> getUserDeleteMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> getUserDeleteMethod;
    if ((getUserDeleteMethod = AuthGrpc.getUserDeleteMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserDeleteMethod = AuthGrpc.getUserDeleteMethod) == null) {
          AuthGrpc.getUserDeleteMethod = getUserDeleteMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserDelete"))
              .build();
        }
      }
    }
    return getUserDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> getUserChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserChangePassword",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> getUserChangePasswordMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> getUserChangePasswordMethod;
    if ((getUserChangePasswordMethod = AuthGrpc.getUserChangePasswordMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserChangePasswordMethod = AuthGrpc.getUserChangePasswordMethod) == null) {
          AuthGrpc.getUserChangePasswordMethod = getUserChangePasswordMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserChangePassword"))
              .build();
        }
      }
    }
    return getUserChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> getUserGrantRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGrantRole",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> getUserGrantRoleMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> getUserGrantRoleMethod;
    if ((getUserGrantRoleMethod = AuthGrpc.getUserGrantRoleMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserGrantRoleMethod = AuthGrpc.getUserGrantRoleMethod) == null) {
          AuthGrpc.getUserGrantRoleMethod = getUserGrantRoleMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGrantRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserGrantRole"))
              .build();
        }
      }
    }
    return getUserGrantRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserRevokeRole",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> getUserRevokeRoleMethod;
    if ((getUserRevokeRoleMethod = AuthGrpc.getUserRevokeRoleMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUserRevokeRoleMethod = AuthGrpc.getUserRevokeRoleMethod) == null) {
          AuthGrpc.getUserRevokeRoleMethod = getUserRevokeRoleMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserRevokeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UserRevokeRole"))
              .build();
        }
      }
    }
    return getUserRevokeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> getRoleAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleAdd",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> getRoleAddMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> getRoleAddMethod;
    if ((getRoleAddMethod = AuthGrpc.getRoleAddMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleAddMethod = AuthGrpc.getRoleAddMethod) == null) {
          AuthGrpc.getRoleAddMethod = getRoleAddMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleAdd"))
              .build();
        }
      }
    }
    return getRoleAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> getRoleGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleGet",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> getRoleGetMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> getRoleGetMethod;
    if ((getRoleGetMethod = AuthGrpc.getRoleGetMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleGetMethod = AuthGrpc.getRoleGetMethod) == null) {
          AuthGrpc.getRoleGetMethod = getRoleGetMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleGet"))
              .build();
        }
      }
    }
    return getRoleGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> getRoleListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleList",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> getRoleListMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> getRoleListMethod;
    if ((getRoleListMethod = AuthGrpc.getRoleListMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleListMethod = AuthGrpc.getRoleListMethod) == null) {
          AuthGrpc.getRoleListMethod = getRoleListMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleList"))
              .build();
        }
      }
    }
    return getRoleListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> getRoleDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleDelete",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> getRoleDeleteMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> getRoleDeleteMethod;
    if ((getRoleDeleteMethod = AuthGrpc.getRoleDeleteMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleDeleteMethod = AuthGrpc.getRoleDeleteMethod) == null) {
          AuthGrpc.getRoleDeleteMethod = getRoleDeleteMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleDelete"))
              .build();
        }
      }
    }
    return getRoleDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleGrantPermission",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> getRoleGrantPermissionMethod;
    if ((getRoleGrantPermissionMethod = AuthGrpc.getRoleGrantPermissionMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleGrantPermissionMethod = AuthGrpc.getRoleGrantPermissionMethod) == null) {
          AuthGrpc.getRoleGrantPermissionMethod = getRoleGrantPermissionMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleGrantPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleGrantPermission"))
              .build();
        }
      }
    }
    return getRoleGrantPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoleRevokePermission",
      requestType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest.class,
      responseType = org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest,
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod() {
    io.grpc.MethodDescriptor<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> getRoleRevokePermissionMethod;
    if ((getRoleRevokePermissionMethod = AuthGrpc.getRoleRevokePermissionMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRoleRevokePermissionMethod = AuthGrpc.getRoleRevokePermissionMethod) == null) {
          AuthGrpc.getRoleRevokePermissionMethod = getRoleRevokePermissionMethod =
              io.grpc.MethodDescriptor.<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest, org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoleRevokePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RoleRevokePermission"))
              .build();
        }
      }
    }
    return getRoleRevokePermissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthStub>() {
        @java.lang.Override
        public AuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthStub(channel, callOptions);
        }
      };
    return AuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub>() {
        @java.lang.Override
        public AuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthBlockingStub(channel, callOptions);
        }
      };
    return AuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub>() {
        @java.lang.Override
        public AuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthFutureStub(channel, callOptions);
        }
      };
    return AuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public void authEnable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public void authDisable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthDisableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public void authenticate(org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public void userAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public void userGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public void userList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserListMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public void userDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public void userChangePassword(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserChangePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public void userGrantRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserGrantRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public void userRevokeRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserRevokeRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public void roleAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public void roleGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public void roleList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleListMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public void roleDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public void roleGrantPermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleGrantPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public void roleRevokePermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleRevokePermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthEnableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>(
                  this, METHODID_AUTH_ENABLE)))
          .addMethod(
            getAuthDisableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>(
                  this, METHODID_AUTH_DISABLE)))
          .addMethod(
            getAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            getUserAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>(
                  this, METHODID_USER_ADD)))
          .addMethod(
            getUserGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>(
                  this, METHODID_USER_GET)))
          .addMethod(
            getUserListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>(
                  this, METHODID_USER_LIST)))
          .addMethod(
            getUserDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>(
                  this, METHODID_USER_DELETE)))
          .addMethod(
            getUserChangePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>(
                  this, METHODID_USER_CHANGE_PASSWORD)))
          .addMethod(
            getUserGrantRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>(
                  this, METHODID_USER_GRANT_ROLE)))
          .addMethod(
            getUserRevokeRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>(
                  this, METHODID_USER_REVOKE_ROLE)))
          .addMethod(
            getRoleAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>(
                  this, METHODID_ROLE_ADD)))
          .addMethod(
            getRoleGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>(
                  this, METHODID_ROLE_GET)))
          .addMethod(
            getRoleListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>(
                  this, METHODID_ROLE_LIST)))
          .addMethod(
            getRoleDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>(
                  this, METHODID_ROLE_DELETE)))
          .addMethod(
            getRoleGrantPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>(
                  this, METHODID_ROLE_GRANT_PERMISSION)))
          .addMethod(
            getRoleRevokePermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest,
                org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>(
                  this, METHODID_ROLE_REVOKE_PERMISSION)))
          .build();
    }
  }

  /**
   */
  public static final class AuthStub extends io.grpc.stub.AbstractAsyncStub<AuthStub> {
    private AuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public void authEnable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public void authDisable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public void authenticate(org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public void userAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public void userGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public void userList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public void userDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public void userChangePassword(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public void userGrantRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserGrantRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public void userRevokeRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserRevokeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public void roleAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public void roleGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public void roleList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public void roleDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public void roleGrantPermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleGrantPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public void roleRevokePermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest request,
        io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleRevokePermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthBlockingStub> {
    private AuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse authEnable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse authDisable(org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse authenticate(org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse userAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse userGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse userList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse userDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse userChangePassword(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse userGrantRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserGrantRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse userRevokeRole(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserRevokeRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse roleAdd(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse roleGet(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse roleList(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse roleDelete(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse roleGrantPermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleGrantPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse roleRevokePermission(org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRoleRevokePermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractFutureStub<AuthFutureStub> {
    private AuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AuthEnable enables authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse> authEnable(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AuthDisable disables authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse> authDisable(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthDisableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate processes an authenticate request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse> authenticate(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserAdd adds a new user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse> userAdd(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGet gets detailed user information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse> userGet(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserList gets a list of all users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse> userList(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserDelete deletes a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse> userDelete(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserChangePassword changes the password of a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse> userChangePassword(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGrant grants a role to a specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse> userGrantRole(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserGrantRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserRevokeRole revokes a role of specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse> userRevokeRole(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserRevokeRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleAdd adds a new role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse> roleAdd(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleGet gets detailed role information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse> roleGet(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleList gets lists of all roles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse> roleList(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleDelete deletes a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse> roleDelete(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleGrantPermission grants a permission of a specified key or range to a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse> roleGrantPermission(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleGrantPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RoleRevokePermission revokes a key or range permission of a specified role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse> roleRevokePermission(
        org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleRevokePermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTH_ENABLE = 0;
  private static final int METHODID_AUTH_DISABLE = 1;
  private static final int METHODID_AUTHENTICATE = 2;
  private static final int METHODID_USER_ADD = 3;
  private static final int METHODID_USER_GET = 4;
  private static final int METHODID_USER_LIST = 5;
  private static final int METHODID_USER_DELETE = 6;
  private static final int METHODID_USER_CHANGE_PASSWORD = 7;
  private static final int METHODID_USER_GRANT_ROLE = 8;
  private static final int METHODID_USER_REVOKE_ROLE = 9;
  private static final int METHODID_ROLE_ADD = 10;
  private static final int METHODID_ROLE_GET = 11;
  private static final int METHODID_ROLE_LIST = 12;
  private static final int METHODID_ROLE_DELETE = 13;
  private static final int METHODID_ROLE_GRANT_PERMISSION = 14;
  private static final int METHODID_ROLE_REVOKE_PERMISSION = 15;

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
          serviceImpl.authEnable((org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthEnableResponse>) responseObserver);
          break;
        case METHODID_AUTH_DISABLE:
          serviceImpl.authDisable((org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthDisableResponse>) responseObserver);
          break;
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_USER_ADD:
          serviceImpl.userAdd((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserAddResponse>) responseObserver);
          break;
        case METHODID_USER_GET:
          serviceImpl.userGet((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGetResponse>) responseObserver);
          break;
        case METHODID_USER_LIST:
          serviceImpl.userList((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserListResponse>) responseObserver);
          break;
        case METHODID_USER_DELETE:
          serviceImpl.userDelete((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserDeleteResponse>) responseObserver);
          break;
        case METHODID_USER_CHANGE_PASSWORD:
          serviceImpl.userChangePassword((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserChangePasswordResponse>) responseObserver);
          break;
        case METHODID_USER_GRANT_ROLE:
          serviceImpl.userGrantRole((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse>) responseObserver);
          break;
        case METHODID_USER_REVOKE_ROLE:
          serviceImpl.userRevokeRole((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserRevokeRoleResponse>) responseObserver);
          break;
        case METHODID_ROLE_ADD:
          serviceImpl.roleAdd((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleAddResponse>) responseObserver);
          break;
        case METHODID_ROLE_GET:
          serviceImpl.roleGet((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGetResponse>) responseObserver);
          break;
        case METHODID_ROLE_LIST:
          serviceImpl.roleList((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleListResponse>) responseObserver);
          break;
        case METHODID_ROLE_DELETE:
          serviceImpl.roleDelete((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleDeleteResponse>) responseObserver);
          break;
        case METHODID_ROLE_GRANT_PERMISSION:
          serviceImpl.roleGrantPermission((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleGrantPermissionResponse>) responseObserver);
          break;
        case METHODID_ROLE_REVOKE_PERMISSION:
          serviceImpl.roleRevokePermission((org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionRequest) request,
              (io.grpc.stub.StreamObserver<org.eclipse.ecf.provider.etcd3.grpc.api.AuthRoleRevokePermissionResponse>) responseObserver);
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getAuthEnableMethod())
              .addMethod(getAuthDisableMethod())
              .addMethod(getAuthenticateMethod())
              .addMethod(getUserAddMethod())
              .addMethod(getUserGetMethod())
              .addMethod(getUserListMethod())
              .addMethod(getUserDeleteMethod())
              .addMethod(getUserChangePasswordMethod())
              .addMethod(getUserGrantRoleMethod())
              .addMethod(getUserRevokeRoleMethod())
              .addMethod(getRoleAddMethod())
              .addMethod(getRoleGetMethod())
              .addMethod(getRoleListMethod())
              .addMethod(getRoleDeleteMethod())
              .addMethod(getRoleGrantPermissionMethod())
              .addMethod(getRoleRevokePermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
