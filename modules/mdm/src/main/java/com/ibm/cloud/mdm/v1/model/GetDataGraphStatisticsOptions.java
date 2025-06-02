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
 * The getDataGraphStatistics options.
 */
public class GetDataGraphStatisticsOptions extends GenericModel {

  protected String includeSourceStatistics;
  protected String approximateStatistics;

  /**
   * Builder.
   */
  public static class Builder {
    private String includeSourceStatistics;
    private String approximateStatistics;

    /**
     * Instantiates a new Builder from an existing GetDataGraphStatisticsOptions instance.
     *
     * @param getDataGraphStatisticsOptions the instance to initialize the Builder with
     */
    private Builder(GetDataGraphStatisticsOptions getDataGraphStatisticsOptions) {
      this.includeSourceStatistics = getDataGraphStatisticsOptions.includeSourceStatistics;
      this.approximateStatistics = getDataGraphStatisticsOptions.approximateStatistics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetDataGraphStatisticsOptions.
     *
     * @return the new GetDataGraphStatisticsOptions instance
     */
    public GetDataGraphStatisticsOptions build() {
      return new GetDataGraphStatisticsOptions(this);
    }

    /**
     * Set the includeSourceStatistics.
     *
     * @param includeSourceStatistics the includeSourceStatistics
     * @return the GetDataGraphStatisticsOptions builder
     */
    public Builder includeSourceStatistics(String includeSourceStatistics) {
      this.includeSourceStatistics = includeSourceStatistics;
      return this;
    }

    /**
     * Set the approximateStatistics.
     *
     * @param approximateStatistics the approximateStatistics
     * @return the GetDataGraphStatisticsOptions builder
     */
    public Builder approximateStatistics(String approximateStatistics) {
      this.approximateStatistics = approximateStatistics;
      return this;
    }
  }

  protected GetDataGraphStatisticsOptions() { }

  protected GetDataGraphStatisticsOptions(Builder builder) {
    includeSourceStatistics = builder.includeSourceStatistics;
    approximateStatistics = builder.approximateStatistics;
  }

  /**
   * New builder.
   *
   * @return a GetDataGraphStatisticsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the includeSourceStatistics.
   *
   * Include source statistics.
   *
   * @return the includeSourceStatistics
   */
  public String includeSourceStatistics() {
    return includeSourceStatistics;
  }

  /**
   * Gets the approximateStatistics.
   *
   * Show approximate entity statistics.
   *
   * @return the approximateStatistics
   */
  public String approximateStatistics() {
    return approximateStatistics;
  }
}

