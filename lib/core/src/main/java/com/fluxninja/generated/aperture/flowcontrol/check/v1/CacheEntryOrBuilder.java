// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aperture/flowcontrol/check/v1/check.proto

package com.fluxninja.generated.aperture.flowcontrol.check.v1;

public interface CacheEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aperture.flowcontrol.check.v1.CacheEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>bytes value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <code>.google.protobuf.Duration ttl = 3 [json_name = "ttl"];</code>
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   * <code>.google.protobuf.Duration ttl = 3 [json_name = "ttl"];</code>
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   * <code>.google.protobuf.Duration ttl = 3 [json_name = "ttl"];</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();
}