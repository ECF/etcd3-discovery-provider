// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface LeaseGrantRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.LeaseGrantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TTL is the advisory time-to-live in seconds.
   * </pre>
   *
   * <code>int64 TTL = 1;</code>
   * @return The tTL.
   */
  long getTTL();

  /**
   * <pre>
   * ID is the requested ID for the lease. If ID is set to 0, the lessor chooses an ID.
   * </pre>
   *
   * <code>int64 ID = 2;</code>
   * @return The iD.
   */
  long getID();
}
