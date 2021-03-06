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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getMatchingEntityDetail options.
 */
public class GetMatchingEntityDetailOptions extends GenericModel {

  protected String entityType;
  protected String recordType;
  protected List<String> entityNumber;
  protected Float minScore;
  protected List<String> recordNumbers;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private String recordType;
    private List<String> entityNumber;
    private Float minScore;
    private List<String> recordNumbers;

    private Builder(GetMatchingEntityDetailOptions getMatchingEntityDetailOptions) {
      this.entityType = getMatchingEntityDetailOptions.entityType;
      this.recordType = getMatchingEntityDetailOptions.recordType;
      this.entityNumber = getMatchingEntityDetailOptions.entityNumber;
      this.minScore = getMatchingEntityDetailOptions.minScore;
      this.recordNumbers = getMatchingEntityDetailOptions.recordNumbers;
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
     */
    public Builder(String entityType, String recordType) {
      this.entityType = entityType;
      this.recordType = recordType;
    }

    /**
     * Builds a GetMatchingEntityDetailOptions.
     *
     * @return the new GetMatchingEntityDetailOptions instance
     */
    public GetMatchingEntityDetailOptions build() {
      return new GetMatchingEntityDetailOptions(this);
    }

    /**
     * Adds an entityNumber to entityNumber.
     *
     * @param entityNumber the new entityNumber
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder addEntityNumber(String entityNumber) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entityNumber,
        "entityNumber cannot be null");
      if (this.entityNumber == null) {
        this.entityNumber = new ArrayList<String>();
      }
      this.entityNumber.add(entityNumber);
      return this;
    }

    /**
     * Adds an recordNumbers to recordNumbers.
     *
     * @param recordNumbers the new recordNumbers
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder addRecordNumbers(String recordNumbers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(recordNumbers,
        "recordNumbers cannot be null");
      if (this.recordNumbers == null) {
        this.recordNumbers = new ArrayList<String>();
      }
      this.recordNumbers.add(recordNumbers);
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityNumber.
     * Existing entityNumber will be replaced.
     *
     * @param entityNumber the entityNumber
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder entityNumber(List<String> entityNumber) {
      this.entityNumber = entityNumber;
      return this;
    }

    /**
     * Set the minScore.
     *
     * @param minScore the minScore
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder minScore(Float minScore) {
      this.minScore = minScore;
      return this;
    }

    /**
     * Set the recordNumbers.
     * Existing recordNumbers will be replaced.
     *
     * @param recordNumbers the recordNumbers
     * @return the GetMatchingEntityDetailOptions builder
     */
    public Builder recordNumbers(List<String> recordNumbers) {
      this.recordNumbers = recordNumbers;
      return this;
    }
  }

  protected GetMatchingEntityDetailOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    entityType = builder.entityType;
    recordType = builder.recordType;
    entityNumber = builder.entityNumber;
    minScore = builder.minScore;
    recordNumbers = builder.recordNumbers;
  }

  /**
   * New builder.
   *
   * @return a GetMatchingEntityDetailOptions builder
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
   * The data type identifier of record, ie. person, organization.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityNumber.
   *
   * Collection of entity numbers.
   *
   * @return the entityNumber
   */
  public List<String> entityNumber() {
    return entityNumber;
  }

  /**
   * Gets the minScore.
   *
   * The minimal score for matched pairs.
   *
   * @return the minScore
   */
  public Float minScore() {
    return minScore;
  }

  /**
   * Gets the recordNumbers.
   *
   * Collection of record numbers.
   *
   * @return the recordNumbers
   */
  public List<String> recordNumbers() {
    return recordNumbers;
  }
}

