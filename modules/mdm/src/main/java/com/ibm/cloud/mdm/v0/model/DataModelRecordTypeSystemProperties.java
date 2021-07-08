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
public class DataModelRecordTypeSystemProperties extends GenericModel {

  @SerializedName("record_source")
  protected DataModelSystemProperty recordSource;
  @SerializedName("record_last_updated")
  protected DataModelSystemProperty recordLastUpdated;
  @SerializedName("record_id")
  protected DataModelSystemProperty recordId;
  @SerializedName("collection_id")
  protected DataModelSystemProperty collectionId;
  @SerializedName("record_number")
  protected DataModelSystemProperty recordNumber;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty recordSource;
    private DataModelSystemProperty recordLastUpdated;
    private DataModelSystemProperty recordId;
    private DataModelSystemProperty collectionId;
    private DataModelSystemProperty recordNumber;

    private Builder(DataModelRecordTypeSystemProperties dataModelRecordTypeSystemProperties) {
      this.recordSource = dataModelRecordTypeSystemProperties.recordSource;
      this.recordLastUpdated = dataModelRecordTypeSystemProperties.recordLastUpdated;
      this.recordId = dataModelRecordTypeSystemProperties.recordId;
      this.collectionId = dataModelRecordTypeSystemProperties.collectionId;
      this.recordNumber = dataModelRecordTypeSystemProperties.recordNumber;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordSource the recordSource
     * @param recordLastUpdated the recordLastUpdated
     * @param recordId the recordId
     * @param collectionId the collectionId
     * @param recordNumber the recordNumber
     */
    public Builder(DataModelSystemProperty recordSource, DataModelSystemProperty recordLastUpdated, DataModelSystemProperty recordId, DataModelSystemProperty collectionId, DataModelSystemProperty recordNumber) {
      this.recordSource = recordSource;
      this.recordLastUpdated = recordLastUpdated;
      this.recordId = recordId;
      this.collectionId = collectionId;
      this.recordNumber = recordNumber;
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
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder recordSource(DataModelSystemProperty recordSource) {
      this.recordSource = recordSource;
      return this;
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
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder recordNumber(DataModelSystemProperty recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }
  }

  protected DataModelRecordTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordSource,
      "recordSource cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordLastUpdated,
      "recordLastUpdated cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordId,
      "recordId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.collectionId,
      "collectionId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber,
      "recordNumber cannot be null");
    recordSource = builder.recordSource;
    recordLastUpdated = builder.recordLastUpdated;
    recordId = builder.recordId;
    collectionId = builder.collectionId;
    recordNumber = builder.recordNumber;
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
   * Gets the recordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the recordSource
   */
  public DataModelSystemProperty recordSource() {
    return recordSource;
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
   * Gets the recordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the recordNumber
   */
  public DataModelSystemProperty recordNumber() {
    return recordNumber;
  }
}

