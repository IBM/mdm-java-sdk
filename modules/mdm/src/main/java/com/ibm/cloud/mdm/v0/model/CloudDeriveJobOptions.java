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
package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The cloudDeriveJob options.
 */
public class CloudDeriveJobOptions extends GenericModel {

  protected String recordType;
  protected String csvFile;
  protected String csvColumn;
  protected String cosEndpoint;
  protected String cosBucket;
  protected String cosAccessKey;
  protected String cosSecretKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String csvFile;
    private String csvColumn;
    private String cosEndpoint;
    private String cosBucket;
    private String cosAccessKey;
    private String cosSecretKey;

    private Builder(CloudDeriveJobOptions cloudDeriveJobOptions) {
      this.recordType = cloudDeriveJobOptions.recordType;
      this.csvFile = cloudDeriveJobOptions.csvFile;
      this.csvColumn = cloudDeriveJobOptions.csvColumn;
      this.cosEndpoint = cloudDeriveJobOptions.cosEndpoint;
      this.cosBucket = cloudDeriveJobOptions.cosBucket;
      this.cosAccessKey = cloudDeriveJobOptions.cosAccessKey;
      this.cosSecretKey = cloudDeriveJobOptions.cosSecretKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CloudDeriveJobOptions.
     *
     * @return the new CloudDeriveJobOptions instance
     */
    public CloudDeriveJobOptions build() {
      return new CloudDeriveJobOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CloudDeriveJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the csvFile.
     *
     * @param csvFile the csvFile
     * @return the CloudDeriveJobOptions builder
     */
    public Builder csvFile(String csvFile) {
      this.csvFile = csvFile;
      return this;
    }

    /**
     * Set the csvColumn.
     *
     * @param csvColumn the csvColumn
     * @return the CloudDeriveJobOptions builder
     */
    public Builder csvColumn(String csvColumn) {
      this.csvColumn = csvColumn;
      return this;
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the CloudDeriveJobOptions builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the cosBucket.
     *
     * @param cosBucket the cosBucket
     * @return the CloudDeriveJobOptions builder
     */
    public Builder cosBucket(String cosBucket) {
      this.cosBucket = cosBucket;
      return this;
    }

    /**
     * Set the cosAccessKey.
     *
     * @param cosAccessKey the cosAccessKey
     * @return the CloudDeriveJobOptions builder
     */
    public Builder cosAccessKey(String cosAccessKey) {
      this.cosAccessKey = cosAccessKey;
      return this;
    }

    /**
     * Set the cosSecretKey.
     *
     * @param cosSecretKey the cosSecretKey
     * @return the CloudDeriveJobOptions builder
     */
    public Builder cosSecretKey(String cosSecretKey) {
      this.cosSecretKey = cosSecretKey;
      return this;
    }
  }

  protected CloudDeriveJobOptions(Builder builder) {
    recordType = builder.recordType;
    csvFile = builder.csvFile;
    csvColumn = builder.csvColumn;
    cosEndpoint = builder.cosEndpoint;
    cosBucket = builder.cosBucket;
    cosAccessKey = builder.cosAccessKey;
    cosSecretKey = builder.cosSecretKey;
  }

  /**
   * New builder.
   *
   * @return a CloudDeriveJobOptions builder
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
}

