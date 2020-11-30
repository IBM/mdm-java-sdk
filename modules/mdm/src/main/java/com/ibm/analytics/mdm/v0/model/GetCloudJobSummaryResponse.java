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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for the summary of a processed job.
 */
public class GetCloudJobSummaryResponse extends GenericModel {

  protected Map<String, Object> metrics;
  @SerializedName("job_id")
  protected String jobId;

  /**
   * Gets the metrics.
   *
   * Collection of key value pairs representing key metrics of a given job.
   *
   * @return the metrics
   */
  public Map<String, Object> getMetrics() {
    return metrics;
  }

  /**
   * Gets the jobId.
   *
   * The unique identifier of a job as assigned by the system.
   *
   * @return the jobId
   */
  public String getJobId() {
    return jobId;
  }
}

