// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

package com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options;

/**
 * <pre>
 * `Scopes` is a representation of OpenAPI v2 specification's Scopes object.
 * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#scopesObject
 * Lists the available scopes for an OAuth2 security scheme.
 * </pre>
 *
 * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.Scopes}
 */
public final class Scopes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.gateway.protoc_gen_openapiv2.options.Scopes)
    ScopesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Scopes.newBuilder() to construct.
  private Scopes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Scopes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Scopes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Scopes(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              scope_ = com.google.protobuf.MapField.newMapField(
                  ScopeDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            scope__ = input.readMessage(
                ScopeDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            scope_.getMutableMap().put(
                scope__.getKey(), scope__.getValue());
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
    return com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Scopes_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetScope();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Scopes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.class, com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.Builder.class);
  }

  public static final int SCOPE_FIELD_NUMBER = 1;
  private static final class ScopeDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Scopes_ScopeEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> scope_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetScope() {
    if (scope_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ScopeDefaultEntryHolder.defaultEntry);
    }
    return scope_;
  }

  public int getScopeCount() {
    return internalGetScope().getMap().size();
  }
  /**
   * <pre>
   * Maps between a name of a scope to a short description of it (as the value
   * of the property).
   * </pre>
   *
   * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
   */

  @java.lang.Override
  public boolean containsScope(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetScope().getMap().containsKey(key);
  }
  /**
   * Use {@link #getScopeMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getScope() {
    return getScopeMap();
  }
  /**
   * <pre>
   * Maps between a name of a scope to a short description of it (as the value
   * of the property).
   * </pre>
   *
   * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getScopeMap() {
    return internalGetScope().getMap();
  }
  /**
   * <pre>
   * Maps between a name of a scope to a short description of it (as the value
   * of the property).
   * </pre>
   *
   * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
   */
  @java.lang.Override

  public java.lang.String getScopeOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetScope().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Maps between a name of a scope to a short description of it (as the value
   * of the property).
   * </pre>
   *
   * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
   */
  @java.lang.Override

  public java.lang.String getScopeOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetScope().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetScope(),
        ScopeDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetScope().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      scope__ = ScopeDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, scope__);
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
    if (!(obj instanceof com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes)) {
      return super.equals(obj);
    }
    com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes other = (com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes) obj;

    if (!internalGetScope().equals(
        other.internalGetScope())) return false;
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
    if (!internalGetScope().getMap().isEmpty()) {
      hash = (37 * hash) + SCOPE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetScope().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parseFrom(
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
  public static Builder newBuilder(com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes prototype) {
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
   * `Scopes` is a representation of OpenAPI v2 specification's Scopes object.
   * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#scopesObject
   * Lists the available scopes for an OAuth2 security scheme.
   * </pre>
   *
   * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.Scopes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.gateway.protoc_gen_openapiv2.options.Scopes)
      com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.ScopesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Scopes_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetScope();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableScope();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Scopes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.class, com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.Builder.class);
    }

    // Construct using com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.newBuilder()
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
      internalGetMutableScope().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Scopes_descriptor;
    }

    @java.lang.Override
    public com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes getDefaultInstanceForType() {
      return com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.getDefaultInstance();
    }

    @java.lang.Override
    public com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes build() {
      com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes buildPartial() {
      com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes result = new com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes(this);
      int from_bitField0_ = bitField0_;
      result.scope_ = internalGetScope();
      result.scope_.makeImmutable();
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
      if (other instanceof com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes) {
        return mergeFrom((com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes other) {
      if (other == com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes.getDefaultInstance()) return this;
      internalGetMutableScope().mergeFrom(
          other.internalGetScope());
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
      com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> scope_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetScope() {
      if (scope_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ScopeDefaultEntryHolder.defaultEntry);
      }
      return scope_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableScope() {
      onChanged();;
      if (scope_ == null) {
        scope_ = com.google.protobuf.MapField.newMapField(
            ScopeDefaultEntryHolder.defaultEntry);
      }
      if (!scope_.isMutable()) {
        scope_ = scope_.copy();
      }
      return scope_;
    }

    public int getScopeCount() {
      return internalGetScope().getMap().size();
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */

    @java.lang.Override
    public boolean containsScope(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetScope().getMap().containsKey(key);
    }
    /**
     * Use {@link #getScopeMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getScope() {
      return getScopeMap();
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getScopeMap() {
      return internalGetScope().getMap();
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */
    @java.lang.Override

    public java.lang.String getScopeOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetScope().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */
    @java.lang.Override

    public java.lang.String getScopeOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetScope().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearScope() {
      internalGetMutableScope().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */

    public Builder removeScope(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableScope().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableScope() {
      return internalGetMutableScope().getMutableMap();
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */
    public Builder putScope(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableScope().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Maps between a name of a scope to a short description of it (as the value
     * of the property).
     * </pre>
     *
     * <code>map&lt;string, string&gt; scope = 1 [json_name = "scope"];</code>
     */

    public Builder putAllScope(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableScope().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:grpc.gateway.protoc_gen_openapiv2.options.Scopes)
  }

  // @@protoc_insertion_point(class_scope:grpc.gateway.protoc_gen_openapiv2.options.Scopes)
  private static final com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes();
  }

  public static com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Scopes>
      PARSER = new com.google.protobuf.AbstractParser<Scopes>() {
    @java.lang.Override
    public Scopes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Scopes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Scopes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Scopes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fluxninja.generated.grpc.gateway.protoc_gen_openapiv2.options.Scopes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

