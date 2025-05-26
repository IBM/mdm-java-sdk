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
 * The hierarchyMemberSearch options.
 */
public class HierarchyMemberSearchOptions extends GenericModel {

  protected Long id;
  protected String hierarchyType;
  protected String searchQuery;
  protected Long offset;
  protected Long limit;
  protected List<String> include;
  protected List<String> exclude;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String hierarchyType;
    private String searchQuery;
    private Long offset;
    private Long limit;
    private List<String> include;
    private List<String> exclude;

    private Builder(HierarchyMemberSearchOptions hierarchyMemberSearchOptions) {
      this.id = hierarchyMemberSearchOptions.id;
      this.hierarchyType = hierarchyMemberSearchOptions.hierarchyType;
      this.searchQuery = hierarchyMemberSearchOptions.searchQuery;
      this.offset = hierarchyMemberSearchOptions.offset;
      this.limit = hierarchyMemberSearchOptions.limit;
      this.include = hierarchyMemberSearchOptions.include;
      this.exclude = hierarchyMemberSearchOptions.exclude;
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
     * @param searchQuery the searchQuery
     */
    public Builder(Long id, String hierarchyType, String searchQuery) {
      this.id = id;
      this.hierarchyType = hierarchyType;
      this.searchQuery = searchQuery;
    }

    /**
     * Builds a HierarchyMemberSearchOptions.
     *
     * @return the new HierarchyMemberSearchOptions instance
     */
    public HierarchyMemberSearchOptions build() {
      return new HierarchyMemberSearchOptions(this);
    }

    /**
     * Adds an include to include.
     *
     * @param include the new include
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder addInclude(String include) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(include,
        "include cannot be null");
      if (this.include == null) {
        this.include = new ArrayList<String>();
      }
      this.include.add(include);
      return this;
    }

    /**
     * Adds an exclude to exclude.
     *
     * @param exclude the new exclude
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder addExclude(String exclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(exclude,
        "exclude cannot be null");
      if (this.exclude == null) {
        this.exclude = new ArrayList<String>();
      }
      this.exclude.add(exclude);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the hierarchyType.
     *
     * @param hierarchyType the hierarchyType
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder hierarchyType(String hierarchyType) {
      this.hierarchyType = hierarchyType;
      return this;
    }

    /**
     * Set the searchQuery.
     *
     * @param searchQuery the searchQuery
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder searchQuery(String searchQuery) {
      this.searchQuery = searchQuery;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set the exclude.
     * Existing exclude will be replaced.
     *
     * @param exclude the exclude
     * @return the HierarchyMemberSearchOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }
  }

  protected HierarchyMemberSearchOptions() { }

  protected HierarchyMemberSearchOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hierarchyType,
      "hierarchyType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.searchQuery,
      "searchQuery cannot be null");
    id = builder.id;
    hierarchyType = builder.hierarchyType;
    searchQuery = builder.searchQuery;
    offset = builder.offset;
    limit = builder.limit;
    include = builder.include;
    exclude = builder.exclude;
  }

  /**
   * New builder.
   *
   * @return a HierarchyMemberSearchOptions builder
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
   * Gets the searchQuery.
   *
   * The search query for hierarchy member search.
   *
   * @return the searchQuery
   */
  public String searchQuery() {
    return searchQuery;
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
   * Gets the include.
   *
   * Associated Object from the data model to include in the results.
   *
   * @return the include
   */
  public List<String> include() {
    return include;
  }

  /**
   * Gets the exclude.
   *
   * Associated Object from the data model to exclude from the results.
   *
   * @return the exclude
   */
  public List<String> exclude() {
    return exclude;
  }
}

