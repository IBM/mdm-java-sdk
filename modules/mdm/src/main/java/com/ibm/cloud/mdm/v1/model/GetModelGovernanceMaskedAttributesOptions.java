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
 * The getModelGovernanceMaskedAttributes options.
 */
public class GetModelGovernanceMaskedAttributesOptions extends GenericModel {

  protected String dataType;
  protected String dataValue;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataType;
    private String dataValue;

    /**
     * Instantiates a new Builder from an existing GetModelGovernanceMaskedAttributesOptions instance.
     *
     * @param getModelGovernanceMaskedAttributesOptions the instance to initialize the Builder with
     */
    private Builder(GetModelGovernanceMaskedAttributesOptions getModelGovernanceMaskedAttributesOptions) {
      this.dataType = getModelGovernanceMaskedAttributesOptions.dataType;
      this.dataValue = getModelGovernanceMaskedAttributesOptions.dataValue;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataType the dataType
     * @param dataValue the dataValue
     */
    public Builder(String dataType, String dataValue) {
      this.dataType = dataType;
      this.dataValue = dataValue;
    }

    /**
     * Builds a GetModelGovernanceMaskedAttributesOptions.
     *
     * @return the new GetModelGovernanceMaskedAttributesOptions instance
     */
    public GetModelGovernanceMaskedAttributesOptions build() {
      return new GetModelGovernanceMaskedAttributesOptions(this);
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the GetModelGovernanceMaskedAttributesOptions builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the dataValue.
     *
     * @param dataValue the dataValue
     * @return the GetModelGovernanceMaskedAttributesOptions builder
     */
    public Builder dataValue(String dataValue) {
      this.dataValue = dataValue;
      return this;
    }
  }

  protected GetModelGovernanceMaskedAttributesOptions() { }

  protected GetModelGovernanceMaskedAttributesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataValue,
      "dataValue cannot be null");
    dataType = builder.dataType;
    dataValue = builder.dataValue;
  }

  /**
   * New builder.
   *
   * @return a GetModelGovernanceMaskedAttributesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataType.
   *
   * The type identifier for record_types or entity_types.
   *
   * @return the dataType
   */
  public String dataType() {
    return dataType;
  }

  /**
   * Gets the dataValue.
   *
   * The data type identifier of source records, ie. person, organization, contract or entity, ie. person_entity,
   * organization_entity, household_entity.
   *
   * @return the dataValue
   */
  public String dataValue() {
    return dataValue;
  }
}

