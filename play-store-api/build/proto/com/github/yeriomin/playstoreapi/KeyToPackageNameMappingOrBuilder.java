// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface KeyToPackageNameMappingOrBuilder
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

  // optional string uidName = 2;
  /**
   * <code>optional string uidName = 2;</code>
   */
  boolean hasUidName();
  /**
   * <code>optional string uidName = 2;</code>
   */
  java.lang.String getUidName();
  /**
   * <code>optional string uidName = 2;</code>
   */
  com.google.protobuf.ByteString
      getUidNameBytes();

  // repeated .PackageInfo sharedPackageList = 3;
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.PackageInfo> 
      getSharedPackageListList();
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  com.github.yeriomin.playstoreapi.PackageInfo getSharedPackageList(int index);
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  int getSharedPackageListCount();
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.PackageInfoOrBuilder> 
      getSharedPackageListOrBuilderList();
  /**
   * <code>repeated .PackageInfo sharedPackageList = 3;</code>
   */
  com.github.yeriomin.playstoreapi.PackageInfoOrBuilder getSharedPackageListOrBuilder(
      int index);
}