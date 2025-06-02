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
 * The Data mapping details for data mapping column of Data Asset.
 */
public class DataMapping extends GenericModel {

  protected String key;
  @SerializedName("classified_class")
  protected String classifiedClass;
  @SerializedName("data_mapping_name")
  protected String dataMappingName;
  @SerializedName("data_mapping_default_display_name")
  protected String dataMappingDefaultDisplayName;

  /**
   * Builder.
   */
  public static class Builder {
    private String key;
    private String classifiedClass;

    /**
     * Instantiates a new Builder from an existing DataMapping instance.
     *
     * @param dataMapping the instance to initialize the Builder with
     */
    private Builder(DataMapping dataMapping) {
      this.key = dataMapping.key;
      this.classifiedClass = dataMapping.classifiedClass;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param key the key
     * @param classifiedClass the classifiedClass
     */
    public Builder(String key, String classifiedClass) {
      this.key = key;
      this.classifiedClass = classifiedClass;
    }

    /**
     * Builds a DataMapping.
     *
     * @return the new DataMapping instance
     */
    public DataMapping build() {
      return new DataMapping(this);
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the DataMapping builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the classifiedClass.
     *
     * @param classifiedClass the classifiedClass
     * @return the DataMapping builder
     */
    public Builder classifiedClass(String classifiedClass) {
      this.classifiedClass = classifiedClass;
      return this;
    }
  }

  protected DataMapping() { }

  protected DataMapping(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classifiedClass,
      "classifiedClass cannot be null");
    key = builder.key;
    classifiedClass = builder.classifiedClass;
  }

  /**
   * New builder.
   *
   * @return a DataMapping builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the key.
   *
   * The key of the Data asset column.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the classifiedClass.
   *
   * The classified class of the Data asset column.
   *
   * @return the classifiedClass
   */
  public String classifiedClass() {
    return classifiedClass;
  }

  /**
   * Gets the dataMappingName.
   *
   * The Data mapping name of the Data asset column.
   *
   * @return the dataMappingName
   */
  public String dataMappingName() {
    return dataMappingName;
  }

  /**
   * Gets the dataMappingDefaultDisplayName.
   *
   * The displayable name for the data mapping attribute.
   *
   * @return the dataMappingDefaultDisplayName
   */
  public String dataMappingDefaultDisplayName() {
    return dataMappingDefaultDisplayName;
  }
}

