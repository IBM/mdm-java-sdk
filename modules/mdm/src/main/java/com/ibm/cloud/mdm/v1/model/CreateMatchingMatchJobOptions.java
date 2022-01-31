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
 * The createMatchingMatchJob options.
 */
public class CreateMatchingMatchJobOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Boolean doForce;
  protected Boolean doDeduplicate;
  protected Boolean doAnalytics;
  protected Boolean doReplicate;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;
  protected String logCosEndpoint;
  protected String logCosBucket;
  protected String logCosAccessKey;
  protected String logCosSecretKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Boolean doForce;
    private Boolean doDeduplicate;
    private Boolean doAnalytics;
    private Boolean doReplicate;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;
    private String logCosEndpoint;
    private String logCosBucket;
    private String logCosAccessKey;
    private String logCosSecretKey;

    private Builder(CreateMatchingMatchJobOptions createMatchingMatchJobOptions) {
      this.recordType = createMatchingMatchJobOptions.recordType;
      this.entityType = createMatchingMatchJobOptions.entityType;
      this.doForce = createMatchingMatchJobOptions.doForce;
      this.doDeduplicate = createMatchingMatchJobOptions.doDeduplicate;
      this.doAnalytics = createMatchingMatchJobOptions.doAnalytics;
      this.doReplicate = createMatchingMatchJobOptions.doReplicate;
      this.executorCount = createMatchingMatchJobOptions.executorCount;
      this.executorMemory = createMatchingMatchJobOptions.executorMemory;
      this.executorCoreCount = createMatchingMatchJobOptions.executorCoreCount;
      this.sparkParallelism = createMatchingMatchJobOptions.sparkParallelism;
      this.logCosEndpoint = createMatchingMatchJobOptions.logCosEndpoint;
      this.logCosBucket = createMatchingMatchJobOptions.logCosBucket;
      this.logCosAccessKey = createMatchingMatchJobOptions.logCosAccessKey;
      this.logCosSecretKey = createMatchingMatchJobOptions.logCosSecretKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateMatchingMatchJobOptions.
     *
     * @return the new CreateMatchingMatchJobOptions instance
     */
    public CreateMatchingMatchJobOptions build() {
      return new CreateMatchingMatchJobOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the doForce.
     *
     * @param doForce the doForce
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder doForce(Boolean doForce) {
      this.doForce = doForce;
      return this;
    }

    /**
     * Set the doDeduplicate.
     *
     * @param doDeduplicate the doDeduplicate
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder doDeduplicate(Boolean doDeduplicate) {
      this.doDeduplicate = doDeduplicate;
      return this;
    }

    /**
     * Set the doAnalytics.
     *
     * @param doAnalytics the doAnalytics
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder doAnalytics(Boolean doAnalytics) {
      this.doAnalytics = doAnalytics;
      return this;
    }

    /**
     * Set the doReplicate.
     *
     * @param doReplicate the doReplicate
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder doReplicate(Boolean doReplicate) {
      this.doReplicate = doReplicate;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }

    /**
     * Set the logCosEndpoint.
     *
     * @param logCosEndpoint the logCosEndpoint
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder logCosEndpoint(String logCosEndpoint) {
      this.logCosEndpoint = logCosEndpoint;
      return this;
    }

    /**
     * Set the logCosBucket.
     *
     * @param logCosBucket the logCosBucket
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder logCosBucket(String logCosBucket) {
      this.logCosBucket = logCosBucket;
      return this;
    }

    /**
     * Set the logCosAccessKey.
     *
     * @param logCosAccessKey the logCosAccessKey
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder logCosAccessKey(String logCosAccessKey) {
      this.logCosAccessKey = logCosAccessKey;
      return this;
    }

    /**
     * Set the logCosSecretKey.
     *
     * @param logCosSecretKey the logCosSecretKey
     * @return the CreateMatchingMatchJobOptions builder
     */
    public Builder logCosSecretKey(String logCosSecretKey) {
      this.logCosSecretKey = logCosSecretKey;
      return this;
    }
  }

  protected CreateMatchingMatchJobOptions(Builder builder) {
    recordType = builder.recordType;
    entityType = builder.entityType;
    doForce = builder.doForce;
    doDeduplicate = builder.doDeduplicate;
    doAnalytics = builder.doAnalytics;
    doReplicate = builder.doReplicate;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
    logCosEndpoint = builder.logCosEndpoint;
    logCosBucket = builder.logCosBucket;
    logCosAccessKey = builder.logCosAccessKey;
    logCosSecretKey = builder.logCosSecretKey;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingMatchJobOptions builder
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
   * Gets the doForce.
   *
   * Force to re-match all records, default is false.
   *
   * @return the doForce
   */
  public Boolean doForce() {
    return doForce;
  }

  /**
   * Gets the doDeduplicate.
   *
   * Deduplicate pairs, default is false.
   *
   * @return the doDeduplicate
   */
  public Boolean doDeduplicate() {
    return doDeduplicate;
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
   * Gets the sparkParallelism.
   *
   * The number of partitions to be used by spark.
   *
   * @return the sparkParallelism
   */
  public Long sparkParallelism() {
    return sparkParallelism;
  }

  /**
   * Gets the logCosEndpoint.
   *
   * IBM COS end point for job log storage.
   *
   * @return the logCosEndpoint
   */
  public String logCosEndpoint() {
    return logCosEndpoint;
  }

  /**
   * Gets the logCosBucket.
   *
   * IBM COS bucket for job log storage.
   *
   * @return the logCosBucket
   */
  public String logCosBucket() {
    return logCosBucket;
  }

  /**
   * Gets the logCosAccessKey.
   *
   * IBM COS access key for spark log storage.
   *
   * @return the logCosAccessKey
   */
  public String logCosAccessKey() {
    return logCosAccessKey;
  }

  /**
   * Gets the logCosSecretKey.
   *
   * IBM COS secret key for spark log storage.
   *
   * @return the logCosSecretKey
   */
  public String logCosSecretKey() {
    return logCosSecretKey;
  }
}

