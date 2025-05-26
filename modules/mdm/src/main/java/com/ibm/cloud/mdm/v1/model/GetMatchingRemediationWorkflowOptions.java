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
 * The getMatchingRemediationWorkflow options.
 */
public class GetMatchingRemediationWorkflowOptions extends GenericModel {

  protected String workflowId;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;

    private Builder(GetMatchingRemediationWorkflowOptions getMatchingRemediationWorkflowOptions) {
      this.workflowId = getMatchingRemediationWorkflowOptions.workflowId;
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
     * Builds a GetMatchingRemediationWorkflowOptions.
     *
     * @return the new GetMatchingRemediationWorkflowOptions instance
     */
    public GetMatchingRemediationWorkflowOptions build() {
      return new GetMatchingRemediationWorkflowOptions(this);
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the GetMatchingRemediationWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }
  }

  protected GetMatchingRemediationWorkflowOptions() { }

  protected GetMatchingRemediationWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    workflowId = builder.workflowId;
  }

  /**
   * New builder.
   *
   * @return a GetMatchingRemediationWorkflowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowId.
   *
   * The unique identifier of a workflow as assigned by the system.
   *
   * @return the workflowId
   */
  public String workflowId() {
    return workflowId;
  }
}

