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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of record and relationship types definition.
 */
public class PutDataModelResponseDataModel extends GenericModel {

  @SerializedName("attribute_types")
  protected Map<String, PutDataModelResponseAttributeType> attributeTypes;
  @SerializedName("relationship_types")
  protected Map<String, PutDataModelResponseRelationshipType> relationshipTypes;
  @SerializedName("record_types")
  protected Map<String, PutDataModelResponseRecordType> recordTypes;
  protected String locale;
  @SerializedName("system_properties")
  protected PutDataModelResponseSystemProperties systemProperties;

  /**
   * Gets the attributeTypes.
   *
   * Collection of user defined attribute types. The attribute type key must be lower snake case (i.e. address).
   *
   * @return the attributeTypes
   */
  public Map<String, PutDataModelResponseAttributeType> getAttributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * Collection of relationship types. The relationship type key must be lower snake case (i.e. employment).
   *
   * @return the relationshipTypes
   */
  public Map<String, PutDataModelResponseRelationshipType> getRelationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of user defined record types. The record type key must be lower snake case (i.e. person, organization).
   *
   * @return the recordTypes
   */
  public Map<String, PutDataModelResponseRecordType> getRecordTypes() {
    return recordTypes;
  }

  /**
   * Gets the locale.
   *
   * The request language and location (i.e. enUS).
   *
   * @return the locale
   */
  public String getLocale() {
    return locale;
  }

  /**
   * Gets the systemProperties.
   *
   * Collection of common fields applicable to various types in data model.
   *
   * @return the systemProperties
   */
  public PutDataModelResponseSystemProperties getSystemProperties() {
    return systemProperties;
  }
}

