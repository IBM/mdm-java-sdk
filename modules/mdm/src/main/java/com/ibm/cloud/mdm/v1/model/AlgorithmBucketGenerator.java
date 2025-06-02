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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A single bucket generator.
 *
 * This type supports additional properties of type Object.
 */
public class AlgorithmBucketGenerator extends DynamicModel<Object> {

  @SerializedName("bucket_group_recipe")
  protected List<AlgorithmBucketGroupStep> bucketGroupRecipe;
  @SerializedName("inputs")
  protected List<AlgorithmInput> inputs;
  @SerializedName("maximum_bucket_size")
  protected Long maximumBucketSize;
  @SerializedName("bucket_recipe")
  protected List<AlgorithmBucketStep> bucketRecipe;
  @SerializedName("label")
  protected String label;

  public AlgorithmBucketGenerator() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmBucketGroupStep> bucketGroupRecipe;
    private List<AlgorithmInput> inputs;
    private Long maximumBucketSize;
    private List<AlgorithmBucketStep> bucketRecipe;
    private String label;
    private Map<String, Object> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing AlgorithmBucketGenerator instance.
     *
     * @param algorithmBucketGenerator the instance to initialize the Builder with
     */
    private Builder(AlgorithmBucketGenerator algorithmBucketGenerator) {
      this.bucketGroupRecipe = algorithmBucketGenerator.bucketGroupRecipe;
      this.inputs = algorithmBucketGenerator.inputs;
      this.maximumBucketSize = algorithmBucketGenerator.maximumBucketSize;
      this.bucketRecipe = algorithmBucketGenerator.bucketRecipe;
      this.label = algorithmBucketGenerator.label;
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
     * Adds a new element to bucketGroupRecipe.
     *
     * @param bucketGroupRecipe the new element to be added
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
     * Adds a new element to inputs.
     *
     * @param inputs the new element to be added
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
     * Adds a new element to bucketRecipe.
     *
     * @param bucketRecipe the new element to be added
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maximumBucketSize,
      "maximumBucketSize cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    bucketGroupRecipe = builder.bucketGroupRecipe;
    inputs = builder.inputs;
    maximumBucketSize = builder.maximumBucketSize;
    bucketRecipe = builder.bucketRecipe;
    label = builder.label;
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
}
