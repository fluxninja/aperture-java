// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aperture/flowcontrol/check/v1/check.proto

package com.fluxninja.generated.aperture.flowcontrol.check.v1;

public interface CacheUpsertRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aperture.flowcontrol.check.v1.CacheUpsertRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string control_point = 1 [json_name = "controlPoint"];</code>
   * @return The controlPoint.
   */
  java.lang.String getControlPoint();
  /**
   * <code>string control_point = 1 [json_name = "controlPoint"];</code>
   * @return The bytes for controlPoint.
   */
  com.google.protobuf.ByteString
      getControlPointBytes();

  /**
   * <code>.aperture.flowcontrol.check.v1.CacheEntry result_cache_entry = 2 [json_name = "resultCacheEntry"];</code>
   * @return Whether the resultCacheEntry field is set.
   */
  boolean hasResultCacheEntry();
  /**
   * <code>.aperture.flowcontrol.check.v1.CacheEntry result_cache_entry = 2 [json_name = "resultCacheEntry"];</code>
   * @return The resultCacheEntry.
   */
  com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntry getResultCacheEntry();
  /**
   * <code>.aperture.flowcontrol.check.v1.CacheEntry result_cache_entry = 2 [json_name = "resultCacheEntry"];</code>
   */
  com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntryOrBuilder getResultCacheEntryOrBuilder();

  /**
   * <code>map&lt;string, .aperture.flowcontrol.check.v1.CacheEntry&gt; global_cache_entries = 3 [json_name = "globalCacheEntries"];</code>
   */
  int getGlobalCacheEntriesCount();
  /**
   * <code>map&lt;string, .aperture.flowcontrol.check.v1.CacheEntry&gt; global_cache_entries = 3 [json_name = "globalCacheEntries"];</code>
   */
  boolean containsGlobalCacheEntries(
      java.lang.String key);
  /**
   * Use {@link #getGlobalCacheEntriesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntry>
  getGlobalCacheEntries();
  /**
   * <code>map&lt;string, .aperture.flowcontrol.check.v1.CacheEntry&gt; global_cache_entries = 3 [json_name = "globalCacheEntries"];</code>
   */
  java.util.Map<java.lang.String, com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntry>
  getGlobalCacheEntriesMap();
  /**
   * <code>map&lt;string, .aperture.flowcontrol.check.v1.CacheEntry&gt; global_cache_entries = 3 [json_name = "globalCacheEntries"];</code>
   */
  /* nullable */
com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntry getGlobalCacheEntriesOrDefault(
      java.lang.String key,
      /* nullable */
com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntry defaultValue);
  /**
   * <code>map&lt;string, .aperture.flowcontrol.check.v1.CacheEntry&gt; global_cache_entries = 3 [json_name = "globalCacheEntries"];</code>
   */
  com.fluxninja.generated.aperture.flowcontrol.check.v1.CacheEntry getGlobalCacheEntriesOrThrow(
      java.lang.String key);
}
