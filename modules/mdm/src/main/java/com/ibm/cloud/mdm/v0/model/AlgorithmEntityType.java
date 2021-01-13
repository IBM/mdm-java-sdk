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
public class AlgorithmEntityType extends GenericModel {

  @SerializedName("clerical_review_threshold")
  protected Float clericalReviewThreshold;
  @SerializedName("auto_link_threshold")
  protected Float autoLinkThreshold;
  @SerializedName("compare_methods")
  protected Map<String, AlgorithmCompareMethod> compareMethods;
  @SerializedName("bucket_generators")
  protected Map<String, AlgorithmBucketGenerator> bucketGenerators;

  /**
   * Builder.
   */
  public static class Builder {
    private Float clericalReviewThreshold;
    private Float autoLinkThreshold;
    private Map<String, AlgorithmCompareMethod> compareMethods;
    private Map<String, AlgorithmBucketGenerator> bucketGenerators;

    private Builder(AlgorithmEntityType algorithmEntityType) {
      this.clericalReviewThreshold = algorithmEntityType.clericalReviewThreshold;
      this.autoLinkThreshold = algorithmEntityType.autoLinkThreshold;
      this.compareMethods = algorithmEntityType.compareMethods;
      this.bucketGenerators = algorithmEntityType.bucketGenerators;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param autoLinkThreshold the autoLinkThreshold
     */
    public Builder(Float autoLinkThreshold) {
      this.autoLinkThreshold = autoLinkThreshold;
    }

    /**
     * Builds a AlgorithmEntityType.
     *
     * @return the new AlgorithmEntityType instance
     */
    public AlgorithmEntityType build() {
      return new AlgorithmEntityType(this);
    }

    /**
     * Set the clericalReviewThreshold.
     *
     * @param clericalReviewThreshold the clericalReviewThreshold
     * @return the AlgorithmEntityType builder
     */
    public Builder clericalReviewThreshold(Float clericalReviewThreshold) {
      this.clericalReviewThreshold = clericalReviewThreshold;
      return this;
    }

    /**
     * Set the autoLinkThreshold.
     *
     * @param autoLinkThreshold the autoLinkThreshold
     * @return the AlgorithmEntityType builder
     */
    public Builder autoLinkThreshold(Float autoLinkThreshold) {
      this.autoLinkThreshold = autoLinkThreshold;
      return this;
    }

    /**
     * Set the compareMethods.
     *
     * @param compareMethods the compareMethods
     * @return the AlgorithmEntityType builder
     */
    public Builder compareMethods(Map<String, AlgorithmCompareMethod> compareMethods) {
      this.compareMethods = compareMethods;
      return this;
    }

    /**
     * Set the bucketGenerators.
     *
     * @param bucketGenerators the bucketGenerators
     * @return the AlgorithmEntityType builder
     */
    public Builder bucketGenerators(Map<String, AlgorithmBucketGenerator> bucketGenerators) {
      this.bucketGenerators = bucketGenerators;
      return this;
    }
  }

  protected AlgorithmEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.autoLinkThreshold,
      "autoLinkThreshold cannot be null");
    clericalReviewThreshold = builder.clericalReviewThreshold;
    autoLinkThreshold = builder.autoLinkThreshold;
    compareMethods = builder.compareMethods;
    bucketGenerators = builder.bucketGenerators;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmEntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clericalReviewThreshold.
   *
   * The minimum matching score between two records for clerical review.
   *
   * @return the clericalReviewThreshold
   */
  public Float clericalReviewThreshold() {
    return clericalReviewThreshold;
  }

  /**
   * Gets the autoLinkThreshold.
   *
   * The minimum matching score between two records to automatically link them together.
   *
   * @return the autoLinkThreshold
   */
  public Float autoLinkThreshold() {
    return autoLinkThreshold;
  }

  /**
   * Gets the compareMethods.
   *
   * Collection of comparators.
   *
   * @return the compareMethods
   */
  public Map<String, AlgorithmCompareMethod> compareMethods() {
    return compareMethods;
  }

  /**
   * Gets the bucketGenerators.
   *
   * Collection of bucket generators.
   *
   * @return the bucketGenerators
   */
  public Map<String, AlgorithmBucketGenerator> bucketGenerators() {
    return bucketGenerators;
  }
}

