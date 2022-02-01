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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A single bucket generator.
 */
public class AlgorithmBucketGenerator extends DynamicModel<Object> {

  @SerializedName("label")
  protected String label;
  @SerializedName("bucket_recipe")
  protected List<AlgorithmBucketStep> bucketRecipe;
  @SerializedName("bucket_group_recipe")
  protected List<AlgorithmBucketGroupStep> bucketGroupRecipe;
  @SerializedName("maximum_bucket_size")
  protected Long maximumBucketSize;
  @SerializedName("inputs")
  protected List<AlgorithmInput> inputs;

  public AlgorithmBucketGenerator() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private List<AlgorithmBucketStep> bucketRecipe;
    private List<AlgorithmBucketGroupStep> bucketGroupRecipe;
    private Long maximumBucketSize;
    private List<AlgorithmInput> inputs;
    private Map<String, Object> dynamicProperties;

    private Builder(AlgorithmBucketGenerator algorithmBucketGenerator) {
      this.label = algorithmBucketGenerator.label;
      this.bucketRecipe = algorithmBucketGenerator.bucketRecipe;
      this.bucketGroupRecipe = algorithmBucketGenerator.bucketGroupRecipe;
      this.maximumBucketSize = algorithmBucketGenerator.maximumBucketSize;
      this.inputs = algorithmBucketGenerator.inputs;
      this.dynamicProperties = algorithmBucketGenerator.getProperties();
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
     * @param maximumBucketSize the maximumBucketSize
     */
    public Builder(String label, Long maximumBucketSize) {
      this.label = label;
      this.maximumBucketSize = maximumBucketSize;
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
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder label(String label) {
      this.label = label;
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
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the AlgorithmBucketGenerator builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected AlgorithmBucketGenerator(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maximumBucketSize,
      "maximumBucketSize cannot be null");
    label = builder.label;
    bucketRecipe = builder.bucketRecipe;
    bucketGroupRecipe = builder.bucketGroupRecipe;
    maximumBucketSize = builder.maximumBucketSize;
    inputs = builder.inputs;
    this.setProperties(builder.dynamicProperties);
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
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Sets the label.
   *
   * @param label the new label
   */
  public void setLabel(final String label) {
    this.label = label;
  }

  /**
   * Gets the bucketRecipe.
   *
   * Collection of bucket generator steps.
   *
   * @return the bucketRecipe
   */
  public List<AlgorithmBucketStep> getBucketRecipe() {
    return this.bucketRecipe;
  }

  /**
   * Sets the bucketRecipe.
   *
   * @param bucketRecipe the new bucketRecipe
   */
  public void setBucketRecipe(final List<AlgorithmBucketStep> bucketRecipe) {
    this.bucketRecipe = bucketRecipe;
  }

  /**
   * Gets the bucketGroupRecipe.
   *
   * Collection of bucket group generator steps.
   *
   * @return the bucketGroupRecipe
   */
  public List<AlgorithmBucketGroupStep> getBucketGroupRecipe() {
    return this.bucketGroupRecipe;
  }

  /**
   * Sets the bucketGroupRecipe.
   *
   * @param bucketGroupRecipe the new bucketGroupRecipe
   */
  public void setBucketGroupRecipe(final List<AlgorithmBucketGroupStep> bucketGroupRecipe) {
    this.bucketGroupRecipe = bucketGroupRecipe;
  }

  /**
   * Gets the maximumBucketSize.
   *
   * An integer value indicating maximum size of any buckets of this type.
   *
   * @return the maximumBucketSize
   */
  public Long getMaximumBucketSize() {
    return this.maximumBucketSize;
  }

  /**
   * Sets the maximumBucketSize.
   *
   * @param maximumBucketSize the new maximumBucketSize
   */
  public void setMaximumBucketSize(final long maximumBucketSize) {
    this.maximumBucketSize = maximumBucketSize;
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for bucket generator.
   *
   * @return the inputs
   */
  public List<AlgorithmInput> getInputs() {
    return this.inputs;
  }

  /**
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<AlgorithmInput> inputs) {
    this.inputs = inputs;
  }
}
