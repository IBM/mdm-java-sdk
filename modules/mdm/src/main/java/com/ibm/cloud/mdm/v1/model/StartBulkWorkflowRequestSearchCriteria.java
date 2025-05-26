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
 * The wrapper object for search criteria used for stating  bulk remediation workflow request.
 */
public class StartBulkWorkflowRequestSearchCriteria extends GenericModel {

  protected StartBulkWorkflowRequestQuery query;
  protected List<StartBulkWorkflowRequestFilter> filters;
  @SerializedName("search_type")
  protected String searchType;

  /**
   * Builder.
   */
  public static class Builder {
    private StartBulkWorkflowRequestQuery query;
    private List<StartBulkWorkflowRequestFilter> filters;
    private String searchType;

    private Builder(StartBulkWorkflowRequestSearchCriteria startBulkWorkflowRequestSearchCriteria) {
      this.query = startBulkWorkflowRequestSearchCriteria.query;
      this.filters = startBulkWorkflowRequestSearchCriteria.filters;
      this.searchType = startBulkWorkflowRequestSearchCriteria.searchType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param query the query
     * @param filters the filters
     * @param searchType the searchType
     */
    public Builder(StartBulkWorkflowRequestQuery query, List<StartBulkWorkflowRequestFilter> filters, String searchType) {
      this.query = query;
      this.filters = filters;
      this.searchType = searchType;
    }

    /**
     * Builds a StartBulkWorkflowRequestSearchCriteria.
     *
     * @return the new StartBulkWorkflowRequestSearchCriteria instance
     */
    public StartBulkWorkflowRequestSearchCriteria build() {
      return new StartBulkWorkflowRequestSearchCriteria(this);
    }

    /**
     * Adds an filters to filters.
     *
     * @param filters the new filters
     * @return the StartBulkWorkflowRequestSearchCriteria builder
     */
    public Builder addFilters(StartBulkWorkflowRequestFilter filters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filters,
        "filters cannot be null");
      if (this.filters == null) {
        this.filters = new ArrayList<StartBulkWorkflowRequestFilter>();
      }
      this.filters.add(filters);
      return this;
    }

    /**
     * Set the query.
     *
     * @param query the query
     * @return the StartBulkWorkflowRequestSearchCriteria builder
     */
    public Builder query(StartBulkWorkflowRequestQuery query) {
      this.query = query;
      return this;
    }

    /**
     * Set the filters.
     * Existing filters will be replaced.
     *
     * @param filters the filters
     * @return the StartBulkWorkflowRequestSearchCriteria builder
     */
    public Builder filters(List<StartBulkWorkflowRequestFilter> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * Set the searchType.
     *
     * @param searchType the searchType
     * @return the StartBulkWorkflowRequestSearchCriteria builder
     */
    public Builder searchType(String searchType) {
      this.searchType = searchType;
      return this;
    }
  }

  protected StartBulkWorkflowRequestSearchCriteria() { }

  protected StartBulkWorkflowRequestSearchCriteria(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.query,
      "query cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.filters,
      "filters cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.searchType,
      "searchType cannot be null");
    query = builder.query;
    filters = builder.filters;
    searchType = builder.searchType;
  }

  /**
   * New builder.
   *
   * @return a StartBulkWorkflowRequestSearchCriteria builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the query.
   *
   * The wrapper object for query used for stating  bulk remediation workflow request.
   *
   * @return the query
   */
  public StartBulkWorkflowRequestQuery query() {
    return query;
  }

  /**
   * Gets the filters.
   *
   * @return the filters
   */
  public List<StartBulkWorkflowRequestFilter> filters() {
    return filters;
  }

  /**
   * Gets the searchType.
   *
   * @return the searchType
   */
  public String searchType() {
    return searchType;
  }
}

