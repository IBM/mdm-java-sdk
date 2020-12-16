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
 * Details of a single impacted record with changed entity id.
 */
public class PutIndexResponseRecordinfo extends GenericModel {

  @SerializedName("record_id")
  protected String recordId;
  @SerializedName("entity_id")
  protected Long entityId;
  @SerializedName("record_source")
  protected String recordSource;
  @SerializedName("record_number")
  protected Long recordNumber;

  /**
   * Gets the recordId.
   *
   * The identifier of the record.
   *
   * @return the recordId
   */
  public String getRecordId() {
    return recordId;
  }

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
   * Gets the recordSource.
   *
   * The source system name of a record.
   *
   * @return the recordSource
   */
  public String getRecordSource() {
    return recordSource;
  }

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of a source record as assigned by the system.
   *
   * @return the recordNumber
   */
  public Long getRecordNumber() {
    return recordNumber;
  }
}

