// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v3/authz_stripped.proto

package com.fluxninja.generated.envoy.service.auth.v3;

public interface CheckRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.auth.v3.CheckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The request attributes.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext attributes = 1 [json_name = "attributes"];</code>
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   * <pre>
   * The request attributes.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext attributes = 1 [json_name = "attributes"];</code>
   * @return The attributes.
   */
  com.fluxninja.generated.envoy.service.auth.v3.AttributeContext getAttributes();
  /**
   * <pre>
   * The request attributes.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext attributes = 1 [json_name = "attributes"];</code>
   */
  com.fluxninja.generated.envoy.service.auth.v3.AttributeContextOrBuilder getAttributesOrBuilder();
}
