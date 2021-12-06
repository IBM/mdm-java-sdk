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
package com.ibm.cloud.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The searchData options.
 */
public class SearchDataOptions extends GenericModel {

  /**
   * The type of data to search against.
   */
  public interface SearchType {
    /** record. */
    String RECORD = "record";
  }

  /**
   * The type of results to return from the search.
   */
  public interface ReturnType {
    /** results. */
    String RESULTS = "results";
    /** results_as_entities. */
    String RESULTS_AS_ENTITIES = "results_as_entities";
  }

  protected String searchType;
  protected DataSearchCriteriaQuery query;
  protected List<SearchFilter> filters;
  protected String returnType;
  protected Long limit;
  protected Long offset;
  protected List<String> include;
  protected List<String> exclude;

  /**
   * Builder.
   */
  public static class Builder {
    private String searchType;
    private DataSearchCriteriaQuery query;
    private List<SearchFilter> filters;
    private String returnType;
    private Long limit;
    private Long offset;
    private List<String> include;
    private List<String> exclude;

    private Builder(SearchDataOptions searchDataOptions) {
      this.searchType = searchDataOptions.searchType;
      this.query = searchDataOptions.query;
      this.filters = searchDataOptions.filters;
      this.returnType = searchDataOptions.returnType;
      this.limit = searchDataOptions.limit;
      this.offset = searchDataOptions.offset;
      this.include = searchDataOptions.include;
      this.exclude = searchDataOptions.exclude;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SearchDataOptions.
     *
     * @return the new SearchDataOptions instance
     */
    public SearchDataOptions build() {
      return new SearchDataOptions(this);
    }

    /**
     * Adds an filters to filters.
     *
     * @param filters the new filters
     * @return the SearchDataOptions builder
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
     * Adds an include to include.
     *
     * @param include the new include
     * @return the SearchDataOptions builder
     */
    public Builder addInclude(String include) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(include,
        "include cannot be null");
      if (this.include == null) {
        this.include = new ArrayList<String>();
      }
      this.include.add(include);
      return this;
    }

    /**
     * Adds an exclude to exclude.
     *
     * @param exclude the new exclude
     * @return the SearchDataOptions builder
     */
    public Builder addExclude(String exclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(exclude,
        "exclude cannot be null");
      if (this.exclude == null) {
        this.exclude = new ArrayList<String>();
      }
      this.exclude.add(exclude);
      return this;
    }

    /**
     * Set the searchType.
     *
     * @param searchType the searchType
     * @return the SearchDataOptions builder
     */
    public Builder searchType(String searchType) {
      this.searchType = searchType;
      return this;
    }

    /**
     * Set the query.
     *
     * @param query the query
     * @return the SearchDataOptions builder
     */
    public Builder query(DataSearchCriteriaQuery query) {
      this.query = query;
      return this;
    }

    /**
     * Set the filters.
     * Existing filters will be replaced.
     *
     * @param filters the filters
     * @return the SearchDataOptions builder
     */
    public Builder filters(List<SearchFilter> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * Set the returnType.
     *
     * @param returnType the returnType
     * @return the SearchDataOptions builder
     */
    public Builder returnType(String returnType) {
      this.returnType = returnType;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the SearchDataOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the SearchDataOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the SearchDataOptions builder
     */
    public Builder include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set the exclude.
     * Existing exclude will be replaced.
     *
     * @param exclude the exclude
     * @return the SearchDataOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }
  }

  protected SearchDataOptions(Builder builder) {
    searchType = builder.searchType;
    query = builder.query;
    filters = builder.filters;
    returnType = builder.returnType;
    limit = builder.limit;
    offset = builder.offset;
    include = builder.include;
    exclude = builder.exclude;
  }

  /**
   * New builder.
   *
   * @return a SearchDataOptions builder
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
  public DataSearchCriteriaQuery query() {
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

  /**
   * Gets the returnType.
   *
   * The type of results to return from the search.
   *
   * @return the returnType
   */
  public String returnType() {
    return returnType;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of elements to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of elements to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the include.
   *
   * Record attributes from the data model to include in the results.
   *
   * @return the include
   */
  public List<String> include() {
    return include;
  }

  /**
   * Gets the exclude.
   *
   * Record attributes from the data model to exclude from the results.
   *
   * @return the exclude
   */
  public List<String> exclude() {
    return exclude;
  }
}

