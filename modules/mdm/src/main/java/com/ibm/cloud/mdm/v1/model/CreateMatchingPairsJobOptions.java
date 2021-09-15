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
package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createMatchingPairsJob options.
 */
public class CreateMatchingPairsJobOptions extends GenericModel {

  protected Boolean doWait;
  protected String entityType;
  protected String recordType;
  protected String minScore;
  protected String maxScore;
  protected String pairsPerScore;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean doWait;
    private String entityType;
    private String recordType;
    private String minScore;
    private String maxScore;
    private String pairsPerScore;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;

    private Builder(CreateMatchingPairsJobOptions createMatchingPairsJobOptions) {
      this.doWait = createMatchingPairsJobOptions.doWait;
      this.entityType = createMatchingPairsJobOptions.entityType;
      this.recordType = createMatchingPairsJobOptions.recordType;
      this.minScore = createMatchingPairsJobOptions.minScore;
      this.maxScore = createMatchingPairsJobOptions.maxScore;
      this.pairsPerScore = createMatchingPairsJobOptions.pairsPerScore;
      this.executorCount = createMatchingPairsJobOptions.executorCount;
      this.executorMemory = createMatchingPairsJobOptions.executorMemory;
      this.executorCoreCount = createMatchingPairsJobOptions.executorCoreCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
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
     * Set the minScore.
     *
     * @param minScore the minScore
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder minScore(String minScore) {
      this.minScore = minScore;
      return this;
    }

    /**
     * Set the maxScore.
     *
     * @param maxScore the maxScore
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder maxScore(String maxScore) {
      this.maxScore = maxScore;
      return this;
    }

    /**
     * Set the pairsPerScore.
     *
     * @param pairsPerScore the pairsPerScore
     * @return the CreateMatchingPairsJobOptions builder
     */
    public Builder pairsPerScore(String pairsPerScore) {
      this.pairsPerScore = pairsPerScore;
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
  }

  protected CreateMatchingPairsJobOptions(Builder builder) {
    doWait = builder.doWait;
    entityType = builder.entityType;
    recordType = builder.recordType;
    minScore = builder.minScore;
    maxScore = builder.maxScore;
    pairsPerScore = builder.pairsPerScore;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
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
   * Gets the minScore.
   *
   * The minimum score for sampling pairs of records.
   *
   * @return the minScore
   */
  public String minScore() {
    return minScore;
  }

  /**
   * Gets the maxScore.
   *
   * The maximum score for sampling pairs of records.
   *
   * @return the maxScore
   */
  public String maxScore() {
    return maxScore;
  }

  /**
   * Gets the pairsPerScore.
   *
   * The number of pairs of records to be sampled per score.
   *
   * @return the pairsPerScore
   */
  public String pairsPerScore() {
    return pairsPerScore;
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
}

