// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface MemberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.Member)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID is the member ID for this member.
   * </pre>
   *
   * <code>uint64 ID = 1;</code>
   * @return The iD.
   */
  long getID();

  /**
   * <pre>
   * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is the human-readable name of the member. If the member is not started, the name will be an empty string.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   * @return A list containing the peerURLs.
   */
  java.util.List<java.lang.String>
      getPeerURLsList();
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   * @return The count of peerURLs.
   */
  int getPeerURLsCount();
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   * @param index The index of the element to return.
   * @return The peerURLs at the given index.
   */
  java.lang.String getPeerURLs(int index);
  /**
   * <pre>
   * peerURLs is the list of URLs the member exposes to the cluster for communication.
   * </pre>
   *
   * <code>repeated string peerURLs = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the peerURLs at the given index.
   */
  com.google.protobuf.ByteString
      getPeerURLsBytes(int index);

  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   * @return A list containing the clientURLs.
   */
  java.util.List<java.lang.String>
      getClientURLsList();
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   * @return The count of clientURLs.
   */
  int getClientURLsCount();
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   * @param index The index of the element to return.
   * @return The clientURLs at the given index.
   */
  java.lang.String getClientURLs(int index);
  /**
   * <pre>
   * clientURLs is the list of URLs the member exposes to clients for communication. If the member is not started, clientURLs will be empty.
   * </pre>
   *
   * <code>repeated string clientURLs = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the clientURLs at the given index.
   */
  com.google.protobuf.ByteString
      getClientURLsBytes(int index);
}
