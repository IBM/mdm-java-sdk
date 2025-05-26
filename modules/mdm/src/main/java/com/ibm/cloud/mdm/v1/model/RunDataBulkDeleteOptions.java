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
 * The runDataBulkDelete options.
 */
public class RunDataBulkDeleteOptions extends GenericModel {

  /**
   * The type of delete to run.
   */
  public interface DeleteType {
    /** asset. */
    String ASSET = "asset";
    /** full. */
    String FULL = "full";
    /** search. */
    String SEARCH = "search";
    /** source. */
    String SOURCE = "source";
  }

  /**
   * The data type to target for deletion.
   */
  public interface DeleteTarget {
    /** record. */
    String RECORD = "record";
    /** relationship. */
    String RELATIONSHIP = "relationship";
    /** hierarchy. */
    String HIERARCHY = "hierarchy";
  }

  protected String deleteType;
  protected String deleteTarget;
  protected List<String> collectionIds;
  protected String recordSource;
  protected String relationshipSource;
  protected DataSearchCriteria searchCriteria;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;
  protected Long batchSize;
  protected Long retryCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String deleteType;
    private String deleteTarget;
    private List<String> collectionIds;
    private String recordSource;
    private String relationshipSource;
    private DataSearchCriteria searchCriteria;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;
    private Long batchSize;
    private Long retryCount;

    private Builder(RunDataBulkDeleteOptions runDataBulkDeleteOptions) {
      this.deleteType = runDataBulkDeleteOptions.deleteType;
      this.deleteTarget = runDataBulkDeleteOptions.deleteTarget;
      this.collectionIds = runDataBulkDeleteOptions.collectionIds;
      this.recordSource = runDataBulkDeleteOptions.recordSource;
      this.relationshipSource = runDataBulkDeleteOptions.relationshipSource;
      this.searchCriteria = runDataBulkDeleteOptions.searchCriteria;
      this.executorCount = runDataBulkDeleteOptions.executorCount;
      this.executorMemory = runDataBulkDeleteOptions.executorMemory;
      this.executorCoreCount = runDataBulkDeleteOptions.executorCoreCount;
      this.sparkParallelism = runDataBulkDeleteOptions.sparkParallelism;
      this.batchSize = runDataBulkDeleteOptions.batchSize;
      this.retryCount = runDataBulkDeleteOptions.retryCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param deleteType the deleteType
     */
    public Builder(String deleteType) {
      this.deleteType = deleteType;
    }

    /**
     * Builds a RunDataBulkDeleteOptions.
     *
     * @return the new RunDataBulkDeleteOptions instance
     */
    public RunDataBulkDeleteOptions build() {
      return new RunDataBulkDeleteOptions(this);
    }

    /**
     * Adds an collectionIds to collectionIds.
     *
     * @param collectionIds the new collectionIds
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder addCollectionIds(String collectionIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(collectionIds,
        "collectionIds cannot be null");
      if (this.collectionIds == null) {
        this.collectionIds = new ArrayList<String>();
      }
      this.collectionIds.add(collectionIds);
      return this;
    }

    /**
     * Set the deleteType.
     *
     * @param deleteType the deleteType
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder deleteType(String deleteType) {
      this.deleteType = deleteType;
      return this;
    }

    /**
     * Set the deleteTarget.
     *
     * @param deleteTarget the deleteTarget
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder deleteTarget(String deleteTarget) {
      this.deleteTarget = deleteTarget;
      return this;
    }

    /**
     * Set the collectionIds.
     * Existing collectionIds will be replaced.
     *
     * @param collectionIds the collectionIds
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder collectionIds(List<String> collectionIds) {
      this.collectionIds = collectionIds;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }

    /**
     * Set the relationshipSource.
     *
     * @param relationshipSource the relationshipSource
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder relationshipSource(String relationshipSource) {
      this.relationshipSource = relationshipSource;
      return this;
    }

    /**
     * Set the searchCriteria.
     *
     * @param searchCriteria the searchCriteria
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder searchCriteria(DataSearchCriteria searchCriteria) {
      this.searchCriteria = searchCriteria;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }

    /**
     * Set the batchSize.
     *
     * @param batchSize the batchSize
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder batchSize(long batchSize) {
      this.batchSize = batchSize;
      return this;
    }

    /**
     * Set the retryCount.
     *
     * @param retryCount the retryCount
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder retryCount(long retryCount) {
      this.retryCount = retryCount;
      return this;
    }
  }

  protected RunDataBulkDeleteOptions() { }

  protected RunDataBulkDeleteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.deleteType,
      "deleteType cannot be null");
    deleteType = builder.deleteType;
    deleteTarget = builder.deleteTarget;
    collectionIds = builder.collectionIds;
    recordSource = builder.recordSource;
    relationshipSource = builder.relationshipSource;
    searchCriteria = builder.searchCriteria;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
    batchSize = builder.batchSize;
    retryCount = builder.retryCount;
  }

  /**
   * New builder.
   *
   * @return a RunDataBulkDeleteOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteType.
   *
   * The type of delete to run.
   *
   * @return the deleteType
   */
  public String deleteType() {
    return deleteType;
  }

  /**
   * Gets the deleteTarget.
   *
   * The data type to target for deletion.
   *
   * @return the deleteTarget
   */
  public String deleteTarget() {
    return deleteTarget;
  }

  /**
   * Gets the collectionIds.
   *
   * Asset IDs for data to be deleted. Required on delete by asset.
   *
   * @return the collectionIds
   */
  public List<String> collectionIds() {
    return collectionIds;
  }

  /**
   * Gets the recordSource.
   *
   * Record source for data to be deleted. Required on delete by source targeting records.
   *
   * @return the recordSource
   */
  public String recordSource() {
    return recordSource;
  }

  /**
   * Gets the relationshipSource.
   *
   * Relationship source for data to be deleted. Required on delete by source targeting relationships.
   *
   * @return the relationshipSource
   */
  public String relationshipSource() {
    return relationshipSource;
  }

  /**
   * Gets the searchCriteria.
   *
   * A set of criteria for a search operation.
   *
   * @return the searchCriteria
   */
  public DataSearchCriteria searchCriteria() {
    return searchCriteria;
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
   * Gets the batchSize.
   *
   * batch size of the query parameter.
   *
   * @return the batchSize
   */
  public Long batchSize() {
    return batchSize;
  }

  /**
   * Gets the retryCount.
   *
   * No.of retries, if any failure occur.
   *
   * @return the retryCount
   */
  public Long retryCount() {
    return retryCount;
  }
}

