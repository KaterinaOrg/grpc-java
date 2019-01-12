// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Data source consisting of either a file or an inline value.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.DataSource}
 */
public  final class DataSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.DataSource)
    DataSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataSource.newBuilder() to construct.
  private DataSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataSource() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataSource(
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            specifierCase_ = 1;
            specifier_ = s;
            break;
          }
          case 18: {
            specifierCase_ = 2;
            specifier_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            specifierCase_ = 3;
            specifier_ = s;
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
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_DataSource_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_DataSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.DataSource.class, io.grpc.xds.shaded.envoy.api.v2.core.DataSource.Builder.class);
  }

  private int specifierCase_ = 0;
  private java.lang.Object specifier_;
  public enum SpecifierCase
      implements com.google.protobuf.Internal.EnumLite {
    FILENAME(1),
    INLINE_BYTES(2),
    INLINE_STRING(3),
    SPECIFIER_NOT_SET(0);
    private final int value;
    private SpecifierCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static SpecifierCase forNumber(int value) {
      switch (value) {
        case 1: return FILENAME;
        case 2: return INLINE_BYTES;
        case 3: return INLINE_STRING;
        case 0: return SPECIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SpecifierCase
  getSpecifierCase() {
    return SpecifierCase.forNumber(
        specifierCase_);
  }

  public static final int FILENAME_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Local filesystem data source.
   * </pre>
   *
   * <code>string filename = 1 [(.validate.rules) = { ... }</code>
   */
  public java.lang.String getFilename() {
    java.lang.Object ref = "";
    if (specifierCase_ == 1) {
      ref = specifier_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (specifierCase_ == 1) {
        specifier_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Local filesystem data source.
   * </pre>
   *
   * <code>string filename = 1 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    java.lang.Object ref = "";
    if (specifierCase_ == 1) {
      ref = specifier_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (specifierCase_ == 1) {
        specifier_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INLINE_BYTES_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Bytes inlined in the configuration.
   * </pre>
   *
   * <code>bytes inline_bytes = 2 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString getInlineBytes() {
    if (specifierCase_ == 2) {
      return (com.google.protobuf.ByteString) specifier_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int INLINE_STRING_FIELD_NUMBER = 3;
  /**
   * <pre>
   * String inlined in the configuration.
   * </pre>
   *
   * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
   */
  public java.lang.String getInlineString() {
    java.lang.Object ref = "";
    if (specifierCase_ == 3) {
      ref = specifier_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (specifierCase_ == 3) {
        specifier_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * String inlined in the configuration.
   * </pre>
   *
   * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getInlineStringBytes() {
    java.lang.Object ref = "";
    if (specifierCase_ == 3) {
      ref = specifier_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (specifierCase_ == 3) {
        specifier_ = b;
      }
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
    if (specifierCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, specifier_);
    }
    if (specifierCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) specifier_);
    }
    if (specifierCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, specifier_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (specifierCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, specifier_);
    }
    if (specifierCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) specifier_);
    }
    if (specifierCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, specifier_);
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
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.DataSource)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.DataSource other = (io.grpc.xds.shaded.envoy.api.v2.core.DataSource) obj;

    boolean result = true;
    result = result && getSpecifierCase().equals(
        other.getSpecifierCase());
    if (!result) return false;
    switch (specifierCase_) {
      case 1:
        result = result && getFilename()
            .equals(other.getFilename());
        break;
      case 2:
        result = result && getInlineBytes()
            .equals(other.getInlineBytes());
        break;
      case 3:
        result = result && getInlineString()
            .equals(other.getInlineString());
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
    switch (specifierCase_) {
      case 1:
        hash = (37 * hash) + FILENAME_FIELD_NUMBER;
        hash = (53 * hash) + getFilename().hashCode();
        break;
      case 2:
        hash = (37 * hash) + INLINE_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + getInlineBytes().hashCode();
        break;
      case 3:
        hash = (37 * hash) + INLINE_STRING_FIELD_NUMBER;
        hash = (53 * hash) + getInlineString().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource parseFrom(
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
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.DataSource prototype) {
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
   * <pre>
   * Data source consisting of either a file or an inline value.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.DataSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.DataSource)
      io.grpc.xds.shaded.envoy.api.v2.core.DataSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_DataSource_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_DataSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.DataSource.class, io.grpc.xds.shaded.envoy.api.v2.core.DataSource.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.DataSource.newBuilder()
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
      specifierCase_ = 0;
      specifier_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_DataSource_descriptor;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.DataSource getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.DataSource.getDefaultInstance();
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.DataSource build() {
      io.grpc.xds.shaded.envoy.api.v2.core.DataSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.DataSource buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.DataSource result = new io.grpc.xds.shaded.envoy.api.v2.core.DataSource(this);
      if (specifierCase_ == 1) {
        result.specifier_ = specifier_;
      }
      if (specifierCase_ == 2) {
        result.specifier_ = specifier_;
      }
      if (specifierCase_ == 3) {
        result.specifier_ = specifier_;
      }
      result.specifierCase_ = specifierCase_;
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
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.DataSource) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.DataSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.DataSource other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.DataSource.getDefaultInstance()) return this;
      switch (other.getSpecifierCase()) {
        case FILENAME: {
          specifierCase_ = 1;
          specifier_ = other.specifier_;
          onChanged();
          break;
        }
        case INLINE_BYTES: {
          setInlineBytes(other.getInlineBytes());
          break;
        }
        case INLINE_STRING: {
          specifierCase_ = 3;
          specifier_ = other.specifier_;
          onChanged();
          break;
        }
        case SPECIFIER_NOT_SET: {
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
      io.grpc.xds.shaded.envoy.api.v2.core.DataSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.DataSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int specifierCase_ = 0;
    private java.lang.Object specifier_;
    public SpecifierCase
        getSpecifierCase() {
      return SpecifierCase.forNumber(
          specifierCase_);
    }

    public Builder clearSpecifier() {
      specifierCase_ = 0;
      specifier_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Local filesystem data source.
     * </pre>
     *
     * <code>string filename = 1 [(.validate.rules) = { ... }</code>
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = "";
      if (specifierCase_ == 1) {
        ref = specifier_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (specifierCase_ == 1) {
          specifier_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Local filesystem data source.
     * </pre>
     *
     * <code>string filename = 1 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = "";
      if (specifierCase_ == 1) {
        ref = specifier_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (specifierCase_ == 1) {
          specifier_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Local filesystem data source.
     * </pre>
     *
     * <code>string filename = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setFilename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  specifierCase_ = 1;
      specifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Local filesystem data source.
     * </pre>
     *
     * <code>string filename = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearFilename() {
      if (specifierCase_ == 1) {
        specifierCase_ = 0;
        specifier_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Local filesystem data source.
     * </pre>
     *
     * <code>string filename = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      specifierCase_ = 1;
      specifier_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Bytes inlined in the configuration.
     * </pre>
     *
     * <code>bytes inline_bytes = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString getInlineBytes() {
      if (specifierCase_ == 2) {
        return (com.google.protobuf.ByteString) specifier_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Bytes inlined in the configuration.
     * </pre>
     *
     * <code>bytes inline_bytes = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setInlineBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  specifierCase_ = 2;
      specifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bytes inlined in the configuration.
     * </pre>
     *
     * <code>bytes inline_bytes = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearInlineBytes() {
      if (specifierCase_ == 2) {
        specifierCase_ = 0;
        specifier_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * String inlined in the configuration.
     * </pre>
     *
     * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
     */
    public java.lang.String getInlineString() {
      java.lang.Object ref = "";
      if (specifierCase_ == 3) {
        ref = specifier_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (specifierCase_ == 3) {
          specifier_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String inlined in the configuration.
     * </pre>
     *
     * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getInlineStringBytes() {
      java.lang.Object ref = "";
      if (specifierCase_ == 3) {
        ref = specifier_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (specifierCase_ == 3) {
          specifier_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String inlined in the configuration.
     * </pre>
     *
     * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder setInlineString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  specifierCase_ = 3;
      specifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String inlined in the configuration.
     * </pre>
     *
     * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder clearInlineString() {
      if (specifierCase_ == 3) {
        specifierCase_ = 0;
        specifier_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * String inlined in the configuration.
     * </pre>
     *
     * <code>string inline_string = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder setInlineStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      specifierCase_ = 3;
      specifier_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.DataSource)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.DataSource)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.DataSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.DataSource();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.DataSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSource>
      PARSER = new com.google.protobuf.AbstractParser<DataSource>() {
    public DataSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSource> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.envoy.api.v2.core.DataSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
