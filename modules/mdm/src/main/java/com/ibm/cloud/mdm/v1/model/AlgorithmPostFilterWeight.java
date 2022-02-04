/*
 * (C) Copyright IBM Corp. 2022.
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
 * A pair of distances and values to adjust compare scores.
 */
public class AlgorithmPostFilterWeight extends GenericModel {

  protected List<Long> distances;
  protected List<Long> values;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Long> distances;
    private List<Long> values;

    private Builder(AlgorithmPostFilterWeight algorithmPostFilterWeight) {
      this.distances = algorithmPostFilterWeight.distances;
      this.values = algorithmPostFilterWeight.values;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param distances the distances
     * @param values the values
     */
    public Builder(List<Long> distances, List<Long> values) {
      this.distances = distances;
      this.values = values;
    }

    /**
     * Builds a AlgorithmPostFilterWeight.
     *
     * @return the new AlgorithmPostFilterWeight instance
     */
    public AlgorithmPostFilterWeight build() {
      return new AlgorithmPostFilterWeight(this);
    }

    /**
     * Adds an distances to distances.
     *
     * @param distances the new distances
     * @return the AlgorithmPostFilterWeight builder
     */
    public Builder addDistances(Long distances) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(distances,
        "distances cannot be null");
      if (this.distances == null) {
        this.distances = new ArrayList<Long>();
      }
      this.distances.add(distances);
      return this;
    }

    /**
     * Adds an values to values.
     *
     * @param values the new values
     * @return the AlgorithmPostFilterWeight builder
     */
    public Builder addValues(Long values) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(values,
        "values cannot be null");
      if (this.values == null) {
        this.values = new ArrayList<Long>();
      }
      this.values.add(values);
      return this;
    }

    /**
     * Set the distances.
     * Existing distances will be replaced.
     *
     * @param distances the distances
     * @return the AlgorithmPostFilterWeight builder
     */
    public Builder distances(List<Long> distances) {
      this.distances = distances;
      return this;
    }

    /**
     * Set the values.
     * Existing values will be replaced.
     *
     * @param values the values
     * @return the AlgorithmPostFilterWeight builder
     */
    public Builder values(List<Long> values) {
      this.values = values;
      return this;
    }
  }

  protected AlgorithmPostFilterWeight(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.distances,
      "distances cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.values,
      "values cannot be null");
    distances = builder.distances;
    values = builder.values;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmPostFilterWeight builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the distances.
   *
   * distances.
   *
   * @return the distances
   */
  public List<Long> distances() {
    return distances;
  }

  /**
   * Gets the values.
   *
   * values.
   *
   * @return the values
   */
  public List<Long> values() {
    return values;
  }
}

