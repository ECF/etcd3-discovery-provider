// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface MemberAddResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.MemberAddResponse)
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
   * member is the member information for the added member.
   * </pre>
   *
   * <code>.etcdserverpb.Member member = 2;</code>
   * @return Whether the member field is set.
   */
  boolean hasMember();
  /**
   * <pre>
   * member is the member information for the added member.
   * </pre>
   *
   * <code>.etcdserverpb.Member member = 2;</code>
   * @return The member.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.Member getMember();
  /**
   * <pre>
   * member is the member information for the added member.
   * </pre>
   *
   * <code>.etcdserverpb.Member member = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder getMemberOrBuilder();

  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member> 
      getMembersList();
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.Member getMembers(int index);
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * members is a list of all members after adding the new member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 3;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder getMembersOrBuilder(
      int index);
}
