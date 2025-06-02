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
 * User rules definitions for relationship discovery.
 */
public class RelationshipDiscoveryRulesUserRules extends GenericModel {

  protected RelationshipDiscoveryRulesHierarchyUserRules hierarchy;
  protected RelationshipDiscoveryRulesRelationshipUserRules relationship;
  protected RelationshipDiscoveryRulesGroupUserRules group;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesHierarchyUserRules hierarchy;
    private RelationshipDiscoveryRulesRelationshipUserRules relationship;
    private RelationshipDiscoveryRulesGroupUserRules group;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesUserRules instance.
     *
     * @param relationshipDiscoveryRulesUserRules the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesUserRules relationshipDiscoveryRulesUserRules) {
      this.hierarchy = relationshipDiscoveryRulesUserRules.hierarchy;
      this.relationship = relationshipDiscoveryRulesUserRules.relationship;
      this.group = relationshipDiscoveryRulesUserRules.group;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RelationshipDiscoveryRulesUserRules.
     *
     * @return the new RelationshipDiscoveryRulesUserRules instance
     */
    public RelationshipDiscoveryRulesUserRules build() {
      return new RelationshipDiscoveryRulesUserRules(this);
    }

    /**
     * Set the hierarchy.
     *
     * @param hierarchy the hierarchy
     * @return the RelationshipDiscoveryRulesUserRules builder
     */
    public Builder hierarchy(RelationshipDiscoveryRulesHierarchyUserRules hierarchy) {
      this.hierarchy = hierarchy;
      return this;
    }

    /**
     * Set the relationship.
     *
     * @param relationship the relationship
     * @return the RelationshipDiscoveryRulesUserRules builder
     */
    public Builder relationship(RelationshipDiscoveryRulesRelationshipUserRules relationship) {
      this.relationship = relationship;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the RelationshipDiscoveryRulesUserRules builder
     */
    public Builder group(RelationshipDiscoveryRulesGroupUserRules group) {
      this.group = group;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesUserRules() { }

  protected RelationshipDiscoveryRulesUserRules(Builder builder) {
    hierarchy = builder.hierarchy;
    relationship = builder.relationship;
    group = builder.group;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesUserRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchy.
   *
   * User rules definitions to discover hierarchy.
   *
   * @return the hierarchy
   */
  public RelationshipDiscoveryRulesHierarchyUserRules hierarchy() {
    return hierarchy;
  }

  /**
   * Gets the relationship.
   *
   * User rules definitions to discover relationship.
   *
   * @return the relationship
   */
  public RelationshipDiscoveryRulesRelationshipUserRules relationship() {
    return relationship;
  }

  /**
   * Gets the group.
   *
   * User rules definitions to discover group.
   *
   * @return the group
   */
  public RelationshipDiscoveryRulesGroupUserRules group() {
    return group;
  }
}

