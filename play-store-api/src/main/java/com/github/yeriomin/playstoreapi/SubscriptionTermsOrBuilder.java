// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface SubscriptionTermsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional .TimePeriod recurringPeriod = 1;
  /**
   * <code>optional .TimePeriod recurringPeriod = 1;</code>
   */
  boolean hasRecurringPeriod();
  /**
   * <code>optional .TimePeriod recurringPeriod = 1;</code>
   */
  com.github.yeriomin.playstoreapi.TimePeriod getRecurringPeriod();
  /**
   * <code>optional .TimePeriod recurringPeriod = 1;</code>
   */
  com.github.yeriomin.playstoreapi.TimePeriodOrBuilder getRecurringPeriodOrBuilder();

  // optional .TimePeriod trialPeriod = 2;
  /**
   * <code>optional .TimePeriod trialPeriod = 2;</code>
   */
  boolean hasTrialPeriod();
  /**
   * <code>optional .TimePeriod trialPeriod = 2;</code>
   */
  com.github.yeriomin.playstoreapi.TimePeriod getTrialPeriod();
  /**
   * <code>optional .TimePeriod trialPeriod = 2;</code>
   */
  com.github.yeriomin.playstoreapi.TimePeriodOrBuilder getTrialPeriodOrBuilder();
}
