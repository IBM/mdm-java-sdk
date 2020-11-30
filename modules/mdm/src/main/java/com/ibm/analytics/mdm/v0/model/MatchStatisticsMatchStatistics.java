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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * returns match statistics.
 */
public class MatchStatisticsMatchStatistics extends GenericModel {

  @SerializedName("entity_size_distribution")
  protected List<MatchEntityCountStats> entitySizeDistribution;
  @SerializedName("entity_breakdown")
  protected EntityBreakdown entityBreakdown;
  @SerializedName("largest_entities")
  protected List<MatchEntitySizeStats> largestEntities;
  protected Summary summary;
  protected Status status;

  /**
   * Gets the entitySizeDistribution.
   *
   * entity size distribution.
   *
   * @return the entitySizeDistribution
   */
  public List<MatchEntityCountStats> getEntitySizeDistribution() {
    return entitySizeDistribution;
  }

  /**
   * Gets the entityBreakdown.
   *
   * entity breakdown.
   *
   * @return the entityBreakdown
   */
  public EntityBreakdown getEntityBreakdown() {
    return entityBreakdown;
  }

  /**
   * Gets the largestEntities.
   *
   * largest entities.
   *
   * @return the largestEntities
   */
  public List<MatchEntitySizeStats> getLargestEntities() {
    return largestEntities;
  }

  /**
   * Gets the summary.
   *
   * summary.
   *
   * @return the summary
   */
  public Summary getSummary() {
    return summary;
  }

  /**
   * Gets the status.
   *
   * status.
   *
   * @return the status
   */
  public Status getStatus() {
    return status;
  }
}

