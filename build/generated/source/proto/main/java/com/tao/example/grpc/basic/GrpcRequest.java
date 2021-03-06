// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: basic.proto

package com.tao.example.grpc.basic;

/**
 * Protobuf type {@code basic.GrpcRequest}
 */
public  final class GrpcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:basic.GrpcRequest)
    GrpcRequestOrBuilder {
  // Use GrpcRequest.newBuilder() to construct.
  private GrpcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcRequest() {
    num1_ = "";
    num2_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GrpcRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            num1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            num2_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tao.example.grpc.basic.BasicGprc.internal_static_basic_GrpcRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tao.example.grpc.basic.BasicGprc.internal_static_basic_GrpcRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tao.example.grpc.basic.GrpcRequest.class, com.tao.example.grpc.basic.GrpcRequest.Builder.class);
  }

  public static final int NUM1_FIELD_NUMBER = 1;
  private volatile java.lang.Object num1_;
  /**
   * <code>string num1 = 1;</code>
   */
  public java.lang.String getNum1() {
    java.lang.Object ref = num1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      num1_ = s;
      return s;
    }
  }
  /**
   * <code>string num1 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNum1Bytes() {
    java.lang.Object ref = num1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      num1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM2_FIELD_NUMBER = 2;
  private volatile java.lang.Object num2_;
  /**
   * <code>string num2 = 2;</code>
   */
  public java.lang.String getNum2() {
    java.lang.Object ref = num2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      num2_ = s;
      return s;
    }
  }
  /**
   * <code>string num2 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNum2Bytes() {
    java.lang.Object ref = num2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      num2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNum1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, num1_);
    }
    if (!getNum2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, num2_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNum1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, num1_);
    }
    if (!getNum2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, num2_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tao.example.grpc.basic.GrpcRequest)) {
      return super.equals(obj);
    }
    com.tao.example.grpc.basic.GrpcRequest other = (com.tao.example.grpc.basic.GrpcRequest) obj;

    boolean result = true;
    result = result && getNum1()
        .equals(other.getNum1());
    result = result && getNum2()
        .equals(other.getNum2());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM1_FIELD_NUMBER;
    hash = (53 * hash) + getNum1().hashCode();
    hash = (37 * hash) + NUM2_FIELD_NUMBER;
    hash = (53 * hash) + getNum2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tao.example.grpc.basic.GrpcRequest parseFrom(
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
  public static Builder newBuilder(com.tao.example.grpc.basic.GrpcRequest prototype) {
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
   * Protobuf type {@code basic.GrpcRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:basic.GrpcRequest)
      com.tao.example.grpc.basic.GrpcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tao.example.grpc.basic.BasicGprc.internal_static_basic_GrpcRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tao.example.grpc.basic.BasicGprc.internal_static_basic_GrpcRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tao.example.grpc.basic.GrpcRequest.class, com.tao.example.grpc.basic.GrpcRequest.Builder.class);
    }

    // Construct using com.tao.example.grpc.basic.GrpcRequest.newBuilder()
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
      num1_ = "";

      num2_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tao.example.grpc.basic.BasicGprc.internal_static_basic_GrpcRequest_descriptor;
    }

    public com.tao.example.grpc.basic.GrpcRequest getDefaultInstanceForType() {
      return com.tao.example.grpc.basic.GrpcRequest.getDefaultInstance();
    }

    public com.tao.example.grpc.basic.GrpcRequest build() {
      com.tao.example.grpc.basic.GrpcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.tao.example.grpc.basic.GrpcRequest buildPartial() {
      com.tao.example.grpc.basic.GrpcRequest result = new com.tao.example.grpc.basic.GrpcRequest(this);
      result.num1_ = num1_;
      result.num2_ = num2_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tao.example.grpc.basic.GrpcRequest) {
        return mergeFrom((com.tao.example.grpc.basic.GrpcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tao.example.grpc.basic.GrpcRequest other) {
      if (other == com.tao.example.grpc.basic.GrpcRequest.getDefaultInstance()) return this;
      if (!other.getNum1().isEmpty()) {
        num1_ = other.num1_;
        onChanged();
      }
      if (!other.getNum2().isEmpty()) {
        num2_ = other.num2_;
        onChanged();
      }
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
      com.tao.example.grpc.basic.GrpcRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tao.example.grpc.basic.GrpcRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object num1_ = "";
    /**
     * <code>string num1 = 1;</code>
     */
    public java.lang.String getNum1() {
      java.lang.Object ref = num1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        num1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string num1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNum1Bytes() {
      java.lang.Object ref = num1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        num1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string num1 = 1;</code>
     */
    public Builder setNum1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      num1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string num1 = 1;</code>
     */
    public Builder clearNum1() {
      
      num1_ = getDefaultInstance().getNum1();
      onChanged();
      return this;
    }
    /**
     * <code>string num1 = 1;</code>
     */
    public Builder setNum1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      num1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object num2_ = "";
    /**
     * <code>string num2 = 2;</code>
     */
    public java.lang.String getNum2() {
      java.lang.Object ref = num2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        num2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string num2 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNum2Bytes() {
      java.lang.Object ref = num2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        num2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string num2 = 2;</code>
     */
    public Builder setNum2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      num2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string num2 = 2;</code>
     */
    public Builder clearNum2() {
      
      num2_ = getDefaultInstance().getNum2();
      onChanged();
      return this;
    }
    /**
     * <code>string num2 = 2;</code>
     */
    public Builder setNum2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      num2_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:basic.GrpcRequest)
  }

  // @@protoc_insertion_point(class_scope:basic.GrpcRequest)
  private static final com.tao.example.grpc.basic.GrpcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tao.example.grpc.basic.GrpcRequest();
  }

  public static com.tao.example.grpc.basic.GrpcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcRequest>
      PARSER = new com.google.protobuf.AbstractParser<GrpcRequest>() {
    public GrpcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GrpcRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcRequest> getParserForType() {
    return PARSER;
  }

  public com.tao.example.grpc.basic.GrpcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

