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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The breakdown statistics of entities generated by match process.
 */
public class EntityBreakdown extends GenericModel {

  protected Double count;
  protected Double min;
  protected Double max;
  protected Double variance;
  protected Double average;
  @SerializedName("standard_deviation")
  protected Double standardDeviation;

  protected EntityBreakdown() { }

  /**
   * Gets the count.
   *
   * The count of the entities.
   *
   * @return the count
   */
  public Double getCount() {
    return count;
  }

  /**
   * Gets the min.
   *
   * The minimum size of the entity.
   *
   * @return the min
   */
  public Double getMin() {
    return min;
  }

  /**
   * Gets the max.
   *
   * The maximum size of the entity.
   *
   * @return the max
   */
  public Double getMax() {
    return max;
  }

  /**
   * Gets the variance.
   *
   * The variance of the entity sizes.
   *
   * @return the variance
   */
  public Double getVariance() {
    return variance;
  }

  /**
   * Gets the average.
   *
   * The average of the entity sizes.
   *
   * @return the average
   */
  public Double getAverage() {
    return average;
  }

  /**
   * Gets the standardDeviation.
   *
   * The standard deviation of the entity sizes.
   *
   * @return the standardDeviation
   */
  public Double getStandardDeviation() {
    return standardDeviation;
  }
}

