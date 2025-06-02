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
 * Response object for comparing records.
 */
public class Compare extends GenericModel {

  protected Float score;
  @SerializedName("comparison_post_filter_methods")
  protected List<SinglePostFilterMethod> comparisonPostFilterMethods;
  @SerializedName("score_category")
  protected String scoreCategory;
  @SerializedName("record_number2")
  protected Float recordNumber2;
  @SerializedName("record_number1")
  protected Float recordNumber1;
  @SerializedName("compare_methods")
  protected List<SingleCompareMethod> compareMethods;
  @SerializedName("potential_overlay_triggers")
  protected ComparePotentialOverlayTriggers potentialOverlayTriggers;
  @SerializedName("is_potential_overlay")
  protected Boolean isPotentialOverlay;

  protected Compare() { }

  /**
   * Gets the score.
   *
   * The overall comparison score of the record(s).
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
   * Gets the scoreCategory.
   *
   * The score category of the record(s).
   *
   * @return the scoreCategory
   */
  public String getScoreCategory() {
    return scoreCategory;
  }

  /**
   * Gets the recordNumber2.
   *
   * The record number of the second record.
   *
   * @return the recordNumber2
   */
  public Float getRecordNumber2() {
    return recordNumber2;
  }

  /**
   * Gets the recordNumber1.
   *
   * The record number of the first record.
   *
   * @return the recordNumber1
   */
  public Float getRecordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the compareMethods.
   *
   * Collection of comparators used for comparing the records.
   *
   * @return the compareMethods
   */
  public List<SingleCompareMethod> getCompareMethods() {
    return compareMethods;
  }

  /**
   * Gets the potentialOverlayTriggers.
   *
   * Collection of triggers that caused Potential Overlay.
   *
   * @return the potentialOverlayTriggers
   */
  public ComparePotentialOverlayTriggers getPotentialOverlayTriggers() {
    return potentialOverlayTriggers;
  }

  /**
   * Gets the isPotentialOverlay.
   *
   * Flag to indicate Potential Overlay.
   *
   * @return the isPotentialOverlay
   */
  public Boolean isIsPotentialOverlay() {
    return isPotentialOverlay;
  }
}

