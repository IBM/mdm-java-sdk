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
 * The patchConfiguratorPairAnalysis options.
 */
public class PatchConfiguratorPairAnalysisOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Long pairOffset;
  protected Map<String, Object> tunedConfig;
  protected Map<String, Object> baseConfig;
  protected String pairGenJobId;
  protected String tuningJobId;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Long pairOffset;
    private Map<String, Object> tunedConfig;
    private Map<String, Object> baseConfig;
    private String pairGenJobId;
    private String tuningJobId;
    private String status;

    /**
     * Instantiates a new Builder from an existing PatchConfiguratorPairAnalysisOptions instance.
     *
     * @param patchConfiguratorPairAnalysisOptions the instance to initialize the Builder with
     */
    private Builder(PatchConfiguratorPairAnalysisOptions patchConfiguratorPairAnalysisOptions) {
      this.recordType = patchConfiguratorPairAnalysisOptions.recordType;
      this.entityType = patchConfiguratorPairAnalysisOptions.entityType;
      this.pairOffset = patchConfiguratorPairAnalysisOptions.pairOffset;
      this.tunedConfig = patchConfiguratorPairAnalysisOptions.tunedConfig;
      this.baseConfig = patchConfiguratorPairAnalysisOptions.baseConfig;
      this.pairGenJobId = patchConfiguratorPairAnalysisOptions.pairGenJobId;
      this.tuningJobId = patchConfiguratorPairAnalysisOptions.tuningJobId;
      this.status = patchConfiguratorPairAnalysisOptions.status;
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
     * Builds a PatchConfiguratorPairAnalysisOptions.
     *
     * @return the new PatchConfiguratorPairAnalysisOptions instance
     */
    public PatchConfiguratorPairAnalysisOptions build() {
      return new PatchConfiguratorPairAnalysisOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the pairOffset.
     *
     * @param pairOffset the pairOffset
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder pairOffset(long pairOffset) {
      this.pairOffset = pairOffset;
      return this;
    }

    /**
     * Set the tunedConfig.
     *
     * @param tunedConfig the tunedConfig
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder tunedConfig(Map<String, Object> tunedConfig) {
      this.tunedConfig = tunedConfig;
      return this;
    }

    /**
     * Set the baseConfig.
     *
     * @param baseConfig the baseConfig
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder baseConfig(Map<String, Object> baseConfig) {
      this.baseConfig = baseConfig;
      return this;
    }

    /**
     * Set the pairGenJobId.
     *
     * @param pairGenJobId the pairGenJobId
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder pairGenJobId(String pairGenJobId) {
      this.pairGenJobId = pairGenJobId;
      return this;
    }

    /**
     * Set the tuningJobId.
     *
     * @param tuningJobId the tuningJobId
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder tuningJobId(String tuningJobId) {
      this.tuningJobId = tuningJobId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the updatePairAnalysis.
     *
     * @param updatePairAnalysis the updatePairAnalysis
     * @return the PatchConfiguratorPairAnalysisOptions builder
     */
    public Builder updatePairAnalysis(UpdatePairAnalysis updatePairAnalysis) {
      this.pairOffset = updatePairAnalysis.pairOffset();
      this.tunedConfig = updatePairAnalysis.tunedConfig();
      this.baseConfig = updatePairAnalysis.baseConfig();
      this.pairGenJobId = updatePairAnalysis.pairGenJobId();
      this.tuningJobId = updatePairAnalysis.tuningJobId();
      this.status = updatePairAnalysis.status();
      return this;
    }
  }

  protected PatchConfiguratorPairAnalysisOptions() { }

  protected PatchConfiguratorPairAnalysisOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    recordType = builder.recordType;
    entityType = builder.entityType;
    pairOffset = builder.pairOffset;
    tunedConfig = builder.tunedConfig;
    baseConfig = builder.baseConfig;
    pairGenJobId = builder.pairGenJobId;
    tuningJobId = builder.tuningJobId;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a PatchConfiguratorPairAnalysisOptions builder
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
   * Gets the pairOffset.
   *
   * The pair offset of the pair analysis data.
   *
   * @return the pairOffset
   */
  public Long pairOffset() {
    return pairOffset;
  }

  /**
   * Gets the tunedConfig.
   *
   * Tuned config of the pair analysis data.
   *
   * @return the tunedConfig
   */
  public Map<String, Object> tunedConfig() {
    return tunedConfig;
  }

  /**
   * Gets the baseConfig.
   *
   * The base config of the pair analysis data.
   *
   * @return the baseConfig
   */
  public Map<String, Object> baseConfig() {
    return baseConfig;
  }

  /**
   * Gets the pairGenJobId.
   *
   * The id of pair generation job.
   *
   * @return the pairGenJobId
   */
  public String pairGenJobId() {
    return pairGenJobId;
  }

  /**
   * Gets the tuningJobId.
   *
   * The tuning job id.
   *
   * @return the tuningJobId
   */
  public String tuningJobId() {
    return tuningJobId;
  }

  /**
   * Gets the status.
   *
   * The pair analysis status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

