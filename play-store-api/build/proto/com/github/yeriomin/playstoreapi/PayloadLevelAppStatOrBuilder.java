// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface PayloadLevelAppStatOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 packageKey = 1;
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  boolean hasPackageKey();
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  int getPackageKey();

  // optional int32 applicationTag = 2;
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  boolean hasApplicationTag();
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  int getApplicationTag();

  // repeated .AppBucket payloadLevelAppBucket = 3;
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.AppBucket> 
      getPayloadLevelAppBucketList();
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  com.github.yeriomin.playstoreapi.AppBucket getPayloadLevelAppBucket(int index);
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  int getPayloadLevelAppBucketCount();
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.AppBucketOrBuilder> 
      getPayloadLevelAppBucketOrBuilderList();
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  com.github.yeriomin.playstoreapi.AppBucketOrBuilder getPayloadLevelAppBucketOrBuilder(
      int index);
}
