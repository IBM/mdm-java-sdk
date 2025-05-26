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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single edge to use in current relationship discovery rule.
 */
public class RelationshipDiscoveryRulesBuilderEdge extends GenericModel {

  @SerializedName("end_node")
  protected Long endNode;
  @SerializedName("relationship_type")
  protected String relationshipType;
  @SerializedName("start_node")
  protected Long startNode;
  protected Map<String, String> filters;

  /**
   * Builder.
   */
  public static class Builder {
    private Long endNode;
    private String relationshipType;
    private Long startNode;
    private Map<String, String> filters;

    private Builder(RelationshipDiscoveryRulesBuilderEdge relationshipDiscoveryRulesBuilderEdge) {
      this.endNode = relationshipDiscoveryRulesBuilderEdge.endNode;
      this.relationshipType = relationshipDiscoveryRulesBuilderEdge.relationshipType;
      this.startNode = relationshipDiscoveryRulesBuilderEdge.startNode;
      this.filters = relationshipDiscoveryRulesBuilderEdge.filters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param endNode the endNode
     * @param relationshipType the relationshipType
     * @param startNode the startNode
     */
    public Builder(Long endNode, String relationshipType, Long startNode) {
      this.endNode = endNode;
      this.relationshipType = relationshipType;
      this.startNode = startNode;
    }

    /**
     * Builds a RelationshipDiscoveryRulesBuilderEdge.
     *
     * @return the new RelationshipDiscoveryRulesBuilderEdge instance
     */
    public RelationshipDiscoveryRulesBuilderEdge build() {
      return new RelationshipDiscoveryRulesBuilderEdge(this);
    }

    /**
     * Set the endNode.
     *
     * @param endNode the endNode
     * @return the RelationshipDiscoveryRulesBuilderEdge builder
     */
    public Builder endNode(long endNode) {
      this.endNode = endNode;
      return this;
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the RelationshipDiscoveryRulesBuilderEdge builder
     */
    public Builder relationshipType(String relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }

    /**
     * Set the startNode.
     *
     * @param startNode the startNode
     * @return the RelationshipDiscoveryRulesBuilderEdge builder
     */
    public Builder startNode(long startNode) {
      this.startNode = startNode;
      return this;
    }

    /**
     * Set the filters.
     *
     * @param filters the filters
     * @return the RelationshipDiscoveryRulesBuilderEdge builder
     */
    public Builder filters(Map<String, String> filters) {
      this.filters = filters;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesBuilderEdge() { }

  protected RelationshipDiscoveryRulesBuilderEdge(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endNode,
      "endNode cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipType,
      "relationshipType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.startNode,
      "startNode cannot be null");
    endNode = builder.endNode;
    relationshipType = builder.relationshipType;
    startNode = builder.startNode;
    filters = builder.filters;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesBuilderEdge builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the endNode.
   *
   * The ending node index of the current edge.
   *
   * @return the endNode
   */
  public Long endNode() {
    return endNode;
  }

  /**
   * Gets the relationshipType.
   *
   * The relationship type of the current edge.
   *
   * @return the relationshipType
   */
  public String relationshipType() {
    return relationshipType;
  }

  /**
   * Gets the startNode.
   *
   * The starting node index of the current edge.
   *
   * @return the startNode
   */
  public Long startNode() {
    return startNode;
  }

  /**
   * Gets the filters.
   *
   * The filter properties of the current edge.
   *
   * @return the filters
   */
  public Map<String, String> filters() {
    return filters;
  }
}

