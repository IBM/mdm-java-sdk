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
 * The properties of the data to be loaded.
 */
public class DataLoadProperties extends GenericModel {

  /**
   * The file type of the bulk load data.
   */
  public interface FileType {
    /** csv. */
    String CSV = "csv";
    /** json. */
    String JSON = "json";
  }

  @SerializedName("collection_id")
  protected String collectionId;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("relationship_type")
  protected String relationshipType;
  @SerializedName("default_source")
  protected String defaultSource;
  @SerializedName("file_type")
  protected String fileType;
  @SerializedName("csv_options")
  protected CSVOptions csvOptions;

  /**
   * Builder.
   */
  public static class Builder {
    private String collectionId;
    private String recordType;
    private String relationshipType;
    private String defaultSource;
    private String fileType;
    private CSVOptions csvOptions;

    private Builder(DataLoadProperties dataLoadProperties) {
      this.collectionId = dataLoadProperties.collectionId;
      this.recordType = dataLoadProperties.recordType;
      this.relationshipType = dataLoadProperties.relationshipType;
      this.defaultSource = dataLoadProperties.defaultSource;
      this.fileType = dataLoadProperties.fileType;
      this.csvOptions = dataLoadProperties.csvOptions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param fileType the fileType
     */
    public Builder(String fileType) {
      this.fileType = fileType;
    }

    /**
     * Builds a DataLoadProperties.
     *
     * @return the new DataLoadProperties instance
     */
    public DataLoadProperties build() {
      return new DataLoadProperties(this);
    }

    /**
     * Set the collectionId.
     *
     * @param collectionId the collectionId
     * @return the DataLoadProperties builder
     */
    public Builder collectionId(String collectionId) {
      this.collectionId = collectionId;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the DataLoadProperties builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the DataLoadProperties builder
     */
    public Builder relationshipType(String relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }

    /**
     * Set the defaultSource.
     *
     * @param defaultSource the defaultSource
     * @return the DataLoadProperties builder
     */
    public Builder defaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    /**
     * Set the fileType.
     *
     * @param fileType the fileType
     * @return the DataLoadProperties builder
     */
    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }

    /**
     * Set the csvOptions.
     *
     * @param csvOptions the csvOptions
     * @return the DataLoadProperties builder
     */
    public Builder csvOptions(CSVOptions csvOptions) {
      this.csvOptions = csvOptions;
      return this;
    }
  }

  protected DataLoadProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fileType,
      "fileType cannot be null");
    collectionId = builder.collectionId;
    recordType = builder.recordType;
    relationshipType = builder.relationshipType;
    defaultSource = builder.defaultSource;
    fileType = builder.fileType;
    csvOptions = builder.csvOptions;
  }

  /**
   * New builder.
   *
   * @return a DataLoadProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the collectionId.
   *
   * The collection id to use for the bulk load data.
   *
   * @return the collectionId
   */
  public String collectionId() {
    return collectionId;
  }

  /**
   * Gets the recordType.
   *
   * The record type of the bulk load data.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the relationshipType.
   *
   * The relationship type of the bulk load data.
   *
   * @return the relationshipType
   */
  public String relationshipType() {
    return relationshipType;
  }

  /**
   * Gets the defaultSource.
   *
   * The default source to use for the bulk load data.
   *
   * @return the defaultSource
   */
  public String defaultSource() {
    return defaultSource;
  }

  /**
   * Gets the fileType.
   *
   * The file type of the bulk load data.
   *
   * @return the fileType
   */
  public String fileType() {
    return fileType;
  }

  /**
   * Gets the csvOptions.
   *
   * Options specifying the format of the CSV data file.
   *
   * @return the csvOptions
   */
  public CSVOptions csvOptions() {
    return csvOptions;
  }
}

