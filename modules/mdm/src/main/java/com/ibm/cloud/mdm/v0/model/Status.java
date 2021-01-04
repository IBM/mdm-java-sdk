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
 * status.
 */
public class Status extends GenericModel {

  @SerializedName("date_completed")
  protected String dateCompleted;
  @SerializedName("comparison_count")
  protected String comparisonCount;
  @SerializedName("bucket_count")
  protected String bucketCount;
  @SerializedName("run_time")
  protected String runTime;

  /**
   * Gets the dateCompleted.
   *
   * date of last matching completed.
   *
   * @return the dateCompleted
   */
  public String getDateCompleted() {
    return dateCompleted;
  }

  /**
   * Gets the comparisonCount.
   *
   * comparison count.
   *
   * @return the comparisonCount
   */
  public String getComparisonCount() {
    return comparisonCount;
  }

  /**
   * Gets the bucketCount.
   *
   * bucket count.
   *
   * @return the bucketCount
   */
  public String getBucketCount() {
    return bucketCount;
  }

  /**
   * Gets the runTime.
   *
   * total time required to run match.
   *
   * @return the runTime
   */
  public String getRunTime() {
    return runTime;
  }
}

