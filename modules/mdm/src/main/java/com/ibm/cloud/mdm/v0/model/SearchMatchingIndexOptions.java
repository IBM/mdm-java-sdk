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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The searchMatchingIndex options.
 */
public class SearchMatchingIndexOptions extends GenericModel {

  protected String recordType;
  protected SingleRecordRequestAttributes attributes;
  protected String details;
  protected Long minScore;
  protected Long maxScore;
  protected Long offset;
  protected String entityType;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private SingleRecordRequestAttributes attributes;
    private String details;
    private Long minScore;
    private Long maxScore;
    private Long offset;
    private String entityType;
    private Long limit;

    private Builder(SearchMatchingIndexOptions searchMatchingIndexOptions) {
      this.recordType = searchMatchingIndexOptions.recordType;
      this.attributes = searchMatchingIndexOptions.attributes;
      this.details = searchMatchingIndexOptions.details;
      this.minScore = searchMatchingIndexOptions.minScore;
      this.maxScore = searchMatchingIndexOptions.maxScore;
      this.offset = searchMatchingIndexOptions.offset;
      this.entityType = searchMatchingIndexOptions.entityType;
      this.limit = searchMatchingIndexOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SearchMatchingIndexOptions.
     *
     * @return the new SearchMatchingIndexOptions instance
     */
    public SearchMatchingIndexOptions build() {
      return new SearchMatchingIndexOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder attributes(SingleRecordRequestAttributes attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }

    /**
     * Set the minScore.
     *
     * @param minScore the minScore
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder minScore(long minScore) {
      this.minScore = minScore;
      return this;
    }

    /**
     * Set the maxScore.
     *
     * @param maxScore the maxScore
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder maxScore(long maxScore) {
      this.maxScore = maxScore;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the SearchMatchingIndexOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected SearchMatchingIndexOptions(Builder builder) {
    recordType = builder.recordType;
    attributes = builder.attributes;
    details = builder.details;
    minScore = builder.minScore;
    maxScore = builder.maxScore;
    offset = builder.offset;
    entityType = builder.entityType;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a SearchMatchingIndexOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of the record, ie. person, organization.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the attributes.
   *
   * Details of a single record including external record reference and record attributes.
   *
   * @return the attributes
   */
  public SingleRecordRequestAttributes attributes() {
    return attributes;
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

  /**
   * Gets the minScore.
   *
   * The minimum score to filter the matching records in the results. The default min_score is 0.
   *
   * @return the minScore
   */
  public Long minScore() {
    return minScore;
  }

  /**
   * Gets the maxScore.
   *
   * The maximum score to filter the matching records in the results. The default max_score is 32767.
   *
   * @return the maxScore
   */
  public Long maxScore() {
    return maxScore;
  }

  /**
   * Gets the offset.
   *
   * The number of entries to skip before returning a page of results. The default offset is 0.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
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
   * Gets the limit.
   *
   * The maximum expected number of entries in each page of results. The default limit is 20.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

