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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for summary of derived matching data.
 */
public class GetSummary extends GenericModel {

  @SerializedName("total_records")
  protected Long totalRecords;
  @SerializedName("total_entities")
  protected Long totalEntities;
  @SerializedName("stats_and_entities")
  protected Map<String, Object> statsAndEntities;
  @SerializedName("unique_source_count")
  protected Long uniqueSourceCount;

  /**
   * Gets the totalRecords.
   *
   * Total number of records with derived matching data.
   *
   * @return the totalRecords
   */
  public Long getTotalRecords() {
    return totalRecords;
  }

  /**
   * Gets the totalEntities.
   *
   * Total number of entities with derived matching data.
   *
   * @return the totalEntities
   */
  public Long getTotalEntities() {
    return totalEntities;
  }

  /**
   * Gets the statsAndEntities.
   *
   * Statistical information of entities.
   *
   * @return the statsAndEntities
   */
  public Map<String, Object> getStatsAndEntities() {
    return statsAndEntities;
  }

  /**
   * Gets the uniqueSourceCount.
   *
   * The number of source systems in the derived matching data.
   *
   * @return the uniqueSourceCount
   */
  public Long getUniqueSourceCount() {
    return uniqueSourceCount;
  }
}

