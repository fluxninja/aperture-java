// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v3/authz_stripped.proto

package com.fluxninja.generated.envoy.service.auth.v3;

/**
 * <pre>
 * The address represents an envoy internal listener.
 * [#comment: TODO(asraa): When address available, remove workaround from test/server/server_fuzz_test.cc:30.]
 * </pre>
 *
 * Protobuf type {@code envoy.service.auth.v3.EnvoyInternalAddress}
 */
public final class EnvoyInternalAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.auth.v3.EnvoyInternalAddress)
    EnvoyInternalAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnvoyInternalAddress.newBuilder() to construct.
  private EnvoyInternalAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnvoyInternalAddress() {
    endpointId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnvoyInternalAddress();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EnvoyInternalAddress(
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
            java.lang.String s = input.readStringRequireUtf8();
            addressNameSpecifierCase_ = 1;
            addressNameSpecifier_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            endpointId_ = s;
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
    return com.fluxninja.generated.envoy.service.auth.v3.AuthzStrippedProto.internal_static_envoy_service_auth_v3_EnvoyInternalAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fluxninja.generated.envoy.service.auth.v3.AuthzStrippedProto.internal_static_envoy_service_auth_v3_EnvoyInternalAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.class, com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.Builder.class);
  }

  private int addressNameSpecifierCase_ = 0;
  private java.lang.Object addressNameSpecifier_;
  public enum AddressNameSpecifierCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SERVER_LISTENER_NAME(1),
    ADDRESSNAMESPECIFIER_NOT_SET(0);
    private final int value;
    private AddressNameSpecifierCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AddressNameSpecifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static AddressNameSpecifierCase forNumber(int value) {
      switch (value) {
        case 1: return SERVER_LISTENER_NAME;
        case 0: return ADDRESSNAMESPECIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AddressNameSpecifierCase
  getAddressNameSpecifierCase() {
    return AddressNameSpecifierCase.forNumber(
        addressNameSpecifierCase_);
  }

  public static final int SERVER_LISTENER_NAME_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
   * internal listener.
   * </pre>
   *
   * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
   * @return Whether the serverListenerName field is set.
   */
  public boolean hasServerListenerName() {
    return addressNameSpecifierCase_ == 1;
  }
  /**
   * <pre>
   * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
   * internal listener.
   * </pre>
   *
   * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
   * @return The serverListenerName.
   */
  public java.lang.String getServerListenerName() {
    java.lang.Object ref = "";
    if (addressNameSpecifierCase_ == 1) {
      ref = addressNameSpecifier_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (addressNameSpecifierCase_ == 1) {
        addressNameSpecifier_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
   * internal listener.
   * </pre>
   *
   * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
   * @return The bytes for serverListenerName.
   */
  public com.google.protobuf.ByteString
      getServerListenerNameBytes() {
    java.lang.Object ref = "";
    if (addressNameSpecifierCase_ == 1) {
      ref = addressNameSpecifier_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (addressNameSpecifierCase_ == 1) {
        addressNameSpecifier_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPOINT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object endpointId_;
  /**
   * <pre>
   * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
   * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
   * example, may be set to the final destination IP for the target internal listener.
   * </pre>
   *
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The endpointId.
   */
  @java.lang.Override
  public java.lang.String getEndpointId() {
    java.lang.Object ref = endpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpointId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
   * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
   * example, may be set to the final destination IP for the target internal listener.
   * </pre>
   *
   * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
   * @return The bytes for endpointId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndpointIdBytes() {
    java.lang.Object ref = endpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endpointId_ = b;
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
    if (addressNameSpecifierCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addressNameSpecifier_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpointId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, endpointId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (addressNameSpecifierCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addressNameSpecifier_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpointId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, endpointId_);
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
    if (!(obj instanceof com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress)) {
      return super.equals(obj);
    }
    com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress other = (com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress) obj;

    if (!getEndpointId()
        .equals(other.getEndpointId())) return false;
    if (!getAddressNameSpecifierCase().equals(other.getAddressNameSpecifierCase())) return false;
    switch (addressNameSpecifierCase_) {
      case 1:
        if (!getServerListenerName()
            .equals(other.getServerListenerName())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + ENDPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEndpointId().hashCode();
    switch (addressNameSpecifierCase_) {
      case 1:
        hash = (37 * hash) + SERVER_LISTENER_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getServerListenerName().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parseFrom(
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
  public static Builder newBuilder(com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress prototype) {
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
   * The address represents an envoy internal listener.
   * [#comment: TODO(asraa): When address available, remove workaround from test/server/server_fuzz_test.cc:30.]
   * </pre>
   *
   * Protobuf type {@code envoy.service.auth.v3.EnvoyInternalAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.auth.v3.EnvoyInternalAddress)
      com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fluxninja.generated.envoy.service.auth.v3.AuthzStrippedProto.internal_static_envoy_service_auth_v3_EnvoyInternalAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fluxninja.generated.envoy.service.auth.v3.AuthzStrippedProto.internal_static_envoy_service_auth_v3_EnvoyInternalAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.class, com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.Builder.class);
    }

    // Construct using com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.newBuilder()
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
      endpointId_ = "";

      addressNameSpecifierCase_ = 0;
      addressNameSpecifier_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fluxninja.generated.envoy.service.auth.v3.AuthzStrippedProto.internal_static_envoy_service_auth_v3_EnvoyInternalAddress_descriptor;
    }

    @java.lang.Override
    public com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress getDefaultInstanceForType() {
      return com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress build() {
      com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress buildPartial() {
      com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress result = new com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress(this);
      if (addressNameSpecifierCase_ == 1) {
        result.addressNameSpecifier_ = addressNameSpecifier_;
      }
      result.endpointId_ = endpointId_;
      result.addressNameSpecifierCase_ = addressNameSpecifierCase_;
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
      if (other instanceof com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress) {
        return mergeFrom((com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress other) {
      if (other == com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress.getDefaultInstance()) return this;
      if (!other.getEndpointId().isEmpty()) {
        endpointId_ = other.endpointId_;
        onChanged();
      }
      switch (other.getAddressNameSpecifierCase()) {
        case SERVER_LISTENER_NAME: {
          addressNameSpecifierCase_ = 1;
          addressNameSpecifier_ = other.addressNameSpecifier_;
          onChanged();
          break;
        }
        case ADDRESSNAMESPECIFIER_NOT_SET: {
          break;
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
      com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int addressNameSpecifierCase_ = 0;
    private java.lang.Object addressNameSpecifier_;
    public AddressNameSpecifierCase
        getAddressNameSpecifierCase() {
      return AddressNameSpecifierCase.forNumber(
          addressNameSpecifierCase_);
    }

    public Builder clearAddressNameSpecifier() {
      addressNameSpecifierCase_ = 0;
      addressNameSpecifier_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
     * internal listener.
     * </pre>
     *
     * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
     * @return Whether the serverListenerName field is set.
     */
    @java.lang.Override
    public boolean hasServerListenerName() {
      return addressNameSpecifierCase_ == 1;
    }
    /**
     * <pre>
     * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
     * internal listener.
     * </pre>
     *
     * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
     * @return The serverListenerName.
     */
    @java.lang.Override
    public java.lang.String getServerListenerName() {
      java.lang.Object ref = "";
      if (addressNameSpecifierCase_ == 1) {
        ref = addressNameSpecifier_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (addressNameSpecifierCase_ == 1) {
          addressNameSpecifier_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
     * internal listener.
     * </pre>
     *
     * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
     * @return The bytes for serverListenerName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerListenerNameBytes() {
      java.lang.Object ref = "";
      if (addressNameSpecifierCase_ == 1) {
        ref = addressNameSpecifier_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (addressNameSpecifierCase_ == 1) {
          addressNameSpecifier_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
     * internal listener.
     * </pre>
     *
     * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
     * @param value The serverListenerName to set.
     * @return This builder for chaining.
     */
    public Builder setServerListenerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  addressNameSpecifierCase_ = 1;
      addressNameSpecifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
     * internal listener.
     * </pre>
     *
     * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearServerListenerName() {
      if (addressNameSpecifierCase_ == 1) {
        addressNameSpecifierCase_ = 0;
        addressNameSpecifier_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies the :ref:`name &lt;envoy_v3_api_field_config.listener.v3.Listener.name&gt;` of the
     * internal listener.
     * </pre>
     *
     * <code>string server_listener_name = 1 [json_name = "serverListenerName"];</code>
     * @param value The bytes for serverListenerName to set.
     * @return This builder for chaining.
     */
    public Builder setServerListenerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      addressNameSpecifierCase_ = 1;
      addressNameSpecifier_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endpointId_ = "";
    /**
     * <pre>
     * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
     * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
     * example, may be set to the final destination IP for the target internal listener.
     * </pre>
     *
     * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
     * @return The endpointId.
     */
    public java.lang.String getEndpointId() {
      java.lang.Object ref = endpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
     * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
     * example, may be set to the final destination IP for the target internal listener.
     * </pre>
     *
     * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
     * @return The bytes for endpointId.
     */
    public com.google.protobuf.ByteString
        getEndpointIdBytes() {
      java.lang.Object ref = endpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
     * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
     * example, may be set to the final destination IP for the target internal listener.
     * </pre>
     *
     * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
     * @param value The endpointId to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endpointId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
     * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
     * example, may be set to the final destination IP for the target internal listener.
     * </pre>
     *
     * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpointId() {
      
      endpointId_ = getDefaultInstance().getEndpointId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies an endpoint identifier to distinguish between multiple endpoints for the same internal listener in a
     * single upstream pool. Only used in the upstream addresses for tracking changes to individual endpoints. This, for
     * example, may be set to the final destination IP for the target internal listener.
     * </pre>
     *
     * <code>string endpoint_id = 2 [json_name = "endpointId"];</code>
     * @param value The bytes for endpointId to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endpointId_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.auth.v3.EnvoyInternalAddress)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.auth.v3.EnvoyInternalAddress)
  private static final com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress();
  }

  public static com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnvoyInternalAddress>
      PARSER = new com.google.protobuf.AbstractParser<EnvoyInternalAddress>() {
    @java.lang.Override
    public EnvoyInternalAddress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EnvoyInternalAddress(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnvoyInternalAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnvoyInternalAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fluxninja.generated.envoy.service.auth.v3.EnvoyInternalAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

