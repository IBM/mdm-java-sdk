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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The patchWorkflow options.
 */
public class PatchWorkflowOptions extends GenericModel {

  protected String workflowId;
  protected String workflowType;
  protected List<ActionElement> actions;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;
    private String workflowType;
    private List<ActionElement> actions;

    private Builder(PatchWorkflowOptions patchWorkflowOptions) {
      this.workflowId = patchWorkflowOptions.workflowId;
      this.workflowType = patchWorkflowOptions.workflowType;
      this.actions = patchWorkflowOptions.actions;
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
     * @param actions the actions
     */
    public Builder(String workflowId, String workflowType, List<ActionElement> actions) {
      this.workflowId = workflowId;
      this.workflowType = workflowType;
      this.actions = actions;
    }

    /**
     * Builds a PatchWorkflowOptions.
     *
     * @return the new PatchWorkflowOptions instance
     */
    public PatchWorkflowOptions build() {
      return new PatchWorkflowOptions(this);
    }

    /**
     * Adds an actions to actions.
     *
     * @param actions the new actions
     * @return the PatchWorkflowOptions builder
     */
    public Builder addActions(ActionElement actions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(actions,
        "actions cannot be null");
      if (this.actions == null) {
        this.actions = new ArrayList<ActionElement>();
      }
      this.actions.add(actions);
      return this;
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the PatchWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the PatchWorkflowOptions builder
     */
    public Builder workflowType(String workflowType) {
      this.workflowType = workflowType;
      return this;
    }

    /**
     * Set the actions.
     * Existing actions will be replaced.
     *
     * @param actions the actions
     * @return the PatchWorkflowOptions builder
     */
    public Builder actions(List<ActionElement> actions) {
      this.actions = actions;
      return this;
    }
  }

  protected PatchWorkflowOptions() { }

  protected PatchWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workflowType,
      "workflowType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actions,
      "actions cannot be null");
    workflowId = builder.workflowId;
    workflowType = builder.workflowType;
    actions = builder.actions;
  }

  /**
   * New builder.
   *
   * @return a PatchWorkflowOptions builder
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

  /**
   * Gets the actions.
   *
   * List of actions to be performed to patch workflow.
   *
   * @return the actions
   */
  public List<ActionElement> actions() {
    return actions;
  }
}

