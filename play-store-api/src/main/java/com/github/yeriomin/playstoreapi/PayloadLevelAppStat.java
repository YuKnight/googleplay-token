// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code PayloadLevelAppStat}
 */
public  final class PayloadLevelAppStat extends
    com.google.protobuf.GeneratedMessage
    implements PayloadLevelAppStatOrBuilder {
  // Use PayloadLevelAppStat.newBuilder() to construct.
  private PayloadLevelAppStat(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private PayloadLevelAppStat(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final PayloadLevelAppStat defaultInstance;
  public static PayloadLevelAppStat getDefaultInstance() {
    return defaultInstance;
  }

  public PayloadLevelAppStat getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private PayloadLevelAppStat(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            packageKey_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            applicationTag_ = input.readInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              payloadLevelAppBucket_ = new java.util.ArrayList<com.github.yeriomin.playstoreapi.AppBucket>();
              mutable_bitField0_ |= 0x00000004;
            }
            payloadLevelAppBucket_.add(input.readMessage(com.github.yeriomin.playstoreapi.AppBucket.PARSER, extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        payloadLevelAppBucket_ = java.util.Collections.unmodifiableList(payloadLevelAppBucket_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PayloadLevelAppStat_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PayloadLevelAppStat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.PayloadLevelAppStat.class, com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder.class);
  }

  public static com.google.protobuf.Parser<PayloadLevelAppStat> PARSER =
      new com.google.protobuf.AbstractParser<PayloadLevelAppStat>() {
    public PayloadLevelAppStat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PayloadLevelAppStat(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PayloadLevelAppStat> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 packageKey = 1;
  public static final int PACKAGEKEY_FIELD_NUMBER = 1;
  private int packageKey_;
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  public boolean hasPackageKey() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 packageKey = 1;</code>
   */
  public int getPackageKey() {
    return packageKey_;
  }

  // optional int32 applicationTag = 2;
  public static final int APPLICATIONTAG_FIELD_NUMBER = 2;
  private int applicationTag_;
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  public boolean hasApplicationTag() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 applicationTag = 2;</code>
   */
  public int getApplicationTag() {
    return applicationTag_;
  }

  // repeated .AppBucket payloadLevelAppBucket = 3;
  public static final int PAYLOADLEVELAPPBUCKET_FIELD_NUMBER = 3;
  private java.util.List<com.github.yeriomin.playstoreapi.AppBucket> payloadLevelAppBucket_;
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.AppBucket> getPayloadLevelAppBucketList() {
    return payloadLevelAppBucket_;
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.AppBucketOrBuilder> 
      getPayloadLevelAppBucketOrBuilderList() {
    return payloadLevelAppBucket_;
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public int getPayloadLevelAppBucketCount() {
    return payloadLevelAppBucket_.size();
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.AppBucket getPayloadLevelAppBucket(int index) {
    return payloadLevelAppBucket_.get(index);
  }
  /**
   * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.AppBucketOrBuilder getPayloadLevelAppBucketOrBuilder(
      int index) {
    return payloadLevelAppBucket_.get(index);
  }

  private void initFields() {
    packageKey_ = 0;
    applicationTag_ = 0;
    payloadLevelAppBucket_ = java.util.Collections.emptyList();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, packageKey_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, applicationTag_);
    }
    for (int i = 0; i < payloadLevelAppBucket_.size(); i++) {
      output.writeMessage(3, payloadLevelAppBucket_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, packageKey_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, applicationTag_);
    }
    for (int i = 0; i < payloadLevelAppBucket_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, payloadLevelAppBucket_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PayloadLevelAppStat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.PayloadLevelAppStat prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code PayloadLevelAppStat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.PayloadLevelAppStatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PayloadLevelAppStat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PayloadLevelAppStat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.PayloadLevelAppStat.class, com.github.yeriomin.playstoreapi.PayloadLevelAppStat.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.PayloadLevelAppStat.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getPayloadLevelAppBucketFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      packageKey_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      applicationTag_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (payloadLevelAppBucketBuilder_ == null) {
        payloadLevelAppBucket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        payloadLevelAppBucketBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PayloadLevelAppStat_descriptor;
    }

    public com.github.yeriomin.playstoreapi.PayloadLevelAppStat getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.PayloadLevelAppStat.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.PayloadLevelAppStat build() {
      com.github.yeriomin.playstoreapi.PayloadLevelAppStat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.PayloadLevelAppStat buildPartial() {
      com.github.yeriomin.playstoreapi.PayloadLevelAppStat result = new com.github.yeriomin.playstoreapi.PayloadLevelAppStat(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.packageKey_ = packageKey_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.applicationTag_ = applicationTag_;
      if (payloadLevelAppBucketBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          payloadLevelAppBucket_ = java.util.Collections.unmodifiableList(payloadLevelAppBucket_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.payloadLevelAppBucket_ = payloadLevelAppBucket_;
      } else {
        result.payloadLevelAppBucket_ = payloadLevelAppBucketBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.PayloadLevelAppStat) {
        return mergeFrom((com.github.yeriomin.playstoreapi.PayloadLevelAppStat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.PayloadLevelAppStat other) {
      if (other == com.github.yeriomin.playstoreapi.PayloadLevelAppStat.getDefaultInstance()) return this;
      if (other.hasPackageKey()) {
        setPackageKey(other.getPackageKey());
      }
      if (other.hasApplicationTag()) {
        setApplicationTag(other.getApplicationTag());
      }
      if (payloadLevelAppBucketBuilder_ == null) {
        if (!other.payloadLevelAppBucket_.isEmpty()) {
          if (payloadLevelAppBucket_.isEmpty()) {
            payloadLevelAppBucket_ = other.payloadLevelAppBucket_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePayloadLevelAppBucketIsMutable();
            payloadLevelAppBucket_.addAll(other.payloadLevelAppBucket_);
          }
          onChanged();
        }
      } else {
        if (!other.payloadLevelAppBucket_.isEmpty()) {
          if (payloadLevelAppBucketBuilder_.isEmpty()) {
            payloadLevelAppBucketBuilder_.dispose();
            payloadLevelAppBucketBuilder_ = null;
            payloadLevelAppBucket_ = other.payloadLevelAppBucket_;
            bitField0_ = (bitField0_ & ~0x00000004);
            payloadLevelAppBucketBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPayloadLevelAppBucketFieldBuilder() : null;
          } else {
            payloadLevelAppBucketBuilder_.addAllMessages(other.payloadLevelAppBucket_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.yeriomin.playstoreapi.PayloadLevelAppStat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.PayloadLevelAppStat) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 packageKey = 1;
    private int packageKey_ ;
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public boolean hasPackageKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public int getPackageKey() {
      return packageKey_;
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public Builder setPackageKey(int value) {
      bitField0_ |= 0x00000001;
      packageKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 packageKey = 1;</code>
     */
    public Builder clearPackageKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      packageKey_ = 0;
      onChanged();
      return this;
    }

    // optional int32 applicationTag = 2;
    private int applicationTag_ ;
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public boolean hasApplicationTag() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public int getApplicationTag() {
      return applicationTag_;
    }
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public Builder setApplicationTag(int value) {
      bitField0_ |= 0x00000002;
      applicationTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 applicationTag = 2;</code>
     */
    public Builder clearApplicationTag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      applicationTag_ = 0;
      onChanged();
      return this;
    }

    // repeated .AppBucket payloadLevelAppBucket = 3;
    private java.util.List<com.github.yeriomin.playstoreapi.AppBucket> payloadLevelAppBucket_ =
      java.util.Collections.emptyList();
    private void ensurePayloadLevelAppBucketIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        payloadLevelAppBucket_ = new java.util.ArrayList<com.github.yeriomin.playstoreapi.AppBucket>(payloadLevelAppBucket_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.yeriomin.playstoreapi.AppBucket, com.github.yeriomin.playstoreapi.AppBucket.Builder, com.github.yeriomin.playstoreapi.AppBucketOrBuilder> payloadLevelAppBucketBuilder_;

    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.AppBucket> getPayloadLevelAppBucketList() {
      if (payloadLevelAppBucketBuilder_ == null) {
        return java.util.Collections.unmodifiableList(payloadLevelAppBucket_);
      } else {
        return payloadLevelAppBucketBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public int getPayloadLevelAppBucketCount() {
      if (payloadLevelAppBucketBuilder_ == null) {
        return payloadLevelAppBucket_.size();
      } else {
        return payloadLevelAppBucketBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.AppBucket getPayloadLevelAppBucket(int index) {
      if (payloadLevelAppBucketBuilder_ == null) {
        return payloadLevelAppBucket_.get(index);
      } else {
        return payloadLevelAppBucketBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder setPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket value) {
      if (payloadLevelAppBucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.set(index, value);
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder setPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
      if (payloadLevelAppBucketBuilder_ == null) {
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.set(index, builderForValue.build());
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(com.github.yeriomin.playstoreapi.AppBucket value) {
      if (payloadLevelAppBucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.add(value);
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket value) {
      if (payloadLevelAppBucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.add(index, value);
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(
        com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
      if (payloadLevelAppBucketBuilder_ == null) {
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.add(builderForValue.build());
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addPayloadLevelAppBucket(
        int index, com.github.yeriomin.playstoreapi.AppBucket.Builder builderForValue) {
      if (payloadLevelAppBucketBuilder_ == null) {
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.add(index, builderForValue.build());
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder addAllPayloadLevelAppBucket(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.AppBucket> values) {
      if (payloadLevelAppBucketBuilder_ == null) {
        ensurePayloadLevelAppBucketIsMutable();
        super.addAll(values, payloadLevelAppBucket_);
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder clearPayloadLevelAppBucket() {
      if (payloadLevelAppBucketBuilder_ == null) {
        payloadLevelAppBucket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public Builder removePayloadLevelAppBucket(int index) {
      if (payloadLevelAppBucketBuilder_ == null) {
        ensurePayloadLevelAppBucketIsMutable();
        payloadLevelAppBucket_.remove(index);
        onChanged();
      } else {
        payloadLevelAppBucketBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.AppBucket.Builder getPayloadLevelAppBucketBuilder(
        int index) {
      return getPayloadLevelAppBucketFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.AppBucketOrBuilder getPayloadLevelAppBucketOrBuilder(
        int index) {
      if (payloadLevelAppBucketBuilder_ == null) {
        return payloadLevelAppBucket_.get(index);  } else {
        return payloadLevelAppBucketBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public java.util.List<? extends com.github.yeriomin.playstoreapi.AppBucketOrBuilder> 
         getPayloadLevelAppBucketOrBuilderList() {
      if (payloadLevelAppBucketBuilder_ != null) {
        return payloadLevelAppBucketBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(payloadLevelAppBucket_);
      }
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.AppBucket.Builder addPayloadLevelAppBucketBuilder() {
      return getPayloadLevelAppBucketFieldBuilder().addBuilder(
          com.github.yeriomin.playstoreapi.AppBucket.getDefaultInstance());
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.AppBucket.Builder addPayloadLevelAppBucketBuilder(
        int index) {
      return getPayloadLevelAppBucketFieldBuilder().addBuilder(
          index, com.github.yeriomin.playstoreapi.AppBucket.getDefaultInstance());
    }
    /**
     * <code>repeated .AppBucket payloadLevelAppBucket = 3;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.AppBucket.Builder> 
         getPayloadLevelAppBucketBuilderList() {
      return getPayloadLevelAppBucketFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.yeriomin.playstoreapi.AppBucket, com.github.yeriomin.playstoreapi.AppBucket.Builder, com.github.yeriomin.playstoreapi.AppBucketOrBuilder> 
        getPayloadLevelAppBucketFieldBuilder() {
      if (payloadLevelAppBucketBuilder_ == null) {
        payloadLevelAppBucketBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.yeriomin.playstoreapi.AppBucket, com.github.yeriomin.playstoreapi.AppBucket.Builder, com.github.yeriomin.playstoreapi.AppBucketOrBuilder>(
                payloadLevelAppBucket_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        payloadLevelAppBucket_ = null;
      }
      return payloadLevelAppBucketBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:PayloadLevelAppStat)
  }

  static {
    defaultInstance = new PayloadLevelAppStat(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:PayloadLevelAppStat)
}

