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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object for asynchronous processing of a job.
 */
public class PostCloudJobResponse extends GenericModel {

  @SerializedName("job_name")
  protected String jobName;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("last_updated_at")
  protected String lastUpdatedAt;
  protected String status;
  protected String id;

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
   * Gets the status.
   *
   * Status of a job. One Of: Queued, Running, Completed, Failed, Canceled.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
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
}

