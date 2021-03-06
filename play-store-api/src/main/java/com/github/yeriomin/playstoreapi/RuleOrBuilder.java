// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface RuleOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional bool negate = 1;
  /**
   * <code>optional bool negate = 1;</code>
   */
  boolean hasNegate();
  /**
   * <code>optional bool negate = 1;</code>
   */
  boolean getNegate();

  // optional int32 operator = 2;
  /**
   * <code>optional int32 operator = 2;</code>
   */
  boolean hasOperator();
  /**
   * <code>optional int32 operator = 2;</code>
   */
  int getOperator();

  // optional int32 key = 3;
  /**
   * <code>optional int32 key = 3;</code>
   */
  boolean hasKey();
  /**
   * <code>optional int32 key = 3;</code>
   */
  int getKey();

  // repeated string stringArg = 4;
  /**
   * <code>repeated string stringArg = 4;</code>
   */
  java.util.List<java.lang.String>
  getStringArgList();
  /**
   * <code>repeated string stringArg = 4;</code>
   */
  int getStringArgCount();
  /**
   * <code>repeated string stringArg = 4;</code>
   */
  java.lang.String getStringArg(int index);
  /**
   * <code>repeated string stringArg = 4;</code>
   */
  com.google.protobuf.ByteString
      getStringArgBytes(int index);

  // repeated int64 longArg = 5;
  /**
   * <code>repeated int64 longArg = 5;</code>
   */
  java.util.List<java.lang.Long> getLongArgList();
  /**
   * <code>repeated int64 longArg = 5;</code>
   */
  int getLongArgCount();
  /**
   * <code>repeated int64 longArg = 5;</code>
   */
  long getLongArg(int index);

  // repeated double doubleArg = 6;
  /**
   * <code>repeated double doubleArg = 6;</code>
   */
  java.util.List<java.lang.Double> getDoubleArgList();
  /**
   * <code>repeated double doubleArg = 6;</code>
   */
  int getDoubleArgCount();
  /**
   * <code>repeated double doubleArg = 6;</code>
   */
  double getDoubleArg(int index);

  // repeated .Rule subrule = 7;
  /**
   * <code>repeated .Rule subrule = 7;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Rule> 
      getSubruleList();
  /**
   * <code>repeated .Rule subrule = 7;</code>
   */
  com.github.yeriomin.playstoreapi.Rule getSubrule(int index);
  /**
   * <code>repeated .Rule subrule = 7;</code>
   */
  int getSubruleCount();
  /**
   * <code>repeated .Rule subrule = 7;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.RuleOrBuilder> 
      getSubruleOrBuilderList();
  /**
   * <code>repeated .Rule subrule = 7;</code>
   */
  com.github.yeriomin.playstoreapi.RuleOrBuilder getSubruleOrBuilder(
      int index);

  // optional int32 responseCode = 8;
  /**
   * <code>optional int32 responseCode = 8;</code>
   */
  boolean hasResponseCode();
  /**
   * <code>optional int32 responseCode = 8;</code>
   */
  int getResponseCode();

  // optional string comment = 9;
  /**
   * <code>optional string comment = 9;</code>
   */
  boolean hasComment();
  /**
   * <code>optional string comment = 9;</code>
   */
  java.lang.String getComment();
  /**
   * <code>optional string comment = 9;</code>
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  // repeated fixed64 stringArgHash = 10;
  /**
   * <code>repeated fixed64 stringArgHash = 10;</code>
   */
  java.util.List<java.lang.Long> getStringArgHashList();
  /**
   * <code>repeated fixed64 stringArgHash = 10;</code>
   */
  int getStringArgHashCount();
  /**
   * <code>repeated fixed64 stringArgHash = 10;</code>
   */
  long getStringArgHash(int index);

  // repeated int32 constArg = 11;
  /**
   * <code>repeated int32 constArg = 11;</code>
   */
  java.util.List<java.lang.Integer> getConstArgList();
  /**
   * <code>repeated int32 constArg = 11;</code>
   */
  int getConstArgCount();
  /**
   * <code>repeated int32 constArg = 11;</code>
   */
  int getConstArg(int index);
}
