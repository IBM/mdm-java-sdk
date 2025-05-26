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
 * The createModelSnapshot options.
 */
public class CreateModelSnapshotOptions extends GenericModel {

  protected SnapshotSummary snapshotSummary;
  protected Map<String, Object> matchSettings;
  protected List<Object> mappingPatterns;

  /**
   * Builder.
   */
  public static class Builder {
    private SnapshotSummary snapshotSummary;
    private Map<String, Object> matchSettings;
    private List<Object> mappingPatterns;

    private Builder(CreateModelSnapshotOptions createModelSnapshotOptions) {
      this.snapshotSummary = createModelSnapshotOptions.snapshotSummary;
      this.matchSettings = createModelSnapshotOptions.matchSettings;
      this.mappingPatterns = createModelSnapshotOptions.mappingPatterns;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param snapshotSummary the snapshotSummary
     * @param matchSettings the matchSettings
     */
    public Builder(SnapshotSummary snapshotSummary, Map<String, Object> matchSettings) {
      this.snapshotSummary = snapshotSummary;
      this.matchSettings = matchSettings;
    }

    /**
     * Builds a CreateModelSnapshotOptions.
     *
     * @return the new CreateModelSnapshotOptions instance
     */
    public CreateModelSnapshotOptions build() {
      return new CreateModelSnapshotOptions(this);
    }

    /**
     * Adds an mappingPatterns to mappingPatterns.
     *
     * @param mappingPatterns the new mappingPatterns
     * @return the CreateModelSnapshotOptions builder
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
     * Set the snapshotSummary.
     *
     * @param snapshotSummary the snapshotSummary
     * @return the CreateModelSnapshotOptions builder
     */
    public Builder snapshotSummary(SnapshotSummary snapshotSummary) {
      this.snapshotSummary = snapshotSummary;
      return this;
    }

    /**
     * Set the matchSettings.
     *
     * @param matchSettings the matchSettings
     * @return the CreateModelSnapshotOptions builder
     */
    public Builder matchSettings(Map<String, Object> matchSettings) {
      this.matchSettings = matchSettings;
      return this;
    }

    /**
     * Set the mappingPatterns.
     * Existing mappingPatterns will be replaced.
     *
     * @param mappingPatterns the mappingPatterns
     * @return the CreateModelSnapshotOptions builder
     */
    public Builder mappingPatterns(List<Object> mappingPatterns) {
      this.mappingPatterns = mappingPatterns;
      return this;
    }
  }

  protected CreateModelSnapshotOptions() { }

  protected CreateModelSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotSummary,
      "snapshotSummary cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchSettings,
      "matchSettings cannot be null");
    snapshotSummary = builder.snapshotSummary;
    matchSettings = builder.matchSettings;
    mappingPatterns = builder.mappingPatterns;
  }

  /**
   * New builder.
   *
   * @return a CreateModelSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the snapshotSummary.
   *
   * Contains the summary of a snapshot.
   *
   * @return the snapshotSummary
   */
  public SnapshotSummary snapshotSummary() {
    return snapshotSummary;
  }

  /**
   * Gets the matchSettings.
   *
   * Match Settings.
   *
   * @return the matchSettings
   */
  public Map<String, Object> matchSettings() {
    return matchSettings;
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

