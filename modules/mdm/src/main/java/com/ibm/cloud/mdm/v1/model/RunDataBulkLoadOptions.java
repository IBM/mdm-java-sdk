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
 * The runDataBulkLoad options.
 */
public class RunDataBulkLoadOptions extends GenericModel {

  /**
   * The strategy for updating existing data during the bulk load job.
   */
  public interface UpdateStrategy {
    /** append. */
    String APPEND = "append";
    /** replace. */
    String REPLACE = "replace";
  }

  protected DataLoadSource dataSource;
  protected DataLoadStructure dataStructure;
  protected String updateStrategy;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long batchSize;
  protected Long sparkParallelism;
  protected Boolean isInitialLoad;

  /**
   * Builder.
   */
  public static class Builder {
    private DataLoadSource dataSource;
    private DataLoadStructure dataStructure;
    private String updateStrategy;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long batchSize;
    private Long sparkParallelism;
    private Boolean isInitialLoad;

    /**
     * Instantiates a new Builder from an existing RunDataBulkLoadOptions instance.
     *
     * @param runDataBulkLoadOptions the instance to initialize the Builder with
     */
    private Builder(RunDataBulkLoadOptions runDataBulkLoadOptions) {
      this.dataSource = runDataBulkLoadOptions.dataSource;
      this.dataStructure = runDataBulkLoadOptions.dataStructure;
      this.updateStrategy = runDataBulkLoadOptions.updateStrategy;
      this.executorCount = runDataBulkLoadOptions.executorCount;
      this.executorMemory = runDataBulkLoadOptions.executorMemory;
      this.executorCoreCount = runDataBulkLoadOptions.executorCoreCount;
      this.batchSize = runDataBulkLoadOptions.batchSize;
      this.sparkParallelism = runDataBulkLoadOptions.sparkParallelism;
      this.isInitialLoad = runDataBulkLoadOptions.isInitialLoad;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataSource the dataSource
     */
    public Builder(DataLoadSource dataSource) {
      this.dataSource = dataSource;
    }

    /**
     * Builds a RunDataBulkLoadOptions.
     *
     * @return the new RunDataBulkLoadOptions instance
     */
    public RunDataBulkLoadOptions build() {
      return new RunDataBulkLoadOptions(this);
    }

    /**
     * Set the dataSource.
     *
     * @param dataSource the dataSource
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder dataSource(DataLoadSource dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    /**
     * Set the dataStructure.
     *
     * @param dataStructure the dataStructure
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder dataStructure(DataLoadStructure dataStructure) {
      this.dataStructure = dataStructure;
      return this;
    }

    /**
     * Set the updateStrategy.
     *
     * @param updateStrategy the updateStrategy
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder updateStrategy(String updateStrategy) {
      this.updateStrategy = updateStrategy;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the batchSize.
     *
     * @param batchSize the batchSize
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder batchSize(long batchSize) {
      this.batchSize = batchSize;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }

    /**
     * Set the isInitialLoad.
     *
     * @param isInitialLoad the isInitialLoad
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder isInitialLoad(Boolean isInitialLoad) {
      this.isInitialLoad = isInitialLoad;
      return this;
    }
  }

  protected RunDataBulkLoadOptions() { }

  protected RunDataBulkLoadOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataSource,
      "dataSource cannot be null");
    dataSource = builder.dataSource;
    dataStructure = builder.dataStructure;
    updateStrategy = builder.updateStrategy;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    batchSize = builder.batchSize;
    sparkParallelism = builder.sparkParallelism;
    isInitialLoad = builder.isInitialLoad;
  }

  /**
   * New builder.
   *
   * @return a RunDataBulkLoadOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataSource.
   *
   * Information about the source of the data to be loaded.
   *
   * @return the dataSource
   */
  public DataLoadSource dataSource() {
    return dataSource;
  }

  /**
   * Gets the dataStructure.
   *
   * Information about how the source data is structured on the storage system.
   *
   * @return the dataStructure
   */
  public DataLoadStructure dataStructure() {
    return dataStructure;
  }

  /**
   * Gets the updateStrategy.
   *
   * The strategy for updating existing data during the bulk load job.
   *
   * @return the updateStrategy
   */
  public String updateStrategy() {
    return updateStrategy;
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
   * Gets the batchSize.
   *
   * Batch Size.
   *
   * @return the batchSize
   */
  public Long batchSize() {
    return batchSize;
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
   * Gets the isInitialLoad.
   *
   * Is initial load of data.
   *
   * @return the isInitialLoad
   */
  public Boolean isInitialLoad() {
    return isInitialLoad;
  }
}

