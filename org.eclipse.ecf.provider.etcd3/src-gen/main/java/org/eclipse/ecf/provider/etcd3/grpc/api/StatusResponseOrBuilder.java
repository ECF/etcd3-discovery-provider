// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface StatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.StatusResponse)
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
   * <pre>
   * version is the cluster protocol version used by the responding member.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * version is the cluster protocol version used by the responding member.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * dbSize is the size of the backend database, in bytes, of the responding member.
   * </pre>
   *
   * <code>int64 dbSize = 3;</code>
   * @return The dbSize.
   */
  long getDbSize();

  /**
   * <pre>
   * leader is the member ID which the responding member believes is the current leader.
   * </pre>
   *
   * <code>uint64 leader = 4;</code>
   * @return The leader.
   */
  long getLeader();

  /**
   * <pre>
   * raftIndex is the current raft index of the responding member.
   * </pre>
   *
   * <code>uint64 raftIndex = 5;</code>
   * @return The raftIndex.
   */
  long getRaftIndex();

  /**
   * <pre>
   * raftTerm is the current raft term of the responding member.
   * </pre>
   *
   * <code>uint64 raftTerm = 6;</code>
   * @return The raftTerm.
   */
  long getRaftTerm();
}
