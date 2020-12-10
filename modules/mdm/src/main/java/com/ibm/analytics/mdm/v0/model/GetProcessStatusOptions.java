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
 * The getProcessStatus options.
 */
public class GetProcessStatusOptions extends GenericModel {

  protected String status;
  protected String crn;
  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String status;
    private String crn;
    private String recordType;

    private Builder(GetProcessStatusOptions getProcessStatusOptions) {
      this.status = getProcessStatusOptions.status;
      this.crn = getProcessStatusOptions.crn;
      this.recordType = getProcessStatusOptions.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param status the status
     * @param crn the crn
     */
    public Builder(String status, String crn) {
      this.status = status;
      this.crn = crn;
    }

    /**
     * Builds a GetProcessStatusOptions.
     *
     * @return the new GetProcessStatusOptions instance
     */
    public GetProcessStatusOptions build() {
      return new GetProcessStatusOptions(this);
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the GetProcessStatusOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GetProcessStatusOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetProcessStatusOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected GetProcessStatusOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.status,
      "status cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    status = builder.status;
    crn = builder.crn;
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a GetProcessStatusOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the status.
   *
   * Unique status to identify the status type to be returned.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the crn.
   *
   * The cloud resource name of the service.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the recordType.
   *
   * Unique record type to identify data model attributes.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

