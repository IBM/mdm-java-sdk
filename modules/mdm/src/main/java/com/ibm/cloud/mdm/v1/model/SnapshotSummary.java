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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the summary of a snapshot.
 */
public class SnapshotSummary extends GenericModel {

  @SerializedName("created_time")
  protected String createdTime;
  protected String name;
  protected String description;
  protected String id;
  protected String user;

  /**
   * Builder.
   */
  public static class Builder {
    private String createdTime;
    private String name;
    private String description;
    private String id;
    private String user;

    /**
     * Instantiates a new Builder from an existing SnapshotSummary instance.
     *
     * @param snapshotSummary the instance to initialize the Builder with
     */
    private Builder(SnapshotSummary snapshotSummary) {
      this.createdTime = snapshotSummary.createdTime;
      this.name = snapshotSummary.name;
      this.description = snapshotSummary.description;
      this.id = snapshotSummary.id;
      this.user = snapshotSummary.user;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param createdTime the createdTime
     * @param name the name
     * @param description the description
     * @param id the id
     * @param user the user
     */
    public Builder(String createdTime, String name, String description, String id, String user) {
      this.createdTime = createdTime;
      this.name = name;
      this.description = description;
      this.id = id;
      this.user = user;
    }

    /**
     * Builds a SnapshotSummary.
     *
     * @return the new SnapshotSummary instance
     */
    public SnapshotSummary build() {
      return new SnapshotSummary(this);
    }

    /**
     * Set the createdTime.
     *
     * @param createdTime the createdTime
     * @return the SnapshotSummary builder
     */
    public Builder createdTime(String createdTime) {
      this.createdTime = createdTime;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotSummary builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SnapshotSummary builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SnapshotSummary builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the user.
     *
     * @param user the user
     * @return the SnapshotSummary builder
     */
    public Builder user(String user) {
      this.user = user;
      return this;
    }
  }

  protected SnapshotSummary() { }

  protected SnapshotSummary(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.createdTime,
      "createdTime cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.user,
      "user cannot be null");
    createdTime = builder.createdTime;
    name = builder.name;
    description = builder.description;
    id = builder.id;
    user = builder.user;
  }

  /**
   * New builder.
   *
   * @return a SnapshotSummary builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the createdTime.
   *
   * Timestamp when the snapshot was created.
   *
   * @return the createdTime
   */
  public String createdTime() {
    return createdTime;
  }

  /**
   * Gets the name.
   *
   * Name of the snapshot.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Gets the id.
   *
   * Snapshot identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the user.
   *
   * User who created the snapshot.
   *
   * @return the user
   */
  public String user() {
    return user;
  }
}

