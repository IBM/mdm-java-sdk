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
 * Details of statistics of comparison record pair decision.
 */
public class PairStatisticsPairStatistics extends GenericModel {

  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("entity_type")
  protected String entityType;
  protected Long matched;
  @SerializedName("not_matched")
  protected Long notMatched;
  @SerializedName("maybe_matched")
  protected Long maybeMatched;
  @SerializedName("total_pairs_reviewed")
  protected Long totalPairsReviewed;
  @SerializedName("false_positive_rate")
  protected Double falsePositiveRate;
  @SerializedName("false_negative_rate")
  protected Double falseNegativeRate;
  @SerializedName("true_positives")
  protected Long truePositives;
  @SerializedName("true_negatives")
  protected Long trueNegatives;
  @SerializedName("false_positives")
  protected Long falsePositives;
  @SerializedName("false_negatives")
  protected Long falseNegatives;

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
   * Gets the entityType.
   *
   * The entity type identifier of the comparison pair records.
   *
   * @return the entityType
   */
  public String getEntityType() {
    return entityType;
  }

  /**
   * Gets the matched.
   *
   * The number of pairs which are marked as 'Matched' by the user.
   *
   * @return the matched
   */
  public Long getMatched() {
    return matched;
  }

  /**
   * Gets the notMatched.
   *
   * The number of pairs which are marked as 'Not-match' by the user.
   *
   * @return the notMatched
   */
  public Long getNotMatched() {
    return notMatched;
  }

  /**
   * Gets the maybeMatched.
   *
   * The number of pairs which are marked as 'Maybe' by the user.
   *
   * @return the maybeMatched
   */
  public Long getMaybeMatched() {
    return maybeMatched;
  }

  /**
   * Gets the totalPairsReviewed.
   *
   * The total number of pairs which are reviewed by the user.
   *
   * @return the totalPairsReviewed
   */
  public Long getTotalPairsReviewed() {
    return totalPairsReviewed;
  }

  /**
   * Gets the falsePositiveRate.
   *
   * The false positive rate calculated considering the category and user decision on the comparison record pair.
   *
   * @return the falsePositiveRate
   */
  public Double getFalsePositiveRate() {
    return falsePositiveRate;
  }

  /**
   * Gets the falseNegativeRate.
   *
   * The false negative rate calculated considering the category and user decision on the comparison record pair.
   *
   * @return the falseNegativeRate
   */
  public Double getFalseNegativeRate() {
    return falseNegativeRate;
  }

  /**
   * Gets the truePositives.
   *
   * The number of true positive pairs.
   *
   * @return the truePositives
   */
  public Long getTruePositives() {
    return truePositives;
  }

  /**
   * Gets the trueNegatives.
   *
   * The number of true negative pairs.
   *
   * @return the trueNegatives
   */
  public Long getTrueNegatives() {
    return trueNegatives;
  }

  /**
   * Gets the falsePositives.
   *
   * The number of false positive pairs.
   *
   * @return the falsePositives
   */
  public Long getFalsePositives() {
    return falsePositives;
  }

  /**
   * Gets the falseNegatives.
   *
   * The number of false negative pairs.
   *
   * @return the falseNegatives
   */
  public Long getFalseNegatives() {
    return falseNegatives;
  }
}

