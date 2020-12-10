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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines record types or entity types allowed as relationship endpoint.
 */
public class PutDataModelResponseRelationshipEndpoint extends GenericModel {

  @SerializedName("entity_types")
  protected List<String> entityTypes;
  @SerializedName("record_types")
  protected List<String> recordTypes;

  /**
   * Gets the entityTypes.
   *
   * Collection of allowed entity types.
   *
   * @return the entityTypes
   */
  public List<String> getEntityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of allowed record types.
   *
   * @return the recordTypes
   */
  public List<String> getRecordTypes() {
    return recordTypes;
  }
}

