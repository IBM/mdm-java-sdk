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
 * WorkflowConfigurationRecordEntityTypeOperator.
 */
public class WorkflowConfigurationRecordEntityTypeOperator extends GenericModel {

  protected Map<String, Object> triggers;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> triggers;

    /**
     * Instantiates a new Builder from an existing WorkflowConfigurationRecordEntityTypeOperator instance.
     *
     * @param workflowConfigurationRecordEntityTypeOperator the instance to initialize the Builder with
     */
    private Builder(WorkflowConfigurationRecordEntityTypeOperator workflowConfigurationRecordEntityTypeOperator) {
      this.triggers = workflowConfigurationRecordEntityTypeOperator.triggers;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a WorkflowConfigurationRecordEntityTypeOperator.
     *
     * @return the new WorkflowConfigurationRecordEntityTypeOperator instance
     */
    public WorkflowConfigurationRecordEntityTypeOperator build() {
      return new WorkflowConfigurationRecordEntityTypeOperator(this);
    }

    /**
     * Set the triggers.
     *
     * @param triggers the triggers
     * @return the WorkflowConfigurationRecordEntityTypeOperator builder
     */
    public Builder triggers(Map<String, Object> triggers) {
      this.triggers = triggers;
      return this;
    }
  }

  protected WorkflowConfigurationRecordEntityTypeOperator() { }

  protected WorkflowConfigurationRecordEntityTypeOperator(Builder builder) {
    triggers = builder.triggers;
  }

  /**
   * New builder.
   *
   * @return a WorkflowConfigurationRecordEntityTypeOperator builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the triggers.
   *
   * @return the triggers
   */
  public Map<String, Object> triggers() {
    return triggers;
  }
}

