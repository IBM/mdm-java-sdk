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
 * The updateModelFlow options.
 */
public class UpdateModelFlowOptions extends GenericModel {

  protected String flowId;
  protected String approverName;
  protected String action;
  protected String message;

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;
    private String approverName;
    private String action;
    private String message;

    /**
     * Instantiates a new Builder from an existing UpdateModelFlowOptions instance.
     *
     * @param updateModelFlowOptions the instance to initialize the Builder with
     */
    private Builder(UpdateModelFlowOptions updateModelFlowOptions) {
      this.flowId = updateModelFlowOptions.flowId;
      this.approverName = updateModelFlowOptions.approverName;
      this.action = updateModelFlowOptions.action;
      this.message = updateModelFlowOptions.message;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param flowId the flowId
     * @param approverName the approverName
     * @param action the action
     */
    public Builder(String flowId, String approverName, String action) {
      this.flowId = flowId;
      this.approverName = approverName;
      this.action = action;
    }

    /**
     * Builds a UpdateModelFlowOptions.
     *
     * @return the new UpdateModelFlowOptions instance
     */
    public UpdateModelFlowOptions build() {
      return new UpdateModelFlowOptions(this);
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the UpdateModelFlowOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the approverName.
     *
     * @param approverName the approverName
     * @return the UpdateModelFlowOptions builder
     */
    public Builder approverName(String approverName) {
      this.approverName = approverName;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateModelFlowOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the message.
     *
     * @param message the message
     * @return the UpdateModelFlowOptions builder
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }

  protected UpdateModelFlowOptions() { }

  protected UpdateModelFlowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.flowId,
      "flowId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.approverName,
      "approverName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    flowId = builder.flowId;
    approverName = builder.approverName;
    action = builder.action;
    message = builder.message;
  }

  /**
   * New builder.
   *
   * @return a UpdateModelFlowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowId.
   *
   * The unique identifier of a workflow as assigned by the system.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }

  /**
   * Gets the approverName.
   *
   * Authorized approver name who invokes the action.
   *
   * @return the approverName
   */
  public String approverName() {
    return approverName;
  }

  /**
   * Gets the action.
   *
   * One of: approve or reject.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the message.
   *
   * Additional detail about the action (i.e. success).
   *
   * @return the message
   */
  public String message() {
    return message;
  }
}

