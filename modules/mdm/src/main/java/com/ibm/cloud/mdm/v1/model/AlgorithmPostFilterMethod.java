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
 * A single post_filter_method definition.
 */
public class AlgorithmPostFilterMethod extends GenericModel {

  @SerializedName("filter_recipe")
  protected List<AlgorithmPostFilterStep> filterRecipe;
  protected List<AlgorithmPostFilterMethodInput> inputs;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmPostFilterStep> filterRecipe;
    private List<AlgorithmPostFilterMethodInput> inputs;
    private String label;

    private Builder(AlgorithmPostFilterMethod algorithmPostFilterMethod) {
      this.filterRecipe = algorithmPostFilterMethod.filterRecipe;
      this.inputs = algorithmPostFilterMethod.inputs;
      this.label = algorithmPostFilterMethod.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param filterRecipe the filterRecipe
     * @param inputs the inputs
     * @param label the label
     */
    public Builder(List<AlgorithmPostFilterStep> filterRecipe, List<AlgorithmPostFilterMethodInput> inputs, String label) {
      this.filterRecipe = filterRecipe;
      this.inputs = inputs;
      this.label = label;
    }

    /**
     * Builds a AlgorithmPostFilterMethod.
     *
     * @return the new AlgorithmPostFilterMethod instance
     */
    public AlgorithmPostFilterMethod build() {
      return new AlgorithmPostFilterMethod(this);
    }

    /**
     * Adds an filterRecipe to filterRecipe.
     *
     * @param filterRecipe the new filterRecipe
     * @return the AlgorithmPostFilterMethod builder
     */
    public Builder addFilterRecipe(AlgorithmPostFilterStep filterRecipe) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filterRecipe,
        "filterRecipe cannot be null");
      if (this.filterRecipe == null) {
        this.filterRecipe = new ArrayList<AlgorithmPostFilterStep>();
      }
      this.filterRecipe.add(filterRecipe);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmPostFilterMethod builder
     */
    public Builder addInputs(AlgorithmPostFilterMethodInput inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<AlgorithmPostFilterMethodInput>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Set the filterRecipe.
     * Existing filterRecipe will be replaced.
     *
     * @param filterRecipe the filterRecipe
     * @return the AlgorithmPostFilterMethod builder
     */
    public Builder filterRecipe(List<AlgorithmPostFilterStep> filterRecipe) {
      this.filterRecipe = filterRecipe;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmPostFilterMethod builder
     */
    public Builder inputs(List<AlgorithmPostFilterMethodInput> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmPostFilterMethod builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected AlgorithmPostFilterMethod() { }

  protected AlgorithmPostFilterMethod(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.filterRecipe,
      "filterRecipe cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputs,
      "inputs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    filterRecipe = builder.filterRecipe;
    inputs = builder.inputs;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmPostFilterMethod builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the filterRecipe.
   *
   * Collection of post filter steps.
   *
   * @return the filterRecipe
   */
  public List<AlgorithmPostFilterStep> filterRecipe() {
    return filterRecipe;
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for post_filter_method.
   *
   * @return the inputs
   */
  public List<AlgorithmPostFilterMethodInput> inputs() {
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
}

