/*
 * (C) Copyright IBM Corp. 2025.
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
 * Details of Data Asset column mappings with the data model.
 */
public class AssetForAssetMapping extends GenericModel {

  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("asset_name")
  protected String assetName;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String assetId;
    private String assetName;

    /**
     * Instantiates a new Builder from an existing AssetForAssetMapping instance.
     *
     * @param assetForAssetMapping the instance to initialize the Builder with
     */
    private Builder(AssetForAssetMapping assetForAssetMapping) {
      this.projectId = assetForAssetMapping.projectId;
      this.assetId = assetForAssetMapping.assetId;
      this.assetName = assetForAssetMapping.assetName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AssetForAssetMapping.
     *
     * @return the new AssetForAssetMapping instance
     */
    public AssetForAssetMapping build() {
      return new AssetForAssetMapping(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the AssetForAssetMapping builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the AssetForAssetMapping builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the AssetForAssetMapping builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }
  }

  protected AssetForAssetMapping() { }

  protected AssetForAssetMapping(Builder builder) {
    projectId = builder.projectId;
    assetId = builder.assetId;
    assetName = builder.assetName;
  }

  /**
   * New builder.
   *
   * @return a AssetForAssetMapping builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The project id of the Data Asset column.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the assetId.
   *
   * The asset id of the Data Asset column.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the assetName.
   *
   * The asset name of the Data Asset column.
   *
   * @return the assetName
   */
  public String assetName() {
    return assetName;
  }
}

