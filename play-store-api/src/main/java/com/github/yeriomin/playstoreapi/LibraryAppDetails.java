// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code LibraryAppDetails}
 */
public  final class LibraryAppDetails extends
    com.google.protobuf.GeneratedMessage
    implements LibraryAppDetailsOrBuilder {
  // Use LibraryAppDetails.newBuilder() to construct.
  private LibraryAppDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private LibraryAppDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final LibraryAppDetails defaultInstance;
  public static LibraryAppDetails getDefaultInstance() {
    return defaultInstance;
  }

  public LibraryAppDetails getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private LibraryAppDetails(
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
          case 18: {
            bitField0_ |= 0x00000001;
            certificateHash_ = input.readBytes();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000002;
            refundTimeoutTimestampMsec_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            postDeliveryRefundWindowMsec_ = input.readInt64();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibraryAppDetails_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibraryAppDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.LibraryAppDetails.class, com.github.yeriomin.playstoreapi.LibraryAppDetails.Builder.class);
  }

  public static com.google.protobuf.Parser<LibraryAppDetails> PARSER =
      new com.google.protobuf.AbstractParser<LibraryAppDetails>() {
    public LibraryAppDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LibraryAppDetails(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<LibraryAppDetails> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional string certificateHash = 2;
  public static final int CERTIFICATEHASH_FIELD_NUMBER = 2;
  private java.lang.Object certificateHash_;
  /**
   * <code>optional string certificateHash = 2;</code>
   */
  public boolean hasCertificateHash() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string certificateHash = 2;</code>
   */
  public java.lang.String getCertificateHash() {
    java.lang.Object ref = certificateHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        certificateHash_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string certificateHash = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCertificateHashBytes() {
    java.lang.Object ref = certificateHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certificateHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional int64 refundTimeoutTimestampMsec = 3;
  public static final int REFUNDTIMEOUTTIMESTAMPMSEC_FIELD_NUMBER = 3;
  private long refundTimeoutTimestampMsec_;
  /**
   * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
   */
  public boolean hasRefundTimeoutTimestampMsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
   */
  public long getRefundTimeoutTimestampMsec() {
    return refundTimeoutTimestampMsec_;
  }

  // optional int64 postDeliveryRefundWindowMsec = 4;
  public static final int POSTDELIVERYREFUNDWINDOWMSEC_FIELD_NUMBER = 4;
  private long postDeliveryRefundWindowMsec_;
  /**
   * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
   */
  public boolean hasPostDeliveryRefundWindowMsec() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
   */
  public long getPostDeliveryRefundWindowMsec() {
    return postDeliveryRefundWindowMsec_;
  }

  private void initFields() {
    certificateHash_ = "";
    refundTimeoutTimestampMsec_ = 0L;
    postDeliveryRefundWindowMsec_ = 0L;
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
      output.writeBytes(2, getCertificateHashBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(3, refundTimeoutTimestampMsec_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(4, postDeliveryRefundWindowMsec_);
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
        .computeBytesSize(2, getCertificateHashBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, refundTimeoutTimestampMsec_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, postDeliveryRefundWindowMsec_);
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

  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.LibraryAppDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.LibraryAppDetails prototype) {
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
   * Protobuf type {@code LibraryAppDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.LibraryAppDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibraryAppDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibraryAppDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.LibraryAppDetails.class, com.github.yeriomin.playstoreapi.LibraryAppDetails.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.LibraryAppDetails.newBuilder()
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
      certificateHash_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      refundTimeoutTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      postDeliveryRefundWindowMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibraryAppDetails_descriptor;
    }

    public com.github.yeriomin.playstoreapi.LibraryAppDetails getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.LibraryAppDetails.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.LibraryAppDetails build() {
      com.github.yeriomin.playstoreapi.LibraryAppDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.LibraryAppDetails buildPartial() {
      com.github.yeriomin.playstoreapi.LibraryAppDetails result = new com.github.yeriomin.playstoreapi.LibraryAppDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.certificateHash_ = certificateHash_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.refundTimeoutTimestampMsec_ = refundTimeoutTimestampMsec_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.postDeliveryRefundWindowMsec_ = postDeliveryRefundWindowMsec_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.LibraryAppDetails) {
        return mergeFrom((com.github.yeriomin.playstoreapi.LibraryAppDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.LibraryAppDetails other) {
      if (other == com.github.yeriomin.playstoreapi.LibraryAppDetails.getDefaultInstance()) return this;
      if (other.hasCertificateHash()) {
        bitField0_ |= 0x00000001;
        certificateHash_ = other.certificateHash_;
        onChanged();
      }
      if (other.hasRefundTimeoutTimestampMsec()) {
        setRefundTimeoutTimestampMsec(other.getRefundTimeoutTimestampMsec());
      }
      if (other.hasPostDeliveryRefundWindowMsec()) {
        setPostDeliveryRefundWindowMsec(other.getPostDeliveryRefundWindowMsec());
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
      com.github.yeriomin.playstoreapi.LibraryAppDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.LibraryAppDetails) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional string certificateHash = 2;
    private java.lang.Object certificateHash_ = "";
    /**
     * <code>optional string certificateHash = 2;</code>
     */
    public boolean hasCertificateHash() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string certificateHash = 2;</code>
     */
    public java.lang.String getCertificateHash() {
      java.lang.Object ref = certificateHash_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        certificateHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string certificateHash = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCertificateHashBytes() {
      java.lang.Object ref = certificateHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certificateHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string certificateHash = 2;</code>
     */
    public Builder setCertificateHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      certificateHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string certificateHash = 2;</code>
     */
    public Builder clearCertificateHash() {
      bitField0_ = (bitField0_ & ~0x00000001);
      certificateHash_ = getDefaultInstance().getCertificateHash();
      onChanged();
      return this;
    }
    /**
     * <code>optional string certificateHash = 2;</code>
     */
    public Builder setCertificateHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      certificateHash_ = value;
      onChanged();
      return this;
    }

    // optional int64 refundTimeoutTimestampMsec = 3;
    private long refundTimeoutTimestampMsec_ ;
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
     */
    public boolean hasRefundTimeoutTimestampMsec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
     */
    public long getRefundTimeoutTimestampMsec() {
      return refundTimeoutTimestampMsec_;
    }
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
     */
    public Builder setRefundTimeoutTimestampMsec(long value) {
      bitField0_ |= 0x00000002;
      refundTimeoutTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 3;</code>
     */
    public Builder clearRefundTimeoutTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      refundTimeoutTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    // optional int64 postDeliveryRefundWindowMsec = 4;
    private long postDeliveryRefundWindowMsec_ ;
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
     */
    public boolean hasPostDeliveryRefundWindowMsec() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
     */
    public long getPostDeliveryRefundWindowMsec() {
      return postDeliveryRefundWindowMsec_;
    }
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
     */
    public Builder setPostDeliveryRefundWindowMsec(long value) {
      bitField0_ |= 0x00000004;
      postDeliveryRefundWindowMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 4;</code>
     */
    public Builder clearPostDeliveryRefundWindowMsec() {
      bitField0_ = (bitField0_ & ~0x00000004);
      postDeliveryRefundWindowMsec_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:LibraryAppDetails)
  }

  static {
    defaultInstance = new LibraryAppDetails(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:LibraryAppDetails)
}

