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
 * The deleteHierarchyBranch options.
 */
public class DeleteHierarchyBranchOptions extends GenericModel {

  protected Long id;
  protected Long branchNodeId;
  protected String hierarchyType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private Long branchNodeId;
    private String hierarchyType;

    /**
     * Instantiates a new Builder from an existing DeleteHierarchyBranchOptions instance.
     *
     * @param deleteHierarchyBranchOptions the instance to initialize the Builder with
     */
    private Builder(DeleteHierarchyBranchOptions deleteHierarchyBranchOptions) {
      this.id = deleteHierarchyBranchOptions.id;
      this.branchNodeId = deleteHierarchyBranchOptions.branchNodeId;
      this.hierarchyType = deleteHierarchyBranchOptions.hierarchyType;
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
     * @param branchNodeId the branchNodeId
     * @param hierarchyType the hierarchyType
     */
    public Builder(Long id, Long branchNodeId, String hierarchyType) {
      this.id = id;
      this.branchNodeId = branchNodeId;
      this.hierarchyType = hierarchyType;
    }

    /**
     * Builds a DeleteHierarchyBranchOptions.
     *
     * @return the new DeleteHierarchyBranchOptions instance
     */
    public DeleteHierarchyBranchOptions build() {
      return new DeleteHierarchyBranchOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteHierarchyBranchOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the branchNodeId.
     *
     * @param branchNodeId the branchNodeId
     * @return the DeleteHierarchyBranchOptions builder
     */
    public Builder branchNodeId(long branchNodeId) {
      this.branchNodeId = branchNodeId;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the DeleteHierarchyBranchOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }
  }

  protected DeleteHierarchyBranchOptions() { }

  protected DeleteHierarchyBranchOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.branchNodeId,
      "branchNodeId cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    id = builder.id;
    branchNodeId = builder.branchNodeId;
    hierarchyType = builder.hierarchyType;
  }

  /**
   * New builder.
   *
   * @return a DeleteHierarchyBranchOptions builder
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
   * Gets the branchNodeId.
   *
   * The branch node id for the hierarchy.
   *
   * @return the branchNodeId
   */
  public Long branchNodeId() {
    return branchNodeId;
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

