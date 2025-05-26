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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * UpdatePairAnalysis.
 */
public class UpdatePairAnalysis extends GenericModel {

  @SerializedName("pair_offset")
  protected Long pairOffset;
  @SerializedName("tuned_config")
  protected Map<String, Object> tunedConfig;
  @SerializedName("base_config")
  protected Map<String, Object> baseConfig;
  @SerializedName("pair_gen_job_id")
  protected String pairGenJobId;
  @SerializedName("tuning_job_id")
  protected String tuningJobId;
  protected String status;

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

    private Builder(UpdatePairAnalysis updatePairAnalysis) {
      this.pairOffset = updatePairAnalysis.pairOffset;
      this.tunedConfig = updatePairAnalysis.tunedConfig;
      this.baseConfig = updatePairAnalysis.baseConfig;
      this.pairGenJobId = updatePairAnalysis.pairGenJobId;
      this.tuningJobId = updatePairAnalysis.tuningJobId;
      this.status = updatePairAnalysis.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdatePairAnalysis.
     *
     * @return the new UpdatePairAnalysis instance
     */
    public UpdatePairAnalysis build() {
      return new UpdatePairAnalysis(this);
    }

    /**
     * Set the pairOffset.
     *
     * @param pairOffset the pairOffset
     * @return the UpdatePairAnalysis builder
     */
    public Builder pairOffset(long pairOffset) {
      this.pairOffset = pairOffset;
      return this;
    }

    /**
     * Set the tunedConfig.
     *
     * @param tunedConfig the tunedConfig
     * @return the UpdatePairAnalysis builder
     */
    public Builder tunedConfig(Map<String, Object> tunedConfig) {
      this.tunedConfig = tunedConfig;
      return this;
    }

    /**
     * Set the baseConfig.
     *
     * @param baseConfig the baseConfig
     * @return the UpdatePairAnalysis builder
     */
    public Builder baseConfig(Map<String, Object> baseConfig) {
      this.baseConfig = baseConfig;
      return this;
    }

    /**
     * Set the pairGenJobId.
     *
     * @param pairGenJobId the pairGenJobId
     * @return the UpdatePairAnalysis builder
     */
    public Builder pairGenJobId(String pairGenJobId) {
      this.pairGenJobId = pairGenJobId;
      return this;
    }

    /**
     * Set the tuningJobId.
     *
     * @param tuningJobId the tuningJobId
     * @return the UpdatePairAnalysis builder
     */
    public Builder tuningJobId(String tuningJobId) {
      this.tuningJobId = tuningJobId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the UpdatePairAnalysis builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected UpdatePairAnalysis() { }

  protected UpdatePairAnalysis(Builder builder) {
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
   * @return a UpdatePairAnalysis builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

