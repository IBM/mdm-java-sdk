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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The suggestConfiguratorDataMappings options.
 */
public class SuggestConfiguratorDataMappingsOptions extends GenericModel {

  protected String recordType;
  protected List<DataMapping> columns;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private List<DataMapping> columns;

    private Builder(SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptions) {
      this.recordType = suggestConfiguratorDataMappingsOptions.recordType;
      this.columns = suggestConfiguratorDataMappingsOptions.columns;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordType the recordType
     */
    public Builder(String recordType) {
      this.recordType = recordType;
    }

    /**
     * Builds a SuggestConfiguratorDataMappingsOptions.
     *
     * @return the new SuggestConfiguratorDataMappingsOptions instance
     */
    public SuggestConfiguratorDataMappingsOptions build() {
      return new SuggestConfiguratorDataMappingsOptions(this);
    }

    /**
     * Adds an columns to columns.
     *
     * @param columns the new columns
     * @return the SuggestConfiguratorDataMappingsOptions builder
     */
    public Builder addColumns(DataMapping columns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(columns,
        "columns cannot be null");
      if (this.columns == null) {
        this.columns = new ArrayList<DataMapping>();
      }
      this.columns.add(columns);
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the SuggestConfiguratorDataMappingsOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the columns.
     * Existing columns will be replaced.
     *
     * @param columns the columns
     * @return the SuggestConfiguratorDataMappingsOptions builder
     */
    public Builder columns(List<DataMapping> columns) {
      this.columns = columns;
      return this;
    }
  }

  protected SuggestConfiguratorDataMappingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    recordType = builder.recordType;
    columns = builder.columns;
  }

  /**
   * New builder.
   *
   * @return a SuggestConfiguratorDataMappingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * Record type for data mapping suggestions.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the columns.
   *
   * The collection of data mapping columns having key and WKC identified class.
   *
   * @return the columns
   */
  public List<DataMapping> columns() {
    return columns;
  }
}

