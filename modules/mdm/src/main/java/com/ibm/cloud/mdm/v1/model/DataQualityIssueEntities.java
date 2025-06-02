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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object for data quality issue entities.
 */
public class DataQualityIssueEntities extends GenericModel {

  @SerializedName("record_number")
  protected String recordNumber;
  @SerializedName("entity_id")
  protected String entityId;

  protected DataQualityIssueEntities() { }

  /**
   * Gets the recordNumber.
   *
   * @return the recordNumber
   */
  public String getRecordNumber() {
    return recordNumber;
  }

  /**
   * Gets the entityId.
   *
   * @return the entityId
   */
  public String getEntityId() {
    return entityId;
  }
}

