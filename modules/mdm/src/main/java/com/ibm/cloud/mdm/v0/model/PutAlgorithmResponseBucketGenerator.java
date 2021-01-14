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
package com.ibm.cloud.mdm.v0.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A single bucket generator.
 */
public class PutAlgorithmResponseBucketGenerator extends DynamicModel<Object> {

  @SerializedName("bucket_group_recipe")
  protected List<PutAlgorithmResponseBucketGroupStep> bucketGroupRecipe;
  @SerializedName("maximum_bucket_size")
  protected Long maximumBucketSize;
  @SerializedName("bucket_recipe")
  protected List<PutAlgorithmResponseBucketStep> bucketRecipe;
  @SerializedName("inputs")
  protected List<PutAlgorithmResponseInput> inputs;
  @SerializedName("label")
  protected String label;

  public PutAlgorithmResponseBucketGenerator() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the bucketGroupRecipe.
   *
   * Collection of bucket group generator steps.
   *
   * @return the bucketGroupRecipe
   */
  public List<PutAlgorithmResponseBucketGroupStep> getBucketGroupRecipe() {
    return this.bucketGroupRecipe;
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
   * Gets the bucketRecipe.
   *
   * Collection of bucket generator steps.
   *
   * @return the bucketRecipe
   */
  public List<PutAlgorithmResponseBucketStep> getBucketRecipe() {
    return this.bucketRecipe;
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for bucket generator.
   *
   * @return the inputs
   */
  public List<PutAlgorithmResponseInput> getInputs() {
    return this.inputs;
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
}
