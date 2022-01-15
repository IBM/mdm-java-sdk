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
 * The createMatchingDeriveJob options.
 */
public class CreateMatchingDeriveJobOptions extends GenericModel {

  protected String recordType;
  protected Boolean doForce;
  protected String csvFile;
  protected String csvColumn;
  protected String cosEndpoint;
  protected String cosBucket;
  protected String cosAccessKey;
  protected String cosSecretKey;
  protected Long executorCount;
  protected String executorMemory;
  protected Long executorCoreCount;
  protected String logCosEndpoint;
  protected String logCosBucket;
  protected String logCosAccessKey;
  protected String logCosSecretKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private Boolean doForce;
    private String csvFile;
    private String csvColumn;
    private String cosEndpoint;
    private String cosBucket;
    private String cosAccessKey;
    private String cosSecretKey;
    private Long executorCount;
    private String executorMemory;
    private Long executorCoreCount;
    private String logCosEndpoint;
    private String logCosBucket;
    private String logCosAccessKey;
    private String logCosSecretKey;

    private Builder(CreateMatchingDeriveJobOptions createMatchingDeriveJobOptions) {
      this.recordType = createMatchingDeriveJobOptions.recordType;
      this.doForce = createMatchingDeriveJobOptions.doForce;
      this.csvFile = createMatchingDeriveJobOptions.csvFile;
      this.csvColumn = createMatchingDeriveJobOptions.csvColumn;
      this.cosEndpoint = createMatchingDeriveJobOptions.cosEndpoint;
      this.cosBucket = createMatchingDeriveJobOptions.cosBucket;
      this.cosAccessKey = createMatchingDeriveJobOptions.cosAccessKey;
      this.cosSecretKey = createMatchingDeriveJobOptions.cosSecretKey;
      this.executorCount = createMatchingDeriveJobOptions.executorCount;
      this.executorMemory = createMatchingDeriveJobOptions.executorMemory;
      this.executorCoreCount = createMatchingDeriveJobOptions.executorCoreCount;
      this.logCosEndpoint = createMatchingDeriveJobOptions.logCosEndpoint;
      this.logCosBucket = createMatchingDeriveJobOptions.logCosBucket;
      this.logCosAccessKey = createMatchingDeriveJobOptions.logCosAccessKey;
      this.logCosSecretKey = createMatchingDeriveJobOptions.logCosSecretKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateMatchingDeriveJobOptions.
     *
     * @return the new CreateMatchingDeriveJobOptions instance
     */
    public CreateMatchingDeriveJobOptions build() {
      return new CreateMatchingDeriveJobOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the doForce.
     *
     * @param doForce the doForce
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder doForce(Boolean doForce) {
      this.doForce = doForce;
      return this;
    }

    /**
     * Set the csvFile.
     *
     * @param csvFile the csvFile
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder csvFile(String csvFile) {
      this.csvFile = csvFile;
      return this;
    }

    /**
     * Set the csvColumn.
     *
     * @param csvColumn the csvColumn
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder csvColumn(String csvColumn) {
      this.csvColumn = csvColumn;
      return this;
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the cosBucket.
     *
     * @param cosBucket the cosBucket
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder cosBucket(String cosBucket) {
      this.cosBucket = cosBucket;
      return this;
    }

    /**
     * Set the cosAccessKey.
     *
     * @param cosAccessKey the cosAccessKey
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder cosAccessKey(String cosAccessKey) {
      this.cosAccessKey = cosAccessKey;
      return this;
    }

    /**
     * Set the cosSecretKey.
     *
     * @param cosSecretKey the cosSecretKey
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder cosSecretKey(String cosSecretKey) {
      this.cosSecretKey = cosSecretKey;
      return this;
    }

    /**
     * Set the executorCount.
     *
     * @param executorCount the executorCount
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder executorCount(long executorCount) {
      this.executorCount = executorCount;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the executorCoreCount.
     *
     * @param executorCoreCount the executorCoreCount
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder executorCoreCount(long executorCoreCount) {
      this.executorCoreCount = executorCoreCount;
      return this;
    }

    /**
     * Set the logCosEndpoint.
     *
     * @param logCosEndpoint the logCosEndpoint
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder logCosEndpoint(String logCosEndpoint) {
      this.logCosEndpoint = logCosEndpoint;
      return this;
    }

    /**
     * Set the logCosBucket.
     *
     * @param logCosBucket the logCosBucket
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder logCosBucket(String logCosBucket) {
      this.logCosBucket = logCosBucket;
      return this;
    }

    /**
     * Set the logCosAccessKey.
     *
     * @param logCosAccessKey the logCosAccessKey
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder logCosAccessKey(String logCosAccessKey) {
      this.logCosAccessKey = logCosAccessKey;
      return this;
    }

    /**
     * Set the logCosSecretKey.
     *
     * @param logCosSecretKey the logCosSecretKey
     * @return the CreateMatchingDeriveJobOptions builder
     */
    public Builder logCosSecretKey(String logCosSecretKey) {
      this.logCosSecretKey = logCosSecretKey;
      return this;
    }
  }

  protected CreateMatchingDeriveJobOptions(Builder builder) {
    recordType = builder.recordType;
    doForce = builder.doForce;
    csvFile = builder.csvFile;
    csvColumn = builder.csvColumn;
    cosEndpoint = builder.cosEndpoint;
    cosBucket = builder.cosBucket;
    cosAccessKey = builder.cosAccessKey;
    cosSecretKey = builder.cosSecretKey;
    executorCount = builder.executorCount;
    executorMemory = builder.executorMemory;
    executorCoreCount = builder.executorCoreCount;
    logCosEndpoint = builder.logCosEndpoint;
    logCosBucket = builder.logCosBucket;
    logCosAccessKey = builder.logCosAccessKey;
    logCosSecretKey = builder.logCosSecretKey;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingDeriveJobOptions builder
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
   * Gets the doForce.
   *
   * Force to re-derive all records, default is false.
   *
   * @return the doForce
   */
  public Boolean doForce() {
    return doForce;
  }

  /**
   * Gets the csvFile.
   *
   * The delimited text file name, ending with .csv/.tsv for comma/tab separated format.
   *
   * @return the csvFile
   */
  public String csvFile() {
    return csvFile;
  }

  /**
   * Gets the csvColumn.
   *
   * comma separated column names in the data file.
   *
   * @return the csvColumn
   */
  public String csvColumn() {
    return csvColumn;
  }

  /**
   * Gets the cosEndpoint.
   *
   * IBM COS end point (i.e. https://s3.us-east.cloud-object-storage.appdomain.cloud).
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the cosBucket.
   *
   * IBM COS bucket (i.e. bucket-27200-lwx4cfvcue).
   *
   * @return the cosBucket
   */
  public String cosBucket() {
    return cosBucket;
  }

  /**
   * Gets the cosAccessKey.
   *
   * IBM COS access key (i.e. cf4965cebe074720a4929759f57e1214).
   *
   * @return the cosAccessKey
   */
  public String cosAccessKey() {
    return cosAccessKey;
  }

  /**
   * Gets the cosSecretKey.
   *
   * The unique secret code to access IBM COS.
   *
   * @return the cosSecretKey
   */
  public String cosSecretKey() {
    return cosSecretKey;
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

