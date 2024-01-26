// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.eclipse.ecf.provider.etcd3.grpc.api.auth;

/**
 * <pre>
 * User is a single entry in the bucket authUsers
 * </pre>
 *
 * Protobuf type {@code authpb.User}
 */
public final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:authpb.User)
    UserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    name_ = com.google.protobuf.ByteString.EMPTY;
    password_ = com.google.protobuf.ByteString.EMPTY;
    roles_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new User();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.auth.Auth.internal_static_authpb_User_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.auth.Auth.internal_static_authpb_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.class, org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString name_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getName() {
    return name_;
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString password_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes password = 2;</code>
   * @return The password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPassword() {
    return password_;
  }

  public static final int ROLES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList roles_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string roles = 3;</code>
   * @return A list containing the roles.
   */
  public com.google.protobuf.ProtocolStringList
      getRolesList() {
    return roles_;
  }
  /**
   * <code>repeated string roles = 3;</code>
   * @return The count of roles.
   */
  public int getRolesCount() {
    return roles_.size();
  }
  /**
   * <code>repeated string roles = 3;</code>
   * @param index The index of the element to return.
   * @return The roles at the given index.
   */
  public java.lang.String getRoles(int index) {
    return roles_.get(index);
  }
  /**
   * <code>repeated string roles = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the roles at the given index.
   */
  public com.google.protobuf.ByteString
      getRolesBytes(int index) {
    return roles_.getByteString(index);
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
    if (!name_.isEmpty()) {
      output.writeBytes(1, name_);
    }
    if (!password_.isEmpty()) {
      output.writeBytes(2, password_);
    }
    for (int i = 0; i < roles_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, roles_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, name_);
    }
    if (!password_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, password_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < roles_.size(); i++) {
        dataSize += computeStringSizeNoTag(roles_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRolesList().size();
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
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.auth.User)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.auth.User other = (org.eclipse.ecf.provider.etcd3.grpc.api.auth.User) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getRolesList()
        .equals(other.getRolesList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    if (getRolesCount() > 0) {
      hash = (37 * hash) + ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getRolesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.auth.User prototype) {
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
   * <pre>
   * User is a single entry in the bucket authUsers
   * </pre>
   *
   * Protobuf type {@code authpb.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:authpb.User)
      org.eclipse.ecf.provider.etcd3.grpc.api.auth.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.auth.Auth.internal_static_authpb_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.auth.Auth.internal_static_authpb_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.class, org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.newBuilder()
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
      name_ = com.google.protobuf.ByteString.EMPTY;
      password_ = com.google.protobuf.ByteString.EMPTY;
      roles_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.auth.Auth.internal_static_authpb_User_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.auth.User getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.auth.User build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.auth.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.auth.User buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.auth.User result = new org.eclipse.ecf.provider.etcd3.grpc.api.auth.User(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.eclipse.ecf.provider.etcd3.grpc.api.auth.User result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.password_ = password_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        roles_.makeImmutable();
        result.roles_ = roles_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.auth.User) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.auth.User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.auth.User other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.auth.User.getDefaultInstance()) return this;
      if (other.getName() != com.google.protobuf.ByteString.EMPTY) {
        setName(other.getName());
      }
      if (other.getPassword() != com.google.protobuf.ByteString.EMPTY) {
        setPassword(other.getPassword());
      }
      if (!other.roles_.isEmpty()) {
        if (roles_.isEmpty()) {
          roles_ = other.roles_;
          bitField0_ |= 0x00000004;
        } else {
          ensureRolesIsMutable();
          roles_.addAll(other.roles_);
        }
        onChanged();
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
              name_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              password_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureRolesIsMutable();
              roles_.add(s);
              break;
            } // case 26
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

    private com.google.protobuf.ByteString name_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getName() {
      return name_;
    }
    /**
     * <code>bytes name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString password_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes password = 2;</code>
     * @return The password.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPassword() {
      return password_;
    }
    /**
     * <code>bytes password = 2;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes password = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      bitField0_ = (bitField0_ & ~0x00000002);
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList roles_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureRolesIsMutable() {
      if (!roles_.isModifiable()) {
        roles_ = new com.google.protobuf.LazyStringArrayList(roles_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @return A list containing the roles.
     */
    public com.google.protobuf.ProtocolStringList
        getRolesList() {
      roles_.makeImmutable();
      return roles_;
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @return The count of roles.
     */
    public int getRolesCount() {
      return roles_.size();
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @param index The index of the element to return.
     * @return The roles at the given index.
     */
    public java.lang.String getRoles(int index) {
      return roles_.get(index);
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the roles at the given index.
     */
    public com.google.protobuf.ByteString
        getRolesBytes(int index) {
      return roles_.getByteString(index);
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @param index The index to set the value at.
     * @param value The roles to set.
     * @return This builder for chaining.
     */
    public Builder setRoles(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRolesIsMutable();
      roles_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @param value The roles to add.
     * @return This builder for chaining.
     */
    public Builder addRoles(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureRolesIsMutable();
      roles_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @param values The roles to add.
     * @return This builder for chaining.
     */
    public Builder addAllRoles(
        java.lang.Iterable<java.lang.String> values) {
      ensureRolesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, roles_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoles() {
      roles_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     * @param value The bytes of the roles to add.
     * @return This builder for chaining.
     */
    public Builder addRolesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureRolesIsMutable();
      roles_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:authpb.User)
  }

  // @@protoc_insertion_point(class_scope:authpb.User)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.auth.User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.auth.User();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.auth.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    @java.lang.Override
    public User parsePartialFrom(
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

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.auth.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

