// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface BuyResponseOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional .PurchaseNotificationResponse purchaseResponse = 1;
  /**
   * <code>optional .PurchaseNotificationResponse purchaseResponse = 1;</code>
   */
  boolean hasPurchaseResponse();
  /**
   * <code>optional .PurchaseNotificationResponse purchaseResponse = 1;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseNotificationResponse getPurchaseResponse();
  /**
   * <code>optional .PurchaseNotificationResponse purchaseResponse = 1;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseNotificationResponseOrBuilder getPurchaseResponseOrBuilder();

  // optional group CheckoutInfo = 2 {
  /**
   * <code>optional group CheckoutInfo = 2 { ... }</code>
   */
  boolean hasCheckoutInfo();
  /**
   * <code>optional group CheckoutInfo = 2 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.BuyResponse.CheckoutInfo getCheckoutInfo();
  /**
   * <code>optional group CheckoutInfo = 2 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.BuyResponse.CheckoutInfoOrBuilder getCheckoutInfoOrBuilder();

  // optional string continueViaUrl = 8;
  /**
   * <code>optional string continueViaUrl = 8;</code>
   */
  boolean hasContinueViaUrl();
  /**
   * <code>optional string continueViaUrl = 8;</code>
   */
  java.lang.String getContinueViaUrl();
  /**
   * <code>optional string continueViaUrl = 8;</code>
   */
  com.google.protobuf.ByteString
      getContinueViaUrlBytes();

  // optional string purchaseStatusUrl = 9;
  /**
   * <code>optional string purchaseStatusUrl = 9;</code>
   */
  boolean hasPurchaseStatusUrl();
  /**
   * <code>optional string purchaseStatusUrl = 9;</code>
   */
  java.lang.String getPurchaseStatusUrl();
  /**
   * <code>optional string purchaseStatusUrl = 9;</code>
   */
  com.google.protobuf.ByteString
      getPurchaseStatusUrlBytes();

  // optional string checkoutServiceId = 12;
  /**
   * <code>optional string checkoutServiceId = 12;</code>
   */
  boolean hasCheckoutServiceId();
  /**
   * <code>optional string checkoutServiceId = 12;</code>
   */
  java.lang.String getCheckoutServiceId();
  /**
   * <code>optional string checkoutServiceId = 12;</code>
   */
  com.google.protobuf.ByteString
      getCheckoutServiceIdBytes();

  // optional bool checkoutTokenRequired = 13;
  /**
   * <code>optional bool checkoutTokenRequired = 13;</code>
   */
  boolean hasCheckoutTokenRequired();
  /**
   * <code>optional bool checkoutTokenRequired = 13;</code>
   */
  boolean getCheckoutTokenRequired();

  // optional string baseCheckoutUrl = 14;
  /**
   * <code>optional string baseCheckoutUrl = 14;</code>
   */
  boolean hasBaseCheckoutUrl();
  /**
   * <code>optional string baseCheckoutUrl = 14;</code>
   */
  java.lang.String getBaseCheckoutUrl();
  /**
   * <code>optional string baseCheckoutUrl = 14;</code>
   */
  com.google.protobuf.ByteString
      getBaseCheckoutUrlBytes();

  // repeated string tosCheckboxHtml = 37;
  /**
   * <code>repeated string tosCheckboxHtml = 37;</code>
   */
  java.util.List<java.lang.String>
  getTosCheckboxHtmlList();
  /**
   * <code>repeated string tosCheckboxHtml = 37;</code>
   */
  int getTosCheckboxHtmlCount();
  /**
   * <code>repeated string tosCheckboxHtml = 37;</code>
   */
  java.lang.String getTosCheckboxHtml(int index);
  /**
   * <code>repeated string tosCheckboxHtml = 37;</code>
   */
  com.google.protobuf.ByteString
      getTosCheckboxHtmlBytes(int index);

  // optional int32 iabPermissionError = 38;
  /**
   * <code>optional int32 iabPermissionError = 38;</code>
   */
  boolean hasIabPermissionError();
  /**
   * <code>optional int32 iabPermissionError = 38;</code>
   */
  int getIabPermissionError();

  // optional .PurchaseStatusResponse purchaseStatusResponse = 39;
  /**
   * <code>optional .PurchaseStatusResponse purchaseStatusResponse = 39;</code>
   */
  boolean hasPurchaseStatusResponse();
  /**
   * <code>optional .PurchaseStatusResponse purchaseStatusResponse = 39;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseStatusResponse getPurchaseStatusResponse();
  /**
   * <code>optional .PurchaseStatusResponse purchaseStatusResponse = 39;</code>
   */
  com.github.yeriomin.playstoreapi.PurchaseStatusResponseOrBuilder getPurchaseStatusResponseOrBuilder();

  // optional string purchaseCookie = 46;
  /**
   * <code>optional string purchaseCookie = 46;</code>
   */
  boolean hasPurchaseCookie();
  /**
   * <code>optional string purchaseCookie = 46;</code>
   */
  java.lang.String getPurchaseCookie();
  /**
   * <code>optional string purchaseCookie = 46;</code>
   */
  com.google.protobuf.ByteString
      getPurchaseCookieBytes();

  // optional .Challenge challenge = 49;
  /**
   * <code>optional .Challenge challenge = 49;</code>
   */
  boolean hasChallenge();
  /**
   * <code>optional .Challenge challenge = 49;</code>
   */
  com.github.yeriomin.playstoreapi.Challenge getChallenge();
  /**
   * <code>optional .Challenge challenge = 49;</code>
   */
  com.github.yeriomin.playstoreapi.ChallengeOrBuilder getChallengeOrBuilder();
}
