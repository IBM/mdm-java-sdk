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
package com.ibm.cloud.mdm.v0.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * asset.
 */
public class Asset extends GenericModel {

  @SerializedName("asset_created_date")
  protected String assetCreatedDate;
  @SerializedName("asset_mappings")
  protected List<AssetMapping> assetMappings;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("asset_last_updated_date")
  protected String assetLastUpdatedDate;
  @SerializedName("asset_status")
  protected String assetStatus;
  @SerializedName("asset_name")
  protected String assetName;

  /**
   * Gets the assetCreatedDate.
   *
   * asset created date.
   *
   * @return the assetCreatedDate
   */
  public String getAssetCreatedDate() {
    return assetCreatedDate;
  }

  /**
   * Gets the assetMappings.
   *
   * list of columns mapped with data model.
   *
   * @return the assetMappings
   */
  public List<AssetMapping> getAssetMappings() {
    return assetMappings;
  }

  /**
   * Gets the assetId.
   *
   * asset id.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the assetLastUpdatedDate.
   *
   * asset last updated date.
   *
   * @return the assetLastUpdatedDate
   */
  public String getAssetLastUpdatedDate() {
    return assetLastUpdatedDate;
  }

  /**
   * Gets the assetStatus.
   *
   * asset status.
   *
   * @return the assetStatus
   */
  public String getAssetStatus() {
    return assetStatus;
  }

  /**
   * Gets the assetName.
   *
   * asset name.
   *
   * @return the assetName
   */
  public String getAssetName() {
    return assetName;
  }
}

