// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package com.fluxninja.generated.validate;

/**
 * <pre>
 * EnumRules describe the constraints applied to enum values
 * </pre>
 *
 * Protobuf type {@code validate.EnumRules}
 */
public final class EnumRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:validate.EnumRules)
    EnumRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnumRules.newBuilder() to construct.
  private EnumRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnumRules() {
    in_ = emptyIntList();
    notIn_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnumRules();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EnumRules(
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
            const_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            definedOnly_ = input.readBool();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              in_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            in_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
              in_ = newIntList();
              mutable_bitField0_ |= 0x00000004;
            }
            while (input.getBytesUntilLimit() > 0) {
              in_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              notIn_ = newIntList();
              mutable_bitField0_ |= 0x00000008;
            }
            notIn_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000008) != 0) && input.getBytesUntilLimit() > 0) {
              notIn_ = newIntList();
              mutable_bitField0_ |= 0x00000008;
            }
            while (input.getBytesUntilLimit() > 0) {
              notIn_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        in_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        notIn_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_EnumRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_EnumRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fluxninja.generated.validate.EnumRules.class, com.fluxninja.generated.validate.EnumRules.Builder.class);
  }

  private int bitField0_;
  public static final int CONST_FIELD_NUMBER = 1;
  private int const_;
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const"];</code>
   * @return Whether the const field is set.
   */
  @java.lang.Override
  public boolean hasConst() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Const specifies that this field must be exactly the specified value
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const"];</code>
   * @return The const.
   */
  @java.lang.Override
  public int getConst() {
    return const_;
  }

  public static final int DEFINED_ONLY_FIELD_NUMBER = 2;
  private boolean definedOnly_;
  /**
   * <pre>
   * DefinedOnly specifies that this field must be only one of the defined
   * values for this enum, failing on any undefined value.
   * </pre>
   *
   * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
   * @return Whether the definedOnly field is set.
   */
  @java.lang.Override
  public boolean hasDefinedOnly() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * DefinedOnly specifies that this field must be only one of the defined
   * values for this enum, failing on any undefined value.
   * </pre>
   *
   * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
   * @return The definedOnly.
   */
  @java.lang.Override
  public boolean getDefinedOnly() {
    return definedOnly_;
  }

  public static final int IN_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList in_;
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in"];</code>
   * @return A list containing the in.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getInList() {
    return in_;
  }
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in"];</code>
   * @return The count of in.
   */
  public int getInCount() {
    return in_.size();
  }
  /**
   * <pre>
   * In specifies that this field must be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in"];</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  public int getIn(int index) {
    return in_.getInt(index);
  }

  public static final int NOT_IN_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList notIn_;
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
   * @return A list containing the notIn.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getNotInList() {
    return notIn_;
  }
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
   * @return The count of notIn.
   */
  public int getNotInCount() {
    return notIn_.size();
  }
  /**
   * <pre>
   * NotIn specifies that this field cannot be equal to one of the specified
   * values
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  public int getNotIn(int index) {
    return notIn_.getInt(index);
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
      output.writeInt32(1, const_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, definedOnly_);
    }
    for (int i = 0; i < in_.size(); i++) {
      output.writeInt32(3, in_.getInt(i));
    }
    for (int i = 0; i < notIn_.size(); i++) {
      output.writeInt32(4, notIn_.getInt(i));
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
        .computeInt32Size(1, const_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, definedOnly_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < in_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(in_.getInt(i));
      }
      size += dataSize;
      size += 1 * getInList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < notIn_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(notIn_.getInt(i));
      }
      size += dataSize;
      size += 1 * getNotInList().size();
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
    if (!(obj instanceof com.fluxninja.generated.validate.EnumRules)) {
      return super.equals(obj);
    }
    com.fluxninja.generated.validate.EnumRules other = (com.fluxninja.generated.validate.EnumRules) obj;

    if (hasConst() != other.hasConst()) return false;
    if (hasConst()) {
      if (getConst()
          != other.getConst()) return false;
    }
    if (hasDefinedOnly() != other.hasDefinedOnly()) return false;
    if (hasDefinedOnly()) {
      if (getDefinedOnly()
          != other.getDefinedOnly()) return false;
    }
    if (!getInList()
        .equals(other.getInList())) return false;
    if (!getNotInList()
        .equals(other.getNotInList())) return false;
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
    if (hasConst()) {
      hash = (37 * hash) + CONST_FIELD_NUMBER;
      hash = (53 * hash) + getConst();
    }
    if (hasDefinedOnly()) {
      hash = (37 * hash) + DEFINED_ONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDefinedOnly());
    }
    if (getInCount() > 0) {
      hash = (37 * hash) + IN_FIELD_NUMBER;
      hash = (53 * hash) + getInList().hashCode();
    }
    if (getNotInCount() > 0) {
      hash = (37 * hash) + NOT_IN_FIELD_NUMBER;
      hash = (53 * hash) + getNotInList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.EnumRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.validate.EnumRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.validate.EnumRules parseFrom(
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
  public static Builder newBuilder(com.fluxninja.generated.validate.EnumRules prototype) {
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
   * EnumRules describe the constraints applied to enum values
   * </pre>
   *
   * Protobuf type {@code validate.EnumRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:validate.EnumRules)
      com.fluxninja.generated.validate.EnumRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_EnumRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_EnumRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fluxninja.generated.validate.EnumRules.class, com.fluxninja.generated.validate.EnumRules.Builder.class);
    }

    // Construct using com.fluxninja.generated.validate.EnumRules.newBuilder()
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
      const_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      definedOnly_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      in_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      notIn_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fluxninja.generated.validate.ValidateProto.internal_static_validate_EnumRules_descriptor;
    }

    @java.lang.Override
    public com.fluxninja.generated.validate.EnumRules getDefaultInstanceForType() {
      return com.fluxninja.generated.validate.EnumRules.getDefaultInstance();
    }

    @java.lang.Override
    public com.fluxninja.generated.validate.EnumRules build() {
      com.fluxninja.generated.validate.EnumRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fluxninja.generated.validate.EnumRules buildPartial() {
      com.fluxninja.generated.validate.EnumRules result = new com.fluxninja.generated.validate.EnumRules(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.const_ = const_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.definedOnly_ = definedOnly_;
        to_bitField0_ |= 0x00000002;
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        in_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.in_ = in_;
      if (((bitField0_ & 0x00000008) != 0)) {
        notIn_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.notIn_ = notIn_;
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
      if (other instanceof com.fluxninja.generated.validate.EnumRules) {
        return mergeFrom((com.fluxninja.generated.validate.EnumRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fluxninja.generated.validate.EnumRules other) {
      if (other == com.fluxninja.generated.validate.EnumRules.getDefaultInstance()) return this;
      if (other.hasConst()) {
        setConst(other.getConst());
      }
      if (other.hasDefinedOnly()) {
        setDefinedOnly(other.getDefinedOnly());
      }
      if (!other.in_.isEmpty()) {
        if (in_.isEmpty()) {
          in_ = other.in_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureInIsMutable();
          in_.addAll(other.in_);
        }
        onChanged();
      }
      if (!other.notIn_.isEmpty()) {
        if (notIn_.isEmpty()) {
          notIn_ = other.notIn_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureNotInIsMutable();
          notIn_.addAll(other.notIn_);
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
      com.fluxninja.generated.validate.EnumRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fluxninja.generated.validate.EnumRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int const_ ;
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1 [json_name = "const"];</code>
     * @return Whether the const field is set.
     */
    @java.lang.Override
    public boolean hasConst() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1 [json_name = "const"];</code>
     * @return The const.
     */
    @java.lang.Override
    public int getConst() {
      return const_;
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1 [json_name = "const"];</code>
     * @param value The const to set.
     * @return This builder for chaining.
     */
    public Builder setConst(int value) {
      bitField0_ |= 0x00000001;
      const_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Const specifies that this field must be exactly the specified value
     * </pre>
     *
     * <code>optional int32 const = 1 [json_name = "const"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      const_ = 0;
      onChanged();
      return this;
    }

    private boolean definedOnly_ ;
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
     * @return Whether the definedOnly field is set.
     */
    @java.lang.Override
    public boolean hasDefinedOnly() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
     * @return The definedOnly.
     */
    @java.lang.Override
    public boolean getDefinedOnly() {
      return definedOnly_;
    }
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
     * @param value The definedOnly to set.
     * @return This builder for chaining.
     */
    public Builder setDefinedOnly(boolean value) {
      bitField0_ |= 0x00000002;
      definedOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DefinedOnly specifies that this field must be only one of the defined
     * values for this enum, failing on any undefined value.
     * </pre>
     *
     * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefinedOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      definedOnly_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList in_ = emptyIntList();
    private void ensureInIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        in_ = mutableCopy(in_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @return A list containing the in.
     */
    public java.util.List<java.lang.Integer>
        getInList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(in_) : in_;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @return The count of in.
     */
    public int getInCount() {
      return in_.size();
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @param index The index of the element to return.
     * @return The in at the given index.
     */
    public int getIn(int index) {
      return in_.getInt(index);
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @param index The index to set the value at.
     * @param value The in to set.
     * @return This builder for chaining.
     */
    public Builder setIn(
        int index, int value) {
      ensureInIsMutable();
      in_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @param value The in to add.
     * @return This builder for chaining.
     */
    public Builder addIn(int value) {
      ensureInIsMutable();
      in_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @param values The in to add.
     * @return This builder for chaining.
     */
    public Builder addAllIn(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureInIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, in_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * In specifies that this field must be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 in = 3 [json_name = "in"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIn() {
      in_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList notIn_ = emptyIntList();
    private void ensureNotInIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        notIn_ = mutableCopy(notIn_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @return A list containing the notIn.
     */
    public java.util.List<java.lang.Integer>
        getNotInList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(notIn_) : notIn_;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @return The count of notIn.
     */
    public int getNotInCount() {
      return notIn_.size();
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @param index The index of the element to return.
     * @return The notIn at the given index.
     */
    public int getNotIn(int index) {
      return notIn_.getInt(index);
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @param index The index to set the value at.
     * @param value The notIn to set.
     * @return This builder for chaining.
     */
    public Builder setNotIn(
        int index, int value) {
      ensureNotInIsMutable();
      notIn_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @param value The notIn to add.
     * @return This builder for chaining.
     */
    public Builder addNotIn(int value) {
      ensureNotInIsMutable();
      notIn_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @param values The notIn to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotIn(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureNotInIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notIn_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NotIn specifies that this field cannot be equal to one of the specified
     * values
     * </pre>
     *
     * <code>repeated int32 not_in = 4 [json_name = "notIn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotIn() {
      notIn_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:validate.EnumRules)
  }

  // @@protoc_insertion_point(class_scope:validate.EnumRules)
  private static final com.fluxninja.generated.validate.EnumRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fluxninja.generated.validate.EnumRules();
  }

  public static com.fluxninja.generated.validate.EnumRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<EnumRules>
      PARSER = new com.google.protobuf.AbstractParser<EnumRules>() {
    @java.lang.Override
    public EnumRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EnumRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnumRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnumRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fluxninja.generated.validate.EnumRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

