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
 * Details of Assets suggested based on the existing mappings available in snapshot during import.
 */
public class AssetSuggestions extends GenericModel {

  @SerializedName("mapping_pattern_id")
  protected String mappingPatternId;
  @SerializedName("mapping_pattern_hash")
  protected String mappingPatternHash;
  @SerializedName("mapping_pattern_name")
  protected String mappingPatternName;
  @SerializedName("apply_to_assets")
  protected List<DataAsset> applyToAssets;

  /**
   * Gets the mappingPatternId.
   *
   * The mapping pattern id of asset mappings.
   *
   * @return the mappingPatternId
   */
  public String getMappingPatternId() {
    return mappingPatternId;
  }

  /**
   * Gets the mappingPatternHash.
   *
   * The mapping pattern hash of asset mappings.
   *
   * @return the mappingPatternHash
   */
  public String getMappingPatternHash() {
    return mappingPatternHash;
  }

  /**
   * Gets the mappingPatternName.
   *
   * Name of the mapping pattern created.
   *
   * @return the mappingPatternName
   */
  public String getMappingPatternName() {
    return mappingPatternName;
  }

  /**
   * Gets the applyToAssets.
   *
   * Collection of Suggested Data Assets based on the mappings.
   *
   * @return the applyToAssets
   */
  public List<DataAsset> getApplyToAssets() {
    return applyToAssets;
  }
}

