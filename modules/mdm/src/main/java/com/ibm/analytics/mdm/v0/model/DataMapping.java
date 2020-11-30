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
 * Data mapping object for column in asset.
 */
public class DataMapping extends GenericModel {

  @SerializedName("data_mapping_default_display_name")
  protected String dataMappingDefaultDisplayName;
  @SerializedName("classified_class")
  protected String classifiedClass;
  @SerializedName("data_mapping_name")
  protected String dataMappingName;
  protected String key;

  /**
   * Builder.
   */
  public static class Builder {
    private String classifiedClass;
    private String key;

    private Builder(DataMapping dataMapping) {
      this.classifiedClass = dataMapping.classifiedClass;
      this.key = dataMapping.key;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param classifiedClass the classifiedClass
     * @param key the key
     */
    public Builder(String classifiedClass, String key) {
      this.classifiedClass = classifiedClass;
      this.key = key;
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
     * Set the classifiedClass.
     *
     * @param classifiedClass the classifiedClass
     * @return the DataMapping builder
     */
    public Builder classifiedClass(String classifiedClass) {
      this.classifiedClass = classifiedClass;
      return this;
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
  }

  protected DataMapping(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classifiedClass,
      "classifiedClass cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    classifiedClass = builder.classifiedClass;
    key = builder.key;
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
   * Gets the dataMappingDefaultDisplayName.
   *
   * display name of data attribute.
   *
   * @return the dataMappingDefaultDisplayName
   */
  public String dataMappingDefaultDisplayName() {
    return dataMappingDefaultDisplayName;
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

