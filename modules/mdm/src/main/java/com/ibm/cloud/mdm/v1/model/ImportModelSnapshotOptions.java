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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The importModelSnapshot options.
 */
public class ImportModelSnapshotOptions extends GenericModel {

  protected Map<String, Algorithm> algorithms;
  protected Map<String, CompareSpecResource> compareSpecResources;
  protected Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules;
  protected DataModel dataModel;
  protected Map<String, Map<String, List<MapResourceEntry>>> mapResources;
  protected Map<String, Map<String, SetResourceEntry>> setResources;
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
     * Instantiates a new Builder from an existing ImportModelSnapshotOptions instance.
     *
     * @param importModelSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(ImportModelSnapshotOptions importModelSnapshotOptions) {
      this.algorithms = importModelSnapshotOptions.algorithms;
      this.compareSpecResources = importModelSnapshotOptions.compareSpecResources;
      this.relationshipDiscoveryRules = importModelSnapshotOptions.relationshipDiscoveryRules;
      this.dataModel = importModelSnapshotOptions.dataModel;
      this.mapResources = importModelSnapshotOptions.mapResources;
      this.setResources = importModelSnapshotOptions.setResources;
      this.compositeRules = importModelSnapshotOptions.compositeRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ImportModelSnapshotOptions.
     *
     * @return the new ImportModelSnapshotOptions instance
     */
    public ImportModelSnapshotOptions build() {
      return new ImportModelSnapshotOptions(this);
    }

    /**
     * Set the algorithms.
     *
     * @param algorithms the algorithms
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder algorithms(Map<String, Algorithm> algorithms) {
      this.algorithms = algorithms;
      return this;
    }

    /**
     * Set the compareSpecResources.
     *
     * @param compareSpecResources the compareSpecResources
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder compareSpecResources(Map<String, CompareSpecResource> compareSpecResources) {
      this.compareSpecResources = compareSpecResources;
      return this;
    }

    /**
     * Set the relationshipDiscoveryRules.
     *
     * @param relationshipDiscoveryRules the relationshipDiscoveryRules
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder relationshipDiscoveryRules(Map<String, RelationshipDiscoveryRules> relationshipDiscoveryRules) {
      this.relationshipDiscoveryRules = relationshipDiscoveryRules;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.dataModel = dataModel;
      return this;
    }

    /**
     * Set the mapResources.
     *
     * @param mapResources the mapResources
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder mapResources(Map<String, Map<String, List<MapResourceEntry>>> mapResources) {
      this.mapResources = mapResources;
      return this;
    }

    /**
     * Set the setResources.
     *
     * @param setResources the setResources
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder setResources(Map<String, Map<String, SetResourceEntry>> setResources) {
      this.setResources = setResources;
      return this;
    }

    /**
     * Set the compositeRules.
     *
     * @param compositeRules the compositeRules
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder compositeRules(CompositeRules compositeRules) {
      this.compositeRules = compositeRules;
      return this;
    }

    /**
     * Set the snapshotImportRequest.
     *
     * @param snapshotImportRequest the snapshotImportRequest
     * @return the ImportModelSnapshotOptions builder
     */
    public Builder snapshotImportRequest(SnapshotImportRequest snapshotImportRequest) {
      this.algorithms = snapshotImportRequest.algorithms();
      this.compareSpecResources = snapshotImportRequest.compareSpecResources();
      this.relationshipDiscoveryRules = snapshotImportRequest.relationshipDiscoveryRules();
      this.dataModel = snapshotImportRequest.dataModel();
      this.mapResources = snapshotImportRequest.mapResources();
      this.setResources = snapshotImportRequest.setResources();
      this.compositeRules = snapshotImportRequest.compositeRules();
      return this;
    }
  }

  protected ImportModelSnapshotOptions() { }

  protected ImportModelSnapshotOptions(Builder builder) {
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
   * @return a ImportModelSnapshotOptions builder
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

