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
 * The dataRunBulkLoad options.
 */
public class DataRunBulkLoadOptions extends GenericModel {

  protected DataSourceRequest dataSource;
  protected DataStructureRequest dataStructure;

  /**
   * Builder.
   */
  public static class Builder {
    private DataSourceRequest dataSource;
    private DataStructureRequest dataStructure;

    private Builder(DataRunBulkLoadOptions dataRunBulkLoadOptions) {
      this.dataSource = dataRunBulkLoadOptions.dataSource;
      this.dataStructure = dataRunBulkLoadOptions.dataStructure;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataRunBulkLoadOptions.
     *
     * @return the new DataRunBulkLoadOptions instance
     */
    public DataRunBulkLoadOptions build() {
      return new DataRunBulkLoadOptions(this);
    }

    /**
     * Set the dataSource.
     *
     * @param dataSource the dataSource
     * @return the DataRunBulkLoadOptions builder
     */
    public Builder dataSource(DataSourceRequest dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    /**
     * Set the dataStructure.
     *
     * @param dataStructure the dataStructure
     * @return the DataRunBulkLoadOptions builder
     */
    public Builder dataStructure(DataStructureRequest dataStructure) {
      this.dataStructure = dataStructure;
      return this;
    }
  }

  protected DataRunBulkLoadOptions(Builder builder) {
    dataSource = builder.dataSource;
    dataStructure = builder.dataStructure;
  }

  /**
   * New builder.
   *
   * @return a DataRunBulkLoadOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataSource.
   *
   * The data source request.
   *
   * @return the dataSource
   */
  public DataSourceRequest dataSource() {
    return dataSource;
  }

  /**
   * Gets the dataStructure.
   *
   * Information about how the data is structured on the storage system.
   *
   * @return the dataStructure
   */
  public DataStructureRequest dataStructure() {
    return dataStructure;
  }
}

