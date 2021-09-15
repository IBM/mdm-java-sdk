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
package com.ibm.cloud.mdm.v1.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of record and relationship types definition.
 */
public class DataModel extends GenericModel {

  @SerializedName("record_types")
  protected Map<String, DataModelRecordType> recordTypes;
  @SerializedName("relationship_types")
  protected Map<String, DataModelRelationshipType> relationshipTypes;
  @SerializedName("attribute_types")
  protected Map<String, DataModelAttributeType> attributeTypes;
  @SerializedName("system_properties")
  protected DataModelSystemProperties systemProperties;
  protected String locale;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, DataModelRecordType> recordTypes;
    private Map<String, DataModelRelationshipType> relationshipTypes;
    private Map<String, DataModelAttributeType> attributeTypes;
    private DataModelSystemProperties systemProperties;
    private String locale;

    private Builder(DataModel dataModel) {
      this.recordTypes = dataModel.recordTypes;
      this.relationshipTypes = dataModel.relationshipTypes;
      this.attributeTypes = dataModel.attributeTypes;
      this.systemProperties = dataModel.systemProperties;
      this.locale = dataModel.locale;
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
     * @param systemProperties the systemProperties
     * @param locale the locale
     */
    public Builder(Map<String, DataModelRecordType> recordTypes, Map<String, DataModelRelationshipType> relationshipTypes, Map<String, DataModelAttributeType> attributeTypes, DataModelSystemProperties systemProperties, String locale) {
      this.recordTypes = recordTypes;
      this.relationshipTypes = relationshipTypes;
      this.attributeTypes = attributeTypes;
      this.systemProperties = systemProperties;
      this.locale = locale;
    }

    /**
     * Builds a DataModel.
     *
     * @return the new DataModel instance
     */
    public DataModel build() {
      return new DataModel(this);
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the DataModel builder
     */
    public Builder recordTypes(Map<String, DataModelRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the DataModel builder
     */
    public Builder relationshipTypes(Map<String, DataModelRelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the DataModel builder
     */
    public Builder attributeTypes(Map<String, DataModelAttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the DataModel builder
     */
    public Builder systemProperties(DataModelSystemProperties systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the DataModel builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }
  }

  protected DataModel(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.systemProperties,
      "systemProperties cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    recordTypes = builder.recordTypes;
    relationshipTypes = builder.relationshipTypes;
    attributeTypes = builder.attributeTypes;
    systemProperties = builder.systemProperties;
    locale = builder.locale;
  }

  /**
   * New builder.
   *
   * @return a DataModel builder
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
   * Gets the systemProperties.
   *
   * Collection of common fields applicable to various types in data model.
   *
   * @return the systemProperties
   */
  public DataModelSystemProperties systemProperties() {
    return systemProperties;
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
}

