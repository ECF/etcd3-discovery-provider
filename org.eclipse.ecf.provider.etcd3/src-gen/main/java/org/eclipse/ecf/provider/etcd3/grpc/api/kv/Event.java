// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv.proto

package org.eclipse.ecf.provider.etcd3.grpc.api.kv;

/**
 * Protobuf type {@code mvccpb.Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mvccpb.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Event(
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder subBuilder = null;
            if (kv_ != null) {
              subBuilder = kv_.toBuilder();
            }
            kv_ = input.readMessage(org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(kv_);
              kv_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder subBuilder = null;
            if (prevKv_ != null) {
              subBuilder = prevKv_.toBuilder();
            }
            prevKv_ = input.readMessage(org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prevKv_);
              prevKv_ = subBuilder.buildPartial();
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
    return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Kv.internal_static_mvccpb_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Kv.internal_static_mvccpb_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.class, org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.Builder.class);
  }

  /**
   * Protobuf enum {@code mvccpb.Event.EventType}
   */
  public enum EventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PUT = 0;</code>
     */
    PUT(0),
    /**
     * <code>DELETE = 1;</code>
     */
    DELETE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PUT = 0;</code>
     */
    public static final int PUT_VALUE = 0;
    /**
     * <code>DELETE = 1;</code>
     */
    public static final int DELETE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EventType forNumber(int value) {
      switch (value) {
        case 0: return PUT;
        case 1: return DELETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
            public EventType findValueByNumber(int number) {
              return EventType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.getDescriptor().getEnumTypes().get(0);
    }

    private static final EventType[] VALUES = values();

    public static EventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:mvccpb.Event.EventType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * type is the kind of event. If type is a PUT, it indicates
   * new data has been stored to the key. If type is a DELETE,
   * it indicates the key was deleted.
   * </pre>
   *
   * <code>.mvccpb.Event.EventType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * type is the kind of event. If type is a PUT, it indicates
   * new data has been stored to the key. If type is a DELETE,
   * it indicates the key was deleted.
   * </pre>
   *
   * <code>.mvccpb.Event.EventType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType getType() {
    @SuppressWarnings("deprecation")
    org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType result = org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType.valueOf(type_);
    return result == null ? org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType.UNRECOGNIZED : result;
  }

  public static final int KV_FIELD_NUMBER = 2;
  private org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue kv_;
  /**
   * <pre>
   * kv holds the KeyValue for the event.
   * A PUT event contains current kv pair.
   * A PUT event with kv.Version=1 indicates the creation of a key.
   * A DELETE/EXPIRE event contains the deleted key with
   * its modification revision set to the revision of deletion.
   * </pre>
   *
   * <code>.mvccpb.KeyValue kv = 2;</code>
   * @return Whether the kv field is set.
   */
  @java.lang.Override
  public boolean hasKv() {
    return kv_ != null;
  }
  /**
   * <pre>
   * kv holds the KeyValue for the event.
   * A PUT event contains current kv pair.
   * A PUT event with kv.Version=1 indicates the creation of a key.
   * A DELETE/EXPIRE event contains the deleted key with
   * its modification revision set to the revision of deletion.
   * </pre>
   *
   * <code>.mvccpb.KeyValue kv = 2;</code>
   * @return The kv.
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue getKv() {
    return kv_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.getDefaultInstance() : kv_;
  }
  /**
   * <pre>
   * kv holds the KeyValue for the event.
   * A PUT event contains current kv pair.
   * A PUT event with kv.Version=1 indicates the creation of a key.
   * A DELETE/EXPIRE event contains the deleted key with
   * its modification revision set to the revision of deletion.
   * </pre>
   *
   * <code>.mvccpb.KeyValue kv = 2;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder getKvOrBuilder() {
    return getKv();
  }

  public static final int PREV_KV_FIELD_NUMBER = 3;
  private org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue prevKv_;
  /**
   * <pre>
   * prev_kv holds the key-value pair before the event happens.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 3;</code>
   * @return Whether the prevKv field is set.
   */
  @java.lang.Override
  public boolean hasPrevKv() {
    return prevKv_ != null;
  }
  /**
   * <pre>
   * prev_kv holds the key-value pair before the event happens.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 3;</code>
   * @return The prevKv.
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue getPrevKv() {
    return prevKv_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.getDefaultInstance() : prevKv_;
  }
  /**
   * <pre>
   * prev_kv holds the key-value pair before the event happens.
   * </pre>
   *
   * <code>.mvccpb.KeyValue prev_kv = 3;</code>
   */
  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder getPrevKvOrBuilder() {
    return getPrevKv();
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
    if (type_ != org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType.PUT.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (kv_ != null) {
      output.writeMessage(2, getKv());
    }
    if (prevKv_ != null) {
      output.writeMessage(3, getPrevKv());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType.PUT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (kv_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getKv());
    }
    if (prevKv_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPrevKv());
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
    if (!(obj instanceof org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event)) {
      return super.equals(obj);
    }
    org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event other = (org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event) obj;

    if (type_ != other.type_) return false;
    if (hasKv() != other.hasKv()) return false;
    if (hasKv()) {
      if (!getKv()
          .equals(other.getKv())) return false;
    }
    if (hasPrevKv() != other.hasPrevKv()) return false;
    if (hasPrevKv()) {
      if (!getPrevKv()
          .equals(other.getPrevKv())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasKv()) {
      hash = (37 * hash) + KV_FIELD_NUMBER;
      hash = (53 * hash) + getKv().hashCode();
    }
    if (hasPrevKv()) {
      hash = (37 * hash) + PREV_KV_FIELD_NUMBER;
      hash = (53 * hash) + getPrevKv().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parseFrom(
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
  public static Builder newBuilder(org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event prototype) {
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
   * Protobuf type {@code mvccpb.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mvccpb.Event)
      org.eclipse.ecf.provider.etcd3.grpc.api.kv.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Kv.internal_static_mvccpb_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Kv.internal_static_mvccpb_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.class, org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.Builder.class);
    }

    // Construct using org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.newBuilder()
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
      type_ = 0;

      if (kvBuilder_ == null) {
        kv_ = null;
      } else {
        kv_ = null;
        kvBuilder_ = null;
      }
      if (prevKvBuilder_ == null) {
        prevKv_ = null;
      } else {
        prevKv_ = null;
        prevKvBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Kv.internal_static_mvccpb_Event_descriptor;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event getDefaultInstanceForType() {
      return org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.getDefaultInstance();
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event build() {
      org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event buildPartial() {
      org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event result = new org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event(this);
      result.type_ = type_;
      if (kvBuilder_ == null) {
        result.kv_ = kv_;
      } else {
        result.kv_ = kvBuilder_.build();
      }
      if (prevKvBuilder_ == null) {
        result.prevKv_ = prevKv_;
      } else {
        result.prevKv_ = prevKvBuilder_.build();
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
      if (other instanceof org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event) {
        return mergeFrom((org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event other) {
      if (other == org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasKv()) {
        mergeKv(other.getKv());
      }
      if (other.hasPrevKv()) {
        mergePrevKv(other.getPrevKv());
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
      org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * type is the kind of event. If type is a PUT, it indicates
     * new data has been stored to the key. If type is a DELETE,
     * it indicates the key was deleted.
     * </pre>
     *
     * <code>.mvccpb.Event.EventType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * type is the kind of event. If type is a PUT, it indicates
     * new data has been stored to the key. If type is a DELETE,
     * it indicates the key was deleted.
     * </pre>
     *
     * <code>.mvccpb.Event.EventType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type is the kind of event. If type is a PUT, it indicates
     * new data has been stored to the key. If type is a DELETE,
     * it indicates the key was deleted.
     * </pre>
     *
     * <code>.mvccpb.Event.EventType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType getType() {
      @SuppressWarnings("deprecation")
      org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType result = org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType.valueOf(type_);
      return result == null ? org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * type is the kind of event. If type is a PUT, it indicates
     * new data has been stored to the key. If type is a DELETE,
     * it indicates the key was deleted.
     * </pre>
     *
     * <code>.mvccpb.Event.EventType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type is the kind of event. If type is a PUT, it indicates
     * new data has been stored to the key. If type is a DELETE,
     * it indicates the key was deleted.
     * </pre>
     *
     * <code>.mvccpb.Event.EventType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue kv_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder> kvBuilder_;
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     * @return Whether the kv field is set.
     */
    public boolean hasKv() {
      return kvBuilder_ != null || kv_ != null;
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     * @return The kv.
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue getKv() {
      if (kvBuilder_ == null) {
        return kv_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.getDefaultInstance() : kv_;
      } else {
        return kvBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    public Builder setKv(org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue value) {
      if (kvBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kv_ = value;
        onChanged();
      } else {
        kvBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    public Builder setKv(
        org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder builderForValue) {
      if (kvBuilder_ == null) {
        kv_ = builderForValue.build();
        onChanged();
      } else {
        kvBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    public Builder mergeKv(org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue value) {
      if (kvBuilder_ == null) {
        if (kv_ != null) {
          kv_ =
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.newBuilder(kv_).mergeFrom(value).buildPartial();
        } else {
          kv_ = value;
        }
        onChanged();
      } else {
        kvBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    public Builder clearKv() {
      if (kvBuilder_ == null) {
        kv_ = null;
        onChanged();
      } else {
        kv_ = null;
        kvBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder getKvBuilder() {
      
      onChanged();
      return getKvFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder getKvOrBuilder() {
      if (kvBuilder_ != null) {
        return kvBuilder_.getMessageOrBuilder();
      } else {
        return kv_ == null ?
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.getDefaultInstance() : kv_;
      }
    }
    /**
     * <pre>
     * kv holds the KeyValue for the event.
     * A PUT event contains current kv pair.
     * A PUT event with kv.Version=1 indicates the creation of a key.
     * A DELETE/EXPIRE event contains the deleted key with
     * its modification revision set to the revision of deletion.
     * </pre>
     *
     * <code>.mvccpb.KeyValue kv = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder> 
        getKvFieldBuilder() {
      if (kvBuilder_ == null) {
        kvBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder>(
                getKv(),
                getParentForChildren(),
                isClean());
        kv_ = null;
      }
      return kvBuilder_;
    }

    private org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue prevKv_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder> prevKvBuilder_;
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     * @return Whether the prevKv field is set.
     */
    public boolean hasPrevKv() {
      return prevKvBuilder_ != null || prevKv_ != null;
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     * @return The prevKv.
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue getPrevKv() {
      if (prevKvBuilder_ == null) {
        return prevKv_ == null ? org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.getDefaultInstance() : prevKv_;
      } else {
        return prevKvBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    public Builder setPrevKv(org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue value) {
      if (prevKvBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prevKv_ = value;
        onChanged();
      } else {
        prevKvBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    public Builder setPrevKv(
        org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder builderForValue) {
      if (prevKvBuilder_ == null) {
        prevKv_ = builderForValue.build();
        onChanged();
      } else {
        prevKvBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    public Builder mergePrevKv(org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue value) {
      if (prevKvBuilder_ == null) {
        if (prevKv_ != null) {
          prevKv_ =
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.newBuilder(prevKv_).mergeFrom(value).buildPartial();
        } else {
          prevKv_ = value;
        }
        onChanged();
      } else {
        prevKvBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    public Builder clearPrevKv() {
      if (prevKvBuilder_ == null) {
        prevKv_ = null;
        onChanged();
      } else {
        prevKv_ = null;
        prevKvBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder getPrevKvBuilder() {
      
      onChanged();
      return getPrevKvFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    public org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder getPrevKvOrBuilder() {
      if (prevKvBuilder_ != null) {
        return prevKvBuilder_.getMessageOrBuilder();
      } else {
        return prevKv_ == null ?
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.getDefaultInstance() : prevKv_;
      }
    }
    /**
     * <pre>
     * prev_kv holds the key-value pair before the event happens.
     * </pre>
     *
     * <code>.mvccpb.KeyValue prev_kv = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder> 
        getPrevKvFieldBuilder() {
      if (prevKvBuilder_ == null) {
        prevKvBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValue.Builder, org.eclipse.ecf.provider.etcd3.grpc.api.kv.KeyValueOrBuilder>(
                getPrevKv(),
                getParentForChildren(),
                isClean());
        prevKv_ = null;
      }
      return prevKvBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mvccpb.Event)
  }

  // @@protoc_insertion_point(class_scope:mvccpb.Event)
  private static final org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event();
  }

  public static org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Event(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.eclipse.ecf.provider.etcd3.grpc.api.kv.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

