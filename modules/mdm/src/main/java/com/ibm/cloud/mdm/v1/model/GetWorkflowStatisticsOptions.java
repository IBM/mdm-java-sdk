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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getWorkflowStatistics options.
 */
public class GetWorkflowStatisticsOptions extends GenericModel {

  protected String workflowType;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowType;
    private String recordType;

    /**
     * Instantiates a new Builder from an existing GetWorkflowStatisticsOptions instance.
     *
     * @param getWorkflowStatisticsOptions the instance to initialize the Builder with
     */
    private Builder(GetWorkflowStatisticsOptions getWorkflowStatisticsOptions) {
      this.workflowType = getWorkflowStatisticsOptions.workflowType;
      this.recordType = getWorkflowStatisticsOptions.recordType;
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
     * @param recordType the recordType
     */
    public Builder(String workflowType, String recordType) {
      this.workflowType = workflowType;
      this.recordType = recordType;
    }

    /**
     * Builds a GetWorkflowStatisticsOptions.
     *
     * @return the new GetWorkflowStatisticsOptions instance
     */
    public GetWorkflowStatisticsOptions build() {
      return new GetWorkflowStatisticsOptions(this);
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the GetWorkflowStatisticsOptions builder
     */
    public Builder workflowType(String workflowType) {
      this.workflowType = workflowType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetWorkflowStatisticsOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected GetWorkflowStatisticsOptions() { }

  protected GetWorkflowStatisticsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workflowType,
      "workflowType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    workflowType = builder.workflowType;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a GetWorkflowStatisticsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowType.
   *
   * The workflow type to search for.
   *
   * @return the workflowType
   */
  public String workflowType() {
    return workflowType;
  }

  /**
   * Gets the recordType.
   *
   * The record type to search for.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

