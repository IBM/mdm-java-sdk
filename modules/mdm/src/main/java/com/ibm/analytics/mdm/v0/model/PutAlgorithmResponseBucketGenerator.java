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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single bucket generator.
 */
public class PutAlgorithmResponseBucketGenerator extends GenericModel {

  protected List<PutAlgorithmResponseInput> inputs;
  @SerializedName("bucket_recipe")
  protected List<PutAlgorithmResponseBucketStep> bucketRecipe;
  @SerializedName("bucket_group_recipe")
  protected List<PutAlgorithmResponseBucketGroupStep> bucketGroupRecipe;
  @SerializedName("maximum_bucket_size")
  protected Long maximumBucketSize;
  protected String label;

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for bucket generator.
   *
   * @return the inputs
   */
  public List<PutAlgorithmResponseInput> getInputs() {
    return inputs;
  }

  /**
   * Gets the bucketRecipe.
   *
   * Collection of bucket generator steps.
   *
   * @return the bucketRecipe
   */
  public List<PutAlgorithmResponseBucketStep> getBucketRecipe() {
    return bucketRecipe;
  }

  /**
   * Gets the bucketGroupRecipe.
   *
   * Collection of bucket group generator steps.
   *
   * @return the bucketGroupRecipe
   */
  public List<PutAlgorithmResponseBucketGroupStep> getBucketGroupRecipe() {
    return bucketGroupRecipe;
  }

  /**
   * Gets the maximumBucketSize.
   *
   * An integer value indicating maximum size of any buckets of this type.
   *
   * @return the maximumBucketSize
   */
  public Long getMaximumBucketSize() {
    return maximumBucketSize;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

