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
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The patchMatchingRemediationWorkflow options.
 */
public class PatchMatchingRemediationWorkflowOptions extends GenericModel {

  protected String workflowId;
  protected List<IssueRemediationActionsRequest> issueActions;
  protected Map<String, Object> bulkAction;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowId;
    private List<IssueRemediationActionsRequest> issueActions;
    private Map<String, Object> bulkAction;

    private Builder(PatchMatchingRemediationWorkflowOptions patchMatchingRemediationWorkflowOptions) {
      this.workflowId = patchMatchingRemediationWorkflowOptions.workflowId;
      this.issueActions = patchMatchingRemediationWorkflowOptions.issueActions;
      this.bulkAction = patchMatchingRemediationWorkflowOptions.bulkAction;
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
     * Builds a PatchMatchingRemediationWorkflowOptions.
     *
     * @return the new PatchMatchingRemediationWorkflowOptions instance
     */
    public PatchMatchingRemediationWorkflowOptions build() {
      return new PatchMatchingRemediationWorkflowOptions(this);
    }

    /**
     * Adds an issueActions to issueActions.
     *
     * @param issueActions the new issueActions
     * @return the PatchMatchingRemediationWorkflowOptions builder
     */
    public Builder addIssueActions(IssueRemediationActionsRequest issueActions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(issueActions,
        "issueActions cannot be null");
      if (this.issueActions == null) {
        this.issueActions = new ArrayList<IssueRemediationActionsRequest>();
      }
      this.issueActions.add(issueActions);
      return this;
    }

    /**
     * Set the workflowId.
     *
     * @param workflowId the workflowId
     * @return the PatchMatchingRemediationWorkflowOptions builder
     */
    public Builder workflowId(String workflowId) {
      this.workflowId = workflowId;
      return this;
    }

    /**
     * Set the issueActions.
     * Existing issueActions will be replaced.
     *
     * @param issueActions the issueActions
     * @return the PatchMatchingRemediationWorkflowOptions builder
     */
    public Builder issueActions(List<IssueRemediationActionsRequest> issueActions) {
      this.issueActions = issueActions;
      return this;
    }

    /**
     * Set the bulkAction.
     *
     * @param bulkAction the bulkAction
     * @return the PatchMatchingRemediationWorkflowOptions builder
     */
    public Builder bulkAction(Map<String, Object> bulkAction) {
      this.bulkAction = bulkAction;
      return this;
    }
  }

  protected PatchMatchingRemediationWorkflowOptions() { }

  protected PatchMatchingRemediationWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowId,
      "workflowId cannot be empty");
    workflowId = builder.workflowId;
    issueActions = builder.issueActions;
    bulkAction = builder.bulkAction;
  }

  /**
   * New builder.
   *
   * @return a PatchMatchingRemediationWorkflowOptions builder
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
   * Gets the issueActions.
   *
   * Collection of issue remediation actions.
   *
   * @return the issueActions
   */
  public List<IssueRemediationActionsRequest> issueActions() {
    return issueActions;
  }

  /**
   * Gets the bulkAction.
   *
   * The decision of user on all the issues.
   *
   * @return the bulkAction
   */
  public Map<String, Object> bulkAction() {
    return bulkAction;
  }
}

