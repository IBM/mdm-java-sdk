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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single record.
 */
public class DeriveRecordsRequestRecord extends GenericModel {

  @SerializedName("record_type")
  protected String recordType;
  protected DeriveRecordsRequestAttributes attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private DeriveRecordsRequestAttributes attributes;

    private Builder(DeriveRecordsRequestRecord deriveRecordsRequestRecord) {
      this.recordType = deriveRecordsRequestRecord.recordType;
      this.attributes = deriveRecordsRequestRecord.attributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordType the recordType
     */
    public Builder(String recordType) {
      this.recordType = recordType;
    }

    /**
     * Builds a DeriveRecordsRequestRecord.
     *
     * @return the new DeriveRecordsRequestRecord instance
     */
    public DeriveRecordsRequestRecord build() {
      return new DeriveRecordsRequestRecord(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the DeriveRecordsRequestRecord builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DeriveRecordsRequestRecord builder
     */
    public Builder attributes(DeriveRecordsRequestAttributes attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected DeriveRecordsRequestRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    recordType = builder.recordType;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a DeriveRecordsRequestRecord builder
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
  public DeriveRecordsRequestAttributes attributes() {
    return attributes;
  }
}

