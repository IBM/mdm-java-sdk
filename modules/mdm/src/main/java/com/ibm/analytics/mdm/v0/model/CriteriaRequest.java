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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A set of criteria for a search.
 */
public class CriteriaRequest extends GenericModel {

  /**
   * The type of data to search against. Search type of 'ENTITY' is not supported.
   */
  public interface SearchType {
    /** record. */
    String RECORD = "record";
  }

  @SerializedName("search_type")
  protected String searchType;
  protected SearchQueryRequest query;
  protected List<SearchFilterRequest> filters;

  /**
   * Builder.
   */
  public static class Builder {
    private String searchType;
    private SearchQueryRequest query;
    private List<SearchFilterRequest> filters;

    private Builder(CriteriaRequest criteriaRequest) {
      this.searchType = criteriaRequest.searchType;
      this.query = criteriaRequest.query;
      this.filters = criteriaRequest.filters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CriteriaRequest.
     *
     * @return the new CriteriaRequest instance
     */
    public CriteriaRequest build() {
      return new CriteriaRequest(this);
    }

    /**
     * Adds an filters to filters.
     *
     * @param filters the new filters
     * @return the CriteriaRequest builder
     */
    public Builder addFilters(SearchFilterRequest filters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filters,
        "filters cannot be null");
      if (this.filters == null) {
        this.filters = new ArrayList<SearchFilterRequest>();
      }
      this.filters.add(filters);
      return this;
    }

    /**
     * Set the searchType.
     *
     * @param searchType the searchType
     * @return the CriteriaRequest builder
     */
    public Builder searchType(String searchType) {
      this.searchType = searchType;
      return this;
    }

    /**
     * Set the query.
     *
     * @param query the query
     * @return the CriteriaRequest builder
     */
    public Builder query(SearchQueryRequest query) {
      this.query = query;
      return this;
    }

    /**
     * Set the filters.
     * Existing filters will be replaced.
     *
     * @param filters the filters
     * @return the CriteriaRequest builder
     */
    public Builder filters(List<SearchFilterRequest> filters) {
      this.filters = filters;
      return this;
    }
  }

  protected CriteriaRequest(Builder builder) {
    searchType = builder.searchType;
    query = builder.query;
    filters = builder.filters;
  }

  /**
   * New builder.
   *
   * @return a CriteriaRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the searchType.
   *
   * The type of data to search against. Search type of 'ENTITY' is not supported.
   *
   * @return the searchType
   */
  public String searchType() {
    return searchType;
  }

  /**
   * Gets the query.
   *
   * A search query.
   *
   * @return the query
   */
  public SearchQueryRequest query() {
    return query;
  }

  /**
   * Gets the filters.
   *
   * The search filters to apply to the results of the query.
   *
   * @return the filters
   */
  public List<SearchFilterRequest> filters() {
    return filters;
  }
}

