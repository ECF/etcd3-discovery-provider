// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.eclipse.ecf.provider.etcd3.grpc.api.auth;

public interface PermissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:authpb.Permission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.authpb.Permission.Type permType = 1;</code>
   * @return The enum numeric value on the wire for permType.
   */
  int getPermTypeValue();
  /**
   * <code>.authpb.Permission.Type permType = 1;</code>
   * @return The permType.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.auth.Permission.Type getPermType();

  /**
   * <code>bytes key = 2;</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes range_end = 3;</code>
   * @return The rangeEnd.
   */
  com.google.protobuf.ByteString getRangeEnd();
}
