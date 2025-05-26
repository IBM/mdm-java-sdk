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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object for starting bulk remediation workflow request.
 */
public class StartBulkWorkflowRequestFilter extends GenericModel {

  @SerializedName("data_quality_issues")
  protected List<String> dataQualityIssues;
  protected List<String> values;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> dataQualityIssues;
    private List<String> values;
    private String type;

    private Builder(StartBulkWorkflowRequestFilter startBulkWorkflowRequestFilter) {
      this.dataQualityIssues = startBulkWorkflowRequestFilter.dataQualityIssues;
      this.values = startBulkWorkflowRequestFilter.values;
      this.type = startBulkWorkflowRequestFilter.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a StartBulkWorkflowRequestFilter.
     *
     * @return the new StartBulkWorkflowRequestFilter instance
     */
    public StartBulkWorkflowRequestFilter build() {
      return new StartBulkWorkflowRequestFilter(this);
    }

    /**
     * Adds an dataQualityIssues to dataQualityIssues.
     *
     * @param dataQualityIssues the new dataQualityIssues
     * @return the StartBulkWorkflowRequestFilter builder
     */
    public Builder addDataQualityIssues(String dataQualityIssues) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(dataQualityIssues,
        "dataQualityIssues cannot be null");
      if (this.dataQualityIssues == null) {
        this.dataQualityIssues = new ArrayList<String>();
      }
      this.dataQualityIssues.add(dataQualityIssues);
      return this;
    }

    /**
     * Adds an values to values.
     *
     * @param values the new values
     * @return the StartBulkWorkflowRequestFilter builder
     */
    public Builder addValues(String values) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(values,
        "values cannot be null");
      if (this.values == null) {
        this.values = new ArrayList<String>();
      }
      this.values.add(values);
      return this;
    }

    /**
     * Set the dataQualityIssues.
     * Existing dataQualityIssues will be replaced.
     *
     * @param dataQualityIssues the dataQualityIssues
     * @return the StartBulkWorkflowRequestFilter builder
     */
    public Builder dataQualityIssues(List<String> dataQualityIssues) {
      this.dataQualityIssues = dataQualityIssues;
      return this;
    }

    /**
     * Set the values.
     * Existing values will be replaced.
     *
     * @param values the values
     * @return the StartBulkWorkflowRequestFilter builder
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the StartBulkWorkflowRequestFilter builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected StartBulkWorkflowRequestFilter() { }

  protected StartBulkWorkflowRequestFilter(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    dataQualityIssues = builder.dataQualityIssues;
    values = builder.values;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a StartBulkWorkflowRequestFilter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataQualityIssues.
   *
   * @return the dataQualityIssues
   */
  public List<String> dataQualityIssues() {
    return dataQualityIssues;
  }

  /**
   * Gets the values.
   *
   * @return the values
   */
  public List<String> values() {
    return values;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

