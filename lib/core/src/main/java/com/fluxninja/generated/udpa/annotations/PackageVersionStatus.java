// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: udpa/annotations/status.proto

package com.fluxninja.generated.udpa.annotations;

/**
 * Protobuf enum {@code udpa.annotations.PackageVersionStatus}
 */
public enum PackageVersionStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown package version status.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * This version of the package is frozen.
   * </pre>
   *
   * <code>FROZEN = 1;</code>
   */
  FROZEN(1),
  /**
   * <pre>
   * This version of the package is the active development version.
   * </pre>
   *
   * <code>ACTIVE = 2;</code>
   */
  ACTIVE(2),
  /**
   * <pre>
   * This version of the package is the candidate for the next major version. It
   * is typically machine generated from the active development version.
   * </pre>
   *
   * <code>NEXT_MAJOR_VERSION_CANDIDATE = 3;</code>
   */
  NEXT_MAJOR_VERSION_CANDIDATE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown package version status.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * This version of the package is frozen.
   * </pre>
   *
   * <code>FROZEN = 1;</code>
   */
  public static final int FROZEN_VALUE = 1;
  /**
   * <pre>
   * This version of the package is the active development version.
   * </pre>
   *
   * <code>ACTIVE = 2;</code>
   */
  public static final int ACTIVE_VALUE = 2;
  /**
   * <pre>
   * This version of the package is the candidate for the next major version. It
   * is typically machine generated from the active development version.
   * </pre>
   *
   * <code>NEXT_MAJOR_VERSION_CANDIDATE = 3;</code>
   */
  public static final int NEXT_MAJOR_VERSION_CANDIDATE_VALUE = 3;


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
  public static PackageVersionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PackageVersionStatus forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return FROZEN;
      case 2: return ACTIVE;
      case 3: return NEXT_MAJOR_VERSION_CANDIDATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PackageVersionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PackageVersionStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PackageVersionStatus>() {
          public PackageVersionStatus findValueByNumber(int number) {
            return PackageVersionStatus.forNumber(number);
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
    return com.fluxninja.generated.udpa.annotations.StatusProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PackageVersionStatus[] VALUES = values();

  public static PackageVersionStatus valueOf(
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

  private PackageVersionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:udpa.annotations.PackageVersionStatus)
}

