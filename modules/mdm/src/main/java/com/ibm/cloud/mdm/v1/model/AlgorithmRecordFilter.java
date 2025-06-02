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
public class AlgorithmRecordFilter extends GenericModel {

  protected Map<String, AlgorithmSingleCriteria> criteria;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, AlgorithmSingleCriteria> criteria;

    /**
     * Instantiates a new Builder from an existing AlgorithmRecordFilter instance.
     *
     * @param algorithmRecordFilter the instance to initialize the Builder with
     */
    private Builder(AlgorithmRecordFilter algorithmRecordFilter) {
      this.criteria = algorithmRecordFilter.criteria;
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
    public Builder(Map<String, AlgorithmSingleCriteria> criteria) {
      this.criteria = criteria;
    }

    /**
     * Builds a AlgorithmRecordFilter.
     *
     * @return the new AlgorithmRecordFilter instance
     */
    public AlgorithmRecordFilter build() {
      return new AlgorithmRecordFilter(this);
    }

    /**
     * Set the criteria.
     *
     * @param criteria the criteria
     * @return the AlgorithmRecordFilter builder
     */
    public Builder criteria(Map<String, AlgorithmSingleCriteria> criteria) {
      this.criteria = criteria;
      return this;
    }
  }

  protected AlgorithmRecordFilter() { }

  protected AlgorithmRecordFilter(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.criteria,
      "criteria cannot be null");
    criteria = builder.criteria;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmRecordFilter builder
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
  public Map<String, AlgorithmSingleCriteria> criteria() {
    return criteria;
  }
}

