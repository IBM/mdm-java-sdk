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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper Object for a single record.
 */
public class SingleRecordRequest extends GenericModel {

  protected SingleRecordRequestAttributes attributes;
  protected Long id;
  @SerializedName("record_type")
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private SingleRecordRequestAttributes attributes;
    private Long id;
    private String recordType;

    /**
     * Instantiates a new Builder from an existing SingleRecordRequest instance.
     *
     * @param singleRecordRequest the instance to initialize the Builder with
     */
    private Builder(SingleRecordRequest singleRecordRequest) {
      this.attributes = singleRecordRequest.attributes;
      this.id = singleRecordRequest.id;
      this.recordType = singleRecordRequest.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributes the attributes
     * @param recordType the recordType
     */
    public Builder(SingleRecordRequestAttributes attributes, String recordType) {
      this.attributes = attributes;
      this.recordType = recordType;
    }

    /**
     * Builds a SingleRecordRequest.
     *
     * @return the new SingleRecordRequest instance
     */
    public SingleRecordRequest build() {
      return new SingleRecordRequest(this);
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the SingleRecordRequest builder
     */
    public Builder attributes(SingleRecordRequestAttributes attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SingleRecordRequest builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the SingleRecordRequest builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected SingleRecordRequest() { }

  protected SingleRecordRequest(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    attributes = builder.attributes;
    id = builder.id;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a SingleRecordRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the id.
   *
   * Optional record number.
   *
   * @return the id
   */
  public Long id() {
    return id;
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
}

