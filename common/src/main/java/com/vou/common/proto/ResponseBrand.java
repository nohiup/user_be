// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event_service.proto

package com.vou.common.proto;

/**
 * Protobuf type {@code event.ResponseBrand}
 */
public final class ResponseBrand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:event.ResponseBrand)
    ResponseBrandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseBrand.newBuilder() to construct.
  private ResponseBrand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseBrand() {
    id_ = com.google.protobuf.ByteString.EMPTY;
    name_ = "";
    phone_ = "";
    field_ = "";
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResponseBrand();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseBrand(
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

            id_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            phone_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            field_ = s;
            break;
          }
          case 42: {
            com.vou.common.proto.Point.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(com.vou.common.proto.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
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
    return com.vou.common.proto.EventServiceProto.internal_static_event_ResponseBrand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.vou.common.proto.EventServiceProto.internal_static_event_ResponseBrand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.vou.common.proto.ResponseBrand.class, com.vou.common.proto.ResponseBrand.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString id_;
  /**
   * <pre>
   * ID dạng binary (UUID)
   * </pre>
   *
   * <code>bytes id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Tên thương hiệu
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Tên thương hiệu
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHONE_FIELD_NUMBER = 3;
  private volatile java.lang.Object phone_;
  /**
   * <pre>
   * Số điện thoại
   * </pre>
   *
   * <code>string phone = 3;</code>
   * @return The phone.
   */
  @java.lang.Override
  public java.lang.String getPhone() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Số điện thoại
   * </pre>
   *
   * <code>string phone = 3;</code>
   * @return The bytes for phone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_FIELD_NUMBER = 4;
  private volatile java.lang.Object field_;
  /**
   * <pre>
   * Lĩnh vực hoạt động
   * </pre>
   *
   * <code>string field = 4;</code>
   * @return The field.
   */
  @java.lang.Override
  public java.lang.String getField() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      field_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Lĩnh vực hoạt động
   * </pre>
   *
   * <code>string field = 4;</code>
   * @return The bytes for field.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldBytes() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      field_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 5;
  private com.vou.common.proto.Point address_;
  /**
   * <pre>
   * Địa chỉ (dạng tọa độ)
   * </pre>
   *
   * <code>.event.Point address = 5;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <pre>
   * Địa chỉ (dạng tọa độ)
   * </pre>
   *
   * <code>.event.Point address = 5;</code>
   * @return The address.
   */
  @java.lang.Override
  public com.vou.common.proto.Point getAddress() {
    return address_ == null ? com.vou.common.proto.Point.getDefaultInstance() : address_;
  }
  /**
   * <pre>
   * Địa chỉ (dạng tọa độ)
   * </pre>
   *
   * <code>.event.Point address = 5;</code>
   */
  @java.lang.Override
  public com.vou.common.proto.PointOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int STATUS_FIELD_NUMBER = 6;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   * Trạng thái ('active' hoặc 'inactive')
   * </pre>
   *
   * <code>string status = 6;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Trạng thái ('active' hoặc 'inactive')
   * </pre>
   *
   * <code>string status = 6;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!id_.isEmpty()) {
      output.writeBytes(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, phone_);
    }
    if (!getFieldBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, field_);
    }
    if (address_ != null) {
      output.writeMessage(5, getAddress());
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, phone_);
    }
    if (!getFieldBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, field_);
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getAddress());
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, status_);
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
    if (!(obj instanceof com.vou.common.proto.ResponseBrand)) {
      return super.equals(obj);
    }
    com.vou.common.proto.ResponseBrand other = (com.vou.common.proto.ResponseBrand) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getPhone()
        .equals(other.getPhone())) return false;
    if (!getField()
        .equals(other.getField())) return false;
    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (!getStatus()
        .equals(other.getStatus())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + getPhone().hashCode();
    hash = (37 * hash) + FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getField().hashCode();
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.vou.common.proto.ResponseBrand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vou.common.proto.ResponseBrand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.vou.common.proto.ResponseBrand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vou.common.proto.ResponseBrand parseFrom(
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
  public static Builder newBuilder(com.vou.common.proto.ResponseBrand prototype) {
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
   * Protobuf type {@code event.ResponseBrand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event.ResponseBrand)
      com.vou.common.proto.ResponseBrandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.vou.common.proto.EventServiceProto.internal_static_event_ResponseBrand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.vou.common.proto.EventServiceProto.internal_static_event_ResponseBrand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.vou.common.proto.ResponseBrand.class, com.vou.common.proto.ResponseBrand.Builder.class);
    }

    // Construct using com.vou.common.proto.ResponseBrand.newBuilder()
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
      id_ = com.google.protobuf.ByteString.EMPTY;

      name_ = "";

      phone_ = "";

      field_ = "";

      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      status_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.vou.common.proto.EventServiceProto.internal_static_event_ResponseBrand_descriptor;
    }

    @java.lang.Override
    public com.vou.common.proto.ResponseBrand getDefaultInstanceForType() {
      return com.vou.common.proto.ResponseBrand.getDefaultInstance();
    }

    @java.lang.Override
    public com.vou.common.proto.ResponseBrand build() {
      com.vou.common.proto.ResponseBrand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vou.common.proto.ResponseBrand buildPartial() {
      com.vou.common.proto.ResponseBrand result = new com.vou.common.proto.ResponseBrand(this);
      result.id_ = id_;
      result.name_ = name_;
      result.phone_ = phone_;
      result.field_ = field_;
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof com.vou.common.proto.ResponseBrand) {
        return mergeFrom((com.vou.common.proto.ResponseBrand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vou.common.proto.ResponseBrand other) {
      if (other == com.vou.common.proto.ResponseBrand.getDefaultInstance()) return this;
      if (other.getId() != com.google.protobuf.ByteString.EMPTY) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
        onChanged();
      }
      if (!other.getField().isEmpty()) {
        field_ = other.field_;
        onChanged();
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
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
      com.vou.common.proto.ResponseBrand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vou.common.proto.ResponseBrand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * ID dạng binary (UUID)
     * </pre>
     *
     * <code>bytes id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getId() {
      return id_;
    }
    /**
     * <pre>
     * ID dạng binary (UUID)
     * </pre>
     *
     * <code>bytes id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID dạng binary (UUID)
     * </pre>
     *
     * <code>bytes id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Tên thương hiệu
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Tên thương hiệu
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Tên thương hiệu
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tên thương hiệu
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tên thương hiệu
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object phone_ = "";
    /**
     * <pre>
     * Số điện thoại
     * </pre>
     *
     * <code>string phone = 3;</code>
     * @return The phone.
     */
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Số điện thoại
     * </pre>
     *
     * <code>string phone = 3;</code>
     * @return The bytes for phone.
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Số điện thoại
     * </pre>
     *
     * <code>string phone = 3;</code>
     * @param value The phone to set.
     * @return This builder for chaining.
     */
    public Builder setPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Số điện thoại
     * </pre>
     *
     * <code>string phone = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Số điện thoại
     * </pre>
     *
     * <code>string phone = 3;</code>
     * @param value The bytes for phone to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object field_ = "";
    /**
     * <pre>
     * Lĩnh vực hoạt động
     * </pre>
     *
     * <code>string field = 4;</code>
     * @return The field.
     */
    public java.lang.String getField() {
      java.lang.Object ref = field_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        field_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Lĩnh vực hoạt động
     * </pre>
     *
     * <code>string field = 4;</code>
     * @return The bytes for field.
     */
    public com.google.protobuf.ByteString
        getFieldBytes() {
      java.lang.Object ref = field_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        field_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Lĩnh vực hoạt động
     * </pre>
     *
     * <code>string field = 4;</code>
     * @param value The field to set.
     * @return This builder for chaining.
     */
    public Builder setField(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      field_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Lĩnh vực hoạt động
     * </pre>
     *
     * <code>string field = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearField() {
      
      field_ = getDefaultInstance().getField();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Lĩnh vực hoạt động
     * </pre>
     *
     * <code>string field = 4;</code>
     * @param value The bytes for field to set.
     * @return This builder for chaining.
     */
    public Builder setFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      field_ = value;
      onChanged();
      return this;
    }

    private com.vou.common.proto.Point address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.vou.common.proto.Point, com.vou.common.proto.Point.Builder, com.vou.common.proto.PointOrBuilder> addressBuilder_;
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     * @return The address.
     */
    public com.vou.common.proto.Point getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.vou.common.proto.Point.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    public Builder setAddress(com.vou.common.proto.Point value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    public Builder setAddress(
        com.vou.common.proto.Point.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    public Builder mergeAddress(com.vou.common.proto.Point value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.vou.common.proto.Point.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    public com.vou.common.proto.Point.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    public com.vou.common.proto.PointOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.vou.common.proto.Point.getDefaultInstance() : address_;
      }
    }
    /**
     * <pre>
     * Địa chỉ (dạng tọa độ)
     * </pre>
     *
     * <code>.event.Point address = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.vou.common.proto.Point, com.vou.common.proto.Point.Builder, com.vou.common.proto.PointOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.vou.common.proto.Point, com.vou.common.proto.Point.Builder, com.vou.common.proto.PointOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * Trạng thái ('active' hoặc 'inactive')
     * </pre>
     *
     * <code>string status = 6;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Trạng thái ('active' hoặc 'inactive')
     * </pre>
     *
     * <code>string status = 6;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Trạng thái ('active' hoặc 'inactive')
     * </pre>
     *
     * <code>string status = 6;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Trạng thái ('active' hoặc 'inactive')
     * </pre>
     *
     * <code>string status = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Trạng thái ('active' hoặc 'inactive')
     * </pre>
     *
     * <code>string status = 6;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
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


    // @@protoc_insertion_point(builder_scope:event.ResponseBrand)
  }

  // @@protoc_insertion_point(class_scope:event.ResponseBrand)
  private static final com.vou.common.proto.ResponseBrand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.vou.common.proto.ResponseBrand();
  }

  public static com.vou.common.proto.ResponseBrand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseBrand>
      PARSER = new com.google.protobuf.AbstractParser<ResponseBrand>() {
    @java.lang.Override
    public ResponseBrand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseBrand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseBrand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseBrand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vou.common.proto.ResponseBrand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
