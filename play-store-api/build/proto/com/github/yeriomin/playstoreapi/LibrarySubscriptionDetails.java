// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code LibrarySubscriptionDetails}
 */
public  final class LibrarySubscriptionDetails extends
    com.google.protobuf.GeneratedMessage
    implements LibrarySubscriptionDetailsOrBuilder {
  // Use LibrarySubscriptionDetails.newBuilder() to construct.
  private LibrarySubscriptionDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private LibrarySubscriptionDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final LibrarySubscriptionDetails defaultInstance;
  public static LibrarySubscriptionDetails getDefaultInstance() {
    return defaultInstance;
  }

  public LibrarySubscriptionDetails getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private LibrarySubscriptionDetails(
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
            initiationTimestampMsec_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            validUntilTimestampMsec_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            autoRenewing_ = input.readBool();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            trialUntilTimestampMsec_ = input.readInt64();
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibrarySubscriptionDetails_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibrarySubscriptionDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.class, com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.Builder.class);
  }

  public static com.google.protobuf.Parser<LibrarySubscriptionDetails> PARSER =
      new com.google.protobuf.AbstractParser<LibrarySubscriptionDetails>() {
    public LibrarySubscriptionDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LibrarySubscriptionDetails(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<LibrarySubscriptionDetails> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional int64 initiationTimestampMsec = 1;
  public static final int INITIATIONTIMESTAMPMSEC_FIELD_NUMBER = 1;
  private long initiationTimestampMsec_;
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  public boolean hasInitiationTimestampMsec() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  public long getInitiationTimestampMsec() {
    return initiationTimestampMsec_;
  }

  // optional int64 validUntilTimestampMsec = 2;
  public static final int VALIDUNTILTIMESTAMPMSEC_FIELD_NUMBER = 2;
  private long validUntilTimestampMsec_;
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  public boolean hasValidUntilTimestampMsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  public long getValidUntilTimestampMsec() {
    return validUntilTimestampMsec_;
  }

  // optional bool autoRenewing = 3;
  public static final int AUTORENEWING_FIELD_NUMBER = 3;
  private boolean autoRenewing_;
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  public boolean hasAutoRenewing() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  public boolean getAutoRenewing() {
    return autoRenewing_;
  }

  // optional int64 trialUntilTimestampMsec = 4;
  public static final int TRIALUNTILTIMESTAMPMSEC_FIELD_NUMBER = 4;
  private long trialUntilTimestampMsec_;
  /**
   * <code>optional int64 trialUntilTimestampMsec = 4;</code>
   */
  public boolean hasTrialUntilTimestampMsec() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 trialUntilTimestampMsec = 4;</code>
   */
  public long getTrialUntilTimestampMsec() {
    return trialUntilTimestampMsec_;
  }

  private void initFields() {
    initiationTimestampMsec_ = 0L;
    validUntilTimestampMsec_ = 0L;
    autoRenewing_ = false;
    trialUntilTimestampMsec_ = 0L;
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
      output.writeInt64(1, initiationTimestampMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, validUntilTimestampMsec_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, autoRenewing_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, trialUntilTimestampMsec_);
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
        .computeInt64Size(1, initiationTimestampMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, validUntilTimestampMsec_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, autoRenewing_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, trialUntilTimestampMsec_);
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

  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails prototype) {
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
   * Protobuf type {@code LibrarySubscriptionDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.LibrarySubscriptionDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibrarySubscriptionDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibrarySubscriptionDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.class, com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.newBuilder()
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
      initiationTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      validUntilTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      autoRenewing_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      trialUntilTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_LibrarySubscriptionDetails_descriptor;
    }

    public com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails build() {
      com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails buildPartial() {
      com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails result = new com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.initiationTimestampMsec_ = initiationTimestampMsec_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.validUntilTimestampMsec_ = validUntilTimestampMsec_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.autoRenewing_ = autoRenewing_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.trialUntilTimestampMsec_ = trialUntilTimestampMsec_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails) {
        return mergeFrom((com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails other) {
      if (other == com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails.getDefaultInstance()) return this;
      if (other.hasInitiationTimestampMsec()) {
        setInitiationTimestampMsec(other.getInitiationTimestampMsec());
      }
      if (other.hasValidUntilTimestampMsec()) {
        setValidUntilTimestampMsec(other.getValidUntilTimestampMsec());
      }
      if (other.hasAutoRenewing()) {
        setAutoRenewing(other.getAutoRenewing());
      }
      if (other.hasTrialUntilTimestampMsec()) {
        setTrialUntilTimestampMsec(other.getTrialUntilTimestampMsec());
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
      com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.LibrarySubscriptionDetails) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional int64 initiationTimestampMsec = 1;
    private long initiationTimestampMsec_ ;
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public boolean hasInitiationTimestampMsec() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public long getInitiationTimestampMsec() {
      return initiationTimestampMsec_;
    }
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public Builder setInitiationTimestampMsec(long value) {
      bitField0_ |= 0x00000001;
      initiationTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public Builder clearInitiationTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      initiationTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    // optional int64 validUntilTimestampMsec = 2;
    private long validUntilTimestampMsec_ ;
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public boolean hasValidUntilTimestampMsec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public long getValidUntilTimestampMsec() {
      return validUntilTimestampMsec_;
    }
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public Builder setValidUntilTimestampMsec(long value) {
      bitField0_ |= 0x00000002;
      validUntilTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public Builder clearValidUntilTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validUntilTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    // optional bool autoRenewing = 3;
    private boolean autoRenewing_ ;
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public boolean hasAutoRenewing() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public boolean getAutoRenewing() {
      return autoRenewing_;
    }
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public Builder setAutoRenewing(boolean value) {
      bitField0_ |= 0x00000004;
      autoRenewing_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public Builder clearAutoRenewing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      autoRenewing_ = false;
      onChanged();
      return this;
    }

    // optional int64 trialUntilTimestampMsec = 4;
    private long trialUntilTimestampMsec_ ;
    /**
     * <code>optional int64 trialUntilTimestampMsec = 4;</code>
     */
    public boolean hasTrialUntilTimestampMsec() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 trialUntilTimestampMsec = 4;</code>
     */
    public long getTrialUntilTimestampMsec() {
      return trialUntilTimestampMsec_;
    }
    /**
     * <code>optional int64 trialUntilTimestampMsec = 4;</code>
     */
    public Builder setTrialUntilTimestampMsec(long value) {
      bitField0_ |= 0x00000008;
      trialUntilTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 trialUntilTimestampMsec = 4;</code>
     */
    public Builder clearTrialUntilTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000008);
      trialUntilTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:LibrarySubscriptionDetails)
  }

  static {
    defaultInstance = new LibrarySubscriptionDetails(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:LibrarySubscriptionDetails)
}

