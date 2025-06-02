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
 * The deleteWorkflow options.
 */
public class DeleteWorkflowOptions extends GenericModel {

  protected String workflowId;
  protected String workflowType;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;
    private String workflowType;

    /**
     * Instantiates a new Builder from an existing DeleteWorkflowOptions instance.
     *
     * @param deleteWorkflowOptions the instance to initialize the Builder with
     */
    private Builder(DeleteWorkflowOptions deleteWorkflowOptions) {
      this.workflowId = deleteWorkflowOptions.workflowId;
      this.workflowType = deleteWorkflowOptions.workflowType;
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
     * @param workflowType the workflowType
     */
    public Builder(String workflowId, String workflowType) {
      this.workflowId = workflowId;
      this.workflowType = workflowType;
    }

    /**
     * Builds a DeleteWorkflowOptions.
     *
     * @return the new DeleteWorkflowOptions instance
     */
    public DeleteWorkflowOptions build() {
      return new DeleteWorkflowOptions(this);
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the DeleteWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the DeleteWorkflowOptions builder
     */
    public Builder workflowType(String workflowType) {
      this.workflowType = workflowType;
      return this;
    }
  }

  protected DeleteWorkflowOptions() { }

  protected DeleteWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workflowType,
      "workflowType cannot be null");
    workflowId = builder.workflowId;
    workflowType = builder.workflowType;
  }

  /**
   * New builder.
   *
   * @return a DeleteWorkflowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowId.
   *
   * The ID of the workflow.
   *
   * @return the workflowId
   */
  public String workflowId() {
    return workflowId;
  }

  /**
   * Gets the workflowType.
   *
   * The type of the workflow.
   *
   * @return the workflowType
   */
  public String workflowType() {
    return workflowType;
  }
}

