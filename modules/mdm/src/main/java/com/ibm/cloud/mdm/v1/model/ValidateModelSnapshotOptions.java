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
 * The validateModelSnapshot options.
 */
public class ValidateModelSnapshotOptions extends GenericModel {

  protected Map<String, Algorithm> algorithms;
  protected Map<String, CompareSpecResource> compareSpecResources;
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
    private DataModel dataModel;
    private Map<String, Map<String, List<MapResourceEntry>>> mapResources;
    private Map<String, Map<String, SetResourceEntry>> setResources;
    private CompositeRules compositeRules;

    private Builder(ValidateModelSnapshotOptions validateModelSnapshotOptions) {
      this.algorithms = validateModelSnapshotOptions.algorithms;
      this.compareSpecResources = validateModelSnapshotOptions.compareSpecResources;
      this.dataModel = validateModelSnapshotOptions.dataModel;
      this.mapResources = validateModelSnapshotOptions.mapResources;
      this.setResources = validateModelSnapshotOptions.setResources;
      this.compositeRules = validateModelSnapshotOptions.compositeRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param algorithms the algorithms
     * @param compareSpecResources the compareSpecResources
     * @param dataModel the dataModel
     * @param mapResources the mapResources
     * @param setResources the setResources
     * @param compositeRules the compositeRules
     */
    public Builder(Map<String, Algorithm> algorithms, Map<String, CompareSpecResource> compareSpecResources, DataModel dataModel, Map<String, Map<String, List<MapResourceEntry>>> mapResources, Map<String, Map<String, SetResourceEntry>> setResources, CompositeRules compositeRules) {
      this.algorithms = algorithms;
      this.compareSpecResources = compareSpecResources;
      this.dataModel = dataModel;
      this.mapResources = mapResources;
      this.setResources = setResources;
      this.compositeRules = compositeRules;
    }

    /**
     * Builds a ValidateModelSnapshotOptions.
     *
     * @return the new ValidateModelSnapshotOptions instance
     */
    public ValidateModelSnapshotOptions build() {
      return new ValidateModelSnapshotOptions(this);
    }

    /**
     * Set the algorithms.
     *
     * @param algorithms the algorithms
     * @return the ValidateModelSnapshotOptions builder
     */
    public Builder algorithms(Map<String, Algorithm> algorithms) {
      this.algorithms = algorithms;
      return this;
    }

    /**
     * Set the compareSpecResources.
     *
     * @param compareSpecResources the compareSpecResources
     * @return the ValidateModelSnapshotOptions builder
     */
    public Builder compareSpecResources(Map<String, CompareSpecResource> compareSpecResources) {
      this.compareSpecResources = compareSpecResources;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the ValidateModelSnapshotOptions builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.dataModel = dataModel;
      return this;
    }

    /**
     * Set the mapResources.
     *
     * @param mapResources the mapResources
     * @return the ValidateModelSnapshotOptions builder
     */
    public Builder mapResources(Map<String, Map<String, List<MapResourceEntry>>> mapResources) {
      this.mapResources = mapResources;
      return this;
    }

    /**
     * Set the setResources.
     *
     * @param setResources the setResources
     * @return the ValidateModelSnapshotOptions builder
     */
    public Builder setResources(Map<String, Map<String, SetResourceEntry>> setResources) {
      this.setResources = setResources;
      return this;
    }

    /**
     * Set the compositeRules.
     *
     * @param compositeRules the compositeRules
     * @return the ValidateModelSnapshotOptions builder
     */
    public Builder compositeRules(CompositeRules compositeRules) {
      this.compositeRules = compositeRules;
      return this;
    }
  }

  protected ValidateModelSnapshotOptions() { }

  protected ValidateModelSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.algorithms,
      "algorithms cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.compareSpecResources,
      "compareSpecResources cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataModel,
      "dataModel cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mapResources,
      "mapResources cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.setResources,
      "setResources cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.compositeRules,
      "compositeRules cannot be null");
    algorithms = builder.algorithms;
    compareSpecResources = builder.compareSpecResources;
    dataModel = builder.dataModel;
    mapResources = builder.mapResources;
    setResources = builder.setResources;
    compositeRules = builder.compositeRules;
  }

  /**
   * New builder.
   *
   * @return a ValidateModelSnapshotOptions builder
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

