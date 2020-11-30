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
 * project metadata.
 */
public class ProjectMetadataResponseProjectMetadata extends GenericModel {

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
   * Gets the projectId.
   *
   * project id of the corresponding wkc project.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the catalogId.
   *
   * catalog id of the corresponding wkc project.
   *
   * @return the catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Gets the collaborators.
   *
   * collaborators.
   *
   * @return the collaborators
   */
  public String getCollaborators() {
    return collaborators;
  }

  /**
   * Gets the createdDate.
   *
   * created date of project metadata.
   *
   * @return the createdDate
   */
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * Gets the storageType.
   *
   * storage type of the project.
   *
   * @return the storageType
   */
  public String getStorageType() {
    return storageType;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * last update date of project metadata.
   *
   * @return the lastUpdateDate
   */
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }

  /**
   * Gets the description.
   *
   * description of the project.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the role.
   *
   * role.
   *
   * @return the role
   */
  public String getRole() {
    return role;
  }

  /**
   * Gets the name.
   *
   * name of the project.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the id.
   *
   * id of this project metadata.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

