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
 * Response wrapper object for getting entity quality metrics.
 */
public class ReportEntityMetrics extends GenericModel {

  @SerializedName("total_entity_count")
  protected Long totalEntityCount;
  @SerializedName("entity_count_with_potential_match_issues")
  protected Long entityCountWithPotentialMatchIssues;

  /**
   * Gets the totalEntityCount.
   *
   * Total number of entities with derived matching data.
   *
   * @return the totalEntityCount
   */
  public Long getTotalEntityCount() {
    return totalEntityCount;
  }

  /**
   * Gets the entityCountWithPotentialMatchIssues.
   *
   * Number of entities containing atleast one record with potential match issues.
   *
   * @return the entityCountWithPotentialMatchIssues
   */
  public Long getEntityCountWithPotentialMatchIssues() {
    return entityCountWithPotentialMatchIssues;
  }
}

