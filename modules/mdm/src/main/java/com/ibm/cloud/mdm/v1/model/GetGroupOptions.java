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
 * The getGroup options.
 */
public class GetGroupOptions extends GenericModel {

  protected Long id;
  protected String groupType;
  protected String includedAssociations;
  protected Long offset;
  protected Long limit;
  protected Boolean computeMemberCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String groupType;
    private String includedAssociations;
    private Long offset;
    private Long limit;
    private Boolean computeMemberCount;

    /**
     * Instantiates a new Builder from an existing GetGroupOptions instance.
     *
     * @param getGroupOptions the instance to initialize the Builder with
     */
    private Builder(GetGroupOptions getGroupOptions) {
      this.id = getGroupOptions.id;
      this.groupType = getGroupOptions.groupType;
      this.includedAssociations = getGroupOptions.includedAssociations;
      this.offset = getGroupOptions.offset;
      this.limit = getGroupOptions.limit;
      this.computeMemberCount = getGroupOptions.computeMemberCount;
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
     * @param groupType the groupType
     */
    public Builder(Long id, String groupType) {
      this.id = id;
      this.groupType = groupType;
    }

    /**
     * Builds a GetGroupOptions.
     *
     * @return the new GetGroupOptions instance
     */
    public GetGroupOptions build() {
      return new GetGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetGroupOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the groupType.
     *
     * @param groupType the groupType
     * @return the GetGroupOptions builder
     */
    public Builder groupType(String groupType) {
      this.groupType = groupType;
      return this;
    }

    /**
     * Set the includedAssociations.
     *
     * @param includedAssociations the includedAssociations
     * @return the GetGroupOptions builder
     */
    public Builder includedAssociations(String includedAssociations) {
      this.includedAssociations = includedAssociations;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetGroupOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetGroupOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the computeMemberCount.
     *
     * @param computeMemberCount the computeMemberCount
     * @return the GetGroupOptions builder
     */
    public Builder computeMemberCount(Boolean computeMemberCount) {
      this.computeMemberCount = computeMemberCount;
      return this;
    }
  }

  protected GetGroupOptions() { }

  protected GetGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.groupType,
      "groupType cannot be null");
    id = builder.id;
    groupType = builder.groupType;
    includedAssociations = builder.includedAssociations;
    offset = builder.offset;
    limit = builder.limit;
    computeMemberCount = builder.computeMemberCount;
  }

  /**
   * New builder.
   *
   * @return a GetGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Id of the group.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the groupType.
   *
   * type of the group.
   *
   * @return the groupType
   */
  public String groupType() {
    return groupType;
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
   * The number of group nodes to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of group nodes to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the computeMemberCount.
   *
   * Flag to include the member group count.
   *
   * @return the computeMemberCount
   */
  public Boolean computeMemberCount() {
    return computeMemberCount;
  }
}

