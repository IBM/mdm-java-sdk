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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single workflow configuration to be created.
 */
public class ConfigureWorkflowWorkflow extends GenericModel {

  protected String type;
  @SerializedName("configuration_name")
  protected String configurationName;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String configurationName;

    /**
     * Instantiates a new Builder from an existing ConfigureWorkflowWorkflow instance.
     *
     * @param configureWorkflowWorkflow the instance to initialize the Builder with
     */
    private Builder(ConfigureWorkflowWorkflow configureWorkflowWorkflow) {
      this.type = configureWorkflowWorkflow.type;
      this.configurationName = configureWorkflowWorkflow.configurationName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param configurationName the configurationName
     */
    public Builder(String type, String configurationName) {
      this.type = type;
      this.configurationName = configurationName;
    }

    /**
     * Builds a ConfigureWorkflowWorkflow.
     *
     * @return the new ConfigureWorkflowWorkflow instance
     */
    public ConfigureWorkflowWorkflow build() {
      return new ConfigureWorkflowWorkflow(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ConfigureWorkflowWorkflow builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the configurationName.
     *
     * @param configurationName the configurationName
     * @return the ConfigureWorkflowWorkflow builder
     */
    public Builder configurationName(String configurationName) {
      this.configurationName = configurationName;
      return this;
    }
  }

  protected ConfigureWorkflowWorkflow() { }

  protected ConfigureWorkflowWorkflow(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.configurationName,
      "configurationName cannot be null");
    type = builder.type;
    configurationName = builder.configurationName;
  }

  /**
   * New builder.
   *
   * @return a ConfigureWorkflowWorkflow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Workflow type identifier.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the configurationName.
   *
   * Name of workflow configuration to be created for this instance.
   *
   * @return the configurationName
   */
  public String configurationName() {
    return configurationName;
  }
}

