// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface DebugInfoOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // repeated string message = 1;
  /**
   * <code>repeated string message = 1;</code>
   */
  java.util.List<java.lang.String>
  getMessageList();
  /**
   * <code>repeated string message = 1;</code>
   */
  int getMessageCount();
  /**
   * <code>repeated string message = 1;</code>
   */
  java.lang.String getMessage(int index);
  /**
   * <code>repeated string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes(int index);

  // repeated group Timing = 2 {
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.DebugInfo.Timing> 
      getTimingList();
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.DebugInfo.Timing getTiming(int index);
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  int getTimingCount();
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.DebugInfo.TimingOrBuilder> 
      getTimingOrBuilderList();
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.DebugInfo.TimingOrBuilder getTimingOrBuilder(
      int index);
}