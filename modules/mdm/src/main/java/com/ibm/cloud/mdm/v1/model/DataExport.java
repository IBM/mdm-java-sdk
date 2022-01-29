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
 * Information about an export.
 */
public class DataExport extends GenericModel {

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
   * The type of data being exported.
   */
  public interface ExportType {
    /** record. */
    String RECORD = "record";
    /** entity. */
    String ENTITY = "entity";
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
  @SerializedName("export_type")
  protected String exportType;
  @SerializedName("file_name")
  protected String fileName;
  @SerializedName("file_expired")
  protected Boolean fileExpired;
  @SerializedName("search_criteria")
  protected DataSearchCriteria searchCriteria;

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
   * Gets the exportType.
   *
   * The type of data being exported.
   *
   * @return the exportType
   */
  public String getExportType() {
    return exportType;
  }

  /**
   * Gets the fileName.
   *
   * The name of the export file.
   *
   * @return the fileName
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Gets the fileExpired.
   *
   * Whether the export file is expired.
   *
   * @return the fileExpired
   */
  public Boolean isFileExpired() {
    return fileExpired;
  }

  /**
   * Gets the searchCriteria.
   *
   * A set of criteria for a search operation.
   *
   * @return the searchCriteria
   */
  public DataSearchCriteria getSearchCriteria() {
    return searchCriteria;
  }
}

