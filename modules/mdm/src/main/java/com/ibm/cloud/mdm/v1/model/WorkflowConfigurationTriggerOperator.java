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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An object to specify the trigger operator for each record_type and entity_type.
 */
public class WorkflowConfigurationTriggerOperator extends GenericModel {

  @SerializedName("hierarchy_types")
  protected Map<String, Object> hierarchyTypes;
  @SerializedName("entity_types")
  protected Map<String, Object> entityTypes;
  @SerializedName("record_types")
  protected Map<String, WorkflowConfigurationRecordTypeTriggerOperator> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> hierarchyTypes;
    private Map<String, Object> entityTypes;
    private Map<String, WorkflowConfigurationRecordTypeTriggerOperator> recordTypes;

    private Builder(WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperator) {
      this.hierarchyTypes = workflowConfigurationTriggerOperator.hierarchyTypes;
      this.entityTypes = workflowConfigurationTriggerOperator.entityTypes;
      this.recordTypes = workflowConfigurationTriggerOperator.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkflowConfigurationTriggerOperator.
     *
     * @return the new WorkflowConfigurationTriggerOperator instance
     */
    public WorkflowConfigurationTriggerOperator build() {
      return new WorkflowConfigurationTriggerOperator(this);
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the WorkflowConfigurationTriggerOperator builder
     */
    public Builder hierarchyTypes(Map<String, Object> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the WorkflowConfigurationTriggerOperator builder
     */
    public Builder entityTypes(Map<String, Object> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the WorkflowConfigurationTriggerOperator builder
     */
    public Builder recordTypes(Map<String, WorkflowConfigurationRecordTypeTriggerOperator> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected WorkflowConfigurationTriggerOperator() { }

  protected WorkflowConfigurationTriggerOperator(Builder builder) {
    hierarchyTypes = builder.hierarchyTypes;
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a WorkflowConfigurationTriggerOperator builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyTypes.
   *
   * @return the hierarchyTypes
   */
  public Map<String, Object> hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * @return the entityTypes
   */
  public Map<String, Object> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Record types keyed by lower snake case names (e.g. person, organization).
   *
   * @return the recordTypes
   */
  public Map<String, WorkflowConfigurationRecordTypeTriggerOperator> recordTypes() {
    return recordTypes;
  }
}

