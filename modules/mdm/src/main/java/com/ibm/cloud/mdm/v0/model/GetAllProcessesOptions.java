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
 * The getAllProcesses options.
 */
public class GetAllProcessesOptions extends GenericModel {

  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;

    private Builder(GetAllProcessesOptions getAllProcessesOptions) {
      this.status = getAllProcessesOptions.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetAllProcessesOptions.
     *
     * @return the new GetAllProcessesOptions instance
     */
    public GetAllProcessesOptions build() {
      return new GetAllProcessesOptions(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the GetAllProcessesOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected GetAllProcessesOptions(Builder builder) {
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a GetAllProcessesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * Unique status param to get the processes based on it. i.e. Not-Initiated, In-progress, Complete and Error.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

