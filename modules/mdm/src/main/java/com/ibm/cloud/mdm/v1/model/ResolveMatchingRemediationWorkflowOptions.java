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
 * The resolveMatchingRemediationWorkflow options.
 */
public class ResolveMatchingRemediationWorkflowOptions extends GenericModel {

  protected String workflowId;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;

    /**
     * Instantiates a new Builder from an existing ResolveMatchingRemediationWorkflowOptions instance.
     *
     * @param resolveMatchingRemediationWorkflowOptions the instance to initialize the Builder with
     */
    private Builder(ResolveMatchingRemediationWorkflowOptions resolveMatchingRemediationWorkflowOptions) {
      this.workflowId = resolveMatchingRemediationWorkflowOptions.workflowId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param workflowId the workflowId
     */
    public Builder(String workflowId) {
      this.workflowId = workflowId;
    }

    /**
     * Builds a ResolveMatchingRemediationWorkflowOptions.
     *
     * @return the new ResolveMatchingRemediationWorkflowOptions instance
     */
    public ResolveMatchingRemediationWorkflowOptions build() {
      return new ResolveMatchingRemediationWorkflowOptions(this);
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the ResolveMatchingRemediationWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }
  }

  protected ResolveMatchingRemediationWorkflowOptions() { }

  protected ResolveMatchingRemediationWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    workflowId = builder.workflowId;
  }

  /**
   * New builder.
   *
   * @return a ResolveMatchingRemediationWorkflowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowId.
   *
   * The workflow identifier of an workflow as assigned by the system.
   *
   * @return the workflowId
   */
  public String workflowId() {
    return workflowId;
  }
}

