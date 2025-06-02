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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The applyMappingPatterns options.
 */
public class ApplyMappingPatternsOptions extends GenericModel {

  protected List<AssetMappingPatternSuggestion> mappingPatterns;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AssetMappingPatternSuggestion> mappingPatterns;

    /**
     * Instantiates a new Builder from an existing ApplyMappingPatternsOptions instance.
     *
     * @param applyMappingPatternsOptions the instance to initialize the Builder with
     */
    private Builder(ApplyMappingPatternsOptions applyMappingPatternsOptions) {
      this.mappingPatterns = applyMappingPatternsOptions.mappingPatterns;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ApplyMappingPatternsOptions.
     *
     * @return the new ApplyMappingPatternsOptions instance
     */
    public ApplyMappingPatternsOptions build() {
      return new ApplyMappingPatternsOptions(this);
    }

    /**
     * Adds a new element to mappingPatterns.
     *
     * @param mappingPatterns the new element to be added
     * @return the ApplyMappingPatternsOptions builder
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
     * Set the mappingPatterns.
     * Existing mappingPatterns will be replaced.
     *
     * @param mappingPatterns the mappingPatterns
     * @return the ApplyMappingPatternsOptions builder
     */
    public Builder mappingPatterns(List<AssetMappingPatternSuggestion> mappingPatterns) {
      this.mappingPatterns = mappingPatterns;
      return this;
    }
  }

  protected ApplyMappingPatternsOptions() { }

  protected ApplyMappingPatternsOptions(Builder builder) {
    mappingPatterns = builder.mappingPatterns;
  }

  /**
   * New builder.
   *
   * @return a ApplyMappingPatternsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mappingPatterns.
   *
   * The list of mapping patterns.
   *
   * @return the mappingPatterns
   */
  public List<AssetMappingPatternSuggestion> mappingPatterns() {
    return mappingPatterns;
  }
}

