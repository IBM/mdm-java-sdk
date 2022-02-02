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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The status of match process execution.
 */
public class Status extends GenericModel {

  @SerializedName("date_completed")
  protected String dateCompleted;
  @SerializedName("comparison_count")
  protected Long comparisonCount;
  @SerializedName("bucket_count")
  protected Long bucketCount;
  @SerializedName("run_time")
  protected Long runTime;

  /**
   * Gets the dateCompleted.
   *
   * The match process execution completion date.
   *
   * @return the dateCompleted
   */
  public String getDateCompleted() {
    return dateCompleted;
  }

  /**
   * Gets the comparisonCount.
   *
   * Count of the comparisons made during match process.
   *
   * @return the comparisonCount
   */
  public Long getComparisonCount() {
    return comparisonCount;
  }

  /**
   * Gets the bucketCount.
   *
   * Count of the comparison buckets created during match process.
   *
   * @return the bucketCount
   */
  public Long getBucketCount() {
    return bucketCount;
  }

  /**
   * Gets the runTime.
   *
   * The total time consumed to run match process.
   *
   * @return the runTime
   */
  public Long getRunTime() {
    return runTime;
  }
}

