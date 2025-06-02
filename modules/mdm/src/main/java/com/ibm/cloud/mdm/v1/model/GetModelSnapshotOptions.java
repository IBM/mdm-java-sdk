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
 * The getModelSnapshot options.
 */
public class GetModelSnapshotOptions extends GenericModel {

  protected String id;
  protected Boolean currentAssets;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean currentAssets;

    /**
     * Instantiates a new Builder from an existing GetModelSnapshotOptions instance.
     *
     * @param getModelSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(GetModelSnapshotOptions getModelSnapshotOptions) {
      this.id = getModelSnapshotOptions.id;
      this.currentAssets = getModelSnapshotOptions.currentAssets;
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
     * Builds a GetModelSnapshotOptions.
     *
     * @return the new GetModelSnapshotOptions instance
     */
    public GetModelSnapshotOptions build() {
      return new GetModelSnapshotOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetModelSnapshotOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the currentAssets.
     *
     * @param currentAssets the currentAssets
     * @return the GetModelSnapshotOptions builder
     */
    public Builder currentAssets(Boolean currentAssets) {
      this.currentAssets = currentAssets;
      return this;
    }
  }

  protected GetModelSnapshotOptions() { }

  protected GetModelSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    currentAssets = builder.currentAssets;
  }

  /**
   * New builder.
   *
   * @return a GetModelSnapshotOptions builder
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
   * Gets the currentAssets.
   *
   * Response will return the current model assets disregard the snapshot id when set to true.
   *
   * @return the currentAssets
   */
  public Boolean currentAssets() {
    return currentAssets;
  }
}

