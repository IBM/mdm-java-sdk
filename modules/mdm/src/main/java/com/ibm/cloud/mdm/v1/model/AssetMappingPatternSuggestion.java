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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of Asset mapping pattern suggestions.
 */
public class AssetMappingPatternSuggestion extends GenericModel {

  @SerializedName("mapping_pattern_id")
  protected String mappingPatternId;
  @SerializedName("mapping_pattern_hash")
  protected String mappingPatternHash;
  @SerializedName("mapping_pattern_name")
  protected String mappingPatternName;
  @SerializedName("source_of_mapping")
  protected String sourceOfMapping;
  protected List<AssetForAssetMapping> assets;
  @SerializedName("asset_record_type")
  protected String assetRecordType;
  @SerializedName("asset_type")
  protected String assetType;
  @SerializedName("asset_mappings")
  protected List<AssetMapping> assetMappings;
  @SerializedName("mapping_pattern_last_updated_date")
  protected String mappingPatternLastUpdatedDate;

  /**
   * Builder.
   */
  public static class Builder {
    private String mappingPatternId;
    private String mappingPatternHash;
    private String mappingPatternName;
    private String sourceOfMapping;
    private List<AssetForAssetMapping> assets;
    private String assetRecordType;
    private String assetType;
    private List<AssetMapping> assetMappings;
    private String mappingPatternLastUpdatedDate;

    /**
     * Instantiates a new Builder from an existing AssetMappingPatternSuggestion instance.
     *
     * @param assetMappingPatternSuggestion the instance to initialize the Builder with
     */
    private Builder(AssetMappingPatternSuggestion assetMappingPatternSuggestion) {
      this.mappingPatternId = assetMappingPatternSuggestion.mappingPatternId;
      this.mappingPatternHash = assetMappingPatternSuggestion.mappingPatternHash;
      this.mappingPatternName = assetMappingPatternSuggestion.mappingPatternName;
      this.sourceOfMapping = assetMappingPatternSuggestion.sourceOfMapping;
      this.assets = assetMappingPatternSuggestion.assets;
      this.assetRecordType = assetMappingPatternSuggestion.assetRecordType;
      this.assetType = assetMappingPatternSuggestion.assetType;
      this.assetMappings = assetMappingPatternSuggestion.assetMappings;
      this.mappingPatternLastUpdatedDate = assetMappingPatternSuggestion.mappingPatternLastUpdatedDate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AssetMappingPatternSuggestion.
     *
     * @return the new AssetMappingPatternSuggestion instance
     */
    public AssetMappingPatternSuggestion build() {
      return new AssetMappingPatternSuggestion(this);
    }

    /**
     * Adds a new element to assets.
     *
     * @param assets the new element to be added
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder addAssets(AssetForAssetMapping assets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(assets,
        "assets cannot be null");
      if (this.assets == null) {
        this.assets = new ArrayList<AssetForAssetMapping>();
      }
      this.assets.add(assets);
      return this;
    }

    /**
     * Adds a new element to assetMappings.
     *
     * @param assetMappings the new element to be added
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder addAssetMappings(AssetMapping assetMappings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(assetMappings,
        "assetMappings cannot be null");
      if (this.assetMappings == null) {
        this.assetMappings = new ArrayList<AssetMapping>();
      }
      this.assetMappings.add(assetMappings);
      return this;
    }

    /**
     * Set the mappingPatternId.
     *
     * @param mappingPatternId the mappingPatternId
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder mappingPatternId(String mappingPatternId) {
      this.mappingPatternId = mappingPatternId;
      return this;
    }

    /**
     * Set the mappingPatternHash.
     *
     * @param mappingPatternHash the mappingPatternHash
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder mappingPatternHash(String mappingPatternHash) {
      this.mappingPatternHash = mappingPatternHash;
      return this;
    }

    /**
     * Set the mappingPatternName.
     *
     * @param mappingPatternName the mappingPatternName
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder mappingPatternName(String mappingPatternName) {
      this.mappingPatternName = mappingPatternName;
      return this;
    }

    /**
     * Set the sourceOfMapping.
     *
     * @param sourceOfMapping the sourceOfMapping
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder sourceOfMapping(String sourceOfMapping) {
      this.sourceOfMapping = sourceOfMapping;
      return this;
    }

    /**
     * Set the assets.
     * Existing assets will be replaced.
     *
     * @param assets the assets
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder assets(List<AssetForAssetMapping> assets) {
      this.assets = assets;
      return this;
    }

    /**
     * Set the assetRecordType.
     *
     * @param assetRecordType the assetRecordType
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder assetRecordType(String assetRecordType) {
      this.assetRecordType = assetRecordType;
      return this;
    }

    /**
     * Set the assetType.
     *
     * @param assetType the assetType
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    /**
     * Set the assetMappings.
     * Existing assetMappings will be replaced.
     *
     * @param assetMappings the assetMappings
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder assetMappings(List<AssetMapping> assetMappings) {
      this.assetMappings = assetMappings;
      return this;
    }

    /**
     * Set the mappingPatternLastUpdatedDate.
     *
     * @param mappingPatternLastUpdatedDate the mappingPatternLastUpdatedDate
     * @return the AssetMappingPatternSuggestion builder
     */
    public Builder mappingPatternLastUpdatedDate(String mappingPatternLastUpdatedDate) {
      this.mappingPatternLastUpdatedDate = mappingPatternLastUpdatedDate;
      return this;
    }
  }

  protected AssetMappingPatternSuggestion() { }

  protected AssetMappingPatternSuggestion(Builder builder) {
    mappingPatternId = builder.mappingPatternId;
    mappingPatternHash = builder.mappingPatternHash;
    mappingPatternName = builder.mappingPatternName;
    sourceOfMapping = builder.sourceOfMapping;
    assets = builder.assets;
    assetRecordType = builder.assetRecordType;
    assetType = builder.assetType;
    assetMappings = builder.assetMappings;
    mappingPatternLastUpdatedDate = builder.mappingPatternLastUpdatedDate;
  }

  /**
   * New builder.
   *
   * @return a AssetMappingPatternSuggestion builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mappingPatternId.
   *
   * The identifier of this suggested mapping pattern id.
   *
   * @return the mappingPatternId
   */
  public String mappingPatternId() {
    return mappingPatternId;
  }

  /**
   * Gets the mappingPatternHash.
   *
   * The hash generated for asset mapping data.
   *
   * @return the mappingPatternHash
   */
  public String mappingPatternHash() {
    return mappingPatternHash;
  }

  /**
   * Gets the mappingPatternName.
   *
   * The name of the suggested mapping pattern.
   *
   * @return the mappingPatternName
   */
  public String mappingPatternName() {
    return mappingPatternName;
  }

  /**
   * Gets the sourceOfMapping.
   *
   * The source of the suggested mapping pattern.
   *
   * @return the sourceOfMapping
   */
  public String sourceOfMapping() {
    return sourceOfMapping;
  }

  /**
   * Gets the assets.
   *
   * The asset where the mapping pattern has been applied.
   *
   * @return the assets
   */
  public List<AssetForAssetMapping> assets() {
    return assets;
  }

  /**
   * Gets the assetRecordType.
   *
   * The asset record type , eg. person, customer, organization.
   *
   * @return the assetRecordType
   */
  public String assetRecordType() {
    return assetRecordType;
  }

  /**
   * Gets the assetType.
   *
   * The type of asset, eg. record.
   *
   * @return the assetType
   */
  public String assetType() {
    return assetType;
  }

  /**
   * Gets the assetMappings.
   *
   * The collection of Data Asset mappings with the data model.
   *
   * @return the assetMappings
   */
  public List<AssetMapping> assetMappings() {
    return assetMappings;
  }

  /**
   * Gets the mappingPatternLastUpdatedDate.
   *
   * Mapping pattern last update date.
   *
   * @return the mappingPatternLastUpdatedDate
   */
  public String mappingPatternLastUpdatedDate() {
    return mappingPatternLastUpdatedDate;
  }
}

