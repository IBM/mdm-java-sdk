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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single node to use in current relationship discovery rule.
 */
public class RelationshipDiscoveryRulesBuilderNode extends GenericModel {

  @SerializedName("entity_type")
  protected String entityType;
  @SerializedName("group_type")
  protected String groupType;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("hierarchy_type")
  protected String hierarchyType;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private String groupType;
    private String recordType;
    private String hierarchyType;

    private Builder(RelationshipDiscoveryRulesBuilderNode relationshipDiscoveryRulesBuilderNode) {
      this.entityType = relationshipDiscoveryRulesBuilderNode.entityType;
      this.groupType = relationshipDiscoveryRulesBuilderNode.groupType;
      this.recordType = relationshipDiscoveryRulesBuilderNode.recordType;
      this.hierarchyType = relationshipDiscoveryRulesBuilderNode.hierarchyType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RelationshipDiscoveryRulesBuilderNode.
     *
     * @return the new RelationshipDiscoveryRulesBuilderNode instance
     */
    public RelationshipDiscoveryRulesBuilderNode build() {
      return new RelationshipDiscoveryRulesBuilderNode(this);
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the RelationshipDiscoveryRulesBuilderNode builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the groupType.
     *
     * @param groupType the groupType
     * @return the RelationshipDiscoveryRulesBuilderNode builder
     */
    public Builder groupType(String groupType) {
      this.groupType = groupType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the RelationshipDiscoveryRulesBuilderNode builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the RelationshipDiscoveryRulesBuilderNode builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesBuilderNode() { }

  protected RelationshipDiscoveryRulesBuilderNode(Builder builder) {
    entityType = builder.entityType;
    groupType = builder.groupType;
    recordType = builder.recordType;
    hierarchyType = builder.hierarchyType;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesBuilderNode builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityType.
   *
   * The entity type of the current node.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the groupType.
   *
   * The group type of the current node.
   *
   * @return the groupType
   */
  public String groupType() {
    return groupType;
  }

  /**
   * Gets the recordType.
   *
   * The record type of the current node.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the hierarchyType.
   *
   * The heirarchy type of the current node.
   *
   * @return the hierarchyType
   */
  public String hierarchyType() {
    return hierarchyType;
  }
}

