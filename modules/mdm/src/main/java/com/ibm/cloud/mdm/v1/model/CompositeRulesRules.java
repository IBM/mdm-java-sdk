/*
 * (C) Copyright IBM Corp. 2021.
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
  @SerializedName("record_types")
  protected Map<String, CompositeRulesRecordType> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private CompositeRulesRule global;
    private Map<String, CompositeRulesRecordType> recordTypes;

    private Builder(CompositeRulesRules compositeRulesRules) {
      this.global = compositeRulesRules.global;
      this.recordTypes = compositeRulesRules.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param global the global
     */
    public Builder(CompositeRulesRule global) {
      this.global = global;
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

  protected CompositeRulesRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.global,
      "global cannot be null");
    global = builder.global;
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

