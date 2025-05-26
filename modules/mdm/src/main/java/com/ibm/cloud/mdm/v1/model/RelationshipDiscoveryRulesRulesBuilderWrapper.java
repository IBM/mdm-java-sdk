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
 * Rules Builder Wrapper Structure.
 */
public class RelationshipDiscoveryRulesRulesBuilderWrapper extends GenericModel {

  @SerializedName("hierarchy_types")
  protected Map<String, RelationshipDiscoveryRulesBuilder> hierarchyTypes;
  @SerializedName("group_types")
  protected Map<String, RelationshipDiscoveryRulesBuilder> groupTypes;
  @SerializedName("entity_types")
  protected Map<String, RelationshipDiscoveryRulesBuilder> entityTypes;
  @SerializedName("record_types")
  protected Map<String, RelationshipDiscoveryRulesBuilder> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, RelationshipDiscoveryRulesBuilder> hierarchyTypes;
    private Map<String, RelationshipDiscoveryRulesBuilder> groupTypes;
    private Map<String, RelationshipDiscoveryRulesBuilder> entityTypes;
    private Map<String, RelationshipDiscoveryRulesBuilder> recordTypes;

    private Builder(RelationshipDiscoveryRulesRulesBuilderWrapper relationshipDiscoveryRulesRulesBuilderWrapper) {
      this.hierarchyTypes = relationshipDiscoveryRulesRulesBuilderWrapper.hierarchyTypes;
      this.groupTypes = relationshipDiscoveryRulesRulesBuilderWrapper.groupTypes;
      this.entityTypes = relationshipDiscoveryRulesRulesBuilderWrapper.entityTypes;
      this.recordTypes = relationshipDiscoveryRulesRulesBuilderWrapper.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RelationshipDiscoveryRulesRulesBuilderWrapper.
     *
     * @return the new RelationshipDiscoveryRulesRulesBuilderWrapper instance
     */
    public RelationshipDiscoveryRulesRulesBuilderWrapper build() {
      return new RelationshipDiscoveryRulesRulesBuilderWrapper(this);
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the RelationshipDiscoveryRulesRulesBuilderWrapper builder
     */
    public Builder hierarchyTypes(Map<String, RelationshipDiscoveryRulesBuilder> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the groupTypes.
     *
     * @param groupTypes the groupTypes
     * @return the RelationshipDiscoveryRulesRulesBuilderWrapper builder
     */
    public Builder groupTypes(Map<String, RelationshipDiscoveryRulesBuilder> groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the RelationshipDiscoveryRulesRulesBuilderWrapper builder
     */
    public Builder entityTypes(Map<String, RelationshipDiscoveryRulesBuilder> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the RelationshipDiscoveryRulesRulesBuilderWrapper builder
     */
    public Builder recordTypes(Map<String, RelationshipDiscoveryRulesBuilder> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesRulesBuilderWrapper() { }

  protected RelationshipDiscoveryRulesRulesBuilderWrapper(Builder builder) {
    hierarchyTypes = builder.hierarchyTypes;
    groupTypes = builder.groupTypes;
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesRulesBuilderWrapper builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyTypes.
   *
   * Collection of Rules Builder definitions for hierarchy types.
   *
   * @return the hierarchyTypes
   */
  public Map<String, RelationshipDiscoveryRulesBuilder> hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the groupTypes.
   *
   * Collection of Rules Builder definitions for group types.
   *
   * @return the groupTypes
   */
  public Map<String, RelationshipDiscoveryRulesBuilder> groupTypes() {
    return groupTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * Collection of Rules Builder definitions for entity types.
   *
   * @return the entityTypes
   */
  public Map<String, RelationshipDiscoveryRulesBuilder> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of Rules Builder definitions for record types.
   *
   * @return the recordTypes
   */
  public Map<String, RelationshipDiscoveryRulesBuilder> recordTypes() {
    return recordTypes;
  }
}

