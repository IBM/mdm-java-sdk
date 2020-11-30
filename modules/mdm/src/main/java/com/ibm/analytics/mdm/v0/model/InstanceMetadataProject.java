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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single project as available in WKC.
 */
public class InstanceMetadataProject extends GenericModel {

  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("project_name")
  protected String projectName;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String assetId;
    private String projectName;

    private Builder(InstanceMetadataProject instanceMetadataProject) {
      this.projectId = instanceMetadataProject.projectId;
      this.assetId = instanceMetadataProject.assetId;
      this.projectName = instanceMetadataProject.projectName;
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
     */
    public Builder(String projectId) {
      this.projectId = projectId;
    }

    /**
     * Builds a InstanceMetadataProject.
     *
     * @return the new InstanceMetadataProject instance
     */
    public InstanceMetadataProject build() {
      return new InstanceMetadataProject(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the InstanceMetadataProject builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the InstanceMetadataProject builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the projectName.
     *
     * @param projectName the projectName
     * @return the InstanceMetadataProject builder
     */
    public Builder projectName(String projectName) {
      this.projectName = projectName;
      return this;
    }
  }

  protected InstanceMetadataProject(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    projectId = builder.projectId;
    assetId = builder.assetId;
    projectName = builder.projectName;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataProject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * Unique Identifier of the project associated with instance.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the assetId.
   *
   * Identifier for the configuration asset created on the project.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the projectName.
   *
   * Name of the project associated with instance.
   *
   * @return the projectName
   */
  public String projectName() {
    return projectName;
  }
}

