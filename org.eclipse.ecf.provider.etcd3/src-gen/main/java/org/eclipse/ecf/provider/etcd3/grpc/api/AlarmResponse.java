// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.AlarmResponse}
 */
public final class AlarmResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AlarmResponse)
    AlarmResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlarmResponse.newBuilder() to construct.
  private AlarmResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmResponse() {
    alarms_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlarmResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AlarmResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AlarmResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.Builder.class);
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
    return header_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.getDefaultInstance() : header_;
  }

  public static final int ALARMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember> alarms_;
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember> getAlarmsList() {
    return alarms_;
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder> 
      getAlarmsOrBuilderList() {
    return alarms_;
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  @java.lang.Override
  public int getAlarmsCount() {
    return alarms_.size();
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember getAlarms(int index) {
    return alarms_.get(index);
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder getAlarmsOrBuilder(
      int index) {
    return alarms_.get(index);
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
    for (int i = 0; i < alarms_.size(); i++) {
      output.writeMessage(2, alarms_.get(i));
    }
    getUnknownFields().writeTo(output);
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
    for (int i = 0; i < alarms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, alarms_.get(i));
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
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse other = (org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getAlarmsList()
        .equals(other.getAlarmsList())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getAlarmsCount() > 0) {
      hash = (37 * hash) + ALARMS_FIELD_NUMBER;
      hash = (53 * hash) + getAlarmsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.AlarmResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AlarmResponse)
      org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AlarmResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AlarmResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.newBuilder()
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
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      if (alarmsBuilder_ == null) {
        alarms_ = java.util.Collections.emptyList();
      } else {
        alarms_ = null;
        alarmsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AlarmResponse_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse result = new org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse result) {
      if (alarmsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          alarms_ = java.util.Collections.unmodifiableList(alarms_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.alarms_ = alarms_;
      } else {
        result.alarms_ = alarmsBuilder_.build();
      }
    }

    private void buildPartial0(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (alarmsBuilder_ == null) {
        if (!other.alarms_.isEmpty()) {
          if (alarms_.isEmpty()) {
            alarms_ = other.alarms_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAlarmsIsMutable();
            alarms_.addAll(other.alarms_);
          }
          onChanged();
        }
      } else {
        if (!other.alarms_.isEmpty()) {
          if (alarmsBuilder_.isEmpty()) {
            alarmsBuilder_.dispose();
            alarmsBuilder_ = null;
            alarms_ = other.alarms_;
            bitField0_ = (bitField0_ & ~0x00000002);
            alarmsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlarmsFieldBuilder() : null;
          } else {
            alarmsBuilder_.addAllMessages(other.alarms_);
          }
        }
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
            case 10: {
              input.readMessage(
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember m =
                  input.readMessage(
                      org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.parser(),
                      extensionRegistry);
              if (alarmsBuilder_ == null) {
                ensureAlarmsIsMutable();
                alarms_.add(m);
              } else {
                alarmsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) != 0);
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
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          header_ != null &&
          header_ != org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.ResponseHeader.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000001;
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

    private java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember> alarms_ =
      java.util.Collections.emptyList();
    private void ensureAlarmsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        alarms_ = new java.util.ArrayList<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember>(alarms_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder> alarmsBuilder_;

    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember> getAlarmsList() {
      if (alarmsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alarms_);
      } else {
        return alarmsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public int getAlarmsCount() {
      if (alarmsBuilder_ == null) {
        return alarms_.size();
      } else {
        return alarmsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember getAlarms(int index) {
      if (alarmsBuilder_ == null) {
        return alarms_.get(index);
      } else {
        return alarmsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder setAlarms(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember value) {
      if (alarmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlarmsIsMutable();
        alarms_.set(index, value);
        onChanged();
      } else {
        alarmsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder setAlarms(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder builderForValue) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.set(index, builderForValue.build());
        onChanged();
      } else {
        alarmsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember value) {
      if (alarmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlarmsIsMutable();
        alarms_.add(value);
        onChanged();
      } else {
        alarmsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember value) {
      if (alarmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlarmsIsMutable();
        alarms_.add(index, value);
        onChanged();
      } else {
        alarmsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(
        org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder builderForValue) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.add(builderForValue.build());
        onChanged();
      } else {
        alarmsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder builderForValue) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.add(index, builderForValue.build());
        onChanged();
      } else {
        alarmsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAllAlarms(
        java.lang.Iterable<? extends org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember> values) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alarms_);
        onChanged();
      } else {
        alarmsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder clearAlarms() {
      if (alarmsBuilder_ == null) {
        alarms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        alarmsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder removeAlarms(int index) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.remove(index);
        onChanged();
      } else {
        alarmsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder getAlarmsBuilder(
        int index) {
      return getAlarmsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder getAlarmsOrBuilder(
        int index) {
      if (alarmsBuilder_ == null) {
        return alarms_.get(index);  } else {
        return alarmsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder> 
         getAlarmsOrBuilderList() {
      if (alarmsBuilder_ != null) {
        return alarmsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alarms_);
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder addAlarmsBuilder() {
      return getAlarmsFieldBuilder().addBuilder(
          org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.getDefaultInstance());
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder addAlarmsBuilder(
        int index) {
      return getAlarmsFieldBuilder().addBuilder(
          index, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.getDefaultInstance());
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder> 
         getAlarmsBuilderList() {
      return getAlarmsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder> 
        getAlarmsFieldBuilder() {
      if (alarmsBuilder_ == null) {
        alarmsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMember.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.AlarmMemberOrBuilder>(
                alarms_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        alarms_ = null;
      }
      return alarmsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AlarmResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AlarmResponse)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmResponse>
      PARSER = new com.google.protobuf.AbstractParser<AlarmResponse>() {
    @java.lang.Override
    public AlarmResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlarmResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlarmResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.AlarmResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

