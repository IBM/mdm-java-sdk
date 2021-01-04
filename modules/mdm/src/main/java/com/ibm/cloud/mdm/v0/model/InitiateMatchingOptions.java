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
 * The initiateMatching options.
 */
public class InitiateMatchingOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private String crn;

    private Builder(InitiateMatchingOptions initiateMatchingOptions) {
      this.recordType = initiateMatchingOptions.recordType;
      this.entityType = initiateMatchingOptions.entityType;
      this.crn = initiateMatchingOptions.crn;
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
     * @param entityType the entityType
     * @param crn the crn
     */
    public Builder(String recordType, String entityType, String crn) {
      this.recordType = recordType;
      this.entityType = entityType;
      this.crn = crn;
    }

    /**
     * Builds a InitiateMatchingOptions.
     *
     * @return the new InitiateMatchingOptions instance
     */
    public InitiateMatchingOptions build() {
      return new InitiateMatchingOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the InitiateMatchingOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the InitiateMatchingOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the InitiateMatchingOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected InitiateMatchingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    recordType = builder.recordType;
    entityType = builder.entityType;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a InitiateMatchingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * Record type for matching.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * Entity type for matching.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
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

