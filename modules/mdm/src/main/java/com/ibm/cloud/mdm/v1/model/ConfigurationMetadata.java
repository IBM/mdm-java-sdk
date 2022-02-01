/*
 * (C) Copyright IBM Corp. 2022.
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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Configuration metadata details.
 */
public class ConfigurationMetadata extends GenericModel {

  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("last_update_date")
  protected String lastUpdateDate;
  @SerializedName("created_date")
  protected String createdDate;
  @SerializedName("pair_analysis")
  protected Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis;
  protected String description;
  protected String name;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String catalogId;
    private Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis;
    private String description;
    private String name;

    private Builder(ConfigurationMetadata configurationMetadata) {
      this.projectId = configurationMetadata.projectId;
      this.catalogId = configurationMetadata.catalogId;
      this.pairAnalysis = configurationMetadata.pairAnalysis;
      this.description = configurationMetadata.description;
      this.name = configurationMetadata.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigurationMetadata.
     *
     * @return the new ConfigurationMetadata instance
     */
    public ConfigurationMetadata build() {
      return new ConfigurationMetadata(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ConfigurationMetadata builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ConfigurationMetadata builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the pairAnalysis.
     *
     * @param pairAnalysis the pairAnalysis
     * @return the ConfigurationMetadata builder
     */
    public Builder pairAnalysis(Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis) {
      this.pairAnalysis = pairAnalysis;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ConfigurationMetadata builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ConfigurationMetadata builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ConfigurationMetadata(Builder builder) {
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    pairAnalysis = builder.pairAnalysis;
    description = builder.description;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ConfigurationMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * The project id of the linked WKC project.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the catalogId.
   *
   * The catalog id from the linked WKC project.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * Last updated date of this Configuration metadata.
   *
   * @return the lastUpdateDate
   */
  public String lastUpdateDate() {
    return lastUpdateDate;
  }

  /**
   * Gets the createdDate.
   *
   * The date of Configuration metadata creation.
   *
   * @return the createdDate
   */
  public String createdDate() {
    return createdDate;
  }

  /**
   * Gets the pairAnalysis.
   *
   * Pair analysis in configuration Metadata.
   *
   * @return the pairAnalysis
   */
  public Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis() {
    return pairAnalysis;
  }

  /**
   * Gets the description.
   *
   * The description of the Configuration metadata.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the name.
   *
   * The name of the Configuration metadata.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the id.
   *
   * The identifier of this Configuration metadata.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

