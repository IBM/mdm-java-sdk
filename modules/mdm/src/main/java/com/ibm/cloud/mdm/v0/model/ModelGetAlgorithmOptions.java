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
 * The modelGetAlgorithm options.
 */
public class ModelGetAlgorithmOptions extends GenericModel {

  protected String crn;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String recordType;

    private Builder(ModelGetAlgorithmOptions modelGetAlgorithmOptions) {
      this.crn = modelGetAlgorithmOptions.crn;
      this.recordType = modelGetAlgorithmOptions.recordType;
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
     * @param recordType the recordType
     */
    public Builder(String crn, String recordType) {
      this.crn = crn;
      this.recordType = recordType;
    }

    /**
     * Builds a ModelGetAlgorithmOptions.
     *
     * @return the new ModelGetAlgorithmOptions instance
     */
    public ModelGetAlgorithmOptions build() {
      return new ModelGetAlgorithmOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelGetAlgorithmOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ModelGetAlgorithmOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected ModelGetAlgorithmOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordType,
      "recordType cannot be empty");
    crn = builder.crn;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a ModelGetAlgorithmOptions builder
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
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

