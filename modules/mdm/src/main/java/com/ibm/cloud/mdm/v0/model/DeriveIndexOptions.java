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
 * The deriveIndex options.
 */
public class DeriveIndexOptions extends GenericModel {

  protected String crn;
  protected List<DeriveRecordsRequestRecord> records;
  protected String details;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private List<DeriveRecordsRequestRecord> records;
    private String details;

    private Builder(DeriveIndexOptions deriveIndexOptions) {
      this.crn = deriveIndexOptions.crn;
      this.records = deriveIndexOptions.records;
      this.details = deriveIndexOptions.details;
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
     * @param records the records
     */
    public Builder(String crn, List<DeriveRecordsRequestRecord> records) {
      this.crn = crn;
      this.records = records;
    }

    /**
     * Builds a DeriveIndexOptions.
     *
     * @return the new DeriveIndexOptions instance
     */
    public DeriveIndexOptions build() {
      return new DeriveIndexOptions(this);
    }

    /**
     * Adds an records to records.
     *
     * @param records the new records
     * @return the DeriveIndexOptions builder
     */
    public Builder addRecords(DeriveRecordsRequestRecord records) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(records,
        "records cannot be null");
      if (this.records == null) {
        this.records = new ArrayList<DeriveRecordsRequestRecord>();
      }
      this.records.add(records);
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the DeriveIndexOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the DeriveIndexOptions builder
     */
    public Builder records(List<DeriveRecordsRequestRecord> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the DeriveIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }
  }

  protected DeriveIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.records,
      "records cannot be null");
    crn = builder.crn;
    records = builder.records;
    details = builder.details;
  }

  /**
   * New builder.
   *
   * @return a DeriveIndexOptions builder
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
   * Gets the records.
   *
   * Collection of records.
   *
   * @return the records
   */
  public List<DeriveRecordsRequestRecord> records() {
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
}

