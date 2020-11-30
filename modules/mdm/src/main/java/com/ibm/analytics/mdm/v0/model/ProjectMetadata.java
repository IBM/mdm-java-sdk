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
 * Project metadata object.
 */
public class ProjectMetadata extends GenericModel {

  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("catalog_id")
  protected String catalogId;
  protected String collaborators;
  @SerializedName("created_date")
  protected String createdDate;
  @SerializedName("storage_type")
  protected String storageType;
  @SerializedName("last_update_date")
  protected String lastUpdateDate;
  protected String description;
  protected String role;
  protected String name;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String catalogId;
    private String collaborators;
    private String storageType;
    private String description;
    private String role;
    private String name;

    private Builder(ProjectMetadata projectMetadata) {
      this.projectId = projectMetadata.projectId;
      this.catalogId = projectMetadata.catalogId;
      this.collaborators = projectMetadata.collaborators;
      this.storageType = projectMetadata.storageType;
      this.description = projectMetadata.description;
      this.role = projectMetadata.role;
      this.name = projectMetadata.name;
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
     * Builds a ProjectMetadata.
     *
     * @return the new ProjectMetadata instance
     */
    public ProjectMetadata build() {
      return new ProjectMetadata(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ProjectMetadata builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ProjectMetadata builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the collaborators.
     *
     * @param collaborators the collaborators
     * @return the ProjectMetadata builder
     */
    public Builder collaborators(String collaborators) {
      this.collaborators = collaborators;
      return this;
    }

    /**
     * Set the storageType.
     *
     * @param storageType the storageType
     * @return the ProjectMetadata builder
     */
    public Builder storageType(String storageType) {
      this.storageType = storageType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ProjectMetadata builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the role.
     *
     * @param role the role
     * @return the ProjectMetadata builder
     */
    public Builder role(String role) {
      this.role = role;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ProjectMetadata builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ProjectMetadata(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    projectId = builder.projectId;
    catalogId = builder.catalogId;
    collaborators = builder.collaborators;
    storageType = builder.storageType;
    description = builder.description;
    role = builder.role;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ProjectMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the createdDate.
   *
   * created date of project metadata.
   *
   * @return the createdDate
   */
  public String createdDate() {
    return createdDate;
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
   * Gets the lastUpdateDate.
   *
   * last update date of project metadata.
   *
   * @return the lastUpdateDate
   */
  public String lastUpdateDate() {
    return lastUpdateDate;
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
   * Gets the role.
   *
   * role.
   *
   * @return the role
   */
  public String role() {
    return role;
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
   * Gets the id.
   *
   * id of this project metadata.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

