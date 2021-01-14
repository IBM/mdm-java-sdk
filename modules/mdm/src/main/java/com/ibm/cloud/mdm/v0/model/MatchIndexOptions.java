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
 * The matchIndex options.
 */
public class MatchIndexOptions extends GenericModel {

  protected String recordType;
  protected SingleRecordRequestAttributes attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private SingleRecordRequestAttributes attributes;

    private Builder(MatchIndexOptions matchIndexOptions) {
      this.recordType = matchIndexOptions.recordType;
      this.attributes = matchIndexOptions.attributes;
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
     * Builds a MatchIndexOptions.
     *
     * @return the new MatchIndexOptions instance
     */
    public MatchIndexOptions build() {
      return new MatchIndexOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the MatchIndexOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the MatchIndexOptions builder
     */
    public Builder attributes(SingleRecordRequestAttributes attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected MatchIndexOptions(Builder builder) {
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
   * @return a MatchIndexOptions builder
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

