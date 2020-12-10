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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The patchConfigurationMetadata options.
 */
public class PatchConfigurationMetadataOptions extends GenericModel {

  protected String crn;
  protected String description;
  protected String name;
  protected String storageType;
  protected String projectId;
  protected String catalogId;
  protected String collaborators;
  protected String role;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String description;
    private String name;
    private String storageType;
    private String projectId;
    private String catalogId;
    private String collaborators;
    private String role;

    private Builder(PatchConfigurationMetadataOptions patchConfigurationMetadataOptions) {
      this.crn = patchConfigurationMetadataOptions.crn;
      this.description = patchConfigurationMetadataOptions.description;
      this.name = patchConfigurationMetadataOptions.name;
      this.storageType = patchConfigurationMetadataOptions.storageType;
      this.projectId = patchConfigurationMetadataOptions.projectId;
      this.catalogId = patchConfigurationMetadataOptions.catalogId;
      this.collaborators = patchConfigurationMetadataOptions.collaborators;
      this.role = patchConfigurationMetadataOptions.role;
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
     * @param description the description
     * @param name the name
     */
    public Builder(String crn, String description, String name) {
      this.crn = crn;
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
     * Set the crn.
     *
     * @param crn the crn
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
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
     * Set the storageType.
     *
     * @param storageType the storageType
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder storageType(String storageType) {
      this.storageType = storageType;
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
     * Set the collaborators.
     *
     * @param collaborators the collaborators
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder collaborators(String collaborators) {
      this.collaborators = collaborators;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the PatchConfigurationMetadataOptions builder
     */
    public Builder role(String role) {
      this.role = role;
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
      this.storageType = configurationMetadata.storageType();
      this.projectId = configurationMetadata.projectId();
      this.catalogId = configurationMetadata.catalogId();
      this.collaborators = configurationMetadata.collaborators();
      this.role = configurationMetadata.role();
      return this;
    }
  }

  protected PatchConfigurationMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    crn = builder.crn;
    description = builder.description;
    name = builder.name;
    storageType = builder.storageType;
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    collaborators = builder.collaborators;
    role = builder.role;
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
   * Gets the storageType.
   *
   * storage type of the configuration.
   *
   * @return the storageType
   */
  public String storageType() {
    return storageType;
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

  /**
   * Gets the collaborators.
   *
   * collaborators.
   *
   * @return the collaborators
   */
  public String collaborators() {
    return collaborators;
  }

  /**
   * Gets the role.
   *
   * role.
   *
   * @return the role
   */
  public String role() {
    return role;
  }
}

