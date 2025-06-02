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
 * A collection of records and relationships to create or update.
 */
public class SyncUpdateRequestUpserts extends GenericModel {

  protected List<DataRecord> records;
  protected List<DataRelationship> relationships;
  protected List<DataGroup> groups;
  protected List<DataHierarchy> hierarchies;
  @SerializedName("group_associations")
  protected List<DataRelationship> groupAssociations;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DataRecord> records;
    private List<DataRelationship> relationships;
    private List<DataGroup> groups;
    private List<DataHierarchy> hierarchies;
    private List<DataRelationship> groupAssociations;

    /**
     * Instantiates a new Builder from an existing SyncUpdateRequestUpserts instance.
     *
     * @param syncUpdateRequestUpserts the instance to initialize the Builder with
     */
    private Builder(SyncUpdateRequestUpserts syncUpdateRequestUpserts) {
      this.records = syncUpdateRequestUpserts.records;
      this.relationships = syncUpdateRequestUpserts.relationships;
      this.groups = syncUpdateRequestUpserts.groups;
      this.hierarchies = syncUpdateRequestUpserts.hierarchies;
      this.groupAssociations = syncUpdateRequestUpserts.groupAssociations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SyncUpdateRequestUpserts.
     *
     * @return the new SyncUpdateRequestUpserts instance
     */
    public SyncUpdateRequestUpserts build() {
      return new SyncUpdateRequestUpserts(this);
    }

    /**
     * Adds a new element to records.
     *
     * @param records the new element to be added
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder addRecords(DataRecord records) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(records,
        "records cannot be null");
      if (this.records == null) {
        this.records = new ArrayList<DataRecord>();
      }
      this.records.add(records);
      return this;
    }

    /**
     * Adds a new element to relationships.
     *
     * @param relationships the new element to be added
     * @return the SyncUpdateRequestUpserts builder
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
     * Adds a new element to groups.
     *
     * @param groups the new element to be added
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder addGroups(DataGroup groups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groups,
        "groups cannot be null");
      if (this.groups == null) {
        this.groups = new ArrayList<DataGroup>();
      }
      this.groups.add(groups);
      return this;
    }

    /**
     * Adds a new element to hierarchies.
     *
     * @param hierarchies the new element to be added
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder addHierarchies(DataHierarchy hierarchies) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(hierarchies,
        "hierarchies cannot be null");
      if (this.hierarchies == null) {
        this.hierarchies = new ArrayList<DataHierarchy>();
      }
      this.hierarchies.add(hierarchies);
      return this;
    }

    /**
     * Adds a new element to groupAssociations.
     *
     * @param groupAssociations the new element to be added
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder addGroupAssociations(DataRelationship groupAssociations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groupAssociations,
        "groupAssociations cannot be null");
      if (this.groupAssociations == null) {
        this.groupAssociations = new ArrayList<DataRelationship>();
      }
      this.groupAssociations.add(groupAssociations);
      return this;
    }

    /**
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder records(List<DataRecord> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the relationships.
     * Existing relationships will be replaced.
     *
     * @param relationships the relationships
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder relationships(List<DataRelationship> relationships) {
      this.relationships = relationships;
      return this;
    }

    /**
     * Set the groups.
     * Existing groups will be replaced.
     *
     * @param groups the groups
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder groups(List<DataGroup> groups) {
      this.groups = groups;
      return this;
    }

    /**
     * Set the hierarchies.
     * Existing hierarchies will be replaced.
     *
     * @param hierarchies the hierarchies
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder hierarchies(List<DataHierarchy> hierarchies) {
      this.hierarchies = hierarchies;
      return this;
    }

    /**
     * Set the groupAssociations.
     * Existing groupAssociations will be replaced.
     *
     * @param groupAssociations the groupAssociations
     * @return the SyncUpdateRequestUpserts builder
     */
    public Builder groupAssociations(List<DataRelationship> groupAssociations) {
      this.groupAssociations = groupAssociations;
      return this;
    }
  }

  protected SyncUpdateRequestUpserts() { }

  protected SyncUpdateRequestUpserts(Builder builder) {
    records = builder.records;
    relationships = builder.relationships;
    groups = builder.groups;
    hierarchies = builder.hierarchies;
    groupAssociations = builder.groupAssociations;
  }

  /**
   * New builder.
   *
   * @return a SyncUpdateRequestUpserts builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the records.
   *
   * A collection of records.
   *
   * @return the records
   */
  public List<DataRecord> records() {
    return records;
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

  /**
   * Gets the groups.
   *
   * A collection of groups.
   *
   * @return the groups
   */
  public List<DataGroup> groups() {
    return groups;
  }

  /**
   * Gets the hierarchies.
   *
   * A colleciton of hierarchies.
   *
   * @return the hierarchies
   */
  public List<DataHierarchy> hierarchies() {
    return hierarchies;
  }

  /**
   * Gets the groupAssociations.
   *
   * A collection of group associations.
   *
   * @return the groupAssociations
   */
  public List<DataRelationship> groupAssociations() {
    return groupAssociations;
  }
}

