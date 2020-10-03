// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileInfo.proto

package org.opendedup.grpc;

public interface IOMonitorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.IOMonitorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 virtualBytesWritten = 1;</code>
   * @return The virtualBytesWritten.
   */
  long getVirtualBytesWritten();

  /**
   * <code>int64 actualBytesWritten = 2;</code>
   * @return The actualBytesWritten.
   */
  long getActualBytesWritten();

  /**
   * <code>int64 bytesRead = 3;</code>
   * @return The bytesRead.
   */
  long getBytesRead();

  /**
   * <code>int64 duplicateBlocks = 4;</code>
   * @return The duplicateBlocks.
   */
  long getDuplicateBlocks();

  /**
   * <code>int64 writeOpts = 5;</code>
   * @return The writeOpts.
   */
  long getWriteOpts();

  /**
   * <code>int64 readOpts = 6;</code>
   * @return The readOpts.
   */
  long getReadOpts();

  /**
   * <code>int64 maxReadOps = 7;</code>
   * @return The maxReadOps.
   */
  long getMaxReadOps();

  /**
   * <code>int64 maxWriteOps = 8;</code>
   * @return The maxWriteOps.
   */
  long getMaxWriteOps();

  /**
   * <code>int64 maxIops = 9;</code>
   * @return The maxIops.
   */
  long getMaxIops();

  /**
   * <code>int64 maxReadMbps = 10;</code>
   * @return The maxReadMbps.
   */
  long getMaxReadMbps();

  /**
   * <code>int64 maxWriteMbps = 11;</code>
   * @return The maxWriteMbps.
   */
  long getMaxWriteMbps();

  /**
   * <code>int64 maxMbps = 12;</code>
   * @return The maxMbps.
   */
  long getMaxMbps();

  /**
   * <code>int32 ioQos = 13;</code>
   * @return The ioQos.
   */
  int getIoQos();

  /**
   * <code>string ioProfile = 14;</code>
   * @return The ioProfile.
   */
  java.lang.String getIoProfile();
  /**
   * <code>string ioProfile = 14;</code>
   * @return The bytes for ioProfile.
   */
  com.google.protobuf.ByteString
      getIoProfileBytes();

  /**
   * <code>int64 maxRbps = 15;</code>
   * @return The maxRbps.
   */
  long getMaxRbps();

  /**
   * <code>int64 maxWbps = 16;</code>
   * @return The maxWbps.
   */
  long getMaxWbps();

  /**
   * <code>int64 maxBps = 17;</code>
   * @return The maxBps.
   */
  long getMaxBps();
}