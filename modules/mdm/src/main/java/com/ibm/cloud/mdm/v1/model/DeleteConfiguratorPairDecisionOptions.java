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
 * The deleteConfiguratorPairDecision options.
 */
public class DeleteConfiguratorPairDecisionOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected String recordNumber1;
  protected String recordNumber2;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private String recordNumber1;
    private String recordNumber2;

    /**
     * Instantiates a new Builder from an existing DeleteConfiguratorPairDecisionOptions instance.
     *
     * @param deleteConfiguratorPairDecisionOptions the instance to initialize the Builder with
     */
    private Builder(DeleteConfiguratorPairDecisionOptions deleteConfiguratorPairDecisionOptions) {
      this.recordType = deleteConfiguratorPairDecisionOptions.recordType;
      this.entityType = deleteConfiguratorPairDecisionOptions.entityType;
      this.recordNumber1 = deleteConfiguratorPairDecisionOptions.recordNumber1;
      this.recordNumber2 = deleteConfiguratorPairDecisionOptions.recordNumber2;
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
     */
    public Builder(String recordType, String entityType) {
      this.recordType = recordType;
      this.entityType = entityType;
    }

    /**
     * Builds a DeleteConfiguratorPairDecisionOptions.
     *
     * @return the new DeleteConfiguratorPairDecisionOptions instance
     */
    public DeleteConfiguratorPairDecisionOptions build() {
      return new DeleteConfiguratorPairDecisionOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the DeleteConfiguratorPairDecisionOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the DeleteConfiguratorPairDecisionOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the DeleteConfiguratorPairDecisionOptions builder
     */
    public Builder recordNumber1(String recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the DeleteConfiguratorPairDecisionOptions builder
     */
    public Builder recordNumber2(String recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }
  }

  protected DeleteConfiguratorPairDecisionOptions() { }

  protected DeleteConfiguratorPairDecisionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    recordType = builder.recordType;
    entityType = builder.entityType;
    recordNumber1 = builder.recordNumber1;
    recordNumber2 = builder.recordNumber2;
  }

  /**
   * New builder.
   *
   * @return a DeleteConfiguratorPairDecisionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * Record type of comparison pair.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * Entity type of comparison pair.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the recordNumber1.
   *
   * Record identifier of comparison pair.
   *
   * @return the recordNumber1
   */
  public String recordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * Record identifier of comparison pair.
   *
   * @return the recordNumber2
   */
  public String recordNumber2() {
    return recordNumber2;
  }
}

