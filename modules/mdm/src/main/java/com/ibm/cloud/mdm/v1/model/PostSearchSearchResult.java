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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single record matching the search criteria.
 */
public class PostSearchSearchResult extends GenericModel {

  @SerializedName("record_id")
  protected String recordId;
  protected Float score;
  @SerializedName("comparison_post_filter_methods")
  protected List<SinglePostFilterMethod> comparisonPostFilterMethods;
  @SerializedName("record_number")
  protected String recordNumber;
  @SerializedName("record_source")
  protected String recordSource;
  @SerializedName("compare_methods")
  protected List<SingleCompareMethod> compareMethods;

  protected PostSearchSearchResult() { }

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
   * Gets the score.
   *
   * The overall comparison score of the record.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the comparisonPostFilterMethods.
   *
   * Collection of post filter methods.
   *
   * @return the comparisonPostFilterMethods
   */
  public List<SinglePostFilterMethod> getComparisonPostFilterMethods() {
    return comparisonPostFilterMethods;
  }

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of a source record as assigned by the system.
   *
   * @return the recordNumber
   */
  public String getRecordNumber() {
    return recordNumber;
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
   * Gets the compareMethods.
   *
   * Collection of comparators for a potential match record.
   *
   * @return the compareMethods
   */
  public List<SingleCompareMethod> getCompareMethods() {
    return compareMethods;
  }
}

