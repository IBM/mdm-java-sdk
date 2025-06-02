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
 * The createMatchingPairsJob options.
 */
public class CreateMatchingPairsJobOptions extends GenericModel {

  protected String entityType;
  protected String recordType;
  protected Boolean doWait;
  protected String maxPairs;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;
  protected Boolean excludeReviewedPairs;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private String recordType;
    private Boolean doWait;
    private String maxPairs;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;
    private Boolean excludeReviewedPairs;

    /**
     * Instantiates a new Builder from an existing CreateMatchingPairsJobOptions instance.
     *
     * @param createMatchingPairsJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateMatchingPairsJobOptions createMatchingPairsJobOptions) {
      this.entityType = createMatchingPairsJobOptions.entityType;
      this.recordType = createMatchingPairsJobOptions.recordType;
      this.doWait = createMatchingPairsJobOptions.doWait;
      this.maxPairs = createMatchingPairsJobOptions.maxPairs;
      this.executorCount = createMatchingPairsJobOptions.executorCount;
      this.executorMemory = createMatchingPairsJobOptions.executorMemory;
      this.executorCoreCount = createMatchingPairsJobOptions.executorCoreCount;
      this.sparkParallelism = createMatchingPairsJobOptions.sparkParallelism;
      this.excludeReviewedPairs = createMatchingPairsJobOptions.excludeReviewedPairs;
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
     */
    public Builder(String entityType, String recordType) {
      this.entityType = entityType;
      this.recordType = recordType;
    }

    /**
     * Builds a CreateMatchingPairsJobOptions.
     *
     * @return the new CreateMatchingPairsJobOptions instance
     */
    public CreateMatchingPairsJobOptions build() {
      return new CreateMatchingPairsJobOptions(this);
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the doWait.
     *
     * @param doWait the doWait
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder doWait(Boolean doWait) {
      this.doWait = doWait;
      return this;
    }

    /**
     * Set the maxPairs.
     *
     * @param maxPairs the maxPairs
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder maxPairs(String maxPairs) {
      this.maxPairs = maxPairs;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }

    /**
     * Set the excludeReviewedPairs.
     *
     * @param excludeReviewedPairs the excludeReviewedPairs
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder excludeReviewedPairs(Boolean excludeReviewedPairs) {
      this.excludeReviewedPairs = excludeReviewedPairs;
      return this;
    }
  }

  protected CreateMatchingPairsJobOptions() { }

  protected CreateMatchingPairsJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    entityType = builder.entityType;
    recordType = builder.recordType;
    doWait = builder.doWait;
    maxPairs = builder.maxPairs;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
    excludeReviewedPairs = builder.excludeReviewedPairs;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingPairsJobOptions builder
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
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
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
   * Gets the maxPairs.
   *
   * The maximum number of pairs to return.
   *
   * @return the maxPairs
   */
  public String maxPairs() {
    return maxPairs;
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
   * Gets the excludeReviewedPairs.
   *
   * Exclude reviewd pairs. Default is false.
   *
   * @return the excludeReviewedPairs
   */
  public Boolean excludeReviewedPairs() {
    return excludeReviewedPairs;
  }
}

