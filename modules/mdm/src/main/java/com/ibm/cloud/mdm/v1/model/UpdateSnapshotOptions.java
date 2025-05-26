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
 * The updateSnapshot options.
 */
public class UpdateSnapshotOptions extends GenericModel {

  protected String id;
  protected String description;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String description;
    private String name;

    private Builder(UpdateSnapshotOptions updateSnapshotOptions) {
      this.id = updateSnapshotOptions.id;
      this.description = updateSnapshotOptions.description;
      this.name = updateSnapshotOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateSnapshotOptions.
     *
     * @return the new UpdateSnapshotOptions instance
     */
    public UpdateSnapshotOptions build() {
      return new UpdateSnapshotOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSnapshotOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateSnapshotOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateSnapshotOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the updateSnapshotSummary.
     *
     * @param updateSnapshotSummary the updateSnapshotSummary
     * @return the UpdateSnapshotOptions builder
     */
    public Builder updateSnapshotSummary(UpdateSnapshotSummary updateSnapshotSummary) {
      this.description = updateSnapshotSummary.description();
      this.name = updateSnapshotSummary.name();
      return this;
    }
  }

  protected UpdateSnapshotOptions() { }

  protected UpdateSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    description = builder.description;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a UpdateSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The unique identifier of a snapshot.
   *
   * @return the id
   */
  public String id() {
    return id;
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

