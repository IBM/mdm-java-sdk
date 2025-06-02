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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDataRecordParams options.
 */
public class GetDataRecordParamsOptions extends GenericModel {

  protected String recordType;
  protected String recordSource;
  protected String recordId;
  protected String collectionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String recordSource;
    private String recordId;
    private String collectionId;

    /**
     * Instantiates a new Builder from an existing GetDataRecordParamsOptions instance.
     *
     * @param getDataRecordParamsOptions the instance to initialize the Builder with
     */
    private Builder(GetDataRecordParamsOptions getDataRecordParamsOptions) {
      this.recordType = getDataRecordParamsOptions.recordType;
      this.recordSource = getDataRecordParamsOptions.recordSource;
      this.recordId = getDataRecordParamsOptions.recordId;
      this.collectionId = getDataRecordParamsOptions.collectionId;
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
     * @param recordSource the recordSource
     * @param recordId the recordId
     */
    public Builder(String recordType, String recordSource, String recordId) {
      this.recordType = recordType;
      this.recordSource = recordSource;
      this.recordId = recordId;
    }

    /**
     * Builds a GetDataRecordParamsOptions.
     *
     * @return the new GetDataRecordParamsOptions instance
     */
    public GetDataRecordParamsOptions build() {
      return new GetDataRecordParamsOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetDataRecordParamsOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the GetDataRecordParamsOptions builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the GetDataRecordParamsOptions builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the collectionId.
     *
     * @param collectionId the collectionId
     * @return the GetDataRecordParamsOptions builder
     */
    public Builder collectionId(String collectionId) {
      this.collectionId = collectionId;
      return this;
    }
  }

  protected GetDataRecordParamsOptions() { }

  protected GetDataRecordParamsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordSource,
      "recordSource cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordId,
      "recordId cannot be null");
    recordType = builder.recordType;
    recordSource = builder.recordSource;
    recordId = builder.recordId;
    collectionId = builder.collectionId;
  }

  /**
   * New builder.
   *
   * @return a GetDataRecordParamsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * The type of the record.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the recordSource.
   *
   * source of record.
   *
   * @return the recordSource
   */
  public String recordSource() {
    return recordSource;
  }

  /**
   * Gets the recordId.
   *
   * Id of record.
   *
   * @return the recordId
   */
  public String recordId() {
    return recordId;
  }

  /**
   * Gets the collectionId.
   *
   * Collection Id of record.
   *
   * @return the collectionId
   */
  public String collectionId() {
    return collectionId;
  }
}

