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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataRunBulkUpdate options.
 */
public class DataRunBulkUpdateOptions extends GenericModel {

  protected SyncUpdateElement upserts;
  protected SyncUpdateElement deletions;
  protected Boolean ignoreRedundantUpdates;

  /**
   * Builder.
   */
  public static class Builder {
    private SyncUpdateElement upserts;
    private SyncUpdateElement deletions;
    private Boolean ignoreRedundantUpdates;

    private Builder(DataRunBulkUpdateOptions dataRunBulkUpdateOptions) {
      this.upserts = dataRunBulkUpdateOptions.upserts;
      this.deletions = dataRunBulkUpdateOptions.deletions;
      this.ignoreRedundantUpdates = dataRunBulkUpdateOptions.ignoreRedundantUpdates;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataRunBulkUpdateOptions.
     *
     * @return the new DataRunBulkUpdateOptions instance
     */
    public DataRunBulkUpdateOptions build() {
      return new DataRunBulkUpdateOptions(this);
    }

    /**
     * Set the upserts.
     *
     * @param upserts the upserts
     * @return the DataRunBulkUpdateOptions builder
     */
    public Builder upserts(SyncUpdateElement upserts) {
      this.upserts = upserts;
      return this;
    }

    /**
     * Set the deletions.
     *
     * @param deletions the deletions
     * @return the DataRunBulkUpdateOptions builder
     */
    public Builder deletions(SyncUpdateElement deletions) {
      this.deletions = deletions;
      return this;
    }

    /**
     * Set the ignoreRedundantUpdates.
     *
     * @param ignoreRedundantUpdates the ignoreRedundantUpdates
     * @return the DataRunBulkUpdateOptions builder
     */
    public Builder ignoreRedundantUpdates(Boolean ignoreRedundantUpdates) {
      this.ignoreRedundantUpdates = ignoreRedundantUpdates;
      return this;
    }
  }

  protected DataRunBulkUpdateOptions(Builder builder) {
    upserts = builder.upserts;
    deletions = builder.deletions;
    ignoreRedundantUpdates = builder.ignoreRedundantUpdates;
  }

  /**
   * New builder.
   *
   * @return a DataRunBulkUpdateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the upserts.
   *
   * Details of the sync update you want performed.
   *
   * @return the upserts
   */
  public SyncUpdateElement upserts() {
    return upserts;
  }

  /**
   * Gets the deletions.
   *
   * Details of the sync update you want performed.
   *
   * @return the deletions
   */
  public SyncUpdateElement deletions() {
    return deletions;
  }

  /**
   * Gets the ignoreRedundantUpdates.
   *
   * Whether to ignore updates that fail due to missing or invalid 'record_last_updated' timestamps.
   *
   * @return the ignoreRedundantUpdates
   */
  public Boolean ignoreRedundantUpdates() {
    return ignoreRedundantUpdates;
  }
}

