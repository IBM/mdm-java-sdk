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
 * A single post filter step.
 */
public class AlgorithmPostFilterStep extends GenericModel {

  protected String method;
  protected List<Long> inputs;
  protected String label;
  protected List<AlgorithmPostFilterWeight> weights;
  @SerializedName("filter_resource")
  protected String filterResource;
  @SerializedName("max_distance")
  protected Long maxDistance;

  /**
   * Builder.
   */
  public static class Builder {
    private String method;
    private List<Long> inputs;
    private String label;
    private List<AlgorithmPostFilterWeight> weights;
    private String filterResource;
    private Long maxDistance;

    /**
     * Instantiates a new Builder from an existing AlgorithmPostFilterStep instance.
     *
     * @param algorithmPostFilterStep the instance to initialize the Builder with
     */
    private Builder(AlgorithmPostFilterStep algorithmPostFilterStep) {
      this.method = algorithmPostFilterStep.method;
      this.inputs = algorithmPostFilterStep.inputs;
      this.label = algorithmPostFilterStep.label;
      this.weights = algorithmPostFilterStep.weights;
      this.filterResource = algorithmPostFilterStep.filterResource;
      this.maxDistance = algorithmPostFilterStep.maxDistance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param method the method
     * @param inputs the inputs
     * @param label the label
     * @param weights the weights
     */
    public Builder(String method, List<Long> inputs, String label, List<AlgorithmPostFilterWeight> weights) {
      this.method = method;
      this.inputs = inputs;
      this.label = label;
      this.weights = weights;
    }

    /**
     * Builds a AlgorithmPostFilterStep.
     *
     * @return the new AlgorithmPostFilterStep instance
     */
    public AlgorithmPostFilterStep build() {
      return new AlgorithmPostFilterStep(this);
    }

    /**
     * Adds a new element to inputs.
     *
     * @param inputs the new element to be added
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder addInputs(Long inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<Long>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds a new element to weights.
     *
     * @param weights the new element to be added
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder addWeights(AlgorithmPostFilterWeight weights) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(weights,
        "weights cannot be null");
      if (this.weights == null) {
        this.weights = new ArrayList<AlgorithmPostFilterWeight>();
      }
      this.weights.add(weights);
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder inputs(List<Long> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmPostFilterStep builder
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
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder weights(List<AlgorithmPostFilterWeight> weights) {
      this.weights = weights;
      return this;
    }

    /**
     * Set the filterResource.
     *
     * @param filterResource the filterResource
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder filterResource(String filterResource) {
      this.filterResource = filterResource;
      return this;
    }

    /**
     * Set the maxDistance.
     *
     * @param maxDistance the maxDistance
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder maxDistance(long maxDistance) {
      this.maxDistance = maxDistance;
      return this;
    }
  }

  protected AlgorithmPostFilterStep() { }

  protected AlgorithmPostFilterStep(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputs,
      "inputs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.weights,
      "weights cannot be null");
    method = builder.method;
    inputs = builder.inputs;
    label = builder.label;
    weights = builder.weights;
    filterResource = builder.filterResource;
    maxDistance = builder.maxDistance;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmPostFilterStep builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the method.
   *
   * A post filter method name.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the inputs.
   *
   * Collection of numbers, referencing the position of one or more defined inputs. The default value is [1].
   *
   * @return the inputs
   */
  public List<Long> inputs() {
    return inputs;
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
   * An array of weights composed of distances and values.
   *
   * @return the weights
   */
  public List<AlgorithmPostFilterWeight> weights() {
    return weights;
  }

  /**
   * Gets the filterResource.
   *
   * Some required resources.
   *
   * @return the filterResource
   */
  public String filterResource() {
    return filterResource;
  }

  /**
   * Gets the maxDistance.
   *
   * maximum value for a distance.
   *
   * @return the maxDistance
   */
  public Long maxDistance() {
    return maxDistance;
  }
}

