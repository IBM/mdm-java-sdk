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
 * The compareIndex options.
 */
public class CompareIndexOptions extends GenericModel {

  protected List<CompareRecordsRequestRecord> records;
  protected String details;
  protected String entityType;
  protected Long recordNumber1;
  protected Long recordNumber2;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private List<CompareRecordsRequestRecord> records;
    private String details;
    private String entityType;
    private Long recordNumber1;
    private Long recordNumber2;
    private String recordType;

    private Builder(CompareIndexOptions compareIndexOptions) {
      this.records = compareIndexOptions.records;
      this.details = compareIndexOptions.details;
      this.entityType = compareIndexOptions.entityType;
      this.recordNumber1 = compareIndexOptions.recordNumber1;
      this.recordNumber2 = compareIndexOptions.recordNumber2;
      this.recordType = compareIndexOptions.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompareIndexOptions.
     *
     * @return the new CompareIndexOptions instance
     */
    public CompareIndexOptions build() {
      return new CompareIndexOptions(this);
    }

    /**
     * Adds an records to records.
     *
     * @param records the new records
     * @return the CompareIndexOptions builder
     */
    public Builder addRecords(CompareRecordsRequestRecord records) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(records,
        "records cannot be null");
      if (this.records == null) {
        this.records = new ArrayList<CompareRecordsRequestRecord>();
      }
      this.records.add(records);
      return this;
    }

    /**
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the CompareIndexOptions builder
     */
    public Builder records(List<CompareRecordsRequestRecord> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the CompareIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CompareIndexOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the CompareIndexOptions builder
     */
    public Builder recordNumber1(long recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the CompareIndexOptions builder
     */
    public Builder recordNumber2(long recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CompareIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected CompareIndexOptions(Builder builder) {
    records = builder.records;
    details = builder.details;
    entityType = builder.entityType;
    recordNumber1 = builder.recordNumber1;
    recordNumber2 = builder.recordNumber2;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a CompareIndexOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the records.
   *
   * Collection of records.
   *
   * @return the records
   */
  public List<CompareRecordsRequestRecord> records() {
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

