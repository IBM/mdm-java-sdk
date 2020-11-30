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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The modelDeleteFlow options.
 */
public class ModelDeleteFlowOptions extends GenericModel {

  protected String crn;
  protected String flowId;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String flowId;

    private Builder(ModelDeleteFlowOptions modelDeleteFlowOptions) {
      this.crn = modelDeleteFlowOptions.crn;
      this.flowId = modelDeleteFlowOptions.flowId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param flowId the flowId
     */
    public Builder(String crn, String flowId) {
      this.crn = crn;
      this.flowId = flowId;
    }

    /**
     * Builds a ModelDeleteFlowOptions.
     *
     * @return the new ModelDeleteFlowOptions instance
     */
    public ModelDeleteFlowOptions build() {
      return new ModelDeleteFlowOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelDeleteFlowOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the flowId.
     *
     * @param flowId the flowId
     * @return the ModelDeleteFlowOptions builder
     */
    public Builder flowId(String flowId) {
      this.flowId = flowId;
      return this;
    }
  }

  protected ModelDeleteFlowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.flowId,
      "flowId cannot be empty");
    crn = builder.crn;
    flowId = builder.flowId;
  }

  /**
   * New builder.
   *
   * @return a ModelDeleteFlowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

