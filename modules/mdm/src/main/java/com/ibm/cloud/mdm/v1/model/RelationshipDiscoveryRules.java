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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object of relationship discovery rules.
 */
public class RelationshipDiscoveryRules extends GenericModel {

  @SerializedName("relationship_type")
  protected String relationshipType;
  @SerializedName("user_rules")
  protected RelationshipDiscoveryRulesUserRules userRules;
  @SerializedName("technical_rules")
  protected RelationshipDiscoveryRulesTechnicalRules technicalRules;

  /**
   * Builder.
   */
  public static class Builder {
    private String relationshipType;
    private RelationshipDiscoveryRulesUserRules userRules;
    private RelationshipDiscoveryRulesTechnicalRules technicalRules;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRules instance.
     *
     * @param relationshipDiscoveryRules the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRules relationshipDiscoveryRules) {
      this.relationshipType = relationshipDiscoveryRules.relationshipType;
      this.userRules = relationshipDiscoveryRules.userRules;
      this.technicalRules = relationshipDiscoveryRules.technicalRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param relationshipType the relationshipType
     * @param userRules the userRules
     */
    public Builder(String relationshipType, RelationshipDiscoveryRulesUserRules userRules) {
      this.relationshipType = relationshipType;
      this.userRules = userRules;
    }

    /**
     * Builds a RelationshipDiscoveryRules.
     *
     * @return the new RelationshipDiscoveryRules instance
     */
    public RelationshipDiscoveryRules build() {
      return new RelationshipDiscoveryRules(this);
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the RelationshipDiscoveryRules builder
     */
    public Builder relationshipType(String relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }

    /**
     * Set the userRules.
     *
     * @param userRules the userRules
     * @return the RelationshipDiscoveryRules builder
     */
    public Builder userRules(RelationshipDiscoveryRulesUserRules userRules) {
      this.userRules = userRules;
      return this;
    }

    /**
     * Set the technicalRules.
     *
     * @param technicalRules the technicalRules
     * @return the RelationshipDiscoveryRules builder
     */
    public Builder technicalRules(RelationshipDiscoveryRulesTechnicalRules technicalRules) {
      this.technicalRules = technicalRules;
      return this;
    }
  }

  protected RelationshipDiscoveryRules() { }

  protected RelationshipDiscoveryRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipType,
      "relationshipType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userRules,
      "userRules cannot be null");
    relationshipType = builder.relationshipType;
    userRules = builder.userRules;
    technicalRules = builder.technicalRules;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the relationshipType.
   *
   * The relationship type from data model that this relationship discovery rules apply to, e.g., patient_visit.
   *
   * @return the relationshipType
   */
  public String relationshipType() {
    return relationshipType;
  }

  /**
   * Gets the userRules.
   *
   * User rules definitions for relationship discovery.
   *
   * @return the userRules
   */
  public RelationshipDiscoveryRulesUserRules userRules() {
    return userRules;
  }

  /**
   * Gets the technicalRules.
   *
   * Technical rules definitions for relationship discovery.
   *
   * @return the technicalRules
   */
  public RelationshipDiscoveryRulesTechnicalRules technicalRules() {
    return technicalRules;
  }
}

