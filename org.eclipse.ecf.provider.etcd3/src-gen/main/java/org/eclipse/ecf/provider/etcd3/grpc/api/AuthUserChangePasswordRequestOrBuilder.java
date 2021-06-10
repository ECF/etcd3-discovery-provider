// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface AuthUserChangePasswordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthUserChangePasswordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is the name of the user whose password is being changed.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is the name of the user whose password is being changed.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * password is the new password for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * password is the new password for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}