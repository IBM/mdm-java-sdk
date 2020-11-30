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
 * The createProjectAsset options.
 */
public class CreateProjectAssetOptions extends GenericModel {

  protected String projectId;
  protected String crn;
  protected String assetName;
  protected String assetStatus;
  protected String assetId;
  protected String assetCreatedDate;
  protected List<AssetMapping> assetMappings;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String crn;
    private String assetName;
    private String assetStatus;
    private String assetId;
    private String assetCreatedDate;
    private List<AssetMapping> assetMappings;

    private Builder(CreateProjectAssetOptions createProjectAssetOptions) {
      this.projectId = createProjectAssetOptions.projectId;
      this.crn = createProjectAssetOptions.crn;
      this.assetName = createProjectAssetOptions.assetName;
      this.assetStatus = createProjectAssetOptions.assetStatus;
      this.assetId = createProjectAssetOptions.assetId;
      this.assetCreatedDate = createProjectAssetOptions.assetCreatedDate;
      this.assetMappings = createProjectAssetOptions.assetMappings;
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
     * @param crn the crn
     * @param assetName the assetName
     * @param assetStatus the assetStatus
     * @param assetId the assetId
     */
    public Builder(String projectId, String crn, String assetName, String assetStatus, String assetId) {
      this.projectId = projectId;
      this.crn = crn;
      this.assetName = assetName;
      this.assetStatus = assetStatus;
      this.assetId = assetId;
    }

    /**
     * Builds a CreateProjectAssetOptions.
     *
     * @return the new CreateProjectAssetOptions instance
     */
    public CreateProjectAssetOptions build() {
      return new CreateProjectAssetOptions(this);
    }

    /**
     * Adds an assetMappings to assetMappings.
     *
     * @param assetMappings the new assetMappings
     * @return the CreateProjectAssetOptions builder
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
     * @return the CreateProjectAssetOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateProjectAssetOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the CreateProjectAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the assetStatus.
     *
     * @param assetStatus the assetStatus
     * @return the CreateProjectAssetOptions builder
     */
    public Builder assetStatus(String assetStatus) {
      this.assetStatus = assetStatus;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the CreateProjectAssetOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the assetCreatedDate.
     *
     * @param assetCreatedDate the assetCreatedDate
     * @return the CreateProjectAssetOptions builder
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
     * @return the CreateProjectAssetOptions builder
     */
    public Builder assetMappings(List<AssetMapping> assetMappings) {
      this.assetMappings = assetMappings;
      return this;
    }
  }

  protected CreateProjectAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetName,
      "assetName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetStatus,
      "assetStatus cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    projectId = builder.projectId;
    crn = builder.crn;
    assetName = builder.assetName;
    assetStatus = builder.assetStatus;
    assetId = builder.assetId;
    assetCreatedDate = builder.assetCreatedDate;
    assetMappings = builder.assetMappings;
  }

  /**
   * New builder.
   *
   * @return a CreateProjectAssetOptions builder
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

