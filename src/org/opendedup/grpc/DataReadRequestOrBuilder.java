// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface DataReadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.DataReadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 fileHandle = 1;</code>
   * @return The fileHandle.
   */
  long getFileHandle();

  /**
   * <code>int64 start = 2;</code>
   * @return The start.
   */
  long getStart();

  /**
   * <code>int32 len = 3;</code>
   * @return The len.
   */
  int getLen();
}
