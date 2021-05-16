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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceModelDataModel options.
 */
public class ReplaceModelDataModelOptions extends GenericModel {

  protected Map<String, DataModelRecordType> recordTypes;
  protected Map<String, DataModelRelationshipType> relationshipTypes;
  protected Map<String, DataModelAttributeType> attributeTypes;
  protected String locale;
  protected DataModelSystemProperties systemProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, DataModelRecordType> recordTypes;
    private Map<String, DataModelRelationshipType> relationshipTypes;
    private Map<String, DataModelAttributeType> attributeTypes;
    private String locale;
    private DataModelSystemProperties systemProperties;

    private Builder(ReplaceModelDataModelOptions replaceModelDataModelOptions) {
      this.recordTypes = replaceModelDataModelOptions.recordTypes;
      this.relationshipTypes = replaceModelDataModelOptions.relationshipTypes;
      this.attributeTypes = replaceModelDataModelOptions.attributeTypes;
      this.locale = replaceModelDataModelOptions.locale;
      this.systemProperties = replaceModelDataModelOptions.systemProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordTypes the recordTypes
     * @param relationshipTypes the relationshipTypes
     * @param attributeTypes the attributeTypes
     * @param locale the locale
     * @param systemProperties the systemProperties
     */
    public Builder(Map<String, DataModelRecordType> recordTypes, Map<String, DataModelRelationshipType> relationshipTypes, Map<String, DataModelAttributeType> attributeTypes, String locale, DataModelSystemProperties systemProperties) {
      this.recordTypes = recordTypes;
      this.relationshipTypes = relationshipTypes;
      this.attributeTypes = attributeTypes;
      this.locale = locale;
      this.systemProperties = systemProperties;
    }

    /**
     * Builds a ReplaceModelDataModelOptions.
     *
     * @return the new ReplaceModelDataModelOptions instance
     */
    public ReplaceModelDataModelOptions build() {
      return new ReplaceModelDataModelOptions(this);
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the ReplaceModelDataModelOptions builder
     */
    public Builder recordTypes(Map<String, DataModelRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the ReplaceModelDataModelOptions builder
     */
    public Builder relationshipTypes(Map<String, DataModelRelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the ReplaceModelDataModelOptions builder
     */
    public Builder attributeTypes(Map<String, DataModelAttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the ReplaceModelDataModelOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the ReplaceModelDataModelOptions builder
     */
    public Builder systemProperties(DataModelSystemProperties systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the ReplaceModelDataModelOptions builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.recordTypes = dataModel.recordTypes();
      this.relationshipTypes = dataModel.relationshipTypes();
      this.attributeTypes = dataModel.attributeTypes();
      this.locale = dataModel.locale();
      this.systemProperties = dataModel.systemProperties();
      return this;
    }
  }

  protected ReplaceModelDataModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.systemProperties,
      "systemProperties cannot be null");
    recordTypes = builder.recordTypes;
    relationshipTypes = builder.relationshipTypes;
    attributeTypes = builder.attributeTypes;
    locale = builder.locale;
    systemProperties = builder.systemProperties;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelDataModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of user defined record types. The record type key must be lower snake case (i.e. person, organization).
   *
   * @return the recordTypes
   */
  public Map<String, DataModelRecordType> recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * Collection of relationship types. The relationship type key must be lower snake case (i.e. employment).
   *
   * @return the relationshipTypes
   */
  public Map<String, DataModelRelationshipType> relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * Collection of user defined attribute types. The attribute type key must be lower snake case (i.e. address).
   *
   * @return the attributeTypes
   */
  public Map<String, DataModelAttributeType> attributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the locale.
   *
   * The request language and location (i.e. enUS).
   *
   * @return the locale
   */
  public String locale() {
    return locale;
  }

  /**
   * Gets the systemProperties.
   *
   * Collection of common fields applicable to various types in data model.
   *
   * @return the systemProperties
   */
  public DataModelSystemProperties systemProperties() {
    return systemProperties;
  }
}

