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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single pair of records.
 */
public class GetPairsPair extends GenericModel {

  @SerializedName("record_number_1")
  protected String recordNumber1;
  @SerializedName("record_number_2")
  protected String recordNumber2;
  protected Float score;
  @SerializedName("comparison_details")
  protected Map<String, Object> comparisonDetails;
  protected String category;
  protected String id;

  /**
   * Gets the recordNumber1.
   *
   * The unique identifier of one record in the pair.
   *
   * @return the recordNumber1
   */
  public String getRecordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * The unique identifier of another record in the pair.
   *
   * @return the recordNumber2
   */
  public String getRecordNumber2() {
    return recordNumber2;
  }

  /**
   * Gets the score.
   *
   * The overall comparison score of the records in the pair.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the comparisonDetails.
   *
   * Comparison scores for different compare methods.
   *
   * @return the comparisonDetails
   */
  public Map<String, Object> getComparisonDetails() {
    return comparisonDetails;
  }

  /**
   * Gets the category.
   *
   * The match category of the records in the pair.
   *
   * @return the category
   */
  public String getCategory() {
    return category;
  }

  /**
   * Gets the id.
   *
   * The unique identifier of the pair.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

