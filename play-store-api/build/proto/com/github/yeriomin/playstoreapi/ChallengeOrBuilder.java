// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface ChallengeOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional .AddressChallenge addressChallenge = 1;
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  boolean hasAddressChallenge();
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  com.github.yeriomin.playstoreapi.AddressChallenge getAddressChallenge();
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  com.github.yeriomin.playstoreapi.AddressChallengeOrBuilder getAddressChallengeOrBuilder();

  // optional .AuthenticationChallenge authenticationChallenge = 2;
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  boolean hasAuthenticationChallenge();
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  com.github.yeriomin.playstoreapi.AuthenticationChallenge getAuthenticationChallenge();
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  com.github.yeriomin.playstoreapi.AuthenticationChallengeOrBuilder getAuthenticationChallengeOrBuilder();
}
