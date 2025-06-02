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
 * A collection of statistics for the graph.
 */
public class DataStatistics extends GenericModel {

  @SerializedName("total_count")
  protected Long totalCount;
  @SerializedName("record_count")
  protected Long recordCount;
  @SerializedName("entity_count")
  protected Long entityCount;
  @SerializedName("aggregate_counts")
  protected DataStatisticsAggregateCounts aggregateCounts;

  protected DataStatistics() { }

  /**
   * Gets the totalCount.
   *
   * The total count of vertices in the graph.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the recordCount.
   *
   * The number of records in the graph.
   *
   * @return the recordCount
   */
  public Long getRecordCount() {
    return recordCount;
  }

  /**
   * Gets the entityCount.
   *
   * The number of persisted entities in the graph.
   *
   * @return the entityCount
   */
  public Long getEntityCount() {
    return entityCount;
  }

  /**
   * Gets the aggregateCounts.
   *
   * Supplemental statistics based on various groupings of the data.
   *
   * @return the aggregateCounts
   */
  public DataStatisticsAggregateCounts getAggregateCounts() {
    return aggregateCounts;
  }
}

