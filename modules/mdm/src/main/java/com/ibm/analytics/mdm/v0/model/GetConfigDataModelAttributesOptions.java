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
 * The getConfigDataModelAttributes options.
 */
public class GetConfigDataModelAttributesOptions extends GenericModel {

  protected String recordType;
  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String crn;

    private Builder(GetConfigDataModelAttributesOptions getConfigDataModelAttributesOptions) {
      this.recordType = getConfigDataModelAttributesOptions.recordType;
      this.crn = getConfigDataModelAttributesOptions.crn;
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
     * @param crn the crn
     */
    public Builder(String recordType, String crn) {
      this.recordType = recordType;
      this.crn = crn;
    }

    /**
     * Builds a GetConfigDataModelAttributesOptions.
     *
     * @return the new GetConfigDataModelAttributesOptions instance
     */
    public GetConfigDataModelAttributesOptions build() {
      return new GetConfigDataModelAttributesOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetConfigDataModelAttributesOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GetConfigDataModelAttributesOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected GetConfigDataModelAttributesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    recordType = builder.recordType;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a GetConfigDataModelAttributesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * Unique record type to identify data model attributes.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the crn.
   *
   * The cloud resource name of the service.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

