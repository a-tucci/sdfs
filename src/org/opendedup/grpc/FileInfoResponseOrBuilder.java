// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileInfo.proto

package org.opendedup.grpc;

public interface FileInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.FileInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fileName = 1;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string fileName = 1;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string filePath = 2;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <code>string filePath = 2;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <code>.org.opendedup.grpc.FileInfoResponse.fileType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.org.opendedup.grpc.FileInfoResponse.fileType type = 3;</code>
   * @return The type.
   */
  org.opendedup.grpc.FileInfoResponse.fileType getType();

  /**
   * <code>string sdfsPath = 4;</code>
   * @return The sdfsPath.
   */
  java.lang.String getSdfsPath();
  /**
   * <code>string sdfsPath = 4;</code>
   * @return The bytes for sdfsPath.
   */
  com.google.protobuf.ByteString
      getSdfsPathBytes();

  /**
   * <code>int64 atime = 5;</code>
   * @return The atime.
   */
  long getAtime();

  /**
   * <code>int64 mtime = 6;</code>
   * @return The mtime.
   */
  long getMtime();

  /**
   * <code>int64 ctime = 7;</code>
   * @return The ctime.
   */
  long getCtime();

  /**
   * <code>bool hidden = 8;</code>
   * @return The hidden.
   */
  boolean getHidden();

  /**
   * <code>int64 size = 9;</code>
   * @return The size.
   */
  long getSize();

  /**
   * <code>bool open = 10;</code>
   * @return The open.
   */
  boolean getOpen();

  /**
   * <code>string fileGuild = 11;</code>
   * @return The fileGuild.
   */
  java.lang.String getFileGuild();
  /**
   * <code>string fileGuild = 11;</code>
   * @return The bytes for fileGuild.
   */
  com.google.protobuf.ByteString
      getFileGuildBytes();

  /**
   * <code>string mapGuid = 12;</code>
   * @return The mapGuid.
   */
  java.lang.String getMapGuid();
  /**
   * <code>string mapGuid = 12;</code>
   * @return The bytes for mapGuid.
   */
  com.google.protobuf.ByteString
      getMapGuidBytes();

  /**
   * <code>bool localOwner = 13;</code>
   * @return The localOwner.
   */
  boolean getLocalOwner();

  /**
   * <code>bool execute = 14;</code>
   * @return The execute.
   */
  boolean getExecute();

  /**
   * <code>bool read = 15;</code>
   * @return The read.
   */
  boolean getRead();

  /**
   * <code>bool write = 16;</code>
   * @return The write.
   */
  boolean getWrite();

  /**
   * <code>bool importing = 17;</code>
   * @return The importing.
   */
  boolean getImporting();

  /**
   * <code>bool symlink = 18;</code>
   * @return The symlink.
   */
  boolean getSymlink();

  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 19;</code>
   */
  java.util.List<org.opendedup.grpc.FileAttributes> 
      getFileAttributesList();
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 19;</code>
   */
  org.opendedup.grpc.FileAttributes getFileAttributes(int index);
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 19;</code>
   */
  int getFileAttributesCount();
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 19;</code>
   */
  java.util.List<? extends org.opendedup.grpc.FileAttributesOrBuilder> 
      getFileAttributesOrBuilderList();
  /**
   * <code>repeated .org.opendedup.grpc.FileAttributes fileAttributes = 19;</code>
   */
  org.opendedup.grpc.FileAttributesOrBuilder getFileAttributesOrBuilder(
      int index);

  /**
   * <code>string id = 20;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 20;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated .org.opendedup.grpc.FileInfoResponse files = 21;</code>
   */
  java.util.List<org.opendedup.grpc.FileInfoResponse> 
      getFilesList();
  /**
   * <code>repeated .org.opendedup.grpc.FileInfoResponse files = 21;</code>
   */
  org.opendedup.grpc.FileInfoResponse getFiles(int index);
  /**
   * <code>repeated .org.opendedup.grpc.FileInfoResponse files = 21;</code>
   */
  int getFilesCount();
  /**
   * <code>repeated .org.opendedup.grpc.FileInfoResponse files = 21;</code>
   */
  java.util.List<? extends org.opendedup.grpc.FileInfoResponseOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <code>repeated .org.opendedup.grpc.FileInfoResponse files = 21;</code>
   */
  org.opendedup.grpc.FileInfoResponseOrBuilder getFilesOrBuilder(
      int index);

  /**
   * <code>string parentPath = 22;</code>
   * @return The parentPath.
   */
  java.lang.String getParentPath();
  /**
   * <code>string parentPath = 22;</code>
   * @return The bytes for parentPath.
   */
  com.google.protobuf.ByteString
      getParentPathBytes();

  /**
   * <code>string volumeid = 23;</code>
   * @return The volumeid.
   */
  java.lang.String getVolumeid();
  /**
   * <code>string volumeid = 23;</code>
   * @return The bytes for volumeid.
   */
  com.google.protobuf.ByteString
      getVolumeidBytes();

  /**
   * <code>.org.opendedup.grpc.IOMonitorResponse ioMonitor = 24;</code>
   * @return Whether the ioMonitor field is set.
   */
  boolean hasIoMonitor();
  /**
   * <code>.org.opendedup.grpc.IOMonitorResponse ioMonitor = 24;</code>
   * @return The ioMonitor.
   */
  org.opendedup.grpc.IOMonitorResponse getIoMonitor();
  /**
   * <code>.org.opendedup.grpc.IOMonitorResponse ioMonitor = 24;</code>
   */
  org.opendedup.grpc.IOMonitorResponseOrBuilder getIoMonitorOrBuilder();

  /**
   * <code>string symlinkPath = 25;</code>
   * @return The symlinkPath.
   */
  java.lang.String getSymlinkPath();
  /**
   * <code>string symlinkPath = 25;</code>
   * @return The bytes for symlinkPath.
   */
  com.google.protobuf.ByteString
      getSymlinkPathBytes();

  /**
   * <code>int64 group_id = 26;</code>
   * @return The groupId.
   */
  long getGroupId();

  /**
   * <code>int64 user_id = 27;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>int32 permissions = 28;</code>
   * @return The permissions.
   */
  int getPermissions();

  /**
   * <code>int64 hashcode = 29;</code>
   * @return The hashcode.
   */
  long getHashcode();

  /**
   * <code>int64 retentionLock = 30;</code>
   * @return The retentionLock.
   */
  long getRetentionLock();

  /**
   * <code>int64 attributes = 31;</code>
   * @return The attributes.
   */
  long getAttributes();

  /**
   * <code>string version = 32;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 32;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>int32 mode = 33;</code>
   * @return The mode.
   */
  int getMode();

  /**
   * <code>bool delete_on_close = 34;</code>
   * @return The deleteOnClose.
   */
  boolean getDeleteOnClose();
}
