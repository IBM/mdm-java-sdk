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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The attributes to include when exporting.
 */
public class ExportRequestIncludeAttributes extends GenericModel {

  @SerializedName("record_attributes")
  protected List<RecordAttributesRequest> recordAttributes;
  @SerializedName("relationship_attributes")
  protected List<RelationshipAttributesRequest> relationshipAttributes;
  @SerializedName("entity_attributes")
  protected List<EntityAttributesRequest> entityAttributes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<RecordAttributesRequest> recordAttributes;
    private List<RelationshipAttributesRequest> relationshipAttributes;
    private List<EntityAttributesRequest> entityAttributes;

    private Builder(ExportRequestIncludeAttributes exportRequestIncludeAttributes) {
      this.recordAttributes = exportRequestIncludeAttributes.recordAttributes;
      this.relationshipAttributes = exportRequestIncludeAttributes.relationshipAttributes;
      this.entityAttributes = exportRequestIncludeAttributes.entityAttributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExportRequestIncludeAttributes.
     *
     * @return the new ExportRequestIncludeAttributes instance
     */
    public ExportRequestIncludeAttributes build() {
      return new ExportRequestIncludeAttributes(this);
    }

    /**
     * Adds an recordAttributes to recordAttributes.
     *
     * @param recordAttributes the new recordAttributes
     * @return the ExportRequestIncludeAttributes builder
     */
    public Builder addRecordAttributes(RecordAttributesRequest recordAttributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(recordAttributes,
        "recordAttributes cannot be null");
      if (this.recordAttributes == null) {
        this.recordAttributes = new ArrayList<RecordAttributesRequest>();
      }
      this.recordAttributes.add(recordAttributes);
      return this;
    }

    /**
     * Adds an relationshipAttributes to relationshipAttributes.
     *
     * @param relationshipAttributes the new relationshipAttributes
     * @return the ExportRequestIncludeAttributes builder
     */
    public Builder addRelationshipAttributes(RelationshipAttributesRequest relationshipAttributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relationshipAttributes,
        "relationshipAttributes cannot be null");
      if (this.relationshipAttributes == null) {
        this.relationshipAttributes = new ArrayList<RelationshipAttributesRequest>();
      }
      this.relationshipAttributes.add(relationshipAttributes);
      return this;
    }

    /**
     * Adds an entityAttributes to entityAttributes.
     *
     * @param entityAttributes the new entityAttributes
     * @return the ExportRequestIncludeAttributes builder
     */
    public Builder addEntityAttributes(EntityAttributesRequest entityAttributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entityAttributes,
        "entityAttributes cannot be null");
      if (this.entityAttributes == null) {
        this.entityAttributes = new ArrayList<EntityAttributesRequest>();
      }
      this.entityAttributes.add(entityAttributes);
      return this;
    }

    /**
     * Set the recordAttributes.
     * Existing recordAttributes will be replaced.
     *
     * @param recordAttributes the recordAttributes
     * @return the ExportRequestIncludeAttributes builder
     */
    public Builder recordAttributes(List<RecordAttributesRequest> recordAttributes) {
      this.recordAttributes = recordAttributes;
      return this;
    }

    /**
     * Set the relationshipAttributes.
     * Existing relationshipAttributes will be replaced.
     *
     * @param relationshipAttributes the relationshipAttributes
     * @return the ExportRequestIncludeAttributes builder
     */
    public Builder relationshipAttributes(List<RelationshipAttributesRequest> relationshipAttributes) {
      this.relationshipAttributes = relationshipAttributes;
      return this;
    }

    /**
     * Set the entityAttributes.
     * Existing entityAttributes will be replaced.
     *
     * @param entityAttributes the entityAttributes
     * @return the ExportRequestIncludeAttributes builder
     */
    public Builder entityAttributes(List<EntityAttributesRequest> entityAttributes) {
      this.entityAttributes = entityAttributes;
      return this;
    }
  }

  protected ExportRequestIncludeAttributes() { }

  protected ExportRequestIncludeAttributes(Builder builder) {
    recordAttributes = builder.recordAttributes;
    relationshipAttributes = builder.relationshipAttributes;
    entityAttributes = builder.entityAttributes;
  }

  /**
   * New builder.
   *
   * @return a ExportRequestIncludeAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordAttributes.
   *
   * The list of record types and corresponding attributes to export.
   *
   * @return the recordAttributes
   */
  public List<RecordAttributesRequest> recordAttributes() {
    return recordAttributes;
  }

  /**
   * Gets the relationshipAttributes.
   *
   * The list of relationship types and corresponding attributes to export.
   *
   * @return the relationshipAttributes
   */
  public List<RelationshipAttributesRequest> relationshipAttributes() {
    return relationshipAttributes;
  }

  /**
   * Gets the entityAttributes.
   *
   * The list of entity types and corresponding attributes to export.
   *
   * @return the entityAttributes
   */
  public List<EntityAttributesRequest> entityAttributes() {
    return entityAttributes;
  }
}

