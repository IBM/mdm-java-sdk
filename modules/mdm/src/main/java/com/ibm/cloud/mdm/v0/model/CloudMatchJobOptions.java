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
 * The cloudMatchJob options.
 */
public class CloudMatchJobOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Boolean doReplicate;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Boolean doReplicate;

    private Builder(CloudMatchJobOptions cloudMatchJobOptions) {
      this.recordType = cloudMatchJobOptions.recordType;
      this.entityType = cloudMatchJobOptions.entityType;
      this.doReplicate = cloudMatchJobOptions.doReplicate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CloudMatchJobOptions.
     *
     * @return the new CloudMatchJobOptions instance
     */
    public CloudMatchJobOptions build() {
      return new CloudMatchJobOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CloudMatchJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CloudMatchJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the doReplicate.
     *
     * @param doReplicate the doReplicate
     * @return the CloudMatchJobOptions builder
     */
    public Builder doReplicate(Boolean doReplicate) {
      this.doReplicate = doReplicate;
      return this;
    }
  }

  protected CloudMatchJobOptions(Builder builder) {
    recordType = builder.recordType;
    entityType = builder.entityType;
    doReplicate = builder.doReplicate;
  }

  /**
   * New builder.
   *
   * @return a CloudMatchJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the doReplicate.
   *
   * Replicate entity id, default is false.
   *
   * @return the doReplicate
   */
  public Boolean doReplicate() {
    return doReplicate;
  }
}

