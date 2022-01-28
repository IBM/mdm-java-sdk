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
 * The listDataRelationshipsForRecord options.
 */
public class ListDataRelationshipsForRecordOptions extends GenericModel {

  protected Long id;
  protected List<String> relationshipTypes;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private List<String> relationshipTypes;
    private Long offset;
    private Long limit;

    private Builder(ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions) {
      this.id = listDataRelationshipsForRecordOptions.id;
      this.relationshipTypes = listDataRelationshipsForRecordOptions.relationshipTypes;
      this.offset = listDataRelationshipsForRecordOptions.offset;
      this.limit = listDataRelationshipsForRecordOptions.limit;
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
    public Builder(Long id) {
      this.id = id;
    }

    /**
     * Builds a ListDataRelationshipsForRecordOptions.
     *
     * @return the new ListDataRelationshipsForRecordOptions instance
     */
    public ListDataRelationshipsForRecordOptions build() {
      return new ListDataRelationshipsForRecordOptions(this);
    }

    /**
     * Adds an relationshipTypes to relationshipTypes.
     *
     * @param relationshipTypes the new relationshipTypes
     * @return the ListDataRelationshipsForRecordOptions builder
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
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the relationshipTypes.
     * Existing relationshipTypes will be replaced.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder relationshipTypes(List<String> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListDataRelationshipsForRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
    relationshipTypes = builder.relationshipTypes;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListDataRelationshipsForRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the record.
   *
   * @return the id
   */
  public Long id() {
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

