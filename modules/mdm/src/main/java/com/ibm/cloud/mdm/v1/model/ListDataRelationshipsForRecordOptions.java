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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataRelationshipsForRecord options.
 */
public class ListDataRelationshipsForRecordOptions extends GenericModel {

  protected Long id;
  protected List<String> relationshipTypes;
  protected Long offset;
  protected Long limit;
  protected List<String> sourceInclude;
  protected List<String> targetInclude;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private List<String> relationshipTypes;
    private Long offset;
    private Long limit;
    private List<String> sourceInclude;
    private List<String> targetInclude;

    /**
     * Instantiates a new Builder from an existing ListDataRelationshipsForRecordOptions instance.
     *
     * @param listDataRelationshipsForRecordOptions the instance to initialize the Builder with
     */
    private Builder(ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions) {
      this.id = listDataRelationshipsForRecordOptions.id;
      this.relationshipTypes = listDataRelationshipsForRecordOptions.relationshipTypes;
      this.offset = listDataRelationshipsForRecordOptions.offset;
      this.limit = listDataRelationshipsForRecordOptions.limit;
      this.sourceInclude = listDataRelationshipsForRecordOptions.sourceInclude;
      this.targetInclude = listDataRelationshipsForRecordOptions.targetInclude;
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
     * Adds a new element to relationshipTypes.
     *
     * @param relationshipTypes the new element to be added
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
     * Adds a new element to sourceInclude.
     *
     * @param sourceInclude the new element to be added
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder addSourceInclude(String sourceInclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sourceInclude,
        "sourceInclude cannot be null");
      if (this.sourceInclude == null) {
        this.sourceInclude = new ArrayList<String>();
      }
      this.sourceInclude.add(sourceInclude);
      return this;
    }

    /**
     * Adds a new element to targetInclude.
     *
     * @param targetInclude the new element to be added
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder addTargetInclude(String targetInclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(targetInclude,
        "targetInclude cannot be null");
      if (this.targetInclude == null) {
        this.targetInclude = new ArrayList<String>();
      }
      this.targetInclude.add(targetInclude);
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

    /**
     * Set the sourceInclude.
     * Existing sourceInclude will be replaced.
     *
     * @param sourceInclude the sourceInclude
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder sourceInclude(List<String> sourceInclude) {
      this.sourceInclude = sourceInclude;
      return this;
    }

    /**
     * Set the targetInclude.
     * Existing targetInclude will be replaced.
     *
     * @param targetInclude the targetInclude
     * @return the ListDataRelationshipsForRecordOptions builder
     */
    public Builder targetInclude(List<String> targetInclude) {
      this.targetInclude = targetInclude;
      return this;
    }
  }

  protected ListDataRelationshipsForRecordOptions() { }

  protected ListDataRelationshipsForRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
    relationshipTypes = builder.relationshipTypes;
    offset = builder.offset;
    limit = builder.limit;
    sourceInclude = builder.sourceInclude;
    targetInclude = builder.targetInclude;
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

  /**
   * Gets the sourceInclude.
   *
   * Attributes from the data model to include in the results for the source vertex.
   *
   * @return the sourceInclude
   */
  public List<String> sourceInclude() {
    return sourceInclude;
  }

  /**
   * Gets the targetInclude.
   *
   * Attributes from the data model to include in the results for the target vertex.
   *
   * @return the targetInclude
   */
  public List<String> targetInclude() {
    return targetInclude;
  }
}

