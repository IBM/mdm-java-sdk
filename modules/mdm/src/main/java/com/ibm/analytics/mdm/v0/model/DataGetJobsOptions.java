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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataGetJobs options.
 */
public class DataGetJobsOptions extends GenericModel {

  /**
   * Filter by job status.
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
   * Filter by job type.
   */
  public interface Type {
    /** bulk_load. */
    String BULK_LOAD = "bulk_load";
    /** model_update. */
    String MODEL_UPDATE = "model_update";
    /** reset. */
    String RESET = "reset";
    /** schema_update. */
    String SCHEMA_UPDATE = "schema_update";
  }

  protected Long offset;
  protected Long limit;
  protected String status;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String status;
    private String type;

    private Builder(DataGetJobsOptions dataGetJobsOptions) {
      this.offset = dataGetJobsOptions.offset;
      this.limit = dataGetJobsOptions.limit;
      this.status = dataGetJobsOptions.status;
      this.type = dataGetJobsOptions.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataGetJobsOptions.
     *
     * @return the new DataGetJobsOptions instance
     */
    public DataGetJobsOptions build() {
      return new DataGetJobsOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the DataGetJobsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the DataGetJobsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the DataGetJobsOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DataGetJobsOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected DataGetJobsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    status = builder.status;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a DataGetJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of jobs to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of jobs to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the status.
   *
   * Filter by job status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the type.
   *
   * Filter by job type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

