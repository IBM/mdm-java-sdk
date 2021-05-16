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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The structure of the data within the source directory.
 */
public class BulkLoadRequestDataStructure extends GenericModel {

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
  protected BulkLoadRequestDataStructureRecordPropertiesContents recordPropertiesContents;
  @SerializedName("relationship_properties_contents")
  protected BulkLoadRequestDataStructureRelationshipPropertiesContents relationshipPropertiesContents;

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
    private BulkLoadRequestDataStructureRecordPropertiesContents recordPropertiesContents;
    private BulkLoadRequestDataStructureRelationshipPropertiesContents relationshipPropertiesContents;

    private Builder(BulkLoadRequestDataStructure bulkLoadRequestDataStructure) {
      this.recordPath = bulkLoadRequestDataStructure.recordPath;
      this.recordProperties = bulkLoadRequestDataStructure.recordProperties;
      this.relationshipPath = bulkLoadRequestDataStructure.relationshipPath;
      this.relationshipProperties = bulkLoadRequestDataStructure.relationshipProperties;
      this.recordAssetId = bulkLoadRequestDataStructure.recordAssetId;
      this.relationshipAssetId = bulkLoadRequestDataStructure.relationshipAssetId;
      this.recordPropertiesContents = bulkLoadRequestDataStructure.recordPropertiesContents;
      this.relationshipPropertiesContents = bulkLoadRequestDataStructure.relationshipPropertiesContents;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BulkLoadRequestDataStructure.
     *
     * @return the new BulkLoadRequestDataStructure instance
     */
    public BulkLoadRequestDataStructure build() {
      return new BulkLoadRequestDataStructure(this);
    }

    /**
     * Set the recordPath.
     *
     * @param recordPath the recordPath
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder recordPath(String recordPath) {
      this.recordPath = recordPath;
      return this;
    }

    /**
     * Set the recordProperties.
     *
     * @param recordProperties the recordProperties
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder recordProperties(String recordProperties) {
      this.recordProperties = recordProperties;
      return this;
    }

    /**
     * Set the relationshipPath.
     *
     * @param relationshipPath the relationshipPath
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder relationshipPath(String relationshipPath) {
      this.relationshipPath = relationshipPath;
      return this;
    }

    /**
     * Set the relationshipProperties.
     *
     * @param relationshipProperties the relationshipProperties
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder relationshipProperties(String relationshipProperties) {
      this.relationshipProperties = relationshipProperties;
      return this;
    }

    /**
     * Set the recordAssetId.
     *
     * @param recordAssetId the recordAssetId
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder recordAssetId(String recordAssetId) {
      this.recordAssetId = recordAssetId;
      return this;
    }

    /**
     * Set the relationshipAssetId.
     *
     * @param relationshipAssetId the relationshipAssetId
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder relationshipAssetId(String relationshipAssetId) {
      this.relationshipAssetId = relationshipAssetId;
      return this;
    }

    /**
     * Set the recordPropertiesContents.
     *
     * @param recordPropertiesContents the recordPropertiesContents
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder recordPropertiesContents(BulkLoadRequestDataStructureRecordPropertiesContents recordPropertiesContents) {
      this.recordPropertiesContents = recordPropertiesContents;
      return this;
    }

    /**
     * Set the relationshipPropertiesContents.
     *
     * @param relationshipPropertiesContents the relationshipPropertiesContents
     * @return the BulkLoadRequestDataStructure builder
     */
    public Builder relationshipPropertiesContents(BulkLoadRequestDataStructureRelationshipPropertiesContents relationshipPropertiesContents) {
      this.relationshipPropertiesContents = relationshipPropertiesContents;
      return this;
    }
  }

  protected BulkLoadRequestDataStructure(Builder builder) {
    recordPath = builder.recordPath;
    recordProperties = builder.recordProperties;
    relationshipPath = builder.relationshipPath;
    relationshipProperties = builder.relationshipProperties;
    recordAssetId = builder.recordAssetId;
    relationshipAssetId = builder.relationshipAssetId;
    recordPropertiesContents = builder.recordPropertiesContents;
    relationshipPropertiesContents = builder.relationshipPropertiesContents;
  }

  /**
   * New builder.
   *
   * @return a BulkLoadRequestDataStructure builder
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
   * The record properties of the bulk load data.
   *
   * @return the recordPropertiesContents
   */
  public BulkLoadRequestDataStructureRecordPropertiesContents recordPropertiesContents() {
    return recordPropertiesContents;
  }

  /**
   * Gets the relationshipPropertiesContents.
   *
   * The relationship properties of the bulk load data.
   *
   * @return the relationshipPropertiesContents
   */
  public BulkLoadRequestDataStructureRelationshipPropertiesContents relationshipPropertiesContents() {
    return relationshipPropertiesContents;
  }
}

