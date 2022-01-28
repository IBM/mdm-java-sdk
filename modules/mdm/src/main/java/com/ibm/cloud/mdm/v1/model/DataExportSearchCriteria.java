/*
 * (C) Copyright IBM Corp. 2022.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The search criteria which identifies the exported data.
 */
public class DataExportSearchCriteria extends GenericModel {

  /**
   * The type of data to search against.
   */
  public interface SearchType {
    /** record. */
    String RECORD = "record";
  }

  @SerializedName("search_type")
  protected String searchType;
  protected DataExportSearchCriteriaQuery query;
  protected List<SearchFilter> filters;

  /**
   * Gets the searchType.
   *
   * The type of data to search against.
   *
   * @return the searchType
   */
  public String getSearchType() {
    return searchType;
  }

  /**
   * Gets the query.
   *
   * The search query to run.
   *
   * @return the query
   */
  public DataExportSearchCriteriaQuery getQuery() {
    return query;
  }

  /**
   * Gets the filters.
   *
   * The search filters to apply to the search to narrow down results.
   *
   * @return the filters
   */
  public List<SearchFilter> getFilters() {
    return filters;
  }
}

