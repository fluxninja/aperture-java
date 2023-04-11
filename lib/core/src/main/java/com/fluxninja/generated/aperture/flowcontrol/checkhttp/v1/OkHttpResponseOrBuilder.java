// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aperture/flowcontrol/checkhttp/v1/checkhttp.proto

package com.fluxninja.generated.aperture.flowcontrol.checkhttp.v1;

public interface OkHttpResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aperture.flowcontrol.checkhttp.v1.OkHttpResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * HTTP entity headers in addition to the original request headers.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 1 [json_name = "headers"];</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * HTTP entity headers in addition to the original request headers.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 1 [json_name = "headers"];</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <pre>
   * HTTP entity headers in addition to the original request headers.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 1 [json_name = "headers"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <pre>
   * HTTP entity headers in addition to the original request headers.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 1 [json_name = "headers"];</code>
   */

  /* nullable */
java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * HTTP entity headers in addition to the original request headers.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 1 [json_name = "headers"];</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);

  /**
   * <code>.google.protobuf.Struct dynamic_metadata = 2 [json_name = "dynamicMetadata"];</code>
   * @return Whether the dynamicMetadata field is set.
   */
  boolean hasDynamicMetadata();
  /**
   * <code>.google.protobuf.Struct dynamic_metadata = 2 [json_name = "dynamicMetadata"];</code>
   * @return The dynamicMetadata.
   */
  com.google.protobuf.Struct getDynamicMetadata();
  /**
   * <code>.google.protobuf.Struct dynamic_metadata = 2 [json_name = "dynamicMetadata"];</code>
   */
  com.google.protobuf.StructOrBuilder getDynamicMetadataOrBuilder();
}