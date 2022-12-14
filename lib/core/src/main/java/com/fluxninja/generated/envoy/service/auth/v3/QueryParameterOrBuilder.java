// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v3/authz_stripped.proto

package com.fluxninja.generated.envoy.service.auth.v3;

public interface QueryParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.auth.v3.QueryParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key of the query parameter. Case sensitive.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key", (.validate.rules) = { ... }</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The key of the query parameter. Case sensitive.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key", (.validate.rules) = { ... }</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The value of the query parameter.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The value of the query parameter.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
