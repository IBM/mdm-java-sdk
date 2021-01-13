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
 * The modelPatchFlow options.
 */
public class ModelPatchFlowOptions extends GenericModel {

  protected String action;
  protected String approverName;
  protected String flowId;
  protected String message;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String approverName;
    private String flowId;
    private String message;

    private Builder(ModelPatchFlowOptions modelPatchFlowOptions) {
      this.action = modelPatchFlowOptions.action;
      this.approverName = modelPatchFlowOptions.approverName;
      this.flowId = modelPatchFlowOptions.flowId;
      this.message = modelPatchFlowOptions.message;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param action the action
     * @param approverName the approverName
     * @param flowId the flowId
     */
    public Builder(String action, String approverName, String flowId) {
      this.action = action;
      this.approverName = approverName;
      this.flowId = flowId;
    }

    /**
     * Builds a ModelPatchFlowOptions.
     *
     * @return the new ModelPatchFlowOptions instance
     */
    public ModelPatchFlowOptions build() {
      return new ModelPatchFlowOptions(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the ModelPatchFlowOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the approverName.
     *
     * @param approverName the approverName
     * @return the ModelPatchFlowOptions builder
     */
    public Builder approverName(String approverName) {
      this.approverName = approverName;
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the ModelPatchFlowOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }

    /**
     * Set the message.
     *
     * @param message the message
     * @return the ModelPatchFlowOptions builder
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }

  protected ModelPatchFlowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.approverName,
      "approverName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.flowId,
      "flowId cannot be null");
    action = builder.action;
    approverName = builder.approverName;
    flowId = builder.flowId;
    message = builder.message;
  }

  /**
   * New builder.
   *
   * @return a ModelPatchFlowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the flowId.
   *
   * System generated flow identifier.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
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

