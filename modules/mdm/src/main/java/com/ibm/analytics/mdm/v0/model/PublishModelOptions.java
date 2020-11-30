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
 * The publishModel options.
 */
public class PublishModelOptions extends GenericModel {

  protected String projectId;
  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String crn;

    private Builder(PublishModelOptions publishModelOptions) {
      this.projectId = publishModelOptions.projectId;
      this.crn = publishModelOptions.crn;
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
     */
    public Builder(String projectId, String crn) {
      this.projectId = projectId;
      this.crn = crn;
    }

    /**
     * Builds a PublishModelOptions.
     *
     * @return the new PublishModelOptions instance
     */
    public PublishModelOptions build() {
      return new PublishModelOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the PublishModelOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the PublishModelOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected PublishModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    projectId = builder.projectId;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a PublishModelOptions builder
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
}

