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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Provides information about a job.
 */
public class JobResponse extends GenericModel {

  /**
   * The current status of the process.
   */
  public interface Status {
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** prep. */
    String PREP = "prep";
    /** queued. */
    String QUEUED = "queued";
    /** running. */
    String RUNNING = "running";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
    /** canceled. */
    String CANCELED = "canceled";
  }

  /**
   * The job type of the process.
   */
  public interface JobType {
    /** upload. */
    String UPLOAD = "upload";
    /** match. */
    String MATCH = "match";
    /** delete. */
    String DELETE = "delete";
    /** data_delete. */
    String DATA_DELETE = "data_delete";
    /** export. */
    String EXPORT = "export";
    /** search. */
    String SEARCH = "search";
    /** stats. */
    String STATS = "stats";
    /** reindex. */
    String REINDEX = "reindex";
    /** event_processing. */
    String EVENT_PROCESSING = "event_processing";
    /** bulk_load. */
    String BULK_LOAD = "bulk_load";
    /** sync. */
    String SYNC = "sync";
    /** cloudant_changes. */
    String CLOUDANT_CHANGES = "cloudant_changes";
    /** model_update. */
    String MODEL_UPDATE = "model_update";
    /** reset. */
    String RESET = "reset";
    /** schema_update. */
    String SCHEMA_UPDATE = "schema_update";
  }

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("start_time")
  protected Date startTime;
  @SerializedName("end_time")
  protected Date endTime;
  protected String status;
  @SerializedName("job_type")
  protected String jobType;
  @SerializedName("process_ids")
  protected List<String> processIds;

  /**
   * Gets the jobId.
   *
   * The id for the process.
   *
   * @return the jobId
   */
  public String getJobId() {
    return jobId;
  }

  /**
   * Gets the startTime.
   *
   * The timestamp of when the process started.
   *
   * @return the startTime
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * Gets the endTime.
   *
   * The timestamp of when the process completed.
   *
   * @return the endTime
   */
  public Date getEndTime() {
    return endTime;
  }

  /**
   * Gets the status.
   *
   * The current status of the process.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the jobType.
   *
   * The job type of the process.
   *
   * @return the jobType
   */
  public String getJobType() {
    return jobType;
  }

  /**
   * Gets the processIds.
   *
   * The list of identifiers for the job runs.
   *
   * @return the processIds
   */
  public List<String> getProcessIds() {
    return processIds;
  }
}

