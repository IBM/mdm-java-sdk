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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The suggestAssetMappingsPatterns options.
 */
public class SuggestAssetMappingsPatternsOptions extends GenericModel {

  protected List<AssetId> assetIds;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AssetId> assetIds;

    private Builder(SuggestAssetMappingsPatternsOptions suggestAssetMappingsPatternsOptions) {
      this.assetIds = suggestAssetMappingsPatternsOptions.assetIds;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SuggestAssetMappingsPatternsOptions.
     *
     * @return the new SuggestAssetMappingsPatternsOptions instance
     */
    public SuggestAssetMappingsPatternsOptions build() {
      return new SuggestAssetMappingsPatternsOptions(this);
    }

    /**
     * Adds an assetIds to assetIds.
     *
     * @param assetIds the new assetIds
     * @return the SuggestAssetMappingsPatternsOptions builder
     */
    public Builder addAssetIds(AssetId assetIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(assetIds,
        "assetIds cannot be null");
      if (this.assetIds == null) {
        this.assetIds = new ArrayList<AssetId>();
      }
      this.assetIds.add(assetIds);
      return this;
    }

    /**
     * Set the assetIds.
     * Existing assetIds will be replaced.
     *
     * @param assetIds the assetIds
     * @return the SuggestAssetMappingsPatternsOptions builder
     */
    public Builder assetIds(List<AssetId> assetIds) {
      this.assetIds = assetIds;
      return this;
    }
  }

  protected SuggestAssetMappingsPatternsOptions() { }

  protected SuggestAssetMappingsPatternsOptions(Builder builder) {
    assetIds = builder.assetIds;
  }

  /**
   * New builder.
   *
   * @return a SuggestAssetMappingsPatternsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetIds.
   *
   * The collection of asset_id for fetching their corresponding mapping pattern suggestions.
   *
   * @return the assetIds
   */
  public List<AssetId> assetIds() {
    return assetIds;
  }
}

