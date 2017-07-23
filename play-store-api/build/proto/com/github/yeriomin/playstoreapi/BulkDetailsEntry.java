// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

/**
 * Protobuf type {@code BulkDetailsEntry}
 */
public  final class BulkDetailsEntry extends
    com.google.protobuf.GeneratedMessage
    implements BulkDetailsEntryOrBuilder {
  // Use BulkDetailsEntry.newBuilder() to construct.
  private BulkDetailsEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private BulkDetailsEntry(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final BulkDetailsEntry defaultInstance;
  public static BulkDetailsEntry getDefaultInstance() {
    return defaultInstance;
  }

  public BulkDetailsEntry getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private BulkDetailsEntry(
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
            com.github.yeriomin.playstoreapi.DocV2.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = doc_.toBuilder();
            }
            doc_ = input.readMessage(com.github.yeriomin.playstoreapi.DocV2.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(doc_);
              doc_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BulkDetailsEntry_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BulkDetailsEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.yeriomin.playstoreapi.BulkDetailsEntry.class, com.github.yeriomin.playstoreapi.BulkDetailsEntry.Builder.class);
  }

  public static com.google.protobuf.Parser<BulkDetailsEntry> PARSER =
      new com.google.protobuf.AbstractParser<BulkDetailsEntry>() {
    public BulkDetailsEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BulkDetailsEntry(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<BulkDetailsEntry> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  // optional .DocV2 doc = 1;
  public static final int DOC_FIELD_NUMBER = 1;
  private com.github.yeriomin.playstoreapi.DocV2 doc_;
  /**
   * <code>optional .DocV2 doc = 1;</code>
   */
  public boolean hasDoc() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .DocV2 doc = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.DocV2 getDoc() {
    return doc_;
  }
  /**
   * <code>optional .DocV2 doc = 1;</code>
   */
  public com.github.yeriomin.playstoreapi.DocV2OrBuilder getDocOrBuilder() {
    return doc_;
  }

  private void initFields() {
    doc_ = com.github.yeriomin.playstoreapi.DocV2.getDefaultInstance();
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
      output.writeMessage(1, doc_);
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
        .computeMessageSize(1, doc_);
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

  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.github.yeriomin.playstoreapi.BulkDetailsEntry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.github.yeriomin.playstoreapi.BulkDetailsEntry prototype) {
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
   * Protobuf type {@code BulkDetailsEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements com.github.yeriomin.playstoreapi.BulkDetailsEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BulkDetailsEntry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BulkDetailsEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.yeriomin.playstoreapi.BulkDetailsEntry.class, com.github.yeriomin.playstoreapi.BulkDetailsEntry.Builder.class);
    }

    // Construct using com.github.yeriomin.playstoreapi.BulkDetailsEntry.newBuilder()
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
        getDocFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (docBuilder_ == null) {
        doc_ = com.github.yeriomin.playstoreapi.DocV2.getDefaultInstance();
      } else {
        docBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.yeriomin.playstoreapi.GooglePlay.internal_static_BulkDetailsEntry_descriptor;
    }

    public com.github.yeriomin.playstoreapi.BulkDetailsEntry getDefaultInstanceForType() {
      return com.github.yeriomin.playstoreapi.BulkDetailsEntry.getDefaultInstance();
    }

    public com.github.yeriomin.playstoreapi.BulkDetailsEntry build() {
      com.github.yeriomin.playstoreapi.BulkDetailsEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.yeriomin.playstoreapi.BulkDetailsEntry buildPartial() {
      com.github.yeriomin.playstoreapi.BulkDetailsEntry result = new com.github.yeriomin.playstoreapi.BulkDetailsEntry(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (docBuilder_ == null) {
        result.doc_ = doc_;
      } else {
        result.doc_ = docBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.yeriomin.playstoreapi.BulkDetailsEntry) {
        return mergeFrom((com.github.yeriomin.playstoreapi.BulkDetailsEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.yeriomin.playstoreapi.BulkDetailsEntry other) {
      if (other == com.github.yeriomin.playstoreapi.BulkDetailsEntry.getDefaultInstance()) return this;
      if (other.hasDoc()) {
        mergeDoc(other.getDoc());
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
      com.github.yeriomin.playstoreapi.BulkDetailsEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.yeriomin.playstoreapi.BulkDetailsEntry) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    // optional .DocV2 doc = 1;
    private com.github.yeriomin.playstoreapi.DocV2 doc_ = com.github.yeriomin.playstoreapi.DocV2.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.DocV2, com.github.yeriomin.playstoreapi.DocV2.Builder, com.github.yeriomin.playstoreapi.DocV2OrBuilder> docBuilder_;
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public boolean hasDoc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.DocV2 getDoc() {
      if (docBuilder_ == null) {
        return doc_;
      } else {
        return docBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public Builder setDoc(com.github.yeriomin.playstoreapi.DocV2 value) {
      if (docBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        doc_ = value;
        onChanged();
      } else {
        docBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public Builder setDoc(
        com.github.yeriomin.playstoreapi.DocV2.Builder builderForValue) {
      if (docBuilder_ == null) {
        doc_ = builderForValue.build();
        onChanged();
      } else {
        docBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public Builder mergeDoc(com.github.yeriomin.playstoreapi.DocV2 value) {
      if (docBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            doc_ != com.github.yeriomin.playstoreapi.DocV2.getDefaultInstance()) {
          doc_ =
            com.github.yeriomin.playstoreapi.DocV2.newBuilder(doc_).mergeFrom(value).buildPartial();
        } else {
          doc_ = value;
        }
        onChanged();
      } else {
        docBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public Builder clearDoc() {
      if (docBuilder_ == null) {
        doc_ = com.github.yeriomin.playstoreapi.DocV2.getDefaultInstance();
        onChanged();
      } else {
        docBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.DocV2.Builder getDocBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDocFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    public com.github.yeriomin.playstoreapi.DocV2OrBuilder getDocOrBuilder() {
      if (docBuilder_ != null) {
        return docBuilder_.getMessageOrBuilder();
      } else {
        return doc_;
      }
    }
    /**
     * <code>optional .DocV2 doc = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.yeriomin.playstoreapi.DocV2, com.github.yeriomin.playstoreapi.DocV2.Builder, com.github.yeriomin.playstoreapi.DocV2OrBuilder> 
        getDocFieldBuilder() {
      if (docBuilder_ == null) {
        docBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.yeriomin.playstoreapi.DocV2, com.github.yeriomin.playstoreapi.DocV2.Builder, com.github.yeriomin.playstoreapi.DocV2OrBuilder>(
                doc_,
                getParentForChildren(),
                isClean());
        doc_ = null;
      }
      return docBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:BulkDetailsEntry)
  }

  static {
    defaultInstance = new BulkDetailsEntry(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:BulkDetailsEntry)
}

