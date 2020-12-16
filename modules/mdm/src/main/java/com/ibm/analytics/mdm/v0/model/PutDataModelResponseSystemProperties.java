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
public class PutDataModelResponseSystemProperties extends GenericModel {

  @SerializedName("attribute_types")
  protected PutDataModelResponseAttributeTypeSystemProperties attributeTypes;
  @SerializedName("relationship_types")
  protected PutDataModelResponseRelationshipTypeSystemProperties relationshipTypes;
  @SerializedName("entity_types")
  protected PutDataModelResponseEntityTypeSystemProperties entityTypes;
  @SerializedName("record_types")
  protected PutDataModelResponseRecordTypeSystemProperties recordTypes;

  /**
   * Gets the attributeTypes.
   *
   * Defines metadata of system properties of all attribute types.
   *
   * @return the attributeTypes
   */
  public PutDataModelResponseAttributeTypeSystemProperties getAttributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * Defines metadata of system properties of all relationship types.
   *
   * @return the relationshipTypes
   */
  public PutDataModelResponseRelationshipTypeSystemProperties getRelationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * Defines metadata of system properties of all entity types.
   *
   * @return the entityTypes
   */
  public PutDataModelResponseEntityTypeSystemProperties getEntityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Defines metadata of system properties of record types.
   *
   * @return the recordTypes
   */
  public PutDataModelResponseRecordTypeSystemProperties getRecordTypes() {
    return recordTypes;
  }
}

