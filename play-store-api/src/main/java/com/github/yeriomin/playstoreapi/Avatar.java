// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code Avatar}
 */
public  final class Avatar extends
    com.google.protobuf.GeneratedMessage
    implements AvatarOrBuilder {
  // Use Avatar.newBuilder() to construct.
  private Avatar(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Avatar(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Avatar defaultInstance;
  public static Avatar getDefaultInstance() {
    return defaultInstance;
  }

  public Avatar getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Avatar(
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
            unknown1_ = input.readInt32();
            break;
          }
          case 42: {
            bitField0_ |= 0x00000002;
            url_ = input.readBytes();
            break;
          }
          case 58: {
            bitField0_ |= 0x00000004;
            secureUrl_ = input.readBytes();
            break;
          }
          case 72: {
            bitField0_ |= 0x00000008;
            unknown2_ = input.readBool();
            break;
          }
          case 176: {
            bitField0_ |= 0x00000010;
            unknown3_ = input.readBool();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_Avatar_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_Avatar_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.Avatar.class, com.github.yeriomin.playstoreapi.Avatar.Builder.class);
  }

  public static com.google.protobuf.Parser<Avatar> PARSER =
      new com.google.protobuf.AbstractParser<Avatar>() {
    public Avatar parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Avatar(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Avatar> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int32 unknown1 = 1;
  public static final int UNKNOWN1_FIELD_NUMBER = 1;
  private int unknown1_;
  /**
   * <code>optional int32 unknown1 = 1;</code>
   */
  public boolean hasUnknown1() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 unknown1 = 1;</code>
   */
  public int getUnknown1() {
    return unknown1_;
  }

  // optional string url = 5;
  public static final int URL_FIELD_NUMBER = 5;
  private java.lang.Object url_;
  /**
   * <code>optional string url = 5;</code>
   */
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string url = 5;</code>
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
   * <code>optional string url = 5;</code>
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

  // optional string secureUrl = 7;
  public static final int SECUREURL_FIELD_NUMBER = 7;
  private java.lang.Object secureUrl_;
  /**
   * <code>optional string secureUrl = 7;</code>
   */
  public boolean hasSecureUrl() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string secureUrl = 7;</code>
   */
  public java.lang.String getSecureUrl() {
    java.lang.Object ref = secureUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        secureUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string secureUrl = 7;</code>
   */
  public com.google.protobuf.ByteString
      getSecureUrlBytes() {
    java.lang.Object ref = secureUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secureUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional bool unknown2 = 9;
  public static final int UNKNOWN2_FIELD_NUMBER = 9;
  private boolean unknown2_;
  /**
   * <code>optional bool unknown2 = 9;</code>
   */
  public boolean hasUnknown2() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional bool unknown2 = 9;</code>
   */
  public boolean getUnknown2() {
    return unknown2_;
  }

  // optional bool unknown3 = 22;
  public static final int UNKNOWN3_FIELD_NUMBER = 22;
  private boolean unknown3_;
  /**
   * <code>optional bool unknown3 = 22;</code>
   */
  public boolean hasUnknown3() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional bool unknown3 = 22;</code>
   */
  public boolean getUnknown3() {
    return unknown3_;
  }

  private void initFields() {
    unknown1_ = 0;
    url_ = "";
    secureUrl_ = "";
    unknown2_ = false;
    unknown3_ = false;
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
      output.writeInt32(1, unknown1_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(5, getUrlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(7, getSecureUrlBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBool(9, unknown2_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeBool(22, unknown3_);
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
        .computeInt32Size(1, unknown1_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, getUrlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, getSecureUrlBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, unknown2_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(22, unknown3_);
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

  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.Avatar parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.Avatar prototype) {
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
   * Protobuf type {@code Avatar}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.AvatarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_Avatar_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_Avatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.Avatar.class, com.github.yeriomin.playstoreapi.Avatar.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.Avatar.newBuilder()
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
      unknown1_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      url_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      secureUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      unknown2_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      unknown3_ = false;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_Avatar_descriptor;
    }

    public com.github.yeriomin.playstoreapi.Avatar getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.Avatar.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.Avatar build() {
      com.github.yeriomin.playstoreapi.Avatar result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.Avatar buildPartial() {
      com.github.yeriomin.playstoreapi.Avatar result = new com.github.yeriomin.playstoreapi.Avatar(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.unknown1_ = unknown1_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.url_ = url_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.secureUrl_ = secureUrl_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.unknown2_ = unknown2_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.unknown3_ = unknown3_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.Avatar) {
        return mergeFrom((com.github.yeriomin.playstoreapi.Avatar)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.Avatar other) {
      if (other == com.github.yeriomin.playstoreapi.Avatar.getDefaultInstance()) return this;
      if (other.hasUnknown1()) {
        setUnknown1(other.getUnknown1());
      }
      if (other.hasUrl()) {
        bitField0_ |= 0x00000002;
        url_ = other.url_;
        onChanged();
      }
      if (other.hasSecureUrl()) {
        bitField0_ |= 0x00000004;
        secureUrl_ = other.secureUrl_;
        onChanged();
      }
      if (other.hasUnknown2()) {
        setUnknown2(other.getUnknown2());
      }
      if (other.hasUnknown3()) {
        setUnknown3(other.getUnknown3());
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
      com.github.yeriomin.playstoreapi.Avatar parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.Avatar) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int32 unknown1 = 1;
    private int unknown1_ ;
    /**
     * <code>optional int32 unknown1 = 1;</code>
     */
    public boolean hasUnknown1() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 unknown1 = 1;</code>
     */
    public int getUnknown1() {
      return unknown1_;
    }
    /**
     * <code>optional int32 unknown1 = 1;</code>
     */
    public Builder setUnknown1(int value) {
      bitField0_ |= 0x00000001;
      unknown1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 unknown1 = 1;</code>
     */
    public Builder clearUnknown1() {
      bitField0_ = (bitField0_ & ~0x00000001);
      unknown1_ = 0;
      onChanged();
      return this;
    }

    // optional string url = 5;
    private java.lang.Object url_ = "";
    /**
     * <code>optional string url = 5;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string url = 5;</code>
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
     * <code>optional string url = 5;</code>
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
     * <code>optional string url = 5;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string url = 5;</code>
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string url = 5;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      url_ = value;
      onChanged();
      return this;
    }

    // optional string secureUrl = 7;
    private java.lang.Object secureUrl_ = "";
    /**
     * <code>optional string secureUrl = 7;</code>
     */
    public boolean hasSecureUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string secureUrl = 7;</code>
     */
    public java.lang.String getSecureUrl() {
      java.lang.Object ref = secureUrl_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        secureUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string secureUrl = 7;</code>
     */
    public com.google.protobuf.ByteString
        getSecureUrlBytes() {
      java.lang.Object ref = secureUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secureUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string secureUrl = 7;</code>
     */
    public Builder setSecureUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      secureUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string secureUrl = 7;</code>
     */
    public Builder clearSecureUrl() {
      bitField0_ = (bitField0_ & ~0x00000004);
      secureUrl_ = getDefaultInstance().getSecureUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string secureUrl = 7;</code>
     */
    public Builder setSecureUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      secureUrl_ = value;
      onChanged();
      return this;
    }

    // optional bool unknown2 = 9;
    private boolean unknown2_ ;
    /**
     * <code>optional bool unknown2 = 9;</code>
     */
    public boolean hasUnknown2() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool unknown2 = 9;</code>
     */
    public boolean getUnknown2() {
      return unknown2_;
    }
    /**
     * <code>optional bool unknown2 = 9;</code>
     */
    public Builder setUnknown2(boolean value) {
      bitField0_ |= 0x00000008;
      unknown2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool unknown2 = 9;</code>
     */
    public Builder clearUnknown2() {
      bitField0_ = (bitField0_ & ~0x00000008);
      unknown2_ = false;
      onChanged();
      return this;
    }

    // optional bool unknown3 = 22;
    private boolean unknown3_ ;
    /**
     * <code>optional bool unknown3 = 22;</code>
     */
    public boolean hasUnknown3() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool unknown3 = 22;</code>
     */
    public boolean getUnknown3() {
      return unknown3_;
    }
    /**
     * <code>optional bool unknown3 = 22;</code>
     */
    public Builder setUnknown3(boolean value) {
      bitField0_ |= 0x00000010;
      unknown3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool unknown3 = 22;</code>
     */
    public Builder clearUnknown3() {
      bitField0_ = (bitField0_ & ~0x00000010);
      unknown3_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Avatar)
  }

  static {
    defaultInstance = new Avatar(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Avatar)
}

