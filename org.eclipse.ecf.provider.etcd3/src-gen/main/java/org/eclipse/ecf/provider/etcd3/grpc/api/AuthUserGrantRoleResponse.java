// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.eclipse.ecf.provider.etcd3.grpc.api;

/**
 * Protobuf type {@code etcdserverpb.AuthUserGrantRoleResponse}
 */
public final class AuthUserGrantRoleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AuthUserGrantRoleResponse)
    AuthUserGrantRoleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthUserGrantRoleResponse.newBuilder() to construct.
  private AuthUserGrantRoleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthUserGrantRoleResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthUserGrantRoleResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthUserGrantRoleResponse(
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
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AuthUserGrantRoleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AuthUserGrantRoleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.Builder.class);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse other = (org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.AuthUserGrantRoleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AuthUserGrantRoleResponse)
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AuthUserGrantRoleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AuthUserGrantRoleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.class, org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.ECFEtcdProto.internal_static_etcdserverpb_AuthUserGrantRoleResponse_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse result = new org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
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
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
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
      org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AuthUserGrantRoleResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AuthUserGrantRoleResponse)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthUserGrantRoleResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuthUserGrantRoleResponse>() {
    @java.lang.Override
    public AuthUserGrantRoleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthUserGrantRoleResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthUserGrantRoleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthUserGrantRoleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.AuthUserGrantRoleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

