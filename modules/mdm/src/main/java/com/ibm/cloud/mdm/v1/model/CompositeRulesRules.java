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
 * Collection of composite rule definitions.
 */
public class CompositeRulesRules extends GenericModel {

  protected CompositeRulesRule global;
  @SerializedName("entity_rules")
  protected Map<String, CompositeRulesEntityRules> entityRules;
  @SerializedName("record_types")
  protected Map<String, CompositeRulesRecordType> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private CompositeRulesRule global;
    private Map<String, CompositeRulesEntityRules> entityRules;
    private Map<String, CompositeRulesRecordType> recordTypes;

    /**
     * Instantiates a new Builder from an existing CompositeRulesRules instance.
     *
     * @param compositeRulesRules the instance to initialize the Builder with
     */
    private Builder(CompositeRulesRules compositeRulesRules) {
      this.global = compositeRulesRules.global;
      this.entityRules = compositeRulesRules.entityRules;
      this.recordTypes = compositeRulesRules.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompositeRulesRules.
     *
     * @return the new CompositeRulesRules instance
     */
    public CompositeRulesRules build() {
      return new CompositeRulesRules(this);
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the CompositeRulesRules builder
     */
    public Builder global(CompositeRulesRule global) {
      this.global = global;
      return this;
    }

    /**
     * Set the entityRules.
     *
     * @param entityRules the entityRules
     * @return the CompositeRulesRules builder
     */
    public Builder entityRules(Map<String, CompositeRulesEntityRules> entityRules) {
      this.entityRules = entityRules;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the CompositeRulesRules builder
     */
    public Builder recordTypes(Map<String, CompositeRulesRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected CompositeRulesRules() { }

  protected CompositeRulesRules(Builder builder) {
    global = builder.global;
    entityRules = builder.entityRules;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a CompositeRulesRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the global.
   *
   * A single composite rule definition.
   *
   * @return the global
   */
  public CompositeRulesRule global() {
    return global;
  }

  /**
   * Gets the entityRules.
   *
   * Collection of composite rule definitions per entity type. The entity type key must be lower snake case.
   *
   * @return the entityRules
   */
  public Map<String, CompositeRulesEntityRules> entityRules() {
    return entityRules;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of composite rule definitions per record type. The record type key must be lower snake case.
   *
   * @return the recordTypes
   */
  public Map<String, CompositeRulesRecordType> recordTypes() {
    return recordTypes;
  }
}

