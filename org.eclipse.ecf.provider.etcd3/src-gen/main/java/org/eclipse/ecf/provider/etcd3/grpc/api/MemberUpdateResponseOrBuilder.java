// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface MemberUpdateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.MemberUpdateResponse)
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
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member> 
      getMembersList();
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.Member getMembers(int index);
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder getMembersOrBuilder(
      int index);
}