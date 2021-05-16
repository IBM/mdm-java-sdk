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
 * The initiateConfiguratorMatching options.
 */
public class InitiateConfiguratorMatchingOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Boolean doDerive;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Boolean doDerive;

    private Builder(InitiateConfiguratorMatchingOptions initiateConfiguratorMatchingOptions) {
      this.recordType = initiateConfiguratorMatchingOptions.recordType;
      this.entityType = initiateConfiguratorMatchingOptions.entityType;
      this.doDerive = initiateConfiguratorMatchingOptions.doDerive;
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
     * Builds a InitiateConfiguratorMatchingOptions.
     *
     * @return the new InitiateConfiguratorMatchingOptions instance
     */
    public InitiateConfiguratorMatchingOptions build() {
      return new InitiateConfiguratorMatchingOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the InitiateConfiguratorMatchingOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the InitiateConfiguratorMatchingOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the doDerive.
     *
     * @param doDerive the doDerive
     * @return the InitiateConfiguratorMatchingOptions builder
     */
    public Builder doDerive(Boolean doDerive) {
      this.doDerive = doDerive;
      return this;
    }
  }

  protected InitiateConfiguratorMatchingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    recordType = builder.recordType;
    entityType = builder.entityType;
    doDerive = builder.doDerive;
  }

  /**
   * New builder.
   *
   * @return a InitiateConfiguratorMatchingOptions builder
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
   * Gets the doDerive.
   *
   * Flag to enable/disable derive operation when performing match operation.
   *
   * @return the doDerive
   */
  public Boolean doDerive() {
    return doDerive;
  }
}

