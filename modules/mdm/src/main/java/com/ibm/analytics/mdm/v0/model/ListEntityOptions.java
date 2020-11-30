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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listEntity options.
 */
public class ListEntityOptions extends GenericModel {

  protected String crn;
  protected Long recordNumber;
  protected String recordSource;
  protected String recordId;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private Long recordNumber;
    private String recordSource;
    private String recordId;
    private String recordType;

    private Builder(ListEntityOptions listEntityOptions) {
      this.crn = listEntityOptions.crn;
      this.recordNumber = listEntityOptions.recordNumber;
      this.recordSource = listEntityOptions.recordSource;
      this.recordId = listEntityOptions.recordId;
      this.recordType = listEntityOptions.recordType;
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
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a ListEntityOptions.
     *
     * @return the new ListEntityOptions instance
     */
    public ListEntityOptions build() {
      return new ListEntityOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ListEntityOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the ListEntityOptions builder
     */
    public Builder recordNumber(long recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the ListEntityOptions builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the ListEntityOptions builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ListEntityOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected ListEntityOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
    recordNumber = builder.recordNumber;
    recordSource = builder.recordSource;
    recordId = builder.recordId;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a ListEntityOptions builder
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
   * The record identifier of the record.
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

