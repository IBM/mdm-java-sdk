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
 * The deleteMatchingRemediationWorkflow options.
 */
public class DeleteMatchingRemediationWorkflowOptions extends GenericModel {

  protected String workflowId;
  protected Boolean removeWorkflowInstance;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;
    private Boolean removeWorkflowInstance;

    /**
     * Instantiates a new Builder from an existing DeleteMatchingRemediationWorkflowOptions instance.
     *
     * @param deleteMatchingRemediationWorkflowOptions the instance to initialize the Builder with
     */
    private Builder(DeleteMatchingRemediationWorkflowOptions deleteMatchingRemediationWorkflowOptions) {
      this.workflowId = deleteMatchingRemediationWorkflowOptions.workflowId;
      this.removeWorkflowInstance = deleteMatchingRemediationWorkflowOptions.removeWorkflowInstance;
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
     * Builds a DeleteMatchingRemediationWorkflowOptions.
     *
     * @return the new DeleteMatchingRemediationWorkflowOptions instance
     */
    public DeleteMatchingRemediationWorkflowOptions build() {
      return new DeleteMatchingRemediationWorkflowOptions(this);
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the DeleteMatchingRemediationWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }

    /**
     * Set the removeWorkflowInstance.
     *
     * @param removeWorkflowInstance the removeWorkflowInstance
     * @return the DeleteMatchingRemediationWorkflowOptions builder
     */
    public Builder removeWorkflowInstance(Boolean removeWorkflowInstance) {
      this.removeWorkflowInstance = removeWorkflowInstance;
      return this;
    }
  }

  protected DeleteMatchingRemediationWorkflowOptions() { }

  protected DeleteMatchingRemediationWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    workflowId = builder.workflowId;
    removeWorkflowInstance = builder.removeWorkflowInstance;
  }

  /**
   * New builder.
   *
   * @return a DeleteMatchingRemediationWorkflowOptions builder
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

  /**
   * Gets the removeWorkflowInstance.
   *
   * The API will not delete workflow instance if the value is set to false. Default is true.
   *
   * @return the removeWorkflowInstance
   */
  public Boolean removeWorkflowInstance() {
    return removeWorkflowInstance;
  }
}

