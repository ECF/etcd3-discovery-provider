// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.SnapshotResponse}
 */
public final class SnapshotResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.SnapshotResponse)
    SnapshotResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotResponse.newBuilder() to construct.
  private SnapshotResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotResponse() {
    blob_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SnapshotResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            remainingBytes_ = input.readUInt64();
            break;
          }
          case 26: {

            blob_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_SnapshotResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_SnapshotResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader header_;
  /**
   * <pre>
   * header has the current key-value store information. The first header in the snapshot
   * stream indicates the point in time of the snapshot.
   * </pre>
   *
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * header has the current key-value store information. The first header in the snapshot
   * stream indicates the point in time of the snapshot.
   * </pre>
   *
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader getHeader() {
    return header_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * header has the current key-value store information. The first header in the snapshot
   * stream indicates the point in time of the snapshot.
   * </pre>
   *
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int REMAINING_BYTES_FIELD_NUMBER = 2;
  private long remainingBytes_;
  /**
   * <pre>
   * remaining_bytes is the number of blob bytes to be sent after this message
   * </pre>
   *
   * <code>uint64 remaining_bytes = 2;</code>
   * @return The remainingBytes.
   */
  @java.lang.Override
  public long getRemainingBytes() {
    return remainingBytes_;
  }

  public static final int BLOB_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString blob_;
  /**
   * <pre>
   * blob contains the next chunk of the snapshot in the snapshot stream.
   * </pre>
   *
   * <code>bytes blob = 3;</code>
   * @return The blob.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBlob() {
    return blob_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (remainingBytes_ != 0L) {
      output.writeUInt64(2, remainingBytes_);
    }
    if (!blob_.isEmpty()) {
      output.writeBytes(3, blob_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (remainingBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, remainingBytes_);
    }
    if (!blob_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, blob_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse other = (org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (getRemainingBytes()
        != other.getRemainingBytes()) return false;
    if (!getBlob()
        .equals(other.getBlob())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + REMAINING_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRemainingBytes());
    hash = (37 * hash) + BLOB_FIELD_NUMBER;
    hash = (53 * hash) + getBlob().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcdserverpb.SnapshotResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.SnapshotResponse)
      org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_SnapshotResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_SnapshotResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      remainingBytes_ = 0L;

      blob_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_SnapshotResponse_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse result = new org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.remainingBytes_ = remainingBytes_;
      result.blob_ = blob_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getRemainingBytes() != 0L) {
        setRemainingBytes(other.getRemainingBytes());
      }
      if (other.getBlob() != com.google.protobuf.ByteString.EMPTY) {
        setBlob(other.getBlob());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     * @return The header.
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * header has the current key-value store information. The first header in the snapshot
     * stream indicates the point in time of the snapshot.
     * </pre>
     *
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private long remainingBytes_ ;
    /**
     * <pre>
     * remaining_bytes is the number of blob bytes to be sent after this message
     * </pre>
     *
     * <code>uint64 remaining_bytes = 2;</code>
     * @return The remainingBytes.
     */
    @java.lang.Override
    public long getRemainingBytes() {
      return remainingBytes_;
    }
    /**
     * <pre>
     * remaining_bytes is the number of blob bytes to be sent after this message
     * </pre>
     *
     * <code>uint64 remaining_bytes = 2;</code>
     * @param value The remainingBytes to set.
     * @return This builder for chaining.
     */
    public Builder setRemainingBytes(long value) {
      
      remainingBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * remaining_bytes is the number of blob bytes to be sent after this message
     * </pre>
     *
     * <code>uint64 remaining_bytes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemainingBytes() {
      
      remainingBytes_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString blob_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * blob contains the next chunk of the snapshot in the snapshot stream.
     * </pre>
     *
     * <code>bytes blob = 3;</code>
     * @return The blob.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBlob() {
      return blob_;
    }
    /**
     * <pre>
     * blob contains the next chunk of the snapshot in the snapshot stream.
     * </pre>
     *
     * <code>bytes blob = 3;</code>
     * @param value The blob to set.
     * @return This builder for chaining.
     */
    public Builder setBlob(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      blob_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * blob contains the next chunk of the snapshot in the snapshot stream.
     * </pre>
     *
     * <code>bytes blob = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlob() {
      
      blob_ = getDefaultInstance().getBlob();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.SnapshotResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.SnapshotResponse)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotResponse>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotResponse>() {
    @java.lang.Override
    public SnapshotResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SnapshotResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.SnapshotResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
