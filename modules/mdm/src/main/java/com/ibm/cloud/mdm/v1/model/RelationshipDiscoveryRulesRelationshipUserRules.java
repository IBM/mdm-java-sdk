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
 * User rules definitions to discover relationship.
 */
public class RelationshipDiscoveryRulesRelationshipUserRules extends GenericModel {

  protected RelationshipDiscoveryRulesRulesBuilderWrapper source;
  protected RelationshipDiscoveryRulesRulesBuilderWrapper target;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesRulesBuilderWrapper source;
    private RelationshipDiscoveryRulesRulesBuilderWrapper target;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesRelationshipUserRules instance.
     *
     * @param relationshipDiscoveryRulesRelationshipUserRules the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesRelationshipUserRules relationshipDiscoveryRulesRelationshipUserRules) {
      this.source = relationshipDiscoveryRulesRelationshipUserRules.source;
      this.target = relationshipDiscoveryRulesRelationshipUserRules.target;
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
    public Builder(RelationshipDiscoveryRulesRulesBuilderWrapper target) {
      this.target = target;
    }

    /**
     * Builds a RelationshipDiscoveryRulesRelationshipUserRules.
     *
     * @return the new RelationshipDiscoveryRulesRelationshipUserRules instance
     */
    public RelationshipDiscoveryRulesRelationshipUserRules build() {
      return new RelationshipDiscoveryRulesRelationshipUserRules(this);
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the RelationshipDiscoveryRulesRelationshipUserRules builder
     */
    public Builder source(RelationshipDiscoveryRulesRulesBuilderWrapper source) {
      this.source = source;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the RelationshipDiscoveryRulesRelationshipUserRules builder
     */
    public Builder target(RelationshipDiscoveryRulesRulesBuilderWrapper target) {
      this.target = target;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesRelationshipUserRules() { }

  protected RelationshipDiscoveryRulesRelationshipUserRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    source = builder.source;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesRelationshipUserRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the source.
   *
   * Rules Builder Wrapper Structure.
   *
   * @return the source
   */
  public RelationshipDiscoveryRulesRulesBuilderWrapper source() {
    return source;
  }

  /**
   * Gets the target.
   *
   * Rules Builder Wrapper Structure.
   *
   * @return the target
   */
  public RelationshipDiscoveryRulesRulesBuilderWrapper target() {
    return target;
  }
}

