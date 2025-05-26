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
 * The getHierarchy options.
 */
public class GetHierarchyOptions extends GenericModel {

  protected Long id;
  protected String hierarchyType;
  protected Long fromLevel;
  protected Long toLevel;
  protected String includedAssociations;
  protected String orphanNodesOnly;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String hierarchyType;
    private Long fromLevel;
    private Long toLevel;
    private String includedAssociations;
    private String orphanNodesOnly;
    private Long offset;
    private Long limit;

    private Builder(GetHierarchyOptions getHierarchyOptions) {
      this.id = getHierarchyOptions.id;
      this.hierarchyType = getHierarchyOptions.hierarchyType;
      this.fromLevel = getHierarchyOptions.fromLevel;
      this.toLevel = getHierarchyOptions.toLevel;
      this.includedAssociations = getHierarchyOptions.includedAssociations;
      this.orphanNodesOnly = getHierarchyOptions.orphanNodesOnly;
      this.offset = getHierarchyOptions.offset;
      this.limit = getHierarchyOptions.limit;
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
     * Builds a GetHierarchyOptions.
     *
     * @return the new GetHierarchyOptions instance
     */
    public GetHierarchyOptions build() {
      return new GetHierarchyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetHierarchyOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the GetHierarchyOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }

    /**
     * Set the fromLevel.
     *
     * @param fromLevel the fromLevel
     * @return the GetHierarchyOptions builder
     */
    public Builder fromLevel(long fromLevel) {
      this.fromLevel = fromLevel;
      return this;
    }

    /**
     * Set the toLevel.
     *
     * @param toLevel the toLevel
     * @return the GetHierarchyOptions builder
     */
    public Builder toLevel(long toLevel) {
      this.toLevel = toLevel;
      return this;
    }

    /**
     * Set the includedAssociations.
     *
     * @param includedAssociations the includedAssociations
     * @return the GetHierarchyOptions builder
     */
    public Builder includedAssociations(String includedAssociations) {
      this.includedAssociations = includedAssociations;
      return this;
    }

    /**
     * Set the orphanNodesOnly.
     *
     * @param orphanNodesOnly the orphanNodesOnly
     * @return the GetHierarchyOptions builder
     */
    public Builder orphanNodesOnly(String orphanNodesOnly) {
      this.orphanNodesOnly = orphanNodesOnly;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetHierarchyOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetHierarchyOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected GetHierarchyOptions() { }

  protected GetHierarchyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    id = builder.id;
    hierarchyType = builder.hierarchyType;
    fromLevel = builder.fromLevel;
    toLevel = builder.toLevel;
    includedAssociations = builder.includedAssociations;
    orphanNodesOnly = builder.orphanNodesOnly;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a GetHierarchyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Id of the hierarchy.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the hierarchyType.
   *
   * type of the hierarchy.
   *
   * @return the hierarchyType
   */
  public String hierarchyType() {
    return hierarchyType;
  }

  /**
   * Gets the fromLevel.
   *
   * Specify the starting level from which you want to retrieve the hierarchy.
   *
   * @return the fromLevel
   */
  public Long fromLevel() {
    return fromLevel;
  }

  /**
   * Gets the toLevel.
   *
   * Specify the level up to which you want to retrieve the hierarchy.
   *
   * @return the toLevel
   */
  public Long toLevel() {
    return toLevel;
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
   * Gets the orphanNodesOnly.
   *
   * return hierarchy orphan nodes only.
   *
   * @return the orphanNodesOnly
   */
  public String orphanNodesOnly() {
    return orphanNodesOnly;
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

