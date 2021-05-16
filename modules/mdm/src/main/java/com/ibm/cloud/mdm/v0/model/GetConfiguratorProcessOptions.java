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
 * The getConfiguratorProcess options.
 */
public class GetConfiguratorProcessOptions extends GenericModel {

  protected String processName;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String processName;
    private String recordType;

    private Builder(GetConfiguratorProcessOptions getConfiguratorProcessOptions) {
      this.processName = getConfiguratorProcessOptions.processName;
      this.recordType = getConfiguratorProcessOptions.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param processName the processName
     */
    public Builder(String processName) {
      this.processName = processName;
    }

    /**
     * Builds a GetConfiguratorProcessOptions.
     *
     * @return the new GetConfiguratorProcessOptions instance
     */
    public GetConfiguratorProcessOptions build() {
      return new GetConfiguratorProcessOptions(this);
    }

    /**
     * Set the processName.
     *
     * @param processName the processName
     * @return the GetConfiguratorProcessOptions builder
     */
    public Builder processName(String processName) {
      this.processName = processName;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetConfiguratorProcessOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected GetConfiguratorProcessOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.processName,
      "processName cannot be empty");
    processName = builder.processName;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a GetConfiguratorProcessOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the processName.
   *
   * Unique process name to get the process status. i.e. publish_model, publish_data, match, delete_asset.
   *
   * @return the processName
   */
  public String processName() {
    return processName;
  }

  /**
   * Gets the recordType.
   *
   * Unique record type to identify data model attributes.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

