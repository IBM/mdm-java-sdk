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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Asset data mapping object for column in asset.
 */
public class AssetMapping extends GenericModel {

  @SerializedName("completeness_percent")
  protected String completenessPercent;
  @SerializedName("data_mapping_attribute_type")
  protected String dataMappingAttributeType;
  @SerializedName("classified_class")
  protected String classifiedClass;
  @SerializedName("data_mapping_name")
  protected String dataMappingName;
  @SerializedName("exclude_column")
  protected Boolean excludeColumn;
  @SerializedName("auto_mapped")
  protected Boolean autoMapped;
  protected String key;

  /**
   * Builder.
   */
  public static class Builder {
    private String completenessPercent;
    private String dataMappingAttributeType;
    private String classifiedClass;
    private String dataMappingName;
    private Boolean excludeColumn;
    private Boolean autoMapped;
    private String key;

    private Builder(AssetMapping assetMapping) {
      this.completenessPercent = assetMapping.completenessPercent;
      this.dataMappingAttributeType = assetMapping.dataMappingAttributeType;
      this.classifiedClass = assetMapping.classifiedClass;
      this.dataMappingName = assetMapping.dataMappingName;
      this.excludeColumn = assetMapping.excludeColumn;
      this.autoMapped = assetMapping.autoMapped;
      this.key = assetMapping.key;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AssetMapping.
     *
     * @return the new AssetMapping instance
     */
    public AssetMapping build() {
      return new AssetMapping(this);
    }

    /**
     * Set the completenessPercent.
     *
     * @param completenessPercent the completenessPercent
     * @return the AssetMapping builder
     */
    public Builder completenessPercent(String completenessPercent) {
      this.completenessPercent = completenessPercent;
      return this;
    }

    /**
     * Set the dataMappingAttributeType.
     *
     * @param dataMappingAttributeType the dataMappingAttributeType
     * @return the AssetMapping builder
     */
    public Builder dataMappingAttributeType(String dataMappingAttributeType) {
      this.dataMappingAttributeType = dataMappingAttributeType;
      return this;
    }

    /**
     * Set the classifiedClass.
     *
     * @param classifiedClass the classifiedClass
     * @return the AssetMapping builder
     */
    public Builder classifiedClass(String classifiedClass) {
      this.classifiedClass = classifiedClass;
      return this;
    }

    /**
     * Set the dataMappingName.
     *
     * @param dataMappingName the dataMappingName
     * @return the AssetMapping builder
     */
    public Builder dataMappingName(String dataMappingName) {
      this.dataMappingName = dataMappingName;
      return this;
    }

    /**
     * Set the excludeColumn.
     *
     * @param excludeColumn the excludeColumn
     * @return the AssetMapping builder
     */
    public Builder excludeColumn(Boolean excludeColumn) {
      this.excludeColumn = excludeColumn;
      return this;
    }

    /**
     * Set the autoMapped.
     *
     * @param autoMapped the autoMapped
     * @return the AssetMapping builder
     */
    public Builder autoMapped(Boolean autoMapped) {
      this.autoMapped = autoMapped;
      return this;
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the AssetMapping builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }

  protected AssetMapping(Builder builder) {
    completenessPercent = builder.completenessPercent;
    dataMappingAttributeType = builder.dataMappingAttributeType;
    classifiedClass = builder.classifiedClass;
    dataMappingName = builder.dataMappingName;
    excludeColumn = builder.excludeColumn;
    autoMapped = builder.autoMapped;
    key = builder.key;
  }

  /**
   * New builder.
   *
   * @return a AssetMapping builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the completenessPercent.
   *
   * completeness percent of the column.
   *
   * @return the completenessPercent
   */
  public String completenessPercent() {
    return completenessPercent;
  }

  /**
   * Gets the dataMappingAttributeType.
   *
   * data mapping attribute type.
   *
   * @return the dataMappingAttributeType
   */
  public String dataMappingAttributeType() {
    return dataMappingAttributeType;
  }

  /**
   * Gets the classifiedClass.
   *
   * classified class.
   *
   * @return the classifiedClass
   */
  public String classifiedClass() {
    return classifiedClass;
  }

  /**
   * Gets the dataMappingName.
   *
   * attribute name.
   *
   * @return the dataMappingName
   */
  public String dataMappingName() {
    return dataMappingName;
  }

  /**
   * Gets the excludeColumn.
   *
   * exclude column from mapping.
   *
   * @return the excludeColumn
   */
  public Boolean excludeColumn() {
    return excludeColumn;
  }

  /**
   * Gets the autoMapped.
   *
   * auto mapped by suggestions.
   *
   * @return the autoMapped
   */
  public Boolean autoMapped() {
    return autoMapped;
  }

  /**
   * Gets the key.
   *
   * key.
   *
   * @return the key
   */
  public String key() {
    return key;
  }
}

