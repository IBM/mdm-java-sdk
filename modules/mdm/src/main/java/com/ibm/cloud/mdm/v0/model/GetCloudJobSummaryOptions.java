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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getCloudJobSummary options.
 */
public class GetCloudJobSummaryOptions extends GenericModel {

  protected String jobId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;

    private Builder(GetCloudJobSummaryOptions getCloudJobSummaryOptions) {
      this.jobId = getCloudJobSummaryOptions.jobId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     */
    public Builder(String jobId) {
      this.jobId = jobId;
    }

    /**
     * Builds a GetCloudJobSummaryOptions.
     *
     * @return the new GetCloudJobSummaryOptions instance
     */
    public GetCloudJobSummaryOptions build() {
      return new GetCloudJobSummaryOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetCloudJobSummaryOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }
  }

  protected GetCloudJobSummaryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jobId,
      "jobId cannot be null");
    jobId = builder.jobId;
  }

  /**
   * New builder.
   *
   * @return a GetCloudJobSummaryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * The unique identifier of a job as assigned by the system.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }
}

