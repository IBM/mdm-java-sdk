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
 * The listMatchingEntityClusters options.
 */
public class ListMatchingEntityClustersOptions extends GenericModel {

  protected String entityId;
  protected Long offset;
  protected Long limit;
  protected Boolean anomalousOnly;
  protected Boolean fetchTotalCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityId;
    private Long offset;
    private Long limit;
    private Boolean anomalousOnly;
    private Boolean fetchTotalCount;

    /**
     * Instantiates a new Builder from an existing ListMatchingEntityClustersOptions instance.
     *
     * @param listMatchingEntityClustersOptions the instance to initialize the Builder with
     */
    private Builder(ListMatchingEntityClustersOptions listMatchingEntityClustersOptions) {
      this.entityId = listMatchingEntityClustersOptions.entityId;
      this.offset = listMatchingEntityClustersOptions.offset;
      this.limit = listMatchingEntityClustersOptions.limit;
      this.anomalousOnly = listMatchingEntityClustersOptions.anomalousOnly;
      this.fetchTotalCount = listMatchingEntityClustersOptions.fetchTotalCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityId the entityId
     */
    public Builder(String entityId) {
      this.entityId = entityId;
    }

    /**
     * Builds a ListMatchingEntityClustersOptions.
     *
     * @return the new ListMatchingEntityClustersOptions instance
     */
    public ListMatchingEntityClustersOptions build() {
      return new ListMatchingEntityClustersOptions(this);
    }

    /**
     * Set the entityId.
     *
     * @param entityId the entityId
     * @return the ListMatchingEntityClustersOptions builder
     */
    public Builder entityId(String entityId) {
      this.entityId = entityId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListMatchingEntityClustersOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListMatchingEntityClustersOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the anomalousOnly.
     *
     * @param anomalousOnly the anomalousOnly
     * @return the ListMatchingEntityClustersOptions builder
     */
    public Builder anomalousOnly(Boolean anomalousOnly) {
      this.anomalousOnly = anomalousOnly;
      return this;
    }

    /**
     * Set the fetchTotalCount.
     *
     * @param fetchTotalCount the fetchTotalCount
     * @return the ListMatchingEntityClustersOptions builder
     */
    public Builder fetchTotalCount(Boolean fetchTotalCount) {
      this.fetchTotalCount = fetchTotalCount;
      return this;
    }
  }

  protected ListMatchingEntityClustersOptions() { }

  protected ListMatchingEntityClustersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.entityId,
      "entityId cannot be empty");
    entityId = builder.entityId;
    offset = builder.offset;
    limit = builder.limit;
    anomalousOnly = builder.anomalousOnly;
    fetchTotalCount = builder.fetchTotalCount;
  }

  /**
   * New builder.
   *
   * @return a ListMatchingEntityClustersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityId.
   *
   * The entity identifier of an entity as assigned by the system.
   *
   * @return the entityId
   */
  public String entityId() {
    return entityId;
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

  /**
   * Gets the anomalousOnly.
   *
   * The response would contain only anomalous clusters when it is set to true. Default is false.
   *
   * @return the anomalousOnly
   */
  public Boolean anomalousOnly() {
    return anomalousOnly;
  }

  /**
   * Gets the fetchTotalCount.
   *
   * The response would return total_count as the number of persisted clusters when set to true, otherwise the size of
   * the response. Default is true.
   *
   * @return the fetchTotalCount
   */
  public Boolean fetchTotalCount() {
    return fetchTotalCount;
  }
}

