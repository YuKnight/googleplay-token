// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code ServerCommands}
 */
public  final class ServerCommands extends
    com.google.protobuf.GeneratedMessage
    implements ServerCommandsOrBuilder {
  // Use ServerCommands.newBuilder() to construct.
  private ServerCommands(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ServerCommands(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ServerCommands defaultInstance;
  public static ServerCommands getDefaultInstance() {
    return defaultInstance;
  }

  public ServerCommands getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ServerCommands(
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
            clearCache_ = input.readBool();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            displayErrorMessage_ = input.readBytes();
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            logErrorStacktrace_ = input.readBytes();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ServerCommands_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ServerCommands_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.ServerCommands.class, com.github.yeriomin.playstoreapi.ServerCommands.Builder.class);
  }

  public static com.google.protobuf.Parser<ServerCommands> PARSER =
      new com.google.protobuf.AbstractParser<ServerCommands>() {
    public ServerCommands parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerCommands(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ServerCommands> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional bool clearCache = 1;
  public static final int CLEARCACHE_FIELD_NUMBER = 1;
  private boolean clearCache_;
  /**
   * <code>optional bool clearCache = 1;</code>
   */
  public boolean hasClearCache() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool clearCache = 1;</code>
   */
  public boolean getClearCache() {
    return clearCache_;
  }

  // optional string displayErrorMessage = 2;
  public static final int DISPLAYERRORMESSAGE_FIELD_NUMBER = 2;
  private java.lang.Object displayErrorMessage_;
  /**
   * <code>optional string displayErrorMessage = 2;</code>
   */
  public boolean hasDisplayErrorMessage() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string displayErrorMessage = 2;</code>
   */
  public java.lang.String getDisplayErrorMessage() {
    java.lang.Object ref = displayErrorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        displayErrorMessage_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string displayErrorMessage = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayErrorMessageBytes() {
    java.lang.Object ref = displayErrorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayErrorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  // optional string logErrorStacktrace = 3;
  public static final int LOGERRORSTACKTRACE_FIELD_NUMBER = 3;
  private java.lang.Object logErrorStacktrace_;
  /**
   * <code>optional string logErrorStacktrace = 3;</code>
   */
  public boolean hasLogErrorStacktrace() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string logErrorStacktrace = 3;</code>
   */
  public java.lang.String getLogErrorStacktrace() {
    java.lang.Object ref = logErrorStacktrace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        logErrorStacktrace_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string logErrorStacktrace = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLogErrorStacktraceBytes() {
    java.lang.Object ref = logErrorStacktrace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logErrorStacktrace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    clearCache_ = false;
    displayErrorMessage_ = "";
    logErrorStacktrace_ = "";
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
      output.writeBool(1, clearCache_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getDisplayErrorMessageBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getLogErrorStacktraceBytes());
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
        .computeBoolSize(1, clearCache_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getDisplayErrorMessageBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getLogErrorStacktraceBytes());
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

  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.ServerCommands parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.ServerCommands prototype) {
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
   * Protobuf type {@code ServerCommands}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.ServerCommandsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ServerCommands_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ServerCommands_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.ServerCommands.class, com.github.yeriomin.playstoreapi.ServerCommands.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.ServerCommands.newBuilder()
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
      clearCache_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      displayErrorMessage_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      logErrorStacktrace_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_ServerCommands_descriptor;
    }

    public com.github.yeriomin.playstoreapi.ServerCommands getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.ServerCommands.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.ServerCommands build() {
      com.github.yeriomin.playstoreapi.ServerCommands result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.ServerCommands buildPartial() {
      com.github.yeriomin.playstoreapi.ServerCommands result = new com.github.yeriomin.playstoreapi.ServerCommands(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.clearCache_ = clearCache_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.displayErrorMessage_ = displayErrorMessage_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.logErrorStacktrace_ = logErrorStacktrace_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.ServerCommands) {
        return mergeFrom((com.github.yeriomin.playstoreapi.ServerCommands)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.ServerCommands other) {
      if (other == com.github.yeriomin.playstoreapi.ServerCommands.getDefaultInstance()) return this;
      if (other.hasClearCache()) {
        setClearCache(other.getClearCache());
      }
      if (other.hasDisplayErrorMessage()) {
        bitField0_ |= 0x00000002;
        displayErrorMessage_ = other.displayErrorMessage_;
        onChanged();
      }
      if (other.hasLogErrorStacktrace()) {
        bitField0_ |= 0x00000004;
        logErrorStacktrace_ = other.logErrorStacktrace_;
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
      com.github.yeriomin.playstoreapi.ServerCommands parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.ServerCommands) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional bool clearCache = 1;
    private boolean clearCache_ ;
    /**
     * <code>optional bool clearCache = 1;</code>
     */
    public boolean hasClearCache() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool clearCache = 1;</code>
     */
    public boolean getClearCache() {
      return clearCache_;
    }
    /**
     * <code>optional bool clearCache = 1;</code>
     */
    public Builder setClearCache(boolean value) {
      bitField0_ |= 0x00000001;
      clearCache_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool clearCache = 1;</code>
     */
    public Builder clearClearCache() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clearCache_ = false;
      onChanged();
      return this;
    }

    // optional string displayErrorMessage = 2;
    private java.lang.Object displayErrorMessage_ = "";
    /**
     * <code>optional string displayErrorMessage = 2;</code>
     */
    public boolean hasDisplayErrorMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string displayErrorMessage = 2;</code>
     */
    public java.lang.String getDisplayErrorMessage() {
      java.lang.Object ref = displayErrorMessage_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        displayErrorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string displayErrorMessage = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayErrorMessageBytes() {
      java.lang.Object ref = displayErrorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayErrorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string displayErrorMessage = 2;</code>
     */
    public Builder setDisplayErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      displayErrorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string displayErrorMessage = 2;</code>
     */
    public Builder clearDisplayErrorMessage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      displayErrorMessage_ = getDefaultInstance().getDisplayErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string displayErrorMessage = 2;</code>
     */
    public Builder setDisplayErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      displayErrorMessage_ = value;
      onChanged();
      return this;
    }

    // optional string logErrorStacktrace = 3;
    private java.lang.Object logErrorStacktrace_ = "";
    /**
     * <code>optional string logErrorStacktrace = 3;</code>
     */
    public boolean hasLogErrorStacktrace() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string logErrorStacktrace = 3;</code>
     */
    public java.lang.String getLogErrorStacktrace() {
      java.lang.Object ref = logErrorStacktrace_;
      if (!(ref instanceof java.lang.String)) {
        java.lang.String s = ((com.google.protobuf.ByteString) ref)
            .toStringUtf8();
        logErrorStacktrace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string logErrorStacktrace = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLogErrorStacktraceBytes() {
      java.lang.Object ref = logErrorStacktrace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logErrorStacktrace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string logErrorStacktrace = 3;</code>
     */
    public Builder setLogErrorStacktrace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      logErrorStacktrace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string logErrorStacktrace = 3;</code>
     */
    public Builder clearLogErrorStacktrace() {
      bitField0_ = (bitField0_ & ~0x00000004);
      logErrorStacktrace_ = getDefaultInstance().getLogErrorStacktrace();
      onChanged();
      return this;
    }
    /**
     * <code>optional string logErrorStacktrace = 3;</code>
     */
    public Builder setLogErrorStacktraceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      logErrorStacktrace_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ServerCommands)
  }

  static {
    defaultInstance = new ServerCommands(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ServerCommands)
}
