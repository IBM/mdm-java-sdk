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
 * The wrapper object for query used for stating  bulk remediation workflow request.
 */
public class StartBulkWorkflowRequestExpression extends GenericModel {

  protected String condition;
  protected String property;
  protected String value;
  @SerializedName("record_type")
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String condition;
    private String property;
    private String value;
    private String recordType;

    private Builder(StartBulkWorkflowRequestExpression startBulkWorkflowRequestExpression) {
      this.condition = startBulkWorkflowRequestExpression.condition;
      this.property = startBulkWorkflowRequestExpression.property;
      this.value = startBulkWorkflowRequestExpression.value;
      this.recordType = startBulkWorkflowRequestExpression.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a StartBulkWorkflowRequestExpression.
     *
     * @return the new StartBulkWorkflowRequestExpression instance
     */
    public StartBulkWorkflowRequestExpression build() {
      return new StartBulkWorkflowRequestExpression(this);
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the StartBulkWorkflowRequestExpression builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the property.
     *
     * @param property the property
     * @return the StartBulkWorkflowRequestExpression builder
     */
    public Builder property(String property) {
      this.property = property;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the StartBulkWorkflowRequestExpression builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the StartBulkWorkflowRequestExpression builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected StartBulkWorkflowRequestExpression() { }

  protected StartBulkWorkflowRequestExpression(Builder builder) {
    condition = builder.condition;
    property = builder.property;
    value = builder.value;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a StartBulkWorkflowRequestExpression builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the condition.
   *
   * @return the condition
   */
  public String condition() {
    return condition;
  }

  /**
   * Gets the property.
   *
   * @return the property
   */
  public String property() {
    return property;
  }

  /**
   * Gets the value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the recordType.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

