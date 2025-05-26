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
 * User rules definitions to discover group.
 */
public class RelationshipDiscoveryRulesGroupUserRules extends GenericModel {

  protected RelationshipDiscoveryRulesRulesBuilderWrapper member;

  /**
   * Builder.
   */
  public static class Builder {
    private RelationshipDiscoveryRulesRulesBuilderWrapper member;

    private Builder(RelationshipDiscoveryRulesGroupUserRules relationshipDiscoveryRulesGroupUserRules) {
      this.member = relationshipDiscoveryRulesGroupUserRules.member;
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
    public Builder(RelationshipDiscoveryRulesRulesBuilderWrapper member) {
      this.member = member;
    }

    /**
     * Builds a RelationshipDiscoveryRulesGroupUserRules.
     *
     * @return the new RelationshipDiscoveryRulesGroupUserRules instance
     */
    public RelationshipDiscoveryRulesGroupUserRules build() {
      return new RelationshipDiscoveryRulesGroupUserRules(this);
    }

    /**
     * Set the member.
     *
     * @param member the member
     * @return the RelationshipDiscoveryRulesGroupUserRules builder
     */
    public Builder member(RelationshipDiscoveryRulesRulesBuilderWrapper member) {
      this.member = member;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesGroupUserRules() { }

  protected RelationshipDiscoveryRulesGroupUserRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.member,
      "member cannot be null");
    member = builder.member;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesGroupUserRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the member.
   *
   * Rules Builder Wrapper Structure.
   *
   * @return the member
   */
  public RelationshipDiscoveryRulesRulesBuilderWrapper member() {
    return member;
  }
}

