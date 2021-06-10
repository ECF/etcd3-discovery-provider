// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.eclipse.ecf.provider.etcd3.grpc.api.auth;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:authpb.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes name = 1;</code>
   * @return The name.
   */
  com.google.protobuf.ByteString getName();

  /**
   * <code>bytes password = 2;</code>
   * @return The password.
   */
  com.google.protobuf.ByteString getPassword();

  /**
   * <code>repeated string roles = 3;</code>
   * @return A list containing the roles.
   */
  java.util.List<java.lang.String>
      getRolesList();
  /**
   * <code>repeated string roles = 3;</code>
   * @return The count of roles.
   */
  int getRolesCount();
  /**
   * <code>repeated string roles = 3;</code>
   * @param index The index of the element to return.
   * @return The roles at the given index.
   */
  java.lang.String getRoles(int index);
  /**
   * <code>repeated string roles = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the roles at the given index.
   */
  com.google.protobuf.ByteString
      getRolesBytes(int index);
}