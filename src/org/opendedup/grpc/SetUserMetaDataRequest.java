// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.SetUserMetaDataRequest}
 */
public  final class SetUserMetaDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.SetUserMetaDataRequest)
    SetUserMetaDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetUserMetaDataRequest.newBuilder() to construct.
  private SetUserMetaDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetUserMetaDataRequest() {
    fileAttributes_ = java.util.Collections.emptyList();
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetUserMetaDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetUserMetaDataRequest(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fileAttributes_ = new java.util.ArrayList<org.opendedup.grpc.FileAttributes>();
              mutable_bitField0_ |= 0x00000001;
            }
            fileAttributes_.add(
                input.readMessage(org.opendedup.grpc.FileAttributes.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fileAttributes_ = java.util.Collections.unmodifiableList(fileAttributes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_SetUserMetaDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_SetUserMetaDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.SetUserMetaDataRequest.class, org.opendedup.grpc.SetUserMetaDataRequest.Builder.class);
  }

  public static final int FILEATTRIBUTES_FIELD_NUMBER = 1;
  private java.util.List<org.opendedup.grpc.FileAttributes> fileAttributes_;
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
   */
  public java.util.List<org.opendedup.grpc.FileAttributes> getFileAttributesList() {
    return fileAttributes_;
  }
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
   */
  public java.util.List<? extends org.opendedup.grpc.FileAttributesOrBuilder> 
      getFileAttributesOrBuilderList() {
    return fileAttributes_;
  }
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
   */
  public int getFileAttributesCount() {
    return fileAttributes_.size();
  }
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
   */
  public org.opendedup.grpc.FileAttributes getFileAttributes(int index) {
    return fileAttributes_.get(index);
  }
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
   */
  public org.opendedup.grpc.FileAttributesOrBuilder getFileAttributesOrBuilder(
      int index) {
    return fileAttributes_.get(index);
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   * <code>string Path = 2;</code>
   * @return The path.
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string Path = 2;</code>
   * @return The bytes for path.
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < fileAttributes_.size(); i++) {
      output.writeMessage(1, fileAttributes_.get(i));
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fileAttributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fileAttributes_.get(i));
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
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
    if (!(obj instanceof org.opendedup.grpc.SetUserMetaDataRequest)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.SetUserMetaDataRequest other = (org.opendedup.grpc.SetUserMetaDataRequest) obj;

    if (!getFileAttributesList()
        .equals(other.getFileAttributesList())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
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
    if (getFileAttributesCount() > 0) {
      hash = (37 * hash) + FILEATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getFileAttributesList().hashCode();
    }
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.SetUserMetaDataRequest parseFrom(
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
  public static Builder newBuilder(org.opendedup.grpc.SetUserMetaDataRequest prototype) {
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
   * Protobuf type {@code org.opendedup.grpc.SetUserMetaDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.SetUserMetaDataRequest)
      org.opendedup.grpc.SetUserMetaDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_SetUserMetaDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_SetUserMetaDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.SetUserMetaDataRequest.class, org.opendedup.grpc.SetUserMetaDataRequest.Builder.class);
    }

    // Construct using org.opendedup.grpc.SetUserMetaDataRequest.newBuilder()
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
        getFileAttributesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fileAttributesBuilder_ == null) {
        fileAttributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fileAttributesBuilder_.clear();
      }
      path_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_SetUserMetaDataRequest_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.SetUserMetaDataRequest getDefaultInstanceForType() {
      return org.opendedup.grpc.SetUserMetaDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.SetUserMetaDataRequest build() {
      org.opendedup.grpc.SetUserMetaDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.SetUserMetaDataRequest buildPartial() {
      org.opendedup.grpc.SetUserMetaDataRequest result = new org.opendedup.grpc.SetUserMetaDataRequest(this);
      int from_bitField0_ = bitField0_;
      if (fileAttributesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fileAttributes_ = java.util.Collections.unmodifiableList(fileAttributes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fileAttributes_ = fileAttributes_;
      } else {
        result.fileAttributes_ = fileAttributesBuilder_.build();
      }
      result.path_ = path_;
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
      if (other instanceof org.opendedup.grpc.SetUserMetaDataRequest) {
        return mergeFrom((org.opendedup.grpc.SetUserMetaDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.SetUserMetaDataRequest other) {
      if (other == org.opendedup.grpc.SetUserMetaDataRequest.getDefaultInstance()) return this;
      if (fileAttributesBuilder_ == null) {
        if (!other.fileAttributes_.isEmpty()) {
          if (fileAttributes_.isEmpty()) {
            fileAttributes_ = other.fileAttributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFileAttributesIsMutable();
            fileAttributes_.addAll(other.fileAttributes_);
          }
          onChanged();
        }
      } else {
        if (!other.fileAttributes_.isEmpty()) {
          if (fileAttributesBuilder_.isEmpty()) {
            fileAttributesBuilder_.dispose();
            fileAttributesBuilder_ = null;
            fileAttributes_ = other.fileAttributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fileAttributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFileAttributesFieldBuilder() : null;
          } else {
            fileAttributesBuilder_.addAllMessages(other.fileAttributes_);
          }
        }
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
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
      org.opendedup.grpc.SetUserMetaDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.SetUserMetaDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.opendedup.grpc.FileAttributes> fileAttributes_ =
      java.util.Collections.emptyList();
    private void ensureFileAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fileAttributes_ = new java.util.ArrayList<org.opendedup.grpc.FileAttributes>(fileAttributes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.opendedup.grpc.FileAttributes, org.opendedup.grpc.FileAttributes.Builder, org.opendedup.grpc.FileAttributesOrBuilder> fileAttributesBuilder_;

    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public java.util.List<org.opendedup.grpc.FileAttributes> getFileAttributesList() {
      if (fileAttributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fileAttributes_);
      } else {
        return fileAttributesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public int getFileAttributesCount() {
      if (fileAttributesBuilder_ == null) {
        return fileAttributes_.size();
      } else {
        return fileAttributesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public org.opendedup.grpc.FileAttributes getFileAttributes(int index) {
      if (fileAttributesBuilder_ == null) {
        return fileAttributes_.get(index);
      } else {
        return fileAttributesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder setFileAttributes(
        int index, org.opendedup.grpc.FileAttributes value) {
      if (fileAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileAttributesIsMutable();
        fileAttributes_.set(index, value);
        onChanged();
      } else {
        fileAttributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder setFileAttributes(
        int index, org.opendedup.grpc.FileAttributes.Builder builderForValue) {
      if (fileAttributesBuilder_ == null) {
        ensureFileAttributesIsMutable();
        fileAttributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        fileAttributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder addFileAttributes(org.opendedup.grpc.FileAttributes value) {
      if (fileAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileAttributesIsMutable();
        fileAttributes_.add(value);
        onChanged();
      } else {
        fileAttributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder addFileAttributes(
        int index, org.opendedup.grpc.FileAttributes value) {
      if (fileAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileAttributesIsMutable();
        fileAttributes_.add(index, value);
        onChanged();
      } else {
        fileAttributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder addFileAttributes(
        org.opendedup.grpc.FileAttributes.Builder builderForValue) {
      if (fileAttributesBuilder_ == null) {
        ensureFileAttributesIsMutable();
        fileAttributes_.add(builderForValue.build());
        onChanged();
      } else {
        fileAttributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder addFileAttributes(
        int index, org.opendedup.grpc.FileAttributes.Builder builderForValue) {
      if (fileAttributesBuilder_ == null) {
        ensureFileAttributesIsMutable();
        fileAttributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        fileAttributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder addAllFileAttributes(
        java.lang.Iterable<? extends org.opendedup.grpc.FileAttributes> values) {
      if (fileAttributesBuilder_ == null) {
        ensureFileAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fileAttributes_);
        onChanged();
      } else {
        fileAttributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder clearFileAttributes() {
      if (fileAttributesBuilder_ == null) {
        fileAttributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fileAttributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public Builder removeFileAttributes(int index) {
      if (fileAttributesBuilder_ == null) {
        ensureFileAttributesIsMutable();
        fileAttributes_.remove(index);
        onChanged();
      } else {
        fileAttributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public org.opendedup.grpc.FileAttributes.Builder getFileAttributesBuilder(
        int index) {
      return getFileAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public org.opendedup.grpc.FileAttributesOrBuilder getFileAttributesOrBuilder(
        int index) {
      if (fileAttributesBuilder_ == null) {
        return fileAttributes_.get(index);  } else {
        return fileAttributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public java.util.List<? extends org.opendedup.grpc.FileAttributesOrBuilder> 
         getFileAttributesOrBuilderList() {
      if (fileAttributesBuilder_ != null) {
        return fileAttributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fileAttributes_);
      }
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public org.opendedup.grpc.FileAttributes.Builder addFileAttributesBuilder() {
      return getFileAttributesFieldBuilder().addBuilder(
          org.opendedup.grpc.FileAttributes.getDefaultInstance());
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public org.opendedup.grpc.FileAttributes.Builder addFileAttributesBuilder(
        int index) {
      return getFileAttributesFieldBuilder().addBuilder(
          index, org.opendedup.grpc.FileAttributes.getDefaultInstance());
    }
    /**
     * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 1;</code>
     */
    public java.util.List<org.opendedup.grpc.FileAttributes.Builder> 
         getFileAttributesBuilderList() {
      return getFileAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.opendedup.grpc.FileAttributes, org.opendedup.grpc.FileAttributes.Builder, org.opendedup.grpc.FileAttributesOrBuilder> 
        getFileAttributesFieldBuilder() {
      if (fileAttributesBuilder_ == null) {
        fileAttributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.opendedup.grpc.FileAttributes, org.opendedup.grpc.FileAttributes.Builder, org.opendedup.grpc.FileAttributesOrBuilder>(
                fileAttributes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fileAttributes_ = null;
      }
      return fileAttributesBuilder_;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string Path = 2;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Path = 2;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Path = 2;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string Path = 2;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.SetUserMetaDataRequest)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.SetUserMetaDataRequest)
  private static final org.opendedup.grpc.SetUserMetaDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.SetUserMetaDataRequest();
  }

  public static org.opendedup.grpc.SetUserMetaDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetUserMetaDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetUserMetaDataRequest>() {
    @java.lang.Override
    public SetUserMetaDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetUserMetaDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetUserMetaDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetUserMetaDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.SetUserMetaDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
