// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface AppFileMetadataOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 fileType = 1;
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  boolean hasFileType();
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  int getFileType();

  // optional int32 versionCode = 2;
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  boolean hasVersionCode();
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  int getVersionCode();

  // optional int64 size = 3;
  /**
   * <code>optional int64 size = 3;</code>
   */
  boolean hasSize();
  /**
   * <code>optional int64 size = 3;</code>
   */
  long getSize();

  // optional string downloadUrl = 4;
  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  boolean hasDownloadUrl();
  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  java.lang.String getDownloadUrl();
  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  com.google.protobuf.ByteString
      getDownloadUrlBytes();
}
