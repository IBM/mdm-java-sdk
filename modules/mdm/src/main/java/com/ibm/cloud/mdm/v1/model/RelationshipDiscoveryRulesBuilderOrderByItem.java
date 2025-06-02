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
 * A single order by rule for returning nodes of current relationship discovery rule.
 */
public class RelationshipDiscoveryRulesBuilderOrderByItem extends GenericModel {

  protected Long node;
  protected String attribute;
  protected String direction;

  /**
   * Builder.
   */
  public static class Builder {
    private Long node;
    private String attribute;
    private String direction;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesBuilderOrderByItem instance.
     *
     * @param relationshipDiscoveryRulesBuilderOrderByItem the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesBuilderOrderByItem relationshipDiscoveryRulesBuilderOrderByItem) {
      this.node = relationshipDiscoveryRulesBuilderOrderByItem.node;
      this.attribute = relationshipDiscoveryRulesBuilderOrderByItem.attribute;
      this.direction = relationshipDiscoveryRulesBuilderOrderByItem.direction;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param node the node
     */
    public Builder(Long node) {
      this.node = node;
    }

    /**
     * Builds a RelationshipDiscoveryRulesBuilderOrderByItem.
     *
     * @return the new RelationshipDiscoveryRulesBuilderOrderByItem instance
     */
    public RelationshipDiscoveryRulesBuilderOrderByItem build() {
      return new RelationshipDiscoveryRulesBuilderOrderByItem(this);
    }

    /**
     * Set the node.
     *
     * @param node the node
     * @return the RelationshipDiscoveryRulesBuilderOrderByItem builder
     */
    public Builder node(long node) {
      this.node = node;
      return this;
    }

    /**
     * Set the attribute.
     *
     * @param attribute the attribute
     * @return the RelationshipDiscoveryRulesBuilderOrderByItem builder
     */
    public Builder attribute(String attribute) {
      this.attribute = attribute;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the RelationshipDiscoveryRulesBuilderOrderByItem builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesBuilderOrderByItem() { }

  protected RelationshipDiscoveryRulesBuilderOrderByItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.node,
      "node cannot be null");
    node = builder.node;
    attribute = builder.attribute;
    direction = builder.direction;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesBuilderOrderByItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the node.
   *
   * The index of node for current order by rule.
   *
   * @return the node
   */
  public Long node() {
    return node;
  }

  /**
   * Gets the attribute.
   *
   * The system property name for current order by rule.
   *
   * @return the attribute
   */
  public String attribute() {
    return attribute;
  }

  /**
   * Gets the direction.
   *
   * The direction for current order by rule: can be ASC or DESC, default ASC.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }
}

