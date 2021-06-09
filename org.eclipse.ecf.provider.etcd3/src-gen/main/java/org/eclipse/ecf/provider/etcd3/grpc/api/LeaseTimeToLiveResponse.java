// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.LeaseTimeToLiveResponse}
 */
public final class LeaseTimeToLiveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.LeaseTimeToLiveResponse)
    LeaseTimeToLiveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeaseTimeToLiveResponse.newBuilder() to construct.
  private LeaseTimeToLiveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeaseTimeToLiveResponse() {
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeaseTimeToLiveResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LeaseTimeToLiveResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            iD_ = input.readInt64();
            break;
          }
          case 24: {

            tTL_ = input.readInt64();
            break;
          }
          case 32: {

            grantedTTL_ = input.readInt64();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            keys_.add(input.readBytes());
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.Builder.class);
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

  public static final int ID_FIELD_NUMBER = 2;
  private long iD_;
  /**
   * <pre>
   * ID is the lease ID from the keep alive request.
   * </pre>
   *
   * <code>int64 ID = 2;</code>
   * @return The iD.
   */
  @java.lang.Override
  public long getID() {
    return iD_;
  }

  public static final int TTL_FIELD_NUMBER = 3;
  private long tTL_;
  /**
   * <pre>
   * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
   * </pre>
   *
   * <code>int64 TTL = 3;</code>
   * @return The tTL.
   */
  @java.lang.Override
  public long getTTL() {
    return tTL_;
  }

  public static final int GRANTEDTTL_FIELD_NUMBER = 4;
  private long grantedTTL_;
  /**
   * <pre>
   * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
   * </pre>
   *
   * <code>int64 grantedTTL = 4;</code>
   * @return The grantedTTL.
   */
  @java.lang.Override
  public long getGrantedTTL() {
    return grantedTTL_;
  }

  public static final int KEYS_FIELD_NUMBER = 5;
  private java.util.List<com.google.protobuf.ByteString> keys_;
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   * @return A list containing the keys.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getKeysList() {
    return keys_;
  }
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   * @return The count of keys.
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  public com.google.protobuf.ByteString getKeys(int index) {
    return keys_.get(index);
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
    if (iD_ != 0L) {
      output.writeInt64(2, iD_);
    }
    if (tTL_ != 0L) {
      output.writeInt64(3, tTL_);
    }
    if (grantedTTL_ != 0L) {
      output.writeInt64(4, grantedTTL_);
    }
    for (int i = 0; i < keys_.size(); i++) {
      output.writeBytes(5, keys_.get(i));
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
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, iD_);
    }
    if (tTL_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, tTL_);
    }
    if (grantedTTL_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, grantedTTL_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keys_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(keys_.get(i));
      }
      size += dataSize;
      size += 1 * getKeysList().size();
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
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse other = (org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (getID()
        != other.getID()) return false;
    if (getTTL()
        != other.getTTL()) return false;
    if (getGrantedTTL()
        != other.getGrantedTTL()) return false;
    if (!getKeysList()
        .equals(other.getKeysList())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getID());
    hash = (37 * hash) + TTL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTTL());
    hash = (37 * hash) + GRANTEDTTL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGrantedTTL());
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.LeaseTimeToLiveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.LeaseTimeToLiveResponse)
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.newBuilder()
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
      iD_ = 0L;

      tTL_ = 0L;

      grantedTTL_ = 0L;

      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse result = new org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.iD_ = iD_;
      result.tTL_ = tTL_;
      result.grantedTTL_ = grantedTTL_;
      if (((bitField0_ & 0x00000001) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.keys_ = keys_;
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
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      if (other.getTTL() != 0L) {
        setTTL(other.getTTL());
      }
      if (other.getGrantedTTL() != 0L) {
        setGrantedTTL(other.getGrantedTTL());
      }
      if (!other.keys_.isEmpty()) {
        if (keys_.isEmpty()) {
          keys_ = other.keys_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKeysIsMutable();
          keys_.addAll(other.keys_);
        }
        onChanged();
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
      org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private long iD_ ;
    /**
     * <pre>
     * ID is the lease ID from the keep alive request.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     * @return The iD.
     */
    @java.lang.Override
    public long getID() {
      return iD_;
    }
    /**
     * <pre>
     * ID is the lease ID from the keep alive request.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     * @param value The iD to set.
     * @return This builder for chaining.
     */
    public Builder setID(long value) {
      
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID is the lease ID from the keep alive request.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearID() {
      
      iD_ = 0L;
      onChanged();
      return this;
    }

    private long tTL_ ;
    /**
     * <pre>
     * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
     * </pre>
     *
     * <code>int64 TTL = 3;</code>
     * @return The tTL.
     */
    @java.lang.Override
    public long getTTL() {
      return tTL_;
    }
    /**
     * <pre>
     * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
     * </pre>
     *
     * <code>int64 TTL = 3;</code>
     * @param value The tTL to set.
     * @return This builder for chaining.
     */
    public Builder setTTL(long value) {
      
      tTL_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
     * </pre>
     *
     * <code>int64 TTL = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTTL() {
      
      tTL_ = 0L;
      onChanged();
      return this;
    }

    private long grantedTTL_ ;
    /**
     * <pre>
     * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
     * </pre>
     *
     * <code>int64 grantedTTL = 4;</code>
     * @return The grantedTTL.
     */
    @java.lang.Override
    public long getGrantedTTL() {
      return grantedTTL_;
    }
    /**
     * <pre>
     * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
     * </pre>
     *
     * <code>int64 grantedTTL = 4;</code>
     * @param value The grantedTTL to set.
     * @return This builder for chaining.
     */
    public Builder setGrantedTTL(long value) {
      
      grantedTTL_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
     * </pre>
     *
     * <code>int64 grantedTTL = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrantedTTL() {
      
      grantedTTL_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> keys_ = java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>(keys_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @return A list containing the keys.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getKeysList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(keys_) : keys_;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @return The count of keys.
     */
    public int getKeysCount() {
      return keys_.size();
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @param index The index of the element to return.
     * @return The keys at the given index.
     */
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @param index The index to set the value at.
     * @param value The keys to set.
     * @return This builder for chaining.
     */
    public Builder setKeys(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeysIsMutable();
      keys_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @param value The keys to add.
     * @return This builder for chaining.
     */
    public Builder addKeys(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @param values The keys to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keys_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeys() {
      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.LeaseTimeToLiveResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.LeaseTimeToLiveResponse)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeaseTimeToLiveResponse>
      PARSER = new com.google.protobuf.AbstractParser<LeaseTimeToLiveResponse>() {
    @java.lang.Override
    public LeaseTimeToLiveResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LeaseTimeToLiveResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeaseTimeToLiveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeaseTimeToLiveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.LeaseTimeToLiveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

