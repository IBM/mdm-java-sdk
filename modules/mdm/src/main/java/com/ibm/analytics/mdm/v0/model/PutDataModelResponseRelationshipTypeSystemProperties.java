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
 * Defines metadata of system properties of all relationship types.
 */
public class PutDataModelResponseRelationshipTypeSystemProperties extends GenericModel {

  @SerializedName("from_record_id")
  protected PutDataModelResponseSystemProperty fromRecordId;
  @SerializedName("to_record_id")
  protected PutDataModelResponseSystemProperty toRecordId;
  @SerializedName("relationship_number")
  protected PutDataModelResponseSystemProperty relationshipNumber;
  @SerializedName("to_record_type")
  protected PutDataModelResponseSystemProperty toRecordType;
  @SerializedName("relationship_last_updated")
  protected PutDataModelResponseSystemProperty relationshipLastUpdated;
  @SerializedName("from_record_type")
  protected PutDataModelResponseSystemProperty fromRecordType;
  @SerializedName("to_record_number")
  protected PutDataModelResponseSystemProperty toRecordNumber;
  @SerializedName("from_record_number")
  protected PutDataModelResponseSystemProperty fromRecordNumber;
  @SerializedName("relationship_source")
  protected PutDataModelResponseSystemProperty relationshipSource;
  @SerializedName("from_record_source")
  protected PutDataModelResponseSystemProperty fromRecordSource;
  @SerializedName("to_record_source")
  protected PutDataModelResponseSystemProperty toRecordSource;
  @SerializedName("relationship_id")
  protected PutDataModelResponseSystemProperty relationshipId;
  @SerializedName("relationship_type")
  protected PutDataModelResponseSystemProperty relationshipType;

  /**
   * Gets the fromRecordId.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordId
   */
  public PutDataModelResponseSystemProperty getFromRecordId() {
    return fromRecordId;
  }

  /**
   * Gets the toRecordId.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordId
   */
  public PutDataModelResponseSystemProperty getToRecordId() {
    return toRecordId;
  }

  /**
   * Gets the relationshipNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipNumber
   */
  public PutDataModelResponseSystemProperty getRelationshipNumber() {
    return relationshipNumber;
  }

  /**
   * Gets the toRecordType.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordType
   */
  public PutDataModelResponseSystemProperty getToRecordType() {
    return toRecordType;
  }

  /**
   * Gets the relationshipLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipLastUpdated
   */
  public PutDataModelResponseSystemProperty getRelationshipLastUpdated() {
    return relationshipLastUpdated;
  }

  /**
   * Gets the fromRecordType.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordType
   */
  public PutDataModelResponseSystemProperty getFromRecordType() {
    return fromRecordType;
  }

  /**
   * Gets the toRecordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordNumber
   */
  public PutDataModelResponseSystemProperty getToRecordNumber() {
    return toRecordNumber;
  }

  /**
   * Gets the fromRecordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordNumber
   */
  public PutDataModelResponseSystemProperty getFromRecordNumber() {
    return fromRecordNumber;
  }

  /**
   * Gets the relationshipSource.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipSource
   */
  public PutDataModelResponseSystemProperty getRelationshipSource() {
    return relationshipSource;
  }

  /**
   * Gets the fromRecordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordSource
   */
  public PutDataModelResponseSystemProperty getFromRecordSource() {
    return fromRecordSource;
  }

  /**
   * Gets the toRecordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordSource
   */
  public PutDataModelResponseSystemProperty getToRecordSource() {
    return toRecordSource;
  }

  /**
   * Gets the relationshipId.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipId
   */
  public PutDataModelResponseSystemProperty getRelationshipId() {
    return relationshipId;
  }

  /**
   * Gets the relationshipType.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipType
   */
  public PutDataModelResponseSystemProperty getRelationshipType() {
    return relationshipType;
  }
}

