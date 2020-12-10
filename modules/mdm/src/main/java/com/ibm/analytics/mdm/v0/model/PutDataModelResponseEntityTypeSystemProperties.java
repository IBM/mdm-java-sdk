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
 * Defines metadata of system properties of all entity types.
 */
public class PutDataModelResponseEntityTypeSystemProperties extends GenericModel {

  @SerializedName("entity_id")
  protected PutDataModelResponseSystemProperty entityId;
  @SerializedName("entity_last_updated")
  protected PutDataModelResponseSystemProperty entityLastUpdated;

  /**
   * Gets the entityId.
   *
   * Defines metadata of a system property.
   *
   * @return the entityId
   */
  public PutDataModelResponseSystemProperty getEntityId() {
    return entityId;
  }

  /**
   * Gets the entityLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the entityLastUpdated
   */
  public PutDataModelResponseSystemProperty getEntityLastUpdated() {
    return entityLastUpdated;
  }
}

