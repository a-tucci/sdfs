// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SDFSEvent.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.SDFSEventResponse}
 */
public final class SDFSEventResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.SDFSEventResponse)
    SDFSEventResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SDFSEventResponse.newBuilder() to construct.
  private SDFSEventResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SDFSEventResponse() {
    error_ = "";
    errorCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SDFSEventResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SDFSEventResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            errorCode_ = rawValue;
            break;
          }
          case 26: {
            org.opendedup.grpc.SDFSEvent.Builder subBuilder = null;
            if (event_ != null) {
              subBuilder = event_.toBuilder();
            }
            event_ = input.readMessage(org.opendedup.grpc.SDFSEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(event_);
              event_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return org.opendedup.grpc.SDFSEventOuterClass.internal_static_org_opendedup_grpc_SDFSEventResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.SDFSEventOuterClass.internal_static_org_opendedup_grpc_SDFSEventResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.SDFSEventResponse.class, org.opendedup.grpc.SDFSEventResponse.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 1;</code>
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 1;</code>
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERRORCODE_FIELD_NUMBER = 2;
  private int errorCode_;
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  @java.lang.Override public int getErrorCodeValue() {
    return errorCode_;
  }
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
   * @return The errorCode.
   */
  @java.lang.Override public org.opendedup.grpc.errorCodes getErrorCode() {
    @SuppressWarnings("deprecation")
    org.opendedup.grpc.errorCodes result = org.opendedup.grpc.errorCodes.valueOf(errorCode_);
    return result == null ? org.opendedup.grpc.errorCodes.UNRECOGNIZED : result;
  }

  public static final int EVENT_FIELD_NUMBER = 3;
  private org.opendedup.grpc.SDFSEvent event_;
  /**
   * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return event_ != null;
  }
  /**
   * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
   * @return The event.
   */
  @java.lang.Override
  public org.opendedup.grpc.SDFSEvent getEvent() {
    return event_ == null ? org.opendedup.grpc.SDFSEvent.getDefaultInstance() : event_;
  }
  /**
   * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
   */
  @java.lang.Override
  public org.opendedup.grpc.SDFSEventOrBuilder getEventOrBuilder() {
    return getEvent();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, error_);
    }
    if (errorCode_ != org.opendedup.grpc.errorCodes.NOERR.getNumber()) {
      output.writeEnum(2, errorCode_);
    }
    if (event_ != null) {
      output.writeMessage(3, getEvent());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, error_);
    }
    if (errorCode_ != org.opendedup.grpc.errorCodes.NOERR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, errorCode_);
    }
    if (event_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEvent());
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
    if (!(obj instanceof org.opendedup.grpc.SDFSEventResponse)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.SDFSEventResponse other = (org.opendedup.grpc.SDFSEventResponse) obj;

    if (!getError()
        .equals(other.getError())) return false;
    if (errorCode_ != other.errorCode_) return false;
    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent()
          .equals(other.getEvent())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + errorCode_;
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.SDFSEventResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.opendedup.grpc.SDFSEventResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code org.opendedup.grpc.SDFSEventResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.SDFSEventResponse)
      org.opendedup.grpc.SDFSEventResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.SDFSEventOuterClass.internal_static_org_opendedup_grpc_SDFSEventResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.SDFSEventOuterClass.internal_static_org_opendedup_grpc_SDFSEventResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.SDFSEventResponse.class, org.opendedup.grpc.SDFSEventResponse.Builder.class);
    }

    // Construct using org.opendedup.grpc.SDFSEventResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      error_ = "";

      errorCode_ = 0;

      if (eventBuilder_ == null) {
        event_ = null;
      } else {
        event_ = null;
        eventBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.SDFSEventOuterClass.internal_static_org_opendedup_grpc_SDFSEventResponse_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.SDFSEventResponse getDefaultInstanceForType() {
      return org.opendedup.grpc.SDFSEventResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.SDFSEventResponse build() {
      org.opendedup.grpc.SDFSEventResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.SDFSEventResponse buildPartial() {
      org.opendedup.grpc.SDFSEventResponse result = new org.opendedup.grpc.SDFSEventResponse(this);
      result.error_ = error_;
      result.errorCode_ = errorCode_;
      if (eventBuilder_ == null) {
        result.event_ = event_;
      } else {
        result.event_ = eventBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.opendedup.grpc.SDFSEventResponse) {
        return mergeFrom((org.opendedup.grpc.SDFSEventResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.SDFSEventResponse other) {
      if (other == org.opendedup.grpc.SDFSEventResponse.getDefaultInstance()) return this;
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (other.errorCode_ != 0) {
        setErrorCodeValue(other.getErrorCodeValue());
      }
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.opendedup.grpc.SDFSEventResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.SDFSEventResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 1;</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 1;</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 1;</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 1;</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private int errorCode_ = 0;
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
     * @return The enum numeric value on the wire for errorCode.
     */
    @java.lang.Override public int getErrorCodeValue() {
      return errorCode_;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
     * @param value The enum numeric value on the wire for errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCodeValue(int value) {
      
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
     * @return The errorCode.
     */
    @java.lang.Override
    public org.opendedup.grpc.errorCodes getErrorCode() {
      @SuppressWarnings("deprecation")
      org.opendedup.grpc.errorCodes result = org.opendedup.grpc.errorCodes.valueOf(errorCode_);
      return result == null ? org.opendedup.grpc.errorCodes.UNRECOGNIZED : result;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
     * @param value The errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCode(org.opendedup.grpc.errorCodes value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.org.opendedup.grpc.errorCodes errorCode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorCode() {
      
      errorCode_ = 0;
      onChanged();
      return this;
    }

    private org.opendedup.grpc.SDFSEvent event_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.opendedup.grpc.SDFSEvent, org.opendedup.grpc.SDFSEvent.Builder, org.opendedup.grpc.SDFSEventOrBuilder> eventBuilder_;
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return eventBuilder_ != null || event_ != null;
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     * @return The event.
     */
    public org.opendedup.grpc.SDFSEvent getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null ? org.opendedup.grpc.SDFSEvent.getDefaultInstance() : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    public Builder setEvent(org.opendedup.grpc.SDFSEvent value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        eventBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    public Builder setEvent(
        org.opendedup.grpc.SDFSEvent.Builder builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    public Builder mergeEvent(org.opendedup.grpc.SDFSEvent value) {
      if (eventBuilder_ == null) {
        if (event_ != null) {
          event_ =
            org.opendedup.grpc.SDFSEvent.newBuilder(event_).mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        eventBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    public Builder clearEvent() {
      if (eventBuilder_ == null) {
        event_ = null;
        onChanged();
      } else {
        event_ = null;
        eventBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    public org.opendedup.grpc.SDFSEvent.Builder getEventBuilder() {
      
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    public org.opendedup.grpc.SDFSEventOrBuilder getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null ?
            org.opendedup.grpc.SDFSEvent.getDefaultInstance() : event_;
      }
    }
    /**
     * <code>.org.opendedup.grpc.SDFSEvent event = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.opendedup.grpc.SDFSEvent, org.opendedup.grpc.SDFSEvent.Builder, org.opendedup.grpc.SDFSEventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.opendedup.grpc.SDFSEvent, org.opendedup.grpc.SDFSEvent.Builder, org.opendedup.grpc.SDFSEventOrBuilder>(
                getEvent(),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.SDFSEventResponse)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.SDFSEventResponse)
  private static final org.opendedup.grpc.SDFSEventResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.SDFSEventResponse();
  }

  public static org.opendedup.grpc.SDFSEventResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SDFSEventResponse>
      PARSER = new com.google.protobuf.AbstractParser<SDFSEventResponse>() {
    @java.lang.Override
    public SDFSEventResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SDFSEventResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SDFSEventResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SDFSEventResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.SDFSEventResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

