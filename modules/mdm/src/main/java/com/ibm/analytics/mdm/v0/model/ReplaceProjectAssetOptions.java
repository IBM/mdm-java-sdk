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
 * The replaceProjectAsset options.
 */
public class ReplaceProjectAssetOptions extends GenericModel {

  protected String projectId;
  protected String assetId;
  protected String crn;
  protected String assetName;
  protected String assetStatus;
  protected String assetCreatedDate;
  protected List<AssetMapping> assetMappings;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String assetId;
    private String crn;
    private String assetName;
    private String assetStatus;
    private String assetCreatedDate;
    private List<AssetMapping> assetMappings;

    private Builder(ReplaceProjectAssetOptions replaceProjectAssetOptions) {
      this.projectId = replaceProjectAssetOptions.projectId;
      this.assetId = replaceProjectAssetOptions.assetId;
      this.crn = replaceProjectAssetOptions.crn;
      this.assetName = replaceProjectAssetOptions.assetName;
      this.assetStatus = replaceProjectAssetOptions.assetStatus;
      this.assetCreatedDate = replaceProjectAssetOptions.assetCreatedDate;
      this.assetMappings = replaceProjectAssetOptions.assetMappings;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param assetId the assetId
     * @param crn the crn
     * @param assetName the assetName
     * @param assetStatus the assetStatus
     */
    public Builder(String projectId, String assetId, String crn, String assetName, String assetStatus) {
      this.projectId = projectId;
      this.assetId = assetId;
      this.crn = crn;
      this.assetName = assetName;
      this.assetStatus = assetStatus;
    }

    /**
     * Builds a ReplaceProjectAssetOptions.
     *
     * @return the new ReplaceProjectAssetOptions instance
     */
    public ReplaceProjectAssetOptions build() {
      return new ReplaceProjectAssetOptions(this);
    }

    /**
     * Adds an assetMappings to assetMappings.
     *
     * @param assetMappings the new assetMappings
     * @return the ReplaceProjectAssetOptions builder
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
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ReplaceProjectAssetOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the ReplaceProjectAssetOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ReplaceProjectAssetOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the ReplaceProjectAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the assetStatus.
     *
     * @param assetStatus the assetStatus
     * @return the ReplaceProjectAssetOptions builder
     */
    public Builder assetStatus(String assetStatus) {
      this.assetStatus = assetStatus;
      return this;
    }

    /**
     * Set the assetCreatedDate.
     *
     * @param assetCreatedDate the assetCreatedDate
     * @return the ReplaceProjectAssetOptions builder
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
     * @return the ReplaceProjectAssetOptions builder
     */
    public Builder assetMappings(List<AssetMapping> assetMappings) {
      this.assetMappings = assetMappings;
      return this;
    }
  }

  protected ReplaceProjectAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assetId,
      "assetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetName,
      "assetName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetStatus,
      "assetStatus cannot be null");
    projectId = builder.projectId;
    assetId = builder.assetId;
    crn = builder.crn;
    assetName = builder.assetName;
    assetStatus = builder.assetStatus;
    assetCreatedDate = builder.assetCreatedDate;
    assetMappings = builder.assetMappings;
  }

  /**
   * New builder.
   *
   * @return a ReplaceProjectAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * Unique identifier of project_metadata.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
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
   * Gets the assetName.
   *
   * asse name.
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

