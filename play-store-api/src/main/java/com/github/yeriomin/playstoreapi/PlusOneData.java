// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code PlusOneData}
 */
public  final class PlusOneData extends
    com.google.protobuf.GeneratedMessage
    implements PlusOneDataOrBuilder {
  // Use PlusOneData.newBuilder() to construct.
  private PlusOneData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private PlusOneData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final PlusOneData defaultInstance;
  public static PlusOneData getDefaultInstance() {
    return defaultInstance;
  }

  public PlusOneData getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private PlusOneData(
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
            setByUser_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            total_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            circlesTotal_ = input.readInt64();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              circlesPeople_ = new java.util.ArrayList<com.github.yeriomin.playstoreapi.PlusPerson>();
              mutable_bitField0_ |= 0x00000008;
            }
            circlesPeople_.add(input.readMessage(com.github.yeriomin.playstoreapi.PlusPerson.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        circlesPeople_ = java.util.Collections.unmodifiableList(circlesPeople_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PlusOneData_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PlusOneData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.PlusOneData.class, com.github.yeriomin.playstoreapi.PlusOneData.Builder.class);
  }

  public static com.google.protobuf.Parser<PlusOneData> PARSER =
      new com.google.protobuf.AbstractParser<PlusOneData>() {
    public PlusOneData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlusOneData(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PlusOneData> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional bool setByUser = 1;
  public static final int SETBYUSER_FIELD_NUMBER = 1;
  private boolean setByUser_;
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  public boolean hasSetByUser() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  public boolean getSetByUser() {
    return setByUser_;
  }

  // optional int64 total = 2;
  public static final int TOTAL_FIELD_NUMBER = 2;
  private long total_;
  /**
   * <code>optional int64 total = 2;</code>
   */
  public boolean hasTotal() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 total = 2;</code>
   */
  public long getTotal() {
    return total_;
  }

  // optional int64 circlesTotal = 3;
  public static final int CIRCLESTOTAL_FIELD_NUMBER = 3;
  private long circlesTotal_;
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  public boolean hasCirclesTotal() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  public long getCirclesTotal() {
    return circlesTotal_;
  }

  // repeated .PlusPerson circlesPeople = 4;
  public static final int CIRCLESPEOPLE_FIELD_NUMBER = 4;
  private java.util.List<com.github.yeriomin.playstoreapi.PlusPerson> circlesPeople_;
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public java.util.List<com.github.yeriomin.playstoreapi.PlusPerson> getCirclesPeopleList() {
    return circlesPeople_;
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public java.util.List<? extends com.github.yeriomin.playstoreapi.PlusPersonOrBuilder> 
      getCirclesPeopleOrBuilderList() {
    return circlesPeople_;
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public int getCirclesPeopleCount() {
    return circlesPeople_.size();
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public com.github.yeriomin.playstoreapi.PlusPerson getCirclesPeople(int index) {
    return circlesPeople_.get(index);
  }
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  public com.github.yeriomin.playstoreapi.PlusPersonOrBuilder getCirclesPeopleOrBuilder(
      int index) {
    return circlesPeople_.get(index);
  }

  private void initFields() {
    setByUser_ = false;
    total_ = 0L;
    circlesTotal_ = 0L;
    circlesPeople_ = java.util.Collections.emptyList();
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
      output.writeBool(1, setByUser_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, total_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, circlesTotal_);
    }
    for (int i = 0; i < circlesPeople_.size(); i++) {
      output.writeMessage(4, circlesPeople_.get(i));
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
        .computeBoolSize(1, setByUser_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, total_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, circlesTotal_);
    }
    for (int i = 0; i < circlesPeople_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, circlesPeople_.get(i));
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

  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.PlusOneData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.PlusOneData prototype) {
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
   * Protobuf type {@code PlusOneData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.PlusOneDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PlusOneData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PlusOneData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.PlusOneData.class, com.github.yeriomin.playstoreapi.PlusOneData.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.PlusOneData.newBuilder()
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
        getCirclesPeopleFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      setByUser_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      total_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      circlesTotal_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      if (circlesPeopleBuilder_ == null) {
        circlesPeople_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        circlesPeopleBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_PlusOneData_descriptor;
    }

    public com.github.yeriomin.playstoreapi.PlusOneData getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.PlusOneData.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.PlusOneData build() {
      com.github.yeriomin.playstoreapi.PlusOneData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.PlusOneData buildPartial() {
      com.github.yeriomin.playstoreapi.PlusOneData result = new com.github.yeriomin.playstoreapi.PlusOneData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.setByUser_ = setByUser_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.total_ = total_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.circlesTotal_ = circlesTotal_;
      if (circlesPeopleBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          circlesPeople_ = java.util.Collections.unmodifiableList(circlesPeople_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.circlesPeople_ = circlesPeople_;
      } else {
        result.circlesPeople_ = circlesPeopleBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.PlusOneData) {
        return mergeFrom((com.github.yeriomin.playstoreapi.PlusOneData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.PlusOneData other) {
      if (other == com.github.yeriomin.playstoreapi.PlusOneData.getDefaultInstance()) return this;
      if (other.hasSetByUser()) {
        setSetByUser(other.getSetByUser());
      }
      if (other.hasTotal()) {
        setTotal(other.getTotal());
      }
      if (other.hasCirclesTotal()) {
        setCirclesTotal(other.getCirclesTotal());
      }
      if (circlesPeopleBuilder_ == null) {
        if (!other.circlesPeople_.isEmpty()) {
          if (circlesPeople_.isEmpty()) {
            circlesPeople_ = other.circlesPeople_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureCirclesPeopleIsMutable();
            circlesPeople_.addAll(other.circlesPeople_);
          }
          onChanged();
        }
      } else {
        if (!other.circlesPeople_.isEmpty()) {
          if (circlesPeopleBuilder_.isEmpty()) {
            circlesPeopleBuilder_.dispose();
            circlesPeopleBuilder_ = null;
            circlesPeople_ = other.circlesPeople_;
            bitField0_ = (bitField0_ & ~0x00000008);
            circlesPeopleBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCirclesPeopleFieldBuilder() : null;
          } else {
            circlesPeopleBuilder_.addAllMessages(other.circlesPeople_);
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
      com.github.yeriomin.playstoreapi.PlusOneData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.PlusOneData) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional bool setByUser = 1;
    private boolean setByUser_ ;
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public boolean hasSetByUser() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public boolean getSetByUser() {
      return setByUser_;
    }
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public Builder setSetByUser(boolean value) {
      bitField0_ |= 0x00000001;
      setByUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool setByUser = 1;</code>
     */
    public Builder clearSetByUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      setByUser_ = false;
      onChanged();
      return this;
    }

    // optional int64 total = 2;
    private long total_ ;
    /**
     * <code>optional int64 total = 2;</code>
     */
    public boolean hasTotal() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 total = 2;</code>
     */
    public long getTotal() {
      return total_;
    }
    /**
     * <code>optional int64 total = 2;</code>
     */
    public Builder setTotal(long value) {
      bitField0_ |= 0x00000002;
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total = 2;</code>
     */
    public Builder clearTotal() {
      bitField0_ = (bitField0_ & ~0x00000002);
      total_ = 0L;
      onChanged();
      return this;
    }

    // optional int64 circlesTotal = 3;
    private long circlesTotal_ ;
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public boolean hasCirclesTotal() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public long getCirclesTotal() {
      return circlesTotal_;
    }
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public Builder setCirclesTotal(long value) {
      bitField0_ |= 0x00000004;
      circlesTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 circlesTotal = 3;</code>
     */
    public Builder clearCirclesTotal() {
      bitField0_ = (bitField0_ & ~0x00000004);
      circlesTotal_ = 0L;
      onChanged();
      return this;
    }

    // repeated .PlusPerson circlesPeople = 4;
    private java.util.List<com.github.yeriomin.playstoreapi.PlusPerson> circlesPeople_ =
      java.util.Collections.emptyList();
    private void ensureCirclesPeopleIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        circlesPeople_ = new java.util.ArrayList<com.github.yeriomin.playstoreapi.PlusPerson>(circlesPeople_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.yeriomin.playstoreapi.PlusPerson, com.github.yeriomin.playstoreapi.PlusPerson.Builder, com.github.yeriomin.playstoreapi.PlusPersonOrBuilder> circlesPeopleBuilder_;

    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.PlusPerson> getCirclesPeopleList() {
      if (circlesPeopleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(circlesPeople_);
      } else {
        return circlesPeopleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public int getCirclesPeopleCount() {
      if (circlesPeopleBuilder_ == null) {
        return circlesPeople_.size();
      } else {
        return circlesPeopleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.PlusPerson getCirclesPeople(int index) {
      if (circlesPeopleBuilder_ == null) {
        return circlesPeople_.get(index);
      } else {
        return circlesPeopleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder setCirclesPeople(
        int index, com.github.yeriomin.playstoreapi.PlusPerson value) {
      if (circlesPeopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCirclesPeopleIsMutable();
        circlesPeople_.set(index, value);
        onChanged();
      } else {
        circlesPeopleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder setCirclesPeople(
        int index, com.github.yeriomin.playstoreapi.PlusPerson.Builder builderForValue) {
      if (circlesPeopleBuilder_ == null) {
        ensureCirclesPeopleIsMutable();
        circlesPeople_.set(index, builderForValue.build());
        onChanged();
      } else {
        circlesPeopleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(com.github.yeriomin.playstoreapi.PlusPerson value) {
      if (circlesPeopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCirclesPeopleIsMutable();
        circlesPeople_.add(value);
        onChanged();
      } else {
        circlesPeopleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(
        int index, com.github.yeriomin.playstoreapi.PlusPerson value) {
      if (circlesPeopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCirclesPeopleIsMutable();
        circlesPeople_.add(index, value);
        onChanged();
      } else {
        circlesPeopleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(
        com.github.yeriomin.playstoreapi.PlusPerson.Builder builderForValue) {
      if (circlesPeopleBuilder_ == null) {
        ensureCirclesPeopleIsMutable();
        circlesPeople_.add(builderForValue.build());
        onChanged();
      } else {
        circlesPeopleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addCirclesPeople(
        int index, com.github.yeriomin.playstoreapi.PlusPerson.Builder builderForValue) {
      if (circlesPeopleBuilder_ == null) {
        ensureCirclesPeopleIsMutable();
        circlesPeople_.add(index, builderForValue.build());
        onChanged();
      } else {
        circlesPeopleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder addAllCirclesPeople(
        java.lang.Iterable<? extends com.github.yeriomin.playstoreapi.PlusPerson> values) {
      if (circlesPeopleBuilder_ == null) {
        ensureCirclesPeopleIsMutable();
        super.addAll(values, circlesPeople_);
        onChanged();
      } else {
        circlesPeopleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder clearCirclesPeople() {
      if (circlesPeopleBuilder_ == null) {
        circlesPeople_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        circlesPeopleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public Builder removeCirclesPeople(int index) {
      if (circlesPeopleBuilder_ == null) {
        ensureCirclesPeopleIsMutable();
        circlesPeople_.remove(index);
        onChanged();
      } else {
        circlesPeopleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.PlusPerson.Builder getCirclesPeopleBuilder(
        int index) {
      return getCirclesPeopleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.PlusPersonOrBuilder getCirclesPeopleOrBuilder(
        int index) {
      if (circlesPeopleBuilder_ == null) {
        return circlesPeople_.get(index);  } else {
        return circlesPeopleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public java.util.List<? extends com.github.yeriomin.playstoreapi.PlusPersonOrBuilder> 
         getCirclesPeopleOrBuilderList() {
      if (circlesPeopleBuilder_ != null) {
        return circlesPeopleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(circlesPeople_);
      }
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.PlusPerson.Builder addCirclesPeopleBuilder() {
      return getCirclesPeopleFieldBuilder().addBuilder(
          com.github.yeriomin.playstoreapi.PlusPerson.getDefaultInstance());
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public com.github.yeriomin.playstoreapi.PlusPerson.Builder addCirclesPeopleBuilder(
        int index) {
      return getCirclesPeopleFieldBuilder().addBuilder(
          index, com.github.yeriomin.playstoreapi.PlusPerson.getDefaultInstance());
    }
    /**
     * <code>repeated .PlusPerson circlesPeople = 4;</code>
     */
    public java.util.List<com.github.yeriomin.playstoreapi.PlusPerson.Builder> 
         getCirclesPeopleBuilderList() {
      return getCirclesPeopleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.yeriomin.playstoreapi.PlusPerson, com.github.yeriomin.playstoreapi.PlusPerson.Builder, com.github.yeriomin.playstoreapi.PlusPersonOrBuilder> 
        getCirclesPeopleFieldBuilder() {
      if (circlesPeopleBuilder_ == null) {
        circlesPeopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.yeriomin.playstoreapi.PlusPerson, com.github.yeriomin.playstoreapi.PlusPerson.Builder, com.github.yeriomin.playstoreapi.PlusPersonOrBuilder>(
                circlesPeople_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        circlesPeople_ = null;
      }
      return circlesPeopleBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:PlusOneData)
  }

  static {
    defaultInstance = new PlusOneData(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:PlusOneData)
}
