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
 * The createMatchingExportJob options.
 */
public class CreateMatchingExportJobOptions extends GenericModel {

  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected Long sparkParallelism;
  protected String outputPath;

  /**
   * Builder.
   */
  public static class Builder {
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private Long sparkParallelism;
    private String outputPath;

    private Builder(CreateMatchingExportJobOptions createMatchingExportJobOptions) {
      this.executorCount = createMatchingExportJobOptions.executorCount;
      this.executorMemory = createMatchingExportJobOptions.executorMemory;
      this.executorCoreCount = createMatchingExportJobOptions.executorCoreCount;
      this.sparkParallelism = createMatchingExportJobOptions.sparkParallelism;
      this.outputPath = createMatchingExportJobOptions.outputPath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateMatchingExportJobOptions.
     *
     * @return the new CreateMatchingExportJobOptions instance
     */
    public CreateMatchingExportJobOptions build() {
      return new CreateMatchingExportJobOptions(this);
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingExportJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingExportJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingExportJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the sparkParallelism.
     *
     * @param sparkParallelism the sparkParallelism
     * @return the CreateMatchingExportJobOptions builder
     */
    public Builder sparkParallelism(long sparkParallelism) {
      this.sparkParallelism = sparkParallelism;
      return this;
    }

    /**
     * Set the outputPath.
     *
     * @param outputPath the outputPath
     * @return the CreateMatchingExportJobOptions builder
     */
    public Builder outputPath(String outputPath) {
      this.outputPath = outputPath;
      return this;
    }
  }

  protected CreateMatchingExportJobOptions() { }

  protected CreateMatchingExportJobOptions(Builder builder) {
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    sparkParallelism = builder.sparkParallelism;
    outputPath = builder.outputPath;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingExportJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the outputPath.
   *
   * The output path under /service-exports for the exported data.
   *
   * @return the outputPath
   */
  public String outputPath() {
    return outputPath;
  }
}

