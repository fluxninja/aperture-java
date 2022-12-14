// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package com.fluxninja.generated.validate;

/**
 * <pre>
 * RepeatedRules describe the constraints applied to `repeated` values
 * </pre>
 *
 * Protobuf type {@code validate.RepeatedRules}
 */
public final class RepeatedRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:validate.RepeatedRules)
    RepeatedRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatedRules.newBuilder() to construct.
  private RepeatedRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatedRules() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepeatedRules();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RepeatedRules(
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
          case 8: {
            bitField0_ |= 0x00000001;
            minItems_ = input.readUInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            maxItems_ = input.readUInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            unique_ = input.readBool();
            break;
          }
          case 34: {
            com.fluxninja.generated.validate.FieldRules.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) != 0)) {
              subBuilder = items_.toBuilder();
            }
            items_ = input.readMessage(com.fluxninja.generated.validate.FieldRules.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(items_);
              items_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            ignoreEmpty_ = input.readBool();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_RepeatedRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_RepeatedRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fluxninja.generated.validate.RepeatedRules.class, com.fluxninja.generated.validate.RepeatedRules.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_ITEMS_FIELD_NUMBER = 1;
  private long minItems_;
  /**
   * <pre>
   * MinItems specifies that this field must have the specified number of
   * items at a minimum
   * </pre>
   *
   * <code>optional uint64 min_items = 1 [json_name = "minItems"];</code>
   * @return Whether the minItems field is set.
   */
  @java.lang.Override
  public boolean hasMinItems() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * MinItems specifies that this field must have the specified number of
   * items at a minimum
   * </pre>
   *
   * <code>optional uint64 min_items = 1 [json_name = "minItems"];</code>
   * @return The minItems.
   */
  @java.lang.Override
  public long getMinItems() {
    return minItems_;
  }

  public static final int MAX_ITEMS_FIELD_NUMBER = 2;
  private long maxItems_;
  /**
   * <pre>
   * MaxItems specifies that this field must have the specified number of
   * items at a maximum
   * </pre>
   *
   * <code>optional uint64 max_items = 2 [json_name = "maxItems"];</code>
   * @return Whether the maxItems field is set.
   */
  @java.lang.Override
  public boolean hasMaxItems() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * MaxItems specifies that this field must have the specified number of
   * items at a maximum
   * </pre>
   *
   * <code>optional uint64 max_items = 2 [json_name = "maxItems"];</code>
   * @return The maxItems.
   */
  @java.lang.Override
  public long getMaxItems() {
    return maxItems_;
  }

  public static final int UNIQUE_FIELD_NUMBER = 3;
  private boolean unique_;
  /**
   * <pre>
   * Unique specifies that all elements in this field must be unique. This
   * contraint is only applicable to scalar and enum types (messages are not
   * supported).
   * </pre>
   *
   * <code>optional bool unique = 3 [json_name = "unique"];</code>
   * @return Whether the unique field is set.
   */
  @java.lang.Override
  public boolean hasUnique() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Unique specifies that all elements in this field must be unique. This
   * contraint is only applicable to scalar and enum types (messages are not
   * supported).
   * </pre>
   *
   * <code>optional bool unique = 3 [json_name = "unique"];</code>
   * @return The unique.
   */
  @java.lang.Override
  public boolean getUnique() {
    return unique_;
  }

  public static final int ITEMS_FIELD_NUMBER = 4;
  private com.fluxninja.generated.validate.FieldRules items_;
  /**
   * <pre>
   * Items specifies the contraints to be applied to each item in the field.
   * Repeated message fields will still execute validation against each item
   * unless skip is specified here.
   * </pre>
   *
   * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
   * @return Whether the items field is set.
   */
  @java.lang.Override
  public boolean hasItems() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Items specifies the contraints to be applied to each item in the field.
   * Repeated message fields will still execute validation against each item
   * unless skip is specified here.
   * </pre>
   *
   * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
   * @return The items.
   */
  @java.lang.Override
  public com.fluxninja.generated.validate.FieldRules getItems() {
    return items_ == null ? com.fluxninja.generated.validate.FieldRules.getDefaultInstance() : items_;
  }
  /**
   * <pre>
   * Items specifies the contraints to be applied to each item in the field.
   * Repeated message fields will still execute validation against each item
   * unless skip is specified here.
   * </pre>
   *
   * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
   */
  @java.lang.Override
  public com.fluxninja.generated.validate.FieldRulesOrBuilder getItemsOrBuilder() {
    return items_ == null ? com.fluxninja.generated.validate.FieldRules.getDefaultInstance() : items_;
  }

  public static final int IGNORE_EMPTY_FIELD_NUMBER = 5;
  private boolean ignoreEmpty_;
  /**
   * <pre>
   * IgnoreEmpty specifies that the validation rules of this field should be
   * evaluated only if the field is not empty
   * </pre>
   *
   * <code>optional bool ignore_empty = 5 [json_name = "ignoreEmpty"];</code>
   * @return Whether the ignoreEmpty field is set.
   */
  @java.lang.Override
  public boolean hasIgnoreEmpty() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * IgnoreEmpty specifies that the validation rules of this field should be
   * evaluated only if the field is not empty
   * </pre>
   *
   * <code>optional bool ignore_empty = 5 [json_name = "ignoreEmpty"];</code>
   * @return The ignoreEmpty.
   */
  @java.lang.Override
  public boolean getIgnoreEmpty() {
    return ignoreEmpty_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt64(1, minItems_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, maxItems_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(3, unique_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(4, getItems());
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeBool(5, ignoreEmpty_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, minItems_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, maxItems_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, unique_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getItems());
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ignoreEmpty_);
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
    if (!(obj instanceof com.fluxninja.generated.validate.RepeatedRules)) {
      return super.equals(obj);
    }
    com.fluxninja.generated.validate.RepeatedRules other = (com.fluxninja.generated.validate.RepeatedRules) obj;

    if (hasMinItems() != other.hasMinItems()) return false;
    if (hasMinItems()) {
      if (getMinItems()
          != other.getMinItems()) return false;
    }
    if (hasMaxItems() != other.hasMaxItems()) return false;
    if (hasMaxItems()) {
      if (getMaxItems()
          != other.getMaxItems()) return false;
    }
    if (hasUnique() != other.hasUnique()) return false;
    if (hasUnique()) {
      if (getUnique()
          != other.getUnique()) return false;
    }
    if (hasItems() != other.hasItems()) return false;
    if (hasItems()) {
      if (!getItems()
          .equals(other.getItems())) return false;
    }
    if (hasIgnoreEmpty() != other.hasIgnoreEmpty()) return false;
    if (hasIgnoreEmpty()) {
      if (getIgnoreEmpty()
          != other.getIgnoreEmpty()) return false;
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
    if (hasMinItems()) {
      hash = (37 * hash) + MIN_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinItems());
    }
    if (hasMaxItems()) {
      hash = (37 * hash) + MAX_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxItems());
    }
    if (hasUnique()) {
      hash = (37 * hash) + UNIQUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnique());
    }
    if (hasItems()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItems().hashCode();
    }
    if (hasIgnoreEmpty()) {
      hash = (37 * hash) + IGNORE_EMPTY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIgnoreEmpty());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.validate.RepeatedRules parseFrom(
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
  public static Builder newBuilder(com.fluxninja.generated.validate.RepeatedRules prototype) {
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
   * RepeatedRules describe the constraints applied to `repeated` values
   * </pre>
   *
   * Protobuf type {@code validate.RepeatedRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:validate.RepeatedRules)
      com.fluxninja.generated.validate.RepeatedRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_RepeatedRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_RepeatedRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fluxninja.generated.validate.RepeatedRules.class, com.fluxninja.generated.validate.RepeatedRules.Builder.class);
    }

    // Construct using com.fluxninja.generated.validate.RepeatedRules.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      minItems_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      maxItems_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      unique_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      if (itemsBuilder_ == null) {
        items_ = null;
      } else {
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      ignoreEmpty_ = false;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_RepeatedRules_descriptor;
    }

    @java.lang.Override
    public com.fluxninja.generated.validate.RepeatedRules getDefaultInstanceForType() {
      return com.fluxninja.generated.validate.RepeatedRules.getDefaultInstance();
    }

    @java.lang.Override
    public com.fluxninja.generated.validate.RepeatedRules build() {
      com.fluxninja.generated.validate.RepeatedRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fluxninja.generated.validate.RepeatedRules buildPartial() {
      com.fluxninja.generated.validate.RepeatedRules result = new com.fluxninja.generated.validate.RepeatedRules(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minItems_ = minItems_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxItems_ = maxItems_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unique_ = unique_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        if (itemsBuilder_ == null) {
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.ignoreEmpty_ = ignoreEmpty_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.fluxninja.generated.validate.RepeatedRules) {
        return mergeFrom((com.fluxninja.generated.validate.RepeatedRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fluxninja.generated.validate.RepeatedRules other) {
      if (other == com.fluxninja.generated.validate.RepeatedRules.getDefaultInstance()) return this;
      if (other.hasMinItems()) {
        setMinItems(other.getMinItems());
      }
      if (other.hasMaxItems()) {
        setMaxItems(other.getMaxItems());
      }
      if (other.hasUnique()) {
        setUnique(other.getUnique());
      }
      if (other.hasItems()) {
        mergeItems(other.getItems());
      }
      if (other.hasIgnoreEmpty()) {
        setIgnoreEmpty(other.getIgnoreEmpty());
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
      com.fluxninja.generated.validate.RepeatedRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fluxninja.generated.validate.RepeatedRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long minItems_ ;
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1 [json_name = "minItems"];</code>
     * @return Whether the minItems field is set.
     */
    @java.lang.Override
    public boolean hasMinItems() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1 [json_name = "minItems"];</code>
     * @return The minItems.
     */
    @java.lang.Override
    public long getMinItems() {
      return minItems_;
    }
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1 [json_name = "minItems"];</code>
     * @param value The minItems to set.
     * @return This builder for chaining.
     */
    public Builder setMinItems(long value) {
      bitField0_ |= 0x00000001;
      minItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1 [json_name = "minItems"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinItems() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minItems_ = 0L;
      onChanged();
      return this;
    }

    private long maxItems_ ;
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2 [json_name = "maxItems"];</code>
     * @return Whether the maxItems field is set.
     */
    @java.lang.Override
    public boolean hasMaxItems() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2 [json_name = "maxItems"];</code>
     * @return The maxItems.
     */
    @java.lang.Override
    public long getMaxItems() {
      return maxItems_;
    }
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2 [json_name = "maxItems"];</code>
     * @param value The maxItems to set.
     * @return This builder for chaining.
     */
    public Builder setMaxItems(long value) {
      bitField0_ |= 0x00000002;
      maxItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2 [json_name = "maxItems"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxItems() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxItems_ = 0L;
      onChanged();
      return this;
    }

    private boolean unique_ ;
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3 [json_name = "unique"];</code>
     * @return Whether the unique field is set.
     */
    @java.lang.Override
    public boolean hasUnique() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3 [json_name = "unique"];</code>
     * @return The unique.
     */
    @java.lang.Override
    public boolean getUnique() {
      return unique_;
    }
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3 [json_name = "unique"];</code>
     * @param value The unique to set.
     * @return This builder for chaining.
     */
    public Builder setUnique(boolean value) {
      bitField0_ |= 0x00000004;
      unique_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3 [json_name = "unique"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnique() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unique_ = false;
      onChanged();
      return this;
    }

    private com.fluxninja.generated.validate.FieldRules items_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.fluxninja.generated.validate.FieldRules, com.fluxninja.generated.validate.FieldRules.Builder, com.fluxninja.generated.validate.FieldRulesOrBuilder> itemsBuilder_;
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     * @return Whether the items field is set.
     */
    public boolean hasItems() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     * @return The items.
     */
    public com.fluxninja.generated.validate.FieldRules getItems() {
      if (itemsBuilder_ == null) {
        return items_ == null ? com.fluxninja.generated.validate.FieldRules.getDefaultInstance() : items_;
      } else {
        return itemsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    public Builder setItems(com.fluxninja.generated.validate.FieldRules value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        items_ = value;
        onChanged();
      } else {
        itemsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    public Builder setItems(
        com.fluxninja.generated.validate.FieldRules.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        items_ = builderForValue.build();
        onChanged();
      } else {
        itemsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    public Builder mergeItems(com.fluxninja.generated.validate.FieldRules value) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
            items_ != null &&
            items_ != com.fluxninja.generated.validate.FieldRules.getDefaultInstance()) {
          items_ =
            com.fluxninja.generated.validate.FieldRules.newBuilder(items_).mergeFrom(value).buildPartial();
        } else {
          items_ = value;
        }
        onChanged();
      } else {
        itemsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = null;
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    public com.fluxninja.generated.validate.FieldRules.Builder getItemsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getItemsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    public com.fluxninja.generated.validate.FieldRulesOrBuilder getItemsOrBuilder() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilder();
      } else {
        return items_ == null ?
            com.fluxninja.generated.validate.FieldRules.getDefaultInstance() : items_;
      }
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4 [json_name = "items"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.fluxninja.generated.validate.FieldRules, com.fluxninja.generated.validate.FieldRules.Builder, com.fluxninja.generated.validate.FieldRulesOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.fluxninja.generated.validate.FieldRules, com.fluxninja.generated.validate.FieldRules.Builder, com.fluxninja.generated.validate.FieldRulesOrBuilder>(
                getItems(),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private boolean ignoreEmpty_ ;
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 5 [json_name = "ignoreEmpty"];</code>
     * @return Whether the ignoreEmpty field is set.
     */
    @java.lang.Override
    public boolean hasIgnoreEmpty() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 5 [json_name = "ignoreEmpty"];</code>
     * @return The ignoreEmpty.
     */
    @java.lang.Override
    public boolean getIgnoreEmpty() {
      return ignoreEmpty_;
    }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 5 [json_name = "ignoreEmpty"];</code>
     * @param value The ignoreEmpty to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreEmpty(boolean value) {
      bitField0_ |= 0x00000010;
      ignoreEmpty_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IgnoreEmpty specifies that the validation rules of this field should be
     * evaluated only if the field is not empty
     * </pre>
     *
     * <code>optional bool ignore_empty = 5 [json_name = "ignoreEmpty"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnoreEmpty() {
      bitField0_ = (bitField0_ & ~0x00000010);
      ignoreEmpty_ = false;
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


    // @@protoc_insertion_point(builder_scope:validate.RepeatedRules)
  }

  // @@protoc_insertion_point(class_scope:validate.RepeatedRules)
  private static final com.fluxninja.generated.validate.RepeatedRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fluxninja.generated.validate.RepeatedRules();
  }

  public static com.fluxninja.generated.validate.RepeatedRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RepeatedRules>
      PARSER = new com.google.protobuf.AbstractParser<RepeatedRules>() {
    @java.lang.Override
    public RepeatedRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RepeatedRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RepeatedRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatedRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fluxninja.generated.validate.RepeatedRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

