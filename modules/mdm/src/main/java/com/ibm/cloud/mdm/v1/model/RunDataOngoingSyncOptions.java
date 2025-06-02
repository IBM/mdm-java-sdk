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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The runDataOngoingSync options.
 */
public class RunDataOngoingSyncOptions extends GenericModel {

  /**
   * The strategy for updating existing data during the ongoing sync.
   */
  public interface OperationStrategy {
    /** patch. */
    String PATCH = "patch";
    /** put. */
    String PUT = "put";
  }

  protected String operationStrategy;
  protected SyncUpdateRequestUpserts upserts;
  protected SyncUpdateRequestDeletions deletions;
  protected Boolean ignoreRedundantUpdates;

  /**
   * Builder.
   */
  public static class Builder {
    private String operationStrategy;
    private SyncUpdateRequestUpserts upserts;
    private SyncUpdateRequestDeletions deletions;
    private Boolean ignoreRedundantUpdates;

    /**
     * Instantiates a new Builder from an existing RunDataOngoingSyncOptions instance.
     *
     * @param runDataOngoingSyncOptions the instance to initialize the Builder with
     */
    private Builder(RunDataOngoingSyncOptions runDataOngoingSyncOptions) {
      this.operationStrategy = runDataOngoingSyncOptions.operationStrategy;
      this.upserts = runDataOngoingSyncOptions.upserts;
      this.deletions = runDataOngoingSyncOptions.deletions;
      this.ignoreRedundantUpdates = runDataOngoingSyncOptions.ignoreRedundantUpdates;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RunDataOngoingSyncOptions.
     *
     * @return the new RunDataOngoingSyncOptions instance
     */
    public RunDataOngoingSyncOptions build() {
      return new RunDataOngoingSyncOptions(this);
    }

    /**
     * Set the operationStrategy.
     *
     * @param operationStrategy the operationStrategy
     * @return the RunDataOngoingSyncOptions builder
     */
    public Builder operationStrategy(String operationStrategy) {
      this.operationStrategy = operationStrategy;
      return this;
    }

    /**
     * Set the upserts.
     *
     * @param upserts the upserts
     * @return the RunDataOngoingSyncOptions builder
     */
    public Builder upserts(SyncUpdateRequestUpserts upserts) {
      this.upserts = upserts;
      return this;
    }

    /**
     * Set the deletions.
     *
     * @param deletions the deletions
     * @return the RunDataOngoingSyncOptions builder
     */
    public Builder deletions(SyncUpdateRequestDeletions deletions) {
      this.deletions = deletions;
      return this;
    }

    /**
     * Set the ignoreRedundantUpdates.
     *
     * @param ignoreRedundantUpdates the ignoreRedundantUpdates
     * @return the RunDataOngoingSyncOptions builder
     */
    public Builder ignoreRedundantUpdates(Boolean ignoreRedundantUpdates) {
      this.ignoreRedundantUpdates = ignoreRedundantUpdates;
      return this;
    }
  }

  protected RunDataOngoingSyncOptions() { }

  protected RunDataOngoingSyncOptions(Builder builder) {
    operationStrategy = builder.operationStrategy;
    upserts = builder.upserts;
    deletions = builder.deletions;
    ignoreRedundantUpdates = builder.ignoreRedundantUpdates;
  }

  /**
   * New builder.
   *
   * @return a RunDataOngoingSyncOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the operationStrategy.
   *
   * The strategy for updating existing data during the ongoing sync.
   *
   * @return the operationStrategy
   */
  public String operationStrategy() {
    return operationStrategy;
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

