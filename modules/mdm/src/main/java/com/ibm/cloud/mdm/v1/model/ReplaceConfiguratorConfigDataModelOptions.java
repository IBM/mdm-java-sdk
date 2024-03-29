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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceConfiguratorConfigDataModel options.
 */
public class ReplaceConfiguratorConfigDataModelOptions extends GenericModel {

  protected Map<String, RecordType> recordTypes;
  protected Map<String, RelationshipType> relationshipTypes;
  protected Map<String, AttributeType> attributeTypes;
  protected String locale;
  protected Map<String, SystemProperties> systemProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, RecordType> recordTypes;
    private Map<String, RelationshipType> relationshipTypes;
    private Map<String, AttributeType> attributeTypes;
    private String locale;
    private Map<String, SystemProperties> systemProperties;

    private Builder(ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptions) {
      this.recordTypes = replaceConfiguratorConfigDataModelOptions.recordTypes;
      this.relationshipTypes = replaceConfiguratorConfigDataModelOptions.relationshipTypes;
      this.attributeTypes = replaceConfiguratorConfigDataModelOptions.attributeTypes;
      this.locale = replaceConfiguratorConfigDataModelOptions.locale;
      this.systemProperties = replaceConfiguratorConfigDataModelOptions.systemProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceConfiguratorConfigDataModelOptions.
     *
     * @return the new ReplaceConfiguratorConfigDataModelOptions instance
     */
    public ReplaceConfiguratorConfigDataModelOptions build() {
      return new ReplaceConfiguratorConfigDataModelOptions(this);
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the ReplaceConfiguratorConfigDataModelOptions builder
     */
    public Builder recordTypes(Map<String, RecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the ReplaceConfiguratorConfigDataModelOptions builder
     */
    public Builder relationshipTypes(Map<String, RelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the ReplaceConfiguratorConfigDataModelOptions builder
     */
    public Builder attributeTypes(Map<String, AttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the ReplaceConfiguratorConfigDataModelOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the ReplaceConfiguratorConfigDataModelOptions builder
     */
    public Builder systemProperties(Map<String, SystemProperties> systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the configDataModel.
     *
     * @param configDataModel the configDataModel
     * @return the ReplaceConfiguratorConfigDataModelOptions builder
     */
    public Builder configDataModel(ConfigDataModel configDataModel) {
      this.recordTypes = configDataModel.recordTypes();
      this.relationshipTypes = configDataModel.relationshipTypes();
      this.attributeTypes = configDataModel.attributeTypes();
      this.locale = configDataModel.locale();
      this.systemProperties = configDataModel.systemProperties();
      return this;
    }
  }

  protected ReplaceConfiguratorConfigDataModelOptions(Builder builder) {
    recordTypes = builder.recordTypes;
    relationshipTypes = builder.relationshipTypes;
    attributeTypes = builder.attributeTypes;
    locale = builder.locale;
    systemProperties = builder.systemProperties;
  }

  /**
   * New builder.
   *
   * @return a ReplaceConfiguratorConfigDataModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of record data types.
   *
   * @return the recordTypes
   */
  public Map<String, RecordType> recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * The collection of data relationship types.
   *
   * @return the relationshipTypes
   */
  public Map<String, RelationshipType> relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * Collection of data attribute types.
   *
   * @return the attributeTypes
   */
  public Map<String, AttributeType> attributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the locale.
   *
   * The locale of the data model.
   *
   * @return the locale
   */
  public String locale() {
    return locale;
  }

  /**
   * Gets the systemProperties.
   *
   * Collection of system properties.
   *
   * @return the systemProperties
   */
  public Map<String, SystemProperties> systemProperties() {
    return systemProperties;
  }
}

