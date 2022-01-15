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

  protected BulkLoadRequestDataSource dataSource;
  protected BulkLoadRequestDataStructure dataStructure;
  protected String updateStrategy;

  /**
   * Builder.
   */
  public static class Builder {
    private BulkLoadRequestDataSource dataSource;
    private BulkLoadRequestDataStructure dataStructure;
    private String updateStrategy;

    private Builder(RunDataBulkLoadOptions runDataBulkLoadOptions) {
      this.dataSource = runDataBulkLoadOptions.dataSource;
      this.dataStructure = runDataBulkLoadOptions.dataStructure;
      this.updateStrategy = runDataBulkLoadOptions.updateStrategy;
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
    public Builder(BulkLoadRequestDataSource dataSource) {
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
    public Builder dataSource(BulkLoadRequestDataSource dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    /**
     * Set the dataStructure.
     *
     * @param dataStructure the dataStructure
     * @return the RunDataBulkLoadOptions builder
     */
    public Builder dataStructure(BulkLoadRequestDataStructure dataStructure) {
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
  }

  protected RunDataBulkLoadOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataSource,
      "dataSource cannot be null");
    dataSource = builder.dataSource;
    dataStructure = builder.dataStructure;
    updateStrategy = builder.updateStrategy;
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
   * Information about the source of the data.
   *
   * @return the dataSource
   */
  public BulkLoadRequestDataSource dataSource() {
    return dataSource;
  }

  /**
   * Gets the dataStructure.
   *
   * The structure of the data within the source directory.
   *
   * @return the dataStructure
   */
  public BulkLoadRequestDataStructure dataStructure() {
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
}

