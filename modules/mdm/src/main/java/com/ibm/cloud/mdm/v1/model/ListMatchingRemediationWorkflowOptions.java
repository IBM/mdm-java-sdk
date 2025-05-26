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
 * The listMatchingRemediationWorkflow options.
 */
public class ListMatchingRemediationWorkflowOptions extends GenericModel {

  protected String entityType;
  protected List<String> entities;
  protected Long limit;
  protected Long offset;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private List<String> entities;
    private Long limit;
    private Long offset;

    private Builder(ListMatchingRemediationWorkflowOptions listMatchingRemediationWorkflowOptions) {
      this.entityType = listMatchingRemediationWorkflowOptions.entityType;
      this.entities = listMatchingRemediationWorkflowOptions.entities;
      this.limit = listMatchingRemediationWorkflowOptions.limit;
      this.offset = listMatchingRemediationWorkflowOptions.offset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityType the entityType
     */
    public Builder(String entityType) {
      this.entityType = entityType;
    }

    /**
     * Builds a ListMatchingRemediationWorkflowOptions.
     *
     * @return the new ListMatchingRemediationWorkflowOptions instance
     */
    public ListMatchingRemediationWorkflowOptions build() {
      return new ListMatchingRemediationWorkflowOptions(this);
    }

    /**
     * Adds an entities to entities.
     *
     * @param entities the new entities
     * @return the ListMatchingRemediationWorkflowOptions builder
     */
    public Builder addEntities(String entities) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entities,
        "entities cannot be null");
      if (this.entities == null) {
        this.entities = new ArrayList<String>();
      }
      this.entities.add(entities);
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the ListMatchingRemediationWorkflowOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the entities.
     * Existing entities will be replaced.
     *
     * @param entities the entities
     * @return the ListMatchingRemediationWorkflowOptions builder
     */
    public Builder entities(List<String> entities) {
      this.entities = entities;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListMatchingRemediationWorkflowOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListMatchingRemediationWorkflowOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }
  }

  protected ListMatchingRemediationWorkflowOptions() { }

  protected ListMatchingRemediationWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    entityType = builder.entityType;
    entities = builder.entities;
    limit = builder.limit;
    offset = builder.offset;
  }

  /**
   * New builder.
   *
   * @return a ListMatchingRemediationWorkflowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the entities.
   *
   * The entity identifiers of an entity as assigned by the system.
   *
   * @return the entities
   */
  public List<String> entities() {
    return entities;
  }

  /**
   * Gets the limit.
   *
   * The number of issues to be retrieved for the given entities.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of issues to skip before returning the result.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }
}

