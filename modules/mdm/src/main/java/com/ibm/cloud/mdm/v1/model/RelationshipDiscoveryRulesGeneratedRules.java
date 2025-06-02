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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Generated relationship rules based on user_rules.
 */
public class RelationshipDiscoveryRulesGeneratedRules extends GenericModel {

  protected RelationshipDiscoveryRulesHierarchyGeneratedRules hierarchy;
  protected RelationshipDiscoveryRulesRelationshipGeneratedRules relationship;
  protected RelationshipDiscoveryRulesGroupGeneratedRules group;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesHierarchyGeneratedRules hierarchy;
    private RelationshipDiscoveryRulesRelationshipGeneratedRules relationship;
    private RelationshipDiscoveryRulesGroupGeneratedRules group;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesGeneratedRules instance.
     *
     * @param relationshipDiscoveryRulesGeneratedRules the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesGeneratedRules relationshipDiscoveryRulesGeneratedRules) {
      this.hierarchy = relationshipDiscoveryRulesGeneratedRules.hierarchy;
      this.relationship = relationshipDiscoveryRulesGeneratedRules.relationship;
      this.group = relationshipDiscoveryRulesGeneratedRules.group;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RelationshipDiscoveryRulesGeneratedRules.
     *
     * @return the new RelationshipDiscoveryRulesGeneratedRules instance
     */
    public RelationshipDiscoveryRulesGeneratedRules build() {
      return new RelationshipDiscoveryRulesGeneratedRules(this);
    }

    /**
     * Set the hierarchy.
     *
     * @param hierarchy the hierarchy
     * @return the RelationshipDiscoveryRulesGeneratedRules builder
     */
    public Builder hierarchy(RelationshipDiscoveryRulesHierarchyGeneratedRules hierarchy) {
      this.hierarchy = hierarchy;
      return this;
    }

    /**
     * Set the relationship.
     *
     * @param relationship the relationship
     * @return the RelationshipDiscoveryRulesGeneratedRules builder
     */
    public Builder relationship(RelationshipDiscoveryRulesRelationshipGeneratedRules relationship) {
      this.relationship = relationship;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the RelationshipDiscoveryRulesGeneratedRules builder
     */
    public Builder group(RelationshipDiscoveryRulesGroupGeneratedRules group) {
      this.group = group;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesGeneratedRules() { }

  protected RelationshipDiscoveryRulesGeneratedRules(Builder builder) {
    hierarchy = builder.hierarchy;
    relationship = builder.relationship;
    group = builder.group;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesGeneratedRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchy.
   *
   * Generated rules to discover hierarchy.
   *
   * @return the hierarchy
   */
  public RelationshipDiscoveryRulesHierarchyGeneratedRules hierarchy() {
    return hierarchy;
  }

  /**
   * Gets the relationship.
   *
   * Generated to discover relationship.
   *
   * @return the relationship
   */
  public RelationshipDiscoveryRulesRelationshipGeneratedRules relationship() {
    return relationship;
  }

  /**
   * Gets the group.
   *
   * Generated to discover group.
   *
   * @return the group
   */
  public RelationshipDiscoveryRulesGroupGeneratedRules group() {
    return group;
  }
}

