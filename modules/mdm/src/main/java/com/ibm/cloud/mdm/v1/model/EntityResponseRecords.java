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
package com.ibm.cloud.mdm.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A collection of records.
 */
public class EntityResponseRecords extends GenericModel {

  protected String score;
  @SerializedName("record_number")
  protected String recordNumber;
  @SerializedName("entity_number")
  protected String entityNumber;

  /**
   * Gets the score.
   *
   * The comparison score.
   *
   * @return the score
   */
  public String getScore() {
    return score;
  }

  /**
   * Gets the recordNumber.
   *
   * The record number.
   *
   * @return the recordNumber
   */
  public String getRecordNumber() {
    return recordNumber;
  }

  /**
   * Gets the entityNumber.
   *
   * The entity number.
   *
   * @return the entityNumber
   */
  public String getEntityNumber() {
    return entityNumber;
  }
}

