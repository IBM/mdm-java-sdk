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
 * The getMatchingClusterDetails options.
 */
public class GetMatchingClusterDetailsOptions extends GenericModel {

  protected String clusterId;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterId;

    private Builder(GetMatchingClusterDetailsOptions getMatchingClusterDetailsOptions) {
      this.clusterId = getMatchingClusterDetailsOptions.clusterId;
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
     * Builds a GetMatchingClusterDetailsOptions.
     *
     * @return the new GetMatchingClusterDetailsOptions instance
     */
    public GetMatchingClusterDetailsOptions build() {
      return new GetMatchingClusterDetailsOptions(this);
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the GetMatchingClusterDetailsOptions builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }
  }

  protected GetMatchingClusterDetailsOptions() { }

  protected GetMatchingClusterDetailsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterId,
      "clusterId cannot be empty");
    clusterId = builder.clusterId;
  }

  /**
   * New builder.
   *
   * @return a GetMatchingClusterDetailsOptions builder
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
}

