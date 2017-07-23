// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface CarrierBillingInstrumentOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional string instrumentKey = 1;
  /**
   * <code>optional string instrumentKey = 1;</code>
   */
  boolean hasInstrumentKey();
  /**
   * <code>optional string instrumentKey = 1;</code>
   */
  java.lang.String getInstrumentKey();
  /**
   * <code>optional string instrumentKey = 1;</code>
   */
  com.google.protobuf.ByteString
      getInstrumentKeyBytes();

  // optional string accountType = 2;
  /**
   * <code>optional string accountType = 2;</code>
   */
  boolean hasAccountType();
  /**
   * <code>optional string accountType = 2;</code>
   */
  java.lang.String getAccountType();
  /**
   * <code>optional string accountType = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountTypeBytes();

  // optional string currencyCode = 3;
  /**
   * <code>optional string currencyCode = 3;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <code>optional string currencyCode = 3;</code>
   */
  java.lang.String getCurrencyCode();
  /**
   * <code>optional string currencyCode = 3;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  // optional int64 transactionLimit = 4;
  /**
   * <code>optional int64 transactionLimit = 4;</code>
   */
  boolean hasTransactionLimit();
  /**
   * <code>optional int64 transactionLimit = 4;</code>
   */
  long getTransactionLimit();

  // optional string subscriberIdentifier = 5;
  /**
   * <code>optional string subscriberIdentifier = 5;</code>
   */
  boolean hasSubscriberIdentifier();
  /**
   * <code>optional string subscriberIdentifier = 5;</code>
   */
  java.lang.String getSubscriberIdentifier();
  /**
   * <code>optional string subscriberIdentifier = 5;</code>
   */
  com.google.protobuf.ByteString
      getSubscriberIdentifierBytes();

  // optional .EncryptedSubscriberInfo encryptedSubscriberInfo = 6;
  /**
   * <code>optional .EncryptedSubscriberInfo encryptedSubscriberInfo = 6;</code>
   */
  boolean hasEncryptedSubscriberInfo();
  /**
   * <code>optional .EncryptedSubscriberInfo encryptedSubscriberInfo = 6;</code>
   */
  com.github.yeriomin.playstoreapi.EncryptedSubscriberInfo getEncryptedSubscriberInfo();
  /**
   * <code>optional .EncryptedSubscriberInfo encryptedSubscriberInfo = 6;</code>
   */
  com.github.yeriomin.playstoreapi.EncryptedSubscriberInfoOrBuilder getEncryptedSubscriberInfoOrBuilder();

  // optional .CarrierBillingCredentials credentials = 7;
  /**
   * <code>optional .CarrierBillingCredentials credentials = 7;</code>
   */
  boolean hasCredentials();
  /**
   * <code>optional .CarrierBillingCredentials credentials = 7;</code>
   */
  com.github.yeriomin.playstoreapi.CarrierBillingCredentials getCredentials();
  /**
   * <code>optional .CarrierBillingCredentials credentials = 7;</code>
   */
  com.github.yeriomin.playstoreapi.CarrierBillingCredentialsOrBuilder getCredentialsOrBuilder();

  // optional .CarrierTos acceptedCarrierTos = 8;
  /**
   * <code>optional .CarrierTos acceptedCarrierTos = 8;</code>
   */
  boolean hasAcceptedCarrierTos();
  /**
   * <code>optional .CarrierTos acceptedCarrierTos = 8;</code>
   */
  com.github.yeriomin.playstoreapi.CarrierTos getAcceptedCarrierTos();
  /**
   * <code>optional .CarrierTos acceptedCarrierTos = 8;</code>
   */
  com.github.yeriomin.playstoreapi.CarrierTosOrBuilder getAcceptedCarrierTosOrBuilder();
}
