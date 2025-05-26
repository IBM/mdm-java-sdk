/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createMatchingImportRulesJob options.
 */
public class CreateMatchingImportRulesJobOptions extends GenericModel {

  protected String entityType;
  protected String recordType;
  protected String inputPath;
  protected String storageBucket;
  protected String storageEndpoint;
  protected String storageAccessKey;
  protected String storageSecretKey;
  protected Boolean doWait;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private String recordType;
    private String inputPath;
    private String storageBucket;
    private String storageEndpoint;
    private String storageAccessKey;
    private String storageSecretKey;
    private Boolean doWait;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;

    private Builder(CreateMatchingImportRulesJobOptions createMatchingImportRulesJobOptions) {
      this.entityType = createMatchingImportRulesJobOptions.entityType;
      this.recordType = createMatchingImportRulesJobOptions.recordType;
      this.inputPath = createMatchingImportRulesJobOptions.inputPath;
      this.storageBucket = createMatchingImportRulesJobOptions.storageBucket;
      this.storageEndpoint = createMatchingImportRulesJobOptions.storageEndpoint;
      this.storageAccessKey = createMatchingImportRulesJobOptions.storageAccessKey;
      this.storageSecretKey = createMatchingImportRulesJobOptions.storageSecretKey;
      this.doWait = createMatchingImportRulesJobOptions.doWait;
      this.executorCount = createMatchingImportRulesJobOptions.executorCount;
      this.executorMemory = createMatchingImportRulesJobOptions.executorMemory;
      this.executorCoreCount = createMatchingImportRulesJobOptions.executorCoreCount;
      this.sparkParallelism = createMatchingImportRulesJobOptions.sparkParallelism;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityType the entityType
     * @param recordType the recordType
     * @param inputPath the inputPath
     */
    public Builder(String entityType, String recordType, String inputPath) {
      this.entityType = entityType;
      this.recordType = recordType;
      this.inputPath = inputPath;
    }

    /**
     * Builds a CreateMatchingImportRulesJobOptions.
     *
     * @return the new CreateMatchingImportRulesJobOptions instance
     */
    public CreateMatchingImportRulesJobOptions build() {
      return new CreateMatchingImportRulesJobOptions(this);
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the inputPath.
     *
     * @param inputPath the inputPath
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder inputPath(String inputPath) {
      this.inputPath = inputPath;
      return this;
    }

    /**
     * Set the storageBucket.
     *
     * @param storageBucket the storageBucket
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder storageBucket(String storageBucket) {
      this.storageBucket = storageBucket;
      return this;
    }

    /**
     * Set the storageEndpoint.
     *
     * @param storageEndpoint the storageEndpoint
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder storageEndpoint(String storageEndpoint) {
      this.storageEndpoint = storageEndpoint;
      return this;
    }

    /**
     * Set the storageAccessKey.
     *
     * @param storageAccessKey the storageAccessKey
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder storageAccessKey(String storageAccessKey) {
      this.storageAccessKey = storageAccessKey;
      return this;
    }

    /**
     * Set the storageSecretKey.
     *
     * @param storageSecretKey the storageSecretKey
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder storageSecretKey(String storageSecretKey) {
      this.storageSecretKey = storageSecretKey;
      return this;
    }

    /**
     * Set the doWait.
     *
     * @param doWait the doWait
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder doWait(Boolean doWait) {
      this.doWait = doWait;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the CreateMatchingImportRulesJobOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }
  }

  protected CreateMatchingImportRulesJobOptions() { }

  protected CreateMatchingImportRulesJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputPath,
      "inputPath cannot be null");
    entityType = builder.entityType;
    recordType = builder.recordType;
    inputPath = builder.inputPath;
    storageBucket = builder.storageBucket;
    storageEndpoint = builder.storageEndpoint;
    storageAccessKey = builder.storageAccessKey;
    storageSecretKey = builder.storageSecretKey;
    doWait = builder.doWait;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingImportRulesJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the recordType.
   *
   * The data type identifier of record, ie. person, organization.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the inputPath.
   *
   * The full path to the input linkage rules CSV file, ie. /rulesData/output.csv. The corresponding header files should
   * be in the same level and named HEADERS.
   *
   * @return the inputPath
   */
  public String inputPath() {
    return inputPath;
  }

  /**
   * Gets the storageBucket.
   *
   * The storage bucket for the output file, ie. bucket-27200-lwx4cfvcue.
   *
   * @return the storageBucket
   */
  public String storageBucket() {
    return storageBucket;
  }

  /**
   * Gets the storageEndpoint.
   *
   * The storage endpoint for the output file, ie. https://s3.us-east.cloud-object-storage.appdomain.cloud.
   *
   * @return the storageEndpoint
   */
  public String storageEndpoint() {
    return storageEndpoint;
  }

  /**
   * Gets the storageAccessKey.
   *
   * The access key for your storage, ie. cf4965cebe074720a4929759f57e1214.
   *
   * @return the storageAccessKey
   */
  public String storageAccessKey() {
    return storageAccessKey;
  }

  /**
   * Gets the storageSecretKey.
   *
   * The secret key to access your storage.
   *
   * @return the storageSecretKey
   */
  public String storageSecretKey() {
    return storageSecretKey;
  }

  /**
   * Gets the doWait.
   *
   * Wait for job finish, default is false.
   *
   * @return the doWait
   */
  public Boolean doWait() {
    return doWait;
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
}

