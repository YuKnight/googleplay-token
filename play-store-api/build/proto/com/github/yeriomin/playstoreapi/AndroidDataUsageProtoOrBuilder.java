// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface AndroidDataUsageProtoOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 version = 1;
  /**
   * <code>optional int32 version = 1;</code>
   */
  boolean hasVersion();
  /**
   * <code>optional int32 version = 1;</code>
   */
  int getVersion();

  // optional int64 currentReportMsec = 2;
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  boolean hasCurrentReportMsec();
  /**
   * <code>optional int64 currentReportMsec = 2;</code>
   */
  long getCurrentReportMsec();

  // repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.KeyToPackageNameMapping> 
      getKeyToPackageNameMappingList();
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  com.github.yeriomin.playstoreapi.KeyToPackageNameMapping getKeyToPackageNameMapping(int index);
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  int getKeyToPackageNameMappingCount();
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.KeyToPackageNameMappingOrBuilder> 
      getKeyToPackageNameMappingOrBuilderList();
  /**
   * <code>repeated .KeyToPackageNameMapping keyToPackageNameMapping = 3;</code>
   */
  com.github.yeriomin.playstoreapi.KeyToPackageNameMappingOrBuilder getKeyToPackageNameMappingOrBuilder(
      int index);

  // repeated .PayloadLevelAppStat payloadLevelAppStat = 4;
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.PayloadLevelAppStat> 
      getPayloadLevelAppStatList();
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  com.github.yeriomin.playstoreapi.PayloadLevelAppStat getPayloadLevelAppStat(int index);
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  int getPayloadLevelAppStatCount();
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.PayloadLevelAppStatOrBuilder> 
      getPayloadLevelAppStatOrBuilderList();
  /**
   * <code>repeated .PayloadLevelAppStat payloadLevelAppStat = 4;</code>
   */
  com.github.yeriomin.playstoreapi.PayloadLevelAppStatOrBuilder getPayloadLevelAppStatOrBuilder(
      int index);

  // repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.IpLayerNetworkStat> 
      getIpLayerNetworkStatList();
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  com.github.yeriomin.playstoreapi.IpLayerNetworkStat getIpLayerNetworkStat(int index);
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  int getIpLayerNetworkStatCount();
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.IpLayerNetworkStatOrBuilder> 
      getIpLayerNetworkStatOrBuilderList();
  /**
   * <code>repeated .IpLayerNetworkStat ipLayerNetworkStat = 5;</code>
   */
  com.github.yeriomin.playstoreapi.IpLayerNetworkStatOrBuilder getIpLayerNetworkStatOrBuilder(
      int index);
}
