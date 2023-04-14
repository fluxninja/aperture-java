// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aperture/flowcontrol/checkhttp/v1/checkhttp.proto

package com.fluxninja.generated.aperture.flowcontrol.checkhttp.v1;

public interface DeniedHttpResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aperture.flowcontrol.checkhttp.v1.DeniedHttpResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This field allows the authorization service to send an HTTP response status code to the
   * downstream client. If not set, Envoy sends `403 Forbidden` HTTP status code by default.
   * </pre>
   *
   * <code>int32 status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * This field allows the authorization service to send HTTP response headers
   * to the downstream client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [json_name = "headers"];</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * This field allows the authorization service to send HTTP response headers
   * to the downstream client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [json_name = "headers"];</code>
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
   * This field allows the authorization service to send HTTP response headers
   * to the downstream client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [json_name = "headers"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <pre>
   * This field allows the authorization service to send HTTP response headers
   * to the downstream client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [json_name = "headers"];</code>
   */
  /* nullable */
java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * This field allows the authorization service to send HTTP response headers
   * to the downstream client.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [json_name = "headers"];</code>
   */
  java.lang.String getHeadersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * This field allows the authorization service to send a response body data
   * to the downstream client.
   * </pre>
   *
   * <code>string body = 3 [json_name = "body"];</code>
   * @return The body.
   */
  java.lang.String getBody();
  /**
   * <pre>
   * This field allows the authorization service to send a response body data
   * to the downstream client.
   * </pre>
   *
   * <code>string body = 3 [json_name = "body"];</code>
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString
      getBodyBytes();
}
