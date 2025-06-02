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
 * Generated to discover relationship.
 */
public class RelationshipDiscoveryRulesRelationshipGeneratedRules extends GenericModel {

  protected RelationshipDiscoveryRulesGeneratedRulesWrapper source;
  protected RelationshipDiscoveryRulesGeneratedRulesWrapper target;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesGeneratedRulesWrapper source;
    private RelationshipDiscoveryRulesGeneratedRulesWrapper target;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesRelationshipGeneratedRules instance.
     *
     * @param relationshipDiscoveryRulesRelationshipGeneratedRules the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRules) {
      this.source = relationshipDiscoveryRulesRelationshipGeneratedRules.source;
      this.target = relationshipDiscoveryRulesRelationshipGeneratedRules.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     */
    public Builder(RelationshipDiscoveryRulesGeneratedRulesWrapper target) {
      this.target = target;
    }

    /**
     * Builds a RelationshipDiscoveryRulesRelationshipGeneratedRules.
     *
     * @return the new RelationshipDiscoveryRulesRelationshipGeneratedRules instance
     */
    public RelationshipDiscoveryRulesRelationshipGeneratedRules build() {
      return new RelationshipDiscoveryRulesRelationshipGeneratedRules(this);
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the RelationshipDiscoveryRulesRelationshipGeneratedRules builder
     */
    public Builder source(RelationshipDiscoveryRulesGeneratedRulesWrapper source) {
      this.source = source;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the RelationshipDiscoveryRulesRelationshipGeneratedRules builder
     */
    public Builder target(RelationshipDiscoveryRulesGeneratedRulesWrapper target) {
      this.target = target;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesRelationshipGeneratedRules() { }

  protected RelationshipDiscoveryRulesRelationshipGeneratedRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    source = builder.source;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesRelationshipGeneratedRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the source.
   *
   * Generated Rules Wrapper Structure.
   *
   * @return the source
   */
  public RelationshipDiscoveryRulesGeneratedRulesWrapper source() {
    return source;
  }

  /**
   * Gets the target.
   *
   * Generated Rules Wrapper Structure.
   *
   * @return the target
   */
  public RelationshipDiscoveryRulesGeneratedRulesWrapper target() {
    return target;
  }
}

