/*
 * (C) Copyright IBM Corp. 2022.
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
 * A collection of records and relationships to delete.
 */
public class SyncUpdateRequestDeletions extends GenericModel {

  protected List<DataRecord> records;
  protected List<DataRelationship> relationships;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DataRecord> records;
    private List<DataRelationship> relationships;

    private Builder(SyncUpdateRequestDeletions syncUpdateRequestDeletions) {
      this.records = syncUpdateRequestDeletions.records;
      this.relationships = syncUpdateRequestDeletions.relationships;
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
  }

  protected SyncUpdateRequestDeletions(Builder builder) {
    records = builder.records;
    relationships = builder.relationships;
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
}

