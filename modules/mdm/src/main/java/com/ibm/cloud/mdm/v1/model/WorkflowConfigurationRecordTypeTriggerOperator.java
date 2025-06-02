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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WorkflowConfigurationRecordTypeTriggerOperator.
 */
public class WorkflowConfigurationRecordTypeTriggerOperator extends GenericModel {

  protected String name;
  @SerializedName("entity_types")
  protected Map<String, WorkflowConfigurationRecordEntityTypeOperator> entityTypes;
  @SerializedName("excluded_sources")
  protected List<String> excludedSources;
  @SerializedName("included_sources")
  protected List<String> includedSources;
  @SerializedName("workflow_configurations")
  protected WorkflowConfigurationWorkflowConfigurations workflowConfigurations;
  @SerializedName("max_tasks")
  protected Float maxTasks;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Map<String, WorkflowConfigurationRecordEntityTypeOperator> entityTypes;
    private List<String> excludedSources;
    private List<String> includedSources;
    private WorkflowConfigurationWorkflowConfigurations workflowConfigurations;
    private Float maxTasks;
    private String status;

    /**
     * Instantiates a new Builder from an existing WorkflowConfigurationRecordTypeTriggerOperator instance.
     *
     * @param workflowConfigurationRecordTypeTriggerOperator the instance to initialize the Builder with
     */
    private Builder(WorkflowConfigurationRecordTypeTriggerOperator workflowConfigurationRecordTypeTriggerOperator) {
      this.name = workflowConfigurationRecordTypeTriggerOperator.name;
      this.entityTypes = workflowConfigurationRecordTypeTriggerOperator.entityTypes;
      this.excludedSources = workflowConfigurationRecordTypeTriggerOperator.excludedSources;
      this.includedSources = workflowConfigurationRecordTypeTriggerOperator.includedSources;
      this.workflowConfigurations = workflowConfigurationRecordTypeTriggerOperator.workflowConfigurations;
      this.maxTasks = workflowConfigurationRecordTypeTriggerOperator.maxTasks;
      this.status = workflowConfigurationRecordTypeTriggerOperator.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkflowConfigurationRecordTypeTriggerOperator.
     *
     * @return the new WorkflowConfigurationRecordTypeTriggerOperator instance
     */
    public WorkflowConfigurationRecordTypeTriggerOperator build() {
      return new WorkflowConfigurationRecordTypeTriggerOperator(this);
    }

    /**
     * Adds a new element to excludedSources.
     *
     * @param excludedSources the new element to be added
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder addExcludedSources(String excludedSources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(excludedSources,
        "excludedSources cannot be null");
      if (this.excludedSources == null) {
        this.excludedSources = new ArrayList<String>();
      }
      this.excludedSources.add(excludedSources);
      return this;
    }

    /**
     * Adds a new element to includedSources.
     *
     * @param includedSources the new element to be added
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder addIncludedSources(String includedSources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(includedSources,
        "includedSources cannot be null");
      if (this.includedSources == null) {
        this.includedSources = new ArrayList<String>();
      }
      this.includedSources.add(includedSources);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder entityTypes(Map<String, WorkflowConfigurationRecordEntityTypeOperator> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the excludedSources.
     * Existing excludedSources will be replaced.
     *
     * @param excludedSources the excludedSources
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder excludedSources(List<String> excludedSources) {
      this.excludedSources = excludedSources;
      return this;
    }

    /**
     * Set the includedSources.
     * Existing includedSources will be replaced.
     *
     * @param includedSources the includedSources
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder includedSources(List<String> includedSources) {
      this.includedSources = includedSources;
      return this;
    }

    /**
     * Set the workflowConfigurations.
     *
     * @param workflowConfigurations the workflowConfigurations
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder workflowConfigurations(WorkflowConfigurationWorkflowConfigurations workflowConfigurations) {
      this.workflowConfigurations = workflowConfigurations;
      return this;
    }

    /**
     * Set the maxTasks.
     *
     * @param maxTasks the maxTasks
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder maxTasks(Float maxTasks) {
      this.maxTasks = maxTasks;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the WorkflowConfigurationRecordTypeTriggerOperator builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected WorkflowConfigurationRecordTypeTriggerOperator() { }

  protected WorkflowConfigurationRecordTypeTriggerOperator(Builder builder) {
    name = builder.name;
    entityTypes = builder.entityTypes;
    excludedSources = builder.excludedSources;
    includedSources = builder.includedSources;
    workflowConfigurations = builder.workflowConfigurations;
    maxTasks = builder.maxTasks;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a WorkflowConfigurationRecordTypeTriggerOperator builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the entityTypes.
   *
   * Entity types keyed by lower snake case names (e.g. person_entity).
   *
   * @return the entityTypes
   */
  public Map<String, WorkflowConfigurationRecordEntityTypeOperator> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the excludedSources.
   *
   * @return the excludedSources
   */
  public List<String> excludedSources() {
    return excludedSources;
  }

  /**
   * Gets the includedSources.
   *
   * @return the includedSources
   */
  public List<String> includedSources() {
    return includedSources;
  }

  /**
   * Gets the workflowConfigurations.
   *
   * @return the workflowConfigurations
   */
  public WorkflowConfigurationWorkflowConfigurations workflowConfigurations() {
    return workflowConfigurations;
  }

  /**
   * Gets the maxTasks.
   *
   * Max number of tasks that can be created for a given record type.
   *
   * @return the maxTasks
   */
  public Float maxTasks() {
    return maxTasks;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

