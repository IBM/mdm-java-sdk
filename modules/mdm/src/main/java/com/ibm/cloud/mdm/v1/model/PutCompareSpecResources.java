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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for overwriting comparison resource.
 */
public class PutCompareSpecResources extends GenericModel {

  @SerializedName("compare_spec_resources")
  protected CompareSpecResource compareSpecResources;
  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_state")
  protected String flowState;

  /**
   * Gets the compareSpecResources.
   *
   * A single comparison resource used to customize comparison logic of a matching algorithm.
   *
   * @return the compareSpecResources
   */
  public CompareSpecResource getCompareSpecResources() {
    return compareSpecResources;
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
}

