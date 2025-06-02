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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object for post start workflow response.
 */
public class StartRemediationWorkflow extends GenericModel {

  protected List<String> entities;
  @SerializedName("last_updated_user")
  protected String lastUpdatedUser;
  protected String id;
  protected String type;
  @SerializedName("last_updated_date")
  protected String lastUpdatedDate;

  protected StartRemediationWorkflow() { }

  /**
   * Gets the entities.
   *
   * Collection of entities.
   *
   * @return the entities
   */
  public List<String> getEntities() {
    return entities;
  }

  /**
   * Gets the lastUpdatedUser.
   *
   * Last updated user.
   *
   * @return the lastUpdatedUser
   */
  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  /**
   * Gets the id.
   *
   * The unique identifier of a workflow.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of workflow.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the lastUpdatedDate.
   *
   * Last updated date.
   *
   * @return the lastUpdatedDate
   */
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }
}

