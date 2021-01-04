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
 * The modelModifyDataModel options.
 */
public class ModelModifyDataModelOptions extends GenericModel {

  protected String crn;
  protected Map<String, DataModelAttributeType> attributeTypes;
  protected Map<String, DataModelRelationshipType> relationshipTypes;
  protected Map<String, DataModelRecordType> recordTypes;
  protected String locale;
  protected DataModelSystemProperties systemProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private Map<String, DataModelAttributeType> attributeTypes;
    private Map<String, DataModelRelationshipType> relationshipTypes;
    private Map<String, DataModelRecordType> recordTypes;
    private String locale;
    private DataModelSystemProperties systemProperties;

    private Builder(ModelModifyDataModelOptions modelModifyDataModelOptions) {
      this.crn = modelModifyDataModelOptions.crn;
      this.attributeTypes = modelModifyDataModelOptions.attributeTypes;
      this.relationshipTypes = modelModifyDataModelOptions.relationshipTypes;
      this.recordTypes = modelModifyDataModelOptions.recordTypes;
      this.locale = modelModifyDataModelOptions.locale;
      this.systemProperties = modelModifyDataModelOptions.systemProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param attributeTypes the attributeTypes
     * @param relationshipTypes the relationshipTypes
     * @param recordTypes the recordTypes
     * @param locale the locale
     * @param systemProperties the systemProperties
     */
    public Builder(String crn, Map<String, DataModelAttributeType> attributeTypes, Map<String, DataModelRelationshipType> relationshipTypes, Map<String, DataModelRecordType> recordTypes, String locale, DataModelSystemProperties systemProperties) {
      this.crn = crn;
      this.attributeTypes = attributeTypes;
      this.relationshipTypes = relationshipTypes;
      this.recordTypes = recordTypes;
      this.locale = locale;
      this.systemProperties = systemProperties;
    }

    /**
     * Builds a ModelModifyDataModelOptions.
     *
     * @return the new ModelModifyDataModelOptions instance
     */
    public ModelModifyDataModelOptions build() {
      return new ModelModifyDataModelOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder attributeTypes(Map<String, DataModelAttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder relationshipTypes(Map<String, DataModelRelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder recordTypes(Map<String, DataModelRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder systemProperties(DataModelSystemProperties systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the ModelModifyDataModelOptions builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.attributeTypes = dataModel.attributeTypes();
      this.relationshipTypes = dataModel.relationshipTypes();
      this.recordTypes = dataModel.recordTypes();
      this.locale = dataModel.locale();
      this.systemProperties = dataModel.systemProperties();
      return this;
    }
  }

  protected ModelModifyDataModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.systemProperties,
      "systemProperties cannot be null");
    crn = builder.crn;
    attributeTypes = builder.attributeTypes;
    relationshipTypes = builder.relationshipTypes;
    recordTypes = builder.recordTypes;
    locale = builder.locale;
    systemProperties = builder.systemProperties;
  }

  /**
   * New builder.
   *
   * @return a ModelModifyDataModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

