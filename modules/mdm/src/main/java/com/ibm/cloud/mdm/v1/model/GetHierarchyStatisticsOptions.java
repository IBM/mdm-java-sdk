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
 * The getHierarchyStatistics options.
 */
public class GetHierarchyStatisticsOptions extends GenericModel {

  protected String hierarchyType;
  protected String metrics;
  protected Long id;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String hierarchyType;
    private String metrics;
    private Long id;
    private Long offset;
    private Long limit;

    private Builder(GetHierarchyStatisticsOptions getHierarchyStatisticsOptions) {
      this.hierarchyType = getHierarchyStatisticsOptions.hierarchyType;
      this.metrics = getHierarchyStatisticsOptions.metrics;
      this.id = getHierarchyStatisticsOptions.id;
      this.offset = getHierarchyStatisticsOptions.offset;
      this.limit = getHierarchyStatisticsOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param hierarchyType the hierarchyType
     * @param metrics the metrics
     */
    public Builder(String hierarchyType, String metrics) {
      this.hierarchyType = hierarchyType;
      this.metrics = metrics;
    }

    /**
     * Builds a GetHierarchyStatisticsOptions.
     *
     * @return the new GetHierarchyStatisticsOptions instance
     */
    public GetHierarchyStatisticsOptions build() {
      return new GetHierarchyStatisticsOptions(this);
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the GetHierarchyStatisticsOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }

    /**
     * Set the metrics.
     *
     * @param metrics the metrics
     * @return the GetHierarchyStatisticsOptions builder
     */
    public Builder metrics(String metrics) {
      this.metrics = metrics;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetHierarchyStatisticsOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetHierarchyStatisticsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetHierarchyStatisticsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetHierarchyStatisticsOptions() { }

  protected GetHierarchyStatisticsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metrics,
      "metrics cannot be null");
    hierarchyType = builder.hierarchyType;
    metrics = builder.metrics;
    id = builder.id;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetHierarchyStatisticsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyType.
   *
   * The type name of the hierarchy.
   *
   * @return the hierarchyType
   */
  public String hierarchyType() {
    return hierarchyType;
  }

  /**
   * Gets the metrics.
   *
   * Comma-separated metrics of established_hierarchies, instance_member_count,instance_statistics_all.
   *
   * @return the metrics
   */
  public String metrics() {
    return metrics;
  }

  /**
   * Gets the id.
   *
   * The instance id of the hierarchy.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the offset.
   *
   * The number of hierarchies to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of hierarchies to be returned. The maximum limit is 200.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

