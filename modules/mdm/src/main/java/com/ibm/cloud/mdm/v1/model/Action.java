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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the workflow action to be resolved.
 */
public class Action extends GenericModel {

  @SerializedName("action_type")
  protected String actionType;
  protected List<ActionEntity> entities;
  @SerializedName("action_values")
  protected Map<String, Object> actionValues;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionType;
    private List<ActionEntity> entities;
    private Map<String, Object> actionValues;

    private Builder(Action action) {
      this.actionType = action.actionType;
      this.entities = action.entities;
      this.actionValues = action.actionValues;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionType the actionType
     * @param entities the entities
     */
    public Builder(String actionType, List<ActionEntity> entities) {
      this.actionType = actionType;
      this.entities = entities;
    }

    /**
     * Builds a Action.
     *
     * @return the new Action instance
     */
    public Action build() {
      return new Action(this);
    }

    /**
     * Adds an entities to entities.
     *
     * @param entities the new entities
     * @return the Action builder
     */
    public Builder addEntities(ActionEntity entities) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entities,
        "entities cannot be null");
      if (this.entities == null) {
        this.entities = new ArrayList<ActionEntity>();
      }
      this.entities.add(entities);
      return this;
    }

    /**
     * Set the actionType.
     *
     * @param actionType the actionType
     * @return the Action builder
     */
    public Builder actionType(String actionType) {
      this.actionType = actionType;
      return this;
    }

    /**
     * Set the entities.
     * Existing entities will be replaced.
     *
     * @param entities the entities
     * @return the Action builder
     */
    public Builder entities(List<ActionEntity> entities) {
      this.entities = entities;
      return this;
    }

    /**
     * Set the actionValues.
     *
     * @param actionValues the actionValues
     * @return the Action builder
     */
    public Builder actionValues(Map<String, Object> actionValues) {
      this.actionValues = actionValues;
      return this;
    }
  }

  protected Action() { }

  protected Action(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actionType,
      "actionType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entities,
      "entities cannot be null");
    actionType = builder.actionType;
    entities = builder.entities;
    actionValues = builder.actionValues;
  }

  /**
   * New builder.
   *
   * @return a Action builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionType.
   *
   * The action type.
   *
   * @return the actionType
   */
  public String actionType() {
    return actionType;
  }

  /**
   * Gets the entities.
   *
   * List of entities associated to the action.
   *
   * @return the entities
   */
  public List<ActionEntity> entities() {
    return entities;
  }

  /**
   * Gets the actionValues.
   *
   * Generic object representing the values associated to the action being performed.
   *
   * @return the actionValues
   */
  public Map<String, Object> actionValues() {
    return actionValues;
  }
}

