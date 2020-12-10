/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single standardizer definition.
 */
public class AlgorithmStandardizer extends GenericModel {

  protected List<AlgorithmInput> inputs;
  @SerializedName("standardizer_recipe")
  protected List<AlgorithmStandardizerStep> standardizerRecipe;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmInput> inputs;
    private List<AlgorithmStandardizerStep> standardizerRecipe;
    private String label;

    private Builder(AlgorithmStandardizer algorithmStandardizer) {
      this.inputs = algorithmStandardizer.inputs;
      this.standardizerRecipe = algorithmStandardizer.standardizerRecipe;
      this.label = algorithmStandardizer.label;
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
     * @param standardizerRecipe the standardizerRecipe
     * @param label the label
     */
    public Builder(List<AlgorithmInput> inputs, List<AlgorithmStandardizerStep> standardizerRecipe, String label) {
      this.inputs = inputs;
      this.standardizerRecipe = standardizerRecipe;
      this.label = label;
    }

    /**
     * Builds a AlgorithmStandardizer.
     *
     * @return the new AlgorithmStandardizer instance
     */
    public AlgorithmStandardizer build() {
      return new AlgorithmStandardizer(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmStandardizer builder
     */
    public Builder addInputs(AlgorithmInput inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<AlgorithmInput>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an standardizerRecipe to standardizerRecipe.
     *
     * @param standardizerRecipe the new standardizerRecipe
     * @return the AlgorithmStandardizer builder
     */
    public Builder addStandardizerRecipe(AlgorithmStandardizerStep standardizerRecipe) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(standardizerRecipe,
        "standardizerRecipe cannot be null");
      if (this.standardizerRecipe == null) {
        this.standardizerRecipe = new ArrayList<AlgorithmStandardizerStep>();
      }
      this.standardizerRecipe.add(standardizerRecipe);
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmStandardizer builder
     */
    public Builder inputs(List<AlgorithmInput> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the standardizerRecipe.
     * Existing standardizerRecipe will be replaced.
     *
     * @param standardizerRecipe the standardizerRecipe
     * @return the AlgorithmStandardizer builder
     */
    public Builder standardizerRecipe(List<AlgorithmStandardizerStep> standardizerRecipe) {
      this.standardizerRecipe = standardizerRecipe;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmStandardizer builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected AlgorithmStandardizer(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputs,
      "inputs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.standardizerRecipe,
      "standardizerRecipe cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    inputs = builder.inputs;
    standardizerRecipe = builder.standardizerRecipe;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmStandardizer builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for standardization.
   *
   * @return the inputs
   */
  public List<AlgorithmInput> inputs() {
    return inputs;
  }

  /**
   * Gets the standardizerRecipe.
   *
   * Collection of standardizer steps.
   *
   * @return the standardizerRecipe
   */
  public List<AlgorithmStandardizerStep> standardizerRecipe() {
    return standardizerRecipe;
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
}

