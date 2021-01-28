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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addConfiguratorConfigurationAsset options.
 */
public class AddConfiguratorConfigurationAssetOptions extends GenericModel {

  protected String assetStatus;
  protected String assetName;
  protected String assetId;
  protected String assetCreatedDate;
  protected List<AssetMapping> assetMappings;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetStatus;
    private String assetName;
    private String assetId;
    private String assetCreatedDate;
    private List<AssetMapping> assetMappings;

    private Builder(AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions) {
      this.assetStatus = addConfiguratorConfigurationAssetOptions.assetStatus;
      this.assetName = addConfiguratorConfigurationAssetOptions.assetName;
      this.assetId = addConfiguratorConfigurationAssetOptions.assetId;
      this.assetCreatedDate = addConfiguratorConfigurationAssetOptions.assetCreatedDate;
      this.assetMappings = addConfiguratorConfigurationAssetOptions.assetMappings;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetStatus the assetStatus
     * @param assetName the assetName
     * @param assetId the assetId
     */
    public Builder(String assetStatus, String assetName, String assetId) {
      this.assetStatus = assetStatus;
      this.assetName = assetName;
      this.assetId = assetId;
    }

    /**
     * Builds a AddConfiguratorConfigurationAssetOptions.
     *
     * @return the new AddConfiguratorConfigurationAssetOptions instance
     */
    public AddConfiguratorConfigurationAssetOptions build() {
      return new AddConfiguratorConfigurationAssetOptions(this);
    }

    /**
     * Adds an assetMappings to assetMappings.
     *
     * @param assetMappings the new assetMappings
     * @return the AddConfiguratorConfigurationAssetOptions builder
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
     * Set the assetStatus.
     *
     * @param assetStatus the assetStatus
     * @return the AddConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetStatus(String assetStatus) {
      this.assetStatus = assetStatus;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the AddConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the AddConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the assetCreatedDate.
     *
     * @param assetCreatedDate the assetCreatedDate
     * @return the AddConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetCreatedDate(String assetCreatedDate) {
      this.assetCreatedDate = assetCreatedDate;
      return this;
    }

    /**
     * Set the assetMappings.
     * Existing assetMappings will be replaced.
     *
     * @param assetMappings the assetMappings
     * @return the AddConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetMappings(List<AssetMapping> assetMappings) {
      this.assetMappings = assetMappings;
      return this;
    }
  }

  protected AddConfiguratorConfigurationAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetStatus,
      "assetStatus cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetName,
      "assetName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    assetStatus = builder.assetStatus;
    assetName = builder.assetName;
    assetId = builder.assetId;
    assetCreatedDate = builder.assetCreatedDate;
    assetMappings = builder.assetMappings;
  }

  /**
   * New builder.
   *
   * @return a AddConfiguratorConfigurationAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetStatus.
   *
   * asset status.
   *
   * @return the assetStatus
   */
  public String assetStatus() {
    return assetStatus;
  }

  /**
   * Gets the assetName.
   *
   * asset_name.
   *
   * @return the assetName
   */
  public String assetName() {
    return assetName;
  }

  /**
   * Gets the assetId.
   *
   * asset id.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the assetCreatedDate.
   *
   * asset created date.
   *
   * @return the assetCreatedDate
   */
  public String assetCreatedDate() {
    return assetCreatedDate;
  }

  /**
   * Gets the assetMappings.
   *
   * list of columns mapped with data model.
   *
   * @return the assetMappings
   */
  public List<AssetMapping> assetMappings() {
    return assetMappings;
  }
}

