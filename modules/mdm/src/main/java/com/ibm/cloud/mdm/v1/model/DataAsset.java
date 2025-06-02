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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data asset details.
 */
public class DataAsset extends GenericModel {

  @SerializedName("asset_name")
  protected String assetName;
  @SerializedName("asset_status")
  protected String assetStatus;
  @SerializedName("asset_created_date")
  protected String assetCreatedDate;
  @SerializedName("asset_mappings")
  protected List<AssetMapping> assetMappings;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("asset_last_updated_date")
  protected String assetLastUpdatedDate;
  @SerializedName("mapping_pattern_id")
  protected String mappingPatternId;
  @SerializedName("mapping_pattern_hash")
  protected String mappingPatternHash;
  @SerializedName("mapping_pattern_name")
  protected String mappingPatternName;

  protected DataAsset() { }

  /**
   * Gets the assetName.
   *
   * The name of the Data asset.
   *
   * @return the assetName
   */
  public String getAssetName() {
    return assetName;
  }

  /**
   * Gets the assetStatus.
   *
   * The status of the Data asset.
   *
   * @return the assetStatus
   */
  public String getAssetStatus() {
    return assetStatus;
  }

  /**
   * Gets the assetCreatedDate.
   *
   * The date of the Data asset creation.
   *
   * @return the assetCreatedDate
   */
  public String getAssetCreatedDate() {
    return assetCreatedDate;
  }

  /**
   * Gets the assetMappings.
   *
   * The details of Data asset column mappings to the data model.
   *
   * @return the assetMappings
   */
  public List<AssetMapping> getAssetMappings() {
    return assetMappings;
  }

  /**
   * Gets the assetId.
   *
   * The identifier of the Data asset.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the assetLastUpdatedDate.
   *
   * The last updated date of the Data asset metadata.
   *
   * @return the assetLastUpdatedDate
   */
  public String getAssetLastUpdatedDate() {
    return assetLastUpdatedDate;
  }

  /**
   * Gets the mappingPatternId.
   *
   * The identifier of this suggested mapping pattern id.
   *
   * @return the mappingPatternId
   */
  public String getMappingPatternId() {
    return mappingPatternId;
  }

  /**
   * Gets the mappingPatternHash.
   *
   * The hash identifier of this suggested mapping pattern hash.
   *
   * @return the mappingPatternHash
   */
  public String getMappingPatternHash() {
    return mappingPatternHash;
  }

  /**
   * Gets the mappingPatternName.
   *
   * The name of the suggested mapping pattern.
   *
   * @return the mappingPatternName
   */
  public String getMappingPatternName() {
    return mappingPatternName;
  }
}

