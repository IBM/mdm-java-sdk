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
package com.ibm.cloud.mdm.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The generateModelAlgorithm options.
 */
public class GenerateModelAlgorithmOptions extends GenericModel {

  protected String recordType;
  protected Map<String, AlgorithmGenerationEntityType> requestBody;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private Map<String, AlgorithmGenerationEntityType> requestBody;

    private Builder(GenerateModelAlgorithmOptions generateModelAlgorithmOptions) {
      this.recordType = generateModelAlgorithmOptions.recordType;
      this.requestBody = generateModelAlgorithmOptions.requestBody;
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
     * @param requestBody the requestBody
     */
    public Builder(String recordType, Map<String, AlgorithmGenerationEntityType> requestBody) {
      this.recordType = recordType;
      this.requestBody = requestBody;
    }

    /**
     * Builds a GenerateModelAlgorithmOptions.
     *
     * @return the new GenerateModelAlgorithmOptions instance
     */
    public GenerateModelAlgorithmOptions build() {
      return new GenerateModelAlgorithmOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GenerateModelAlgorithmOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the requestBody.
     *
     * @param requestBody the requestBody
     * @return the GenerateModelAlgorithmOptions builder
     */
    public Builder requestBody(Map<String, AlgorithmGenerationEntityType> requestBody) {
      this.requestBody = requestBody;
      return this;
    }
  }

  protected GenerateModelAlgorithmOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordType,
      "recordType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.requestBody,
      "requestBody cannot be null");
    recordType = builder.recordType;
    requestBody = builder.requestBody;
  }

  /**
   * New builder.
   *
   * @return a GenerateModelAlgorithmOptions builder
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
   * Gets the requestBody.
   *
   * The matching algorithm for a given record type (i.e. person).
   *
   * @return the requestBody
   */
  public Map<String, AlgorithmGenerationEntityType> requestBody() {
    return requestBody;
  }
}

