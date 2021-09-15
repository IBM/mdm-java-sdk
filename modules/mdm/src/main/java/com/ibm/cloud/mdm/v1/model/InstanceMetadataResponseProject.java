/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.mdm.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single project as available in WKC.
 */
public class InstanceMetadataResponseProject extends GenericModel {

  @SerializedName("data_asset_id")
  protected String dataAssetId;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("project_name")
  protected String projectName;
  @SerializedName("project_id")
  protected String projectId;

  /**
   * Gets the dataAssetId.
   *
   * Identifier for the data asset created on the project.
   *
   * @return the dataAssetId
   */
  public String getDataAssetId() {
    return dataAssetId;
  }

  /**
   * Gets the assetId.
   *
   * Identifier for the configuration asset created on the project.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the projectName.
   *
   * Name of the project associated with instance.
   *
   * @return the projectName
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * Gets the projectId.
   *
   * Unique Identifier of the project associated with instance.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }
}

