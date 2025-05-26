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
 * The getConfiguratorPairAnalysis options.
 */
public class GetConfiguratorPairAnalysisOptions extends GenericModel {

  protected String recordType;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;

    private Builder(GetConfiguratorPairAnalysisOptions getConfiguratorPairAnalysisOptions) {
      this.recordType = getConfiguratorPairAnalysisOptions.recordType;
      this.entityType = getConfiguratorPairAnalysisOptions.entityType;
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
     * Builds a GetConfiguratorPairAnalysisOptions.
     *
     * @return the new GetConfiguratorPairAnalysisOptions instance
     */
    public GetConfiguratorPairAnalysisOptions build() {
      return new GetConfiguratorPairAnalysisOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetConfiguratorPairAnalysisOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the GetConfiguratorPairAnalysisOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected GetConfiguratorPairAnalysisOptions() { }

  protected GetConfiguratorPairAnalysisOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    recordType = builder.recordType;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a GetConfiguratorPairAnalysisOptions builder
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
}

