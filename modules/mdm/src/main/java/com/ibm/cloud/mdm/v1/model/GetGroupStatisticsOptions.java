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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getGroupStatistics options.
 */
public class GetGroupStatisticsOptions extends GenericModel {

  protected List<String> groupTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> groupTypes;

    private Builder(GetGroupStatisticsOptions getGroupStatisticsOptions) {
      this.groupTypes = getGroupStatisticsOptions.groupTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetGroupStatisticsOptions.
     *
     * @return the new GetGroupStatisticsOptions instance
     */
    public GetGroupStatisticsOptions build() {
      return new GetGroupStatisticsOptions(this);
    }

    /**
     * Adds an groupTypes to groupTypes.
     *
     * @param groupTypes the new groupTypes
     * @return the GetGroupStatisticsOptions builder
     */
    public Builder addGroupTypes(String groupTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groupTypes,
        "groupTypes cannot be null");
      if (this.groupTypes == null) {
        this.groupTypes = new ArrayList<String>();
      }
      this.groupTypes.add(groupTypes);
      return this;
    }

    /**
     * Set the groupTypes.
     * Existing groupTypes will be replaced.
     *
     * @param groupTypes the groupTypes
     * @return the GetGroupStatisticsOptions builder
     */
    public Builder groupTypes(List<String> groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }
  }

  protected GetGroupStatisticsOptions() { }

  protected GetGroupStatisticsOptions(Builder builder) {
    groupTypes = builder.groupTypes;
  }

  /**
   * New builder.
   *
   * @return a GetGroupStatisticsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the groupTypes.
   *
   * Group types to include in the results.
   *
   * @return the groupTypes
   */
  public List<String> groupTypes() {
    return groupTypes;
  }
}

