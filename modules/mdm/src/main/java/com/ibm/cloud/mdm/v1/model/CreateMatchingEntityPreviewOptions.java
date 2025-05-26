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
 * The createMatchingEntityPreview options.
 */
public class CreateMatchingEntityPreviewOptions extends GenericModel {

  protected String entityType;
  protected List<RulesRequestRule> rules;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private List<RulesRequestRule> rules;

    private Builder(CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptions) {
      this.entityType = createMatchingEntityPreviewOptions.entityType;
      this.rules = createMatchingEntityPreviewOptions.rules;
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
     * @param rules the rules
     */
    public Builder(String entityType, List<RulesRequestRule> rules) {
      this.entityType = entityType;
      this.rules = rules;
    }

    /**
     * Builds a CreateMatchingEntityPreviewOptions.
     *
     * @return the new CreateMatchingEntityPreviewOptions instance
     */
    public CreateMatchingEntityPreviewOptions build() {
      return new CreateMatchingEntityPreviewOptions(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the CreateMatchingEntityPreviewOptions builder
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
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateMatchingEntityPreviewOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the CreateMatchingEntityPreviewOptions builder
     */
    public Builder rules(List<RulesRequestRule> rules) {
      this.rules = rules;
      return this;
    }
  }

  protected CreateMatchingEntityPreviewOptions() { }

  protected CreateMatchingEntityPreviewOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    entityType = builder.entityType;
    rules = builder.rules;
  }

  /**
   * New builder.
   *
   * @return a CreateMatchingEntityPreviewOptions builder
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
   * Gets the rules.
   *
   * Collection of linkage rules.
   *
   * @return the rules
   */
  public List<RulesRequestRule> rules() {
    return rules;
  }
}

