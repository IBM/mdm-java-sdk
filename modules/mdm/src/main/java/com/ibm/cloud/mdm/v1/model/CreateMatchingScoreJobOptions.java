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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createMatchingScoreJob options.
 */
public class CreateMatchingScoreJobOptions extends GenericModel {

  protected String outputPath;
  protected String recordType;
  protected String entityType;
  protected String cosEndpoint;
  protected String cosBucket;
  protected String cosAccessKey;
  protected String cosSecretKey;
  protected List<String> entities;
  protected Boolean doWait;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;

  /**
   * Builder.
   */
  public static class Builder {
    private String outputPath;
    private String recordType;
    private String entityType;
    private String cosEndpoint;
    private String cosBucket;
    private String cosAccessKey;
    private String cosSecretKey;
    private List<String> entities;
    private Boolean doWait;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;

    private Builder(CreateMatchingScoreJobOptions createMatchingScoreJobOptions) {
      this.outputPath = createMatchingScoreJobOptions.outputPath;
      this.recordType = createMatchingScoreJobOptions.recordType;
      this.entityType = createMatchingScoreJobOptions.entityType;
      this.cosEndpoint = createMatchingScoreJobOptions.cosEndpoint;
      this.cosBucket = createMatchingScoreJobOptions.cosBucket;
      this.cosAccessKey = createMatchingScoreJobOptions.cosAccessKey;
      this.cosSecretKey = createMatchingScoreJobOptions.cosSecretKey;
      this.entities = createMatchingScoreJobOptions.entities;
      this.doWait = createMatchingScoreJobOptions.doWait;
      this.executorCount = createMatchingScoreJobOptions.executorCount;
      this.executorMemory = createMatchingScoreJobOptions.executorMemory;
      this.executorCoreCount = createMatchingScoreJobOptions.executorCoreCount;
      this.sparkParallelism = createMatchingScoreJobOptions.sparkParallelism;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param outputPath the outputPath
     * @param recordType the recordType
     * @param entityType the entityType
     * @param cosEndpoint the cosEndpoint
     * @param cosBucket the cosBucket
     * @param cosAccessKey the cosAccessKey
     * @param cosSecretKey the cosSecretKey
     * @param entities the entities
     */
    public Builder(String outputPath, String recordType, String entityType, String cosEndpoint, String cosBucket, String cosAccessKey, String cosSecretKey, List<String> entities) {
      this.outputPath = outputPath;
      this.recordType = recordType;
      this.entityType = entityType;
      this.cosEndpoint = cosEndpoint;
      this.cosBucket = cosBucket;
      this.cosAccessKey = cosAccessKey;
      this.cosSecretKey = cosSecretKey;
      this.entities = entities;
    }

    /**
     * Builds a CreateMatchingScoreJobOptions.
     *
     * @return the new CreateMatchingScoreJobOptions instance
     */
    public CreateMatchingScoreJobOptions build() {
      return new CreateMatchingScoreJobOptions(this);
    }

    /**
     * Adds an entities to entities.
     *
     * @param entities the new entities
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder addEntities(String entities) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entities,
        "entities cannot be null");
      if (this.entities == null) {
        this.entities = new ArrayList<String>();
      }
      this.entities.add(entities);
      return this;
    }

    /**
     * Set the outputPath.
     *
     * @param outputPath the outputPath
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder outputPath(String outputPath) {
      this.outputPath = outputPath;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the cosBucket.
     *
     * @param cosBucket the cosBucket
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder cosBucket(String cosBucket) {
      this.cosBucket = cosBucket;
      return this;
    }

    /**
     * Set the cosAccessKey.
     *
     * @param cosAccessKey the cosAccessKey
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder cosAccessKey(String cosAccessKey) {
      this.cosAccessKey = cosAccessKey;
      return this;
    }

    /**
     * Set the cosSecretKey.
     *
     * @param cosSecretKey the cosSecretKey
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder cosSecretKey(String cosSecretKey) {
      this.cosSecretKey = cosSecretKey;
      return this;
    }

    /**
     * Set the entities.
     * Existing entities will be replaced.
     *
     * @param entities the entities
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder entities(List<String> entities) {
      this.entities = entities;
      return this;
    }

    /**
     * Set the doWait.
     *
     * @param doWait the doWait
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder doWait(Boolean doWait) {
      this.doWait = doWait;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the CreateMatchingScoreJobOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }
  }

  protected CreateMatchingScoreJobOptions() { }

  protected CreateMatchingScoreJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.outputPath,
      "outputPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosEndpoint,
      "cosEndpoint cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosBucket,
      "cosBucket cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosAccessKey,
      "cosAccessKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosSecretKey,
      "cosSecretKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entities,
      "entities cannot be null");
    outputPath = builder.outputPath;
    recordType = builder.recordType;
    entityType = builder.entityType;
    cosEndpoint = builder.cosEndpoint;
    cosBucket = builder.cosBucket;
    cosAccessKey = builder.cosAccessKey;
    cosSecretKey = builder.cosSecretKey;
    entities = builder.entities;
    doWait = builder.doWait;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingScoreJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the outputPath.
   *
   * Output directory.
   *
   * @return the outputPath
   */
  public String outputPath() {
    return outputPath;
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
   * Gets the cosEndpoint.
   *
   * IBM COS end point.
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the cosBucket.
   *
   * IBM COS bucket.
   *
   * @return the cosBucket
   */
  public String cosBucket() {
    return cosBucket;
  }

  /**
   * Gets the cosAccessKey.
   *
   * IBM COS access key.
   *
   * @return the cosAccessKey
   */
  public String cosAccessKey() {
    return cosAccessKey;
  }

  /**
   * Gets the cosSecretKey.
   *
   * IBM COS secret key.
   *
   * @return the cosSecretKey
   */
  public String cosSecretKey() {
    return cosSecretKey;
  }

  /**
   * Gets the entities.
   *
   * List of entity ids.
   *
   * @return the entities
   */
  public List<String> entities() {
    return entities;
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

