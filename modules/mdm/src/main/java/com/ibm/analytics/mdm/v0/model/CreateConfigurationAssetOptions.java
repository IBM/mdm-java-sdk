/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createConfigurationAsset options.
 */
public class CreateConfigurationAssetOptions extends GenericModel {

  protected String crn;
  protected String assetId;
  protected String assetName;
  protected String assetStatus;
  protected List<AssetMapping> assetMappings;
  protected String assetCreatedDate;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String assetId;
    private String assetName;
    private String assetStatus;
    private List<AssetMapping> assetMappings;
    private String assetCreatedDate;

    private Builder(CreateConfigurationAssetOptions createConfigurationAssetOptions) {
      this.crn = createConfigurationAssetOptions.crn;
      this.assetId = createConfigurationAssetOptions.assetId;
      this.assetName = createConfigurationAssetOptions.assetName;
      this.assetStatus = createConfigurationAssetOptions.assetStatus;
      this.assetMappings = createConfigurationAssetOptions.assetMappings;
      this.assetCreatedDate = createConfigurationAssetOptions.assetCreatedDate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param assetId the assetId
     * @param assetName the assetName
     * @param assetStatus the assetStatus
     */
    public Builder(String crn, String assetId, String assetName, String assetStatus) {
      this.crn = crn;
      this.assetId = assetId;
      this.assetName = assetName;
      this.assetStatus = assetStatus;
    }

    /**
     * Builds a CreateConfigurationAssetOptions.
     *
     * @return the new CreateConfigurationAssetOptions instance
     */
    public CreateConfigurationAssetOptions build() {
      return new CreateConfigurationAssetOptions(this);
    }

    /**
     * Adds an assetMappings to assetMappings.
     *
     * @param assetMappings the new assetMappings
     * @return the CreateConfigurationAssetOptions builder
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
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateConfigurationAssetOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the CreateConfigurationAssetOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the CreateConfigurationAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the assetStatus.
     *
     * @param assetStatus the assetStatus
     * @return the CreateConfigurationAssetOptions builder
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
     * @return the CreateConfigurationAssetOptions builder
     */
    public Builder assetMappings(List<AssetMapping> assetMappings) {
      this.assetMappings = assetMappings;
      return this;
    }

    /**
     * Set the assetCreatedDate.
     *
     * @param assetCreatedDate the assetCreatedDate
     * @return the CreateConfigurationAssetOptions builder
     */
    public Builder assetCreatedDate(String assetCreatedDate) {
      this.assetCreatedDate = assetCreatedDate;
      return this;
    }
  }

  protected CreateConfigurationAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetName,
      "assetName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetStatus,
      "assetStatus cannot be null");
    crn = builder.crn;
    assetId = builder.assetId;
    assetName = builder.assetName;
    assetStatus = builder.assetStatus;
    assetMappings = builder.assetMappings;
    assetCreatedDate = builder.assetCreatedDate;
  }

  /**
   * New builder.
   *
   * @return a CreateConfigurationAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The cloud resource name of the service.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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
   * Gets the assetMappings.
   *
   * list of columns mapped with data model.
   *
   * @return the assetMappings
   */
  public List<AssetMapping> assetMappings() {
    return assetMappings;
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
}
