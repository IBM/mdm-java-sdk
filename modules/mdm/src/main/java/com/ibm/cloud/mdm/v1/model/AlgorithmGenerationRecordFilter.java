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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single criteria using a collection of rules for filtering out record(s).The record filter key must be lower snake
 * case (i.e. record_filter).
 */
public class AlgorithmGenerationRecordFilter extends GenericModel {

  protected Map<String, AlgorithmGenerationSingleCriteria> criteria;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, AlgorithmGenerationSingleCriteria> criteria;

    /**
     * Instantiates a new Builder from an existing AlgorithmGenerationRecordFilter instance.
     *
     * @param algorithmGenerationRecordFilter the instance to initialize the Builder with
     */
    private Builder(AlgorithmGenerationRecordFilter algorithmGenerationRecordFilter) {
      this.criteria = algorithmGenerationRecordFilter.criteria;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param criteria the criteria
     */
    public Builder(Map<String, AlgorithmGenerationSingleCriteria> criteria) {
      this.criteria = criteria;
    }

    /**
     * Builds a AlgorithmGenerationRecordFilter.
     *
     * @return the new AlgorithmGenerationRecordFilter instance
     */
    public AlgorithmGenerationRecordFilter build() {
      return new AlgorithmGenerationRecordFilter(this);
    }

    /**
     * Set the criteria.
     *
     * @param criteria the criteria
     * @return the AlgorithmGenerationRecordFilter builder
     */
    public Builder criteria(Map<String, AlgorithmGenerationSingleCriteria> criteria) {
      this.criteria = criteria;
      return this;
    }
  }

  protected AlgorithmGenerationRecordFilter() { }

  protected AlgorithmGenerationRecordFilter(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.criteria,
      "criteria cannot be null");
    criteria = builder.criteria;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmGenerationRecordFilter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the criteria.
   *
   * A collection of rules to filter out record(s).
   *
   * @return the criteria
   */
  public Map<String, AlgorithmGenerationSingleCriteria> criteria() {
    return criteria;
  }
}

