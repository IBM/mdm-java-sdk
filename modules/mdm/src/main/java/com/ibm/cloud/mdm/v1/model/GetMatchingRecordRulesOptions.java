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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getMatchingRecordRules options.
 */
public class GetMatchingRecordRulesOptions extends GenericModel {

  protected Long recordNumber;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long recordNumber;
    private String entityType;

    private Builder(GetMatchingRecordRulesOptions getMatchingRecordRulesOptions) {
      this.recordNumber = getMatchingRecordRulesOptions.recordNumber;
      this.entityType = getMatchingRecordRulesOptions.entityType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordNumber the recordNumber
     * @param entityType the entityType
     */
    public Builder(Long recordNumber, String entityType) {
      this.recordNumber = recordNumber;
      this.entityType = entityType;
    }

    /**
     * Builds a GetMatchingRecordRulesOptions.
     *
     * @return the new GetMatchingRecordRulesOptions instance
     */
    public GetMatchingRecordRulesOptions build() {
      return new GetMatchingRecordRulesOptions(this);
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the GetMatchingRecordRulesOptions builder
     */
    public Builder recordNumber(long recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the GetMatchingRecordRulesOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected GetMatchingRecordRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber,
      "recordNumber cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    recordNumber = builder.recordNumber;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a GetMatchingRecordRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of a source record as assigned by the system.
   *
   * @return the recordNumber
   */
  public Long recordNumber() {
    return recordNumber;
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
}

