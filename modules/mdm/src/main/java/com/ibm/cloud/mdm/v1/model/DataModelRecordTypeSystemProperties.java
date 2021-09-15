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
package com.ibm.cloud.mdm.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines metadata of system properties of record types.
 */
public class DataModelRecordTypeSystemProperties extends GenericModel {

  @SerializedName("record_last_updated")
  protected DataModelSystemProperty recordLastUpdated;
  @SerializedName("collection_id")
  protected DataModelSystemProperty collectionId;
  @SerializedName("record_id")
  protected DataModelSystemProperty recordId;
  @SerializedName("record_number")
  protected DataModelSystemProperty recordNumber;
  @SerializedName("record_source")
  protected DataModelSystemProperty recordSource;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty recordLastUpdated;
    private DataModelSystemProperty collectionId;
    private DataModelSystemProperty recordId;
    private DataModelSystemProperty recordNumber;
    private DataModelSystemProperty recordSource;

    private Builder(DataModelRecordTypeSystemProperties dataModelRecordTypeSystemProperties) {
      this.recordLastUpdated = dataModelRecordTypeSystemProperties.recordLastUpdated;
      this.collectionId = dataModelRecordTypeSystemProperties.collectionId;
      this.recordId = dataModelRecordTypeSystemProperties.recordId;
      this.recordNumber = dataModelRecordTypeSystemProperties.recordNumber;
      this.recordSource = dataModelRecordTypeSystemProperties.recordSource;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordLastUpdated the recordLastUpdated
     * @param collectionId the collectionId
     * @param recordId the recordId
     * @param recordNumber the recordNumber
     * @param recordSource the recordSource
     */
    public Builder(DataModelSystemProperty recordLastUpdated, DataModelSystemProperty collectionId, DataModelSystemProperty recordId, DataModelSystemProperty recordNumber, DataModelSystemProperty recordSource) {
      this.recordLastUpdated = recordLastUpdated;
      this.collectionId = collectionId;
      this.recordId = recordId;
      this.recordNumber = recordNumber;
      this.recordSource = recordSource;
    }

    /**
     * Builds a DataModelRecordTypeSystemProperties.
     *
     * @return the new DataModelRecordTypeSystemProperties instance
     */
    public DataModelRecordTypeSystemProperties build() {
      return new DataModelRecordTypeSystemProperties(this);
    }

    /**
     * Set the recordLastUpdated.
     *
     * @param recordLastUpdated the recordLastUpdated
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder recordLastUpdated(DataModelSystemProperty recordLastUpdated) {
      this.recordLastUpdated = recordLastUpdated;
      return this;
    }

    /**
     * Set the collectionId.
     *
     * @param collectionId the collectionId
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder collectionId(DataModelSystemProperty collectionId) {
      this.collectionId = collectionId;
      return this;
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder recordId(DataModelSystemProperty recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder recordNumber(DataModelSystemProperty recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder recordSource(DataModelSystemProperty recordSource) {
      this.recordSource = recordSource;
      return this;
    }
  }

  protected DataModelRecordTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordLastUpdated,
      "recordLastUpdated cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.collectionId,
      "collectionId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordId,
      "recordId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber,
      "recordNumber cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordSource,
      "recordSource cannot be null");
    recordLastUpdated = builder.recordLastUpdated;
    collectionId = builder.collectionId;
    recordId = builder.recordId;
    recordNumber = builder.recordNumber;
    recordSource = builder.recordSource;
  }

  /**
   * New builder.
   *
   * @return a DataModelRecordTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the recordLastUpdated
   */
  public DataModelSystemProperty recordLastUpdated() {
    return recordLastUpdated;
  }

  /**
   * Gets the collectionId.
   *
   * Defines metadata of a system property.
   *
   * @return the collectionId
   */
  public DataModelSystemProperty collectionId() {
    return collectionId;
  }

  /**
   * Gets the recordId.
   *
   * Defines metadata of a system property.
   *
   * @return the recordId
   */
  public DataModelSystemProperty recordId() {
    return recordId;
  }

  /**
   * Gets the recordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the recordNumber
   */
  public DataModelSystemProperty recordNumber() {
    return recordNumber;
  }

  /**
   * Gets the recordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the recordSource
   */
  public DataModelSystemProperty recordSource() {
    return recordSource;
  }
}
