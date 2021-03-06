// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface MemberAddRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.MemberAddRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * peerURLs is the list of URLs the added member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 1;</code>
   * @return A list containing the peerURLs.
   */
  java.util.List<java.lang.String>
      getPeerURLsList();
  /**
   * <pre>
   * peerURLs is the list of URLs the added member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 1;</code>
   * @return The count of peerURLs.
   */
  int getPeerURLsCount();
  /**
   * <pre>
   * peerURLs is the list of URLs the added member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 1;</code>
   * @param index The index of the element to return.
   * @return The peerURLs at the given index.
   */
  java.lang.String getPeerURLs(int index);
  /**
   * <pre>
   * peerURLs is the list of URLs the added member will use to communicate with the cluster.
   * </pre>
   *
   * <code>repeated string peerURLs = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the peerURLs at the given index.
   */
  com.google.protobuf.ByteString
      getPeerURLsBytes(int index);
}
