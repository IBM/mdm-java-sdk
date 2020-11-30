/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The searchIndex options.
 */
public class SearchIndexOptions extends GenericModel {

  protected String crn;
  protected String recordType;
  protected CompareRecordsRequestRecordAttributes attributes;
  protected String details;
  protected String minScore;
  protected String maxScore;
  protected String offset;
  protected String entityType;
  protected String limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String recordType;
    private CompareRecordsRequestRecordAttributes attributes;
    private String details;
    private String minScore;
    private String maxScore;
    private String offset;
    private String entityType;
    private String limit;

    private Builder(SearchIndexOptions searchIndexOptions) {
      this.crn = searchIndexOptions.crn;
      this.recordType = searchIndexOptions.recordType;
      this.attributes = searchIndexOptions.attributes;
      this.details = searchIndexOptions.details;
      this.minScore = searchIndexOptions.minScore;
      this.maxScore = searchIndexOptions.maxScore;
      this.offset = searchIndexOptions.offset;
      this.entityType = searchIndexOptions.entityType;
      this.limit = searchIndexOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param recordType the recordType
     */
    public Builder(String crn, String recordType) {
      this.crn = crn;
      this.recordType = recordType;
    }

    /**
     * Builds a SearchIndexOptions.
     *
     * @return the new SearchIndexOptions instance
     */
    public SearchIndexOptions build() {
      return new SearchIndexOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the SearchIndexOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the SearchIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the SearchIndexOptions builder
     */
    public Builder attributes(CompareRecordsRequestRecordAttributes attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the SearchIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }

    /**
     * Set the minScore.
     *
     * @param minScore the minScore
     * @return the SearchIndexOptions builder
     */
    public Builder minScore(String minScore) {
      this.minScore = minScore;
      return this;
    }

    /**
     * Set the maxScore.
     *
     * @param maxScore the maxScore
     * @return the SearchIndexOptions builder
     */
    public Builder maxScore(String maxScore) {
      this.maxScore = maxScore;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the SearchIndexOptions builder
     */
    public Builder offset(String offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the SearchIndexOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the SearchIndexOptions builder
     */
    public Builder limit(String limit) {
      this.limit = limit;
      return this;
    }
  }

  protected SearchIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    crn = builder.crn;
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
   * @return a SearchIndexOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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
   * Details of a single record.
   *
   * @return the attributes
   */
  public CompareRecordsRequestRecordAttributes attributes() {
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
  public String minScore() {
    return minScore;
  }

  /**
   * Gets the maxScore.
   *
   * The maximum score to filter the matching records in the results. The default max_score is 32767.
   *
   * @return the maxScore
   */
  public String maxScore() {
    return maxScore;
  }

  /**
   * Gets the offset.
   *
   * The number of entries to skip before returning a page of results. The default offset is 0.
   *
   * @return the offset
   */
  public String offset() {
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
  public String limit() {
    return limit;
  }
}

