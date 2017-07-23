// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code ReviewResponse}
 */
public  final class ReviewResponse extends
    com.google.protobuf.GeneratedMessage
    implements ReviewResponseOrBuilder {
  // Use ReviewResponse.newBuilder() to construct.
  private ReviewResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ReviewResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ReviewResponse defaultInstance;
  public static ReviewResponse getDefaultInstance() {
    return defaultInstance;
  }

  public ReviewResponse getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ReviewResponse(
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
          case 10: {
            com.github.yeriomin.playstoreapi.GetReviewsResponse.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = getResponse_.toBuilder();
            }
            getResponse_ = input.readMessage(com.github.yeriomin.playstoreapi.GetReviewsResponse.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(getResponse_);
              getResponse_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            nextPageUrl_ = input.readBytes();
            break;
          }
          case 26: {
            com.github.yeriomin.playstoreapi.Review.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = userReview_.toBuilder();
            }
            userReview_ = input.readMessage(com.github.yeriomin.playstoreapi.Review.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userReview_);
              userReview_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ReviewResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ReviewResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.ReviewResponse.class, com.github.yeriomin.playstoreapi.ReviewResponse.Builder.class);
  }

  public static com.google.protobuf.Parser<ReviewResponse> PARSER =
      new com.google.protobuf.AbstractParser<ReviewResponse>() {
    public ReviewResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReviewResponse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ReviewResponse> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional .GetReviewsResponse getResponse = 1;
  public static final int GETRESPONSE_FIELD_NUMBER = 1;
  private com.github.yeriomin.playstoreapi.GetReviewsResponse getResponse_;
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  public boolean hasGetResponse() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.GetReviewsResponse getGetResponse() {
    return getResponse_;
  }
  /**
   * <code>optional .GetReviewsResponse getResponse = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.GetReviewsResponseOrBuilder getGetResponseOrBuilder() {
    return getResponse_;
  }

  // optional string nextPageUrl = 2;
  public static final int NEXTPAGEURL_FIELD_NUMBER = 2;
  private java.lang.Object nextPageUrl_;
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  public boolean hasNextPageUrl() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  public java.lang.String getNextPageUrl() {
    java.lang.Object ref = nextPageUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        nextPageUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string nextPageUrl = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageUrlBytes() {
    java.lang.Object ref = nextPageUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional .Review userReview = 3;
  public static final int USERREVIEW_FIELD_NUMBER = 3;
  private com.github.yeriomin.playstoreapi.Review userReview_;
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  public boolean hasUserReview() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.Review getUserReview() {
    return userReview_;
  }
  /**
   * <code>optional .Review userReview = 3;</code>
   */
  public com.github.yeriomin.playstoreapi.ReviewOrBuilder getUserReviewOrBuilder() {
    return userReview_;
  }

  private void initFields() {
    getResponse_ = com.github.yeriomin.playstoreapi.GetReviewsResponse.getDefaultInstance();
    nextPageUrl_ = "";
    userReview_ = com.github.yeriomin.playstoreapi.Review.getDefaultInstance();
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
      output.writeMessage(1, getResponse_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getNextPageUrlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, userReview_);
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
        .computeMessageSize(1, getResponse_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNextPageUrlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, userReview_);
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

  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ReviewResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.ReviewResponse prototype) {
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
   * Protobuf type {@code ReviewResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.ReviewResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ReviewResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ReviewResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.ReviewResponse.class, com.github.yeriomin.playstoreapi.ReviewResponse.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.ReviewResponse.newBuilder()
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
        getGetResponseFieldBuilder();
        getUserReviewFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (getResponseBuilder_ == null) {
        getResponse_ = com.github.yeriomin.playstoreapi.GetReviewsResponse.getDefaultInstance();
      } else {
        getResponseBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (userReviewBuilder_ == null) {
        userReview_ = com.github.yeriomin.playstoreapi.Review.getDefaultInstance();
      } else {
        userReviewBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ReviewResponse_descriptor;
    }

    public com.github.yeriomin.playstoreapi.ReviewResponse getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.ReviewResponse.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.ReviewResponse build() {
      com.github.yeriomin.playstoreapi.ReviewResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.ReviewResponse buildPartial() {
      com.github.yeriomin.playstoreapi.ReviewResponse result = new com.github.yeriomin.playstoreapi.ReviewResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (getResponseBuilder_ == null) {
        result.getResponse_ = getResponse_;
      } else {
        result.getResponse_ = getResponseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.nextPageUrl_ = nextPageUrl_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (userReviewBuilder_ == null) {
        result.userReview_ = userReview_;
      } else {
        result.userReview_ = userReviewBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.ReviewResponse) {
        return mergeFrom((com.github.yeriomin.playstoreapi.ReviewResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.ReviewResponse other) {
      if (other == com.github.yeriomin.playstoreapi.ReviewResponse.getDefaultInstance()) return this;
      if (other.hasGetResponse()) {
        mergeGetResponse(other.getGetResponse());
      }
      if (other.hasNextPageUrl()) {
        bitField0_ |= 0x00000002;
        nextPageUrl_ = other.nextPageUrl_;
        onChanged();
      }
      if (other.hasUserReview()) {
        mergeUserReview(other.getUserReview());
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
      com.github.yeriomin.playstoreapi.ReviewResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.ReviewResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional .GetReviewsResponse getResponse = 1;
    private com.github.yeriomin.playstoreapi.GetReviewsResponse getResponse_ = com.github.yeriomin.playstoreapi.GetReviewsResponse.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.GetReviewsResponse, com.github.yeriomin.playstoreapi.GetReviewsResponse.Builder, com.github.yeriomin.playstoreapi.GetReviewsResponseOrBuilder> getResponseBuilder_;
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public boolean hasGetResponse() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.GetReviewsResponse getGetResponse() {
      if (getResponseBuilder_ == null) {
        return getResponse_;
      } else {
        return getResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder setGetResponse(com.github.yeriomin.playstoreapi.GetReviewsResponse value) {
      if (getResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        getResponse_ = value;
        onChanged();
      } else {
        getResponseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder setGetResponse(
        com.github.yeriomin.playstoreapi.GetReviewsResponse.Builder builderForValue) {
      if (getResponseBuilder_ == null) {
        getResponse_ = builderForValue.build();
        onChanged();
      } else {
        getResponseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder mergeGetResponse(com.github.yeriomin.playstoreapi.GetReviewsResponse value) {
      if (getResponseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            getResponse_ != com.github.yeriomin.playstoreapi.GetReviewsResponse.getDefaultInstance()) {
          getResponse_ =
            com.github.yeriomin.playstoreapi.GetReviewsResponse.newBuilder(getResponse_).mergeFrom(value).buildPartial();
        } else {
          getResponse_ = value;
        }
        onChanged();
      } else {
        getResponseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public Builder clearGetResponse() {
      if (getResponseBuilder_ == null) {
        getResponse_ = com.github.yeriomin.playstoreapi.GetReviewsResponse.getDefaultInstance();
        onChanged();
      } else {
        getResponseBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.GetReviewsResponse.Builder getGetResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGetResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.GetReviewsResponseOrBuilder getGetResponseOrBuilder() {
      if (getResponseBuilder_ != null) {
        return getResponseBuilder_.getMessageOrBuilder();
      } else {
        return getResponse_;
      }
    }
    /**
     * <code>optional .GetReviewsResponse getResponse = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.GetReviewsResponse, com.github.yeriomin.playstoreapi.GetReviewsResponse.Builder, com.github.yeriomin.playstoreapi.GetReviewsResponseOrBuilder> 
        getGetResponseFieldBuilder() {
      if (getResponseBuilder_ == null) {
        getResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.yeriomin.playstoreapi.GetReviewsResponse, com.github.yeriomin.playstoreapi.GetReviewsResponse.Builder, com.github.yeriomin.playstoreapi.GetReviewsResponseOrBuilder>(
                getResponse_,
                getParentForChildren(),
                isClean());
        getResponse_ = null;
      }
      return getResponseBuilder_;
    }

    // optional string nextPageUrl = 2;
    private java.lang.Object nextPageUrl_ = "";
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public boolean hasNextPageUrl() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public java.lang.String getNextPageUrl() {
      java.lang.Object ref = nextPageUrl_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        nextPageUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageUrlBytes() {
      java.lang.Object ref = nextPageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public Builder setNextPageUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      nextPageUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public Builder clearNextPageUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      nextPageUrl_ = getDefaultInstance().getNextPageUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string nextPageUrl = 2;</code>
     */
    public Builder setNextPageUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      nextPageUrl_ = value;
      onChanged();
      return this;
    }

    // optional .Review userReview = 3;
    private com.github.yeriomin.playstoreapi.Review userReview_ = com.github.yeriomin.playstoreapi.Review.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.Review, com.github.yeriomin.playstoreapi.Review.Builder, com.github.yeriomin.playstoreapi.ReviewOrBuilder> userReviewBuilder_;
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public boolean hasUserReview() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.Review getUserReview() {
      if (userReviewBuilder_ == null) {
        return userReview_;
      } else {
        return userReviewBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder setUserReview(com.github.yeriomin.playstoreapi.Review value) {
      if (userReviewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userReview_ = value;
        onChanged();
      } else {
        userReviewBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder setUserReview(
        com.github.yeriomin.playstoreapi.Review.Builder builderForValue) {
      if (userReviewBuilder_ == null) {
        userReview_ = builderForValue.build();
        onChanged();
      } else {
        userReviewBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder mergeUserReview(com.github.yeriomin.playstoreapi.Review value) {
      if (userReviewBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            userReview_ != com.github.yeriomin.playstoreapi.Review.getDefaultInstance()) {
          userReview_ =
            com.github.yeriomin.playstoreapi.Review.newBuilder(userReview_).mergeFrom(value).buildPartial();
        } else {
          userReview_ = value;
        }
        onChanged();
      } else {
        userReviewBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public Builder clearUserReview() {
      if (userReviewBuilder_ == null) {
        userReview_ = com.github.yeriomin.playstoreapi.Review.getDefaultInstance();
        onChanged();
      } else {
        userReviewBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.Review.Builder getUserReviewBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUserReviewFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    public com.github.yeriomin.playstoreapi.ReviewOrBuilder getUserReviewOrBuilder() {
      if (userReviewBuilder_ != null) {
        return userReviewBuilder_.getMessageOrBuilder();
      } else {
        return userReview_;
      }
    }
    /**
     * <code>optional .Review userReview = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.Review, com.github.yeriomin.playstoreapi.Review.Builder, com.github.yeriomin.playstoreapi.ReviewOrBuilder> 
        getUserReviewFieldBuilder() {
      if (userReviewBuilder_ == null) {
        userReviewBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.yeriomin.playstoreapi.Review, com.github.yeriomin.playstoreapi.Review.Builder, com.github.yeriomin.playstoreapi.ReviewOrBuilder>(
                userReview_,
                getParentForChildren(),
                isClean());
        userReview_ = null;
      }
      return userReviewBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ReviewResponse)
  }

  static {
    defaultInstance = new ReviewResponse(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ReviewResponse)
}

