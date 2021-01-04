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
 * The retrieveRulesFromRecid options.
 */
public class RetrieveRulesFromRecidOptions extends GenericModel {

  protected String crn;
  protected Long recordNumber;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private Long recordNumber;
    private String entityType;

    private Builder(RetrieveRulesFromRecidOptions retrieveRulesFromRecidOptions) {
      this.crn = retrieveRulesFromRecidOptions.crn;
      this.recordNumber = retrieveRulesFromRecidOptions.recordNumber;
      this.entityType = retrieveRulesFromRecidOptions.entityType;
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
     * @param recordNumber the recordNumber
     * @param entityType the entityType
     */
    public Builder(String crn, Long recordNumber, String entityType) {
      this.crn = crn;
      this.recordNumber = recordNumber;
      this.entityType = entityType;
    }

    /**
     * Builds a RetrieveRulesFromRecidOptions.
     *
     * @return the new RetrieveRulesFromRecidOptions instance
     */
    public RetrieveRulesFromRecidOptions build() {
      return new RetrieveRulesFromRecidOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the RetrieveRulesFromRecidOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the RetrieveRulesFromRecidOptions builder
     */
    public Builder recordNumber(long recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the RetrieveRulesFromRecidOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected RetrieveRulesFromRecidOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber,
      "recordNumber cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    crn = builder.crn;
    recordNumber = builder.recordNumber;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a RetrieveRulesFromRecidOptions builder
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
   * Gets the recordNumber.
   *
   * The unique identifier of a source record as assigned by the system .
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

