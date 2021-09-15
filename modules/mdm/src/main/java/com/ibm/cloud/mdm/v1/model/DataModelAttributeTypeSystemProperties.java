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
 * Defines metadata of system properties of all attribute types.
 */
public class DataModelAttributeTypeSystemProperties extends GenericModel {

  @SerializedName("attribute_last_updated")
  protected DataModelSystemProperty attributeLastUpdated;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty attributeLastUpdated;

    private Builder(DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemProperties) {
      this.attributeLastUpdated = dataModelAttributeTypeSystemProperties.attributeLastUpdated;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributeLastUpdated the attributeLastUpdated
     */
    public Builder(DataModelSystemProperty attributeLastUpdated) {
      this.attributeLastUpdated = attributeLastUpdated;
    }

    /**
     * Builds a DataModelAttributeTypeSystemProperties.
     *
     * @return the new DataModelAttributeTypeSystemProperties instance
     */
    public DataModelAttributeTypeSystemProperties build() {
      return new DataModelAttributeTypeSystemProperties(this);
    }

    /**
     * Set the attributeLastUpdated.
     *
     * @param attributeLastUpdated the attributeLastUpdated
     * @return the DataModelAttributeTypeSystemProperties builder
     */
    public Builder attributeLastUpdated(DataModelSystemProperty attributeLastUpdated) {
      this.attributeLastUpdated = attributeLastUpdated;
      return this;
    }
  }

  protected DataModelAttributeTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeLastUpdated,
      "attributeLastUpdated cannot be null");
    attributeLastUpdated = builder.attributeLastUpdated;
  }

  /**
   * New builder.
   *
   * @return a DataModelAttributeTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the attributeLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the attributeLastUpdated
   */
  public DataModelSystemProperty attributeLastUpdated() {
    return attributeLastUpdated;
  }
}

