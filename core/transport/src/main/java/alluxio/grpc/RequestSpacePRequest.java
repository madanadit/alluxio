// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block_worker.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.RequestSpacePRequest}
 */
public  final class RequestSpacePRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.RequestSpacePRequest)
    RequestSpacePRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestSpacePRequest.newBuilder() to construct.
  private RequestSpacePRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestSpacePRequest() {
    sessionId_ = 0L;
    blockId_ = 0L;
    requestBytes_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestSpacePRequest(
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
            bitField0_ |= 0x00000001;
            sessionId_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            blockId_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            requestBytes_ = input.readInt64();
            break;
          }
          case 34: {
            alluxio.grpc.RequestSpacePOptions.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = options_.toBuilder();
            }
            options_ = input.readMessage(alluxio.grpc.RequestSpacePOptions.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(options_);
              options_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
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
    return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_RequestSpacePRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_RequestSpacePRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.RequestSpacePRequest.class, alluxio.grpc.RequestSpacePRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SESSIONID_FIELD_NUMBER = 1;
  private long sessionId_;
  /**
   * <pre>
   ** the id of the current session 
   * </pre>
   *
   * <code>optional int64 sessionId = 1;</code>
   */
  public boolean hasSessionId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   ** the id of the current session 
   * </pre>
   *
   * <code>optional int64 sessionId = 1;</code>
   */
  public long getSessionId() {
    return sessionId_;
  }

  public static final int BLOCKID_FIELD_NUMBER = 2;
  private long blockId_;
  /**
   * <pre>
   ** the id of the block being accessed 
   * </pre>
   *
   * <code>optional int64 blockId = 2;</code>
   */
  public boolean hasBlockId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   ** the id of the block being accessed 
   * </pre>
   *
   * <code>optional int64 blockId = 2;</code>
   */
  public long getBlockId() {
    return blockId_;
  }

  public static final int REQUESTBYTES_FIELD_NUMBER = 3;
  private long requestBytes_;
  /**
   * <pre>
   ** the number of bytes requested 
   * </pre>
   *
   * <code>optional int64 requestBytes = 3;</code>
   */
  public boolean hasRequestBytes() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   ** the number of bytes requested 
   * </pre>
   *
   * <code>optional int64 requestBytes = 3;</code>
   */
  public long getRequestBytes() {
    return requestBytes_;
  }

  public static final int OPTIONS_FIELD_NUMBER = 4;
  private alluxio.grpc.RequestSpacePOptions options_;
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
   */
  public boolean hasOptions() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
   */
  public alluxio.grpc.RequestSpacePOptions getOptions() {
    return options_ == null ? alluxio.grpc.RequestSpacePOptions.getDefaultInstance() : options_;
  }
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
   */
  public alluxio.grpc.RequestSpacePOptionsOrBuilder getOptionsOrBuilder() {
    return options_ == null ? alluxio.grpc.RequestSpacePOptions.getDefaultInstance() : options_;
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
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, sessionId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, blockId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, requestBytes_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, getOptions());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sessionId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, blockId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, requestBytes_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getOptions());
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
    if (!(obj instanceof alluxio.grpc.RequestSpacePRequest)) {
      return super.equals(obj);
    }
    alluxio.grpc.RequestSpacePRequest other = (alluxio.grpc.RequestSpacePRequest) obj;

    boolean result = true;
    result = result && (hasSessionId() == other.hasSessionId());
    if (hasSessionId()) {
      result = result && (getSessionId()
          == other.getSessionId());
    }
    result = result && (hasBlockId() == other.hasBlockId());
    if (hasBlockId()) {
      result = result && (getBlockId()
          == other.getBlockId());
    }
    result = result && (hasRequestBytes() == other.hasRequestBytes());
    if (hasRequestBytes()) {
      result = result && (getRequestBytes()
          == other.getRequestBytes());
    }
    result = result && (hasOptions() == other.hasOptions());
    if (hasOptions()) {
      result = result && getOptions()
          .equals(other.getOptions());
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
    if (hasSessionId()) {
      hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSessionId());
    }
    if (hasBlockId()) {
      hash = (37 * hash) + BLOCKID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBlockId());
    }
    if (hasRequestBytes()) {
      hash = (37 * hash) + REQUESTBYTES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRequestBytes());
    }
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.RequestSpacePRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RequestSpacePRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.RequestSpacePRequest parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.RequestSpacePRequest prototype) {
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
   * Protobuf type {@code alluxio.grpc.RequestSpacePRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.RequestSpacePRequest)
      alluxio.grpc.RequestSpacePRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_RequestSpacePRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_RequestSpacePRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.RequestSpacePRequest.class, alluxio.grpc.RequestSpacePRequest.Builder.class);
    }

    // Construct using alluxio.grpc.RequestSpacePRequest.newBuilder()
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
        getOptionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      sessionId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      blockId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      requestBytes_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_RequestSpacePRequest_descriptor;
    }

    public alluxio.grpc.RequestSpacePRequest getDefaultInstanceForType() {
      return alluxio.grpc.RequestSpacePRequest.getDefaultInstance();
    }

    public alluxio.grpc.RequestSpacePRequest build() {
      alluxio.grpc.RequestSpacePRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.RequestSpacePRequest buildPartial() {
      alluxio.grpc.RequestSpacePRequest result = new alluxio.grpc.RequestSpacePRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.sessionId_ = sessionId_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.blockId_ = blockId_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.requestBytes_ = requestBytes_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof alluxio.grpc.RequestSpacePRequest) {
        return mergeFrom((alluxio.grpc.RequestSpacePRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.RequestSpacePRequest other) {
      if (other == alluxio.grpc.RequestSpacePRequest.getDefaultInstance()) return this;
      if (other.hasSessionId()) {
        setSessionId(other.getSessionId());
      }
      if (other.hasBlockId()) {
        setBlockId(other.getBlockId());
      }
      if (other.hasRequestBytes()) {
        setRequestBytes(other.getRequestBytes());
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
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
      alluxio.grpc.RequestSpacePRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.RequestSpacePRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long sessionId_ ;
    /**
     * <pre>
     ** the id of the current session 
     * </pre>
     *
     * <code>optional int64 sessionId = 1;</code>
     */
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     ** the id of the current session 
     * </pre>
     *
     * <code>optional int64 sessionId = 1;</code>
     */
    public long getSessionId() {
      return sessionId_;
    }
    /**
     * <pre>
     ** the id of the current session 
     * </pre>
     *
     * <code>optional int64 sessionId = 1;</code>
     */
    public Builder setSessionId(long value) {
      bitField0_ |= 0x00000001;
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** the id of the current session 
     * </pre>
     *
     * <code>optional int64 sessionId = 1;</code>
     */
    public Builder clearSessionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionId_ = 0L;
      onChanged();
      return this;
    }

    private long blockId_ ;
    /**
     * <pre>
     ** the id of the block being accessed 
     * </pre>
     *
     * <code>optional int64 blockId = 2;</code>
     */
    public boolean hasBlockId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     ** the id of the block being accessed 
     * </pre>
     *
     * <code>optional int64 blockId = 2;</code>
     */
    public long getBlockId() {
      return blockId_;
    }
    /**
     * <pre>
     ** the id of the block being accessed 
     * </pre>
     *
     * <code>optional int64 blockId = 2;</code>
     */
    public Builder setBlockId(long value) {
      bitField0_ |= 0x00000002;
      blockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** the id of the block being accessed 
     * </pre>
     *
     * <code>optional int64 blockId = 2;</code>
     */
    public Builder clearBlockId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      blockId_ = 0L;
      onChanged();
      return this;
    }

    private long requestBytes_ ;
    /**
     * <pre>
     ** the number of bytes requested 
     * </pre>
     *
     * <code>optional int64 requestBytes = 3;</code>
     */
    public boolean hasRequestBytes() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     ** the number of bytes requested 
     * </pre>
     *
     * <code>optional int64 requestBytes = 3;</code>
     */
    public long getRequestBytes() {
      return requestBytes_;
    }
    /**
     * <pre>
     ** the number of bytes requested 
     * </pre>
     *
     * <code>optional int64 requestBytes = 3;</code>
     */
    public Builder setRequestBytes(long value) {
      bitField0_ |= 0x00000004;
      requestBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** the number of bytes requested 
     * </pre>
     *
     * <code>optional int64 requestBytes = 3;</code>
     */
    public Builder clearRequestBytes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      requestBytes_ = 0L;
      onChanged();
      return this;
    }

    private alluxio.grpc.RequestSpacePOptions options_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RequestSpacePOptions, alluxio.grpc.RequestSpacePOptions.Builder, alluxio.grpc.RequestSpacePOptionsOrBuilder> optionsBuilder_;
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public boolean hasOptions() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public alluxio.grpc.RequestSpacePOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? alluxio.grpc.RequestSpacePOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public Builder setOptions(alluxio.grpc.RequestSpacePOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public Builder setOptions(
        alluxio.grpc.RequestSpacePOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public Builder mergeOptions(alluxio.grpc.RequestSpacePOptions value) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008) &&
            options_ != null &&
            options_ != alluxio.grpc.RequestSpacePOptions.getDefaultInstance()) {
          options_ =
            alluxio.grpc.RequestSpacePOptions.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public alluxio.grpc.RequestSpacePOptions.Builder getOptionsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    public alluxio.grpc.RequestSpacePOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            alluxio.grpc.RequestSpacePOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <pre>
     ** the method options 
     * </pre>
     *
     * <code>optional .alluxio.grpc.RequestSpacePOptions options = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.RequestSpacePOptions, alluxio.grpc.RequestSpacePOptions.Builder, alluxio.grpc.RequestSpacePOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.RequestSpacePOptions, alluxio.grpc.RequestSpacePOptions.Builder, alluxio.grpc.RequestSpacePOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.RequestSpacePRequest)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.RequestSpacePRequest)
  private static final alluxio.grpc.RequestSpacePRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.RequestSpacePRequest();
  }

  public static alluxio.grpc.RequestSpacePRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RequestSpacePRequest>
      PARSER = new com.google.protobuf.AbstractParser<RequestSpacePRequest>() {
    public RequestSpacePRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestSpacePRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestSpacePRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestSpacePRequest> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.RequestSpacePRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
