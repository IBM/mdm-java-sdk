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
 * The compareMatchingIndex options.
 */
public class CompareMatchingIndexOptions extends GenericModel {

  protected String entityType;
  protected List<SingleRecordRequest> records;
  protected String details;
  protected Long recordNumber1;
  protected Long recordNumber2;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private List<SingleRecordRequest> records;
    private String details;
    private Long recordNumber1;
    private Long recordNumber2;
    private String recordType;

    /**
     * Instantiates a new Builder from an existing CompareMatchingIndexOptions instance.
     *
     * @param compareMatchingIndexOptions the instance to initialize the Builder with
     */
    private Builder(CompareMatchingIndexOptions compareMatchingIndexOptions) {
      this.entityType = compareMatchingIndexOptions.entityType;
      this.records = compareMatchingIndexOptions.records;
      this.details = compareMatchingIndexOptions.details;
      this.recordNumber1 = compareMatchingIndexOptions.recordNumber1;
      this.recordNumber2 = compareMatchingIndexOptions.recordNumber2;
      this.recordType = compareMatchingIndexOptions.recordType;
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
     */
    public Builder(String entityType) {
      this.entityType = entityType;
    }

    /**
     * Builds a CompareMatchingIndexOptions.
     *
     * @return the new CompareMatchingIndexOptions instance
     */
    public CompareMatchingIndexOptions build() {
      return new CompareMatchingIndexOptions(this);
    }

    /**
     * Adds a new element to records.
     *
     * @param records the new element to be added
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder addRecords(SingleRecordRequest records) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(records,
        "records cannot be null");
      if (this.records == null) {
        this.records = new ArrayList<SingleRecordRequest>();
      }
      this.records.add(records);
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder records(List<SingleRecordRequest> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder recordNumber1(long recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder recordNumber2(long recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CompareMatchingIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected CompareMatchingIndexOptions() { }

  protected CompareMatchingIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    entityType = builder.entityType;
    records = builder.records;
    details = builder.details;
    recordNumber1 = builder.recordNumber1;
    recordNumber2 = builder.recordNumber2;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a CompareMatchingIndexOptions builder
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
   * Gets the records.
   *
   * Collection of records.
   *
   * @return the records
   */
  public List<SingleRecordRequest> records() {
    return records;
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
   * Gets the recordNumber1.
   *
   * The unique identifier of the first source record as assigned by the system.
   *
   * @return the recordNumber1
   */
  public Long recordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * The unique identifier of the second source record as assigned by the system.
   *
   * @return the recordNumber2
   */
  public Long recordNumber2() {
    return recordNumber2;
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
}

