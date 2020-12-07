/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for overwriting matching algorithm.
 */
public class PutAlgorithmResponse extends GenericModel {

  @SerializedName("flow_id")
  protected String flowId;
  @SerializedName("flow_state")
  protected String flowState;
  protected PutAlgorithmResponseAlgorithm algorithm;

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
   * Gets the algorithm.
   *
   * The matching algorithm for a given record type (i.e. person).
   *
   * @return the algorithm
   */
  public PutAlgorithmResponseAlgorithm getAlgorithm() {
    return algorithm;
  }
}
