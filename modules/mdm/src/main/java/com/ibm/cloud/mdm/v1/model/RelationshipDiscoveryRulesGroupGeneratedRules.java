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
 * Generated to discover group.
 */
public class RelationshipDiscoveryRulesGroupGeneratedRules extends GenericModel {

  protected RelationshipDiscoveryRulesGeneratedRulesWrapper member;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesGeneratedRulesWrapper member;

    private Builder(RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRules) {
      this.member = relationshipDiscoveryRulesGroupGeneratedRules.member;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param member the member
     */
    public Builder(RelationshipDiscoveryRulesGeneratedRulesWrapper member) {
      this.member = member;
    }

    /**
     * Builds a RelationshipDiscoveryRulesGroupGeneratedRules.
     *
     * @return the new RelationshipDiscoveryRulesGroupGeneratedRules instance
     */
    public RelationshipDiscoveryRulesGroupGeneratedRules build() {
      return new RelationshipDiscoveryRulesGroupGeneratedRules(this);
    }

    /**
     * Set the member.
     *
     * @param member the member
     * @return the RelationshipDiscoveryRulesGroupGeneratedRules builder
     */
    public Builder member(RelationshipDiscoveryRulesGeneratedRulesWrapper member) {
      this.member = member;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesGroupGeneratedRules() { }

  protected RelationshipDiscoveryRulesGroupGeneratedRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.member,
      "member cannot be null");
    member = builder.member;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesGroupGeneratedRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the member.
   *
   * Generated Rules Wrapper Structure.
   *
   * @return the member
   */
  public RelationshipDiscoveryRulesGeneratedRulesWrapper member() {
    return member;
  }
}

