// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.MemberUpdateResponse}
 */
public final class MemberUpdateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.MemberUpdateResponse)
    MemberUpdateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemberUpdateResponse.newBuilder() to construct.
  private MemberUpdateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemberUpdateResponse() {
    members_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemberUpdateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemberUpdateResponse(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              members_ = new java.util.ArrayList<org.eclipse.ecf.provider.etcd3.grpc.api.Member>();
              mutable_bitField0_ |= 0x00000001;
            }
            members_.add(
                input.readMessage(org.eclipse.ecf.provider.etcd3.grpc.api.Member.parser(), extensionRegistry));
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
        members_ = java.util.Collections.unmodifiableList(members_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_MemberUpdateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_MemberUpdateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.Builder.class);
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

  public static final int MEMBERS_FIELD_NUMBER = 2;
  private java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member> members_;
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  @java.lang.Override
  public java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member> getMembersList() {
    return members_;
  }
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder> 
      getMembersOrBuilderList() {
    return members_;
  }
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  @java.lang.Override
  public int getMembersCount() {
    return members_.size();
  }
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.Member getMembers(int index) {
    return members_.get(index);
  }
  /**
   * <pre>
   * members is a list of all members after updating the member.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder getMembersOrBuilder(
      int index) {
    return members_.get(index);
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
    for (int i = 0; i < members_.size(); i++) {
      output.writeMessage(2, members_.get(i));
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
    for (int i = 0; i < members_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, members_.get(i));
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
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse other = (org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getMembersList()
        .equals(other.getMembersList())) return false;
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
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.MemberUpdateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.MemberUpdateResponse)
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_MemberUpdateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_MemberUpdateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.newBuilder()
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
        getMembersFieldBuilder();
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
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        membersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_MemberUpdateResponse_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse result = new org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (membersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          members_ = java.util.Collections.unmodifiableList(members_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.members_ = members_;
      } else {
        result.members_ = membersBuilder_.build();
      }
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
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (membersBuilder_ == null) {
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
      } else {
        if (!other.members_.isEmpty()) {
          if (membersBuilder_.isEmpty()) {
            membersBuilder_.dispose();
            membersBuilder_ = null;
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000001);
            membersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMembersFieldBuilder() : null;
          } else {
            membersBuilder_.addAllMessages(other.members_);
          }
        }
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
      org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse) e.getUnfinishedMessage();
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

    private java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member> members_ =
      java.util.Collections.emptyList();
    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        members_ = new java.util.ArrayList<org.eclipse.ecf.provider.etcd3.grpc.api.Member>(members_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.Member, org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder> membersBuilder_;

    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member> getMembersList() {
      if (membersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(members_);
      } else {
        return membersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public int getMembersCount() {
      if (membersBuilder_ == null) {
        return members_.size();
      } else {
        return membersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.Member getMembers(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder setMembers(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
      } else {
        membersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder setMembers(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.set(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(org.eclipse.ecf.provider.etcd3.grpc.api.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
      } else {
        membersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(index, value);
        onChanged();
      } else {
        membersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        int index, org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addAllMembers(
        java.lang.Iterable<? extends org.eclipse.ecf.provider.etcd3.grpc.api.Member> values) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, members_);
        onChanged();
      } else {
        membersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder clearMembers() {
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        membersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder removeMembers(int index) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.remove(index);
        onChanged();
      } else {
        membersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder getMembersBuilder(
        int index) {
      return getMembersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder getMembersOrBuilder(
        int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);  } else {
        return membersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<? extends org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder> 
         getMembersOrBuilderList() {
      if (membersBuilder_ != null) {
        return membersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(members_);
      }
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder addMembersBuilder() {
      return getMembersFieldBuilder().addBuilder(
          org.eclipse.ecf.provider.etcd3.grpc.api.Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder addMembersBuilder(
        int index) {
      return getMembersFieldBuilder().addBuilder(
          index, org.eclipse.ecf.provider.etcd3.grpc.api.Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members is a list of all members after updating the member.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder> 
         getMembersBuilderList() {
      return getMembersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.Member, org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder> 
        getMembersFieldBuilder() {
      if (membersBuilder_ == null) {
        membersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.eclipse.ecf.provider.etcd3.grpc.api.Member, org.eclipse.ecf.provider.etcd3.grpc.api.Member.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.MemberOrBuilder>(
                members_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        members_ = null;
      }
      return membersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.MemberUpdateResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.MemberUpdateResponse)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemberUpdateResponse>
      PARSER = new com.google.protobuf.AbstractParser<MemberUpdateResponse>() {
    @java.lang.Override
    public MemberUpdateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemberUpdateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemberUpdateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemberUpdateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.MemberUpdateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

