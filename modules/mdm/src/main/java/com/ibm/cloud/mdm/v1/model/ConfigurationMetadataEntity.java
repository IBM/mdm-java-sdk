/*
 * (C) Copyright IBM Corp. 2022.
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
 * The details of entities in Configuration metadata.
 */
public class ConfigurationMetadataEntity extends GenericModel {

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("pair_offset")
  protected Long pairOffset;
  @SerializedName("tuned_configuration")
  protected Map<String, Object> tunedConfiguration;
  @SerializedName("current_configuration")
  protected Map<String, Object> currentConfiguration;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private Long pairOffset;
    private Map<String, Object> tunedConfiguration;
    private Map<String, Object> currentConfiguration;
    private String status;

    private Builder(ConfigurationMetadataEntity configurationMetadataEntity) {
      this.jobId = configurationMetadataEntity.jobId;
      this.pairOffset = configurationMetadataEntity.pairOffset;
      this.tunedConfiguration = configurationMetadataEntity.tunedConfiguration;
      this.currentConfiguration = configurationMetadataEntity.currentConfiguration;
      this.status = configurationMetadataEntity.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigurationMetadataEntity.
     *
     * @return the new ConfigurationMetadataEntity instance
     */
    public ConfigurationMetadataEntity build() {
      return new ConfigurationMetadataEntity(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the ConfigurationMetadataEntity builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the pairOffset.
     *
     * @param pairOffset the pairOffset
     * @return the ConfigurationMetadataEntity builder
     */
    public Builder pairOffset(long pairOffset) {
      this.pairOffset = pairOffset;
      return this;
    }

    /**
     * Set the tunedConfiguration.
     *
     * @param tunedConfiguration the tunedConfiguration
     * @return the ConfigurationMetadataEntity builder
     */
    public Builder tunedConfiguration(Map<String, Object> tunedConfiguration) {
      this.tunedConfiguration = tunedConfiguration;
      return this;
    }

    /**
     * Set the currentConfiguration.
     *
     * @param currentConfiguration the currentConfiguration
     * @return the ConfigurationMetadataEntity builder
     */
    public Builder currentConfiguration(Map<String, Object> currentConfiguration) {
      this.currentConfiguration = currentConfiguration;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ConfigurationMetadataEntity builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected ConfigurationMetadataEntity(Builder builder) {
    jobId = builder.jobId;
    pairOffset = builder.pairOffset;
    tunedConfiguration = builder.tunedConfiguration;
    currentConfiguration = builder.currentConfiguration;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a ConfigurationMetadataEntity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * The job id of an entity in Configuration metadata.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the pairOffset.
   *
   * pair offset.
   *
   * @return the pairOffset
   */
  public Long pairOffset() {
    return pairOffset;
  }

  /**
   * Gets the tunedConfiguration.
   *
   * tuned configuration.
   *
   * @return the tunedConfiguration
   */
  public Map<String, Object> tunedConfiguration() {
    return tunedConfiguration;
  }

  /**
   * Gets the currentConfiguration.
   *
   * current configuration.
   *
   * @return the currentConfiguration
   */
  public Map<String, Object> currentConfiguration() {
    return currentConfiguration;
  }

  /**
   * Gets the status.
   *
   * job status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

