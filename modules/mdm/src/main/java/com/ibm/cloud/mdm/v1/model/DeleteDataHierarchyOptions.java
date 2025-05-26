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
 * The deleteDataHierarchy options.
 */
public class DeleteDataHierarchyOptions extends GenericModel {

  protected Long id;
  protected String hierarchyType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String hierarchyType;

    private Builder(DeleteDataHierarchyOptions deleteDataHierarchyOptions) {
      this.id = deleteDataHierarchyOptions.id;
      this.hierarchyType = deleteDataHierarchyOptions.hierarchyType;
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
     * @param hierarchyType the hierarchyType
     */
    public Builder(Long id, String hierarchyType) {
      this.id = id;
      this.hierarchyType = hierarchyType;
    }

    /**
     * Builds a DeleteDataHierarchyOptions.
     *
     * @return the new DeleteDataHierarchyOptions instance
     */
    public DeleteDataHierarchyOptions build() {
      return new DeleteDataHierarchyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteDataHierarchyOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the DeleteDataHierarchyOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }
  }

  protected DeleteDataHierarchyOptions() { }

  protected DeleteDataHierarchyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    id = builder.id;
    hierarchyType = builder.hierarchyType;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataHierarchyOptions builder
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

  /**
   * Gets the hierarchyType.
   *
   * The type of the hierarchy.
   *
   * @return the hierarchyType
   */
  public String hierarchyType() {
    return hierarchyType;
  }
}

