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
 * A collection of records and relationships to delete.
 */
public class SyncUpdateRequestDeletions extends GenericModel {

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

    private Builder(SyncUpdateRequestDeletions syncUpdateRequestDeletions) {
      this.records = syncUpdateRequestDeletions.records;
      this.relationships = syncUpdateRequestDeletions.relationships;
      this.groups = syncUpdateRequestDeletions.groups;
      this.hierarchies = syncUpdateRequestDeletions.hierarchies;
      this.groupAssociations = syncUpdateRequestDeletions.groupAssociations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SyncUpdateRequestDeletions.
     *
     * @return the new SyncUpdateRequestDeletions instance
     */
    public SyncUpdateRequestDeletions build() {
      return new SyncUpdateRequestDeletions(this);
    }

    /**
     * Adds an records to records.
     *
     * @param records the new records
     * @return the SyncUpdateRequestDeletions builder
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
     * Adds an relationships to relationships.
     *
     * @param relationships the new relationships
     * @return the SyncUpdateRequestDeletions builder
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
     * Adds an groups to groups.
     *
     * @param groups the new groups
     * @return the SyncUpdateRequestDeletions builder
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
     * Adds an hierarchies to hierarchies.
     *
     * @param hierarchies the new hierarchies
     * @return the SyncUpdateRequestDeletions builder
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
     * Adds an groupAssociations to groupAssociations.
     *
     * @param groupAssociations the new groupAssociations
     * @return the SyncUpdateRequestDeletions builder
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
     * @return the SyncUpdateRequestDeletions builder
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
     * @return the SyncUpdateRequestDeletions builder
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
     * @return the SyncUpdateRequestDeletions builder
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
     * @return the SyncUpdateRequestDeletions builder
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
     * @return the SyncUpdateRequestDeletions builder
     */
    public Builder groupAssociations(List<DataRelationship> groupAssociations) {
      this.groupAssociations = groupAssociations;
      return this;
    }
  }

  protected SyncUpdateRequestDeletions() { }

  protected SyncUpdateRequestDeletions(Builder builder) {
    records = builder.records;
    relationships = builder.relationships;
    groups = builder.groups;
    hierarchies = builder.hierarchies;
    groupAssociations = builder.groupAssociations;
  }

  /**
   * New builder.
   *
   * @return a SyncUpdateRequestDeletions builder
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

