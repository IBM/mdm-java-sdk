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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of record and relationship types definition.
 */
public class DataModel extends GenericModel {

  @SerializedName("hierarchy_types")
  protected Map<String, DataModelHierarchyType> hierarchyTypes;
  @SerializedName("node_types")
  protected Map<String, DataModelNodeType> nodeTypes;
  @SerializedName("system_properties")
  protected DataModelSystemProperties systemProperties;
  @SerializedName("attribute_types")
  protected Map<String, DataModelAttributeType> attributeTypes;
  @SerializedName("group_types")
  protected Map<String, DataModelGroupType> groupTypes;
  @SerializedName("relationship_types")
  protected Map<String, DataModelRelationshipType> relationshipTypes;
  protected String locale;
  @SerializedName("record_types")
  protected Map<String, DataModelRecordType> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, DataModelHierarchyType> hierarchyTypes;
    private Map<String, DataModelNodeType> nodeTypes;
    private DataModelSystemProperties systemProperties;
    private Map<String, DataModelAttributeType> attributeTypes;
    private Map<String, DataModelGroupType> groupTypes;
    private Map<String, DataModelRelationshipType> relationshipTypes;
    private String locale;
    private Map<String, DataModelRecordType> recordTypes;

    private Builder(DataModel dataModel) {
      this.hierarchyTypes = dataModel.hierarchyTypes;
      this.nodeTypes = dataModel.nodeTypes;
      this.systemProperties = dataModel.systemProperties;
      this.attributeTypes = dataModel.attributeTypes;
      this.groupTypes = dataModel.groupTypes;
      this.relationshipTypes = dataModel.relationshipTypes;
      this.locale = dataModel.locale;
      this.recordTypes = dataModel.recordTypes;
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
     * Builds a DataModel.
     *
     * @return the new DataModel instance
     */
    public DataModel build() {
      return new DataModel(this);
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the DataModel builder
     */
    public Builder hierarchyTypes(Map<String, DataModelHierarchyType> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the nodeTypes.
     *
     * @param nodeTypes the nodeTypes
     * @return the DataModel builder
     */
    public Builder nodeTypes(Map<String, DataModelNodeType> nodeTypes) {
      this.nodeTypes = nodeTypes;
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
     * Set the groupTypes.
     *
     * @param groupTypes the groupTypes
     * @return the DataModel builder
     */
    public Builder groupTypes(Map<String, DataModelGroupType> groupTypes) {
      this.groupTypes = groupTypes;
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
     * Set the locale.
     *
     * @param locale the locale
     * @return the DataModel builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
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
  }

  protected DataModel() { }

  protected DataModel(Builder builder) {
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
    hierarchyTypes = builder.hierarchyTypes;
    nodeTypes = builder.nodeTypes;
    systemProperties = builder.systemProperties;
    attributeTypes = builder.attributeTypes;
    groupTypes = builder.groupTypes;
    relationshipTypes = builder.relationshipTypes;
    locale = builder.locale;
    recordTypes = builder.recordTypes;
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
   * Gets the groupTypes.
   *
   * Collection of group types. The group type key must be lower snake case (i.e. baseball_club).
   *
   * @return the groupTypes
   */
  public Map<String, DataModelGroupType> groupTypes() {
    return groupTypes;
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
}

