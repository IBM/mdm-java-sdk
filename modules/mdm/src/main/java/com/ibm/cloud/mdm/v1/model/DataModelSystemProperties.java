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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of common fields applicable to various types in data model.
 */
public class DataModelSystemProperties extends GenericModel {

  @SerializedName("record_types")
  protected DataModelRecordTypeSystemProperties recordTypes;
  @SerializedName("relationship_types")
  protected DataModelRelationshipTypeSystemProperties relationshipTypes;
  @SerializedName("attribute_types")
  protected DataModelAttributeTypeSystemProperties attributeTypes;
  @SerializedName("entity_types")
  protected DataModelEntityTypeSystemProperties entityTypes;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelRecordTypeSystemProperties recordTypes;
    private DataModelRelationshipTypeSystemProperties relationshipTypes;
    private DataModelAttributeTypeSystemProperties attributeTypes;
    private DataModelEntityTypeSystemProperties entityTypes;
    private String version;

    private Builder(DataModelSystemProperties dataModelSystemProperties) {
      this.recordTypes = dataModelSystemProperties.recordTypes;
      this.relationshipTypes = dataModelSystemProperties.relationshipTypes;
      this.attributeTypes = dataModelSystemProperties.attributeTypes;
      this.entityTypes = dataModelSystemProperties.entityTypes;
      this.version = dataModelSystemProperties.version;
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
     * @param entityTypes the entityTypes
     */
    public Builder(DataModelRecordTypeSystemProperties recordTypes, DataModelRelationshipTypeSystemProperties relationshipTypes, DataModelAttributeTypeSystemProperties attributeTypes, DataModelEntityTypeSystemProperties entityTypes) {
      this.recordTypes = recordTypes;
      this.relationshipTypes = relationshipTypes;
      this.attributeTypes = attributeTypes;
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
     * Set the version.
     *
     * @param version the version
     * @return the DataModelSystemProperties builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected DataModelSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordTypes,
      "recordTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipTypes,
      "relationshipTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeTypes,
      "attributeTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityTypes,
      "entityTypes cannot be null");
    recordTypes = builder.recordTypes;
    relationshipTypes = builder.relationshipTypes;
    attributeTypes = builder.attributeTypes;
    entityTypes = builder.entityTypes;
    version = builder.version;
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
   * Gets the version.
   *
   * Internal version of system properties.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

