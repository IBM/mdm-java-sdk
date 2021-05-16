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
 * System Properties.
 */
public class SystemProperties extends GenericModel {

  @SerializedName("record_types")
  protected RecordTypes recordTypes;
  @SerializedName("entity_types")
  protected EntityTypes entityTypes;
  @SerializedName("relationship_types")
  protected SystemPropertiesRelationshipTypes relationshipTypes;
  @SerializedName("attribute_types")
  protected AttributeTypes attributeTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private RecordTypes recordTypes;
    private EntityTypes entityTypes;
    private SystemPropertiesRelationshipTypes relationshipTypes;
    private AttributeTypes attributeTypes;

    private Builder(SystemProperties systemProperties) {
      this.recordTypes = systemProperties.recordTypes;
      this.entityTypes = systemProperties.entityTypes;
      this.relationshipTypes = systemProperties.relationshipTypes;
      this.attributeTypes = systemProperties.attributeTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SystemProperties.
     *
     * @return the new SystemProperties instance
     */
    public SystemProperties build() {
      return new SystemProperties(this);
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the SystemProperties builder
     */
    public Builder recordTypes(RecordTypes recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the SystemProperties builder
     */
    public Builder entityTypes(EntityTypes entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the SystemProperties builder
     */
    public Builder relationshipTypes(SystemPropertiesRelationshipTypes relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the SystemProperties builder
     */
    public Builder attributeTypes(AttributeTypes attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }
  }

  protected SystemProperties(Builder builder) {
    recordTypes = builder.recordTypes;
    entityTypes = builder.entityTypes;
    relationshipTypes = builder.relationshipTypes;
    attributeTypes = builder.attributeTypes;
  }

  /**
   * New builder.
   *
   * @return a SystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordTypes.
   *
   * System property for record type.
   *
   * @return the recordTypes
   */
  public RecordTypes recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * System property for entity type.
   *
   * @return the entityTypes
   */
  public EntityTypes entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * System properties for relationship type.
   *
   * @return the relationshipTypes
   */
  public SystemPropertiesRelationshipTypes relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * System properties for attribute type.
   *
   * @return the attributeTypes
   */
  public AttributeTypes attributeTypes() {
    return attributeTypes;
  }
}

