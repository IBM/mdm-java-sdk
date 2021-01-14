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
 * Defines metadata of system properties of record types.
 */
public class PutDataModelResponseRecordTypeSystemProperties extends GenericModel {

  @SerializedName("collection_id")
  protected PutDataModelResponseSystemProperty collectionId;
  @SerializedName("record_last_updated")
  protected PutDataModelResponseSystemProperty recordLastUpdated;
  @SerializedName("record_source")
  protected PutDataModelResponseSystemProperty recordSource;
  @SerializedName("record_number")
  protected PutDataModelResponseSystemProperty recordNumber;
  @SerializedName("record_id")
  protected PutDataModelResponseSystemProperty recordId;

  /**
   * Gets the collectionId.
   *
   * Defines metadata of a system property.
   *
   * @return the collectionId
   */
  public PutDataModelResponseSystemProperty getCollectionId() {
    return collectionId;
  }

  /**
   * Gets the recordLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the recordLastUpdated
   */
  public PutDataModelResponseSystemProperty getRecordLastUpdated() {
    return recordLastUpdated;
  }

  /**
   * Gets the recordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the recordSource
   */
  public PutDataModelResponseSystemProperty getRecordSource() {
    return recordSource;
  }

  /**
   * Gets the recordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the recordNumber
   */
  public PutDataModelResponseSystemProperty getRecordNumber() {
    return recordNumber;
  }

  /**
   * Gets the recordId.
   *
   * Defines metadata of a system property.
   *
   * @return the recordId
   */
  public PutDataModelResponseSystemProperty getRecordId() {
    return recordId;
  }
}

