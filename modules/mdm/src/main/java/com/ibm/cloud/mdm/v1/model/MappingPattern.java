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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper with details of Asset Mapping patterns.
 */
public class MappingPattern extends GenericModel {

  protected String id;
  @SerializedName("last_updated_at")
  protected String lastUpdatedAt;
  @SerializedName("mapping_patterns")
  protected List<AssetMappingPatternSuggestion> mappingPatterns;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String lastUpdatedAt;
    private List<AssetMappingPatternSuggestion> mappingPatterns;

    /**
     * Instantiates a new Builder from an existing MappingPattern instance.
     *
     * @param mappingPattern the instance to initialize the Builder with
     */
    private Builder(MappingPattern mappingPattern) {
      this.id = mappingPattern.id;
      this.lastUpdatedAt = mappingPattern.lastUpdatedAt;
      this.mappingPatterns = mappingPattern.mappingPatterns;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a MappingPattern.
     *
     * @return the new MappingPattern instance
     */
    public MappingPattern build() {
      return new MappingPattern(this);
    }

    /**
     * Adds a new element to mappingPatterns.
     *
     * @param mappingPatterns the new element to be added
     * @return the MappingPattern builder
     */
    public Builder addMappingPatterns(AssetMappingPatternSuggestion mappingPatterns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(mappingPatterns,
        "mappingPatterns cannot be null");
      if (this.mappingPatterns == null) {
        this.mappingPatterns = new ArrayList<AssetMappingPatternSuggestion>();
      }
      this.mappingPatterns.add(mappingPatterns);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the MappingPattern builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the lastUpdatedAt.
     *
     * @param lastUpdatedAt the lastUpdatedAt
     * @return the MappingPattern builder
     */
    public Builder lastUpdatedAt(String lastUpdatedAt) {
      this.lastUpdatedAt = lastUpdatedAt;
      return this;
    }

    /**
     * Set the mappingPatterns.
     * Existing mappingPatterns will be replaced.
     *
     * @param mappingPatterns the mappingPatterns
     * @return the MappingPattern builder
     */
    public Builder mappingPatterns(List<AssetMappingPatternSuggestion> mappingPatterns) {
      this.mappingPatterns = mappingPatterns;
      return this;
    }
  }

  protected MappingPattern() { }

  protected MappingPattern(Builder builder) {
    id = builder.id;
    lastUpdatedAt = builder.lastUpdatedAt;
    mappingPatterns = builder.mappingPatterns;
  }

  /**
   * New builder.
   *
   * @return a MappingPattern builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * System generated id when a mapping pattern was created/updated.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the lastUpdatedAt.
   *
   * System generated timestamp when a mapping pattern was last updated.
   *
   * @return the lastUpdatedAt
   */
  public String lastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * Gets the mappingPatterns.
   *
   * Collection of Asset Mapping Patterns for Data Asset.
   *
   * @return the mappingPatterns
   */
  public List<AssetMappingPatternSuggestion> mappingPatterns() {
    return mappingPatterns;
  }
}

