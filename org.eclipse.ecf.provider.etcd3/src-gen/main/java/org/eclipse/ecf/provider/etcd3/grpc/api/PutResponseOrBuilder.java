// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface PutResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.PutResponse)
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
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   * @return Whether the prevKv field is set.
   */
  boolean hasPrevKv();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   * @return The prevKv.
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue getPrevKv();
  /**
   * <pre>
   * if prev_kv is set in the request, the previous key-value pair will be returned.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 2;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder getPrevKvOrBuilder();
}