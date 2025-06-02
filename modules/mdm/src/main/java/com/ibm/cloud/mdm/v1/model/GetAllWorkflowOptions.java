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
 * The getAllWorkflow options.
 */
public class GetAllWorkflowOptions extends GenericModel {

  protected String workflowType;
  protected String recordNumber;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String workflowType;
    private String recordNumber;
    private Long offset;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing GetAllWorkflowOptions instance.
     *
     * @param getAllWorkflowOptions the instance to initialize the Builder with
     */
    private Builder(GetAllWorkflowOptions getAllWorkflowOptions) {
      this.workflowType = getAllWorkflowOptions.workflowType;
      this.recordNumber = getAllWorkflowOptions.recordNumber;
      this.offset = getAllWorkflowOptions.offset;
      this.limit = getAllWorkflowOptions.limit;
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
     */
    public Builder(String workflowType) {
      this.workflowType = workflowType;
    }

    /**
     * Builds a GetAllWorkflowOptions.
     *
     * @return the new GetAllWorkflowOptions instance
     */
    public GetAllWorkflowOptions build() {
      return new GetAllWorkflowOptions(this);
    }

    /**
     * Set the workflowType.
     *
     * @param workflowType the workflowType
     * @return the GetAllWorkflowOptions builder
     */
    public Builder workflowType(String workflowType) {
      this.workflowType = workflowType;
      return this;
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the GetAllWorkflowOptions builder
     */
    public Builder recordNumber(String recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetAllWorkflowOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetAllWorkflowOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetAllWorkflowOptions() { }

  protected GetAllWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.workflowType,
      "workflowType cannot be null");
    workflowType = builder.workflowType;
    recordNumber = builder.recordNumber;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetAllWorkflowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the workflowType.
   *
   * The workflow type to return.
   *
   * @return the workflowType
   */
  public String workflowType() {
    return workflowType;
  }

  /**
   * Gets the recordNumber.
   *
   * Return workflow node associated with record number.
   *
   * @return the recordNumber
   */
  public String recordNumber() {
    return recordNumber;
  }

  /**
   * Gets the offset.
   *
   * The number of workflows to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of workflow nodes to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

