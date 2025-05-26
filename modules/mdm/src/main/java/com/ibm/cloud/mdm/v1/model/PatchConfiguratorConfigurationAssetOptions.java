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
 * The patchConfiguratorConfigurationAsset options.
 */
public class PatchConfiguratorConfigurationAssetOptions extends GenericModel {

  protected String assetId;
  protected String assetStatus;
  protected List<AssetMapping> assetMappings;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetId;
    private String assetStatus;
    private List<AssetMapping> assetMappings;

    private Builder(PatchConfiguratorConfigurationAssetOptions patchConfiguratorConfigurationAssetOptions) {
      this.assetId = patchConfiguratorConfigurationAssetOptions.assetId;
      this.assetStatus = patchConfiguratorConfigurationAssetOptions.assetStatus;
      this.assetMappings = patchConfiguratorConfigurationAssetOptions.assetMappings;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetId the assetId
     */
    public Builder(String assetId) {
      this.assetId = assetId;
    }

    /**
     * Builds a PatchConfiguratorConfigurationAssetOptions.
     *
     * @return the new PatchConfiguratorConfigurationAssetOptions instance
     */
    public PatchConfiguratorConfigurationAssetOptions build() {
      return new PatchConfiguratorConfigurationAssetOptions(this);
    }

    /**
     * Adds an assetMappings to assetMappings.
     *
     * @param assetMappings the new assetMappings
     * @return the PatchConfiguratorConfigurationAssetOptions builder
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
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the PatchConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the assetStatus.
     *
     * @param assetStatus the assetStatus
     * @return the PatchConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetStatus(String assetStatus) {
      this.assetStatus = assetStatus;
      return this;
    }

    /**
     * Set the assetMappings.
     * Existing assetMappings will be replaced.
     *
     * @param assetMappings the assetMappings
     * @return the PatchConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetMappings(List<AssetMapping> assetMappings) {
      this.assetMappings = assetMappings;
      return this;
    }
  }

  protected PatchConfiguratorConfigurationAssetOptions() { }

  protected PatchConfiguratorConfigurationAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assetId,
      "assetId cannot be empty");
    assetId = builder.assetId;
    assetStatus = builder.assetStatus;
    assetMappings = builder.assetMappings;
  }

  /**
   * New builder.
   *
   * @return a PatchConfiguratorConfigurationAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetId.
   *
   * Unique identifier of project asset.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the assetStatus.
   *
   * The status of the Data Asset.
   *
   * @return the assetStatus
   */
  public String assetStatus() {
    return assetStatus;
  }

  /**
   * Gets the assetMappings.
   *
   * Details of Data Asset column mappings with the data model.
   *
   * @return the assetMappings
   */
  public List<AssetMapping> assetMappings() {
    return assetMappings;
  }
}

