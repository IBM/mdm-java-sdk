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
 * Match Entity Size Statistics.
 */
public class MatchEntitySizeStats extends GenericModel {

  @SerializedName("entity_id")
  protected String entityId;
  @SerializedName("entity_size")
  protected String entitySize;

  /**
   * Gets the entityId.
   *
   * entity id.
   *
   * @return the entityId
   */
  public String getEntityId() {
    return entityId;
  }

  /**
   * Gets the entitySize.
   *
   * entity size.
   *
   * @return the entitySize
   */
  public String getEntitySize() {
    return entitySize;
  }
}

