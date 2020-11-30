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
 * The bulkLoad options.
 */
public class BulkLoadOptions extends GenericModel {

  protected String projectId;
  protected String crn;
  protected PublishDataRequestCosDetails cosDetails;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String crn;
    private PublishDataRequestCosDetails cosDetails;

    private Builder(BulkLoadOptions bulkLoadOptions) {
      this.projectId = bulkLoadOptions.projectId;
      this.crn = bulkLoadOptions.crn;
      this.cosDetails = bulkLoadOptions.cosDetails;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param crn the crn
     * @param cosDetails the cosDetails
     */
    public Builder(String projectId, String crn, PublishDataRequestCosDetails cosDetails) {
      this.projectId = projectId;
      this.crn = crn;
      this.cosDetails = cosDetails;
    }

    /**
     * Builds a BulkLoadOptions.
     *
     * @return the new BulkLoadOptions instance
     */
    public BulkLoadOptions build() {
      return new BulkLoadOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the BulkLoadOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the BulkLoadOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the cosDetails.
     *
     * @param cosDetails the cosDetails
     * @return the BulkLoadOptions builder
     */
    public Builder cosDetails(PublishDataRequestCosDetails cosDetails) {
      this.cosDetails = cosDetails;
      return this;
    }
  }

  protected BulkLoadOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.projectId,
      "projectId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosDetails,
      "cosDetails cannot be null");
    projectId = builder.projectId;
    crn = builder.crn;
    cosDetails = builder.cosDetails;
  }

  /**
   * New builder.
   *
   * @return a BulkLoadOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * Unique identifier of project_metadata.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
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
   * Gets the cosDetails.
   *
   * cos details for asset sources.
   *
   * @return the cosDetails
   */
  public PublishDataRequestCosDetails cosDetails() {
    return cosDetails;
  }
}

