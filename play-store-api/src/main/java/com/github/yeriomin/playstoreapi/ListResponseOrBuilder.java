// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface ListResponseOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // repeated .Bucket bucket = 1;
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Bucket> 
      getBucketList();
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  com.github.yeriomin.playstoreapi.Bucket getBucket(int index);
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  int getBucketCount();
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.BucketOrBuilder> 
      getBucketOrBuilderList();
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  com.github.yeriomin.playstoreapi.BucketOrBuilder getBucketOrBuilder(
      int index);

  // repeated .DocV2 doc = 2;
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.DocV2> 
      getDocList();
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  com.github.yeriomin.playstoreapi.DocV2 getDoc(int index);
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  int getDocCount();
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.DocV2OrBuilder> 
      getDocOrBuilderList();
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  com.github.yeriomin.playstoreapi.DocV2OrBuilder getDocOrBuilder(
      int index);
}
