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
 * A single compare method.
 */
public class AlgorithmMethods extends GenericModel {

  protected List<AlgorithmInput> inputs;
  @SerializedName("compare_recipe")
  protected List<AlgorithmCompareStep> compareRecipe;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmInput> inputs;
    private List<AlgorithmCompareStep> compareRecipe;

    private Builder(AlgorithmMethods algorithmMethods) {
      this.inputs = algorithmMethods.inputs;
      this.compareRecipe = algorithmMethods.compareRecipe;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AlgorithmMethods.
     *
     * @return the new AlgorithmMethods instance
     */
    public AlgorithmMethods build() {
      return new AlgorithmMethods(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmMethods builder
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
     * Adds an compareRecipe to compareRecipe.
     *
     * @param compareRecipe the new compareRecipe
     * @return the AlgorithmMethods builder
     */
    public Builder addCompareRecipe(AlgorithmCompareStep compareRecipe) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(compareRecipe,
        "compareRecipe cannot be null");
      if (this.compareRecipe == null) {
        this.compareRecipe = new ArrayList<AlgorithmCompareStep>();
      }
      this.compareRecipe.add(compareRecipe);
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmMethods builder
     */
    public Builder inputs(List<AlgorithmInput> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the compareRecipe.
     * Existing compareRecipe will be replaced.
     *
     * @param compareRecipe the compareRecipe
     * @return the AlgorithmMethods builder
     */
    public Builder compareRecipe(List<AlgorithmCompareStep> compareRecipe) {
      this.compareRecipe = compareRecipe;
      return this;
    }
  }

  protected AlgorithmMethods(Builder builder) {
    inputs = builder.inputs;
    compareRecipe = builder.compareRecipe;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmMethods builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for this method.
   *
   * @return the inputs
   */
  public List<AlgorithmInput> inputs() {
    return inputs;
  }

  /**
   * Gets the compareRecipe.
   *
   * Collection of compare method steps.
   *
   * @return the compareRecipe
   */
  public List<AlgorithmCompareStep> compareRecipe() {
    return compareRecipe;
  }
}

