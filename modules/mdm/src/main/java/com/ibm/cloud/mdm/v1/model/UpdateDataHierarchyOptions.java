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
 * The updateDataHierarchy options.
 */
public class UpdateDataHierarchyOptions extends GenericModel {

  protected Long id;
  protected String hierarchyType;
  protected PatchHierarchyUpserts upserts;
  protected PatchHierarchyDeletions deletions;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String hierarchyType;
    private PatchHierarchyUpserts upserts;
    private PatchHierarchyDeletions deletions;

    private Builder(UpdateDataHierarchyOptions updateDataHierarchyOptions) {
      this.id = updateDataHierarchyOptions.id;
      this.hierarchyType = updateDataHierarchyOptions.hierarchyType;
      this.upserts = updateDataHierarchyOptions.upserts;
      this.deletions = updateDataHierarchyOptions.deletions;
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
     * Builds a UpdateDataHierarchyOptions.
     *
     * @return the new UpdateDataHierarchyOptions instance
     */
    public UpdateDataHierarchyOptions build() {
      return new UpdateDataHierarchyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateDataHierarchyOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the UpdateDataHierarchyOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }

    /**
     * Set the upserts.
     *
     * @param upserts the upserts
     * @return the UpdateDataHierarchyOptions builder
     */
    public Builder upserts(PatchHierarchyUpserts upserts) {
      this.upserts = upserts;
      return this;
    }

    /**
     * Set the deletions.
     *
     * @param deletions the deletions
     * @return the UpdateDataHierarchyOptions builder
     */
    public Builder deletions(PatchHierarchyDeletions deletions) {
      this.deletions = deletions;
      return this;
    }

    /**
     * Set the patchHierarchy.
     *
     * @param patchHierarchy the patchHierarchy
     * @return the UpdateDataHierarchyOptions builder
     */
    public Builder patchHierarchy(PatchHierarchy patchHierarchy) {
      this.upserts = patchHierarchy.upserts();
      this.deletions = patchHierarchy.deletions();
      return this;
    }
  }

  protected UpdateDataHierarchyOptions() { }

  protected UpdateDataHierarchyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    id = builder.id;
    hierarchyType = builder.hierarchyType;
    upserts = builder.upserts;
    deletions = builder.deletions;
  }

  /**
   * New builder.
   *
   * @return a UpdateDataHierarchyOptions builder
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

  /**
   * Gets the upserts.
   *
   * A Hierarchy and collection of hierarchy nodes to create or update.
   *
   * @return the upserts
   */
  public PatchHierarchyUpserts upserts() {
    return upserts;
  }

  /**
   * Gets the deletions.
   *
   * A collection of hierarchy nodes and relationships to delete.
   *
   * @return the deletions
   */
  public PatchHierarchyDeletions deletions() {
    return deletions;
  }
}

