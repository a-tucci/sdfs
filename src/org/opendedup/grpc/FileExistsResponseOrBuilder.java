// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface FileExistsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.FileExistsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool exists = 1;</code>
   * @return The exists.
   */
  boolean getExists();

  /**
   * <code>string error = 2;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 2;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
   * @return The errorCode.
   */
  org.opendedup.grpc.errorCodes getErrorCode();
}
