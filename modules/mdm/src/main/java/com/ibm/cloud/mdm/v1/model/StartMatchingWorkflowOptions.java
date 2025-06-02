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
 * The startMatchingWorkflow options.
 */
public class StartMatchingWorkflowOptions extends GenericModel {

  protected List<String> entities;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> entities;
    private String type;

    /**
     * Instantiates a new Builder from an existing StartMatchingWorkflowOptions instance.
     *
     * @param startMatchingWorkflowOptions the instance to initialize the Builder with
     */
    private Builder(StartMatchingWorkflowOptions startMatchingWorkflowOptions) {
      this.entities = startMatchingWorkflowOptions.entities;
      this.type = startMatchingWorkflowOptions.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entities the entities
     * @param type the type
     */
    public Builder(List<String> entities, String type) {
      this.entities = entities;
      this.type = type;
    }

    /**
     * Builds a StartMatchingWorkflowOptions.
     *
     * @return the new StartMatchingWorkflowOptions instance
     */
    public StartMatchingWorkflowOptions build() {
      return new StartMatchingWorkflowOptions(this);
    }

    /**
     * Adds a new element to entities.
     *
     * @param entities the new element to be added
     * @return the StartMatchingWorkflowOptions builder
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
     * Set the entities.
     * Existing entities will be replaced.
     *
     * @param entities the entities
     * @return the StartMatchingWorkflowOptions builder
     */
    public Builder entities(List<String> entities) {
      this.entities = entities;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the StartMatchingWorkflowOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected StartMatchingWorkflowOptions() { }

  protected StartMatchingWorkflowOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entities,
      "entities cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    entities = builder.entities;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a StartMatchingWorkflowOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entities.
   *
   * Collection of entities.
   *
   * @return the entities
   */
  public List<String> entities() {
    return entities;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

