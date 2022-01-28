/*
 * (C) Copyright IBM Corp. 2022.
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
 * The createMatchingReportJob options.
 */
public class CreateMatchingReportJobOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected String jobList;
  protected Boolean doAnalytics;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private String jobList;
    private Boolean doAnalytics;

    private Builder(CreateMatchingReportJobOptions createMatchingReportJobOptions) {
      this.recordType = createMatchingReportJobOptions.recordType;
      this.entityType = createMatchingReportJobOptions.entityType;
      this.executorCount = createMatchingReportJobOptions.executorCount;
      this.executorMemory = createMatchingReportJobOptions.executorMemory;
      this.executorCoreCount = createMatchingReportJobOptions.executorCoreCount;
      this.jobList = createMatchingReportJobOptions.jobList;
      this.doAnalytics = createMatchingReportJobOptions.doAnalytics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateMatchingReportJobOptions.
     *
     * @return the new CreateMatchingReportJobOptions instance
     */
    public CreateMatchingReportJobOptions build() {
      return new CreateMatchingReportJobOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the jobList.
     *
     * @param jobList the jobList
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder jobList(String jobList) {
      this.jobList = jobList;
      return this;
    }

    /**
     * Set the doAnalytics.
     *
     * @param doAnalytics the doAnalytics
     * @return the CreateMatchingReportJobOptions builder
     */
    public Builder doAnalytics(Boolean doAnalytics) {
      this.doAnalytics = doAnalytics;
      return this;
    }
  }

  protected CreateMatchingReportJobOptions(Builder builder) {
    recordType = builder.recordType;
    entityType = builder.entityType;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    jobList = builder.jobList;
    doAnalytics = builder.doAnalytics;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingReportJobOptions builder
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
   * Gets the executorCount.
   *
   * The number of spark executors.
   *
   * @return the executorCount
   */
  public Long executorCount() {
    return executorCount;
  }

  /**
   * Gets the executorMemory.
   *
   * Amount of memory to use per executor process.
   *
   * @return the executorMemory
   */
  public String executorMemory() {
    return executorMemory;
  }

  /**
   * Gets the executorCoreCount.
   *
   * The number of cores to use on each executor.
   *
   * @return the executorCoreCount
   */
  public Long executorCoreCount() {
    return executorCoreCount;
  }

  /**
   * Gets the jobList.
   *
   * Comma separated analytics report identifier to be collected, ie. entity_summary, bucket_summary.
   *
   * @return the jobList
   */
  public String jobList() {
    return jobList;
  }

  /**
   * Gets the doAnalytics.
   *
   * collect analysis report, default is false.
   *
   * @return the doAnalytics
   */
  public Boolean doAnalytics() {
    return doAnalytics;
  }
}

