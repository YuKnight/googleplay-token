// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface VideoDetailsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // repeated .VideoCredit credit = 1;
  /**
   * <code>repeated .VideoCredit credit = 1;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.VideoCredit> 
      getCreditList();
  /**
   * <code>repeated .VideoCredit credit = 1;</code>
   */
  com.github.yeriomin.playstoreapi.VideoCredit getCredit(int index);
  /**
   * <code>repeated .VideoCredit credit = 1;</code>
   */
  int getCreditCount();
  /**
   * <code>repeated .VideoCredit credit = 1;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.VideoCreditOrBuilder> 
      getCreditOrBuilderList();
  /**
   * <code>repeated .VideoCredit credit = 1;</code>
   */
  com.github.yeriomin.playstoreapi.VideoCreditOrBuilder getCreditOrBuilder(
      int index);

  // optional string duration = 2;
  /**
   * <code>optional string duration = 2;</code>
   */
  boolean hasDuration();
  /**
   * <code>optional string duration = 2;</code>
   */
  java.lang.String getDuration();
  /**
   * <code>optional string duration = 2;</code>
   */
  com.google.protobuf.ByteString
      getDurationBytes();

  // optional string releaseDate = 3;
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  boolean hasReleaseDate();
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  java.lang.String getReleaseDate();
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  com.google.protobuf.ByteString
      getReleaseDateBytes();

  // optional string contentRating = 4;
  /**
   * <code>optional string contentRating = 4;</code>
   */
  boolean hasContentRating();
  /**
   * <code>optional string contentRating = 4;</code>
   */
  java.lang.String getContentRating();
  /**
   * <code>optional string contentRating = 4;</code>
   */
  com.google.protobuf.ByteString
      getContentRatingBytes();

  // optional int64 likes = 5;
  /**
   * <code>optional int64 likes = 5;</code>
   */
  boolean hasLikes();
  /**
   * <code>optional int64 likes = 5;</code>
   */
  long getLikes();

  // optional int64 dislikes = 6;
  /**
   * <code>optional int64 dislikes = 6;</code>
   */
  boolean hasDislikes();
  /**
   * <code>optional int64 dislikes = 6;</code>
   */
  long getDislikes();

  // repeated string genre = 7;
  /**
   * <code>repeated string genre = 7;</code>
   */
  java.util.List<java.lang.String>
  getGenreList();
  /**
   * <code>repeated string genre = 7;</code>
   */
  int getGenreCount();
  /**
   * <code>repeated string genre = 7;</code>
   */
  java.lang.String getGenre(int index);
  /**
   * <code>repeated string genre = 7;</code>
   */
  com.google.protobuf.ByteString
      getGenreBytes(int index);

  // repeated .Trailer trailer = 8;
  /**
   * <code>repeated .Trailer trailer = 8;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.Trailer> 
      getTrailerList();
  /**
   * <code>repeated .Trailer trailer = 8;</code>
   */
  com.github.yeriomin.playstoreapi.Trailer getTrailer(int index);
  /**
   * <code>repeated .Trailer trailer = 8;</code>
   */
  int getTrailerCount();
  /**
   * <code>repeated .Trailer trailer = 8;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.TrailerOrBuilder> 
      getTrailerOrBuilderList();
  /**
   * <code>repeated .Trailer trailer = 8;</code>
   */
  com.github.yeriomin.playstoreapi.TrailerOrBuilder getTrailerOrBuilder(
      int index);

  // repeated .VideoRentalTerm rentalTerm = 9;
  /**
   * <code>repeated .VideoRentalTerm rentalTerm = 9;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.VideoRentalTerm> 
      getRentalTermList();
  /**
   * <code>repeated .VideoRentalTerm rentalTerm = 9;</code>
   */
  com.github.yeriomin.playstoreapi.VideoRentalTerm getRentalTerm(int index);
  /**
   * <code>repeated .VideoRentalTerm rentalTerm = 9;</code>
   */
  int getRentalTermCount();
  /**
   * <code>repeated .VideoRentalTerm rentalTerm = 9;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.VideoRentalTermOrBuilder> 
      getRentalTermOrBuilderList();
  /**
   * <code>repeated .VideoRentalTerm rentalTerm = 9;</code>
   */
  com.github.yeriomin.playstoreapi.VideoRentalTermOrBuilder getRentalTermOrBuilder(
      int index);
}
