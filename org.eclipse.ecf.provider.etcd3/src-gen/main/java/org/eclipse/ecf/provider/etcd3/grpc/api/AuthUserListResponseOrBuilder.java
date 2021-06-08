// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface AuthUserListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthUserListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   * @return The header.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated string users = 2;</code>
   * @return A list containing the users.
   */
  java.util.List<java.lang.String>
      getUsersList();
  /**
   * <code>repeated string users = 2;</code>
   * @return The count of users.
   */
  int getUsersCount();
  /**
   * <code>repeated string users = 2;</code>
   * @param index The index of the element to return.
   * @return The users at the given index.
   */
  java.lang.String getUsers(int index);
  /**
   * <code>repeated string users = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the users at the given index.
   */
  com.google.protobuf.ByteString
      getUsersBytes(int index);
}
