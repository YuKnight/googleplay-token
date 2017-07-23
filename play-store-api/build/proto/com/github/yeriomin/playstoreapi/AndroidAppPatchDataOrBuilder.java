// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface AndroidAppPatchDataOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 baseVersionCode = 1;
  /**
   * <code>optional int32 baseVersionCode = 1;</code>
   */
  boolean hasBaseVersionCode();
  /**
   * <code>optional int32 baseVersionCode = 1;</code>
   */
  int getBaseVersionCode();

  // optional string baseSignature = 2;
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  boolean hasBaseSignature();
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  java.lang.String getBaseSignature();
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  com.google.protobuf.ByteString
      getBaseSignatureBytes();

  // optional string downloadUrl = 3;
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  boolean hasDownloadUrl();
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  java.lang.String getDownloadUrl();
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  com.google.protobuf.ByteString
      getDownloadUrlBytes();

  // optional int32 patchFormat = 4;
  /**
   * <code>optional int32 patchFormat = 4;</code>
   */
  boolean hasPatchFormat();
  /**
   * <code>optional int32 patchFormat = 4;</code>
   */
  int getPatchFormat();

  // optional int64 maxPatchSize = 5;
  /**
   * <code>optional int64 maxPatchSize = 5;</code>
   */
  boolean hasMaxPatchSize();
  /**
   * <code>optional int64 maxPatchSize = 5;</code>
   */
  long getMaxPatchSize();
}
