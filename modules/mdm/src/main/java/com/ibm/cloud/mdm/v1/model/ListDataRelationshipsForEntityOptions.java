/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataRelationshipsForEntity options.
 */
public class ListDataRelationshipsForEntityOptions extends GenericModel {

  protected String id;
  protected List<String> relationshipTypes;
  protected String includeRecordRelationships;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> relationshipTypes;
    private String includeRecordRelationships;
    private Long offset;
    private Long limit;

    private Builder(ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptions) {
      this.id = listDataRelationshipsForEntityOptions.id;
      this.relationshipTypes = listDataRelationshipsForEntityOptions.relationshipTypes;
      this.includeRecordRelationships = listDataRelationshipsForEntityOptions.includeRecordRelationships;
      this.offset = listDataRelationshipsForEntityOptions.offset;
      this.limit = listDataRelationshipsForEntityOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ListDataRelationshipsForEntityOptions.
     *
     * @return the new ListDataRelationshipsForEntityOptions instance
     */
    public ListDataRelationshipsForEntityOptions build() {
      return new ListDataRelationshipsForEntityOptions(this);
    }

    /**
     * Adds an relationshipTypes to relationshipTypes.
     *
     * @param relationshipTypes the new relationshipTypes
     * @return the ListDataRelationshipsForEntityOptions builder
     */
    public Builder addRelationshipTypes(String relationshipTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relationshipTypes,
        "relationshipTypes cannot be null");
      if (this.relationshipTypes == null) {
        this.relationshipTypes = new ArrayList<String>();
      }
      this.relationshipTypes.add(relationshipTypes);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListDataRelationshipsForEntityOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the relationshipTypes.
     * Existing relationshipTypes will be replaced.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the ListDataRelationshipsForEntityOptions builder
     */
    public Builder relationshipTypes(List<String> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the includeRecordRelationships.
     *
     * @param includeRecordRelationships the includeRecordRelationships
     * @return the ListDataRelationshipsForEntityOptions builder
     */
    public Builder includeRecordRelationships(String includeRecordRelationships) {
      this.includeRecordRelationships = includeRecordRelationships;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDataRelationshipsForEntityOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataRelationshipsForEntityOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListDataRelationshipsForEntityOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    relationshipTypes = builder.relationshipTypes;
    includeRecordRelationships = builder.includeRecordRelationships;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListDataRelationshipsForEntityOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the entity.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the relationshipTypes.
   *
   * The relationship types to return.
   *
   * @return the relationshipTypes
   */
  public List<String> relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the includeRecordRelationships.
   *
   * Whether to include entity record relationships to other nodes.
   *
   * @return the includeRecordRelationships
   */
  public String includeRecordRelationships() {
    return includeRecordRelationships;
  }

  /**
   * Gets the offset.
   *
   * The number of relationships to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of relationships to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

