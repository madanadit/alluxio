// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface CompleteFilePOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.CompleteFilePOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 ufsLength = 1;</code>
   */
  boolean hasUfsLength();
  /**
   * <code>optional int64 ufsLength = 1;</code>
   */
  long getUfsLength();

  /**
   * <code>optional .alluxio.grpc.file.ScheduleAsyncPersistencePOptions asyncPersistOptions = 2;</code>
   */
  boolean hasAsyncPersistOptions();
  /**
   * <code>optional .alluxio.grpc.file.ScheduleAsyncPersistencePOptions asyncPersistOptions = 2;</code>
   */
  alluxio.grpc.ScheduleAsyncPersistencePOptions getAsyncPersistOptions();
  /**
   * <code>optional .alluxio.grpc.file.ScheduleAsyncPersistencePOptions asyncPersistOptions = 2;</code>
   */
  alluxio.grpc.ScheduleAsyncPersistencePOptionsOrBuilder getAsyncPersistOptionsOrBuilder();

  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 3;</code>
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 3;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 3;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}
