/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.master.file;

import alluxio.file.options.CheckConsistencyOptions;
import alluxio.file.options.CompleteFileOptions;
import alluxio.file.options.CreateDirectoryOptions;
import alluxio.file.options.CreateFileOptions;
import alluxio.file.options.DeleteOptions;
import alluxio.file.options.FreeOptions;
import alluxio.file.options.CommonOptions;
import alluxio.file.options.ListStatusOptions;
import alluxio.file.options.LoadMetadataOptions;
import alluxio.file.options.MountOptions;
import alluxio.file.options.RenameOptions;
import alluxio.file.options.SetAclOptions;
import alluxio.file.options.SetAttributeOptions;
import alluxio.file.options.SyncMetadataOptions;
import alluxio.grpc.GetStatusPOptions;

/**
 * The interface for file system master default options.
 */
public interface FileSystemMasterOptions {
  /**
   * @return an instance of {@link CheckConsistencyOptions}
   */
  CheckConsistencyOptions getCheckConsistencyOptions();

  /**
   * @return an instance of {@link CommonOptions}
   */
  CommonOptions getCommonOptions();

  /**
   * @return an instance of {@link CompleteFileOptions}
   */
  CompleteFileOptions getCompleteFileOptions();

  /**
   * @return an instance of {@link CreateFileOptions}
   */
  CreateFileOptions getCreateFileOptions();

  /**
   * @return an instance of {@link CreateDirectoryOptions}
   */
  CreateDirectoryOptions getCreateDirectoryOptions();

  /**
   * @return an instance of {@link DeleteOptions}
   */
  DeleteOptions getDeleteOptions();

  /**
   * @return an instance of {@link FreeOptions}
   */
  FreeOptions getFreeOptions();

  /**
   * @return an instance of {@link GetStatusPOptions}
   */
  GetStatusPOptions.Builder getGetStatusPOptions();

  /**
   * @return an instance of {@link ListStatusOptions}
   */
  ListStatusOptions getListStatusOptions();

  /**
   * @return an instance of {@link LoadMetadataOptions}
   */
  LoadMetadataOptions getLoadMetadataOptions();

  /**
   * @return an instance of {@link MountOptions}
   */
  MountOptions getMountOptions();

  /**
   * @return an instance of {@link RenameOptions}
   */
  RenameOptions getRenameOptions();

  /**
   * @return an instance of {@link SetAclOptions}
   */
  SetAclOptions getSetAclOptions();

  /**
   * @return an instance of {@link SetAttributeOptions}
   */
  SetAttributeOptions getSetAttributeOptions();

  /**
   * @return an instance of {@link SyncMetadataOptions}
   */
  SyncMetadataOptions getSyncMetadataOptions();
}
