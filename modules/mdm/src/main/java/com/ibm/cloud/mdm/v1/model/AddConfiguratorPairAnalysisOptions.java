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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addConfiguratorPairAnalysis options.
 */
public class AddConfiguratorPairAnalysisOptions extends GenericModel {

  protected Long pairOffset;
  protected Map<String, Object> tunedConfig;
  protected Map<String, Object> baseConfig;
  protected String pairGenJobId;
  protected String tuningJobId;
  protected String status;
  protected String recordType;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long pairOffset;
    private Map<String, Object> tunedConfig;
    private Map<String, Object> baseConfig;
    private String pairGenJobId;
    private String tuningJobId;
    private String status;
    private String recordType;
    private String entityType;

    /**
     * Instantiates a new Builder from an existing AddConfiguratorPairAnalysisOptions instance.
     *
     * @param addConfiguratorPairAnalysisOptions the instance to initialize the Builder with
     */
    private Builder(AddConfiguratorPairAnalysisOptions addConfiguratorPairAnalysisOptions) {
      this.pairOffset = addConfiguratorPairAnalysisOptions.pairOffset;
      this.tunedConfig = addConfiguratorPairAnalysisOptions.tunedConfig;
      this.baseConfig = addConfiguratorPairAnalysisOptions.baseConfig;
      this.pairGenJobId = addConfiguratorPairAnalysisOptions.pairGenJobId;
      this.tuningJobId = addConfiguratorPairAnalysisOptions.tuningJobId;
      this.status = addConfiguratorPairAnalysisOptions.status;
      this.recordType = addConfiguratorPairAnalysisOptions.recordType;
      this.entityType = addConfiguratorPairAnalysisOptions.entityType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AddConfiguratorPairAnalysisOptions.
     *
     * @return the new AddConfiguratorPairAnalysisOptions instance
     */
    public AddConfiguratorPairAnalysisOptions build() {
      return new AddConfiguratorPairAnalysisOptions(this);
    }

    /**
     * Set the pairOffset.
     *
     * @param pairOffset the pairOffset
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder pairOffset(long pairOffset) {
      this.pairOffset = pairOffset;
      return this;
    }

    /**
     * Set the tunedConfig.
     *
     * @param tunedConfig the tunedConfig
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder tunedConfig(Map<String, Object> tunedConfig) {
      this.tunedConfig = tunedConfig;
      return this;
    }

    /**
     * Set the baseConfig.
     *
     * @param baseConfig the baseConfig
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder baseConfig(Map<String, Object> baseConfig) {
      this.baseConfig = baseConfig;
      return this;
    }

    /**
     * Set the pairGenJobId.
     *
     * @param pairGenJobId the pairGenJobId
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder pairGenJobId(String pairGenJobId) {
      this.pairGenJobId = pairGenJobId;
      return this;
    }

    /**
     * Set the tuningJobId.
     *
     * @param tuningJobId the tuningJobId
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder tuningJobId(String tuningJobId) {
      this.tuningJobId = tuningJobId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the pairAnalysisResponse.
     *
     * @param pairAnalysisResponse the pairAnalysisResponse
     * @return the AddConfiguratorPairAnalysisOptions builder
     */
    public Builder pairAnalysisResponse(PairAnalysisResponse pairAnalysisResponse) {
      this.pairOffset = pairAnalysisResponse.pairOffset();
      this.tunedConfig = pairAnalysisResponse.tunedConfig();
      this.baseConfig = pairAnalysisResponse.baseConfig();
      this.pairGenJobId = pairAnalysisResponse.pairGenJobId();
      this.tuningJobId = pairAnalysisResponse.tuningJobId();
      this.status = pairAnalysisResponse.status();
      this.recordType = pairAnalysisResponse.recordType();
      this.entityType = pairAnalysisResponse.entityType();
      return this;
    }
  }

  protected AddConfiguratorPairAnalysisOptions() { }

  protected AddConfiguratorPairAnalysisOptions(Builder builder) {
    pairOffset = builder.pairOffset;
    tunedConfig = builder.tunedConfig;
    baseConfig = builder.baseConfig;
    pairGenJobId = builder.pairGenJobId;
    tuningJobId = builder.tuningJobId;
    status = builder.status;
    recordType = builder.recordType;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a AddConfiguratorPairAnalysisOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pairOffset.
   *
   * The pair offset of the pair analysis.
   *
   * @return the pairOffset
   */
  public Long pairOffset() {
    return pairOffset;
  }

  /**
   * Gets the tunedConfig.
   *
   * Tuned config of the pair analysis.
   *
   * @return the tunedConfig
   */
  public Map<String, Object> tunedConfig() {
    return tunedConfig;
  }

  /**
   * Gets the baseConfig.
   *
   * The base config of the pair analysis.
   *
   * @return the baseConfig
   */
  public Map<String, Object> baseConfig() {
    return baseConfig;
  }

  /**
   * Gets the pairGenJobId.
   *
   * The id pair generation job.
   *
   * @return the pairGenJobId
   */
  public String pairGenJobId() {
    return pairGenJobId;
  }

  /**
   * Gets the tuningJobId.
   *
   * The id of tuning job .
   *
   * @return the tuningJobId
   */
  public String tuningJobId() {
    return tuningJobId;
  }

  /**
   * Gets the status.
   *
   * The status of the pair analysis.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the recordType.
   *
   * The record type of the pair analysis.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * The entity type of the pair analysis.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }
}

