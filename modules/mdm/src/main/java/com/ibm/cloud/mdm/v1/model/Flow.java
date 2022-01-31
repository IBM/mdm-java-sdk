/*
 * (C) Copyright IBM Corp. 2022.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for retrieving a flow.
 */
public class Flow extends GenericModel {

  @SerializedName("flow_type")
  protected String flowType;
  protected List<String> rejections;
  protected List<String> approvals;
  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_state")
  protected String flowState;
  protected Boolean active;

  /**
   * Gets the flowType.
   *
   * Type of flow. One of: data_model, algorithm, compare_spec_resources, composite_rules, map_resources or
   * set_resources.
   *
   * @return the flowType
   */
  public String getFlowType() {
    return flowType;
  }

  /**
   * Gets the rejections.
   *
   * Collection of authorized approvers that rejected the flow.
   *
   * @return the rejections
   */
  public List<String> getRejections() {
    return rejections;
  }

  /**
   * Gets the approvals.
   *
   * Collection of authorized approvers that approved the flow.
   *
   * @return the approvals
   */
  public List<String> getApprovals() {
    return approvals;
  }

  /**
   * Gets the flowId.
   *
   * System generated flow identifier.
   *
   * @return the flowId
   */
  public String getFlowId() {
    return flowId;
  }

  /**
   * Gets the flowState.
   *
   * Current state of flow according to its state machine.
   *
   * @return the flowState
   */
  public String getFlowState() {
    return flowState;
  }

  /**
   * Gets the active.
   *
   * True if the flow is active.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }
}

