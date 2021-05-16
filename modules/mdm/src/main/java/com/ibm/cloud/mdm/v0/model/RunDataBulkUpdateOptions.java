/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The runDataBulkUpdate options.
 */
public class RunDataBulkUpdateOptions extends GenericModel {

  protected SyncUpdateRequestUpserts upserts;
  protected SyncUpdateRequestDeletions deletions;
  protected Boolean ignoreRedundantUpdates;

  /**
   * Builder.
   */
  public static class Builder {
    private SyncUpdateRequestUpserts upserts;
    private SyncUpdateRequestDeletions deletions;
    private Boolean ignoreRedundantUpdates;

    private Builder(RunDataBulkUpdateOptions runDataBulkUpdateOptions) {
      this.upserts = runDataBulkUpdateOptions.upserts;
      this.deletions = runDataBulkUpdateOptions.deletions;
      this.ignoreRedundantUpdates = runDataBulkUpdateOptions.ignoreRedundantUpdates;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RunDataBulkUpdateOptions.
     *
     * @return the new RunDataBulkUpdateOptions instance
     */
    public RunDataBulkUpdateOptions build() {
      return new RunDataBulkUpdateOptions(this);
    }

    /**
     * Set the upserts.
     *
     * @param upserts the upserts
     * @return the RunDataBulkUpdateOptions builder
     */
    public Builder upserts(SyncUpdateRequestUpserts upserts) {
      this.upserts = upserts;
      return this;
    }

    /**
     * Set the deletions.
     *
     * @param deletions the deletions
     * @return the RunDataBulkUpdateOptions builder
     */
    public Builder deletions(SyncUpdateRequestDeletions deletions) {
      this.deletions = deletions;
      return this;
    }

    /**
     * Set the ignoreRedundantUpdates.
     *
     * @param ignoreRedundantUpdates the ignoreRedundantUpdates
     * @return the RunDataBulkUpdateOptions builder
     */
    public Builder ignoreRedundantUpdates(Boolean ignoreRedundantUpdates) {
      this.ignoreRedundantUpdates = ignoreRedundantUpdates;
      return this;
    }
  }

  protected RunDataBulkUpdateOptions(Builder builder) {
    upserts = builder.upserts;
    deletions = builder.deletions;
    ignoreRedundantUpdates = builder.ignoreRedundantUpdates;
  }

  /**
   * New builder.
   *
   * @return a RunDataBulkUpdateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the upserts.
   *
   * A collection of records and relationships to create or update.
   *
   * @return the upserts
   */
  public SyncUpdateRequestUpserts upserts() {
    return upserts;
  }

  /**
   * Gets the deletions.
   *
   * A collection of records and relationships to delete.
   *
   * @return the deletions
   */
  public SyncUpdateRequestDeletions deletions() {
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

