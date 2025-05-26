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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateModelDataModel options.
 */
public class UpdateModelDataModelOptions extends GenericModel {

  protected DataModelSystemProperties systemProperties;
  protected Map<String, DataModelAttributeType> attributeTypes;
  protected Map<String, DataModelRelationshipType> relationshipTypes;
  protected String locale;
  protected Map<String, DataModelRecordType> recordTypes;
  protected Map<String, DataModelHierarchyType> hierarchyTypes;
  protected Map<String, DataModelNodeType> nodeTypes;
  protected Map<String, DataModelGroupType> groupTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperties systemProperties;
    private Map<String, DataModelAttributeType> attributeTypes;
    private Map<String, DataModelRelationshipType> relationshipTypes;
    private String locale;
    private Map<String, DataModelRecordType> recordTypes;
    private Map<String, DataModelHierarchyType> hierarchyTypes;
    private Map<String, DataModelNodeType> nodeTypes;
    private Map<String, DataModelGroupType> groupTypes;

    private Builder(UpdateModelDataModelOptions updateModelDataModelOptions) {
      this.systemProperties = updateModelDataModelOptions.systemProperties;
      this.attributeTypes = updateModelDataModelOptions.attributeTypes;
      this.relationshipTypes = updateModelDataModelOptions.relationshipTypes;
      this.locale = updateModelDataModelOptions.locale;
      this.recordTypes = updateModelDataModelOptions.recordTypes;
      this.hierarchyTypes = updateModelDataModelOptions.hierarchyTypes;
      this.nodeTypes = updateModelDataModelOptions.nodeTypes;
      this.groupTypes = updateModelDataModelOptions.groupTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param systemProperties the systemProperties
     * @param attributeTypes the attributeTypes
     * @param relationshipTypes the relationshipTypes
     * @param locale the locale
     * @param recordTypes the recordTypes
     */
    public Builder(DataModelSystemProperties systemProperties, Map<String, DataModelAttributeType> attributeTypes, Map<String, DataModelRelationshipType> relationshipTypes, String locale, Map<String, DataModelRecordType> recordTypes) {
      this.systemProperties = systemProperties;
      this.attributeTypes = attributeTypes;
      this.relationshipTypes = relationshipTypes;
      this.locale = locale;
      this.recordTypes = recordTypes;
    }

    /**
     * Builds a UpdateModelDataModelOptions.
     *
     * @return the new UpdateModelDataModelOptions instance
     */
    public UpdateModelDataModelOptions build() {
      return new UpdateModelDataModelOptions(this);
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder systemProperties(DataModelSystemProperties systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder attributeTypes(Map<String, DataModelAttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder relationshipTypes(Map<String, DataModelRelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder recordTypes(Map<String, DataModelRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder hierarchyTypes(Map<String, DataModelHierarchyType> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the nodeTypes.
     *
     * @param nodeTypes the nodeTypes
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder nodeTypes(Map<String, DataModelNodeType> nodeTypes) {
      this.nodeTypes = nodeTypes;
      return this;
    }

    /**
     * Set the groupTypes.
     *
     * @param groupTypes the groupTypes
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder groupTypes(Map<String, DataModelGroupType> groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }

    /**
     * Set the dataModel.
     *
     * @param dataModel the dataModel
     * @return the UpdateModelDataModelOptions builder
     */
    public Builder dataModel(DataModel dataModel) {
      this.systemProperties = dataModel.systemProperties();
      this.attributeTypes = dataModel.attributeTypes();
      this.relationshipTypes = dataModel.relationshipTypes();
      this.locale = dataModel.locale();
      this.recordTypes = dataModel.recordTypes();
      this.hierarchyTypes = dataModel.hierarchyTypes();
      this.nodeTypes = dataModel.nodeTypes();
      this.groupTypes = dataModel.groupTypes();
      return this;
    }
  }

  protected UpdateModelDataModelOptions() { }

  protected UpdateModelDataModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.systemProperties,
      "systemProperties cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    systemProperties = builder.systemProperties;
    attributeTypes = builder.attributeTypes;
    relationshipTypes = builder.relationshipTypes;
    locale = builder.locale;
    recordTypes = builder.recordTypes;
    hierarchyTypes = builder.hierarchyTypes;
    nodeTypes = builder.nodeTypes;
    groupTypes = builder.groupTypes;
  }

  /**
   * New builder.
   *
   * @return a UpdateModelDataModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the hierarchyTypes.
   *
   * Collection of hierarchy types. The hierarchy type key must be lower snake case (i.e. legal_hierarchy).
   *
   * @return the hierarchyTypes
   */
  public Map<String, DataModelHierarchyType> hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the nodeTypes.
   *
   * Collection of node types. The node type key must be lower snake case (i.e. hierarchy_node).
   *
   * @return the nodeTypes
   */
  public Map<String, DataModelNodeType> nodeTypes() {
    return nodeTypes;
  }

  /**
   * Gets the groupTypes.
   *
   * Collection of group types. The group type key must be lower snake case (i.e. baseball_club).
   *
   * @return the groupTypes
   */
  public Map<String, DataModelGroupType> groupTypes() {
    return groupTypes;
  }
}

