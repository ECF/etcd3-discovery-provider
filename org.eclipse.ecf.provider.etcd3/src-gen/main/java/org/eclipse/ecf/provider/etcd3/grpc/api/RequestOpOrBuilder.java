// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface RequestOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.RequestOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   * @return Whether the requestRange field is set.
   */
  boolean hasRequestRange();
  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   * @return The requestRange.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequest getRequestRange();
  /**
   * <code>.etcdserverpb.RangeRequest request_range = 1;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.RangeRequestOrBuilder getRequestRangeOrBuilder();

  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   * @return Whether the requestPut field is set.
   */
  boolean hasRequestPut();
  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   * @return The requestPut.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.PutRequest getRequestPut();
  /**
   * <code>.etcdserverpb.PutRequest request_put = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.PutRequestOrBuilder getRequestPutOrBuilder();

  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   * @return Whether the requestDeleteRange field is set.
   */
  boolean hasRequestDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   * @return The requestDeleteRange.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequest getRequestDeleteRange();
  /**
   * <code>.etcdserverpb.DeleteRangeRequest request_delete_range = 3;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.DeleteRangeRequestOrBuilder getRequestDeleteRangeOrBuilder();

  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   * @return Whether the requestTxn field is set.
   */
  boolean hasRequestTxn();
  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   * @return The requestTxn.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequest getRequestTxn();
  /**
   * <code>.etcdserverpb.TxnRequest request_txn = 4;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.TxnRequestOrBuilder getRequestTxnOrBuilder();

  public org.eclipse.ecf.provider.etcd3.grpc.api.RequestOp.RequestCase getRequestCase();
}
