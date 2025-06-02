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
 * WorkflowConfigurationWorkflowConfigurations.
 */
public class WorkflowConfigurationWorkflowConfigurations extends GenericModel {

  @SerializedName("default")
  protected Map<String, Object> xDefault;
  @SerializedName("source_based")
  protected Map<String, Object> sourceBased;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> xDefault;
    private Map<String, Object> sourceBased;

    /**
     * Instantiates a new Builder from an existing WorkflowConfigurationWorkflowConfigurations instance.
     *
     * @param workflowConfigurationWorkflowConfigurations the instance to initialize the Builder with
     */
    private Builder(WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurations) {
      this.xDefault = workflowConfigurationWorkflowConfigurations.xDefault;
      this.sourceBased = workflowConfigurationWorkflowConfigurations.sourceBased;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkflowConfigurationWorkflowConfigurations.
     *
     * @return the new WorkflowConfigurationWorkflowConfigurations instance
     */
    public WorkflowConfigurationWorkflowConfigurations build() {
      return new WorkflowConfigurationWorkflowConfigurations(this);
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the WorkflowConfigurationWorkflowConfigurations builder
     */
    public Builder xDefault(Map<String, Object> xDefault) {
      this.xDefault = xDefault;
      return this;
    }

    /**
     * Set the sourceBased.
     *
     * @param sourceBased the sourceBased
     * @return the WorkflowConfigurationWorkflowConfigurations builder
     */
    public Builder sourceBased(Map<String, Object> sourceBased) {
      this.sourceBased = sourceBased;
      return this;
    }
  }

  protected WorkflowConfigurationWorkflowConfigurations() { }

  protected WorkflowConfigurationWorkflowConfigurations(Builder builder) {
    xDefault = builder.xDefault;
    sourceBased = builder.sourceBased;
  }

  /**
   * New builder.
   *
   * @return a WorkflowConfigurationWorkflowConfigurations builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDefault.
   *
   * @return the xDefault
   */
  public Map<String, Object> xDefault() {
    return xDefault;
  }

  /**
   * Gets the sourceBased.
   *
   * @return the sourceBased
   */
  public Map<String, Object> sourceBased() {
    return sourceBased;
  }
}

