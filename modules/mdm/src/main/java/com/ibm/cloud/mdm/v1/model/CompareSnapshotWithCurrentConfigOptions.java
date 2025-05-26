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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The compareSnapshotWithCurrentConfig options.
 */
public class CompareSnapshotWithCurrentConfigOptions extends GenericModel {

  protected Map<String, Object> dataModel;
  protected Map<String, Object> matchSettings;
  protected Map<String, Object> compositeRules;
  protected Map<String, Object> algorithms;
  protected List<Object> mappingPatterns;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> dataModel;
    private Map<String, Object> matchSettings;
    private Map<String, Object> compositeRules;
    private Map<String, Object> algorithms;
    private List<Object> mappingPatterns;

    private Builder(CompareSnapshotWithCurrentConfigOptions compareSnapshotWithCurrentConfigOptions) {
      this.dataModel = compareSnapshotWithCurrentConfigOptions.dataModel;
      this.matchSettings = compareSnapshotWithCurrentConfigOptions.matchSettings;
      this.compositeRules = compareSnapshotWithCurrentConfigOptions.compositeRules;
      this.algorithms = compareSnapshotWithCurrentConfigOptions.algorithms;
      this.mappingPatterns = compareSnapshotWithCurrentConfigOptions.mappingPatterns;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompareSnapshotWithCurrentConfigOptions.
     *
     * @return the new CompareSnapshotWithCurrentConfigOptions instance
     */
    public CompareSnapshotWithCurrentConfigOptions build() {
      return new CompareSnapshotWithCurrentConfigOptions(this);
    }

    /**
     * Adds an mappingPatterns to mappingPatterns.
     *
     * @param mappingPatterns the new mappingPatterns
     * @return the CompareSnapshotWithCurrentConfigOptions builder
     */
    public Builder addMappingPatterns(Object mappingPatterns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(mappingPatterns,
        "mappingPatterns cannot be null");
      if (this.mappingPatterns == null) {
        this.mappingPatterns = new ArrayList<Object>();
      }
      this.mappingPatterns.add(mappingPatterns);
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the CompareSnapshotWithCurrentConfigOptions builder
     */
    public Builder dataModel(Map<String, Object> dataModel) {
      this.dataModel = dataModel;
      return this;
    }

    /**
     * Set the matchSettings.
     *
     * @param matchSettings the matchSettings
     * @return the CompareSnapshotWithCurrentConfigOptions builder
     */
    public Builder matchSettings(Map<String, Object> matchSettings) {
      this.matchSettings = matchSettings;
      return this;
    }

    /**
     * Set the compositeRules.
     *
     * @param compositeRules the compositeRules
     * @return the CompareSnapshotWithCurrentConfigOptions builder
     */
    public Builder compositeRules(Map<String, Object> compositeRules) {
      this.compositeRules = compositeRules;
      return this;
    }

    /**
     * Set the algorithms.
     *
     * @param algorithms the algorithms
     * @return the CompareSnapshotWithCurrentConfigOptions builder
     */
    public Builder algorithms(Map<String, Object> algorithms) {
      this.algorithms = algorithms;
      return this;
    }

    /**
     * Set the mappingPatterns.
     * Existing mappingPatterns will be replaced.
     *
     * @param mappingPatterns the mappingPatterns
     * @return the CompareSnapshotWithCurrentConfigOptions builder
     */
    public Builder mappingPatterns(List<Object> mappingPatterns) {
      this.mappingPatterns = mappingPatterns;
      return this;
    }
  }

  protected CompareSnapshotWithCurrentConfigOptions() { }

  protected CompareSnapshotWithCurrentConfigOptions(Builder builder) {
    dataModel = builder.dataModel;
    matchSettings = builder.matchSettings;
    compositeRules = builder.compositeRules;
    algorithms = builder.algorithms;
    mappingPatterns = builder.mappingPatterns;
  }

  /**
   * New builder.
   *
   * @return a CompareSnapshotWithCurrentConfigOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataModel.
   *
   * Data model of snapshot for comparison with current system's data model.
   *
   * @return the dataModel
   */
  public Map<String, Object> dataModel() {
    return dataModel;
  }

  /**
   * Gets the matchSettings.
   *
   * Match Settings of snapshot for comparison with current system's match settings.
   *
   * @return the matchSettings
   */
  public Map<String, Object> matchSettings() {
    return matchSettings;
  }

  /**
   * Gets the compositeRules.
   *
   * Composite Rules of snapshot for comparison with current system's Composite Rules.
   *
   * @return the compositeRules
   */
  public Map<String, Object> compositeRules() {
    return compositeRules;
  }

  /**
   * Gets the algorithms.
   *
   * Algorithms from the snapshot for checking the compatibility with Model.
   *
   * @return the algorithms
   */
  public Map<String, Object> algorithms() {
    return algorithms;
  }

  /**
   * Gets the mappingPatterns.
   *
   * Mapping Patterns.
   *
   * @return the mappingPatterns
   */
  public List<Object> mappingPatterns() {
    return mappingPatterns;
  }
}

