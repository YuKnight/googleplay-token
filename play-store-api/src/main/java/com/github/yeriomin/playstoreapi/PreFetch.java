// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code PreFetch}
 */
public  final class PreFetch extends
    com.google.protobuf.GeneratedMessage
    implements PreFetchOrBuilder {
  // Use PreFetch.newBuilder() to construct.
  private PreFetch(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private PreFetch(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final PreFetch defaultInstance;
  public static PreFetch getDefaultInstance() {
    return defaultInstance;
  }

  public PreFetch getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private PreFetch(
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
            bitField0_ |= 0x00000001;
            url_ = input.readBytes();
            break;
          }
          case 18: {
            com.github.yeriomin.playstoreapi.ResponseWrapper.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = response_.toBuilder();
            }
            response_ = input.readMessage(com.github.yeriomin.playstoreapi.ResponseWrapper.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(response_);
              response_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            etag_ = input.readBytes();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            ttl_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            softTtl_ = input.readInt64();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PreFetch_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PreFetch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.PreFetch.class, com.github.yeriomin.playstoreapi.PreFetch.Builder.class);
  }

  public static com.google.protobuf.Parser<PreFetch> PARSER =
      new com.google.protobuf.AbstractParser<PreFetch>() {
    public PreFetch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PreFetch(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PreFetch> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional string url = 1;
  public static final int URL_FIELD_NUMBER = 1;
  private java.lang.Object url_;
  /**
   * <code>optional string url = 1;</code>
   */
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        url_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional .ResponseWrapper response = 2;
  public static final int RESPONSE_FIELD_NUMBER = 2;
  private com.github.yeriomin.playstoreapi.ResponseWrapper response_;
  /**
   * <code>optional .ResponseWrapper response = 2;</code>
   */
  public boolean hasResponse() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .ResponseWrapper response = 2;</code>
   */
  public com.github.yeriomin.playstoreapi.ResponseWrapper getResponse() {
    return response_;
  }
  /**
   * <code>optional .ResponseWrapper response = 2;</code>
   */
  public com.github.yeriomin.playstoreapi.ResponseWrapperOrBuilder getResponseOrBuilder() {
    return response_;
  }

  // optional string etag = 3;
  public static final int ETAG_FIELD_NUMBER = 3;
  private java.lang.Object etag_;
  /**
   * <code>optional string etag = 3;</code>
   */
  public boolean hasEtag() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string etag = 3;</code>
   */
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        etag_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string etag = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional int64 ttl = 4;
  public static final int TTL_FIELD_NUMBER = 4;
  private long ttl_;
  /**
   * <code>optional int64 ttl = 4;</code>
   */
  public boolean hasTtl() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 ttl = 4;</code>
   */
  public long getTtl() {
    return ttl_;
  }

  // optional int64 softTtl = 5;
  public static final int SOFTTTL_FIELD_NUMBER = 5;
  private long softTtl_;
  /**
   * <code>optional int64 softTtl = 5;</code>
   */
  public boolean hasSoftTtl() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int64 softTtl = 5;</code>
   */
  public long getSoftTtl() {
    return softTtl_;
  }

  private void initFields() {
    url_ = "";
    response_ = com.github.yeriomin.playstoreapi.ResponseWrapper.getDefaultInstance();
    etag_ = "";
    ttl_ = 0L;
    softTtl_ = 0L;
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
      output.writeBytes(1, getUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, response_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getEtagBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, ttl_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt64(5, softTtl_);
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
        .computeBytesSize(1, getUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, response_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getEtagBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, ttl_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, softTtl_);
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

  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PreFetch parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.PreFetch prototype) {
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
   * Protobuf type {@code PreFetch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.PreFetchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PreFetch_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PreFetch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.PreFetch.class, com.github.yeriomin.playstoreapi.PreFetch.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.PreFetch.newBuilder()
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
        getResponseFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (responseBuilder_ == null) {
        response_ = com.github.yeriomin.playstoreapi.ResponseWrapper.getDefaultInstance();
      } else {
        responseBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      etag_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      ttl_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      softTtl_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PreFetch_descriptor;
    }

    public com.github.yeriomin.playstoreapi.PreFetch getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.PreFetch.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.PreFetch build() {
      com.github.yeriomin.playstoreapi.PreFetch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.PreFetch buildPartial() {
      com.github.yeriomin.playstoreapi.PreFetch result = new com.github.yeriomin.playstoreapi.PreFetch(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.url_ = url_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (responseBuilder_ == null) {
        result.response_ = response_;
      } else {
        result.response_ = responseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.etag_ = etag_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.ttl_ = ttl_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.softTtl_ = softTtl_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.PreFetch) {
        return mergeFrom((com.github.yeriomin.playstoreapi.PreFetch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.PreFetch other) {
      if (other == com.github.yeriomin.playstoreapi.PreFetch.getDefaultInstance()) return this;
      if (other.hasUrl()) {
        bitField0_ |= 0x00000001;
        url_ = other.url_;
        onChanged();
      }
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
      }
      if (other.hasEtag()) {
        bitField0_ |= 0x00000004;
        etag_ = other.etag_;
        onChanged();
      }
      if (other.hasTtl()) {
        setTtl(other.getTtl());
      }
      if (other.hasSoftTtl()) {
        setSoftTtl(other.getSoftTtl());
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
      com.github.yeriomin.playstoreapi.PreFetch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.PreFetch) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional string url = 1;
    private java.lang.Object url_ = "";
    /**
     * <code>optional string url = 1;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      url_ = value;
      onChanged();
      return this;
    }

    // optional .ResponseWrapper response = 2;
    private com.github.yeriomin.playstoreapi.ResponseWrapper response_ = com.github.yeriomin.playstoreapi.ResponseWrapper.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.ResponseWrapper, com.github.yeriomin.playstoreapi.ResponseWrapper.Builder, com.github.yeriomin.playstoreapi.ResponseWrapperOrBuilder> responseBuilder_;
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public com.github.yeriomin.playstoreapi.ResponseWrapper getResponse() {
      if (responseBuilder_ == null) {
        return response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public Builder setResponse(com.github.yeriomin.playstoreapi.ResponseWrapper value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public Builder setResponse(
        com.github.yeriomin.playstoreapi.ResponseWrapper.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public Builder mergeResponse(com.github.yeriomin.playstoreapi.ResponseWrapper value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            response_ != com.github.yeriomin.playstoreapi.ResponseWrapper.getDefaultInstance()) {
          response_ =
            com.github.yeriomin.playstoreapi.ResponseWrapper.newBuilder(response_).mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        responseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public Builder clearResponse() {
      if (responseBuilder_ == null) {
        response_ = com.github.yeriomin.playstoreapi.ResponseWrapper.getDefaultInstance();
        onChanged();
      } else {
        responseBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public com.github.yeriomin.playstoreapi.ResponseWrapper.Builder getResponseBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    public com.github.yeriomin.playstoreapi.ResponseWrapperOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_;
      }
    }
    /**
     * <code>optional .ResponseWrapper response = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.ResponseWrapper, com.github.yeriomin.playstoreapi.ResponseWrapper.Builder, com.github.yeriomin.playstoreapi.ResponseWrapperOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.yeriomin.playstoreapi.ResponseWrapper, com.github.yeriomin.playstoreapi.ResponseWrapper.Builder, com.github.yeriomin.playstoreapi.ResponseWrapperOrBuilder>(
                response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
    }

    // optional string etag = 3;
    private java.lang.Object etag_ = "";
    /**
     * <code>optional string etag = 3;</code>
     */
    public boolean hasEtag() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string etag = 3;</code>
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string etag = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string etag = 3;</code>
     */
    public Builder setEtag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      etag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string etag = 3;</code>
     */
    public Builder clearEtag() {
      bitField0_ = (bitField0_ & ~0x00000004);
      etag_ = getDefaultInstance().getEtag();
      onChanged();
      return this;
    }
    /**
     * <code>optional string etag = 3;</code>
     */
    public Builder setEtagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      etag_ = value;
      onChanged();
      return this;
    }

    // optional int64 ttl = 4;
    private long ttl_ ;
    /**
     * <code>optional int64 ttl = 4;</code>
     */
    public boolean hasTtl() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 ttl = 4;</code>
     */
    public long getTtl() {
      return ttl_;
    }
    /**
     * <code>optional int64 ttl = 4;</code>
     */
    public Builder setTtl(long value) {
      bitField0_ |= 0x00000008;
      ttl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 ttl = 4;</code>
     */
    public Builder clearTtl() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ttl_ = 0L;
      onChanged();
      return this;
    }

    // optional int64 softTtl = 5;
    private long softTtl_ ;
    /**
     * <code>optional int64 softTtl = 5;</code>
     */
    public boolean hasSoftTtl() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 softTtl = 5;</code>
     */
    public long getSoftTtl() {
      return softTtl_;
    }
    /**
     * <code>optional int64 softTtl = 5;</code>
     */
    public Builder setSoftTtl(long value) {
      bitField0_ |= 0x00000010;
      softTtl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 softTtl = 5;</code>
     */
    public Builder clearSoftTtl() {
      bitField0_ = (bitField0_ & ~0x00000010);
      softTtl_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:PreFetch)
  }

  static {
    defaultInstance = new PreFetch(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:PreFetch)
}

