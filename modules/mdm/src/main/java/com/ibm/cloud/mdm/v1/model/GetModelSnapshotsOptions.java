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
 * The getModelSnapshots options.
 */
public class GetModelSnapshotsOptions extends GenericModel {

  protected Long limit;
  protected Long offset;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private Long offset;

    /**
     * Instantiates a new Builder from an existing GetModelSnapshotsOptions instance.
     *
     * @param getModelSnapshotsOptions the instance to initialize the Builder with
     */
    private Builder(GetModelSnapshotsOptions getModelSnapshotsOptions) {
      this.limit = getModelSnapshotsOptions.limit;
      this.offset = getModelSnapshotsOptions.offset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetModelSnapshotsOptions.
     *
     * @return the new GetModelSnapshotsOptions instance
     */
    public GetModelSnapshotsOptions build() {
      return new GetModelSnapshotsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetModelSnapshotsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetModelSnapshotsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }
  }

  protected GetModelSnapshotsOptions() { }

  protected GetModelSnapshotsOptions(Builder builder) {
    limit = builder.limit;
    offset = builder.offset;
  }

  /**
   * New builder.
   *
   * @return a GetModelSnapshotsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * The maximum number of elements to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of elements to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }
}

