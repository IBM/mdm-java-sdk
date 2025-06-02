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
 * Request wrapper object for snapshot summary of model assets.
 */
public class UpdateSnapshotSummary extends GenericModel {

  protected String description;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String name;

    /**
     * Instantiates a new Builder from an existing UpdateSnapshotSummary instance.
     *
     * @param updateSnapshotSummary the instance to initialize the Builder with
     */
    private Builder(UpdateSnapshotSummary updateSnapshotSummary) {
      this.description = updateSnapshotSummary.description;
      this.name = updateSnapshotSummary.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateSnapshotSummary.
     *
     * @return the new UpdateSnapshotSummary instance
     */
    public UpdateSnapshotSummary build() {
      return new UpdateSnapshotSummary(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateSnapshotSummary builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateSnapshotSummary builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected UpdateSnapshotSummary() { }

  protected UpdateSnapshotSummary(Builder builder) {
    description = builder.description;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a UpdateSnapshotSummary builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * Additional detail about snapshot.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the name.
   *
   * Snapshot Name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

