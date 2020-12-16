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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataRunExport options.
 */
public class DataRunExportOptions extends GenericModel {

  /**
   * The format of the export file.
   */
  public interface Format {
    /** csv. */
    String CSV = "csv";
    /** psv. */
    String PSV = "psv";
    /** tsv. */
    String TSV = "tsv";
  }

  /**
   * The type of export.
   */
  public interface ExportType {
    /** record. */
    String RECORD = "record";
    /** entity. */
    String ENTITY = "entity";
  }

  protected String format;
  protected String fileName;
  protected String exportType;
  protected CriteriaRequest searchCriteria;

  /**
   * Builder.
   */
  public static class Builder {
    private String format;
    private String fileName;
    private String exportType;
    private CriteriaRequest searchCriteria;

    private Builder(DataRunExportOptions dataRunExportOptions) {
      this.format = dataRunExportOptions.format;
      this.fileName = dataRunExportOptions.fileName;
      this.exportType = dataRunExportOptions.exportType;
      this.searchCriteria = dataRunExportOptions.searchCriteria;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataRunExportOptions.
     *
     * @return the new DataRunExportOptions instance
     */
    public DataRunExportOptions build() {
      return new DataRunExportOptions(this);
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the DataRunExportOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the fileName.
     *
     * @param fileName the fileName
     * @return the DataRunExportOptions builder
     */
    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    /**
     * Set the exportType.
     *
     * @param exportType the exportType
     * @return the DataRunExportOptions builder
     */
    public Builder exportType(String exportType) {
      this.exportType = exportType;
      return this;
    }

    /**
     * Set the searchCriteria.
     *
     * @param searchCriteria the searchCriteria
     * @return the DataRunExportOptions builder
     */
    public Builder searchCriteria(CriteriaRequest searchCriteria) {
      this.searchCriteria = searchCriteria;
      return this;
    }
  }

  protected DataRunExportOptions(Builder builder) {
    format = builder.format;
    fileName = builder.fileName;
    exportType = builder.exportType;
    searchCriteria = builder.searchCriteria;
  }

  /**
   * New builder.
   *
   * @return a DataRunExportOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the format.
   *
   * The format of the export file.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the fileName.
   *
   * The file name of the export file.
   *
   * @return the fileName
   */
  public String fileName() {
    return fileName;
  }

  /**
   * Gets the exportType.
   *
   * The type of export.
   *
   * @return the exportType
   */
  public String exportType() {
    return exportType;
  }

  /**
   * Gets the searchCriteria.
   *
   * A set of criteria for a search.
   *
   * @return the searchCriteria
   */
  public CriteriaRequest searchCriteria() {
    return searchCriteria;
  }
}

