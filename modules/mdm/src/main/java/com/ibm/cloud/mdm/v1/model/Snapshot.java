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
 * Response wrapper object for snapshot of model assets.
 */
public class Snapshot extends GenericModel {

  protected Map<String, Algorithm> algorithms;
  @SerializedName("compare_spec_resources")
  protected Map<String, CompareSpecResource> compareSpecResources;
  @SerializedName("relationship_discovery_rules")
  protected Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules;
  @SerializedName("mapping_patterns")
  protected List<Object> mappingPatterns;
  @SerializedName("data_model")
  protected DataModel dataModel;
  @SerializedName("map_resources")
  protected Map<String, Map<String, List<MapResourceEntry>>> mapResources;
  @SerializedName("set_resources")
  protected Map<String, Map<String, SetResourceEntry>> setResources;
  @SerializedName("composite_rules")
  protected CompositeRules compositeRules;
  @SerializedName("snapshot_summary")
  protected SnapshotSummary snapshotSummary;
  @SerializedName("match_settings")
  protected Map<String, Object> matchSettings;

  /**
   * Gets the algorithms.
   *
   * Collection of matching algorithms for different record types e.g. person, organization.
   *
   * @return the algorithms
   */
  public Map<String, Algorithm> getAlgorithms() {
    return algorithms;
  }

  /**
   * Gets the compareSpecResources.
   *
   * Collection of various comparison resources used to customize comparison logic of a matching algorithm.
   *
   * @return the compareSpecResources
   */
  public Map<String, CompareSpecResource> getCompareSpecResources() {
    return compareSpecResources;
  }

  /**
   * Gets the relationshipDiscoveryRules.
   *
   * Collection of various relationship discovery rules definitions. Relationship discovery resource key must be lower
   * snake case (i.e. employment_rules).
   *
   * @return the relationshipDiscoveryRules
   */
  public Map<String, RelationshipDiscoveryRules> getRelationshipDiscoveryRules() {
    return relationshipDiscoveryRules;
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

  /**
   * Gets the dataModel.
   *
   * Collection of record and relationship types definition.
   *
   * @return the dataModel
   */
  public DataModel getDataModel() {
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
  public Map<String, Map<String, List<MapResourceEntry>>> getMapResources() {
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
  public Map<String, Map<String, SetResourceEntry>> getSetResources() {
    return setResources;
  }

  /**
   * Gets the compositeRules.
   *
   * The wrapper object of composite rules.
   *
   * @return the compositeRules
   */
  public CompositeRules getCompositeRules() {
    return compositeRules;
  }

  /**
   * Gets the snapshotSummary.
   *
   * Contains the summary of a snapshot.
   *
   * @return the snapshotSummary
   */
  public SnapshotSummary getSnapshotSummary() {
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
}

