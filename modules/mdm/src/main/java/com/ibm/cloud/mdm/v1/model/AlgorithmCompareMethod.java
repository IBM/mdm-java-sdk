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
 * A single comparator.
 */
public class AlgorithmCompareMethod extends GenericModel {

  protected List<AlgorithmMethods> methods;
  @SerializedName("overall_score_contribution")
  protected Boolean overallScoreContribution;
  protected String label;
  protected List<Float> weights;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmMethods> methods;
    private Boolean overallScoreContribution;
    private String label;
    private List<Float> weights;

    private Builder(AlgorithmCompareMethod algorithmCompareMethod) {
      this.methods = algorithmCompareMethod.methods;
      this.overallScoreContribution = algorithmCompareMethod.overallScoreContribution;
      this.label = algorithmCompareMethod.label;
      this.weights = algorithmCompareMethod.weights;
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

    /**
     * Set the overallScoreContribution.
     *
     * @param overallScoreContribution the overallScoreContribution
     * @return the AlgorithmCompareMethod builder
     */
    public Builder overallScoreContribution(Boolean overallScoreContribution) {
      this.overallScoreContribution = overallScoreContribution;
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
  }

  protected AlgorithmCompareMethod() { }

  protected AlgorithmCompareMethod(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    methods = builder.methods;
    overallScoreContribution = builder.overallScoreContribution;
    label = builder.label;
    weights = builder.weights;
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
   * Gets the methods.
   *
   * Collection of compare methods, considered in the same group.
   *
   * @return the methods
   */
  public List<AlgorithmMethods> methods() {
    return methods;
  }

  /**
   * Gets the overallScoreContribution.
   *
   * Overall score contriubution of a single compare method.
   *
   * @return the overallScoreContribution
   */
  public Boolean overallScoreContribution() {
    return overallScoreContribution;
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
}

