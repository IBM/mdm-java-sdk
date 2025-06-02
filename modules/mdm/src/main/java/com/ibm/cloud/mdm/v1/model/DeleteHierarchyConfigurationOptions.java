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
 * The deleteHierarchyConfiguration options.
 */
public class DeleteHierarchyConfigurationOptions extends GenericModel {

  protected Long id;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;

    /**
     * Instantiates a new Builder from an existing DeleteHierarchyConfigurationOptions instance.
     *
     * @param deleteHierarchyConfigurationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteHierarchyConfigurationOptions deleteHierarchyConfigurationOptions) {
      this.id = deleteHierarchyConfigurationOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(Long id) {
      this.id = id;
    }

    /**
     * Builds a DeleteHierarchyConfigurationOptions.
     *
     * @return the new DeleteHierarchyConfigurationOptions instance
     */
    public DeleteHierarchyConfigurationOptions build() {
      return new DeleteHierarchyConfigurationOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteHierarchyConfigurationOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteHierarchyConfigurationOptions() { }

  protected DeleteHierarchyConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteHierarchyConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The id for the hierarchy.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }
}

