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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the workflow action to be patched.
 */
public class ActionElement extends GenericModel {

  @SerializedName("action_type")
  protected String actionType;
  @SerializedName("action_values")
  protected Map<String, Object> actionValues;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionType;
    private Map<String, Object> actionValues;

    private Builder(ActionElement actionElement) {
      this.actionType = actionElement.actionType;
      this.actionValues = actionElement.actionValues;
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
     */
    public Builder(String actionType) {
      this.actionType = actionType;
    }

    /**
     * Builds a ActionElement.
     *
     * @return the new ActionElement instance
     */
    public ActionElement build() {
      return new ActionElement(this);
    }

    /**
     * Set the actionType.
     *
     * @param actionType the actionType
     * @return the ActionElement builder
     */
    public Builder actionType(String actionType) {
      this.actionType = actionType;
      return this;
    }

    /**
     * Set the actionValues.
     *
     * @param actionValues the actionValues
     * @return the ActionElement builder
     */
    public Builder actionValues(Map<String, Object> actionValues) {
      this.actionValues = actionValues;
      return this;
    }
  }

  protected ActionElement() { }

  protected ActionElement(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actionType,
      "actionType cannot be null");
    actionType = builder.actionType;
    actionValues = builder.actionValues;
  }

  /**
   * New builder.
   *
   * @return a ActionElement builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionType.
   *
   * The action element type.
   *
   * @return the actionType
   */
  public String actionType() {
    return actionType;
  }

  /**
   * Gets the actionValues.
   *
   * Generic object representing the values associated to the action element being performed.
   *
   * @return the actionValues
   */
  public Map<String, Object> actionValues() {
    return actionValues;
  }
}

