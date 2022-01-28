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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a bulk load job.
 */
public class BulkLoadJob extends GenericModel {

  /**
   * The type of job.
   */
  public interface JobType {
    /** delete. */
    String DELETE = "delete";
    /** export. */
    String EXPORT = "export";
    /** bulk_load. */
    String BULK_LOAD = "bulk_load";
  }

  /**
   * The current status of the job.
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
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  /**
   * The current stage of the bulk load job.
   */
  public interface LoadStage {
    /** vertices. */
    String VERTICES = "vertices";
    /** edges. */
    String EDGES = "edges";
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  /**
   * The strategy for updating existing data during the bulk load job.
   */
  public interface UpdateStrategy {
    /** append. */
    String APPEND = "append";
    /** replace. */
    String REPLACE = "replace";
  }

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("job_type")
  protected String jobType;
  protected String status;
  @SerializedName("start_time")
  protected Date startTime;
  @SerializedName("end_time")
  protected Date endTime;
  @SerializedName("process_ids")
  protected List<String> processIds;
  @SerializedName("load_stage")
  protected String loadStage;
  @SerializedName("update_strategy")
  protected String updateStrategy;

  /**
   * Gets the jobId.
   *
   * The id for the job.
   *
   * @return the jobId
   */
  public String getJobId() {
    return jobId;
  }

  /**
   * Gets the jobType.
   *
   * The type of job.
   *
   * @return the jobType
   */
  public String getJobType() {
    return jobType;
  }

  /**
   * Gets the status.
   *
   * The current status of the job.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the startTime.
   *
   * The timestamp of when the job started.
   *
   * @return the startTime
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * Gets the endTime.
   *
   * The timestamp of when the job completed.
   *
   * @return the endTime
   */
  public Date getEndTime() {
    return endTime;
  }

  /**
   * Gets the processIds.
   *
   * The list of identifiers for the job runs or processes.
   *
   * @return the processIds
   */
  public List<String> getProcessIds() {
    return processIds;
  }

  /**
   * Gets the loadStage.
   *
   * The current stage of the bulk load job.
   *
   * @return the loadStage
   */
  public String getLoadStage() {
    return loadStage;
  }

  /**
   * Gets the updateStrategy.
   *
   * The strategy for updating existing data during the bulk load job.
   *
   * @return the updateStrategy
   */
  public String getUpdateStrategy() {
    return updateStrategy;
  }
}

