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
 * Response object for asynchronous processing of a bulk job.
 */
public class PostJob extends GenericModel {

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("exit_code")
  protected Long exitCode;
  protected String arguments;
  @SerializedName("start_time")
  protected String startTime;
  @SerializedName("end_time")
  protected String endTime;
  @SerializedName("process_id")
  protected Long processId;

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

  /**
   * Gets the exitCode.
   *
   * The exit code of the job. 0 when successful, 1 when failed.
   *
   * @return the exitCode
   */
  public Long getExitCode() {
    return exitCode;
  }

  /**
   * Gets the arguments.
   *
   * Arguments passed for executing the job.
   *
   * @return the arguments
   */
  public String getArguments() {
    return arguments;
  }

  /**
   * Gets the startTime.
   *
   * The timestamp when a job was started.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the endTime.
   *
   * The timestamp when a job ended.
   *
   * @return the endTime
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Gets the processId.
   *
   * The identifier of a process as assigned by the spark.
   *
   * @return the processId
   */
  public Long getProcessId() {
    return processId;
  }
}

