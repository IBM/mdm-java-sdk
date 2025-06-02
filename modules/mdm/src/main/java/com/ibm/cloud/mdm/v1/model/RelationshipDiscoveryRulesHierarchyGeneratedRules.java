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
 * Generated rules to discover hierarchy.
 */
public class RelationshipDiscoveryRulesHierarchyGeneratedRules extends GenericModel {

  protected RelationshipDiscoveryRulesGeneratedRulesWrapper parent;
  protected RelationshipDiscoveryRulesGeneratedRulesWrapper child;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesGeneratedRulesWrapper parent;
    private RelationshipDiscoveryRulesGeneratedRulesWrapper child;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesHierarchyGeneratedRules instance.
     *
     * @param relationshipDiscoveryRulesHierarchyGeneratedRules the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesHierarchyGeneratedRules relationshipDiscoveryRulesHierarchyGeneratedRules) {
      this.parent = relationshipDiscoveryRulesHierarchyGeneratedRules.parent;
      this.child = relationshipDiscoveryRulesHierarchyGeneratedRules.child;
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
    public Builder(RelationshipDiscoveryRulesGeneratedRulesWrapper parent, RelationshipDiscoveryRulesGeneratedRulesWrapper child) {
      this.parent = parent;
      this.child = child;
    }

    /**
     * Builds a RelationshipDiscoveryRulesHierarchyGeneratedRules.
     *
     * @return the new RelationshipDiscoveryRulesHierarchyGeneratedRules instance
     */
    public RelationshipDiscoveryRulesHierarchyGeneratedRules build() {
      return new RelationshipDiscoveryRulesHierarchyGeneratedRules(this);
    }

    /**
     * Set the parent.
     *
     * @param parent the parent
     * @return the RelationshipDiscoveryRulesHierarchyGeneratedRules builder
     */
    public Builder parent(RelationshipDiscoveryRulesGeneratedRulesWrapper parent) {
      this.parent = parent;
      return this;
    }

    /**
     * Set the child.
     *
     * @param child the child
     * @return the RelationshipDiscoveryRulesHierarchyGeneratedRules builder
     */
    public Builder child(RelationshipDiscoveryRulesGeneratedRulesWrapper child) {
      this.child = child;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesHierarchyGeneratedRules() { }

  protected RelationshipDiscoveryRulesHierarchyGeneratedRules(Builder builder) {
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
   * @return a RelationshipDiscoveryRulesHierarchyGeneratedRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the parent.
   *
   * Generated Rules Wrapper Structure.
   *
   * @return the parent
   */
  public RelationshipDiscoveryRulesGeneratedRulesWrapper parent() {
    return parent;
  }

  /**
   * Gets the child.
   *
   * Generated Rules Wrapper Structure.
   *
   * @return the child
   */
  public RelationshipDiscoveryRulesGeneratedRulesWrapper child() {
    return child;
  }
}

