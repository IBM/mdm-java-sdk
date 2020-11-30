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
 * Defines metadata of system properties of all entity types.
 */
public class DataModelEntityTypeSystemProperties extends GenericModel {

  @SerializedName("entity_last_updated")
  protected DataModelSystemProperty entityLastUpdated;
  @SerializedName("entity_id")
  protected DataModelSystemProperty entityId;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty entityLastUpdated;
    private DataModelSystemProperty entityId;

    private Builder(DataModelEntityTypeSystemProperties dataModelEntityTypeSystemProperties) {
      this.entityLastUpdated = dataModelEntityTypeSystemProperties.entityLastUpdated;
      this.entityId = dataModelEntityTypeSystemProperties.entityId;
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
     * Set the entityId.
     *
     * @param entityId the entityId
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder entityId(DataModelSystemProperty entityId) {
      this.entityId = entityId;
      return this;
    }
  }

  protected DataModelEntityTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityLastUpdated,
      "entityLastUpdated cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityId,
      "entityId cannot be null");
    entityLastUpdated = builder.entityLastUpdated;
    entityId = builder.entityId;
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
   * Gets the entityId.
   *
   * Defines metadata of a system property.
   *
   * @return the entityId
   */
  public DataModelSystemProperty entityId() {
    return entityId;
  }
}

