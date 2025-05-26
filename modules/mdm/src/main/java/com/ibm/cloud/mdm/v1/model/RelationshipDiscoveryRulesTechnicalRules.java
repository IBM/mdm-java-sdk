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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Technical rules definitions for relationship discovery.
 */
public class RelationshipDiscoveryRulesTechnicalRules extends GenericModel {

  @SerializedName("dropped_index")
  protected List<String> droppedIndex;
  @SerializedName("required_index")
  protected List<String> requiredIndex;
  protected String type;
  @SerializedName("generated_rules")
  protected RelationshipDiscoveryRulesGeneratedRules generatedRules;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> droppedIndex;
    private List<String> requiredIndex;
    private String type;
    private RelationshipDiscoveryRulesGeneratedRules generatedRules;

    private Builder(RelationshipDiscoveryRulesTechnicalRules relationshipDiscoveryRulesTechnicalRules) {
      this.droppedIndex = relationshipDiscoveryRulesTechnicalRules.droppedIndex;
      this.requiredIndex = relationshipDiscoveryRulesTechnicalRules.requiredIndex;
      this.type = relationshipDiscoveryRulesTechnicalRules.type;
      this.generatedRules = relationshipDiscoveryRulesTechnicalRules.generatedRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param droppedIndex the droppedIndex
     * @param requiredIndex the requiredIndex
     * @param type the type
     * @param generatedRules the generatedRules
     */
    public Builder(List<String> droppedIndex, List<String> requiredIndex, String type, RelationshipDiscoveryRulesGeneratedRules generatedRules) {
      this.droppedIndex = droppedIndex;
      this.requiredIndex = requiredIndex;
      this.type = type;
      this.generatedRules = generatedRules;
    }

    /**
     * Builds a RelationshipDiscoveryRulesTechnicalRules.
     *
     * @return the new RelationshipDiscoveryRulesTechnicalRules instance
     */
    public RelationshipDiscoveryRulesTechnicalRules build() {
      return new RelationshipDiscoveryRulesTechnicalRules(this);
    }

    /**
     * Adds an droppedIndex to droppedIndex.
     *
     * @param droppedIndex the new droppedIndex
     * @return the RelationshipDiscoveryRulesTechnicalRules builder
     */
    public Builder addDroppedIndex(String droppedIndex) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(droppedIndex,
        "droppedIndex cannot be null");
      if (this.droppedIndex == null) {
        this.droppedIndex = new ArrayList<String>();
      }
      this.droppedIndex.add(droppedIndex);
      return this;
    }

    /**
     * Adds an requiredIndex to requiredIndex.
     *
     * @param requiredIndex the new requiredIndex
     * @return the RelationshipDiscoveryRulesTechnicalRules builder
     */
    public Builder addRequiredIndex(String requiredIndex) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(requiredIndex,
        "requiredIndex cannot be null");
      if (this.requiredIndex == null) {
        this.requiredIndex = new ArrayList<String>();
      }
      this.requiredIndex.add(requiredIndex);
      return this;
    }

    /**
     * Set the droppedIndex.
     * Existing droppedIndex will be replaced.
     *
     * @param droppedIndex the droppedIndex
     * @return the RelationshipDiscoveryRulesTechnicalRules builder
     */
    public Builder droppedIndex(List<String> droppedIndex) {
      this.droppedIndex = droppedIndex;
      return this;
    }

    /**
     * Set the requiredIndex.
     * Existing requiredIndex will be replaced.
     *
     * @param requiredIndex the requiredIndex
     * @return the RelationshipDiscoveryRulesTechnicalRules builder
     */
    public Builder requiredIndex(List<String> requiredIndex) {
      this.requiredIndex = requiredIndex;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the RelationshipDiscoveryRulesTechnicalRules builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the generatedRules.
     *
     * @param generatedRules the generatedRules
     * @return the RelationshipDiscoveryRulesTechnicalRules builder
     */
    public Builder generatedRules(RelationshipDiscoveryRulesGeneratedRules generatedRules) {
      this.generatedRules = generatedRules;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesTechnicalRules() { }

  protected RelationshipDiscoveryRulesTechnicalRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.droppedIndex,
      "droppedIndex cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.requiredIndex,
      "requiredIndex cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.generatedRules,
      "generatedRules cannot be null");
    droppedIndex = builder.droppedIndex;
    requiredIndex = builder.requiredIndex;
    type = builder.type;
    generatedRules = builder.generatedRules;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesTechnicalRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the droppedIndex.
   *
   * List of dropped indexes from previous generated rules.
   *
   * @return the droppedIndex
   */
  public List<String> droppedIndex() {
    return droppedIndex;
  }

  /**
   * Gets the requiredIndex.
   *
   * List of required indexes for the generated rules.
   *
   * @return the requiredIndex
   */
  public List<String> requiredIndex() {
    return requiredIndex;
  }

  /**
   * Gets the type.
   *
   * Type of technical rules, e.g., cypher.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the generatedRules.
   *
   * Generated relationship rules based on user_rules.
   *
   * @return the generatedRules
   */
  public RelationshipDiscoveryRulesGeneratedRules generatedRules() {
    return generatedRules;
  }
}

