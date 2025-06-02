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
 * The getHierarchyNodeCentricView options.
 */
public class GetHierarchyNodeCentricViewOptions extends GenericModel {

  protected Long id;
  protected String hierarchyType;
  protected String type;
  protected String typeName;
  protected String centricId;
  protected Long parentLevels;
  protected Long childrenLevels;
  protected String includedAssociations;
  protected Long offset;
  protected Long limit;
  protected Boolean includeTotalCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String hierarchyType;
    private String type;
    private String typeName;
    private String centricId;
    private Long parentLevels;
    private Long childrenLevels;
    private String includedAssociations;
    private Long offset;
    private Long limit;
    private Boolean includeTotalCount;

    /**
     * Instantiates a new Builder from an existing GetHierarchyNodeCentricViewOptions instance.
     *
     * @param getHierarchyNodeCentricViewOptions the instance to initialize the Builder with
     */
    private Builder(GetHierarchyNodeCentricViewOptions getHierarchyNodeCentricViewOptions) {
      this.id = getHierarchyNodeCentricViewOptions.id;
      this.hierarchyType = getHierarchyNodeCentricViewOptions.hierarchyType;
      this.type = getHierarchyNodeCentricViewOptions.type;
      this.typeName = getHierarchyNodeCentricViewOptions.typeName;
      this.centricId = getHierarchyNodeCentricViewOptions.centricId;
      this.parentLevels = getHierarchyNodeCentricViewOptions.parentLevels;
      this.childrenLevels = getHierarchyNodeCentricViewOptions.childrenLevels;
      this.includedAssociations = getHierarchyNodeCentricViewOptions.includedAssociations;
      this.offset = getHierarchyNodeCentricViewOptions.offset;
      this.limit = getHierarchyNodeCentricViewOptions.limit;
      this.includeTotalCount = getHierarchyNodeCentricViewOptions.includeTotalCount;
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
     * @param type the type
     * @param typeName the typeName
     * @param centricId the centricId
     */
    public Builder(Long id, String hierarchyType, String type, String typeName, String centricId) {
      this.id = id;
      this.hierarchyType = hierarchyType;
      this.type = type;
      this.typeName = typeName;
      this.centricId = centricId;
    }

    /**
     * Builds a GetHierarchyNodeCentricViewOptions.
     *
     * @return the new GetHierarchyNodeCentricViewOptions instance
     */
    public GetHierarchyNodeCentricViewOptions build() {
      return new GetHierarchyNodeCentricViewOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the centricId.
     *
     * @param centricId the centricId
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder centricId(String centricId) {
      this.centricId = centricId;
      return this;
    }

    /**
     * Set the parentLevels.
     *
     * @param parentLevels the parentLevels
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder parentLevels(long parentLevels) {
      this.parentLevels = parentLevels;
      return this;
    }

    /**
     * Set the childrenLevels.
     *
     * @param childrenLevels the childrenLevels
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder childrenLevels(long childrenLevels) {
      this.childrenLevels = childrenLevels;
      return this;
    }

    /**
     * Set the includedAssociations.
     *
     * @param includedAssociations the includedAssociations
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder includedAssociations(String includedAssociations) {
      this.includedAssociations = includedAssociations;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the includeTotalCount.
     *
     * @param includeTotalCount the includeTotalCount
     * @return the GetHierarchyNodeCentricViewOptions builder
     */
    public Builder includeTotalCount(Boolean includeTotalCount) {
      this.includeTotalCount = includeTotalCount;
      return this;
    }
  }

  protected GetHierarchyNodeCentricViewOptions() { }

  protected GetHierarchyNodeCentricViewOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.centricId,
      "centricId cannot be null");
    id = builder.id;
    hierarchyType = builder.hierarchyType;
    type = builder.type;
    typeName = builder.typeName;
    centricId = builder.centricId;
    parentLevels = builder.parentLevels;
    childrenLevels = builder.childrenLevels;
    includedAssociations = builder.includedAssociations;
    offset = builder.offset;
    limit = builder.limit;
    includeTotalCount = builder.includeTotalCount;
  }

  /**
   * New builder.
   *
   * @return a GetHierarchyNodeCentricViewOptions builder
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
   * Gets the type.
   *
   * type of the given node.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * type name of the given node.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the centricId.
   *
   * centric id of the given node.
   *
   * @return the centricId
   */
  public String centricId() {
    return centricId;
  }

  /**
   * Gets the parentLevels.
   *
   * The parent level of the given node.
   *
   * @return the parentLevels
   */
  public Long parentLevels() {
    return parentLevels;
  }

  /**
   * Gets the childrenLevels.
   *
   * The children level of the given node.
   *
   * @return the childrenLevels
   */
  public Long childrenLevels() {
    return childrenLevels;
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

  /**
   * Gets the includeTotalCount.
   *
   * Flag to include the total direct parents/children nodes count.
   *
   * @return the includeTotalCount
   */
  public Boolean includeTotalCount() {
    return includeTotalCount;
  }
}

