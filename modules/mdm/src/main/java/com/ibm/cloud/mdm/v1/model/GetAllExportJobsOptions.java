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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getAllExportJobs options.
 */
public class GetAllExportJobsOptions extends GenericModel {

  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing GetAllExportJobsOptions instance.
     *
     * @param getAllExportJobsOptions the instance to initialize the Builder with
     */
    private Builder(GetAllExportJobsOptions getAllExportJobsOptions) {
      this.offset = getAllExportJobsOptions.offset;
      this.limit = getAllExportJobsOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetAllExportJobsOptions.
     *
     * @return the new GetAllExportJobsOptions instance
     */
    public GetAllExportJobsOptions build() {
      return new GetAllExportJobsOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetAllExportJobsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetAllExportJobsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetAllExportJobsOptions() { }

  protected GetAllExportJobsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetAllExportJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of records to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of records to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

