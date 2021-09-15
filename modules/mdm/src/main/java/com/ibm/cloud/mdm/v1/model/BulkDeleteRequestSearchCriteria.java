/*
 * (C) Copyright IBM Corp. 2021.
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
 * Search criteria for data to be deleted. Required on delete by search.
 */
public class BulkDeleteRequestSearchCriteria extends GenericModel {

  /**
   * The type of data to search against.
   */
  public interface SearchType {
    /** record. */
    String RECORD = "record";
  }

  @SerializedName("search_type")
  protected String searchType;
  protected BulkDeleteRequestSearchCriteriaQuery query;
  protected List<SearchFilter> filters;

  /**
   * Builder.
   */
  public static class Builder {
    private String searchType;
    private BulkDeleteRequestSearchCriteriaQuery query;
    private List<SearchFilter> filters;

    private Builder(BulkDeleteRequestSearchCriteria bulkDeleteRequestSearchCriteria) {
      this.searchType = bulkDeleteRequestSearchCriteria.searchType;
      this.query = bulkDeleteRequestSearchCriteria.query;
      this.filters = bulkDeleteRequestSearchCriteria.filters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BulkDeleteRequestSearchCriteria.
     *
     * @return the new BulkDeleteRequestSearchCriteria instance
     */
    public BulkDeleteRequestSearchCriteria build() {
      return new BulkDeleteRequestSearchCriteria(this);
    }

    /**
     * Adds an filters to filters.
     *
     * @param filters the new filters
     * @return the BulkDeleteRequestSearchCriteria builder
     */
    public Builder addFilters(SearchFilter filters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filters,
        "filters cannot be null");
      if (this.filters == null) {
        this.filters = new ArrayList<SearchFilter>();
      }
      this.filters.add(filters);
      return this;
    }

    /**
     * Set the searchType.
     *
     * @param searchType the searchType
     * @return the BulkDeleteRequestSearchCriteria builder
     */
    public Builder searchType(String searchType) {
      this.searchType = searchType;
      return this;
    }

    /**
     * Set the query.
     *
     * @param query the query
     * @return the BulkDeleteRequestSearchCriteria builder
     */
    public Builder query(BulkDeleteRequestSearchCriteriaQuery query) {
      this.query = query;
      return this;
    }

    /**
     * Set the filters.
     * Existing filters will be replaced.
     *
     * @param filters the filters
     * @return the BulkDeleteRequestSearchCriteria builder
     */
    public Builder filters(List<SearchFilter> filters) {
      this.filters = filters;
      return this;
    }
  }

  protected BulkDeleteRequestSearchCriteria(Builder builder) {
    searchType = builder.searchType;
    query = builder.query;
    filters = builder.filters;
  }

  /**
   * New builder.
   *
   * @return a BulkDeleteRequestSearchCriteria builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the searchType.
   *
   * The type of data to search against.
   *
   * @return the searchType
   */
  public String searchType() {
    return searchType;
  }

  /**
   * Gets the query.
   *
   * The search query to run.
   *
   * @return the query
   */
  public BulkDeleteRequestSearchCriteriaQuery query() {
    return query;
  }

  /**
   * Gets the filters.
   *
   * The search filters to apply to the search to narrow down results.
   *
   * @return the filters
   */
  public List<SearchFilter> filters() {
    return filters;
  }
}

