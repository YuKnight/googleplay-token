// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface RatedOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional string label = 1;
  /**
   * <code>optional string label = 1;</code>
   */
  boolean hasLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  // optional .Image image = 2;
  /**
   * <code>optional .Image image = 2;</code>
   */
  boolean hasImage();
  /**
   * <code>optional .Image image = 2;</code>
   */
  com.github.yeriomin.playstoreapi.Image getImage();
  /**
   * <code>optional .Image image = 2;</code>
   */
  com.github.yeriomin.playstoreapi.ImageOrBuilder getImageOrBuilder();

  // optional string learnMoreHtmlLink = 4;
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  boolean hasLearnMoreHtmlLink();
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  java.lang.String getLearnMoreHtmlLink();
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  com.google.protobuf.ByteString
      getLearnMoreHtmlLinkBytes();
}
