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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single post filter step.
 */
public class AlgorithmPostFilterStep extends GenericModel {

  protected List<Long> inputs;
  protected String label;
  protected List<AlgorithmPostFilterWeight> weights;
  @SerializedName("filter_resource")
  protected String filterResource;
  protected String method;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Long> inputs;
    private String label;
    private List<AlgorithmPostFilterWeight> weights;
    private String filterResource;
    private String method;

    private Builder(AlgorithmPostFilterStep algorithmPostFilterStep) {
      this.inputs = algorithmPostFilterStep.inputs;
      this.label = algorithmPostFilterStep.label;
      this.weights = algorithmPostFilterStep.weights;
      this.filterResource = algorithmPostFilterStep.filterResource;
      this.method = algorithmPostFilterStep.method;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param inputs the inputs
     * @param label the label
     * @param weights the weights
     * @param method the method
     */
    public Builder(List<Long> inputs, String label, List<AlgorithmPostFilterWeight> weights, String method) {
      this.inputs = inputs;
      this.label = label;
      this.weights = weights;
      this.method = method;
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
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
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
     * Adds an weights to weights.
     *
     * @param weights the new weights
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
     * Set the method.
     *
     * @param method the method
     * @return the AlgorithmPostFilterStep builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }
  }

  protected AlgorithmPostFilterStep(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputs,
      "inputs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.weights,
      "weights cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    inputs = builder.inputs;
    label = builder.label;
    weights = builder.weights;
    filterResource = builder.filterResource;
    method = builder.method;
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
   * Gets the method.
   *
   * A post filter method name.
   *
   * @return the method
   */
  public String method() {
    return method;
  }
}

