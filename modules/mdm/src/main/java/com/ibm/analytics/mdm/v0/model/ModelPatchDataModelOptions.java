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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The modelPatchDataModel options.
 */
public class ModelPatchDataModelOptions extends GenericModel {

  protected String crn;
  protected Map<String, DataModelRecordType> recordTypes;
  protected Map<String, DataModelAttributeType> attributeTypes;
  protected Map<String, DataModelRelationshipType> relationshipTypes;
  protected String locale;
  protected DataModelSystemProperties systemProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private Map<String, DataModelRecordType> recordTypes;
    private Map<String, DataModelAttributeType> attributeTypes;
    private Map<String, DataModelRelationshipType> relationshipTypes;
    private String locale;
    private DataModelSystemProperties systemProperties;

    private Builder(ModelPatchDataModelOptions modelPatchDataModelOptions) {
      this.crn = modelPatchDataModelOptions.crn;
      this.recordTypes = modelPatchDataModelOptions.recordTypes;
      this.attributeTypes = modelPatchDataModelOptions.attributeTypes;
      this.relationshipTypes = modelPatchDataModelOptions.relationshipTypes;
      this.locale = modelPatchDataModelOptions.locale;
      this.systemProperties = modelPatchDataModelOptions.systemProperties;
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
     * @param recordTypes the recordTypes
     * @param attributeTypes the attributeTypes
     * @param relationshipTypes the relationshipTypes
     * @param locale the locale
     * @param systemProperties the systemProperties
     */
    public Builder(String crn, Map<String, DataModelRecordType> recordTypes, Map<String, DataModelAttributeType> attributeTypes, Map<String, DataModelRelationshipType> relationshipTypes, String locale, DataModelSystemProperties systemProperties) {
      this.crn = crn;
      this.recordTypes = recordTypes;
      this.attributeTypes = attributeTypes;
      this.relationshipTypes = relationshipTypes;
      this.locale = locale;
      this.systemProperties = systemProperties;
    }

    /**
     * Builds a ModelPatchDataModelOptions.
     *
     * @return the new ModelPatchDataModelOptions instance
     */
    public ModelPatchDataModelOptions build() {
      return new ModelPatchDataModelOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder recordTypes(Map<String, DataModelRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder attributeTypes(Map<String, DataModelAttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder relationshipTypes(Map<String, DataModelRelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder systemProperties(DataModelSystemProperties systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the ModelPatchDataModelOptions builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.recordTypes = dataModel.recordTypes();
      this.attributeTypes = dataModel.attributeTypes();
      this.relationshipTypes = dataModel.relationshipTypes();
      this.locale = dataModel.locale();
      this.systemProperties = dataModel.systemProperties();
      return this;
    }
  }

  protected ModelPatchDataModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.systemProperties,
      "systemProperties cannot be null");
    crn = builder.crn;
    recordTypes = builder.recordTypes;
    attributeTypes = builder.attributeTypes;
    relationshipTypes = builder.relationshipTypes;
    locale = builder.locale;
    systemProperties = builder.systemProperties;
  }

  /**
   * New builder.
   *
   * @return a ModelPatchDataModelOptions builder
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

