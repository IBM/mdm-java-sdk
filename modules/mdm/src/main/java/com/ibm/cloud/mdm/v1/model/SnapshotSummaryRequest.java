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
 * Request wrapper object for post a snapshot of model assets.
 */
public class SnapshotSummaryRequest extends GenericModel {

  protected String description;
  protected String id;
  protected String name;
  protected String user;
  @SerializedName("created_time")
  protected String createdTime;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String id;
    private String name;
    private String user;
    private String createdTime;

    private Builder(SnapshotSummaryRequest snapshotSummaryRequest) {
      this.description = snapshotSummaryRequest.description;
      this.id = snapshotSummaryRequest.id;
      this.name = snapshotSummaryRequest.name;
      this.user = snapshotSummaryRequest.user;
      this.createdTime = snapshotSummaryRequest.createdTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SnapshotSummaryRequest.
     *
     * @return the new SnapshotSummaryRequest instance
     */
    public SnapshotSummaryRequest build() {
      return new SnapshotSummaryRequest(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SnapshotSummaryRequest builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SnapshotSummaryRequest builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotSummaryRequest builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the user.
     *
     * @param user the user
     * @return the SnapshotSummaryRequest builder
     */
    public Builder user(String user) {
      this.user = user;
      return this;
    }

    /**
     * Set the createdTime.
     *
     * @param createdTime the createdTime
     * @return the SnapshotSummaryRequest builder
     */
    public Builder createdTime(String createdTime) {
      this.createdTime = createdTime;
      return this;
    }
  }

  protected SnapshotSummaryRequest() { }

  protected SnapshotSummaryRequest(Builder builder) {
    description = builder.description;
    id = builder.id;
    name = builder.name;
    user = builder.user;
    createdTime = builder.createdTime;
  }

  /**
   * New builder.
   *
   * @return a SnapshotSummaryRequest builder
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
   * Gets the name.
   *
   * Snapshot Name.
   *
   * @return the name
   */
  public String name() {
    return name;
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

  /**
   * Gets the createdTime.
   *
   * Time in which the snapshot was created.
   *
   * @return the createdTime
   */
  public String createdTime() {
    return createdTime;
  }
}

