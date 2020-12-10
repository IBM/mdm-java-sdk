/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The modelPatchFlow options.
 */
public class ModelPatchFlowOptions extends GenericModel {

  protected String crn;
  protected String flowId;
  protected String approverName;
  protected String action;
  protected String message;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String flowId;
    private String approverName;
    private String action;
    private String message;

    private Builder(ModelPatchFlowOptions modelPatchFlowOptions) {
      this.crn = modelPatchFlowOptions.crn;
      this.flowId = modelPatchFlowOptions.flowId;
      this.approverName = modelPatchFlowOptions.approverName;
      this.action = modelPatchFlowOptions.action;
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
     * @param crn the crn
     * @param flowId the flowId
     * @param approverName the approverName
     * @param action the action
     */
    public Builder(String crn, String flowId, String approverName, String action) {
      this.crn = crn;
      this.flowId = flowId;
      this.approverName = approverName;
      this.action = action;
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
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelPatchFlowOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.flowId,
      "flowId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.approverName,
      "approverName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    crn = builder.crn;
    flowId = builder.flowId;
    approverName = builder.approverName;
    action = builder.action;
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
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

