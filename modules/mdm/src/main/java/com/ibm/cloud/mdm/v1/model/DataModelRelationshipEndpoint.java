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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines record types or entity types allowed as relationship endpoint.
 */
public class DataModelRelationshipEndpoint extends GenericModel {

  @SerializedName("hierarchy_types")
  protected List<String> hierarchyTypes;
  @SerializedName("node_types")
  protected List<String> nodeTypes;
  @SerializedName("group_types")
  protected List<String> groupTypes;
  @SerializedName("entity_types")
  protected List<String> entityTypes;
  @SerializedName("record_types")
  protected List<String> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> hierarchyTypes;
    private List<String> nodeTypes;
    private List<String> groupTypes;
    private List<String> entityTypes;
    private List<String> recordTypes;

    /**
     * Instantiates a new Builder from an existing DataModelRelationshipEndpoint instance.
     *
     * @param dataModelRelationshipEndpoint the instance to initialize the Builder with
     */
    private Builder(DataModelRelationshipEndpoint dataModelRelationshipEndpoint) {
      this.hierarchyTypes = dataModelRelationshipEndpoint.hierarchyTypes;
      this.nodeTypes = dataModelRelationshipEndpoint.nodeTypes;
      this.groupTypes = dataModelRelationshipEndpoint.groupTypes;
      this.entityTypes = dataModelRelationshipEndpoint.entityTypes;
      this.recordTypes = dataModelRelationshipEndpoint.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelRelationshipEndpoint.
     *
     * @return the new DataModelRelationshipEndpoint instance
     */
    public DataModelRelationshipEndpoint build() {
      return new DataModelRelationshipEndpoint(this);
    }

    /**
     * Adds a new element to hierarchyTypes.
     *
     * @param hierarchyTypes the new element to be added
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder addHierarchyTypes(String hierarchyTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hierarchyTypes,
        "hierarchyTypes cannot be null");
      if (this.hierarchyTypes == null) {
        this.hierarchyTypes = new ArrayList<String>();
      }
      this.hierarchyTypes.add(hierarchyTypes);
      return this;
    }

    /**
     * Adds a new element to nodeTypes.
     *
     * @param nodeTypes the new element to be added
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder addNodeTypes(String nodeTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(nodeTypes,
        "nodeTypes cannot be null");
      if (this.nodeTypes == null) {
        this.nodeTypes = new ArrayList<String>();
      }
      this.nodeTypes.add(nodeTypes);
      return this;
    }

    /**
     * Adds a new element to groupTypes.
     *
     * @param groupTypes the new element to be added
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder addGroupTypes(String groupTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groupTypes,
        "groupTypes cannot be null");
      if (this.groupTypes == null) {
        this.groupTypes = new ArrayList<String>();
      }
      this.groupTypes.add(groupTypes);
      return this;
    }

    /**
     * Adds a new element to entityTypes.
     *
     * @param entityTypes the new element to be added
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder addEntityTypes(String entityTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entityTypes,
        "entityTypes cannot be null");
      if (this.entityTypes == null) {
        this.entityTypes = new ArrayList<String>();
      }
      this.entityTypes.add(entityTypes);
      return this;
    }

    /**
     * Adds a new element to recordTypes.
     *
     * @param recordTypes the new element to be added
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder addRecordTypes(String recordTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(recordTypes,
        "recordTypes cannot be null");
      if (this.recordTypes == null) {
        this.recordTypes = new ArrayList<String>();
      }
      this.recordTypes.add(recordTypes);
      return this;
    }

    /**
     * Set the hierarchyTypes.
     * Existing hierarchyTypes will be replaced.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder hierarchyTypes(List<String> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the nodeTypes.
     * Existing nodeTypes will be replaced.
     *
     * @param nodeTypes the nodeTypes
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder nodeTypes(List<String> nodeTypes) {
      this.nodeTypes = nodeTypes;
      return this;
    }

    /**
     * Set the groupTypes.
     * Existing groupTypes will be replaced.
     *
     * @param groupTypes the groupTypes
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder groupTypes(List<String> groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     * Existing entityTypes will be replaced.
     *
     * @param entityTypes the entityTypes
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder entityTypes(List<String> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     * Existing recordTypes will be replaced.
     *
     * @param recordTypes the recordTypes
     * @return the DataModelRelationshipEndpoint builder
     */
    public Builder recordTypes(List<String> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected DataModelRelationshipEndpoint() { }

  protected DataModelRelationshipEndpoint(Builder builder) {
    hierarchyTypes = builder.hierarchyTypes;
    nodeTypes = builder.nodeTypes;
    groupTypes = builder.groupTypes;
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a DataModelRelationshipEndpoint builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyTypes.
   *
   * Collection of allowed hierarchy types.
   *
   * @return the hierarchyTypes
   */
  public List<String> hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the nodeTypes.
   *
   * Collection of allowed node types.
   *
   * @return the nodeTypes
   */
  public List<String> nodeTypes() {
    return nodeTypes;
  }

  /**
   * Gets the groupTypes.
   *
   * Collection of allowed group types.
   *
   * @return the groupTypes
   */
  public List<String> groupTypes() {
    return groupTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * Collection of allowed entity types.
   *
   * @return the entityTypes
   */
  public List<String> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of allowed record types.
   *
   * @return the recordTypes
   */
  public List<String> recordTypes() {
    return recordTypes;
  }
}

