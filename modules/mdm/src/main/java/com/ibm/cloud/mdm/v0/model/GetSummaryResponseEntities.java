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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Entities' size information.
 */
public class GetSummaryResponseEntities extends GenericModel {

  @SerializedName("entity_id")
  protected Long entityId;
  @SerializedName("entity_size")
  protected Long entitySize;

  /**
   * Gets the entityId.
   *
   * The entity identifier of an entity as assigned by the system.
   *
   * @return the entityId
   */
  public Long getEntityId() {
    return entityId;
  }

  /**
   * Gets the entitySize.
   *
   * The number of records in an entity.
   *
   * @return the entitySize
   */
  public Long getEntitySize() {
    return entitySize;
  }
}

