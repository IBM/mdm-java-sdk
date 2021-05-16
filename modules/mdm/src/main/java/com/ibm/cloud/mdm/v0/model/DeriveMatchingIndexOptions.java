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
 * The deriveMatchingIndex options.
 */
public class DeriveMatchingIndexOptions extends GenericModel {

  protected List<SingleRecordRequest> records;
  protected String details;

  /**
   * Builder.
   */
  public static class Builder {
    private List<SingleRecordRequest> records;
    private String details;

    private Builder(DeriveMatchingIndexOptions deriveMatchingIndexOptions) {
      this.records = deriveMatchingIndexOptions.records;
      this.details = deriveMatchingIndexOptions.details;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param records the records
     */
    public Builder(List<SingleRecordRequest> records) {
      this.records = records;
    }

    /**
     * Builds a DeriveMatchingIndexOptions.
     *
     * @return the new DeriveMatchingIndexOptions instance
     */
    public DeriveMatchingIndexOptions build() {
      return new DeriveMatchingIndexOptions(this);
    }

    /**
     * Adds an records to records.
     *
     * @param records the new records
     * @return the DeriveMatchingIndexOptions builder
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
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the DeriveMatchingIndexOptions builder
     */
    public Builder records(List<SingleRecordRequest> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the DeriveMatchingIndexOptions builder
     */
    public Builder details(String details) {
      this.details = details;
      return this;
    }
  }

  protected DeriveMatchingIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.records,
      "records cannot be null");
    records = builder.records;
    details = builder.details;
  }

  /**
   * New builder.
   *
   * @return a DeriveMatchingIndexOptions builder
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
}

