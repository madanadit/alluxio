// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.FileSystemMasterCommonPOptions}
 */
public  final class FileSystemMasterCommonPOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.FileSystemMasterCommonPOptions)
    FileSystemMasterCommonPOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileSystemMasterCommonPOptions.newBuilder() to construct.
  private FileSystemMasterCommonPOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileSystemMasterCommonPOptions() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FileSystemMasterCommonPOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            optionalSyncIntervalMsCase_ = 1;
            optionalSyncIntervalMs_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.FileSystemMasterCommonPOptions.class, alluxio.grpc.FileSystemMasterCommonPOptions.Builder.class);
  }

  private int bitField0_;
  private int optionalSyncIntervalMsCase_ = 0;
  private java.lang.Object optionalSyncIntervalMs_;
  public enum OptionalSyncIntervalMsCase
      implements com.google.protobuf.Internal.EnumLite {
    SYNCINTERVALMS(1),
    OPTIONALSYNCINTERVALMS_NOT_SET(0);
    private final int value;
    private OptionalSyncIntervalMsCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalSyncIntervalMsCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalSyncIntervalMsCase forNumber(int value) {
      switch (value) {
        case 1: return SYNCINTERVALMS;
        case 0: return OPTIONALSYNCINTERVALMS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalSyncIntervalMsCase
  getOptionalSyncIntervalMsCase() {
    return OptionalSyncIntervalMsCase.forNumber(
        optionalSyncIntervalMsCase_);
  }

  public static final int SYNCINTERVALMS_FIELD_NUMBER = 1;
  /**
   * <code>optional int64 syncIntervalMs = 1;</code>
   */
  public boolean hasSyncIntervalMs() {
    return optionalSyncIntervalMsCase_ == 1;
  }
  /**
   * <code>optional int64 syncIntervalMs = 1;</code>
   */
  public long getSyncIntervalMs() {
    if (optionalSyncIntervalMsCase_ == 1) {
      return (java.lang.Long) optionalSyncIntervalMs_;
    }
    return 0L;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (optionalSyncIntervalMsCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) optionalSyncIntervalMs_));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optionalSyncIntervalMsCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) optionalSyncIntervalMs_));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.FileSystemMasterCommonPOptions)) {
      return super.equals(obj);
    }
    alluxio.grpc.FileSystemMasterCommonPOptions other = (alluxio.grpc.FileSystemMasterCommonPOptions) obj;

    boolean result = true;
    result = result && getOptionalSyncIntervalMsCase().equals(
        other.getOptionalSyncIntervalMsCase());
    if (!result) return false;
    switch (optionalSyncIntervalMsCase_) {
      case 1:
        result = result && (getSyncIntervalMs()
            == other.getSyncIntervalMs());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (optionalSyncIntervalMsCase_) {
      case 1:
        hash = (37 * hash) + SYNCINTERVALMS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSyncIntervalMs());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.FileSystemMasterCommonPOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.FileSystemMasterCommonPOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.FileSystemMasterCommonPOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.FileSystemMasterCommonPOptions)
      alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.FileSystemMasterCommonPOptions.class, alluxio.grpc.FileSystemMasterCommonPOptions.Builder.class);
    }

    // Construct using alluxio.grpc.FileSystemMasterCommonPOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      optionalSyncIntervalMsCase_ = 0;
      optionalSyncIntervalMs_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_descriptor;
    }

    public alluxio.grpc.FileSystemMasterCommonPOptions getDefaultInstanceForType() {
      return alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance();
    }

    public alluxio.grpc.FileSystemMasterCommonPOptions build() {
      alluxio.grpc.FileSystemMasterCommonPOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.FileSystemMasterCommonPOptions buildPartial() {
      alluxio.grpc.FileSystemMasterCommonPOptions result = new alluxio.grpc.FileSystemMasterCommonPOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (optionalSyncIntervalMsCase_ == 1) {
        result.optionalSyncIntervalMs_ = optionalSyncIntervalMs_;
      }
      result.bitField0_ = to_bitField0_;
      result.optionalSyncIntervalMsCase_ = optionalSyncIntervalMsCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.FileSystemMasterCommonPOptions) {
        return mergeFrom((alluxio.grpc.FileSystemMasterCommonPOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.FileSystemMasterCommonPOptions other) {
      if (other == alluxio.grpc.FileSystemMasterCommonPOptions.getDefaultInstance()) return this;
      switch (other.getOptionalSyncIntervalMsCase()) {
        case SYNCINTERVALMS: {
          setSyncIntervalMs(other.getSyncIntervalMs());
          break;
        }
        case OPTIONALSYNCINTERVALMS_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.FileSystemMasterCommonPOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.FileSystemMasterCommonPOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int optionalSyncIntervalMsCase_ = 0;
    private java.lang.Object optionalSyncIntervalMs_;
    public OptionalSyncIntervalMsCase
        getOptionalSyncIntervalMsCase() {
      return OptionalSyncIntervalMsCase.forNumber(
          optionalSyncIntervalMsCase_);
    }

    public Builder clearOptionalSyncIntervalMs() {
      optionalSyncIntervalMsCase_ = 0;
      optionalSyncIntervalMs_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>optional int64 syncIntervalMs = 1;</code>
     */
    public boolean hasSyncIntervalMs() {
      return optionalSyncIntervalMsCase_ == 1;
    }
    /**
     * <code>optional int64 syncIntervalMs = 1;</code>
     */
    public long getSyncIntervalMs() {
      if (optionalSyncIntervalMsCase_ == 1) {
        return (java.lang.Long) optionalSyncIntervalMs_;
      }
      return 0L;
    }
    /**
     * <code>optional int64 syncIntervalMs = 1;</code>
     */
    public Builder setSyncIntervalMs(long value) {
      optionalSyncIntervalMsCase_ = 1;
      optionalSyncIntervalMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 syncIntervalMs = 1;</code>
     */
    public Builder clearSyncIntervalMs() {
      if (optionalSyncIntervalMsCase_ == 1) {
        optionalSyncIntervalMsCase_ = 0;
        optionalSyncIntervalMs_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.FileSystemMasterCommonPOptions)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.FileSystemMasterCommonPOptions)
  private static final alluxio.grpc.FileSystemMasterCommonPOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.FileSystemMasterCommonPOptions();
  }

  public static alluxio.grpc.FileSystemMasterCommonPOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<FileSystemMasterCommonPOptions>
      PARSER = new com.google.protobuf.AbstractParser<FileSystemMasterCommonPOptions>() {
    public FileSystemMasterCommonPOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FileSystemMasterCommonPOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileSystemMasterCommonPOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileSystemMasterCommonPOptions> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.FileSystemMasterCommonPOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
