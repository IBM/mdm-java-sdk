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
 * The indexServiceReset options.
 */
public class IndexServiceResetOptions extends GenericModel {

  protected String crn;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String recordType;

    private Builder(IndexServiceResetOptions indexServiceResetOptions) {
      this.crn = indexServiceResetOptions.crn;
      this.recordType = indexServiceResetOptions.recordType;
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
     * Builds a IndexServiceResetOptions.
     *
     * @return the new IndexServiceResetOptions instance
     */
    public IndexServiceResetOptions build() {
      return new IndexServiceResetOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the IndexServiceResetOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the IndexServiceResetOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected IndexServiceResetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a IndexServiceResetOptions builder
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
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract. If not supplied, all record types
   * will be considered.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

