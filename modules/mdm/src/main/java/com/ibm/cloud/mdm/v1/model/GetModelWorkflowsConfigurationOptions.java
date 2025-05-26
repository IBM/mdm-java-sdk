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
 * The getModelWorkflowsConfiguration options.
 */
public class GetModelWorkflowsConfigurationOptions extends GenericModel {

  protected String workflowType;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowType;

    private Builder(GetModelWorkflowsConfigurationOptions getModelWorkflowsConfigurationOptions) {
      this.workflowType = getModelWorkflowsConfigurationOptions.workflowType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param workflowType the workflowType
     */
    public Builder(String workflowType) {
      this.workflowType = workflowType;
    }

    /**
     * Builds a GetModelWorkflowsConfigurationOptions.
     *
     * @return the new GetModelWorkflowsConfigurationOptions instance
     */
    public GetModelWorkflowsConfigurationOptions build() {
      return new GetModelWorkflowsConfigurationOptions(this);
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the GetModelWorkflowsConfigurationOptions builder
     */
    public Builder workflowType(String workflowType) {
      this.workflowType = workflowType;
      return this;
    }
  }

  protected GetModelWorkflowsConfigurationOptions() { }

  protected GetModelWorkflowsConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowType,
      "workflowType cannot be empty");
    workflowType = builder.workflowType;
  }

  /**
   * New builder.
   *
   * @return a GetModelWorkflowsConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowType.
   *
   * The workflow confiuration type.
   *
   * @return the workflowType
   */
  public String workflowType() {
    return workflowType;
  }
}

