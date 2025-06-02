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
 * The getEntityConfidenceMetrics options.
 */
public class GetEntityConfidenceMetricsOptions extends GenericModel {

  protected String entityType;
  protected Boolean updateDqDashboard;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private Boolean updateDqDashboard;

    /**
     * Instantiates a new Builder from an existing GetEntityConfidenceMetricsOptions instance.
     *
     * @param getEntityConfidenceMetricsOptions the instance to initialize the Builder with
     */
    private Builder(GetEntityConfidenceMetricsOptions getEntityConfidenceMetricsOptions) {
      this.entityType = getEntityConfidenceMetricsOptions.entityType;
      this.updateDqDashboard = getEntityConfidenceMetricsOptions.updateDqDashboard;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityType the entityType
     */
    public Builder(String entityType) {
      this.entityType = entityType;
    }

    /**
     * Builds a GetEntityConfidenceMetricsOptions.
     *
     * @return the new GetEntityConfidenceMetricsOptions instance
     */
    public GetEntityConfidenceMetricsOptions build() {
      return new GetEntityConfidenceMetricsOptions(this);
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the GetEntityConfidenceMetricsOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the updateDqDashboard.
     *
     * @param updateDqDashboard the updateDqDashboard
     * @return the GetEntityConfidenceMetricsOptions builder
     */
    public Builder updateDqDashboard(Boolean updateDqDashboard) {
      this.updateDqDashboard = updateDqDashboard;
      return this;
    }
  }

  protected GetEntityConfidenceMetricsOptions() { }

  protected GetEntityConfidenceMetricsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    entityType = builder.entityType;
    updateDqDashboard = builder.updateDqDashboard;
  }

  /**
   * New builder.
   *
   * @return a GetEntityConfidenceMetricsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the updateDqDashboard.
   *
   * The API will report the entity confidence metrics to DQ dashboard when the parameter is true. Default is false.
   *
   * @return the updateDqDashboard
   */
  public Boolean updateDqDashboard() {
    return updateDqDashboard;
  }
}

