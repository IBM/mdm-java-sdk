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
 * Collection of common fields applicable to various types in data model.
 */
public class DataModelSystemProperties extends GenericModel {

  @SerializedName("hierarchy_types")
  protected DataModelHierarchyTypeSystemProperties hierarchyTypes;
  @SerializedName("node_types")
  protected DataModelNodeTypeSystemProperties nodeTypes;
  @SerializedName("attribute_types")
  protected DataModelAttributeTypeSystemProperties attributeTypes;
  @SerializedName("group_types")
  protected DataModelGroupTypeSystemProperties groupTypes;
  @SerializedName("entity_types")
  protected DataModelEntityTypeSystemProperties entityTypes;
  @SerializedName("relationship_types")
  protected DataModelRelationshipTypeSystemProperties relationshipTypes;
  protected String version;
  @SerializedName("record_types")
  protected DataModelRecordTypeSystemProperties recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelHierarchyTypeSystemProperties hierarchyTypes;
    private DataModelNodeTypeSystemProperties nodeTypes;
    private DataModelAttributeTypeSystemProperties attributeTypes;
    private DataModelGroupTypeSystemProperties groupTypes;
    private DataModelEntityTypeSystemProperties entityTypes;
    private DataModelRelationshipTypeSystemProperties relationshipTypes;
    private String version;
    private DataModelRecordTypeSystemProperties recordTypes;

    private Builder(DataModelSystemProperties dataModelSystemProperties) {
      this.hierarchyTypes = dataModelSystemProperties.hierarchyTypes;
      this.nodeTypes = dataModelSystemProperties.nodeTypes;
      this.attributeTypes = dataModelSystemProperties.attributeTypes;
      this.groupTypes = dataModelSystemProperties.groupTypes;
      this.entityTypes = dataModelSystemProperties.entityTypes;
      this.relationshipTypes = dataModelSystemProperties.relationshipTypes;
      this.version = dataModelSystemProperties.version;
      this.recordTypes = dataModelSystemProperties.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributeTypes the attributeTypes
     * @param entityTypes the entityTypes
     * @param relationshipTypes the relationshipTypes
     * @param recordTypes the recordTypes
     */
    public Builder(DataModelAttributeTypeSystemProperties attributeTypes, DataModelEntityTypeSystemProperties entityTypes, DataModelRelationshipTypeSystemProperties relationshipTypes, DataModelRecordTypeSystemProperties recordTypes) {
      this.attributeTypes = attributeTypes;
      this.entityTypes = entityTypes;
      this.relationshipTypes = relationshipTypes;
      this.recordTypes = recordTypes;
    }

    /**
     * Builds a DataModelSystemProperties.
     *
     * @return the new DataModelSystemProperties instance
     */
    public DataModelSystemProperties build() {
      return new DataModelSystemProperties(this);
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder hierarchyTypes(DataModelHierarchyTypeSystemProperties hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the nodeTypes.
     *
     * @param nodeTypes the nodeTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder nodeTypes(DataModelNodeTypeSystemProperties nodeTypes) {
      this.nodeTypes = nodeTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder attributeTypes(DataModelAttributeTypeSystemProperties attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the groupTypes.
     *
     * @param groupTypes the groupTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder groupTypes(DataModelGroupTypeSystemProperties groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder entityTypes(DataModelEntityTypeSystemProperties entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder relationshipTypes(DataModelRelationshipTypeSystemProperties relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the DataModelSystemProperties builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder recordTypes(DataModelRecordTypeSystemProperties recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected DataModelSystemProperties() { }

  protected DataModelSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityTypes,
      "entityTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    hierarchyTypes = builder.hierarchyTypes;
    nodeTypes = builder.nodeTypes;
    attributeTypes = builder.attributeTypes;
    groupTypes = builder.groupTypes;
    entityTypes = builder.entityTypes;
    relationshipTypes = builder.relationshipTypes;
    version = builder.version;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a DataModelSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyTypes.
   *
   * Defines metadata of system properties of hierarchy types.
   *
   * @return the hierarchyTypes
   */
  public DataModelHierarchyTypeSystemProperties hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the nodeTypes.
   *
   * Defines metadata of system properties of node types.
   *
   * @return the nodeTypes
   */
  public DataModelNodeTypeSystemProperties nodeTypes() {
    return nodeTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * Defines metadata of system properties of all attribute types.
   *
   * @return the attributeTypes
   */
  public DataModelAttributeTypeSystemProperties attributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the groupTypes.
   *
   * Defines metadata of system properties of group types.
   *
   * @return the groupTypes
   */
  public DataModelGroupTypeSystemProperties groupTypes() {
    return groupTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * Defines metadata of system properties of all entity types.
   *
   * @return the entityTypes
   */
  public DataModelEntityTypeSystemProperties entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * Defines metadata of system properties of all relationship types.
   *
   * @return the relationshipTypes
   */
  public DataModelRelationshipTypeSystemProperties relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the version.
   *
   * Internal version of system properties.
   *
   * @return the version
   */
  public String version() {
    return version;
  }

  /**
   * Gets the recordTypes.
   *
   * Defines metadata of system properties of record types.
   *
   * @return the recordTypes
   */
  public DataModelRecordTypeSystemProperties recordTypes() {
    return recordTypes;
  }
}

