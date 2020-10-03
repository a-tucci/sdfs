// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface StatFSOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.StatFS)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optimal transfer block size 
   * </pre>
   *
   * <code>int32 bsize = 1;</code>
   * @return The bsize.
   */
  int getBsize();

  /**
   * <pre>
   * Total data blocks in filesystem 
   * </pre>
   *
   * <code>int64 blocks = 2;</code>
   * @return The blocks.
   */
  long getBlocks();

  /**
   * <pre>
   * Free blocks in filesystem 
   * </pre>
   *
   * <code>int64 bfree = 3;</code>
   * @return The bfree.
   */
  long getBfree();

  /**
   * <pre>
   * Free blocks available to unprivileged user 
   * </pre>
   *
   * <code>int64 bavail = 4;</code>
   * @return The bavail.
   */
  long getBavail();

  /**
   * <pre>
   * Total inodes in filesystem 
   * </pre>
   *
   * <code>int64 files = 5;</code>
   * @return The files.
   */
  long getFiles();

  /**
   * <pre>
   * Free inodes in filesystem 
   * </pre>
   *
   * <code>int64 ffree = 6;</code>
   * @return The ffree.
   */
  long getFfree();

  /**
   * <pre>
   * Filesystem ID 
   * </pre>
   *
   * <code>int64 fsid = 7;</code>
   * @return The fsid.
   */
  long getFsid();

  /**
   * <pre>
   * Maximum length of filenames 
   * </pre>
   *
   * <code>int32 namelen = 8;</code>
   * @return The namelen.
   */
  int getNamelen();

  /**
   * <pre>
   * Fragment size (since Linux 2.6) 
   * </pre>
   *
   * <code>int32 frsize = 9;</code>
   * @return The frsize.
   */
  int getFrsize();

  /**
   * <pre>
   * Mount flags of filesystem 
   * </pre>
   *
   * <code>int32 flags = 10;</code>
   * @return The flags.
   */
  int getFlags();

  /**
   * <pre>
   * Type of filesystem (see below) 
   * </pre>
   *
   * <code>int32 type = 11;</code>
   * @return The type.
   */
  int getType();
}