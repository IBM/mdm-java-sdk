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
 * entity breakdown.
 */
public class EntityBreakdown extends GenericModel {

  @SerializedName("standard_deviation")
  protected String standardDeviation;
  protected String average;
  protected String variance;
  protected String count;
  protected String min;
  protected String max;

  /**
   * Gets the standardDeviation.
   *
   * standard deviation.
   *
   * @return the standardDeviation
   */
  public String getStandardDeviation() {
    return standardDeviation;
  }

  /**
   * Gets the average.
   *
   * average.
   *
   * @return the average
   */
  public String getAverage() {
    return average;
  }

  /**
   * Gets the variance.
   *
   * variance.
   *
   * @return the variance
   */
  public String getVariance() {
    return variance;
  }

  /**
   * Gets the count.
   *
   * count.
   *
   * @return the count
   */
  public String getCount() {
    return count;
  }

  /**
   * Gets the min.
   *
   * min.
   *
   * @return the min
   */
  public String getMin() {
    return min;
  }

  /**
   * Gets the max.
   *
   * max.
   *
   * @return the max
   */
  public String getMax() {
    return max;
  }
}

