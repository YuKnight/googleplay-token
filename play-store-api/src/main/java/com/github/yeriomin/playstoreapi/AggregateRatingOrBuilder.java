// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface AggregateRatingOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int32 type = 1;
  /**
   * <code>optional int32 type = 1;</code>
   */
  boolean hasType();
  /**
   * <code>optional int32 type = 1;</code>
   */
  int getType();

  // optional float starRating = 2;
  /**
   * <code>optional float starRating = 2;</code>
   */
  boolean hasStarRating();
  /**
   * <code>optional float starRating = 2;</code>
   */
  float getStarRating();

  // optional uint64 ratingsCount = 3;
  /**
   * <code>optional uint64 ratingsCount = 3;</code>
   */
  boolean hasRatingsCount();
  /**
   * <code>optional uint64 ratingsCount = 3;</code>
   */
  long getRatingsCount();

  // optional uint64 oneStarRatings = 4;
  /**
   * <code>optional uint64 oneStarRatings = 4;</code>
   */
  boolean hasOneStarRatings();
  /**
   * <code>optional uint64 oneStarRatings = 4;</code>
   */
  long getOneStarRatings();

  // optional uint64 twoStarRatings = 5;
  /**
   * <code>optional uint64 twoStarRatings = 5;</code>
   */
  boolean hasTwoStarRatings();
  /**
   * <code>optional uint64 twoStarRatings = 5;</code>
   */
  long getTwoStarRatings();

  // optional uint64 threeStarRatings = 6;
  /**
   * <code>optional uint64 threeStarRatings = 6;</code>
   */
  boolean hasThreeStarRatings();
  /**
   * <code>optional uint64 threeStarRatings = 6;</code>
   */
  long getThreeStarRatings();

  // optional uint64 fourStarRatings = 7;
  /**
   * <code>optional uint64 fourStarRatings = 7;</code>
   */
  boolean hasFourStarRatings();
  /**
   * <code>optional uint64 fourStarRatings = 7;</code>
   */
  long getFourStarRatings();

  // optional uint64 fiveStarRatings = 8;
  /**
   * <code>optional uint64 fiveStarRatings = 8;</code>
   */
  boolean hasFiveStarRatings();
  /**
   * <code>optional uint64 fiveStarRatings = 8;</code>
   */
  long getFiveStarRatings();

  // optional uint64 thumbsUpCount = 9;
  /**
   * <code>optional uint64 thumbsUpCount = 9;</code>
   */
  boolean hasThumbsUpCount();
  /**
   * <code>optional uint64 thumbsUpCount = 9;</code>
   */
  long getThumbsUpCount();

  // optional uint64 thumbsDownCount = 10;
  /**
   * <code>optional uint64 thumbsDownCount = 10;</code>
   */
  boolean hasThumbsDownCount();
  /**
   * <code>optional uint64 thumbsDownCount = 10;</code>
   */
  long getThumbsDownCount();

  // optional uint64 commentCount = 11;
  /**
   * <code>optional uint64 commentCount = 11;</code>
   */
  boolean hasCommentCount();
  /**
   * <code>optional uint64 commentCount = 11;</code>
   */
  long getCommentCount();

  // optional double bayesianMeanRating = 12;
  /**
   * <code>optional double bayesianMeanRating = 12;</code>
   */
  boolean hasBayesianMeanRating();
  /**
   * <code>optional double bayesianMeanRating = 12;</code>
   */
  double getBayesianMeanRating();
}
