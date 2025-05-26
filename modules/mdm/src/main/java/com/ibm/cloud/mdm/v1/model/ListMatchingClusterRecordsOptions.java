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
 * The listMatchingClusterRecords options.
 */
public class ListMatchingClusterRecordsOptions extends GenericModel {

  protected String clusterId;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterId;
    private Long offset;
    private Long limit;

    private Builder(ListMatchingClusterRecordsOptions listMatchingClusterRecordsOptions) {
      this.clusterId = listMatchingClusterRecordsOptions.clusterId;
      this.offset = listMatchingClusterRecordsOptions.offset;
      this.limit = listMatchingClusterRecordsOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterId the clusterId
     */
    public Builder(String clusterId) {
      this.clusterId = clusterId;
    }

    /**
     * Builds a ListMatchingClusterRecordsOptions.
     *
     * @return the new ListMatchingClusterRecordsOptions instance
     */
    public ListMatchingClusterRecordsOptions build() {
      return new ListMatchingClusterRecordsOptions(this);
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the ListMatchingClusterRecordsOptions builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListMatchingClusterRecordsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListMatchingClusterRecordsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListMatchingClusterRecordsOptions() { }

  protected ListMatchingClusterRecordsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterId,
      "clusterId cannot be empty");
    clusterId = builder.clusterId;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListMatchingClusterRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterId.
   *
   * The cluster identifier of a cluster as assigned by the system.
   *
   * @return the clusterId
   */
  public String clusterId() {
    return clusterId;
  }

  /**
   * Gets the offset.
   *
   * The number of entries to skip before returning a page of results. The default offset is 0.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum expected number of entries in each page of results. The default limit is 10.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

