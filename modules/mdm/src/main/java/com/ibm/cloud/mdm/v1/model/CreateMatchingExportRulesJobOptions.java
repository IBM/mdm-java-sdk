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
 * The createMatchingExportRulesJob options.
 */
public class CreateMatchingExportRulesJobOptions extends GenericModel {

  protected String filter;
  protected String recordType;
  protected String storageBucket;
  protected String entityType;
  protected String outputFormat;
  protected String storageEndpoint;
  protected String storageAccessKey;
  protected String compressionType;
  protected String storageSecretKey;
  protected String outputPath;
  protected String partitionType;
  protected Boolean doWait;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;

  /**
   * Builder.
   */
  public static class Builder {
    private String filter;
    private String recordType;
    private String storageBucket;
    private String entityType;
    private String outputFormat;
    private String storageEndpoint;
    private String storageAccessKey;
    private String compressionType;
    private String storageSecretKey;
    private String outputPath;
    private String partitionType;
    private Boolean doWait;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;

    /**
     * Instantiates a new Builder from an existing CreateMatchingExportRulesJobOptions instance.
     *
     * @param createMatchingExportRulesJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateMatchingExportRulesJobOptions createMatchingExportRulesJobOptions) {
      this.filter = createMatchingExportRulesJobOptions.filter;
      this.recordType = createMatchingExportRulesJobOptions.recordType;
      this.storageBucket = createMatchingExportRulesJobOptions.storageBucket;
      this.entityType = createMatchingExportRulesJobOptions.entityType;
      this.outputFormat = createMatchingExportRulesJobOptions.outputFormat;
      this.storageEndpoint = createMatchingExportRulesJobOptions.storageEndpoint;
      this.storageAccessKey = createMatchingExportRulesJobOptions.storageAccessKey;
      this.compressionType = createMatchingExportRulesJobOptions.compressionType;
      this.storageSecretKey = createMatchingExportRulesJobOptions.storageSecretKey;
      this.outputPath = createMatchingExportRulesJobOptions.outputPath;
      this.partitionType = createMatchingExportRulesJobOptions.partitionType;
      this.doWait = createMatchingExportRulesJobOptions.doWait;
      this.executorCount = createMatchingExportRulesJobOptions.executorCount;
      this.executorMemory = createMatchingExportRulesJobOptions.executorMemory;
      this.executorCoreCount = createMatchingExportRulesJobOptions.executorCoreCount;
      this.sparkParallelism = createMatchingExportRulesJobOptions.sparkParallelism;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param filter the filter
     * @param recordType the recordType
     */
    public Builder(String filter, String recordType) {
      this.filter = filter;
      this.recordType = recordType;
    }

    /**
     * Builds a CreateMatchingExportRulesJobOptions.
     *
     * @return the new CreateMatchingExportRulesJobOptions instance
     */
    public CreateMatchingExportRulesJobOptions build() {
      return new CreateMatchingExportRulesJobOptions(this);
    }

    /**
     * Set the filter.
     *
     * @param filter the filter
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the storageBucket.
     *
     * @param storageBucket the storageBucket
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder storageBucket(String storageBucket) {
      this.storageBucket = storageBucket;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the outputFormat.
     *
     * @param outputFormat the outputFormat
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder outputFormat(String outputFormat) {
      this.outputFormat = outputFormat;
      return this;
    }

    /**
     * Set the storageEndpoint.
     *
     * @param storageEndpoint the storageEndpoint
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder storageEndpoint(String storageEndpoint) {
      this.storageEndpoint = storageEndpoint;
      return this;
    }

    /**
     * Set the storageAccessKey.
     *
     * @param storageAccessKey the storageAccessKey
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder storageAccessKey(String storageAccessKey) {
      this.storageAccessKey = storageAccessKey;
      return this;
    }

    /**
     * Set the compressionType.
     *
     * @param compressionType the compressionType
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder compressionType(String compressionType) {
      this.compressionType = compressionType;
      return this;
    }

    /**
     * Set the storageSecretKey.
     *
     * @param storageSecretKey the storageSecretKey
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder storageSecretKey(String storageSecretKey) {
      this.storageSecretKey = storageSecretKey;
      return this;
    }

    /**
     * Set the outputPath.
     *
     * @param outputPath the outputPath
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder outputPath(String outputPath) {
      this.outputPath = outputPath;
      return this;
    }

    /**
     * Set the partitionType.
     *
     * @param partitionType the partitionType
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder partitionType(String partitionType) {
      this.partitionType = partitionType;
      return this;
    }

    /**
     * Set the doWait.
     *
     * @param doWait the doWait
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder doWait(Boolean doWait) {
      this.doWait = doWait;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the CreateMatchingExportRulesJobOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }
  }

  protected CreateMatchingExportRulesJobOptions() { }

  protected CreateMatchingExportRulesJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.filter,
      "filter cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    filter = builder.filter;
    recordType = builder.recordType;
    storageBucket = builder.storageBucket;
    entityType = builder.entityType;
    outputFormat = builder.outputFormat;
    storageEndpoint = builder.storageEndpoint;
    storageAccessKey = builder.storageAccessKey;
    compressionType = builder.compressionType;
    storageSecretKey = builder.storageSecretKey;
    outputPath = builder.outputPath;
    partitionType = builder.partitionType;
    doWait = builder.doWait;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingExportRulesJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the filter.
   *
   * The type of the output rules, ie. ALL, VALID, INVALID.
   *
   * @return the filter
   */
  public String filter() {
    return filter;
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
   * Gets the outputFormat.
   *
   * The file format used when exporting the output file, ie. json, csv.
   *
   * @return the outputFormat
   */
  public String outputFormat() {
    return outputFormat;
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
   * Gets the compressionType.
   *
   * The type of file compression used when exporting the output file. Required when a partition type of
   * 'executor_count' is specified, ie. null, zip, tar, tgz.
   *
   * @return the compressionType
   */
  public String compressionType() {
    return compressionType;
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
   * Gets the outputPath.
   *
   * The folder name used when exporting the output file, ie. rulesData. The export file will be named as
   * rulesData_&lt;entity_type&gt;.&lt;format&gt;.
   *
   * @return the outputPath
   */
  public String outputPath() {
    return outputPath;
  }

  /**
   * Gets the partitionType.
   *
   * The type of partitioning used when exporting the results. ie. null, executor_count.
   *
   * @return the partitionType
   */
  public String partitionType() {
    return partitionType;
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

