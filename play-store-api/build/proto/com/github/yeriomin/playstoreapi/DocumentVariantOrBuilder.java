// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface DocumentVariantOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 variationType = 1;
  /**
   * <code>optional int32 variationType = 1;</code>
   */
  boolean hasVariationType();
  /**
   * <code>optional int32 variationType = 1;</code>
   */
  int getVariationType();

  // optional .Rule rule = 2;
  /**
   * <code>optional .Rule rule = 2;</code>
   */
  boolean hasRule();
  /**
   * <code>optional .Rule rule = 2;</code>
   */
  com.github.yeriomin.playstoreapi.Rule getRule();
  /**
   * <code>optional .Rule rule = 2;</code>
   */
  com.github.yeriomin.playstoreapi.RuleOrBuilder getRuleOrBuilder();

  // optional string title = 3;
  /**
   * <code>optional string title = 3;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  // repeated string snippet = 4;
  /**
   * <code>repeated string snippet = 4;</code>
   */
  java.util.List<java.lang.String>
  getSnippetList();
  /**
   * <code>repeated string snippet = 4;</code>
   */
  int getSnippetCount();
  /**
   * <code>repeated string snippet = 4;</code>
   */
  java.lang.String getSnippet(int index);
  /**
   * <code>repeated string snippet = 4;</code>
   */
  com.google.protobuf.ByteString
      getSnippetBytes(int index);

  // optional string recentChanges = 5;
  /**
   * <code>optional string recentChanges = 5;</code>
   */
  boolean hasRecentChanges();
  /**
   * <code>optional string recentChanges = 5;</code>
   */
  java.lang.String getRecentChanges();
  /**
   * <code>optional string recentChanges = 5;</code>
   */
  com.google.protobuf.ByteString
      getRecentChangesBytes();

  // repeated .TranslatedText autoTranslation = 6;
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.TranslatedText> 
      getAutoTranslationList();
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  com.github.yeriomin.playstoreapi.TranslatedText getAutoTranslation(int index);
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  int getAutoTranslationCount();
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.TranslatedTextOrBuilder> 
      getAutoTranslationOrBuilderList();
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  com.github.yeriomin.playstoreapi.TranslatedTextOrBuilder getAutoTranslationOrBuilder(
      int index);

  // repeated .Offer offer = 7;
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Offer> 
      getOfferList();
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  com.github.yeriomin.playstoreapi.Offer getOffer(int index);
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  int getOfferCount();
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.OfferOrBuilder> 
      getOfferOrBuilderList();
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  com.github.yeriomin.playstoreapi.OfferOrBuilder getOfferOrBuilder(
      int index);

  // optional int64 channelId = 9;
  /**
   * <code>optional int64 channelId = 9;</code>
   */
  boolean hasChannelId();
  /**
   * <code>optional int64 channelId = 9;</code>
   */
  long getChannelId();

  // repeated .Document child = 10;
  /**
   * <code>repeated .Document child = 10;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Document> 
      getChildList();
  /**
   * <code>repeated .Document child = 10;</code>
   */
  com.github.yeriomin.playstoreapi.Document getChild(int index);
  /**
   * <code>repeated .Document child = 10;</code>
   */
  int getChildCount();
  /**
   * <code>repeated .Document child = 10;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.DocumentOrBuilder> 
      getChildOrBuilderList();
  /**
   * <code>repeated .Document child = 10;</code>
   */
  com.github.yeriomin.playstoreapi.DocumentOrBuilder getChildOrBuilder(
      int index);

  // repeated .Document decoration = 11;
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Document> 
      getDecorationList();
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  com.github.yeriomin.playstoreapi.Document getDecoration(int index);
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  int getDecorationCount();
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.DocumentOrBuilder> 
      getDecorationOrBuilderList();
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  com.github.yeriomin.playstoreapi.DocumentOrBuilder getDecorationOrBuilder(
      int index);
}
