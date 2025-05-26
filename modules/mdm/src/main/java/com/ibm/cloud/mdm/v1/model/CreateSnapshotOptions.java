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
 * The createSnapshot options.
 */
public class CreateSnapshotOptions extends GenericModel {

  protected String description;
  protected String id;
  protected String name;
  protected String user;
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

    private Builder(CreateSnapshotOptions createSnapshotOptions) {
      this.description = createSnapshotOptions.description;
      this.id = createSnapshotOptions.id;
      this.name = createSnapshotOptions.name;
      this.user = createSnapshotOptions.user;
      this.createdTime = createSnapshotOptions.createdTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateSnapshotOptions.
     *
     * @return the new CreateSnapshotOptions instance
     */
    public CreateSnapshotOptions build() {
      return new CreateSnapshotOptions(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateSnapshotOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateSnapshotOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSnapshotOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the user.
     *
     * @param user the user
     * @return the CreateSnapshotOptions builder
     */
    public Builder user(String user) {
      this.user = user;
      return this;
    }

    /**
     * Set the createdTime.
     *
     * @param createdTime the createdTime
     * @return the CreateSnapshotOptions builder
     */
    public Builder createdTime(String createdTime) {
      this.createdTime = createdTime;
      return this;
    }

    /**
     * Set the snapshotSummaryRequest.
     *
     * @param snapshotSummaryRequest the snapshotSummaryRequest
     * @return the CreateSnapshotOptions builder
     */
    public Builder snapshotSummaryRequest(SnapshotSummaryRequest snapshotSummaryRequest) {
      this.description = snapshotSummaryRequest.description();
      this.id = snapshotSummaryRequest.id();
      this.name = snapshotSummaryRequest.name();
      this.user = snapshotSummaryRequest.user();
      this.createdTime = snapshotSummaryRequest.createdTime();
      return this;
    }
  }

  protected CreateSnapshotOptions() { }

  protected CreateSnapshotOptions(Builder builder) {
    description = builder.description;
    id = builder.id;
    name = builder.name;
    user = builder.user;
    createdTime = builder.createdTime;
  }

  /**
   * New builder.
   *
   * @return a CreateSnapshotOptions builder
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

