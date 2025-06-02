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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The putModelWorkflowsConfiguration options.
 */
public class PutModelWorkflowsConfigurationOptions extends GenericModel {

  protected String workflowType;
  protected Boolean autoCreateTasks;
  protected Map<String, Object> applicableDataTypes;
  protected String description;
  protected Map<String, Object> customTags;
  protected Long maxAccumulatedUpdates;
  protected WorkflowConfigurationTriggerOperator triggerOperator;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowType;
    private Boolean autoCreateTasks;
    private Map<String, Object> applicableDataTypes;
    private String description;
    private Map<String, Object> customTags;
    private Long maxAccumulatedUpdates;
    private WorkflowConfigurationTriggerOperator triggerOperator;

    /**
     * Instantiates a new Builder from an existing PutModelWorkflowsConfigurationOptions instance.
     *
     * @param putModelWorkflowsConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(PutModelWorkflowsConfigurationOptions putModelWorkflowsConfigurationOptions) {
      this.workflowType = putModelWorkflowsConfigurationOptions.workflowType;
      this.autoCreateTasks = putModelWorkflowsConfigurationOptions.autoCreateTasks;
      this.applicableDataTypes = putModelWorkflowsConfigurationOptions.applicableDataTypes;
      this.description = putModelWorkflowsConfigurationOptions.description;
      this.customTags = putModelWorkflowsConfigurationOptions.customTags;
      this.maxAccumulatedUpdates = putModelWorkflowsConfigurationOptions.maxAccumulatedUpdates;
      this.triggerOperator = putModelWorkflowsConfigurationOptions.triggerOperator;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param workflowType the workflowType
     * @param autoCreateTasks the autoCreateTasks
     * @param applicableDataTypes the applicableDataTypes
     */
    public Builder(String workflowType, Boolean autoCreateTasks, Map<String, Object> applicableDataTypes) {
      this.workflowType = workflowType;
      this.autoCreateTasks = autoCreateTasks;
      this.applicableDataTypes = applicableDataTypes;
    }

    /**
     * Builds a PutModelWorkflowsConfigurationOptions.
     *
     * @return the new PutModelWorkflowsConfigurationOptions instance
     */
    public PutModelWorkflowsConfigurationOptions build() {
      return new PutModelWorkflowsConfigurationOptions(this);
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder workflowType(String workflowType) {
      this.workflowType = workflowType;
      return this;
    }

    /**
     * Set the autoCreateTasks.
     *
     * @param autoCreateTasks the autoCreateTasks
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder autoCreateTasks(Boolean autoCreateTasks) {
      this.autoCreateTasks = autoCreateTasks;
      return this;
    }

    /**
     * Set the applicableDataTypes.
     *
     * @param applicableDataTypes the applicableDataTypes
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder applicableDataTypes(Map<String, Object> applicableDataTypes) {
      this.applicableDataTypes = applicableDataTypes;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the customTags.
     *
     * @param customTags the customTags
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder customTags(Map<String, Object> customTags) {
      this.customTags = customTags;
      return this;
    }

    /**
     * Set the maxAccumulatedUpdates.
     *
     * @param maxAccumulatedUpdates the maxAccumulatedUpdates
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder maxAccumulatedUpdates(long maxAccumulatedUpdates) {
      this.maxAccumulatedUpdates = maxAccumulatedUpdates;
      return this;
    }

    /**
     * Set the triggerOperator.
     *
     * @param triggerOperator the triggerOperator
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder triggerOperator(WorkflowConfigurationTriggerOperator triggerOperator) {
      this.triggerOperator = triggerOperator;
      return this;
    }

    /**
     * Set the workflowConfiguration.
     *
     * @param workflowConfiguration the workflowConfiguration
     * @return the PutModelWorkflowsConfigurationOptions builder
     */
    public Builder workflowConfiguration(WorkflowConfiguration workflowConfiguration) {
      this.autoCreateTasks = workflowConfiguration.autoCreateTasks();
      this.applicableDataTypes = workflowConfiguration.applicableDataTypes();
      this.description = workflowConfiguration.description();
      this.customTags = workflowConfiguration.customTags();
      this.maxAccumulatedUpdates = workflowConfiguration.maxAccumulatedUpdates();
      this.triggerOperator = workflowConfiguration.triggerOperator();
      return this;
    }
  }

  protected PutModelWorkflowsConfigurationOptions() { }

  protected PutModelWorkflowsConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.workflowType,
      "workflowType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.autoCreateTasks,
      "autoCreateTasks cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.applicableDataTypes,
      "applicableDataTypes cannot be null");
    workflowType = builder.workflowType;
    autoCreateTasks = builder.autoCreateTasks;
    applicableDataTypes = builder.applicableDataTypes;
    description = builder.description;
    customTags = builder.customTags;
    maxAccumulatedUpdates = builder.maxAccumulatedUpdates;
    triggerOperator = builder.triggerOperator;
  }

  /**
   * New builder.
   *
   * @return a PutModelWorkflowsConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowType.
   *
   * The workflow confiuration type.
   *
   * @return the workflowType
   */
  public String workflowType() {
    return workflowType;
  }

  /**
   * Gets the autoCreateTasks.
   *
   * A boolean value that specifies whether tasks should be automatically created for this workflow.
   *
   * @return the autoCreateTasks
   */
  public Boolean autoCreateTasks() {
    return autoCreateTasks;
  }

  /**
   * Gets the applicableDataTypes.
   *
   * An object that specifies the data types that the workflow is applicable to.
   *
   * @return the applicableDataTypes
   */
  public Map<String, Object> applicableDataTypes() {
    return applicableDataTypes;
  }

  /**
   * Gets the description.
   *
   * A description of the workflow configuration.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the customTags.
   *
   * A generic object to have custom tags e.g, priority.
   *
   * @return the customTags
   */
  public Map<String, Object> customTags() {
    return customTags;
  }

  /**
   * Gets the maxAccumulatedUpdates.
   *
   * An integer value that specifies the maximum number of updates that can be accumulated for this workflow.
   *
   * @return the maxAccumulatedUpdates
   */
  public Long maxAccumulatedUpdates() {
    return maxAccumulatedUpdates;
  }

  /**
   * Gets the triggerOperator.
   *
   * An object to specify the trigger operator for each record_type and entity_type.
   *
   * @return the triggerOperator
   */
  public WorkflowConfigurationTriggerOperator triggerOperator() {
    return triggerOperator;
  }
}

