// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

public interface TxnResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.TxnResponse)
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
   * succeeded is set to true if the compare evaluated to true or false otherwise.
   * </pre>
   *
   * <code>bool succeeded = 2;</code>
   * @return The succeeded.
   */
  boolean getSucceeded();

  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.ResponseOp> 
      getResponsesList();
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.ResponseOp getResponses(int index);
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.ResponseOpOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  org.eclipse.ecf.provider.etcd3.grpc.api.ResponseOpOrBuilder getResponsesOrBuilder(
      int index);
}
