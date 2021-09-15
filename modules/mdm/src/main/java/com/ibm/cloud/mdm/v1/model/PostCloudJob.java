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
package com.ibm.cloud.mdm.v1.model;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Response object for asynchronous processing of a job.
 */
public class PostCloudJob extends DynamicModel<Object> {

  @SerializedName("job_name")
  protected String jobName;
  @SerializedName("last_updated_at")
  protected String lastUpdatedAt;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("status")
  protected String status;
  @SerializedName("id")
  protected String id;

  public PostCloudJob() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the jobName.
   *
   * System defined name of a given job e.g. match-bulkderiver.
   *
   * @return the jobName
   */
  public String getJobName() {
    return this.jobName;
  }

  /**
   * Gets the lastUpdatedAt.
   *
   * System generated timestamp when a job was last updated.
   *
   * @return the lastUpdatedAt
   */
  public String getLastUpdatedAt() {
    return this.lastUpdatedAt;
  }

  /**
   * Gets the createdAt.
   *
   * System generated timestamp when a job was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the status.
   *
   * Status of a job. One Of: Queued, Running, Completed, Failed, Canceled.
   *
   * @return the status
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Gets the id.
   *
   * System generated identifier of a job.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }
}
