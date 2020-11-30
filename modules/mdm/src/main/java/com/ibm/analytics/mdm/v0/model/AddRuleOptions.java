/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addRule options.
 */
public class AddRuleOptions extends GenericModel {

  protected String crn;
  protected List<RulesRequestRule> rules;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private List<RulesRequestRule> rules;
    private String entityType;

    private Builder(AddRuleOptions addRuleOptions) {
      this.crn = addRuleOptions.crn;
      this.rules = addRuleOptions.rules;
      this.entityType = addRuleOptions.entityType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param rules the rules
     * @param entityType the entityType
     */
    public Builder(String crn, List<RulesRequestRule> rules, String entityType) {
      this.crn = crn;
      this.rules = rules;
      this.entityType = entityType;
    }

    /**
     * Builds a AddRuleOptions.
     *
     * @return the new AddRuleOptions instance
     */
    public AddRuleOptions build() {
      return new AddRuleOptions(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the AddRuleOptions builder
     */
    public Builder addRules(RulesRequestRule rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<RulesRequestRule>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the AddRuleOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the AddRuleOptions builder
     */
    public Builder rules(List<RulesRequestRule> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the AddRuleOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected AddRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    crn = builder.crn;
    rules = builder.rules;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a AddRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the rules.
   *
   * Collection of linkage rules.
   *
   * @return the rules
   */
  public List<RulesRequestRule> rules() {
    return rules;
  }

  /**
   * Gets the entityType.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }
}

