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
 * Response wrapper with the details of the snapshot comparison with current configuration.
 */
public class SnapshotCompareResponse extends GenericModel {

  @SerializedName("data_model")
  protected Map<String, Object> dataModel;
  @SerializedName("match_settings")
  protected Map<String, Object> matchSettings;
  @SerializedName("composite_rules")
  protected Map<String, Object> compositeRules;
  @SerializedName("snapshot_summary")
  protected Map<String, Object> snapshotSummary;
  @SerializedName("compatibility_result")
  protected Map<String, Object> compatibilityResult;

  /**
   * Gets the dataModel.
   *
   * @return the dataModel
   */
  public Map<String, Object> getDataModel() {
    return dataModel;
  }

  /**
   * Gets the matchSettings.
   *
   * Match Settings of configuration.
   *
   * @return the matchSettings
   */
  public Map<String, Object> getMatchSettings() {
    return matchSettings;
  }

  /**
   * Gets the compositeRules.
   *
   * Composite rules of configuration.
   *
   * @return the compositeRules
   */
  public Map<String, Object> getCompositeRules() {
    return compositeRules;
  }

  /**
   * Gets the snapshotSummary.
   *
   * Snapshot Summary of incoming snapshot.
   *
   * @return the snapshotSummary
   */
  public Map<String, Object> getSnapshotSummary() {
    return snapshotSummary;
  }

  /**
   * Gets the compatibilityResult.
   *
   * Snapshot compatibility of data_model and algorithms.
   *
   * @return the compatibilityResult
   */
  public Map<String, Object> getCompatibilityResult() {
    return compatibilityResult;
  }
}

