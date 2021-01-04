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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Entity size statistics.
 */
public class GetSummaryResponseEntitySizeStats extends GenericModel {

  protected Float average;
  protected Float variance;
  @SerializedName("standard_deviation")
  protected Float standardDeviation;
  protected Long count;
  protected Long min;
  protected Long max;

  /**
   * Gets the average.
   *
   * Average value of all entity sizes.
   *
   * @return the average
   */
  public Float getAverage() {
    return average;
  }

  /**
   * Gets the variance.
   *
   * Variance of all entity sizes.
   *
   * @return the variance
   */
  public Float getVariance() {
    return variance;
  }

  /**
   * Gets the standardDeviation.
   *
   * Standard deviation of all entity sizes.
   *
   * @return the standardDeviation
   */
  public Float getStandardDeviation() {
    return standardDeviation;
  }

  /**
   * Gets the count.
   *
   * Total number of entities.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the min.
   *
   * Size of the smallest entity.
   *
   * @return the min
   */
  public Long getMin() {
    return min;
  }

  /**
   * Gets the max.
   *
   * Size of the largest entity.
   *
   * @return the max
   */
  public Long getMax() {
    return max;
  }
}

