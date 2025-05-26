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
 * The checkMatchingRulesExist options.
 */
public class CheckMatchingRulesExistOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Boolean invalid;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Boolean invalid;

    private Builder(CheckMatchingRulesExistOptions checkMatchingRulesExistOptions) {
      this.recordType = checkMatchingRulesExistOptions.recordType;
      this.entityType = checkMatchingRulesExistOptions.entityType;
      this.invalid = checkMatchingRulesExistOptions.invalid;
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
     * Builds a CheckMatchingRulesExistOptions.
     *
     * @return the new CheckMatchingRulesExistOptions instance
     */
    public CheckMatchingRulesExistOptions build() {
      return new CheckMatchingRulesExistOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CheckMatchingRulesExistOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CheckMatchingRulesExistOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the invalid.
     *
     * @param invalid the invalid
     * @return the CheckMatchingRulesExistOptions builder
     */
    public Builder invalid(Boolean invalid) {
      this.invalid = invalid;
      return this;
    }
  }

  protected CheckMatchingRulesExistOptions() { }

  protected CheckMatchingRulesExistOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    recordType = builder.recordType;
    entityType = builder.entityType;
    invalid = builder.invalid;
  }

  /**
   * New builder.
   *
   * @return a CheckMatchingRulesExistOptions builder
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
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the invalid.
   *
   * To check if invalid manual linkage rules exist, default is false.
   *
   * @return the invalid
   */
  public Boolean invalid() {
    return invalid;
  }
}

