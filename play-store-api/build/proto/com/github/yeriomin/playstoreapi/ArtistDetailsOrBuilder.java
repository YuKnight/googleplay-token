// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface ArtistDetailsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional string detailsUrl = 1;
  /**
   * <code>optional string detailsUrl = 1;</code>
   */
  boolean hasDetailsUrl();
  /**
   * <code>optional string detailsUrl = 1;</code>
   */
  java.lang.String getDetailsUrl();
  /**
   * <code>optional string detailsUrl = 1;</code>
   */
  com.google.protobuf.ByteString
      getDetailsUrlBytes();

  // optional string name = 2;
  /**
   * <code>optional string name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  // optional .ArtistExternalLinks externalLinks = 3;
  /**
   * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
   */
  boolean hasExternalLinks();
  /**
   * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
   */
  com.github.yeriomin.playstoreapi.ArtistExternalLinks getExternalLinks();
  /**
   * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
   */
  com.github.yeriomin.playstoreapi.ArtistExternalLinksOrBuilder getExternalLinksOrBuilder();
}
