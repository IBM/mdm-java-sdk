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
 * InstanceMetadataWorkflow.
 */
public class InstanceMetadataWorkflow extends GenericModel {

  protected List<InstanceMetadataConfiguration> configurations;

  /**
   * Builder.
   */
  public static class Builder {
    private List<InstanceMetadataConfiguration> configurations;

    /**
     * Instantiates a new Builder from an existing InstanceMetadataWorkflow instance.
     *
     * @param instanceMetadataWorkflow the instance to initialize the Builder with
     */
    private Builder(InstanceMetadataWorkflow instanceMetadataWorkflow) {
      this.configurations = instanceMetadataWorkflow.configurations;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadataWorkflow.
     *
     * @return the new InstanceMetadataWorkflow instance
     */
    public InstanceMetadataWorkflow build() {
      return new InstanceMetadataWorkflow(this);
    }

    /**
     * Adds a new element to configurations.
     *
     * @param configurations the new element to be added
     * @return the InstanceMetadataWorkflow builder
     */
    public Builder addConfigurations(InstanceMetadataConfiguration configurations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(configurations,
        "configurations cannot be null");
      if (this.configurations == null) {
        this.configurations = new ArrayList<InstanceMetadataConfiguration>();
      }
      this.configurations.add(configurations);
      return this;
    }

    /**
     * Set the configurations.
     * Existing configurations will be replaced.
     *
     * @param configurations the configurations
     * @return the InstanceMetadataWorkflow builder
     */
    public Builder configurations(List<InstanceMetadataConfiguration> configurations) {
      this.configurations = configurations;
      return this;
    }
  }

  protected InstanceMetadataWorkflow() { }

  protected InstanceMetadataWorkflow(Builder builder) {
    configurations = builder.configurations;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataWorkflow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the configurations.
   *
   * @return the configurations
   */
  public List<InstanceMetadataConfiguration> configurations() {
    return configurations;
  }
}

