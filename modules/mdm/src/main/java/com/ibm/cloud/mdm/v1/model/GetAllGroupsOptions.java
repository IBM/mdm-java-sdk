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
 * The getAllGroups options.
 */
public class GetAllGroupsOptions extends GenericModel {

  protected String id;
  protected String type;
  protected String typeName;
  protected Long offset;
  protected Long limit;
  protected Boolean includeTotalCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String type;
    private String typeName;
    private Long offset;
    private Long limit;
    private Boolean includeTotalCount;

    private Builder(GetAllGroupsOptions getAllGroupsOptions) {
      this.id = getAllGroupsOptions.id;
      this.type = getAllGroupsOptions.type;
      this.typeName = getAllGroupsOptions.typeName;
      this.offset = getAllGroupsOptions.offset;
      this.limit = getAllGroupsOptions.limit;
      this.includeTotalCount = getAllGroupsOptions.includeTotalCount;
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
     * @param type the type
     * @param typeName the typeName
     */
    public Builder(String id, String type, String typeName) {
      this.id = id;
      this.type = type;
      this.typeName = typeName;
    }

    /**
     * Builds a GetAllGroupsOptions.
     *
     * @return the new GetAllGroupsOptions instance
     */
    public GetAllGroupsOptions build() {
      return new GetAllGroupsOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetAllGroupsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the GetAllGroupsOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the GetAllGroupsOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetAllGroupsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetAllGroupsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the includeTotalCount.
     *
     * @param includeTotalCount the includeTotalCount
     * @return the GetAllGroupsOptions builder
     */
    public Builder includeTotalCount(Boolean includeTotalCount) {
      this.includeTotalCount = includeTotalCount;
      return this;
    }
  }

  protected GetAllGroupsOptions() { }

  protected GetAllGroupsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    id = builder.id;
    type = builder.type;
    typeName = builder.typeName;
    offset = builder.offset;
    limit = builder.limit;
    includeTotalCount = builder.includeTotalCount;
  }

  /**
   * New builder.
   *
   * @return a GetAllGroupsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * id of respective entity.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * type of the given id.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * type name of the given id.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the offset.
   *
   * The number of groups to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of groups to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the includeTotalCount.
   *
   * Flag to include the total group count.
   *
   * @return the includeTotalCount
   */
  public Boolean includeTotalCount() {
    return includeTotalCount;
  }
}

