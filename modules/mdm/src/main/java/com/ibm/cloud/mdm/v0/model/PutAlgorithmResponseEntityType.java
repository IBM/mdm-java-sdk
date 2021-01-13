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
 * A single entity type definition.
 */
public class PutAlgorithmResponseEntityType extends GenericModel {

  @SerializedName("bucket_generators")
  protected Map<String, PutAlgorithmResponseBucketGenerator> bucketGenerators;
  @SerializedName("clerical_review_threshold")
  protected Float clericalReviewThreshold;
  @SerializedName("compare_methods")
  protected Map<String, PutAlgorithmResponseCompareMethod> compareMethods;
  @SerializedName("auto_link_threshold")
  protected Float autoLinkThreshold;

  /**
   * Gets the bucketGenerators.
   *
   * Collection of bucket generators.
   *
   * @return the bucketGenerators
   */
  public Map<String, PutAlgorithmResponseBucketGenerator> getBucketGenerators() {
    return bucketGenerators;
  }

  /**
   * Gets the clericalReviewThreshold.
   *
   * The minimum matching score between two records for clerical review.
   *
   * @return the clericalReviewThreshold
   */
  public Float getClericalReviewThreshold() {
    return clericalReviewThreshold;
  }

  /**
   * Gets the compareMethods.
   *
   * Collection of comparators.
   *
   * @return the compareMethods
   */
  public Map<String, PutAlgorithmResponseCompareMethod> getCompareMethods() {
    return compareMethods;
  }

  /**
   * Gets the autoLinkThreshold.
   *
   * The minimum matching score between two records to automatically link them together.
   *
   * @return the autoLinkThreshold
   */
  public Float getAutoLinkThreshold() {
    return autoLinkThreshold;
  }
}

