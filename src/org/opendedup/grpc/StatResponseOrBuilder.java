// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface StatResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.StatResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.opendedup.grpc.Stat stat = 1;</code>
   * @return Whether the stat field is set.
   */
  boolean hasStat();
  /**
   * <code>.org.opendedup.grpc.Stat stat = 1;</code>
   * @return The stat.
   */
  org.opendedup.grpc.Stat getStat();
  /**
   * <code>.org.opendedup.grpc.Stat stat = 1;</code>
   */
  org.opendedup.grpc.StatOrBuilder getStatOrBuilder();

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
