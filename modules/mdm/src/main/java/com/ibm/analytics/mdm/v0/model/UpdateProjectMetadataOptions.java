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
 * The updateProjectMetadata options.
 */
public class UpdateProjectMetadataOptions extends GenericModel {

  protected String id;
  protected String crn;
  protected String description;
  protected String name;
  protected String projectId;
  protected String catalogId;
  protected String collaborators;
  protected String storageType;
  protected String role;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String crn;
    private String description;
    private String name;
    private String projectId;
    private String catalogId;
    private String collaborators;
    private String storageType;
    private String role;

    private Builder(UpdateProjectMetadataOptions updateProjectMetadataOptions) {
      this.id = updateProjectMetadataOptions.id;
      this.crn = updateProjectMetadataOptions.crn;
      this.description = updateProjectMetadataOptions.description;
      this.name = updateProjectMetadataOptions.name;
      this.projectId = updateProjectMetadataOptions.projectId;
      this.catalogId = updateProjectMetadataOptions.catalogId;
      this.collaborators = updateProjectMetadataOptions.collaborators;
      this.storageType = updateProjectMetadataOptions.storageType;
      this.role = updateProjectMetadataOptions.role;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param crn the crn
     * @param description the description
     * @param name the name
     */
    public Builder(String id, String crn, String description, String name) {
      this.id = id;
      this.crn = crn;
      this.description = description;
      this.name = name;
    }

    /**
     * Builds a UpdateProjectMetadataOptions.
     *
     * @return the new UpdateProjectMetadataOptions instance
     */
    public UpdateProjectMetadataOptions build() {
      return new UpdateProjectMetadataOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the collaborators.
     *
     * @param collaborators the collaborators
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder collaborators(String collaborators) {
      this.collaborators = collaborators;
      return this;
    }

    /**
     * Set the storageType.
     *
     * @param storageType the storageType
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder storageType(String storageType) {
      this.storageType = storageType;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }

    /**
     * Set the projectMetadata.
     *
     * @param projectMetadata the projectMetadata
     * @return the UpdateProjectMetadataOptions builder
     */
    public Builder projectMetadata(ProjectMetadata projectMetadata) {
      this.description = projectMetadata.description();
      this.name = projectMetadata.name();
      this.projectId = projectMetadata.projectId();
      this.catalogId = projectMetadata.catalogId();
      this.collaborators = projectMetadata.collaborators();
      this.storageType = projectMetadata.storageType();
      this.role = projectMetadata.role();
      return this;
    }
  }

  protected UpdateProjectMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    id = builder.id;
    crn = builder.crn;
    description = builder.description;
    name = builder.name;
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    collaborators = builder.collaborators;
    storageType = builder.storageType;
    role = builder.role;
  }

  /**
   * New builder.
   *
   * @return a UpdateProjectMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier of project_metadata.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * description of the project.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the name.
   *
   * name of the project.
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
   * Gets the storageType.
   *
   * storage type of the project.
   *
   * @return the storageType
   */
  public String storageType() {
    return storageType;
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

