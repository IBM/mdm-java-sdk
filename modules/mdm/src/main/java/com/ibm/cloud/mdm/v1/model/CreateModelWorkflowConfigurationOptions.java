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
 * The createModelWorkflowConfiguration options.
 */
public class CreateModelWorkflowConfigurationOptions extends GenericModel {

  protected String workflowConfigurationName;
  protected List<ConfigureWorkflowWorkflow> workflows;
  protected String workflowTemplateName;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowConfigurationName;
    private List<ConfigureWorkflowWorkflow> workflows;
    private String workflowTemplateName;

    private Builder(CreateModelWorkflowConfigurationOptions createModelWorkflowConfigurationOptions) {
      this.workflowConfigurationName = createModelWorkflowConfigurationOptions.workflowConfigurationName;
      this.workflows = createModelWorkflowConfigurationOptions.workflows;
      this.workflowTemplateName = createModelWorkflowConfigurationOptions.workflowTemplateName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateModelWorkflowConfigurationOptions.
     *
     * @return the new CreateModelWorkflowConfigurationOptions instance
     */
    public CreateModelWorkflowConfigurationOptions build() {
      return new CreateModelWorkflowConfigurationOptions(this);
    }

    /**
     * Adds an workflows to workflows.
     *
     * @param workflows the new workflows
     * @return the CreateModelWorkflowConfigurationOptions builder
     */
    public Builder addWorkflows(ConfigureWorkflowWorkflow workflows) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(workflows,
        "workflows cannot be null");
      if (this.workflows == null) {
        this.workflows = new ArrayList<ConfigureWorkflowWorkflow>();
      }
      this.workflows.add(workflows);
      return this;
    }

    /**
     * Set the workflowConfigurationName.
     *
     * @param workflowConfigurationName the workflowConfigurationName
     * @return the CreateModelWorkflowConfigurationOptions builder
     */
    public Builder workflowConfigurationName(String workflowConfigurationName) {
      this.workflowConfigurationName = workflowConfigurationName;
      return this;
    }

    /**
     * Set the workflows.
     * Existing workflows will be replaced.
     *
     * @param workflows the workflows
     * @return the CreateModelWorkflowConfigurationOptions builder
     */
    public Builder workflows(List<ConfigureWorkflowWorkflow> workflows) {
      this.workflows = workflows;
      return this;
    }

    /**
     * Set the workflowTemplateName.
     *
     * @param workflowTemplateName the workflowTemplateName
     * @return the CreateModelWorkflowConfigurationOptions builder
     */
    public Builder workflowTemplateName(String workflowTemplateName) {
      this.workflowTemplateName = workflowTemplateName;
      return this;
    }
  }

  protected CreateModelWorkflowConfigurationOptions() { }

  protected CreateModelWorkflowConfigurationOptions(Builder builder) {
    workflowConfigurationName = builder.workflowConfigurationName;
    workflows = builder.workflows;
    workflowTemplateName = builder.workflowTemplateName;
  }

  /**
   * New builder.
   *
   * @return a CreateModelWorkflowConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowConfigurationName.
   *
   * Name of workflow configuration to be created for this instance.
   *
   * @return the workflowConfigurationName
   */
  public String workflowConfigurationName() {
    return workflowConfigurationName;
  }

  /**
   * Gets the workflows.
   *
   * @return the workflows
   */
  public List<ConfigureWorkflowWorkflow> workflows() {
    return workflows;
  }

  /**
   * Gets the workflowTemplateName.
   *
   * To select one workflow template.
   *
   * @return the workflowTemplateName
   */
  public String workflowTemplateName() {
    return workflowTemplateName;
  }
}

