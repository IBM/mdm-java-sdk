/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of the sync update you want performed.
 */
public class SyncUpdateElement extends GenericModel {

  protected List<Record> records;
  protected List<Relationship> relationships;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Record> records;
    private List<Relationship> relationships;

    private Builder(SyncUpdateElement syncUpdateElement) {
      this.records = syncUpdateElement.records;
      this.relationships = syncUpdateElement.relationships;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SyncUpdateElement.
     *
     * @return the new SyncUpdateElement instance
     */
    public SyncUpdateElement build() {
      return new SyncUpdateElement(this);
    }

    /**
     * Adds an records to records.
     *
     * @param records the new records
     * @return the SyncUpdateElement builder
     */
    public Builder addRecords(Record records) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(records,
        "records cannot be null");
      if (this.records == null) {
        this.records = new ArrayList<Record>();
      }
      this.records.add(records);
      return this;
    }

    /**
     * Adds an relationships to relationships.
     *
     * @param relationships the new relationships
     * @return the SyncUpdateElement builder
     */
    public Builder addRelationships(Relationship relationships) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relationships,
        "relationships cannot be null");
      if (this.relationships == null) {
        this.relationships = new ArrayList<Relationship>();
      }
      this.relationships.add(relationships);
      return this;
    }

    /**
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the SyncUpdateElement builder
     */
    public Builder records(List<Record> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the relationships.
     * Existing relationships will be replaced.
     *
     * @param relationships the relationships
     * @return the SyncUpdateElement builder
     */
    public Builder relationships(List<Relationship> relationships) {
      this.relationships = relationships;
      return this;
    }
  }

  protected SyncUpdateElement(Builder builder) {
    records = builder.records;
    relationships = builder.relationships;
  }

  /**
   * New builder.
   *
   * @return a SyncUpdateElement builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the records.
   *
   * The list of operations for records.
   *
   * @return the records
   */
  public List<Record> records() {
    return records;
  }

  /**
   * Gets the relationships.
   *
   * The list of operations for relationships.
   *
   * @return the relationships
   */
  public List<Relationship> relationships() {
    return relationships;
  }
}

