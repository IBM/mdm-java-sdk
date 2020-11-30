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
 * The suggestMatchingAttributes options.
 */
public class SuggestMatchingAttributesOptions extends GenericModel {

  protected String projectId;
  protected String recordType;
  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String recordType;
    private String crn;

    private Builder(SuggestMatchingAttributesOptions suggestMatchingAttributesOptions) {
      this.projectId = suggestMatchingAttributesOptions.projectId;
      this.recordType = suggestMatchingAttributesOptions.recordType;
      this.crn = suggestMatchingAttributesOptions.crn;
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
     * @param recordType the recordType
     * @param crn the crn
     */
    public Builder(String projectId, String recordType, String crn) {
      this.projectId = projectId;
      this.recordType = recordType;
      this.crn = crn;
    }

    /**
     * Builds a SuggestMatchingAttributesOptions.
     *
     * @return the new SuggestMatchingAttributesOptions instance
     */
    public SuggestMatchingAttributesOptions build() {
      return new SuggestMatchingAttributesOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the SuggestMatchingAttributesOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the SuggestMatchingAttributesOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the SuggestMatchingAttributesOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected SuggestMatchingAttributesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    projectId = builder.projectId;
    recordType = builder.recordType;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a SuggestMatchingAttributesOptions builder
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
   * Gets the recordType.
   *
   * Record type for matching attribute suggestions.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
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

