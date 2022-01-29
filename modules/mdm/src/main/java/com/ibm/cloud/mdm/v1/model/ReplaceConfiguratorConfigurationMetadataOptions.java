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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceConfiguratorConfigurationMetadata options.
 */
public class ReplaceConfiguratorConfigurationMetadataOptions extends GenericModel {

  protected String projectId;
  protected String catalogId;
  protected String description;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String catalogId;
    private String description;
    private String name;

    private Builder(ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions) {
      this.projectId = replaceConfiguratorConfigurationMetadataOptions.projectId;
      this.catalogId = replaceConfiguratorConfigurationMetadataOptions.catalogId;
      this.description = replaceConfiguratorConfigurationMetadataOptions.description;
      this.name = replaceConfiguratorConfigurationMetadataOptions.name;
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
     * Set the configurationMetadata.
     *
     * @param configurationMetadata the configurationMetadata
     * @return the ReplaceConfiguratorConfigurationMetadataOptions builder
     */
    public Builder configurationMetadata(ConfigurationMetadata configurationMetadata) {
      this.projectId = configurationMetadata.projectId();
      this.catalogId = configurationMetadata.catalogId();
      this.description = configurationMetadata.description();
      this.name = configurationMetadata.name();
      return this;
    }
  }

  protected ReplaceConfiguratorConfigurationMetadataOptions(Builder builder) {
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    description = builder.description;
    name = builder.name;
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
}

