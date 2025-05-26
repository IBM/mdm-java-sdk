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
 * The resolveWorkflow options.
 */
public class ResolveWorkflowOptions extends GenericModel {

  protected String workflowId;
  protected String workflowType;
  protected List<Action> actions;
  protected String comments;
  protected Boolean previewOnly;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;
    private String workflowType;
    private List<Action> actions;
    private String comments;
    private Boolean previewOnly;

    private Builder(ResolveWorkflowOptions resolveWorkflowOptions) {
      this.workflowId = resolveWorkflowOptions.workflowId;
      this.workflowType = resolveWorkflowOptions.workflowType;
      this.actions = resolveWorkflowOptions.actions;
      this.comments = resolveWorkflowOptions.comments;
      this.previewOnly = resolveWorkflowOptions.previewOnly;
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
    public Builder(String workflowId, String workflowType, List<Action> actions) {
      this.workflowId = workflowId;
      this.workflowType = workflowType;
      this.actions = actions;
    }

    /**
     * Builds a ResolveWorkflowOptions.
     *
     * @return the new ResolveWorkflowOptions instance
     */
    public ResolveWorkflowOptions build() {
      return new ResolveWorkflowOptions(this);
    }

    /**
     * Adds an actions to actions.
     *
     * @param actions the new actions
     * @return the ResolveWorkflowOptions builder
     */
    public Builder addActions(Action actions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(actions,
        "actions cannot be null");
      if (this.actions == null) {
        this.actions = new ArrayList<Action>();
      }
      this.actions.add(actions);
      return this;
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the ResolveWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the ResolveWorkflowOptions builder
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
     * @return the ResolveWorkflowOptions builder
     */
    public Builder actions(List<Action> actions) {
      this.actions = actions;
      return this;
    }

    /**
     * Set the comments.
     *
     * @param comments the comments
     * @return the ResolveWorkflowOptions builder
     */
    public Builder comments(String comments) {
      this.comments = comments;
      return this;
    }

    /**
     * Set the previewOnly.
     *
     * @param previewOnly the previewOnly
     * @return the ResolveWorkflowOptions builder
     */
    public Builder previewOnly(Boolean previewOnly) {
      this.previewOnly = previewOnly;
      return this;
    }
  }

  protected ResolveWorkflowOptions() { }

  protected ResolveWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workflowType,
      "workflowType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actions,
      "actions cannot be null");
    workflowId = builder.workflowId;
    workflowType = builder.workflowType;
    actions = builder.actions;
    comments = builder.comments;
    previewOnly = builder.previewOnly;
  }

  /**
   * New builder.
   *
   * @return a ResolveWorkflowOptions builder
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
   * List of actions to be performed to resolve workflow.
   *
   * @return the actions
   */
  public List<Action> actions() {
    return actions;
  }

  /**
   * Gets the comments.
   *
   * Comments associated to workflow resolve.
   *
   * @return the comments
   */
  public String comments() {
    return comments;
  }

  /**
   * Gets the previewOnly.
   *
   * Flag to preview the resolved workflow changes or to apply them. Defualt is false.
   *
   * @return the previewOnly
   */
  public Boolean previewOnly() {
    return previewOnly;
  }
}

