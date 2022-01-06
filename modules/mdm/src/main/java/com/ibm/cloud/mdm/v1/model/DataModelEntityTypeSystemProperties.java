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
 * Defines metadata of system properties of all entity types.
 */
public class DataModelEntityTypeSystemProperties extends GenericModel {

  @SerializedName("entity_id")
  protected DataModelSystemProperty entityId;
  @SerializedName("entity_last_updated")
  protected DataModelSystemProperty entityLastUpdated;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty entityId;
    private DataModelSystemProperty entityLastUpdated;

    private Builder(DataModelEntityTypeSystemProperties dataModelEntityTypeSystemProperties) {
      this.entityId = dataModelEntityTypeSystemProperties.entityId;
      this.entityLastUpdated = dataModelEntityTypeSystemProperties.entityLastUpdated;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityId the entityId
     * @param entityLastUpdated the entityLastUpdated
     */
    public Builder(DataModelSystemProperty entityId, DataModelSystemProperty entityLastUpdated) {
      this.entityId = entityId;
      this.entityLastUpdated = entityLastUpdated;
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
     * Set the entityLastUpdated.
     *
     * @param entityLastUpdated the entityLastUpdated
     * @return the DataModelEntityTypeSystemProperties builder
     */
    public Builder entityLastUpdated(DataModelSystemProperty entityLastUpdated) {
      this.entityLastUpdated = entityLastUpdated;
      return this;
    }
  }

  protected DataModelEntityTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityId,
      "entityId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityLastUpdated,
      "entityLastUpdated cannot be null");
    entityId = builder.entityId;
    entityLastUpdated = builder.entityLastUpdated;
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
   * Gets the entityLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the entityLastUpdated
   */
  public DataModelSystemProperty entityLastUpdated() {
    return entityLastUpdated;
  }
}

