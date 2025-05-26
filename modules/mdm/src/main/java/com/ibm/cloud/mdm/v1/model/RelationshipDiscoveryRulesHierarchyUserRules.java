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
 * User rules definitions to discover hierarchy.
 */
public class RelationshipDiscoveryRulesHierarchyUserRules extends GenericModel {

  protected RelationshipDiscoveryRulesRulesBuilderWrapper parent;
  protected RelationshipDiscoveryRulesRulesBuilderWrapper child;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesRulesBuilderWrapper parent;
    private RelationshipDiscoveryRulesRulesBuilderWrapper child;

    private Builder(RelationshipDiscoveryRulesHierarchyUserRules relationshipDiscoveryRulesHierarchyUserRules) {
      this.parent = relationshipDiscoveryRulesHierarchyUserRules.parent;
      this.child = relationshipDiscoveryRulesHierarchyUserRules.child;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param parent the parent
     * @param child the child
     */
    public Builder(RelationshipDiscoveryRulesRulesBuilderWrapper parent, RelationshipDiscoveryRulesRulesBuilderWrapper child) {
      this.parent = parent;
      this.child = child;
    }

    /**
     * Builds a RelationshipDiscoveryRulesHierarchyUserRules.
     *
     * @return the new RelationshipDiscoveryRulesHierarchyUserRules instance
     */
    public RelationshipDiscoveryRulesHierarchyUserRules build() {
      return new RelationshipDiscoveryRulesHierarchyUserRules(this);
    }

    /**
     * Set the parent.
     *
     * @param parent the parent
     * @return the RelationshipDiscoveryRulesHierarchyUserRules builder
     */
    public Builder parent(RelationshipDiscoveryRulesRulesBuilderWrapper parent) {
      this.parent = parent;
      return this;
    }

    /**
     * Set the child.
     *
     * @param child the child
     * @return the RelationshipDiscoveryRulesHierarchyUserRules builder
     */
    public Builder child(RelationshipDiscoveryRulesRulesBuilderWrapper child) {
      this.child = child;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesHierarchyUserRules() { }

  protected RelationshipDiscoveryRulesHierarchyUserRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.parent,
      "parent cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.child,
      "child cannot be null");
    parent = builder.parent;
    child = builder.child;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesHierarchyUserRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the parent.
   *
   * Rules Builder Wrapper Structure.
   *
   * @return the parent
   */
  public RelationshipDiscoveryRulesRulesBuilderWrapper parent() {
    return parent;
  }

  /**
   * Gets the child.
   *
   * Rules Builder Wrapper Structure.
   *
   * @return the child
   */
  public RelationshipDiscoveryRulesRulesBuilderWrapper child() {
    return child;
  }
}

