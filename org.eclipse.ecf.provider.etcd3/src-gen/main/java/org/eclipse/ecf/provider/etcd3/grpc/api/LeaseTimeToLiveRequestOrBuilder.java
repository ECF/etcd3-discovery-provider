// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface LeaseTimeToLiveRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.LeaseTimeToLiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID is the lease ID for the lease.
   * </pre>
   *
   * <code>int64 ID = 1;</code>
   * @return The iD.
   */
  long getID();

  /**
   * <pre>
   * keys is true to query all the keys attached to this lease.
   * </pre>
   *
   * <code>bool keys = 2;</code>
   * @return The keys.
   */
  boolean getKeys();
}