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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Detailed statistics for hierarchies.
 */
public class DataHierarchyStatistics extends GenericModel {

  @SerializedName("hierarchy_statistics")
  protected Map<String, DataHierarchyTypeStatistics> hierarchyStatistics;
  protected DataHierarchyStatisticsFirst first;
  protected DataHierarchyStatisticsLast last;
  protected DataHierarchyStatisticsPrevious previous;
  protected DataHierarchyStatisticsNext next;
  protected Long offset;
  protected Long limit;
  @SerializedName("total_count")
  protected Long totalCount;

  /**
   * Gets the hierarchyStatistics.
   *
   * Hierarchy statistics.
   *
   * @return the hierarchyStatistics
   */
  public Map<String, DataHierarchyTypeStatistics> getHierarchyStatistics() {
    return hierarchyStatistics;
  }

  /**
   * Gets the first.
   *
   * A link to the first page.
   *
   * @return the first
   */
  public DataHierarchyStatisticsFirst getFirst() {
    return first;
  }

  /**
   * Gets the last.
   *
   * A link to the last page.
   *
   * @return the last
   */
  public DataHierarchyStatisticsLast getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * A link to the previous page.
   *
   * @return the previous
   */
  public DataHierarchyStatisticsPrevious getPrevious() {
    return previous;
  }

  /**
   * Gets the next.
   *
   * A link to the next page.
   *
   * @return the next
   */
  public DataHierarchyStatisticsNext getNext() {
    return next;
  }

  /**
   * Gets the offset.
   *
   * The number of elements to skip.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of elements to return in a page.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the totalCount.
   *
   * The total count of elements.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

