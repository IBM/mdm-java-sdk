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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteMatchingIndex options.
 */
public class DeleteMatchingIndexOptions extends GenericModel {

  protected Long recordNumber;
  protected String recordSource;
  protected String recordId;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long recordNumber;
    private String recordSource;
    private String recordId;
    private String recordType;

    private Builder(DeleteMatchingIndexOptions deleteMatchingIndexOptions) {
      this.recordNumber = deleteMatchingIndexOptions.recordNumber;
      this.recordSource = deleteMatchingIndexOptions.recordSource;
      this.recordId = deleteMatchingIndexOptions.recordId;
      this.recordType = deleteMatchingIndexOptions.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteMatchingIndexOptions.
     *
     * @return the new DeleteMatchingIndexOptions instance
     */
    public DeleteMatchingIndexOptions build() {
      return new DeleteMatchingIndexOptions(this);
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the DeleteMatchingIndexOptions builder
     */
    public Builder recordNumber(long recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the DeleteMatchingIndexOptions builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the DeleteMatchingIndexOptions builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the DeleteMatchingIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected DeleteMatchingIndexOptions(Builder builder) {
    recordNumber = builder.recordNumber;
    recordSource = builder.recordSource;
    recordId = builder.recordId;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a DeleteMatchingIndexOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of a source record as assigned by the system.
   *
   * @return the recordNumber
   */
  public Long recordNumber() {
    return recordNumber;
  }

  /**
   * Gets the recordSource.
   *
   * The source system name of the record.
   *
   * @return the recordSource
   */
  public String recordSource() {
    return recordSource;
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
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

