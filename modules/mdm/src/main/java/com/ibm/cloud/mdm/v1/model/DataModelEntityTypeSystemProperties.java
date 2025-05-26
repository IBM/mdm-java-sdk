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
 * Defines metadata of system properties of all entity types.
 */
public class DataModelEntityTypeSystemProperties extends GenericModel {

  @SerializedName("record_count")
  protected DataModelSystemProperty recordCount;
  @SerializedName("link_last_updated_date")
  protected DataModelSystemProperty linkLastUpdatedDate;
  @SerializedName("last_updated_user")
  protected DataModelSystemProperty lastUpdatedUser;
  @SerializedName("entity_last_updated")
  protected DataModelSystemProperty entityLastUpdated;
  @SerializedName("created_date")
  protected DataModelSystemProperty createdDate;
  @SerializedName("entity_id")
  protected DataModelSystemProperty entityId;
  @SerializedName("last_updated_date")
  protected DataModelSystemProperty lastUpdatedDate;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty recordCount;
    private DataModelSystemProperty linkLastUpdatedDate;
    private DataModelSystemProperty lastUpdatedUser;
    private DataModelSystemProperty entityLastUpdated;
    private DataModelSystemProperty createdDate;
    private DataModelSystemProperty entityId;
    private DataModelSystemProperty lastUpdatedDate;

    private Builder(DataModelEntityTypeSystemProperties dataModelEntityTypeSystemProperties) {
      this.recordCount = dataModelEntityTypeSystemProperties.recordCount;
      this.linkLastUpdatedDate = dataModelEntityTypeSystemProperties.linkLastUpdatedDate;
      this.lastUpdatedUser = dataModelEntityTypeSystemProperties.lastUpdatedUser;
      this.entityLastUpdated = dataModelEntityTypeSystemProperties.entityLastUpdated;
      this.createdDate = dataModelEntityTypeSystemProperties.createdDate;
      this.entityId = dataModelEntityTypeSystemProperties.entityId;
      this.lastUpdatedDate = dataModelEntityTypeSystemProperties.lastUpdatedDate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityLastUpdated the entityLastUpdated
     * @param entityId the entityId
     */
    public Builder(DataModelSystemProperty entityLastUpdated, DataModelSystemProperty entityId) {
      this.entityLastUpdated = entityLastUpdated;
      this.entityId = entityId;
    }

    /**
     * Builds a DataModelEntityTypeSystemProperties.
     *
     * @return the new DataModelEntityTypeSystemProperties instance
     */
    public DataModelEntityTypeSystemProperties build() {
      return new DataModelEntityTypeSystemProperties(this);
    }

    /**
     * Set the recordCount.
     *
     * @param recordCount the recordCount
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder recordCount(DataModelSystemProperty recordCount) {
      this.recordCount = recordCount;
      return this;
    }

    /**
     * Set the linkLastUpdatedDate.
     *
     * @param linkLastUpdatedDate the linkLastUpdatedDate
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder linkLastUpdatedDate(DataModelSystemProperty linkLastUpdatedDate) {
      this.linkLastUpdatedDate = linkLastUpdatedDate;
      return this;
    }

    /**
     * Set the lastUpdatedUser.
     *
     * @param lastUpdatedUser the lastUpdatedUser
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder lastUpdatedUser(DataModelSystemProperty lastUpdatedUser) {
      this.lastUpdatedUser = lastUpdatedUser;
      return this;
    }

    /**
     * Set the entityLastUpdated.
     *
     * @param entityLastUpdated the entityLastUpdated
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder entityLastUpdated(DataModelSystemProperty entityLastUpdated) {
      this.entityLastUpdated = entityLastUpdated;
      return this;
    }

    /**
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder createdDate(DataModelSystemProperty createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the entityId.
     *
     * @param entityId the entityId
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder entityId(DataModelSystemProperty entityId) {
      this.entityId = entityId;
      return this;
    }

    /**
     * Set the lastUpdatedDate.
     *
     * @param lastUpdatedDate the lastUpdatedDate
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder lastUpdatedDate(DataModelSystemProperty lastUpdatedDate) {
      this.lastUpdatedDate = lastUpdatedDate;
      return this;
    }
  }

  protected DataModelEntityTypeSystemProperties() { }

  protected DataModelEntityTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityLastUpdated,
      "entityLastUpdated cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityId,
      "entityId cannot be null");
    recordCount = builder.recordCount;
    linkLastUpdatedDate = builder.linkLastUpdatedDate;
    lastUpdatedUser = builder.lastUpdatedUser;
    entityLastUpdated = builder.entityLastUpdated;
    createdDate = builder.createdDate;
    entityId = builder.entityId;
    lastUpdatedDate = builder.lastUpdatedDate;
  }

  /**
   * New builder.
   *
   * @return a DataModelEntityTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordCount.
   *
   * Defines metadata of a system property.
   *
   * @return the recordCount
   */
  public DataModelSystemProperty recordCount() {
    return recordCount;
  }

  /**
   * Gets the linkLastUpdatedDate.
   *
   * Defines metadata of a system property.
   *
   * @return the linkLastUpdatedDate
   */
  public DataModelSystemProperty linkLastUpdatedDate() {
    return linkLastUpdatedDate;
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
   * Gets the entityLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the entityLastUpdated
   */
  public DataModelSystemProperty entityLastUpdated() {
    return entityLastUpdated;
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
   * Gets the entityId.
   *
   * Defines metadata of a system property.
   *
   * @return the entityId
   */
  public DataModelSystemProperty entityId() {
    return entityId;
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
}

