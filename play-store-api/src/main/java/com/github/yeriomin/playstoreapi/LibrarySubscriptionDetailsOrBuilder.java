// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface LibrarySubscriptionDetailsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional int64 initiationTimestampMsec = 1;
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  boolean hasInitiationTimestampMsec();
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  long getInitiationTimestampMsec();

  // optional int64 validUntilTimestampMsec = 2;
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  boolean hasValidUntilTimestampMsec();
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  long getValidUntilTimestampMsec();

  // optional bool autoRenewing = 3;
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  boolean hasAutoRenewing();
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  boolean getAutoRenewing();

  // optional int64 trialUntilTimestampMsec = 4;
  /**
   * <code>optional int64 trialUntilTimestampMsec = 4;</code>
   */
  boolean hasTrialUntilTimestampMsec();
  /**
   * <code>optional int64 trialUntilTimestampMsec = 4;</code>
   */
  long getTrialUntilTimestampMsec();
}
