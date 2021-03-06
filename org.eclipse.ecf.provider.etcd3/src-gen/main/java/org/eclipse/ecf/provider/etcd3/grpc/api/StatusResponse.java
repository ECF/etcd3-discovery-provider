// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.StatusResponse}
 */
public final class StatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.StatusResponse)
    StatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatusResponse.newBuilder() to construct.
  private StatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatusResponse() {
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatusResponse(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 24: {

            dbSize_ = input.readInt64();
            break;
          }
          case 32: {

            leader_ = input.readUInt64();
            break;
          }
          case 40: {

            raftIndex_ = input.readUInt64();
            break;
          }
          case 48: {

            raftTerm_ = input.readUInt64();
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
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_StatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_StatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader header_;
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader getHeader() {
    return header_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * version is the cluster protocol version used by the responding member.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * version is the cluster protocol version used by the responding member.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DBSIZE_FIELD_NUMBER = 3;
  private long dbSize_;
  /**
   * <pre>
   * dbSize is the size of the backend database, in bytes, of the responding member.
   * </pre>
   *
   * <code>int64 dbSize = 3;</code>
   * @return The dbSize.
   */
  @java.lang.Override
  public long getDbSize() {
    return dbSize_;
  }

  public static final int LEADER_FIELD_NUMBER = 4;
  private long leader_;
  /**
   * <pre>
   * leader is the member ID which the responding member believes is the current leader.
   * </pre>
   *
   * <code>uint64 leader = 4;</code>
   * @return The leader.
   */
  @java.lang.Override
  public long getLeader() {
    return leader_;
  }

  public static final int RAFTINDEX_FIELD_NUMBER = 5;
  private long raftIndex_;
  /**
   * <pre>
   * raftIndex is the current raft index of the responding member.
   * </pre>
   *
   * <code>uint64 raftIndex = 5;</code>
   * @return The raftIndex.
   */
  @java.lang.Override
  public long getRaftIndex() {
    return raftIndex_;
  }

  public static final int RAFTTERM_FIELD_NUMBER = 6;
  private long raftTerm_;
  /**
   * <pre>
   * raftTerm is the current raft term of the responding member.
   * </pre>
   *
   * <code>uint64 raftTerm = 6;</code>
   * @return The raftTerm.
   */
  @java.lang.Override
  public long getRaftTerm() {
    return raftTerm_;
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
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (dbSize_ != 0L) {
      output.writeInt64(3, dbSize_);
    }
    if (leader_ != 0L) {
      output.writeUInt64(4, leader_);
    }
    if (raftIndex_ != 0L) {
      output.writeUInt64(5, raftIndex_);
    }
    if (raftTerm_ != 0L) {
      output.writeUInt64(6, raftTerm_);
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
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (dbSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dbSize_);
    }
    if (leader_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, leader_);
    }
    if (raftIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, raftIndex_);
    }
    if (raftTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, raftTerm_);
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
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse other = (org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (getDbSize()
        != other.getDbSize()) return false;
    if (getLeader()
        != other.getLeader()) return false;
    if (getRaftIndex()
        != other.getRaftIndex()) return false;
    if (getRaftTerm()
        != other.getRaftTerm()) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + DBSIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDbSize());
    hash = (37 * hash) + LEADER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLeader());
    hash = (37 * hash) + RAFTINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRaftIndex());
    hash = (37 * hash) + RAFTTERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRaftTerm());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.StatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.StatusResponse)
      org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_StatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_StatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.newBuilder()
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
      version_ = "";

      dbSize_ = 0L;

      leader_ = 0L;

      raftIndex_ = 0L;

      raftTerm_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_StatusResponse_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse result = new org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.version_ = version_;
      result.dbSize_ = dbSize_;
      result.leader_ = leader_;
      result.raftIndex_ = raftIndex_;
      result.raftTerm_ = raftTerm_;
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
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.getDbSize() != 0L) {
        setDbSize(other.getDbSize());
      }
      if (other.getLeader() != 0L) {
        setLeader(other.getLeader());
      }
      if (other.getRaftIndex() != 0L) {
        setRaftIndex(other.getRaftIndex());
      }
      if (other.getRaftTerm() != 0L) {
        setRaftTerm(other.getRaftTerm());
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
      org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse) e.getUnfinishedMessage();
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
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
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
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
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

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * version is the cluster protocol version used by the responding member.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * version is the cluster protocol version used by the responding member.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * version is the cluster protocol version used by the responding member.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * version is the cluster protocol version used by the responding member.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * version is the cluster protocol version used by the responding member.
     * </pre>
     *
     * <code>string version = 2;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private long dbSize_ ;
    /**
     * <pre>
     * dbSize is the size of the backend database, in bytes, of the responding member.
     * </pre>
     *
     * <code>int64 dbSize = 3;</code>
     * @return The dbSize.
     */
    @java.lang.Override
    public long getDbSize() {
      return dbSize_;
    }
    /**
     * <pre>
     * dbSize is the size of the backend database, in bytes, of the responding member.
     * </pre>
     *
     * <code>int64 dbSize = 3;</code>
     * @param value The dbSize to set.
     * @return This builder for chaining.
     */
    public Builder setDbSize(long value) {
      
      dbSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dbSize is the size of the backend database, in bytes, of the responding member.
     * </pre>
     *
     * <code>int64 dbSize = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDbSize() {
      
      dbSize_ = 0L;
      onChanged();
      return this;
    }

    private long leader_ ;
    /**
     * <pre>
     * leader is the member ID which the responding member believes is the current leader.
     * </pre>
     *
     * <code>uint64 leader = 4;</code>
     * @return The leader.
     */
    @java.lang.Override
    public long getLeader() {
      return leader_;
    }
    /**
     * <pre>
     * leader is the member ID which the responding member believes is the current leader.
     * </pre>
     *
     * <code>uint64 leader = 4;</code>
     * @param value The leader to set.
     * @return This builder for chaining.
     */
    public Builder setLeader(long value) {
      
      leader_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * leader is the member ID which the responding member believes is the current leader.
     * </pre>
     *
     * <code>uint64 leader = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeader() {
      
      leader_ = 0L;
      onChanged();
      return this;
    }

    private long raftIndex_ ;
    /**
     * <pre>
     * raftIndex is the current raft index of the responding member.
     * </pre>
     *
     * <code>uint64 raftIndex = 5;</code>
     * @return The raftIndex.
     */
    @java.lang.Override
    public long getRaftIndex() {
      return raftIndex_;
    }
    /**
     * <pre>
     * raftIndex is the current raft index of the responding member.
     * </pre>
     *
     * <code>uint64 raftIndex = 5;</code>
     * @param value The raftIndex to set.
     * @return This builder for chaining.
     */
    public Builder setRaftIndex(long value) {
      
      raftIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * raftIndex is the current raft index of the responding member.
     * </pre>
     *
     * <code>uint64 raftIndex = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRaftIndex() {
      
      raftIndex_ = 0L;
      onChanged();
      return this;
    }

    private long raftTerm_ ;
    /**
     * <pre>
     * raftTerm is the current raft term of the responding member.
     * </pre>
     *
     * <code>uint64 raftTerm = 6;</code>
     * @return The raftTerm.
     */
    @java.lang.Override
    public long getRaftTerm() {
      return raftTerm_;
    }
    /**
     * <pre>
     * raftTerm is the current raft term of the responding member.
     * </pre>
     *
     * <code>uint64 raftTerm = 6;</code>
     * @param value The raftTerm to set.
     * @return This builder for chaining.
     */
    public Builder setRaftTerm(long value) {
      
      raftTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * raftTerm is the current raft term of the responding member.
     * </pre>
     *
     * <code>uint64 raftTerm = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRaftTerm() {
      
      raftTerm_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.StatusResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.StatusResponse)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<StatusResponse>() {
    @java.lang.Override
    public StatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.StatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

