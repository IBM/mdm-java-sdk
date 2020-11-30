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
 * The getProjectMetadata options.
 */
public class GetProjectMetadataOptions extends GenericModel {

  protected String id;
  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String crn;

    private Builder(GetProjectMetadataOptions getProjectMetadataOptions) {
      this.id = getProjectMetadataOptions.id;
      this.crn = getProjectMetadataOptions.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param crn the crn
     */
    public Builder(String id, String crn) {
      this.id = id;
      this.crn = crn;
    }

    /**
     * Builds a GetProjectMetadataOptions.
     *
     * @return the new GetProjectMetadataOptions instance
     */
    public GetProjectMetadataOptions build() {
      return new GetProjectMetadataOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetProjectMetadataOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the GetProjectMetadataOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected GetProjectMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    id = builder.id;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a GetProjectMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Unique identifier of project_metadata.
   *
   * @return the id
   */
  public String id() {
    return id;
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

