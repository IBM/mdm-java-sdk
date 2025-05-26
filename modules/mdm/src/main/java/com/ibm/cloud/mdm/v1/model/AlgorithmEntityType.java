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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single entity type definition.
 */
public class AlgorithmEntityType extends GenericModel {

  @SerializedName("glue_threshold")
  protected Float glueThreshold;
  @SerializedName("bucket_generators")
  protected Map<String, AlgorithmBucketGenerator> bucketGenerators;
  @SerializedName("record_filter")
  protected AlgorithmRecordFilter recordFilter;
  @SerializedName("clerical_review_threshold")
  protected Float clericalReviewThreshold;
  @SerializedName("auto_link_threshold")
  protected Float autoLinkThreshold;
  @SerializedName("source_level_thresholds")
  protected Map<String, AlgorithmSourceLevelThreshold> sourceLevelThresholds;
  @SerializedName("compare_methods")
  protected Map<String, AlgorithmCompareMethod> compareMethods;
  @SerializedName("post_filter_methods")
  protected Map<String, AlgorithmPostFilterMethod> postFilterMethods;

  /**
   * Builder.
   */
  public static class Builder {
    private Float glueThreshold;
    private Map<String, AlgorithmBucketGenerator> bucketGenerators;
    private AlgorithmRecordFilter recordFilter;
    private Float clericalReviewThreshold;
    private Float autoLinkThreshold;
    private Map<String, AlgorithmSourceLevelThreshold> sourceLevelThresholds;
    private Map<String, AlgorithmCompareMethod> compareMethods;
    private Map<String, AlgorithmPostFilterMethod> postFilterMethods;

    private Builder(AlgorithmEntityType algorithmEntityType) {
      this.glueThreshold = algorithmEntityType.glueThreshold;
      this.bucketGenerators = algorithmEntityType.bucketGenerators;
      this.recordFilter = algorithmEntityType.recordFilter;
      this.clericalReviewThreshold = algorithmEntityType.clericalReviewThreshold;
      this.autoLinkThreshold = algorithmEntityType.autoLinkThreshold;
      this.sourceLevelThresholds = algorithmEntityType.sourceLevelThresholds;
      this.compareMethods = algorithmEntityType.compareMethods;
      this.postFilterMethods = algorithmEntityType.postFilterMethods;
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
     * Set the glueThreshold.
     *
     * @param glueThreshold the glueThreshold
     * @return the AlgorithmEntityType builder
     */
    public Builder glueThreshold(Float glueThreshold) {
      this.glueThreshold = glueThreshold;
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

    /**
     * Set the recordFilter.
     *
     * @param recordFilter the recordFilter
     * @return the AlgorithmEntityType builder
     */
    public Builder recordFilter(AlgorithmRecordFilter recordFilter) {
      this.recordFilter = recordFilter;
      return this;
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
     * Set the sourceLevelThresholds.
     *
     * @param sourceLevelThresholds the sourceLevelThresholds
     * @return the AlgorithmEntityType builder
     */
    public Builder sourceLevelThresholds(Map<String, AlgorithmSourceLevelThreshold> sourceLevelThresholds) {
      this.sourceLevelThresholds = sourceLevelThresholds;
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
     * Set the postFilterMethods.
     *
     * @param postFilterMethods the postFilterMethods
     * @return the AlgorithmEntityType builder
     */
    public Builder postFilterMethods(Map<String, AlgorithmPostFilterMethod> postFilterMethods) {
      this.postFilterMethods = postFilterMethods;
      return this;
    }
  }

  protected AlgorithmEntityType() { }

  protected AlgorithmEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.autoLinkThreshold,
      "autoLinkThreshold cannot be null");
    glueThreshold = builder.glueThreshold;
    bucketGenerators = builder.bucketGenerators;
    recordFilter = builder.recordFilter;
    clericalReviewThreshold = builder.clericalReviewThreshold;
    autoLinkThreshold = builder.autoLinkThreshold;
    sourceLevelThresholds = builder.sourceLevelThresholds;
    compareMethods = builder.compareMethods;
    postFilterMethods = builder.postFilterMethods;
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
   * Gets the glueThreshold.
   *
   * The threshold to control the self score difference between records within same entity.
   *
   * @return the glueThreshold
   */
  public Float glueThreshold() {
    return glueThreshold;
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

  /**
   * Gets the recordFilter.
   *
   * A single criteria using a collection of rules for filtering out record(s).The record filter key must be lower snake
   * case (i.e. record_filter).
   *
   * @return the recordFilter
   */
  public AlgorithmRecordFilter recordFilter() {
    return recordFilter;
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
   * Gets the sourceLevelThresholds.
   *
   * Collection of source across source thresholds.
   *
   * @return the sourceLevelThresholds
   */
  public Map<String, AlgorithmSourceLevelThreshold> sourceLevelThresholds() {
    return sourceLevelThresholds;
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
   * Gets the postFilterMethods.
   *
   * Collection of post filter methods.
   *
   * @return the postFilterMethods
   */
  public Map<String, AlgorithmPostFilterMethod> postFilterMethods() {
    return postFilterMethods;
  }
}

