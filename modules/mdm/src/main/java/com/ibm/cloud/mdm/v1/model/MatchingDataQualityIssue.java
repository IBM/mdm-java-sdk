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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object for single data quality issue.
 */
public class MatchingDataQualityIssue extends GenericModel {

  @SerializedName("entity_type")
  protected String entityType;
  protected List<DataQualityIssueEntities> entities;
  @SerializedName("resolution_prediction")
  protected ResolutionPrediction resolutionPrediction;
  @SerializedName("created_at")
  protected String createdAt;
  protected String id;
  protected String type;

  protected MatchingDataQualityIssue() { }

  /**
   * Gets the entityType.
   *
   * @return the entityType
   */
  public String getEntityType() {
    return entityType;
  }

  /**
   * Gets the entities.
   *
   * @return the entities
   */
  public List<DataQualityIssueEntities> getEntities() {
    return entities;
  }

  /**
   * Gets the resolutionPrediction.
   *
   * The wrapper object for remediation workflow resolution predictions.
   *
   * @return the resolutionPrediction
   */
  public ResolutionPrediction getResolutionPrediction() {
    return resolutionPrediction;
  }

  /**
   * Gets the createdAt.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

