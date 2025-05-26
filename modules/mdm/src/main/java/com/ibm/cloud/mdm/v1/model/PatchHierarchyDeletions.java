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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A collection of hierarchy nodes and relationships to delete.
 */
public class PatchHierarchyDeletions extends GenericModel {

  protected List<DataNode> nodes;
  protected List<DataRelationship> relationships;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DataNode> nodes;
    private List<DataRelationship> relationships;

    private Builder(PatchHierarchyDeletions patchHierarchyDeletions) {
      this.nodes = patchHierarchyDeletions.nodes;
      this.relationships = patchHierarchyDeletions.relationships;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PatchHierarchyDeletions.
     *
     * @return the new PatchHierarchyDeletions instance
     */
    public PatchHierarchyDeletions build() {
      return new PatchHierarchyDeletions(this);
    }

    /**
     * Adds an nodes to nodes.
     *
     * @param nodes the new nodes
     * @return the PatchHierarchyDeletions builder
     */
    public Builder addNodes(DataNode nodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(nodes,
        "nodes cannot be null");
      if (this.nodes == null) {
        this.nodes = new ArrayList<DataNode>();
      }
      this.nodes.add(nodes);
      return this;
    }

    /**
     * Adds an relationships to relationships.
     *
     * @param relationships the new relationships
     * @return the PatchHierarchyDeletions builder
     */
    public Builder addRelationships(DataRelationship relationships) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relationships,
        "relationships cannot be null");
      if (this.relationships == null) {
        this.relationships = new ArrayList<DataRelationship>();
      }
      this.relationships.add(relationships);
      return this;
    }

    /**
     * Set the nodes.
     * Existing nodes will be replaced.
     *
     * @param nodes the nodes
     * @return the PatchHierarchyDeletions builder
     */
    public Builder nodes(List<DataNode> nodes) {
      this.nodes = nodes;
      return this;
    }

    /**
     * Set the relationships.
     * Existing relationships will be replaced.
     *
     * @param relationships the relationships
     * @return the PatchHierarchyDeletions builder
     */
    public Builder relationships(List<DataRelationship> relationships) {
      this.relationships = relationships;
      return this;
    }
  }

  protected PatchHierarchyDeletions() { }

  protected PatchHierarchyDeletions(Builder builder) {
    nodes = builder.nodes;
    relationships = builder.relationships;
  }

  /**
   * New builder.
   *
   * @return a PatchHierarchyDeletions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the nodes.
   *
   * A collection of hierarchy nodes.
   *
   * @return the nodes
   */
  public List<DataNode> nodes() {
    return nodes;
  }

  /**
   * Gets the relationships.
   *
   * A collection of relationships.
   *
   * @return the relationships
   */
  public List<DataRelationship> relationships() {
    return relationships;
  }
}

