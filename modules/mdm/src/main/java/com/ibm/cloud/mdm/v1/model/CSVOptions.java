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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Options specifying the format of the CSV data file.
 */
public class CSVOptions extends GenericModel {

  protected String columns;
  @SerializedName("includes_header_row")
  protected Boolean includesHeaderRow;
  protected String delimiter;

  /**
   * Builder.
   */
  public static class Builder {
    private String columns;
    private Boolean includesHeaderRow;
    private String delimiter;

    private Builder(CSVOptions csvOptions) {
      this.columns = csvOptions.columns;
      this.includesHeaderRow = csvOptions.includesHeaderRow;
      this.delimiter = csvOptions.delimiter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param columns the columns
     */
    public Builder(String columns) {
      this.columns = columns;
    }

    /**
     * Builds a CSVOptions.
     *
     * @return the new CSVOptions instance
     */
    public CSVOptions build() {
      return new CSVOptions(this);
    }

    /**
     * Set the columns.
     *
     * @param columns the columns
     * @return the CSVOptions builder
     */
    public Builder columns(String columns) {
      this.columns = columns;
      return this;
    }

    /**
     * Set the includesHeaderRow.
     *
     * @param includesHeaderRow the includesHeaderRow
     * @return the CSVOptions builder
     */
    public Builder includesHeaderRow(Boolean includesHeaderRow) {
      this.includesHeaderRow = includesHeaderRow;
      return this;
    }

    /**
     * Set the delimiter.
     *
     * @param delimiter the delimiter
     * @return the CSVOptions builder
     */
    public Builder delimiter(String delimiter) {
      this.delimiter = delimiter;
      return this;
    }
  }

  protected CSVOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.columns,
      "columns cannot be null");
    columns = builder.columns;
    includesHeaderRow = builder.includesHeaderRow;
    delimiter = builder.delimiter;
  }

  /**
   * New builder.
   *
   * @return a CSVOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the columns.
   *
   * The column mappings for the CSV data file.
   *
   * @return the columns
   */
  public String columns() {
    return columns;
  }

  /**
   * Gets the includesHeaderRow.
   *
   * Whether the CSV data file contains a header row.
   *
   * @return the includesHeaderRow
   */
  public Boolean includesHeaderRow() {
    return includesHeaderRow;
  }

  /**
   * Gets the delimiter.
   *
   * The delimiter used to separate fields in the CSV data file.
   *
   * @return the delimiter
   */
  public String delimiter() {
    return delimiter;
  }
}

