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
 * Collection of composite rule definitions for the record type.
 */
public class CompositeRulesRecordType extends GenericModel {

  @SerializedName("attribute_rules")
  protected Map<String, CompositeRulesRule> attributeRules;
  @SerializedName("record_type_rule")
  protected CompositeRulesRule recordTypeRule;
  @SerializedName("entity_rules")
  protected Map<String, CompositeRulesRule> entityRules;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, CompositeRulesRule> attributeRules;
    private CompositeRulesRule recordTypeRule;
    private Map<String, CompositeRulesRule> entityRules;

    private Builder(CompositeRulesRecordType compositeRulesRecordType) {
      this.attributeRules = compositeRulesRecordType.attributeRules;
      this.recordTypeRule = compositeRulesRecordType.recordTypeRule;
      this.entityRules = compositeRulesRecordType.entityRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompositeRulesRecordType.
     *
     * @return the new CompositeRulesRecordType instance
     */
    public CompositeRulesRecordType build() {
      return new CompositeRulesRecordType(this);
    }

    /**
     * Set the attributeRules.
     *
     * @param attributeRules the attributeRules
     * @return the CompositeRulesRecordType builder
     */
    public Builder attributeRules(Map<String, CompositeRulesRule> attributeRules) {
      this.attributeRules = attributeRules;
      return this;
    }

    /**
     * Set the recordTypeRule.
     *
     * @param recordTypeRule the recordTypeRule
     * @return the CompositeRulesRecordType builder
     */
    public Builder recordTypeRule(CompositeRulesRule recordTypeRule) {
      this.recordTypeRule = recordTypeRule;
      return this;
    }

    /**
     * Set the entityRules.
     *
     * @param entityRules the entityRules
     * @return the CompositeRulesRecordType builder
     */
    public Builder entityRules(Map<String, CompositeRulesRule> entityRules) {
      this.entityRules = entityRules;
      return this;
    }
  }

  protected CompositeRulesRecordType() { }

  protected CompositeRulesRecordType(Builder builder) {
    attributeRules = builder.attributeRules;
    recordTypeRule = builder.recordTypeRule;
    entityRules = builder.entityRules;
  }

  /**
   * New builder.
   *
   * @return a CompositeRulesRecordType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the attributeRules.
   *
   * Collection of composite rule definitions at attribute level.
   *
   * @return the attributeRules
   */
  public Map<String, CompositeRulesRule> attributeRules() {
    return attributeRules;
  }

  /**
   * Gets the recordTypeRule.
   *
   * A single composite rule definition.
   *
   * @return the recordTypeRule
   */
  public CompositeRulesRule recordTypeRule() {
    return recordTypeRule;
  }

  /**
   * Gets the entityRules.
   *
   * Collection of composite rule definitions at entity level.
   *
   * @return the entityRules
   */
  public Map<String, CompositeRulesRule> entityRules() {
    return entityRules;
  }
}

