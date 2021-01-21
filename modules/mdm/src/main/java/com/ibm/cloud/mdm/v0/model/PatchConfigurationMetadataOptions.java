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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The patchConfigurationMetadata options.
 */
public class PatchConfigurationMetadataOptions extends GenericModel {

  protected String description;
  protected String name;
  protected String projectId;
  protected String catalogId;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String name;
    private String projectId;
    private String catalogId;

    private Builder(PatchConfigurationMetadataOptions patchConfigurationMetadataOptions) {
      this.description = patchConfigurationMetadataOptions.description;
      this.name = patchConfigurationMetadataOptions.name;
      this.projectId = patchConfigurationMetadataOptions.projectId;
      this.catalogId = patchConfigurationMetadataOptions.catalogId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param description the description
     * @param name the name
     */
    public Builder(String description, String name) {
      this.description = description;
      this.name = name;
    }

    /**
     * Builds a PatchConfigurationMetadataOptions.
     *
     * @return the new PatchConfigurationMetadataOptions instance
     */
    public PatchConfigurationMetadataOptions build() {
      return new PatchConfigurationMetadataOptions(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the configurationMetadata.
     *
     * @param configurationMetadata the configurationMetadata
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder configurationMetadata(ConfigurationMetadata configurationMetadata) {
      this.description = configurationMetadata.description();
      this.name = configurationMetadata.name();
      this.projectId = configurationMetadata.projectId();
      this.catalogId = configurationMetadata.catalogId();
      return this;
    }
  }

  protected PatchConfigurationMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    description = builder.description;
    name = builder.name;
    projectId = builder.projectId;
    catalogId = builder.catalogId;
  }

  /**
   * New builder.
   *
   * @return a PatchConfigurationMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * description of the configuration.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the name.
   *
   * name of the configuration.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the projectId.
   *
   * project id of the corresponding wkc project.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the catalogId.
   *
   * catalog id of the corresponding wkc project.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }
}

