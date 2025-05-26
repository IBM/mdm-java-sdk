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
 * The hierarchyBrokenBranches options.
 */
public class HierarchyBrokenBranchesOptions extends GenericModel {

  protected Long id;
  protected String hierarchyType;
  protected Long levels;
  protected String includedAssociations;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String hierarchyType;
    private Long levels;
    private String includedAssociations;
    private Long offset;
    private Long limit;

    private Builder(HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptions) {
      this.id = hierarchyBrokenBranchesOptions.id;
      this.hierarchyType = hierarchyBrokenBranchesOptions.hierarchyType;
      this.levels = hierarchyBrokenBranchesOptions.levels;
      this.includedAssociations = hierarchyBrokenBranchesOptions.includedAssociations;
      this.offset = hierarchyBrokenBranchesOptions.offset;
      this.limit = hierarchyBrokenBranchesOptions.limit;
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
     * Builds a HierarchyBrokenBranchesOptions.
     *
     * @return the new HierarchyBrokenBranchesOptions instance
     */
    public HierarchyBrokenBranchesOptions build() {
      return new HierarchyBrokenBranchesOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the HierarchyBrokenBranchesOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the HierarchyBrokenBranchesOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }

    /**
     * Set the levels.
     *
     * @param levels the levels
     * @return the HierarchyBrokenBranchesOptions builder
     */
    public Builder levels(long levels) {
      this.levels = levels;
      return this;
    }

    /**
     * Set the includedAssociations.
     *
     * @param includedAssociations the includedAssociations
     * @return the HierarchyBrokenBranchesOptions builder
     */
    public Builder includedAssociations(String includedAssociations) {
      this.includedAssociations = includedAssociations;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the HierarchyBrokenBranchesOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the HierarchyBrokenBranchesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected HierarchyBrokenBranchesOptions() { }

  protected HierarchyBrokenBranchesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    id = builder.id;
    hierarchyType = builder.hierarchyType;
    levels = builder.levels;
    includedAssociations = builder.includedAssociations;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a HierarchyBrokenBranchesOptions builder
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
   * Gets the levels.
   *
   * The levels of broken branches nodes to be included.
   *
   * @return the levels
   */
  public Long levels() {
    return levels;
  }

  /**
   * Gets the includedAssociations.
   *
   * The associated objects.
   *
   * @return the includedAssociations
   */
  public String includedAssociations() {
    return includedAssociations;
  }

  /**
   * Gets the offset.
   *
   * The number of hierarchy nodes to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of hierarchy nodes to be returned. The maximum limit is 200.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

