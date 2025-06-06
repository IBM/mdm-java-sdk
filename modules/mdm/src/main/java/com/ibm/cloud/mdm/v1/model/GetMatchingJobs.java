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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object for get matching job.
 */
public class GetMatchingJobs extends GenericModel {

  protected Map<String, Object> summary;
  protected String image;
  @SerializedName("job_name")
  protected String jobName;
  @SerializedName("last_updated_at")
  protected String lastUpdatedAt;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("started_at")
  protected String startedAt;
  protected String id;
  protected String status;

  protected GetMatchingJobs() { }

  /**
   * Gets the summary.
   *
   * Summary of a job.
   *
   * @return the summary
   */
  public Map<String, Object> getSummary() {
    return summary;
  }

  /**
   * Gets the image.
   *
   * System defined image for a given job e.g. mdm-spark-job.
   *
   * @return the image
   */
  public String getImage() {
    return image;
  }

  /**
   * Gets the jobName.
   *
   * System defined name of a given job e.g. match-bulkderiver.
   *
   * @return the jobName
   */
  public String getJobName() {
    return jobName;
  }

  /**
   * Gets the lastUpdatedAt.
   *
   * System generated timestamp when a job was last updated.
   *
   * @return the lastUpdatedAt
   */
  public String getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * Gets the createdAt.
   *
   * System generated timestamp when a job was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the startedAt.
   *
   * System generated timestamp when a job was started.
   *
   * @return the startedAt
   */
  public String getStartedAt() {
    return startedAt;
  }

  /**
   * Gets the id.
   *
   * System generated identifier of a job.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the status.
   *
   * Status of a job. One Of: Queued, Running, Completed, Failed, Canceled.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

