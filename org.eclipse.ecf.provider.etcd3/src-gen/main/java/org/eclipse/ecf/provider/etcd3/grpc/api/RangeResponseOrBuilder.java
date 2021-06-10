// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface RangeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.RangeResponse)
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
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue> 
      getKvsList();
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue getKvs(int index);
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  int getKvsCount();
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder> 
      getKvsOrBuilderList();
  /**
   * <pre>
   * kvs is the list of key-value pairs matched by the range request.
   * kvs is empty when count is requested.
   * </pre>
   *
   * <code>repeated .mvccpb.KeyValue kvs = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder getKvsOrBuilder(
      int index);

  /**
   * <pre>
   * more indicates if there are more keys to return in the requested range.
   * </pre>
   *
   * <code>bool more = 3;</code>
   * @return The more.
   */
  boolean getMore();

  /**
   * <pre>
   * count is set to the number of keys within the range when requested.
   * </pre>
   *
   * <code>int64 count = 4;</code>
   * @return The count.
   */
  long getCount();
}