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
 * A single entity id and entity type.
 */
public class GetEntityIdsEntityinfo extends GenericModel {

  @SerializedName("entity_type")
  protected String entityType;
  @SerializedName("entity_id")
  protected String entityId;

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String getEntityType() {
    return entityType;
  }

  /**
   * Gets the entityId.
   *
   * The entity identifier of an entity as assigned by the system.
   *
   * @return the entityId
   */
  public String getEntityId() {
    return entityId;
  }
}

