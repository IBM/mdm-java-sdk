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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper with the details of the snapshot.
 */
public class SnapshotDetailedResponse extends GenericModel {

  protected Map<String, Object> algorithms;
  @SerializedName("compare_spec_resources")
  protected Map<String, Object> compareSpecResources;
  @SerializedName("data_model")
  protected Map<String, Object> dataModel;
  @SerializedName("map_resources")
  protected Map<String, Object> mapResources;
  @SerializedName("set_resources")
  protected Map<String, Object> setResources;
  @SerializedName("composite_rules")
  protected Map<String, Object> compositeRules;
  @SerializedName("snapshot_summary")
  protected Map<String, Object> snapshotSummary;
  @SerializedName("match_settings")
  protected Map<String, Object> matchSettings;
  @SerializedName("mapping_patterns")
  protected List<Object> mappingPatterns;

  /**
   * Gets the algorithms.
   *
   * Collection of matching algorithms for different record types e.g. person, organization.
   *
   * @return the algorithms
   */
  public Map<String, Object> getAlgorithms() {
    return algorithms;
  }

  /**
   * Gets the compareSpecResources.
   *
   * Collection of various comparison resources used to customize comparison logic of a matching algorithm.
   *
   * @return the compareSpecResources
   */
  public Map<String, Object> getCompareSpecResources() {
    return compareSpecResources;
  }

  /**
   * Gets the dataModel.
   *
   * @return the dataModel
   */
  public Map<String, Object> getDataModel() {
    return dataModel;
  }

  /**
   * Gets the mapResources.
   *
   * Collection of various map resources used in matching algorithm, like for handling equivalent values. Map resource
   * key must be lower snake case (i.e. person_map_name_nickname).
   *
   * @return the mapResources
   */
  public Map<String, Object> getMapResources() {
    return mapResources;
  }

  /**
   * Gets the setResources.
   *
   * Collection of various set resources used in matching algorithm, like for handling anonymous values. Set resource
   * key must be lower snake case (i.e. person_set_name_aname).
   *
   * @return the setResources
   */
  public Map<String, Object> getSetResources() {
    return setResources;
  }

  /**
   * Gets the compositeRules.
   *
   * @return the compositeRules
   */
  public Map<String, Object> getCompositeRules() {
    return compositeRules;
  }

  /**
   * Gets the snapshotSummary.
   *
   * @return the snapshotSummary
   */
  public Map<String, Object> getSnapshotSummary() {
    return snapshotSummary;
  }

  /**
   * Gets the matchSettings.
   *
   * Match Settings.
   *
   * @return the matchSettings
   */
  public Map<String, Object> getMatchSettings() {
    return matchSettings;
  }

  /**
   * Gets the mappingPatterns.
   *
   * Mapping Patterns.
   *
   * @return the mappingPatterns
   */
  public List<Object> getMappingPatterns() {
    return mappingPatterns;
  }
}

