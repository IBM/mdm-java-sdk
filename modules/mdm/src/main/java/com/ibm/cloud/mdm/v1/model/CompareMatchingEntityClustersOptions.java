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
 * The compareMatchingEntityClusters options.
 */
public class CompareMatchingEntityClustersOptions extends GenericModel {

  protected String clusterId1;
  protected String clusterId2;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterId1;
    private String clusterId2;

    /**
     * Instantiates a new Builder from an existing CompareMatchingEntityClustersOptions instance.
     *
     * @param compareMatchingEntityClustersOptions the instance to initialize the Builder with
     */
    private Builder(CompareMatchingEntityClustersOptions compareMatchingEntityClustersOptions) {
      this.clusterId1 = compareMatchingEntityClustersOptions.clusterId1;
      this.clusterId2 = compareMatchingEntityClustersOptions.clusterId2;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterId1 the clusterId1
     * @param clusterId2 the clusterId2
     */
    public Builder(String clusterId1, String clusterId2) {
      this.clusterId1 = clusterId1;
      this.clusterId2 = clusterId2;
    }

    /**
     * Builds a CompareMatchingEntityClustersOptions.
     *
     * @return the new CompareMatchingEntityClustersOptions instance
     */
    public CompareMatchingEntityClustersOptions build() {
      return new CompareMatchingEntityClustersOptions(this);
    }

    /**
     * Set the clusterId1.
     *
     * @param clusterId1 the clusterId1
     * @return the CompareMatchingEntityClustersOptions builder
     */
    public Builder clusterId1(String clusterId1) {
      this.clusterId1 = clusterId1;
      return this;
    }

    /**
     * Set the clusterId2.
     *
     * @param clusterId2 the clusterId2
     * @return the CompareMatchingEntityClustersOptions builder
     */
    public Builder clusterId2(String clusterId2) {
      this.clusterId2 = clusterId2;
      return this;
    }
  }

  protected CompareMatchingEntityClustersOptions() { }

  protected CompareMatchingEntityClustersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterId1,
      "clusterId1 cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterId2,
      "clusterId2 cannot be null");
    clusterId1 = builder.clusterId1;
    clusterId2 = builder.clusterId2;
  }

  /**
   * New builder.
   *
   * @return a CompareMatchingEntityClustersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterId1.
   *
   * The cluster identifier of a cluster as assigned by the system.
   *
   * @return the clusterId1
   */
  public String clusterId1() {
    return clusterId1;
  }

  /**
   * Gets the clusterId2.
   *
   * The cluster identifier of a cluster as assigned by the system.
   *
   * @return the clusterId2
   */
  public String clusterId2() {
    return clusterId2;
  }
}

