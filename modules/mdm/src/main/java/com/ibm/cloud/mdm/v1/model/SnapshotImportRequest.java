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
 * Request wrapper object for import snapshot of model assets.
 */
public class SnapshotImportRequest extends GenericModel {

  protected Map<String, Algorithm> algorithms;
  @SerializedName("compare_spec_resources")
  protected Map<String, CompareSpecResource> compareSpecResources;
  @SerializedName("relationship_discovery_rules")
  protected Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules;
  @SerializedName("data_model")
  protected DataModel dataModel;
  @SerializedName("map_resources")
  protected Map<String, Map<String, List<MapResourceEntry>>> mapResources;
  @SerializedName("set_resources")
  protected Map<String, Map<String, SetResourceEntry>> setResources;
  @SerializedName("composite_rules")
  protected CompositeRules compositeRules;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Algorithm> algorithms;
    private Map<String, CompareSpecResource> compareSpecResources;
    private Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules;
    private DataModel dataModel;
    private Map<String, Map<String, List<MapResourceEntry>>> mapResources;
    private Map<String, Map<String, SetResourceEntry>> setResources;
    private CompositeRules compositeRules;

    /**
     * Instantiates a new Builder from an existing SnapshotImportRequest instance.
     *
     * @param snapshotImportRequest the instance to initialize the Builder with
     */
    private Builder(SnapshotImportRequest snapshotImportRequest) {
      this.algorithms = snapshotImportRequest.algorithms;
      this.compareSpecResources = snapshotImportRequest.compareSpecResources;
      this.relationshipDiscoveryRules = snapshotImportRequest.relationshipDiscoveryRules;
      this.dataModel = snapshotImportRequest.dataModel;
      this.mapResources = snapshotImportRequest.mapResources;
      this.setResources = snapshotImportRequest.setResources;
      this.compositeRules = snapshotImportRequest.compositeRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SnapshotImportRequest.
     *
     * @return the new SnapshotImportRequest instance
     */
    public SnapshotImportRequest build() {
      return new SnapshotImportRequest(this);
    }

    /**
     * Set the algorithms.
     *
     * @param algorithms the algorithms
     * @return the SnapshotImportRequest builder
     */
    public Builder algorithms(Map<String, Algorithm> algorithms) {
      this.algorithms = algorithms;
      return this;
    }

    /**
     * Set the compareSpecResources.
     *
     * @param compareSpecResources the compareSpecResources
     * @return the SnapshotImportRequest builder
     */
    public Builder compareSpecResources(Map<String, CompareSpecResource> compareSpecResources) {
      this.compareSpecResources = compareSpecResources;
      return this;
    }

    /**
     * Set the relationshipDiscoveryRules.
     *
     * @param relationshipDiscoveryRules the relationshipDiscoveryRules
     * @return the SnapshotImportRequest builder
     */
    public Builder relationshipDiscoveryRules(Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules) {
      this.relationshipDiscoveryRules = relationshipDiscoveryRules;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the SnapshotImportRequest builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.dataModel = dataModel;
      return this;
    }

    /**
     * Set the mapResources.
     *
     * @param mapResources the mapResources
     * @return the SnapshotImportRequest builder
     */
    public Builder mapResources(Map<String, Map<String, List<MapResourceEntry>>> mapResources) {
      this.mapResources = mapResources;
      return this;
    }

    /**
     * Set the setResources.
     *
     * @param setResources the setResources
     * @return the SnapshotImportRequest builder
     */
    public Builder setResources(Map<String, Map<String, SetResourceEntry>> setResources) {
      this.setResources = setResources;
      return this;
    }

    /**
     * Set the compositeRules.
     *
     * @param compositeRules the compositeRules
     * @return the SnapshotImportRequest builder
     */
    public Builder compositeRules(CompositeRules compositeRules) {
      this.compositeRules = compositeRules;
      return this;
    }
  }

  protected SnapshotImportRequest() { }

  protected SnapshotImportRequest(Builder builder) {
    algorithms = builder.algorithms;
    compareSpecResources = builder.compareSpecResources;
    relationshipDiscoveryRules = builder.relationshipDiscoveryRules;
    dataModel = builder.dataModel;
    mapResources = builder.mapResources;
    setResources = builder.setResources;
    compositeRules = builder.compositeRules;
  }

  /**
   * New builder.
   *
   * @return a SnapshotImportRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the algorithms.
   *
   * Collection of matching algorithms for different record types e.g. person, organization.
   *
   * @return the algorithms
   */
  public Map<String, Algorithm> algorithms() {
    return algorithms;
  }

  /**
   * Gets the compareSpecResources.
   *
   * Collection of various comparison resources used to customize comparison logic of a matching algorithm.
   *
   * @return the compareSpecResources
   */
  public Map<String, CompareSpecResource> compareSpecResources() {
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
  public Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules() {
    return relationshipDiscoveryRules;
  }

  /**
   * Gets the dataModel.
   *
   * Collection of record and relationship types definition.
   *
   * @return the dataModel
   */
  public DataModel dataModel() {
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
  public Map<String, Map<String, List<MapResourceEntry>>> mapResources() {
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
  public Map<String, Map<String, SetResourceEntry>> setResources() {
    return setResources;
  }

  /**
   * Gets the compositeRules.
   *
   * The wrapper object of composite rules.
   *
   * @return the compositeRules
   */
  public CompositeRules compositeRules() {
    return compositeRules;
  }
}

