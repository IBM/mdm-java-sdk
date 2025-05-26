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
 * The startBulkMatchingRemediationWorkflows options.
 */
public class StartBulkMatchingRemediationWorkflowsOptions extends GenericModel {

  protected Long limit;
  protected StartBulkWorkflowRequestSearchCriteria searchCriteria;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private StartBulkWorkflowRequestSearchCriteria searchCriteria;

    private Builder(StartBulkMatchingRemediationWorkflowsOptions startBulkMatchingRemediationWorkflowsOptions) {
      this.limit = startBulkMatchingRemediationWorkflowsOptions.limit;
      this.searchCriteria = startBulkMatchingRemediationWorkflowsOptions.searchCriteria;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param limit the limit
     * @param searchCriteria the searchCriteria
     */
    public Builder(Long limit, StartBulkWorkflowRequestSearchCriteria searchCriteria) {
      this.limit = limit;
      this.searchCriteria = searchCriteria;
    }

    /**
     * Builds a StartBulkMatchingRemediationWorkflowsOptions.
     *
     * @return the new StartBulkMatchingRemediationWorkflowsOptions instance
     */
    public StartBulkMatchingRemediationWorkflowsOptions build() {
      return new StartBulkMatchingRemediationWorkflowsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the StartBulkMatchingRemediationWorkflowsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the searchCriteria.
     *
     * @param searchCriteria the searchCriteria
     * @return the StartBulkMatchingRemediationWorkflowsOptions builder
     */
    public Builder searchCriteria(StartBulkWorkflowRequestSearchCriteria searchCriteria) {
      this.searchCriteria = searchCriteria;
      return this;
    }
  }

  protected StartBulkMatchingRemediationWorkflowsOptions() { }

  protected StartBulkMatchingRemediationWorkflowsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.limit,
      "limit cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.searchCriteria,
      "searchCriteria cannot be null");
    limit = builder.limit;
    searchCriteria = builder.searchCriteria;
  }

  /**
   * New builder.
   *
   * @return a StartBulkMatchingRemediationWorkflowsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the searchCriteria.
   *
   * The wrapper object for search criteria used for stating  bulk remediation workflow request.
   *
   * @return the searchCriteria
   */
  public StartBulkWorkflowRequestSearchCriteria searchCriteria() {
    return searchCriteria;
  }
}

