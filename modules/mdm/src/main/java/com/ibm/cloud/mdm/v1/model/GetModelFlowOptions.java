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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getModelFlow options.
 */
public class GetModelFlowOptions extends GenericModel {

  protected String flowId;

  /**
   * Builder.
   */
  public static class Builder {
    private String flowId;

    private Builder(GetModelFlowOptions getModelFlowOptions) {
      this.flowId = getModelFlowOptions.flowId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param flowId the flowId
     */
    public Builder(String flowId) {
      this.flowId = flowId;
    }

    /**
     * Builds a GetModelFlowOptions.
     *
     * @return the new GetModelFlowOptions instance
     */
    public GetModelFlowOptions build() {
      return new GetModelFlowOptions(this);
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the GetModelFlowOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }
  }

  protected GetModelFlowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.flowId,
      "flowId cannot be empty");
    flowId = builder.flowId;
  }

  /**
   * New builder.
   *
   * @return a GetModelFlowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the flowId.
   *
   * The unique identifier of a workflow as assigned by the system.
   *
   * @return the flowId
   */
  public String flowId() {
    return flowId;
  }
}

