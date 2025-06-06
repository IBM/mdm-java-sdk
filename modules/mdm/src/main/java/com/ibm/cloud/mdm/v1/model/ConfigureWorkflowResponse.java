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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for workflow configuration.
 */
public class ConfigureWorkflowResponse extends GenericModel {

  @SerializedName("workflow_configuration_id")
  protected String workflowConfigurationId;
  @SerializedName("workflow_type_id")
  protected String workflowTypeId;

  protected ConfigureWorkflowResponse() { }

  /**
   * Gets the workflowConfigurationId.
   *
   * Workflow configuration id created for this instance.
   *
   * @return the workflowConfigurationId
   */
  public String getWorkflowConfigurationId() {
    return workflowConfigurationId;
  }

  /**
   * Gets the workflowTypeId.
   *
   * Workflow type id created for this account.
   *
   * @return the workflowTypeId
   */
  public String getWorkflowTypeId() {
    return workflowTypeId;
  }
}

