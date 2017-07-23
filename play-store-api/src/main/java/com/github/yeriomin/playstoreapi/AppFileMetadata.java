// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code AppFileMetadata}
 */
public  final class AppFileMetadata extends
    com.google.protobuf.GeneratedMessage
    implements AppFileMetadataOrBuilder {
  // Use AppFileMetadata.newBuilder() to construct.
  private AppFileMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AppFileMetadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AppFileMetadata defaultInstance;
  public static AppFileMetadata getDefaultInstance() {
    return defaultInstance;
  }

  public AppFileMetadata getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AppFileMetadata(
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
            fileType_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            versionCode_ = input.readInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            size_ = input.readInt64();
            break;
          }
          case 34: {
            bitField0_ |= 0x00000008;
            downloadUrl_ = input.readBytes();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AppFileMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AppFileMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.AppFileMetadata.class, com.github.yeriomin.playstoreapi.AppFileMetadata.Builder.class);
  }

  public static com.google.protobuf.Parser<AppFileMetadata> PARSER =
      new com.google.protobuf.AbstractParser<AppFileMetadata>() {
    public AppFileMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppFileMetadata(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AppFileMetadata> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 fileType = 1;
  public static final int FILETYPE_FIELD_NUMBER = 1;
  private int fileType_;
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  public boolean hasFileType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  public int getFileType() {
    return fileType_;
  }

  // optional int32 versionCode = 2;
  public static final int VERSIONCODE_FIELD_NUMBER = 2;
  private int versionCode_;
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  public boolean hasVersionCode() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  public int getVersionCode() {
    return versionCode_;
  }

  // optional int64 size = 3;
  public static final int SIZE_FIELD_NUMBER = 3;
  private long size_;
  /**
   * <code>optional int64 size = 3;</code>
   */
  public boolean hasSize() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 size = 3;</code>
   */
  public long getSize() {
    return size_;
  }

  // optional string downloadUrl = 4;
  public static final int DOWNLOADURL_FIELD_NUMBER = 4;
  private java.lang.Object downloadUrl_;
  /**
   * <code>optional string downloadUrl = 4;</code>
   */
  public boolean hasDownloadUrl() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string downloadUrl = 4;</code>
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
   * <code>optional string downloadUrl = 4;</code>
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

  private void initFields() {
    fileType_ = 0;
    versionCode_ = 0;
    size_ = 0L;
    downloadUrl_ = "";
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
      output.writeInt32(1, fileType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, versionCode_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, size_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBytes(4, getDownloadUrlBytes());
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
        .computeInt32Size(1, fileType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, versionCode_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, size_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, getDownloadUrlBytes());
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

  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.AppFileMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.AppFileMetadata prototype) {
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
   * Protobuf type {@code AppFileMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.AppFileMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AppFileMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AppFileMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.AppFileMetadata.class, com.github.yeriomin.playstoreapi.AppFileMetadata.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.AppFileMetadata.newBuilder()
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
      fileType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      versionCode_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      size_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      downloadUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_AppFileMetadata_descriptor;
    }

    public com.github.yeriomin.playstoreapi.AppFileMetadata getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.AppFileMetadata.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.AppFileMetadata build() {
      com.github.yeriomin.playstoreapi.AppFileMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.AppFileMetadata buildPartial() {
      com.github.yeriomin.playstoreapi.AppFileMetadata result = new com.github.yeriomin.playstoreapi.AppFileMetadata(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.fileType_ = fileType_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.versionCode_ = versionCode_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.size_ = size_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.downloadUrl_ = downloadUrl_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.AppFileMetadata) {
        return mergeFrom((com.github.yeriomin.playstoreapi.AppFileMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.AppFileMetadata other) {
      if (other == com.github.yeriomin.playstoreapi.AppFileMetadata.getDefaultInstance()) return this;
      if (other.hasFileType()) {
        setFileType(other.getFileType());
      }
      if (other.hasVersionCode()) {
        setVersionCode(other.getVersionCode());
      }
      if (other.hasSize()) {
        setSize(other.getSize());
      }
      if (other.hasDownloadUrl()) {
        bitField0_ |= 0x00000008;
        downloadUrl_ = other.downloadUrl_;
        onChanged();
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
      com.github.yeriomin.playstoreapi.AppFileMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.AppFileMetadata) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 fileType = 1;
    private int fileType_ ;
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public boolean hasFileType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public int getFileType() {
      return fileType_;
    }
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public Builder setFileType(int value) {
      bitField0_ |= 0x00000001;
      fileType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 fileType = 1;</code>
     */
    public Builder clearFileType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fileType_ = 0;
      onChanged();
      return this;
    }

    // optional int32 versionCode = 2;
    private int versionCode_ ;
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public boolean hasVersionCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public int getVersionCode() {
      return versionCode_;
    }
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public Builder setVersionCode(int value) {
      bitField0_ |= 0x00000002;
      versionCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 versionCode = 2;</code>
     */
    public Builder clearVersionCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      versionCode_ = 0;
      onChanged();
      return this;
    }

    // optional int64 size = 3;
    private long size_ ;
    /**
     * <code>optional int64 size = 3;</code>
     */
    public boolean hasSize() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 size = 3;</code>
     */
    public long getSize() {
      return size_;
    }
    /**
     * <code>optional int64 size = 3;</code>
     */
    public Builder setSize(long value) {
      bitField0_ |= 0x00000004;
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 size = 3;</code>
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      size_ = 0L;
      onChanged();
      return this;
    }

    // optional string downloadUrl = 4;
    private java.lang.Object downloadUrl_ = "";
    /**
     * <code>optional string downloadUrl = 4;</code>
     */
    public boolean hasDownloadUrl() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string downloadUrl = 4;</code>
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
     * <code>optional string downloadUrl = 4;</code>
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
     * <code>optional string downloadUrl = 4;</code>
     */
    public Builder setDownloadUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      downloadUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string downloadUrl = 4;</code>
     */
    public Builder clearDownloadUrl() {
      bitField0_ = (bitField0_ & ~0x00000008);
      downloadUrl_ = getDefaultInstance().getDownloadUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string downloadUrl = 4;</code>
     */
    public Builder setDownloadUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      downloadUrl_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AppFileMetadata)
  }

  static {
    defaultInstance = new AppFileMetadata(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AppFileMetadata)
}

