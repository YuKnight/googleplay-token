// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface BrowseLinkOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional string name = 1;
  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  // optional string dataUrl = 3;
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  boolean hasDataUrl();
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  java.lang.String getDataUrl();
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  com.google.protobuf.ByteString
      getDataUrlBytes();

  // optional .Image icon = 5;
  /**
   * <code>optional .Image icon = 5;</code>
   */
  boolean hasIcon();
  /**
   * <code>optional .Image icon = 5;</code>
   */
  com.github.yeriomin.playstoreapi.Image getIcon();
  /**
   * <code>optional .Image icon = 5;</code>
   */
  com.github.yeriomin.playstoreapi.ImageOrBuilder getIconOrBuilder();

  // optional .UnknownCategoryContainer unknownCategoryContainer = 4;
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  boolean hasUnknownCategoryContainer();
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  com.github.yeriomin.playstoreapi.UnknownCategoryContainer getUnknownCategoryContainer();
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  com.github.yeriomin.playstoreapi.UnknownCategoryContainerOrBuilder getUnknownCategoryContainerOrBuilder();
}
