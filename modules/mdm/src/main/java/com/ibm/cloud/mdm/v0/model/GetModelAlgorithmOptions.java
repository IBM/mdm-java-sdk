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
 * The getModelAlgorithm options.
 */
public class GetModelAlgorithmOptions extends GenericModel {

  protected String recordType;
  protected Boolean template;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private Boolean template;

    private Builder(GetModelAlgorithmOptions getModelAlgorithmOptions) {
      this.recordType = getModelAlgorithmOptions.recordType;
      this.template = getModelAlgorithmOptions.template;
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
     * Builds a GetModelAlgorithmOptions.
     *
     * @return the new GetModelAlgorithmOptions instance
     */
    public GetModelAlgorithmOptions build() {
      return new GetModelAlgorithmOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetModelAlgorithmOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the template.
     *
     * @param template the template
     * @return the GetModelAlgorithmOptions builder
     */
    public Builder template(Boolean template) {
      this.template = template;
      return this;
    }
  }

  protected GetModelAlgorithmOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordType,
      "recordType cannot be empty");
    recordType = builder.recordType;
    template = builder.template;
  }

  /**
   * New builder.
   *
   * @return a GetModelAlgorithmOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the template.
   *
   * response will return the default template algorithm when set to true.
   *
   * @return the template
   */
  public Boolean template() {
    return template;
  }
}

