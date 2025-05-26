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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The batchCompareMatchingIndex options.
 */
public class BatchCompareMatchingIndexOptions extends GenericModel {

  protected String entityType;
  protected String recordType;
  protected List<BatchComparePairsRequestPair> pairs;
  protected String details;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private String recordType;
    private List<BatchComparePairsRequestPair> pairs;
    private String details;

    private Builder(BatchCompareMatchingIndexOptions batchCompareMatchingIndexOptions) {
      this.entityType = batchCompareMatchingIndexOptions.entityType;
      this.recordType = batchCompareMatchingIndexOptions.recordType;
      this.pairs = batchCompareMatchingIndexOptions.pairs;
      this.details = batchCompareMatchingIndexOptions.details;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityType the entityType
     * @param recordType the recordType
     * @param pairs the pairs
     */
    public Builder(String entityType, String recordType, List<BatchComparePairsRequestPair> pairs) {
      this.entityType = entityType;
      this.recordType = recordType;
      this.pairs = pairs;
    }

    /**
     * Builds a BatchCompareMatchingIndexOptions.
     *
     * @return the new BatchCompareMatchingIndexOptions instance
     */
    public BatchCompareMatchingIndexOptions build() {
      return new BatchCompareMatchingIndexOptions(this);
    }

    /**
     * Adds an pairs to pairs.
     *
     * @param pairs the new pairs
     * @return the BatchCompareMatchingIndexOptions builder
     */
    public Builder addPairs(BatchComparePairsRequestPair pairs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(pairs,
        "pairs cannot be null");
      if (this.pairs == null) {
        this.pairs = new ArrayList<BatchComparePairsRequestPair>();
      }
      this.pairs.add(pairs);
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the BatchCompareMatchingIndexOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the BatchCompareMatchingIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the pairs.
     * Existing pairs will be replaced.
     *
     * @param pairs the pairs
     * @return the BatchCompareMatchingIndexOptions builder
     */
    public Builder pairs(List<BatchComparePairsRequestPair> pairs) {
      this.pairs = pairs;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the BatchCompareMatchingIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }
  }

  protected BatchCompareMatchingIndexOptions() { }

  protected BatchCompareMatchingIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pairs,
      "pairs cannot be null");
    entityType = builder.entityType;
    recordType = builder.recordType;
    pairs = builder.pairs;
    details = builder.details;
  }

  /**
   * New builder.
   *
   * @return a BatchCompareMatchingIndexOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the pairs.
   *
   * Collection of pairs of record numbers.
   *
   * @return the pairs
   */
  public List<BatchComparePairsRequestPair> pairs() {
    return pairs;
  }

  /**
   * Gets the details.
   *
   * The level of information detail in response, ie. low, high, debug.
   *
   * @return the details
   */
  public String details() {
    return details;
  }
}

