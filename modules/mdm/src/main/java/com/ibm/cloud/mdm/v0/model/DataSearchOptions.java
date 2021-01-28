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
 * The dataSearch options.
 */
public class DataSearchOptions extends GenericModel {

  /**
   * The type of data to search against. Search type of 'ENTITY' is not supported.
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
  protected SearchQueryRequest query;
  protected List<SearchFilterRequest> filters;
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
    private SearchQueryRequest query;
    private List<SearchFilterRequest> filters;
    private String returnType;
    private Long limit;
    private Long offset;
    private List<String> include;
    private List<String> exclude;

    private Builder(DataSearchOptions dataSearchOptions) {
      this.searchType = dataSearchOptions.searchType;
      this.query = dataSearchOptions.query;
      this.filters = dataSearchOptions.filters;
      this.returnType = dataSearchOptions.returnType;
      this.limit = dataSearchOptions.limit;
      this.offset = dataSearchOptions.offset;
      this.include = dataSearchOptions.include;
      this.exclude = dataSearchOptions.exclude;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataSearchOptions.
     *
     * @return the new DataSearchOptions instance
     */
    public DataSearchOptions build() {
      return new DataSearchOptions(this);
    }

    /**
     * Adds an filters to filters.
     *
     * @param filters the new filters
     * @return the DataSearchOptions builder
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
     * Adds an include to include.
     *
     * @param include the new include
     * @return the DataSearchOptions builder
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
     * @return the DataSearchOptions builder
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
     * @return the DataSearchOptions builder
     */
    public Builder searchType(String searchType) {
      this.searchType = searchType;
      return this;
    }

    /**
     * Set the query.
     *
     * @param query the query
     * @return the DataSearchOptions builder
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
     * @return the DataSearchOptions builder
     */
    public Builder filters(List<SearchFilterRequest> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * Set the returnType.
     *
     * @param returnType the returnType
     * @return the DataSearchOptions builder
     */
    public Builder returnType(String returnType) {
      this.returnType = returnType;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the DataSearchOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the DataSearchOptions builder
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
     * @return the DataSearchOptions builder
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
     * @return the DataSearchOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }

    /**
     * Set the criteriaRequest.
     *
     * @param criteriaRequest the criteriaRequest
     * @return the DataSearchOptions builder
     */
    public Builder criteriaRequest(CriteriaRequest criteriaRequest) {
      this.searchType = criteriaRequest.searchType();
      this.query = criteriaRequest.query();
      this.filters = criteriaRequest.filters();
      return this;
    }
  }

  protected DataSearchOptions(Builder builder) {
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
   * @return a DataSearchOptions builder
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

