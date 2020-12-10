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
 * System Properties.
 */
public class SystemProperties extends GenericModel {

  @SerializedName("attribute_types")
  protected SystemPropertiesForAttributeTypes attributeTypes;
  @SerializedName("relationship_types")
  protected SystemPropertiesForRelationshipTypes relationshipTypes;
  @SerializedName("record_types")
  protected SystemPropertiesForRecordTypes recordTypes;
  @SerializedName("entity_types")
  protected SystemPropertiesForEntityTypes entityTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private SystemPropertiesForAttributeTypes attributeTypes;
    private SystemPropertiesForRelationshipTypes relationshipTypes;
    private SystemPropertiesForRecordTypes recordTypes;
    private SystemPropertiesForEntityTypes entityTypes;

    private Builder(SystemProperties systemProperties) {
      this.attributeTypes = systemProperties.attributeTypes;
      this.relationshipTypes = systemProperties.relationshipTypes;
      this.recordTypes = systemProperties.recordTypes;
      this.entityTypes = systemProperties.entityTypes;
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
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the SystemProperties builder
     */
    public Builder attributeTypes(SystemPropertiesForAttributeTypes attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the SystemProperties builder
     */
    public Builder relationshipTypes(SystemPropertiesForRelationshipTypes relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the SystemProperties builder
     */
    public Builder recordTypes(SystemPropertiesForRecordTypes recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the SystemProperties builder
     */
    public Builder entityTypes(SystemPropertiesForEntityTypes entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }
  }

  protected SystemProperties(Builder builder) {
    attributeTypes = builder.attributeTypes;
    relationshipTypes = builder.relationshipTypes;
    recordTypes = builder.recordTypes;
    entityTypes = builder.entityTypes;
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
   * Gets the attributeTypes.
   *
   * attribute Types.
   *
   * @return the attributeTypes
   */
  public SystemPropertiesForAttributeTypes attributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * relationship types.
   *
   * @return the relationshipTypes
   */
  public SystemPropertiesForRelationshipTypes relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * record types.
   *
   * @return the recordTypes
   */
  public SystemPropertiesForRecordTypes recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * entity types.
   *
   * @return the entityTypes
   */
  public SystemPropertiesForEntityTypes entityTypes() {
    return entityTypes;
  }
}

