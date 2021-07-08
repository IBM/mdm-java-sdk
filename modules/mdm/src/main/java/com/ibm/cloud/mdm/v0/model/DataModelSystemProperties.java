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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of common fields applicable to various types in data model.
 */
public class DataModelSystemProperties extends GenericModel {

  @SerializedName("relationship_types")
  protected DataModelRelationshipTypeSystemProperties relationshipTypes;
  @SerializedName("attribute_types")
  protected DataModelAttributeTypeSystemProperties attributeTypes;
  @SerializedName("record_types")
  protected DataModelRecordTypeSystemProperties recordTypes;
  @SerializedName("entity_types")
  protected DataModelEntityTypeSystemProperties entityTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelRelationshipTypeSystemProperties relationshipTypes;
    private DataModelAttributeTypeSystemProperties attributeTypes;
    private DataModelRecordTypeSystemProperties recordTypes;
    private DataModelEntityTypeSystemProperties entityTypes;

    private Builder(DataModelSystemProperties dataModelSystemProperties) {
      this.relationshipTypes = dataModelSystemProperties.relationshipTypes;
      this.attributeTypes = dataModelSystemProperties.attributeTypes;
      this.recordTypes = dataModelSystemProperties.recordTypes;
      this.entityTypes = dataModelSystemProperties.entityTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param relationshipTypes the relationshipTypes
     * @param attributeTypes the attributeTypes
     * @param recordTypes the recordTypes
     * @param entityTypes the entityTypes
     */
    public Builder(DataModelRelationshipTypeSystemProperties relationshipTypes, DataModelAttributeTypeSystemProperties attributeTypes, DataModelRecordTypeSystemProperties recordTypes, DataModelEntityTypeSystemProperties entityTypes) {
      this.relationshipTypes = relationshipTypes;
      this.attributeTypes = attributeTypes;
      this.recordTypes = recordTypes;
      this.entityTypes = entityTypes;
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
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder recordTypes(DataModelRecordTypeSystemProperties recordTypes) {
      this.recordTypes = recordTypes;
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
  }

  protected DataModelSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityTypes,
      "entityTypes cannot be null");
    relationshipTypes = builder.relationshipTypes;
    attributeTypes = builder.attributeTypes;
    recordTypes = builder.recordTypes;
    entityTypes = builder.entityTypes;
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
   * Gets the recordTypes.
   *
   * Defines metadata of system properties of record types.
   *
   * @return the recordTypes
   */
  public DataModelRecordTypeSystemProperties recordTypes() {
    return recordTypes;
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
}

