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
 * Pair and corresponding user decision details.
 */
public class PairDecision extends GenericModel {

  protected String id;
  protected String category;
  @SerializedName("record_number_1")
  protected String recordNumber1;
  @SerializedName("record_number_2")
  protected String recordNumber2;
  @SerializedName("user_decision")
  protected String userDecision;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("last_update_date")
  protected String lastUpdateDate;

  protected PairDecision() { }

  /**
   * Gets the id.
   *
   * The id of the comparison record pair.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the category.
   *
   * The identified category of the comparison record pair.
   *
   * @return the category
   */
  public String getCategory() {
    return category;
  }

  /**
   * Gets the recordNumber1.
   *
   * The record number of the first record of the comparison record pair.
   *
   * @return the recordNumber1
   */
  public String getRecordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * The record number of the second record of the comparison record pair.
   *
   * @return the recordNumber2
   */
  public String getRecordNumber2() {
    return recordNumber2;
  }

  /**
   * Gets the userDecision.
   *
   * The decision taken by the user for the comparison record pair.
   *
   * @return the userDecision
   */
  public String getUserDecision() {
    return userDecision;
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of the comparison pair records.
   *
   * @return the recordType
   */
  public String getRecordType() {
    return recordType;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * The last modified date of the pair decision.
   *
   * @return the lastUpdateDate
   */
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }
}

