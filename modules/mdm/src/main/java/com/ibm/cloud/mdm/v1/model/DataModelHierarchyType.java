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
 * A single user defined hierarchy type.
 */
public class DataModelHierarchyType extends GenericModel {

  @SerializedName("node_type")
  protected String nodeType;
  @SerializedName("node_relationship_type")
  protected String nodeRelationshipType;
  protected String description;
  protected Map<String, DataModelAttribute> attributes;
  protected String label;
  @SerializedName("node_associations")
  protected Map<String, Object> nodeAssociations;

  /**
   * Builder.
   */
  public static class Builder {
    private String nodeType;
    private String nodeRelationshipType;
    private String description;
    private Map<String, DataModelAttribute> attributes;
    private String label;
    private Map<String, Object> nodeAssociations;

    private Builder(DataModelHierarchyType dataModelHierarchyType) {
      this.nodeType = dataModelHierarchyType.nodeType;
      this.nodeRelationshipType = dataModelHierarchyType.nodeRelationshipType;
      this.description = dataModelHierarchyType.description;
      this.attributes = dataModelHierarchyType.attributes;
      this.label = dataModelHierarchyType.label;
      this.nodeAssociations = dataModelHierarchyType.nodeAssociations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelHierarchyType.
     *
     * @return the new DataModelHierarchyType instance
     */
    public DataModelHierarchyType build() {
      return new DataModelHierarchyType(this);
    }

    /**
     * Set the nodeType.
     *
     * @param nodeType the nodeType
     * @return the DataModelHierarchyType builder
     */
    public Builder nodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    /**
     * Set the nodeRelationshipType.
     *
     * @param nodeRelationshipType the nodeRelationshipType
     * @return the DataModelHierarchyType builder
     */
    public Builder nodeRelationshipType(String nodeRelationshipType) {
      this.nodeRelationshipType = nodeRelationshipType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelHierarchyType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelHierarchyType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelHierarchyType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the nodeAssociations.
     *
     * @param nodeAssociations the nodeAssociations
     * @return the DataModelHierarchyType builder
     */
    public Builder nodeAssociations(Map<String, Object> nodeAssociations) {
      this.nodeAssociations = nodeAssociations;
      return this;
    }
  }

  protected DataModelHierarchyType() { }

  protected DataModelHierarchyType(Builder builder) {
    nodeType = builder.nodeType;
    nodeRelationshipType = builder.nodeRelationshipType;
    description = builder.description;
    attributes = builder.attributes;
    label = builder.label;
    nodeAssociations = builder.nodeAssociations;
  }

  /**
   * New builder.
   *
   * @return a DataModelHierarchyType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the nodeType.
   *
   * A hierarchy node type.
   *
   * @return the nodeType
   */
  public String nodeType() {
    return nodeType;
  }

  /**
   * Gets the nodeRelationshipType.
   *
   * A hierarchy node to node relationship type.
   *
   * @return the nodeRelationshipType
   */
  public String nodeRelationshipType() {
    return nodeRelationshipType;
  }

  /**
   * Gets the description.
   *
   * A hierarchy type description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * A hierarchy type attributes.
   *
   * @return the attributes
   */
  public Map<String, DataModelAttribute> attributes() {
    return attributes;
  }

  /**
   * Gets the label.
   *
   * A hierarchy type label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the nodeAssociations.
   *
   * Hierarchy node to association relationship types.
   *
   * @return the nodeAssociations
   */
  public Map<String, Object> nodeAssociations() {
    return nodeAssociations;
  }
}

