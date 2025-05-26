/*
 * (C) Copyright IBM Corp. 2025.
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
 * Information about how the source data is structured on the storage system.
 */
public class DataLoadStructure extends GenericModel {

  @SerializedName("record_path")
  protected String recordPath;
  @SerializedName("record_properties")
  protected String recordProperties;
  @SerializedName("relationship_path")
  protected String relationshipPath;
  @SerializedName("relationship_properties")
  protected String relationshipProperties;
  @SerializedName("record_asset_id")
  protected String recordAssetId;
  @SerializedName("relationship_asset_id")
  protected String relationshipAssetId;
  @SerializedName("record_properties_contents")
  protected DataLoadProperties recordPropertiesContents;
  @SerializedName("relationship_properties_contents")
  protected DataLoadProperties relationshipPropertiesContents;
  @SerializedName("group_path")
  protected String groupPath;
  @SerializedName("group_properties")
  protected String groupProperties;
  @SerializedName("group_properties_contents")
  protected DataLoadProperties groupPropertiesContents;
  @SerializedName("group_associations_path")
  protected String groupAssociationsPath;
  @SerializedName("group_associations_properties")
  protected String groupAssociationsProperties;
  @SerializedName("group_associations_properties_contents")
  protected DataLoadProperties groupAssociationsPropertiesContents;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordPath;
    private String recordProperties;
    private String relationshipPath;
    private String relationshipProperties;
    private String recordAssetId;
    private String relationshipAssetId;
    private DataLoadProperties recordPropertiesContents;
    private DataLoadProperties relationshipPropertiesContents;
    private String groupPath;
    private String groupProperties;
    private DataLoadProperties groupPropertiesContents;
    private String groupAssociationsPath;
    private String groupAssociationsProperties;
    private DataLoadProperties groupAssociationsPropertiesContents;

    private Builder(DataLoadStructure dataLoadStructure) {
      this.recordPath = dataLoadStructure.recordPath;
      this.recordProperties = dataLoadStructure.recordProperties;
      this.relationshipPath = dataLoadStructure.relationshipPath;
      this.relationshipProperties = dataLoadStructure.relationshipProperties;
      this.recordAssetId = dataLoadStructure.recordAssetId;
      this.relationshipAssetId = dataLoadStructure.relationshipAssetId;
      this.recordPropertiesContents = dataLoadStructure.recordPropertiesContents;
      this.relationshipPropertiesContents = dataLoadStructure.relationshipPropertiesContents;
      this.groupPath = dataLoadStructure.groupPath;
      this.groupProperties = dataLoadStructure.groupProperties;
      this.groupPropertiesContents = dataLoadStructure.groupPropertiesContents;
      this.groupAssociationsPath = dataLoadStructure.groupAssociationsPath;
      this.groupAssociationsProperties = dataLoadStructure.groupAssociationsProperties;
      this.groupAssociationsPropertiesContents = dataLoadStructure.groupAssociationsPropertiesContents;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataLoadStructure.
     *
     * @return the new DataLoadStructure instance
     */
    public DataLoadStructure build() {
      return new DataLoadStructure(this);
    }

    /**
     * Set the recordPath.
     *
     * @param recordPath the recordPath
     * @return the DataLoadStructure builder
     */
    public Builder recordPath(String recordPath) {
      this.recordPath = recordPath;
      return this;
    }

    /**
     * Set the recordProperties.
     *
     * @param recordProperties the recordProperties
     * @return the DataLoadStructure builder
     */
    public Builder recordProperties(String recordProperties) {
      this.recordProperties = recordProperties;
      return this;
    }

    /**
     * Set the relationshipPath.
     *
     * @param relationshipPath the relationshipPath
     * @return the DataLoadStructure builder
     */
    public Builder relationshipPath(String relationshipPath) {
      this.relationshipPath = relationshipPath;
      return this;
    }

    /**
     * Set the relationshipProperties.
     *
     * @param relationshipProperties the relationshipProperties
     * @return the DataLoadStructure builder
     */
    public Builder relationshipProperties(String relationshipProperties) {
      this.relationshipProperties = relationshipProperties;
      return this;
    }

    /**
     * Set the recordAssetId.
     *
     * @param recordAssetId the recordAssetId
     * @return the DataLoadStructure builder
     */
    public Builder recordAssetId(String recordAssetId) {
      this.recordAssetId = recordAssetId;
      return this;
    }

    /**
     * Set the relationshipAssetId.
     *
     * @param relationshipAssetId the relationshipAssetId
     * @return the DataLoadStructure builder
     */
    public Builder relationshipAssetId(String relationshipAssetId) {
      this.relationshipAssetId = relationshipAssetId;
      return this;
    }

    /**
     * Set the recordPropertiesContents.
     *
     * @param recordPropertiesContents the recordPropertiesContents
     * @return the DataLoadStructure builder
     */
    public Builder recordPropertiesContents(DataLoadProperties recordPropertiesContents) {
      this.recordPropertiesContents = recordPropertiesContents;
      return this;
    }

    /**
     * Set the relationshipPropertiesContents.
     *
     * @param relationshipPropertiesContents the relationshipPropertiesContents
     * @return the DataLoadStructure builder
     */
    public Builder relationshipPropertiesContents(DataLoadProperties relationshipPropertiesContents) {
      this.relationshipPropertiesContents = relationshipPropertiesContents;
      return this;
    }

    /**
     * Set the groupPath.
     *
     * @param groupPath the groupPath
     * @return the DataLoadStructure builder
     */
    public Builder groupPath(String groupPath) {
      this.groupPath = groupPath;
      return this;
    }

    /**
     * Set the groupProperties.
     *
     * @param groupProperties the groupProperties
     * @return the DataLoadStructure builder
     */
    public Builder groupProperties(String groupProperties) {
      this.groupProperties = groupProperties;
      return this;
    }

    /**
     * Set the groupPropertiesContents.
     *
     * @param groupPropertiesContents the groupPropertiesContents
     * @return the DataLoadStructure builder
     */
    public Builder groupPropertiesContents(DataLoadProperties groupPropertiesContents) {
      this.groupPropertiesContents = groupPropertiesContents;
      return this;
    }

    /**
     * Set the groupAssociationsPath.
     *
     * @param groupAssociationsPath the groupAssociationsPath
     * @return the DataLoadStructure builder
     */
    public Builder groupAssociationsPath(String groupAssociationsPath) {
      this.groupAssociationsPath = groupAssociationsPath;
      return this;
    }

    /**
     * Set the groupAssociationsProperties.
     *
     * @param groupAssociationsProperties the groupAssociationsProperties
     * @return the DataLoadStructure builder
     */
    public Builder groupAssociationsProperties(String groupAssociationsProperties) {
      this.groupAssociationsProperties = groupAssociationsProperties;
      return this;
    }

    /**
     * Set the groupAssociationsPropertiesContents.
     *
     * @param groupAssociationsPropertiesContents the groupAssociationsPropertiesContents
     * @return the DataLoadStructure builder
     */
    public Builder groupAssociationsPropertiesContents(DataLoadProperties groupAssociationsPropertiesContents) {
      this.groupAssociationsPropertiesContents = groupAssociationsPropertiesContents;
      return this;
    }
  }

  protected DataLoadStructure() { }

  protected DataLoadStructure(Builder builder) {
    recordPath = builder.recordPath;
    recordProperties = builder.recordProperties;
    relationshipPath = builder.relationshipPath;
    relationshipProperties = builder.relationshipProperties;
    recordAssetId = builder.recordAssetId;
    relationshipAssetId = builder.relationshipAssetId;
    recordPropertiesContents = builder.recordPropertiesContents;
    relationshipPropertiesContents = builder.relationshipPropertiesContents;
    groupPath = builder.groupPath;
    groupProperties = builder.groupProperties;
    groupPropertiesContents = builder.groupPropertiesContents;
    groupAssociationsPath = builder.groupAssociationsPath;
    groupAssociationsProperties = builder.groupAssociationsProperties;
    groupAssociationsPropertiesContents = builder.groupAssociationsPropertiesContents;
  }

  /**
   * New builder.
   *
   * @return a DataLoadStructure builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordPath.
   *
   * The relative path from directory_path to the file or directory containing record data.
   *
   * @return the recordPath
   */
  public String recordPath() {
    return recordPath;
  }

  /**
   * Gets the recordProperties.
   *
   * The relative path from directory_path to the record properties file.
   *
   * @return the recordProperties
   */
  public String recordProperties() {
    return recordProperties;
  }

  /**
   * Gets the relationshipPath.
   *
   * The relative path from directory_path to the file or directory containing relationship data.
   *
   * @return the relationshipPath
   */
  public String relationshipPath() {
    return relationshipPath;
  }

  /**
   * Gets the relationshipProperties.
   *
   * The relative path from directory_path to the relationship properties file.
   *
   * @return the relationshipProperties
   */
  public String relationshipProperties() {
    return relationshipProperties;
  }

  /**
   * Gets the recordAssetId.
   *
   * The id of the WKC record asset containing the bulk load data.
   *
   * @return the recordAssetId
   */
  public String recordAssetId() {
    return recordAssetId;
  }

  /**
   * Gets the relationshipAssetId.
   *
   * The id of the WKC relationship asset containing the bulk load data.
   *
   * @return the relationshipAssetId
   */
  public String relationshipAssetId() {
    return relationshipAssetId;
  }

  /**
   * Gets the recordPropertiesContents.
   *
   * The properties of the data to be loaded.
   *
   * @return the recordPropertiesContents
   */
  public DataLoadProperties recordPropertiesContents() {
    return recordPropertiesContents;
  }

  /**
   * Gets the relationshipPropertiesContents.
   *
   * The properties of the data to be loaded.
   *
   * @return the relationshipPropertiesContents
   */
  public DataLoadProperties relationshipPropertiesContents() {
    return relationshipPropertiesContents;
  }

  /**
   * Gets the groupPath.
   *
   * The relative path from directory_path to the file or directory containing group data.
   *
   * @return the groupPath
   */
  public String groupPath() {
    return groupPath;
  }

  /**
   * Gets the groupProperties.
   *
   * The relative path from directory_path to the group properties file.
   *
   * @return the groupProperties
   */
  public String groupProperties() {
    return groupProperties;
  }

  /**
   * Gets the groupPropertiesContents.
   *
   * The properties of the data to be loaded.
   *
   * @return the groupPropertiesContents
   */
  public DataLoadProperties groupPropertiesContents() {
    return groupPropertiesContents;
  }

  /**
   * Gets the groupAssociationsPath.
   *
   * The relative path from directory_path to the file or directory containing group associations data.
   *
   * @return the groupAssociationsPath
   */
  public String groupAssociationsPath() {
    return groupAssociationsPath;
  }

  /**
   * Gets the groupAssociationsProperties.
   *
   * The relative path from directory_path to the group associations properties file.
   *
   * @return the groupAssociationsProperties
   */
  public String groupAssociationsProperties() {
    return groupAssociationsProperties;
  }

  /**
   * Gets the groupAssociationsPropertiesContents.
   *
   * The properties of the data to be loaded.
   *
   * @return the groupAssociationsPropertiesContents
   */
  public DataLoadProperties groupAssociationsPropertiesContents() {
    return groupAssociationsPropertiesContents;
  }
}

