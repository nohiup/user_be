// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game_service.proto

package com.vou.common.proto.game;

/**
 * Protobuf type {@code game.CreateGameResponse}
 */
public final class CreateGameResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:game.CreateGameResponse)
    CreateGameResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGameResponse.newBuilder() to construct.
  private CreateGameResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGameResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGameResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateGameResponse(
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

            eventGameId_ = input.readInt64();
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
    return com.vou.common.proto.game.GameReceiver.internal_static_game_CreateGameResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.vou.common.proto.game.GameReceiver.internal_static_game_CreateGameResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.vou.common.proto.game.CreateGameResponse.class, com.vou.common.proto.game.CreateGameResponse.Builder.class);
  }

  public static final int EVENT_GAME_ID_FIELD_NUMBER = 1;
  private long eventGameId_;
  /**
   * <pre>
   * ID of the newly created EventGames record
   * </pre>
   *
   * <code>int64 event_game_id = 1;</code>
   * @return The eventGameId.
   */
  @java.lang.Override
  public long getEventGameId() {
    return eventGameId_;
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
    if (eventGameId_ != 0L) {
      output.writeInt64(1, eventGameId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventGameId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, eventGameId_);
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
    if (!(obj instanceof com.vou.common.proto.game.CreateGameResponse)) {
      return super.equals(obj);
    }
    com.vou.common.proto.game.CreateGameResponse other = (com.vou.common.proto.game.CreateGameResponse) obj;

    if (getEventGameId()
        != other.getEventGameId()) return false;
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
    hash = (37 * hash) + EVENT_GAME_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventGameId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vou.common.proto.game.CreateGameResponse parseFrom(
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
  public static Builder newBuilder(com.vou.common.proto.game.CreateGameResponse prototype) {
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
   * Protobuf type {@code game.CreateGameResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:game.CreateGameResponse)
      com.vou.common.proto.game.CreateGameResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.vou.common.proto.game.GameReceiver.internal_static_game_CreateGameResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.vou.common.proto.game.GameReceiver.internal_static_game_CreateGameResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.vou.common.proto.game.CreateGameResponse.class, com.vou.common.proto.game.CreateGameResponse.Builder.class);
    }

    // Construct using com.vou.common.proto.game.CreateGameResponse.newBuilder()
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
      eventGameId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.vou.common.proto.game.GameReceiver.internal_static_game_CreateGameResponse_descriptor;
    }

    @java.lang.Override
    public com.vou.common.proto.game.CreateGameResponse getDefaultInstanceForType() {
      return com.vou.common.proto.game.CreateGameResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.vou.common.proto.game.CreateGameResponse build() {
      com.vou.common.proto.game.CreateGameResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vou.common.proto.game.CreateGameResponse buildPartial() {
      com.vou.common.proto.game.CreateGameResponse result = new com.vou.common.proto.game.CreateGameResponse(this);
      result.eventGameId_ = eventGameId_;
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
      if (other instanceof com.vou.common.proto.game.CreateGameResponse) {
        return mergeFrom((com.vou.common.proto.game.CreateGameResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vou.common.proto.game.CreateGameResponse other) {
      if (other == com.vou.common.proto.game.CreateGameResponse.getDefaultInstance()) return this;
      if (other.getEventGameId() != 0L) {
        setEventGameId(other.getEventGameId());
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
      com.vou.common.proto.game.CreateGameResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vou.common.proto.game.CreateGameResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long eventGameId_ ;
    /**
     * <pre>
     * ID of the newly created EventGames record
     * </pre>
     *
     * <code>int64 event_game_id = 1;</code>
     * @return The eventGameId.
     */
    @java.lang.Override
    public long getEventGameId() {
      return eventGameId_;
    }
    /**
     * <pre>
     * ID of the newly created EventGames record
     * </pre>
     *
     * <code>int64 event_game_id = 1;</code>
     * @param value The eventGameId to set.
     * @return This builder for chaining.
     */
    public Builder setEventGameId(long value) {
      
      eventGameId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the newly created EventGames record
     * </pre>
     *
     * <code>int64 event_game_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventGameId() {
      
      eventGameId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:game.CreateGameResponse)
  }

  // @@protoc_insertion_point(class_scope:game.CreateGameResponse)
  private static final com.vou.common.proto.game.CreateGameResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.vou.common.proto.game.CreateGameResponse();
  }

  public static com.vou.common.proto.game.CreateGameResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGameResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateGameResponse>() {
    @java.lang.Override
    public CreateGameResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateGameResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateGameResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGameResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vou.common.proto.game.CreateGameResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

