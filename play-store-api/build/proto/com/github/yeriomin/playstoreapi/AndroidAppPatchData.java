// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code AndroidAppPatchData}
 */
public  final class AndroidAppPatchData extends
    com.google.protobuf.GeneratedMessage
    implements AndroidAppPatchDataOrBuilder {
  // Use AndroidAppPatchData.newBuilder() to construct.
  private AndroidAppPatchData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AndroidAppPatchData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AndroidAppPatchData defaultInstance;
  public static AndroidAppPatchData getDefaultInstance() {
    return defaultInstance;
  }

  public AndroidAppPatchData getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AndroidAppPatchData(
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
            baseVersionCode_ = input.readInt32();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            baseSignature_ = input.readBytes();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            downloadUrl_ = input.readBytes();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            patchFormat_ = input.readInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            maxPatchSize_ = input.readInt64();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AndroidAppPatchData_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AndroidAppPatchData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.AndroidAppPatchData.class, com.github.yeriomin.playstoreapi.AndroidAppPatchData.Builder.class);
  }

  public static com.google.protobuf.Parser<AndroidAppPatchData> PARSER =
      new com.google.protobuf.AbstractParser<AndroidAppPatchData>() {
    public AndroidAppPatchData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AndroidAppPatchData(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidAppPatchData> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 baseVersionCode = 1;
  public static final int BASEVERSIONCODE_FIELD_NUMBER = 1;
  private int baseVersionCode_;
  /**
   * <code>optional int32 baseVersionCode = 1;</code>
   */
  public boolean hasBaseVersionCode() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 baseVersionCode = 1;</code>
   */
  public int getBaseVersionCode() {
    return baseVersionCode_;
  }

  // optional string baseSignature = 2;
  public static final int BASESIGNATURE_FIELD_NUMBER = 2;
  private java.lang.Object baseSignature_;
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  public boolean hasBaseSignature() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  public java.lang.String getBaseSignature() {
    java.lang.Object ref = baseSignature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        baseSignature_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBaseSignatureBytes() {
    java.lang.Object ref = baseSignature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseSignature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional string downloadUrl = 3;
  public static final int DOWNLOADURL_FIELD_NUMBER = 3;
  private java.lang.Object downloadUrl_;
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  public boolean hasDownloadUrl() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  public java.lang.String getDownloadUrl() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        downloadUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDownloadUrlBytes() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      downloadUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional int32 patchFormat = 4;
  public static final int PATCHFORMAT_FIELD_NUMBER = 4;
  private int patchFormat_;
  /**
   * <code>optional int32 patchFormat = 4;</code>
   */
  public boolean hasPatchFormat() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int32 patchFormat = 4;</code>
   */
  public int getPatchFormat() {
    return patchFormat_;
  }

  // optional int64 maxPatchSize = 5;
  public static final int MAXPATCHSIZE_FIELD_NUMBER = 5;
  private long maxPatchSize_;
  /**
   * <code>optional int64 maxPatchSize = 5;</code>
   */
  public boolean hasMaxPatchSize() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int64 maxPatchSize = 5;</code>
   */
  public long getMaxPatchSize() {
    return maxPatchSize_;
  }

  private void initFields() {
    baseVersionCode_ = 0;
    baseSignature_ = "";
    downloadUrl_ = "";
    patchFormat_ = 0;
    maxPatchSize_ = 0L;
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
      output.writeInt32(1, baseVersionCode_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getBaseSignatureBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getDownloadUrlBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, patchFormat_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt64(5, maxPatchSize_);
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
        .computeInt32Size(1, baseVersionCode_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getBaseSignatureBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getDownloadUrlBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, patchFormat_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, maxPatchSize_);
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

  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.AndroidAppPatchData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.AndroidAppPatchData prototype) {
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
   * Protobuf type {@code AndroidAppPatchData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.AndroidAppPatchDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AndroidAppPatchData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AndroidAppPatchData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.AndroidAppPatchData.class, com.github.yeriomin.playstoreapi.AndroidAppPatchData.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.AndroidAppPatchData.newBuilder()
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
      baseVersionCode_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      baseSignature_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      downloadUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      patchFormat_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      maxPatchSize_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AndroidAppPatchData_descriptor;
    }

    public com.github.yeriomin.playstoreapi.AndroidAppPatchData getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.AndroidAppPatchData.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.AndroidAppPatchData build() {
      com.github.yeriomin.playstoreapi.AndroidAppPatchData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.AndroidAppPatchData buildPartial() {
      com.github.yeriomin.playstoreapi.AndroidAppPatchData result = new com.github.yeriomin.playstoreapi.AndroidAppPatchData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.baseVersionCode_ = baseVersionCode_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.baseSignature_ = baseSignature_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.downloadUrl_ = downloadUrl_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.patchFormat_ = patchFormat_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.maxPatchSize_ = maxPatchSize_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.AndroidAppPatchData) {
        return mergeFrom((com.github.yeriomin.playstoreapi.AndroidAppPatchData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.AndroidAppPatchData other) {
      if (other == com.github.yeriomin.playstoreapi.AndroidAppPatchData.getDefaultInstance()) return this;
      if (other.hasBaseVersionCode()) {
        setBaseVersionCode(other.getBaseVersionCode());
      }
      if (other.hasBaseSignature()) {
        bitField0_ |= 0x00000002;
        baseSignature_ = other.baseSignature_;
        onChanged();
      }
      if (other.hasDownloadUrl()) {
        bitField0_ |= 0x00000004;
        downloadUrl_ = other.downloadUrl_;
        onChanged();
      }
      if (other.hasPatchFormat()) {
        setPatchFormat(other.getPatchFormat());
      }
      if (other.hasMaxPatchSize()) {
        setMaxPatchSize(other.getMaxPatchSize());
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
      com.github.yeriomin.playstoreapi.AndroidAppPatchData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.AndroidAppPatchData) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 baseVersionCode = 1;
    private int baseVersionCode_ ;
    /**
     * <code>optional int32 baseVersionCode = 1;</code>
     */
    public boolean hasBaseVersionCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 baseVersionCode = 1;</code>
     */
    public int getBaseVersionCode() {
      return baseVersionCode_;
    }
    /**
     * <code>optional int32 baseVersionCode = 1;</code>
     */
    public Builder setBaseVersionCode(int value) {
      bitField0_ |= 0x00000001;
      baseVersionCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 baseVersionCode = 1;</code>
     */
    public Builder clearBaseVersionCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      baseVersionCode_ = 0;
      onChanged();
      return this;
    }

    // optional string baseSignature = 2;
    private java.lang.Object baseSignature_ = "";
    /**
     * <code>optional string baseSignature = 2;</code>
     */
    public boolean hasBaseSignature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string baseSignature = 2;</code>
     */
    public java.lang.String getBaseSignature() {
      java.lang.Object ref = baseSignature_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        baseSignature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string baseSignature = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBaseSignatureBytes() {
      java.lang.Object ref = baseSignature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseSignature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string baseSignature = 2;</code>
     */
    public Builder setBaseSignature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      baseSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string baseSignature = 2;</code>
     */
    public Builder clearBaseSignature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      baseSignature_ = getDefaultInstance().getBaseSignature();
      onChanged();
      return this;
    }
    /**
     * <code>optional string baseSignature = 2;</code>
     */
    public Builder setBaseSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      baseSignature_ = value;
      onChanged();
      return this;
    }

    // optional string downloadUrl = 3;
    private java.lang.Object downloadUrl_ = "";
    /**
     * <code>optional string downloadUrl = 3;</code>
     */
    public boolean hasDownloadUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string downloadUrl = 3;</code>
     */
    public java.lang.String getDownloadUrl() {
      java.lang.Object ref = downloadUrl_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        downloadUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string downloadUrl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDownloadUrlBytes() {
      java.lang.Object ref = downloadUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        downloadUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string downloadUrl = 3;</code>
     */
    public Builder setDownloadUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      downloadUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string downloadUrl = 3;</code>
     */
    public Builder clearDownloadUrl() {
      bitField0_ = (bitField0_ & ~0x00000004);
      downloadUrl_ = getDefaultInstance().getDownloadUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string downloadUrl = 3;</code>
     */
    public Builder setDownloadUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      downloadUrl_ = value;
      onChanged();
      return this;
    }

    // optional int32 patchFormat = 4;
    private int patchFormat_ ;
    /**
     * <code>optional int32 patchFormat = 4;</code>
     */
    public boolean hasPatchFormat() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 patchFormat = 4;</code>
     */
    public int getPatchFormat() {
      return patchFormat_;
    }
    /**
     * <code>optional int32 patchFormat = 4;</code>
     */
    public Builder setPatchFormat(int value) {
      bitField0_ |= 0x00000008;
      patchFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 patchFormat = 4;</code>
     */
    public Builder clearPatchFormat() {
      bitField0_ = (bitField0_ & ~0x00000008);
      patchFormat_ = 0;
      onChanged();
      return this;
    }

    // optional int64 maxPatchSize = 5;
    private long maxPatchSize_ ;
    /**
     * <code>optional int64 maxPatchSize = 5;</code>
     */
    public boolean hasMaxPatchSize() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 maxPatchSize = 5;</code>
     */
    public long getMaxPatchSize() {
      return maxPatchSize_;
    }
    /**
     * <code>optional int64 maxPatchSize = 5;</code>
     */
    public Builder setMaxPatchSize(long value) {
      bitField0_ |= 0x00000010;
      maxPatchSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 maxPatchSize = 5;</code>
     */
    public Builder clearMaxPatchSize() {
      bitField0_ = (bitField0_ & ~0x00000010);
      maxPatchSize_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidAppPatchData)
  }

  static {
    defaultInstance = new AndroidAppPatchData(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AndroidAppPatchData)
}

