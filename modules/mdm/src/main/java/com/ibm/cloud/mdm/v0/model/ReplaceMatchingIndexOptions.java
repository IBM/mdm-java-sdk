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
 * The replaceMatchingIndex options.
 */
public class ReplaceMatchingIndexOptions extends GenericModel {

  protected String recordType;
  protected SingleRecordRequestAttributes attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private SingleRecordRequestAttributes attributes;

    private Builder(ReplaceMatchingIndexOptions replaceMatchingIndexOptions) {
      this.recordType = replaceMatchingIndexOptions.recordType;
      this.attributes = replaceMatchingIndexOptions.attributes;
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
     * @param attributes the attributes
     */
    public Builder(String recordType, SingleRecordRequestAttributes attributes) {
      this.recordType = recordType;
      this.attributes = attributes;
    }

    /**
     * Builds a ReplaceMatchingIndexOptions.
     *
     * @return the new ReplaceMatchingIndexOptions instance
     */
    public ReplaceMatchingIndexOptions build() {
      return new ReplaceMatchingIndexOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ReplaceMatchingIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the ReplaceMatchingIndexOptions builder
     */
    public Builder attributes(SingleRecordRequestAttributes attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected ReplaceMatchingIndexOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    recordType = builder.recordType;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a ReplaceMatchingIndexOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

