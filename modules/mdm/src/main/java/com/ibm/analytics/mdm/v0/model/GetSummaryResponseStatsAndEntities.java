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
 * Statistical information of entities.
 */
public class GetSummaryResponseStatsAndEntities extends GenericModel {

  @SerializedName("entities_count_list")
  protected List<GetSummaryResponseEntities> entitiesCountList;
  @SerializedName("entity_size_stats")
  protected GetSummaryResponseEntitySizeStats entitySizeStats;
  @SerializedName("largest_entities_list")
  protected List<GetSummaryResponseEntities> largestEntitiesList;

  /**
   * Gets the entitiesCountList.
   *
   * Collection of all entities and their corresponding sizes.
   *
   * @return the entitiesCountList
   */
  public List<GetSummaryResponseEntities> getEntitiesCountList() {
    return entitiesCountList;
  }

  /**
   * Gets the entitySizeStats.
   *
   * Entity size statistics.
   *
   * @return the entitySizeStats
   */
  public GetSummaryResponseEntitySizeStats getEntitySizeStats() {
    return entitySizeStats;
  }

  /**
   * Gets the largestEntitiesList.
   *
   * Collection of top large entities as per the value of max_result.
   *
   * @return the largestEntitiesList
   */
  public List<GetSummaryResponseEntities> getLargestEntitiesList() {
    return largestEntitiesList;
  }
}

