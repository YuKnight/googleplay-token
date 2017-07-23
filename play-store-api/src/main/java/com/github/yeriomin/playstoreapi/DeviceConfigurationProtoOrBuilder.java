// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface DeviceConfigurationProtoOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 touchScreen = 1;
  /**
   * <code>optional int32 touchScreen = 1;</code>
   */
  boolean hasTouchScreen();
  /**
   * <code>optional int32 touchScreen = 1;</code>
   */
  int getTouchScreen();

  // optional int32 keyboard = 2;
  /**
   * <code>optional int32 keyboard = 2;</code>
   */
  boolean hasKeyboard();
  /**
   * <code>optional int32 keyboard = 2;</code>
   */
  int getKeyboard();

  // optional int32 navigation = 3;
  /**
   * <code>optional int32 navigation = 3;</code>
   */
  boolean hasNavigation();
  /**
   * <code>optional int32 navigation = 3;</code>
   */
  int getNavigation();

  // optional int32 screenLayout = 4;
  /**
   * <code>optional int32 screenLayout = 4;</code>
   */
  boolean hasScreenLayout();
  /**
   * <code>optional int32 screenLayout = 4;</code>
   */
  int getScreenLayout();

  // optional bool hasHardKeyboard = 5;
  /**
   * <code>optional bool hasHardKeyboard = 5;</code>
   */
  boolean hasHasHardKeyboard();
  /**
   * <code>optional bool hasHardKeyboard = 5;</code>
   */
  boolean getHasHardKeyboard();

  // optional bool hasFiveWayNavigation = 6;
  /**
   * <code>optional bool hasFiveWayNavigation = 6;</code>
   */
  boolean hasHasFiveWayNavigation();
  /**
   * <code>optional bool hasFiveWayNavigation = 6;</code>
   */
  boolean getHasFiveWayNavigation();

  // optional int32 screenDensity = 7;
  /**
   * <code>optional int32 screenDensity = 7;</code>
   */
  boolean hasScreenDensity();
  /**
   * <code>optional int32 screenDensity = 7;</code>
   */
  int getScreenDensity();

  // optional int32 glEsVersion = 8;
  /**
   * <code>optional int32 glEsVersion = 8;</code>
   */
  boolean hasGlEsVersion();
  /**
   * <code>optional int32 glEsVersion = 8;</code>
   */
  int getGlEsVersion();

  // repeated string systemSharedLibrary = 9;
  /**
   * <code>repeated string systemSharedLibrary = 9;</code>
   */
  java.util.List<java.lang.String>
  getSystemSharedLibraryList();
  /**
   * <code>repeated string systemSharedLibrary = 9;</code>
   */
  int getSystemSharedLibraryCount();
  /**
   * <code>repeated string systemSharedLibrary = 9;</code>
   */
  java.lang.String getSystemSharedLibrary(int index);
  /**
   * <code>repeated string systemSharedLibrary = 9;</code>
   */
  com.google.protobuf.ByteString
      getSystemSharedLibraryBytes(int index);

  // repeated string systemAvailableFeature = 10;
  /**
   * <code>repeated string systemAvailableFeature = 10;</code>
   */
  java.util.List<java.lang.String>
  getSystemAvailableFeatureList();
  /**
   * <code>repeated string systemAvailableFeature = 10;</code>
   */
  int getSystemAvailableFeatureCount();
  /**
   * <code>repeated string systemAvailableFeature = 10;</code>
   */
  java.lang.String getSystemAvailableFeature(int index);
  /**
   * <code>repeated string systemAvailableFeature = 10;</code>
   */
  com.google.protobuf.ByteString
      getSystemAvailableFeatureBytes(int index);

  // repeated string nativePlatform = 11;
  /**
   * <code>repeated string nativePlatform = 11;</code>
   */
  java.util.List<java.lang.String>
  getNativePlatformList();
  /**
   * <code>repeated string nativePlatform = 11;</code>
   */
  int getNativePlatformCount();
  /**
   * <code>repeated string nativePlatform = 11;</code>
   */
  java.lang.String getNativePlatform(int index);
  /**
   * <code>repeated string nativePlatform = 11;</code>
   */
  com.google.protobuf.ByteString
      getNativePlatformBytes(int index);

  // optional int32 screenWidth = 12;
  /**
   * <code>optional int32 screenWidth = 12;</code>
   */
  boolean hasScreenWidth();
  /**
   * <code>optional int32 screenWidth = 12;</code>
   */
  int getScreenWidth();

  // optional int32 screenHeight = 13;
  /**
   * <code>optional int32 screenHeight = 13;</code>
   */
  boolean hasScreenHeight();
  /**
   * <code>optional int32 screenHeight = 13;</code>
   */
  int getScreenHeight();

  // repeated string systemSupportedLocale = 14;
  /**
   * <code>repeated string systemSupportedLocale = 14;</code>
   */
  java.util.List<java.lang.String>
  getSystemSupportedLocaleList();
  /**
   * <code>repeated string systemSupportedLocale = 14;</code>
   */
  int getSystemSupportedLocaleCount();
  /**
   * <code>repeated string systemSupportedLocale = 14;</code>
   */
  java.lang.String getSystemSupportedLocale(int index);
  /**
   * <code>repeated string systemSupportedLocale = 14;</code>
   */
  com.google.protobuf.ByteString
      getSystemSupportedLocaleBytes(int index);

  // repeated string glExtension = 15;
  /**
   * <code>repeated string glExtension = 15;</code>
   */
  java.util.List<java.lang.String>
  getGlExtensionList();
  /**
   * <code>repeated string glExtension = 15;</code>
   */
  int getGlExtensionCount();
  /**
   * <code>repeated string glExtension = 15;</code>
   */
  java.lang.String getGlExtension(int index);
  /**
   * <code>repeated string glExtension = 15;</code>
   */
  com.google.protobuf.ByteString
      getGlExtensionBytes(int index);

  // optional int32 deviceClass = 16;
  /**
   * <code>optional int32 deviceClass = 16;</code>
   */
  boolean hasDeviceClass();
  /**
   * <code>optional int32 deviceClass = 16;</code>
   */
  int getDeviceClass();

  // optional int32 maxApkDownloadSizeMb = 17;
  /**
   * <code>optional int32 maxApkDownloadSizeMb = 17;</code>
   */
  boolean hasMaxApkDownloadSizeMb();
  /**
   * <code>optional int32 maxApkDownloadSizeMb = 17;</code>
   */
  int getMaxApkDownloadSizeMb();
}
