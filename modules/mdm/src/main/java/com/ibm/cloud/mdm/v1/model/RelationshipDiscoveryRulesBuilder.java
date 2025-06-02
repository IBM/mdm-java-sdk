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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object of relationship discovery rules builder.
 */
public class RelationshipDiscoveryRulesBuilder extends GenericModel {

  protected List<RelationshipDiscoveryRulesBuilderNode> nodes;
  @SerializedName("return_nodes")
  protected List<Long> returnNodes;
  protected CriteriaGeneric criteria;
  protected List<RelationshipDiscoveryRulesBuilderEdge> edges;
  @SerializedName("order_by")
  protected List<RelationshipDiscoveryRulesBuilderOrderByItem> orderBy;
  protected Map<String, Object> constants;

  /**
   * Builder.
   */
  public static class Builder {
    private List<RelationshipDiscoveryRulesBuilderNode> nodes;
    private List<Long> returnNodes;
    private CriteriaGeneric criteria;
    private List<RelationshipDiscoveryRulesBuilderEdge> edges;
    private List<RelationshipDiscoveryRulesBuilderOrderByItem> orderBy;
    private Map<String, Object> constants;

    /**
     * Instantiates a new Builder from an existing RelationshipDiscoveryRulesBuilder instance.
     *
     * @param relationshipDiscoveryRulesBuilder the instance to initialize the Builder with
     */
    private Builder(RelationshipDiscoveryRulesBuilder relationshipDiscoveryRulesBuilder) {
      this.nodes = relationshipDiscoveryRulesBuilder.nodes;
      this.returnNodes = relationshipDiscoveryRulesBuilder.returnNodes;
      this.criteria = relationshipDiscoveryRulesBuilder.criteria;
      this.edges = relationshipDiscoveryRulesBuilder.edges;
      this.orderBy = relationshipDiscoveryRulesBuilder.orderBy;
      this.constants = relationshipDiscoveryRulesBuilder.constants;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param nodes the nodes
     * @param returnNodes the returnNodes
     */
    public Builder(List<RelationshipDiscoveryRulesBuilderNode> nodes, List<Long> returnNodes) {
      this.nodes = nodes;
      this.returnNodes = returnNodes;
    }

    /**
     * Builds a RelationshipDiscoveryRulesBuilder.
     *
     * @return the new RelationshipDiscoveryRulesBuilder instance
     */
    public RelationshipDiscoveryRulesBuilder build() {
      return new RelationshipDiscoveryRulesBuilder(this);
    }

    /**
     * Adds a new element to nodes.
     *
     * @param nodes the new element to be added
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder addNodes(RelationshipDiscoveryRulesBuilderNode nodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(nodes,
        "nodes cannot be null");
      if (this.nodes == null) {
        this.nodes = new ArrayList<RelationshipDiscoveryRulesBuilderNode>();
      }
      this.nodes.add(nodes);
      return this;
    }

    /**
     * Adds a new element to returnNodes.
     *
     * @param returnNodes the new element to be added
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder addReturnNodes(Long returnNodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(returnNodes,
        "returnNodes cannot be null");
      if (this.returnNodes == null) {
        this.returnNodes = new ArrayList<Long>();
      }
      this.returnNodes.add(returnNodes);
      return this;
    }

    /**
     * Adds a new element to edges.
     *
     * @param edges the new element to be added
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder addEdges(RelationshipDiscoveryRulesBuilderEdge edges) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(edges,
        "edges cannot be null");
      if (this.edges == null) {
        this.edges = new ArrayList<RelationshipDiscoveryRulesBuilderEdge>();
      }
      this.edges.add(edges);
      return this;
    }

    /**
     * Adds a new element to orderBy.
     *
     * @param orderBy the new element to be added
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder addOrderBy(RelationshipDiscoveryRulesBuilderOrderByItem orderBy) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(orderBy,
        "orderBy cannot be null");
      if (this.orderBy == null) {
        this.orderBy = new ArrayList<RelationshipDiscoveryRulesBuilderOrderByItem>();
      }
      this.orderBy.add(orderBy);
      return this;
    }

    /**
     * Set the nodes.
     * Existing nodes will be replaced.
     *
     * @param nodes the nodes
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder nodes(List<RelationshipDiscoveryRulesBuilderNode> nodes) {
      this.nodes = nodes;
      return this;
    }

    /**
     * Set the returnNodes.
     * Existing returnNodes will be replaced.
     *
     * @param returnNodes the returnNodes
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder returnNodes(List<Long> returnNodes) {
      this.returnNodes = returnNodes;
      return this;
    }

    /**
     * Set the criteria.
     *
     * @param criteria the criteria
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder criteria(CriteriaGeneric criteria) {
      this.criteria = criteria;
      return this;
    }

    /**
     * Set the edges.
     * Existing edges will be replaced.
     *
     * @param edges the edges
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder edges(List<RelationshipDiscoveryRulesBuilderEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * Set the orderBy.
     * Existing orderBy will be replaced.
     *
     * @param orderBy the orderBy
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder orderBy(List<RelationshipDiscoveryRulesBuilderOrderByItem> orderBy) {
      this.orderBy = orderBy;
      return this;
    }

    /**
     * Set the constants.
     *
     * @param constants the constants
     * @return the RelationshipDiscoveryRulesBuilder builder
     */
    public Builder constants(Map<String, Object> constants) {
      this.constants = constants;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesBuilder() { }

  protected RelationshipDiscoveryRulesBuilder(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nodes,
      "nodes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.returnNodes,
      "returnNodes cannot be null");
    nodes = builder.nodes;
    returnNodes = builder.returnNodes;
    criteria = builder.criteria;
    edges = builder.edges;
    orderBy = builder.orderBy;
    constants = builder.constants;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesBuilder builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the nodes.
   *
   * The defined nodes to use in current relationship discovery rule.
   *
   * @return the nodes
   */
  public List<RelationshipDiscoveryRulesBuilderNode> nodes() {
    return nodes;
  }

  /**
   * Gets the returnNodes.
   *
   * The returning nodes of current relationship discovery rule.
   *
   * @return the returnNodes
   */
  public List<Long> returnNodes() {
    return returnNodes;
  }

  /**
   * Gets the criteria.
   *
   * The wrapper object of condition, can be either a criteria or condition structure.
   *
   * @return the criteria
   */
  public CriteriaGeneric criteria() {
    return criteria;
  }

  /**
   * Gets the edges.
   *
   * The defined edges to use in current relationship discovery rule.
   *
   * @return the edges
   */
  public List<RelationshipDiscoveryRulesBuilderEdge> edges() {
    return edges;
  }

  /**
   * Gets the orderBy.
   *
   * The order by rules for returning nodes of current relationship discovery rule.
   *
   * @return the orderBy
   */
  public List<RelationshipDiscoveryRulesBuilderOrderByItem> orderBy() {
    return orderBy;
  }

  /**
   * Gets the constants.
   *
   * The defined constants to use in current relationship discovery rule.
   *
   * @return the constants
   */
  public Map<String, Object> constants() {
    return constants;
  }
}

