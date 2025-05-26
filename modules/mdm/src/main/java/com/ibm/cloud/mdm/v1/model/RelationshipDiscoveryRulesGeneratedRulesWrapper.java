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
 * Generated Rules Wrapper Structure.
 */
public class RelationshipDiscoveryRulesGeneratedRulesWrapper extends GenericModel {

  @SerializedName("hierarchy_types")
  protected Map<String, String> hierarchyTypes;
  @SerializedName("group_types")
  protected Map<String, String> groupTypes;
  @SerializedName("entity_types")
  protected Map<String, String> entityTypes;
  @SerializedName("record_types")
  protected Map<String, String> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> hierarchyTypes;
    private Map<String, String> groupTypes;
    private Map<String, String> entityTypes;
    private Map<String, String> recordTypes;

    private Builder(RelationshipDiscoveryRulesGeneratedRulesWrapper relationshipDiscoveryRulesGeneratedRulesWrapper) {
      this.hierarchyTypes = relationshipDiscoveryRulesGeneratedRulesWrapper.hierarchyTypes;
      this.groupTypes = relationshipDiscoveryRulesGeneratedRulesWrapper.groupTypes;
      this.entityTypes = relationshipDiscoveryRulesGeneratedRulesWrapper.entityTypes;
      this.recordTypes = relationshipDiscoveryRulesGeneratedRulesWrapper.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RelationshipDiscoveryRulesGeneratedRulesWrapper.
     *
     * @return the new RelationshipDiscoveryRulesGeneratedRulesWrapper instance
     */
    public RelationshipDiscoveryRulesGeneratedRulesWrapper build() {
      return new RelationshipDiscoveryRulesGeneratedRulesWrapper(this);
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the RelationshipDiscoveryRulesGeneratedRulesWrapper builder
     */
    public Builder hierarchyTypes(Map<String, String> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the groupTypes.
     *
     * @param groupTypes the groupTypes
     * @return the RelationshipDiscoveryRulesGeneratedRulesWrapper builder
     */
    public Builder groupTypes(Map<String, String> groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the RelationshipDiscoveryRulesGeneratedRulesWrapper builder
     */
    public Builder entityTypes(Map<String, String> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the RelationshipDiscoveryRulesGeneratedRulesWrapper builder
     */
    public Builder recordTypes(Map<String, String> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected RelationshipDiscoveryRulesGeneratedRulesWrapper() { }

  protected RelationshipDiscoveryRulesGeneratedRulesWrapper(Builder builder) {
    hierarchyTypes = builder.hierarchyTypes;
    groupTypes = builder.groupTypes;
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a RelationshipDiscoveryRulesGeneratedRulesWrapper builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyTypes.
   *
   * Collection of generated rules for hierarchy types.
   *
   * @return the hierarchyTypes
   */
  public Map<String, String> hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the groupTypes.
   *
   * Collection of generated rules for group types.
   *
   * @return the groupTypes
   */
  public Map<String, String> groupTypes() {
    return groupTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * Collection of generated rules for entity types.
   *
   * @return the entityTypes
   */
  public Map<String, String> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of generated rules for record types.
   *
   * @return the recordTypes
   */
  public Map<String, String> recordTypes() {
    return recordTypes;
  }
}

