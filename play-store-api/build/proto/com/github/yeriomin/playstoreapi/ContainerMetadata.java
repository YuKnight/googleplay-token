// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code ContainerMetadata}
 */
public  final class ContainerMetadata extends
    com.google.protobuf.GeneratedMessage
    implements ContainerMetadataOrBuilder {
  // Use ContainerMetadata.newBuilder() to construct.
  private ContainerMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ContainerMetadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ContainerMetadata defaultInstance;
  public static ContainerMetadata getDefaultInstance() {
    return defaultInstance;
  }

  public ContainerMetadata getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ContainerMetadata(
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
            browseUrl_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            nextPageUrl_ = input.readBytes();
            break;
          }
          case 25: {
            bitField0_ |= 0x00000004;
            relevance_ = input.readDouble();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            estimatedResults_ = input.readInt64();
            break;
          }
          case 42: {
            bitField0_ |= 0x00000010;
            analyticsCookie_ = input.readBytes();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            ordered_ = input.readBool();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ContainerMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ContainerMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.ContainerMetadata.class, com.github.yeriomin.playstoreapi.ContainerMetadata.Builder.class);
  }

  public static com.google.protobuf.Parser<ContainerMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ContainerMetadata>() {
    public ContainerMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContainerMetadata(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerMetadata> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional string browseUrl = 1;
  public static final int BROWSEURL_FIELD_NUMBER = 1;
  private java.lang.Object browseUrl_;
  /**
   * <code>optional string browseUrl = 1;</code>
   */
  public boolean hasBrowseUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string browseUrl = 1;</code>
   */
  public java.lang.String getBrowseUrl() {
    java.lang.Object ref = browseUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        browseUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string browseUrl = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBrowseUrlBytes() {
    java.lang.Object ref = browseUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      browseUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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

  // optional double relevance = 3;
  public static final int RELEVANCE_FIELD_NUMBER = 3;
  private double relevance_;
  /**
   * <code>optional double relevance = 3;</code>
   */
  public boolean hasRelevance() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional double relevance = 3;</code>
   */
  public double getRelevance() {
    return relevance_;
  }

  // optional int64 estimatedResults = 4;
  public static final int ESTIMATEDRESULTS_FIELD_NUMBER = 4;
  private long estimatedResults_;
  /**
   * <code>optional int64 estimatedResults = 4;</code>
   */
  public boolean hasEstimatedResults() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 estimatedResults = 4;</code>
   */
  public long getEstimatedResults() {
    return estimatedResults_;
  }

  // optional string analyticsCookie = 5;
  public static final int ANALYTICSCOOKIE_FIELD_NUMBER = 5;
  private java.lang.Object analyticsCookie_;
  /**
   * <code>optional string analyticsCookie = 5;</code>
   */
  public boolean hasAnalyticsCookie() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string analyticsCookie = 5;</code>
   */
  public java.lang.String getAnalyticsCookie() {
    java.lang.Object ref = analyticsCookie_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        analyticsCookie_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string analyticsCookie = 5;</code>
   */
  public com.google.protobuf.ByteString
      getAnalyticsCookieBytes() {
    java.lang.Object ref = analyticsCookie_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      analyticsCookie_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional bool ordered = 6;
  public static final int ORDERED_FIELD_NUMBER = 6;
  private boolean ordered_;
  /**
   * <code>optional bool ordered = 6;</code>
   */
  public boolean hasOrdered() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional bool ordered = 6;</code>
   */
  public boolean getOrdered() {
    return ordered_;
  }

  private void initFields() {
    browseUrl_ = "";
    nextPageUrl_ = "";
    relevance_ = 0D;
    estimatedResults_ = 0L;
    analyticsCookie_ = "";
    ordered_ = false;
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
      output.writeBytes(1, getBrowseUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getNextPageUrlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeDouble(3, relevance_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, estimatedResults_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeBytes(5, getAnalyticsCookieBytes());
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeBool(6, ordered_);
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
        .computeBytesSize(1, getBrowseUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNextPageUrlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, relevance_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, estimatedResults_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, getAnalyticsCookieBytes());
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, ordered_);
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

  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ContainerMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.ContainerMetadata prototype) {
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
   * Protobuf type {@code ContainerMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.ContainerMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ContainerMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ContainerMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.ContainerMetadata.class, com.github.yeriomin.playstoreapi.ContainerMetadata.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.ContainerMetadata.newBuilder()
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
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      browseUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      relevance_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000004);
      estimatedResults_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      analyticsCookie_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      ordered_ = false;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ContainerMetadata_descriptor;
    }

    public com.github.yeriomin.playstoreapi.ContainerMetadata getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.ContainerMetadata.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.ContainerMetadata build() {
      com.github.yeriomin.playstoreapi.ContainerMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.ContainerMetadata buildPartial() {
      com.github.yeriomin.playstoreapi.ContainerMetadata result = new com.github.yeriomin.playstoreapi.ContainerMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.browseUrl_ = browseUrl_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.nextPageUrl_ = nextPageUrl_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.relevance_ = relevance_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.estimatedResults_ = estimatedResults_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.analyticsCookie_ = analyticsCookie_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.ordered_ = ordered_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.ContainerMetadata) {
        return mergeFrom((com.github.yeriomin.playstoreapi.ContainerMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.ContainerMetadata other) {
      if (other == com.github.yeriomin.playstoreapi.ContainerMetadata.getDefaultInstance()) return this;
      if (other.hasBrowseUrl()) {
        bitField0_ |= 0x00000001;
        browseUrl_ = other.browseUrl_;
        onChanged();
      }
      if (other.hasNextPageUrl()) {
        bitField0_ |= 0x00000002;
        nextPageUrl_ = other.nextPageUrl_;
        onChanged();
      }
      if (other.hasRelevance()) {
        setRelevance(other.getRelevance());
      }
      if (other.hasEstimatedResults()) {
        setEstimatedResults(other.getEstimatedResults());
      }
      if (other.hasAnalyticsCookie()) {
        bitField0_ |= 0x00000010;
        analyticsCookie_ = other.analyticsCookie_;
        onChanged();
      }
      if (other.hasOrdered()) {
        setOrdered(other.getOrdered());
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
      com.github.yeriomin.playstoreapi.ContainerMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.ContainerMetadata) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional string browseUrl = 1;
    private java.lang.Object browseUrl_ = "";
    /**
     * <code>optional string browseUrl = 1;</code>
     */
    public boolean hasBrowseUrl() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string browseUrl = 1;</code>
     */
    public java.lang.String getBrowseUrl() {
      java.lang.Object ref = browseUrl_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        browseUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string browseUrl = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBrowseUrlBytes() {
      java.lang.Object ref = browseUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        browseUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string browseUrl = 1;</code>
     */
    public Builder setBrowseUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      browseUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string browseUrl = 1;</code>
     */
    public Builder clearBrowseUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      browseUrl_ = getDefaultInstance().getBrowseUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string browseUrl = 1;</code>
     */
    public Builder setBrowseUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      browseUrl_ = value;
      onChanged();
      return this;
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

    // optional double relevance = 3;
    private double relevance_ ;
    /**
     * <code>optional double relevance = 3;</code>
     */
    public boolean hasRelevance() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional double relevance = 3;</code>
     */
    public double getRelevance() {
      return relevance_;
    }
    /**
     * <code>optional double relevance = 3;</code>
     */
    public Builder setRelevance(double value) {
      bitField0_ |= 0x00000004;
      relevance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double relevance = 3;</code>
     */
    public Builder clearRelevance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      relevance_ = 0D;
      onChanged();
      return this;
    }

    // optional int64 estimatedResults = 4;
    private long estimatedResults_ ;
    /**
     * <code>optional int64 estimatedResults = 4;</code>
     */
    public boolean hasEstimatedResults() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 estimatedResults = 4;</code>
     */
    public long getEstimatedResults() {
      return estimatedResults_;
    }
    /**
     * <code>optional int64 estimatedResults = 4;</code>
     */
    public Builder setEstimatedResults(long value) {
      bitField0_ |= 0x00000008;
      estimatedResults_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 estimatedResults = 4;</code>
     */
    public Builder clearEstimatedResults() {
      bitField0_ = (bitField0_ & ~0x00000008);
      estimatedResults_ = 0L;
      onChanged();
      return this;
    }

    // optional string analyticsCookie = 5;
    private java.lang.Object analyticsCookie_ = "";
    /**
     * <code>optional string analyticsCookie = 5;</code>
     */
    public boolean hasAnalyticsCookie() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string analyticsCookie = 5;</code>
     */
    public java.lang.String getAnalyticsCookie() {
      java.lang.Object ref = analyticsCookie_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        analyticsCookie_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string analyticsCookie = 5;</code>
     */
    public com.google.protobuf.ByteString
        getAnalyticsCookieBytes() {
      java.lang.Object ref = analyticsCookie_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        analyticsCookie_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string analyticsCookie = 5;</code>
     */
    public Builder setAnalyticsCookie(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      analyticsCookie_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string analyticsCookie = 5;</code>
     */
    public Builder clearAnalyticsCookie() {
      bitField0_ = (bitField0_ & ~0x00000010);
      analyticsCookie_ = getDefaultInstance().getAnalyticsCookie();
      onChanged();
      return this;
    }
    /**
     * <code>optional string analyticsCookie = 5;</code>
     */
    public Builder setAnalyticsCookieBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      analyticsCookie_ = value;
      onChanged();
      return this;
    }

    // optional bool ordered = 6;
    private boolean ordered_ ;
    /**
     * <code>optional bool ordered = 6;</code>
     */
    public boolean hasOrdered() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool ordered = 6;</code>
     */
    public boolean getOrdered() {
      return ordered_;
    }
    /**
     * <code>optional bool ordered = 6;</code>
     */
    public Builder setOrdered(boolean value) {
      bitField0_ |= 0x00000020;
      ordered_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool ordered = 6;</code>
     */
    public Builder clearOrdered() {
      bitField0_ = (bitField0_ & ~0x00000020);
      ordered_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ContainerMetadata)
  }

  static {
    defaultInstance = new ContainerMetadata(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ContainerMetadata)
}

