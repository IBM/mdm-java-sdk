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
 * The updateModelSnapshot options.
 */
public class UpdateModelSnapshotOptions extends GenericModel {

  protected String id;
  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing UpdateModelSnapshotOptions instance.
     *
     * @param updateModelSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(UpdateModelSnapshotOptions updateModelSnapshotOptions) {
      this.id = updateModelSnapshotOptions.id;
      this.name = updateModelSnapshotOptions.name;
      this.description = updateModelSnapshotOptions.description;
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
     * @param name the name
     * @param description the description
     */
    public Builder(String id, String name, String description) {
      this.id = id;
      this.name = name;
      this.description = description;
    }

    /**
     * Builds a UpdateModelSnapshotOptions.
     *
     * @return the new UpdateModelSnapshotOptions instance
     */
    public UpdateModelSnapshotOptions build() {
      return new UpdateModelSnapshotOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateModelSnapshotOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateModelSnapshotOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateModelSnapshotOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected UpdateModelSnapshotOptions() { }

  protected UpdateModelSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    id = builder.id;
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a UpdateModelSnapshotOptions builder
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
}

