/*
 * (C) Copyright IBM Corp. 2021.
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
 * A single comparator.
 */
public class AlgorithmCompareMethod extends GenericModel {

  protected String label;
  protected List<Float> weights;
  protected List<AlgorithmMethods> methods;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private List<Float> weights;
    private List<AlgorithmMethods> methods;

    private Builder(AlgorithmCompareMethod algorithmCompareMethod) {
      this.label = algorithmCompareMethod.label;
      this.weights = algorithmCompareMethod.weights;
      this.methods = algorithmCompareMethod.methods;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param label the label
     */
    public Builder(String label) {
      this.label = label;
    }

    /**
     * Builds a AlgorithmCompareMethod.
     *
     * @return the new AlgorithmCompareMethod instance
     */
    public AlgorithmCompareMethod build() {
      return new AlgorithmCompareMethod(this);
    }

    /**
     * Adds an weights to weights.
     *
     * @param weights the new weights
     * @return the AlgorithmCompareMethod builder
     */
    public Builder addWeights(Float weights) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(weights,
        "weights cannot be null");
      if (this.weights == null) {
        this.weights = new ArrayList<Float>();
      }
      this.weights.add(weights);
      return this;
    }

    /**
     * Adds an methods to methods.
     *
     * @param methods the new methods
     * @return the AlgorithmCompareMethod builder
     */
    public Builder addMethods(AlgorithmMethods methods) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(methods,
        "methods cannot be null");
      if (this.methods == null) {
        this.methods = new ArrayList<AlgorithmMethods>();
      }
      this.methods.add(methods);
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmCompareMethod builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the weights.
     * Existing weights will be replaced.
     *
     * @param weights the weights
     * @return the AlgorithmCompareMethod builder
     */
    public Builder weights(List<Float> weights) {
      this.weights = weights;
      return this;
    }

    /**
     * Set the methods.
     * Existing methods will be replaced.
     *
     * @param methods the methods
     * @return the AlgorithmCompareMethod builder
     */
    public Builder methods(List<AlgorithmMethods> methods) {
      this.methods = methods;
      return this;
    }
  }

  protected AlgorithmCompareMethod(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    weights = builder.weights;
    methods = builder.methods;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmCompareMethod builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the weights.
   *
   * An array of 11 weights that map to the distance measures from 0 to 10.
   *
   * @return the weights
   */
  public List<Float> weights() {
    return weights;
  }

  /**
   * Gets the methods.
   *
   * Collection of compare methods, considered in the same group.
   *
   * @return the methods
   */
  public List<AlgorithmMethods> methods() {
    return methods;
  }
}

