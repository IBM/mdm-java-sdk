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
 * A single bucket generator.
 */
public class AlgorithmBucketGenerator extends GenericModel {

  protected List<AlgorithmInput> inputs;
  @SerializedName("bucket_recipe")
  protected List<AlgorithmBucketStep> bucketRecipe;
  @SerializedName("bucket_group_recipe")
  protected List<AlgorithmBucketGroupStep> bucketGroupRecipe;
  @SerializedName("maximum_bucket_size")
  protected Long maximumBucketSize;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmInput> inputs;
    private List<AlgorithmBucketStep> bucketRecipe;
    private List<AlgorithmBucketGroupStep> bucketGroupRecipe;
    private Long maximumBucketSize;
    private String label;

    private Builder(AlgorithmBucketGenerator algorithmBucketGenerator) {
      this.inputs = algorithmBucketGenerator.inputs;
      this.bucketRecipe = algorithmBucketGenerator.bucketRecipe;
      this.bucketGroupRecipe = algorithmBucketGenerator.bucketGroupRecipe;
      this.maximumBucketSize = algorithmBucketGenerator.maximumBucketSize;
      this.label = algorithmBucketGenerator.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param maximumBucketSize the maximumBucketSize
     * @param label the label
     */
    public Builder(Long maximumBucketSize, String label) {
      this.maximumBucketSize = maximumBucketSize;
      this.label = label;
    }

    /**
     * Builds a AlgorithmBucketGenerator.
     *
     * @return the new AlgorithmBucketGenerator instance
     */
    public AlgorithmBucketGenerator build() {
      return new AlgorithmBucketGenerator(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmBucketGenerator builder
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
     * Adds an bucketRecipe to bucketRecipe.
     *
     * @param bucketRecipe the new bucketRecipe
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder addBucketRecipe(AlgorithmBucketStep bucketRecipe) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bucketRecipe,
        "bucketRecipe cannot be null");
      if (this.bucketRecipe == null) {
        this.bucketRecipe = new ArrayList<AlgorithmBucketStep>();
      }
      this.bucketRecipe.add(bucketRecipe);
      return this;
    }

    /**
     * Adds an bucketGroupRecipe to bucketGroupRecipe.
     *
     * @param bucketGroupRecipe the new bucketGroupRecipe
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder addBucketGroupRecipe(AlgorithmBucketGroupStep bucketGroupRecipe) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bucketGroupRecipe,
        "bucketGroupRecipe cannot be null");
      if (this.bucketGroupRecipe == null) {
        this.bucketGroupRecipe = new ArrayList<AlgorithmBucketGroupStep>();
      }
      this.bucketGroupRecipe.add(bucketGroupRecipe);
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder inputs(List<AlgorithmInput> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the bucketRecipe.
     * Existing bucketRecipe will be replaced.
     *
     * @param bucketRecipe the bucketRecipe
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder bucketRecipe(List<AlgorithmBucketStep> bucketRecipe) {
      this.bucketRecipe = bucketRecipe;
      return this;
    }

    /**
     * Set the bucketGroupRecipe.
     * Existing bucketGroupRecipe will be replaced.
     *
     * @param bucketGroupRecipe the bucketGroupRecipe
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder bucketGroupRecipe(List<AlgorithmBucketGroupStep> bucketGroupRecipe) {
      this.bucketGroupRecipe = bucketGroupRecipe;
      return this;
    }

    /**
     * Set the maximumBucketSize.
     *
     * @param maximumBucketSize the maximumBucketSize
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder maximumBucketSize(long maximumBucketSize) {
      this.maximumBucketSize = maximumBucketSize;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected AlgorithmBucketGenerator(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maximumBucketSize,
      "maximumBucketSize cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    inputs = builder.inputs;
    bucketRecipe = builder.bucketRecipe;
    bucketGroupRecipe = builder.bucketGroupRecipe;
    maximumBucketSize = builder.maximumBucketSize;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmBucketGenerator builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for bucket generator.
   *
   * @return the inputs
   */
  public List<AlgorithmInput> inputs() {
    return inputs;
  }

  /**
   * Gets the bucketRecipe.
   *
   * Collection of bucket generator steps.
   *
   * @return the bucketRecipe
   */
  public List<AlgorithmBucketStep> bucketRecipe() {
    return bucketRecipe;
  }

  /**
   * Gets the bucketGroupRecipe.
   *
   * Collection of bucket group generator steps.
   *
   * @return the bucketGroupRecipe
   */
  public List<AlgorithmBucketGroupStep> bucketGroupRecipe() {
    return bucketGroupRecipe;
  }

  /**
   * Gets the maximumBucketSize.
   *
   * An integer value indicating maximum size of any buckets of this type.
   *
   * @return the maximumBucketSize
   */
  public Long maximumBucketSize() {
    return maximumBucketSize;
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

