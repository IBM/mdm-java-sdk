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
 * The listDataRecordsForEntity options.
 */
public class ListDataRecordsForEntityOptions extends GenericModel {

  protected String id;
  protected Long limit;
  protected Long offset;
  protected List<String> include;
  protected List<String> exclude;
  protected Boolean includeTotalCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Long limit;
    private Long offset;
    private List<String> include;
    private List<String> exclude;
    private Boolean includeTotalCount;

    /**
     * Instantiates a new Builder from an existing ListDataRecordsForEntityOptions instance.
     *
     * @param listDataRecordsForEntityOptions the instance to initialize the Builder with
     */
    private Builder(ListDataRecordsForEntityOptions listDataRecordsForEntityOptions) {
      this.id = listDataRecordsForEntityOptions.id;
      this.limit = listDataRecordsForEntityOptions.limit;
      this.offset = listDataRecordsForEntityOptions.offset;
      this.include = listDataRecordsForEntityOptions.include;
      this.exclude = listDataRecordsForEntityOptions.exclude;
      this.includeTotalCount = listDataRecordsForEntityOptions.includeTotalCount;
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
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ListDataRecordsForEntityOptions.
     *
     * @return the new ListDataRecordsForEntityOptions instance
     */
    public ListDataRecordsForEntityOptions build() {
      return new ListDataRecordsForEntityOptions(this);
    }

    /**
     * Adds a new element to include.
     *
     * @param include the new element to be added
     * @return the ListDataRecordsForEntityOptions builder
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
     * Adds a new element to exclude.
     *
     * @param exclude the new element to be added
     * @return the ListDataRecordsForEntityOptions builder
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
     * @return the ListDataRecordsForEntityOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataRecordsForEntityOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDataRecordsForEntityOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the ListDataRecordsForEntityOptions builder
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
     * @return the ListDataRecordsForEntityOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }

    /**
     * Set the includeTotalCount.
     *
     * @param includeTotalCount the includeTotalCount
     * @return the ListDataRecordsForEntityOptions builder
     */
    public Builder includeTotalCount(Boolean includeTotalCount) {
      this.includeTotalCount = includeTotalCount;
      return this;
    }
  }

  protected ListDataRecordsForEntityOptions() { }

  protected ListDataRecordsForEntityOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    limit = builder.limit;
    offset = builder.offset;
    include = builder.include;
    exclude = builder.exclude;
    includeTotalCount = builder.includeTotalCount;
  }

  /**
   * New builder.
   *
   * @return a ListDataRecordsForEntityOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The unique identifier of the entity.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of records to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of records to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the include.
   *
   * Record attributes from the data model to include in the results.
   *
   * @return the include
   */
  public List<String> include() {
    return include;
  }

  /**
   * Gets the exclude.
   *
   * Record attributes from the data model to exclude from the results.
   *
   * @return the exclude
   */
  public List<String> exclude() {
    return exclude;
  }

  /**
   * Gets the includeTotalCount.
   *
   * Flag to include the total record count on pages other than the first.
   *
   * @return the includeTotalCount
   */
  public Boolean includeTotalCount() {
    return includeTotalCount;
  }
}

