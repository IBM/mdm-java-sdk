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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceConfiguratorConfigurationMetadata options.
 */
public class ReplaceConfiguratorConfigurationMetadataOptions extends GenericModel {

  protected String name;
  protected String description;
  protected String projectId;
  protected String catalogId;
  protected Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String projectId;
    private String catalogId;
    private Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis;

    /**
     * Instantiates a new Builder from an existing ReplaceConfiguratorConfigurationMetadataOptions instance.
     *
     * @param replaceConfiguratorConfigurationMetadataOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions) {
      this.name = replaceConfiguratorConfigurationMetadataOptions.name;
      this.description = replaceConfiguratorConfigurationMetadataOptions.description;
      this.projectId = replaceConfiguratorConfigurationMetadataOptions.projectId;
      this.catalogId = replaceConfiguratorConfigurationMetadataOptions.catalogId;
      this.pairAnalysis = replaceConfiguratorConfigurationMetadataOptions.pairAnalysis;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceConfiguratorConfigurationMetadataOptions.
     *
     * @return the new ReplaceConfiguratorConfigurationMetadataOptions instance
     */
    public ReplaceConfiguratorConfigurationMetadataOptions build() {
      return new ReplaceConfiguratorConfigurationMetadataOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the pairAnalysis.
     *
     * @param pairAnalysis the pairAnalysis
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder pairAnalysis(Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis) {
      this.pairAnalysis = pairAnalysis;
      return this;
    }

    /**
     * Set the configurationMetadata.
     *
     * @param configurationMetadata the configurationMetadata
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder configurationMetadata(ConfigurationMetadata configurationMetadata) {
      this.name = configurationMetadata.name();
      this.description = configurationMetadata.description();
      this.projectId = configurationMetadata.projectId();
      this.catalogId = configurationMetadata.catalogId();
      this.pairAnalysis = configurationMetadata.pairAnalysis();
      return this;
    }
  }

  protected ReplaceConfiguratorConfigurationMetadataOptions() { }

  protected ReplaceConfiguratorConfigurationMetadataOptions(Builder builder) {
    name = builder.name;
    description = builder.description;
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    pairAnalysis = builder.pairAnalysis;
  }

  /**
   * New builder.
   *
   * @return a ReplaceConfiguratorConfigurationMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the pairAnalysis.
   *
   * Pair analysis in configuration Metadata.
   *
   * @return the pairAnalysis
   */
  public Map<String, Map<String, ConfigurationMetadataEntity>> pairAnalysis() {
    return pairAnalysis;
  }
}

