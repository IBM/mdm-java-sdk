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
 * The createDataExport options.
 */
public class CreateDataExportOptions extends GenericModel {

  /**
   * The type of data to export.
   */
  public interface ExportType {
    /** record. */
    String RECORD = "record";
    /** entity. */
    String ENTITY = "entity";
  }

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
   * The type of file compression used when exporting the output file. Required when a partition type of
   * 'executor_count' is specified.
   */
  public interface CompressionType {
    /** tar. */
    String TAR = "tar";
    /** tgz. */
    String TGZ = "tgz";
    /** zip. */
    String ZIP = "zip";
  }

  /**
   * The type of partitioning used when exporting the results.
   */
  public interface PartitionType {
    /** none. */
    String NONE = "none";
    /** executor_count. */
    String EXECUTOR_COUNT = "executor_count";
  }

  protected String exportType;
  protected String format;
  protected DataSearchCriteria searchCriteria;
  protected String fileName;
  protected String compressionType;
  protected String partitionType;

  /**
   * Builder.
   */
  public static class Builder {
    private String exportType;
    private String format;
    private DataSearchCriteria searchCriteria;
    private String fileName;
    private String compressionType;
    private String partitionType;

    private Builder(CreateDataExportOptions createDataExportOptions) {
      this.exportType = createDataExportOptions.exportType;
      this.format = createDataExportOptions.format;
      this.searchCriteria = createDataExportOptions.searchCriteria;
      this.fileName = createDataExportOptions.fileName;
      this.compressionType = createDataExportOptions.compressionType;
      this.partitionType = createDataExportOptions.partitionType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param exportType the exportType
     * @param format the format
     * @param searchCriteria the searchCriteria
     */
    public Builder(String exportType, String format, DataSearchCriteria searchCriteria) {
      this.exportType = exportType;
      this.format = format;
      this.searchCriteria = searchCriteria;
    }

    /**
     * Builds a CreateDataExportOptions.
     *
     * @return the new CreateDataExportOptions instance
     */
    public CreateDataExportOptions build() {
      return new CreateDataExportOptions(this);
    }

    /**
     * Set the exportType.
     *
     * @param exportType the exportType
     * @return the CreateDataExportOptions builder
     */
    public Builder exportType(String exportType) {
      this.exportType = exportType;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the CreateDataExportOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the searchCriteria.
     *
     * @param searchCriteria the searchCriteria
     * @return the CreateDataExportOptions builder
     */
    public Builder searchCriteria(DataSearchCriteria searchCriteria) {
      this.searchCriteria = searchCriteria;
      return this;
    }

    /**
     * Set the fileName.
     *
     * @param fileName the fileName
     * @return the CreateDataExportOptions builder
     */
    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    /**
     * Set the compressionType.
     *
     * @param compressionType the compressionType
     * @return the CreateDataExportOptions builder
     */
    public Builder compressionType(String compressionType) {
      this.compressionType = compressionType;
      return this;
    }

    /**
     * Set the partitionType.
     *
     * @param partitionType the partitionType
     * @return the CreateDataExportOptions builder
     */
    public Builder partitionType(String partitionType) {
      this.partitionType = partitionType;
      return this;
    }
  }

  protected CreateDataExportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.exportType,
      "exportType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.format,
      "format cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.searchCriteria,
      "searchCriteria cannot be null");
    exportType = builder.exportType;
    format = builder.format;
    searchCriteria = builder.searchCriteria;
    fileName = builder.fileName;
    compressionType = builder.compressionType;
    partitionType = builder.partitionType;
  }

  /**
   * New builder.
   *
   * @return a CreateDataExportOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the exportType.
   *
   * The type of data to export.
   *
   * @return the exportType
   */
  public String exportType() {
    return exportType;
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
   * Gets the searchCriteria.
   *
   * A set of criteria for a search operation.
   *
   * @return the searchCriteria
   */
  public DataSearchCriteria searchCriteria() {
    return searchCriteria;
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
   * Gets the compressionType.
   *
   * The type of file compression used when exporting the output file. Required when a partition type of
   * 'executor_count' is specified.
   *
   * @return the compressionType
   */
  public String compressionType() {
    return compressionType;
  }

  /**
   * Gets the partitionType.
   *
   * The type of partitioning used when exporting the results.
   *
   * @return the partitionType
   */
  public String partitionType() {
    return partitionType;
  }
}

