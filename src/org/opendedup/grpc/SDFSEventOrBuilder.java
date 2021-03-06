// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SDFSEvent.proto

package org.opendedup.grpc;

public interface SDFSEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.SDFSEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 startTime = 1;</code>
   * @return The startTime.
   */
  long getStartTime();

  /**
   * <code>int64 endTime = 2;</code>
   * @return The endTime.
   */
  long getEndTime();

  /**
   * <code>string level = 3;</code>
   * @return The level.
   */
  java.lang.String getLevel();
  /**
   * <code>string level = 3;</code>
   * @return The bytes for level.
   */
  com.google.protobuf.ByteString
      getLevelBytes();

  /**
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string target = 5;</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <code>string target = 5;</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <code>string shortMsg = 6;</code>
   * @return The shortMsg.
   */
  java.lang.String getShortMsg();
  /**
   * <code>string shortMsg = 6;</code>
   * @return The bytes for shortMsg.
   */
  com.google.protobuf.ByteString
      getShortMsgBytes();

  /**
   * <code>string longMsg = 7;</code>
   * @return The longMsg.
   */
  java.lang.String getLongMsg();
  /**
   * <code>string longMsg = 7;</code>
   * @return The bytes for longMsg.
   */
  com.google.protobuf.ByteString
      getLongMsgBytes();

  /**
   * <code>double percentComplete = 8;</code>
   * @return The percentComplete.
   */
  double getPercentComplete();

  /**
   * <code>int64 maxCount = 9;</code>
   * @return The maxCount.
   */
  long getMaxCount();

  /**
   * <code>int64 currentCount = 10;</code>
   * @return The currentCount.
   */
  long getCurrentCount();

  /**
   * <code>string uuid = 11;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 11;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string parentUuid = 12;</code>
   * @return The parentUuid.
   */
  java.lang.String getParentUuid();
  /**
   * <code>string parentUuid = 12;</code>
   * @return The bytes for parentUuid.
   */
  com.google.protobuf.ByteString
      getParentUuidBytes();

  /**
   * <code>string extendedInfo = 13;</code>
   * @return The extendedInfo.
   */
  java.lang.String getExtendedInfo();
  /**
   * <code>string extendedInfo = 13;</code>
   * @return The bytes for extendedInfo.
   */
  com.google.protobuf.ByteString
      getExtendedInfoBytes();

  /**
   * <code>repeated string childrenUUid = 14;</code>
   * @return A list containing the childrenUUid.
   */
  java.util.List<java.lang.String>
      getChildrenUUidList();
  /**
   * <code>repeated string childrenUUid = 14;</code>
   * @return The count of childrenUUid.
   */
  int getChildrenUUidCount();
  /**
   * <code>repeated string childrenUUid = 14;</code>
   * @param index The index of the element to return.
   * @return The childrenUUid at the given index.
   */
  java.lang.String getChildrenUUid(int index);
  /**
   * <code>repeated string childrenUUid = 14;</code>
   * @param index The index of the value to return.
   * @return The bytes of the childrenUUid at the given index.
   */
  com.google.protobuf.ByteString
      getChildrenUUidBytes(int index);

  /**
   * <code>bool success = 15;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>map&lt;string, string&gt; attributes = 16;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; attributes = 16;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; attributes = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; attributes = 16;</code>
   */

  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attributes = 16;</code>
   */

  java.lang.String getAttributesOrThrow(
      java.lang.String key);
}
