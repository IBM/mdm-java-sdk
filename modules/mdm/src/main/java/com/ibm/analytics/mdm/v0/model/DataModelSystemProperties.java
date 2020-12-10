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
 * Collection of common fields applicable to various types in data model.
 */
public class DataModelSystemProperties extends GenericModel {

  @SerializedName("entity_types")
  protected DataModelEntityTypeSystemProperties entityTypes;
  @SerializedName("record_types")
  protected DataModelRecordTypeSystemProperties recordTypes;
  @SerializedName("attribute_types")
  protected DataModelAttributeTypeSystemProperties attributeTypes;
  @SerializedName("relationship_types")
  protected DataModelRelationshipTypeSystemProperties relationshipTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelEntityTypeSystemProperties entityTypes;
    private DataModelRecordTypeSystemProperties recordTypes;
    private DataModelAttributeTypeSystemProperties attributeTypes;
    private DataModelRelationshipTypeSystemProperties relationshipTypes;

    private Builder(DataModelSystemProperties dataModelSystemProperties) {
      this.entityTypes = dataModelSystemProperties.entityTypes;
      this.recordTypes = dataModelSystemProperties.recordTypes;
      this.attributeTypes = dataModelSystemProperties.attributeTypes;
      this.relationshipTypes = dataModelSystemProperties.relationshipTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityTypes the entityTypes
     * @param recordTypes the recordTypes
     * @param attributeTypes the attributeTypes
     * @param relationshipTypes the relationshipTypes
     */
    public Builder(DataModelEntityTypeSystemProperties entityTypes, DataModelRecordTypeSystemProperties recordTypes, DataModelAttributeTypeSystemProperties attributeTypes, DataModelRelationshipTypeSystemProperties relationshipTypes) {
      this.entityTypes = entityTypes;
      this.recordTypes = recordTypes;
      this.attributeTypes = attributeTypes;
      this.relationshipTypes = relationshipTypes;
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
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the DataModelSystemProperties builder
     */
    public Builder relationshipTypes(DataModelRelationshipTypeSystemProperties relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }
  }

  protected DataModelSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityTypes,
      "entityTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
    attributeTypes = builder.attributeTypes;
    relationshipTypes = builder.relationshipTypes;
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
   * Gets the relationshipTypes.
   *
   * Defines metadata of system properties of all relationship types.
   *
   * @return the relationshipTypes
   */
  public DataModelRelationshipTypeSystemProperties relationshipTypes() {
    return relationshipTypes;
  }
}

