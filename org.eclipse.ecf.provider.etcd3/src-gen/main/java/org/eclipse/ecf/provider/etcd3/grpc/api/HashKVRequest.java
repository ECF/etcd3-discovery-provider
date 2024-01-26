// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.HashKVRequest}
 */
public final class HashKVRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.HashKVRequest)
    HashKVRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HashKVRequest.newBuilder() to construct.
  private HashKVRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HashKVRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HashKVRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_HashKVRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_HashKVRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.class, org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.Builder.class);
  }

  public static final int REVISION_FIELD_NUMBER = 1;
  private long revision_ = 0L;
  /**
   * <pre>
   * revision is the key-value store revision for the hash operation.
   * </pre>
   *
   * <code>int64 revision = 1;</code>
   * @return The revision.
   */
  @java.lang.Override
  public long getRevision() {
    return revision_;
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
    if (revision_ != 0L) {
      output.writeInt64(1, revision_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (revision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, revision_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest other = (org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest) obj;

    if (getRevision()
        != other.getRevision()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevision());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest prototype) {
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
   * Protobuf type {@code etcdserverpb.HashKVRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.HashKVRequest)
      org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_HashKVRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_HashKVRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.class, org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      revision_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_HashKVRequest_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest result = new org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.revision_ = revision_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest.getDefaultInstance()) return this;
      if (other.getRevision() != 0L) {
        setRevision(other.getRevision());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              revision_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long revision_ ;
    /**
     * <pre>
     * revision is the key-value store revision for the hash operation.
     * </pre>
     *
     * <code>int64 revision = 1;</code>
     * @return The revision.
     */
    @java.lang.Override
    public long getRevision() {
      return revision_;
    }
    /**
     * <pre>
     * revision is the key-value store revision for the hash operation.
     * </pre>
     *
     * <code>int64 revision = 1;</code>
     * @param value The revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevision(long value) {

      revision_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * revision is the key-value store revision for the hash operation.
     * </pre>
     *
     * <code>int64 revision = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRevision() {
      bitField0_ = (bitField0_ & ~0x00000001);
      revision_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.HashKVRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.HashKVRequest)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HashKVRequest>
      PARSER = new com.google.protobuf.AbstractParser<HashKVRequest>() {
    @java.lang.Override
    public HashKVRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HashKVRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HashKVRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.HashKVRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

