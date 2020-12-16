/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The suggestDataMappings options.
 */
public class SuggestDataMappingsOptions extends GenericModel {

  protected String recordType;
  protected String crn;
  protected List<DataMapping> columns;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String crn;
    private List<DataMapping> columns;

    private Builder(SuggestDataMappingsOptions suggestDataMappingsOptions) {
      this.recordType = suggestDataMappingsOptions.recordType;
      this.crn = suggestDataMappingsOptions.crn;
      this.columns = suggestDataMappingsOptions.columns;
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
     * @param crn the crn
     */
    public Builder(String recordType, String crn) {
      this.recordType = recordType;
      this.crn = crn;
    }

    /**
     * Builds a SuggestDataMappingsOptions.
     *
     * @return the new SuggestDataMappingsOptions instance
     */
    public SuggestDataMappingsOptions build() {
      return new SuggestDataMappingsOptions(this);
    }

    /**
     * Adds an columns to columns.
     *
     * @param columns the new columns
     * @return the SuggestDataMappingsOptions builder
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
     * @return the SuggestDataMappingsOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the SuggestDataMappingsOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the columns.
     * Existing columns will be replaced.
     *
     * @param columns the columns
     * @return the SuggestDataMappingsOptions builder
     */
    public Builder columns(List<DataMapping> columns) {
      this.columns = columns;
      return this;
    }
  }

  protected SuggestDataMappingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    recordType = builder.recordType;
    crn = builder.crn;
    columns = builder.columns;
  }

  /**
   * New builder.
   *
   * @return a SuggestDataMappingsOptions builder
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
   * Gets the crn.
   *
   * The cloud resource name of the service.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the columns.
   *
   * columns with list of object having key and wkc identified class.
   *
   * @return the columns
   */
  public List<DataMapping> columns() {
    return columns;
  }
}

