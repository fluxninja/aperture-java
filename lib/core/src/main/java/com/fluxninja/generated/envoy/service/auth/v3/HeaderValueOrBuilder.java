// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v3/authz_stripped.proto

package com.fluxninja.generated.envoy.service.auth.v3;

public interface HeaderValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.auth.v3.HeaderValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Header name.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key", (.validate.rules) = { ... }</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Header name.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key", (.validate.rules) = { ... }</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Header value.
   * The same :ref:`format specifier &lt;config_access_log_format&gt;` as used for
   * :ref:`HTTP access logging &lt;config_access_log&gt;` applies here, however
   * unknown header values are replaced with the empty string instead of ``-``.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value", (.validate.rules) = { ... }</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Header value.
   * The same :ref:`format specifier &lt;config_access_log_format&gt;` as used for
   * :ref:`HTTP access logging &lt;config_access_log&gt;` applies here, however
   * unknown header values are replaced with the empty string instead of ``-``.
   * </pre>
   *
   * <code>string value = 2 [json_name = "value", (.validate.rules) = { ... }</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
