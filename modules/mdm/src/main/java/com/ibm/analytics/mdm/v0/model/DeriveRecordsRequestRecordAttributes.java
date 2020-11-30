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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a single record.
 */
public class DeriveRecordsRequestRecordAttributes extends GenericModel {

  @SerializedName("record_last_updated")
  protected String recordLastUpdated;
  @SerializedName("record_id")
  protected String recordId;
  @SerializedName("record_source")
  protected String recordSource;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordLastUpdated;
    private String recordId;
    private String recordSource;

    private Builder(DeriveRecordsRequestRecordAttributes deriveRecordsRequestRecordAttributes) {
      this.recordLastUpdated = deriveRecordsRequestRecordAttributes.recordLastUpdated;
      this.recordId = deriveRecordsRequestRecordAttributes.recordId;
      this.recordSource = deriveRecordsRequestRecordAttributes.recordSource;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeriveRecordsRequestRecordAttributes.
     *
     * @return the new DeriveRecordsRequestRecordAttributes instance
     */
    public DeriveRecordsRequestRecordAttributes build() {
      return new DeriveRecordsRequestRecordAttributes(this);
    }

    /**
     * Set the recordLastUpdated.
     *
     * @param recordLastUpdated the recordLastUpdated
     * @return the DeriveRecordsRequestRecordAttributes builder
     */
    public Builder recordLastUpdated(String recordLastUpdated) {
      this.recordLastUpdated = recordLastUpdated;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the DeriveRecordsRequestRecordAttributes builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the DeriveRecordsRequestRecordAttributes builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }
  }

  protected DeriveRecordsRequestRecordAttributes(Builder builder) {
    recordLastUpdated = builder.recordLastUpdated;
    recordId = builder.recordId;
    recordSource = builder.recordSource;
  }

  /**
   * New builder.
   *
   * @return a DeriveRecordsRequestRecordAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordLastUpdated.
   *
   * System generated timestamp when the record was last updated.
   *
   * @return the recordLastUpdated
   */
  public String recordLastUpdated() {
    return recordLastUpdated;
  }

  /**
   * Gets the recordId.
   *
   * The identifier of the record.
   *
   * @return the recordId
   */
  public String recordId() {
    return recordId;
  }

  /**
   * Gets the recordSource.
   *
   * The source system name of a record.
   *
   * @return the recordSource
   */
  public String recordSource() {
    return recordSource;
  }
}

