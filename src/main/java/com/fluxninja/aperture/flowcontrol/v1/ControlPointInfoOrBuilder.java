// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aperture/flowcontrol/v1/flowcontrol.proto

package com.fluxninja.aperture.flowcontrol.v1;

public interface ControlPointInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aperture.flowcontrol.v1.ControlPointInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aperture.flowcontrol.v1.ControlPointInfo.Type type = 1[json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.aperture.flowcontrol.v1.ControlPointInfo.Type type = 1[json_name = "type"];</code>
   * @return The type.
   */
  com.fluxninja.aperture.flowcontrol.v1.ControlPointInfo.Type getType();

  /**
   * <code>string feature = 2[json_name = "feature"];</code>
   * @return The feature.
   */
  java.lang.String getFeature();
  /**
   * <code>string feature = 2[json_name = "feature"];</code>
   * @return The bytes for feature.
   */
  com.google.protobuf.ByteString
      getFeatureBytes();
}
