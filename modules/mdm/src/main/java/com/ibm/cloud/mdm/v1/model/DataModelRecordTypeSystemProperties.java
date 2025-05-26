/*
 * (C) Copyright IBM Corp. 2025.
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

  @SerializedName("collection_id")
  protected DataModelSystemProperty collectionId;
  @SerializedName("record_id")
  protected DataModelSystemProperty recordId;
  @SerializedName("created_user")
  protected DataModelSystemProperty createdUser;
  @SerializedName("record_last_updated")
  protected DataModelSystemProperty recordLastUpdated;
  @SerializedName("last_updated_user")
  protected DataModelSystemProperty lastUpdatedUser;
  @SerializedName("record_number")
  protected DataModelSystemProperty recordNumber;
  @SerializedName("created_date")
  protected DataModelSystemProperty createdDate;
  @SerializedName("last_updated_date")
  protected DataModelSystemProperty lastUpdatedDate;
  @SerializedName("record_source")
  protected DataModelSystemProperty recordSource;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty collectionId;
    private DataModelSystemProperty recordId;
    private DataModelSystemProperty createdUser;
    private DataModelSystemProperty recordLastUpdated;
    private DataModelSystemProperty lastUpdatedUser;
    private DataModelSystemProperty recordNumber;
    private DataModelSystemProperty createdDate;
    private DataModelSystemProperty lastUpdatedDate;
    private DataModelSystemProperty recordSource;

    private Builder(DataModelRecordTypeSystemProperties dataModelRecordTypeSystemProperties) {
      this.collectionId = dataModelRecordTypeSystemProperties.collectionId;
      this.recordId = dataModelRecordTypeSystemProperties.recordId;
      this.createdUser = dataModelRecordTypeSystemProperties.createdUser;
      this.recordLastUpdated = dataModelRecordTypeSystemProperties.recordLastUpdated;
      this.lastUpdatedUser = dataModelRecordTypeSystemProperties.lastUpdatedUser;
      this.recordNumber = dataModelRecordTypeSystemProperties.recordNumber;
      this.createdDate = dataModelRecordTypeSystemProperties.createdDate;
      this.lastUpdatedDate = dataModelRecordTypeSystemProperties.lastUpdatedDate;
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
     * @param collectionId the collectionId
     * @param recordId the recordId
     * @param recordLastUpdated the recordLastUpdated
     * @param recordNumber the recordNumber
     * @param recordSource the recordSource
     */
    public Builder(DataModelSystemProperty collectionId, DataModelSystemProperty recordId, DataModelSystemProperty recordLastUpdated, DataModelSystemProperty recordNumber, DataModelSystemProperty recordSource) {
      this.collectionId = collectionId;
      this.recordId = recordId;
      this.recordLastUpdated = recordLastUpdated;
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
     * Set the createdUser.
     *
     * @param createdUser the createdUser
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder createdUser(DataModelSystemProperty createdUser) {
      this.createdUser = createdUser;
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
     * Set the lastUpdatedUser.
     *
     * @param lastUpdatedUser the lastUpdatedUser
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder lastUpdatedUser(DataModelSystemProperty lastUpdatedUser) {
      this.lastUpdatedUser = lastUpdatedUser;
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
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder createdDate(DataModelSystemProperty createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the lastUpdatedDate.
     *
     * @param lastUpdatedDate the lastUpdatedDate
     * @return the DataModelRecordTypeSystemProperties builder
     */
    public Builder lastUpdatedDate(DataModelSystemProperty lastUpdatedDate) {
      this.lastUpdatedDate = lastUpdatedDate;
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

  protected DataModelRecordTypeSystemProperties() { }

  protected DataModelRecordTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.collectionId,
      "collectionId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordId,
      "recordId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordLastUpdated,
      "recordLastUpdated cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber,
      "recordNumber cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordSource,
      "recordSource cannot be null");
    collectionId = builder.collectionId;
    recordId = builder.recordId;
    createdUser = builder.createdUser;
    recordLastUpdated = builder.recordLastUpdated;
    lastUpdatedUser = builder.lastUpdatedUser;
    recordNumber = builder.recordNumber;
    createdDate = builder.createdDate;
    lastUpdatedDate = builder.lastUpdatedDate;
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
   * Gets the createdUser.
   *
   * Defines metadata of a system property.
   *
   * @return the createdUser
   */
  public DataModelSystemProperty createdUser() {
    return createdUser;
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
   * Gets the lastUpdatedUser.
   *
   * Defines metadata of a system property.
   *
   * @return the lastUpdatedUser
   */
  public DataModelSystemProperty lastUpdatedUser() {
    return lastUpdatedUser;
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
   * Gets the createdDate.
   *
   * Defines metadata of a system property.
   *
   * @return the createdDate
   */
  public DataModelSystemProperty createdDate() {
    return createdDate;
  }

  /**
   * Gets the lastUpdatedDate.
   *
   * Defines metadata of a system property.
   *
   * @return the lastUpdatedDate
   */
  public DataModelSystemProperty lastUpdatedDate() {
    return lastUpdatedDate;
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

