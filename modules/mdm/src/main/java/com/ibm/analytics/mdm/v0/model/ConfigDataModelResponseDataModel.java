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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * data model.
 */
public class ConfigDataModelResponseDataModel extends GenericModel {

  @SerializedName("record_types")
  protected Map<String, RecordType> recordTypes;
  @SerializedName("attribute_types")
  protected Map<String, AttributeType> attributeTypes;
  @SerializedName("relationship_types")
  protected Map<String, RelationshipType> relationshipTypes;
  protected String locale;
  @SerializedName("system_properties")
  protected Map<String, SystemProperties> systemProperties;

  /**
   * Gets the recordTypes.
   *
   * record types.
   *
   * @return the recordTypes
   */
  public Map<String, RecordType> getRecordTypes() {
    return recordTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * attribute types.
   *
   * @return the attributeTypes
   */
  public Map<String, AttributeType> getAttributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * relationship types.
   *
   * @return the relationshipTypes
   */
  public Map<String, RelationshipType> getRelationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the locale.
   *
   * locale.
   *
   * @return the locale
   */
  public String getLocale() {
    return locale;
  }

  /**
   * Gets the systemProperties.
   *
   * system properties.
   *
   * @return the systemProperties
   */
  public Map<String, SystemProperties> getSystemProperties() {
    return systemProperties;
  }
}

