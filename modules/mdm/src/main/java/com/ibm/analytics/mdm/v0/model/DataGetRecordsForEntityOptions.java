/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataGetRecordsForEntity options.
 */
public class DataGetRecordsForEntityOptions extends GenericModel {

  protected String id;
  protected Long limit;
  protected Long offset;
  protected List<String> include;
  protected List<String> exclude;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Long limit;
    private Long offset;
    private List<String> include;
    private List<String> exclude;

    private Builder(DataGetRecordsForEntityOptions dataGetRecordsForEntityOptions) {
      this.id = dataGetRecordsForEntityOptions.id;
      this.limit = dataGetRecordsForEntityOptions.limit;
      this.offset = dataGetRecordsForEntityOptions.offset;
      this.include = dataGetRecordsForEntityOptions.include;
      this.exclude = dataGetRecordsForEntityOptions.exclude;
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
     * Builds a DataGetRecordsForEntityOptions.
     *
     * @return the new DataGetRecordsForEntityOptions instance
     */
    public DataGetRecordsForEntityOptions build() {
      return new DataGetRecordsForEntityOptions(this);
    }

    /**
     * Adds an include to include.
     *
     * @param include the new include
     * @return the DataGetRecordsForEntityOptions builder
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
     * @return the DataGetRecordsForEntityOptions builder
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
     * @return the DataGetRecordsForEntityOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the DataGetRecordsForEntityOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the DataGetRecordsForEntityOptions builder
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
     * @return the DataGetRecordsForEntityOptions builder
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
     * @return the DataGetRecordsForEntityOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }
  }

  protected DataGetRecordsForEntityOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    limit = builder.limit;
    offset = builder.offset;
    include = builder.include;
    exclude = builder.exclude;
  }

  /**
   * New builder.
   *
   * @return a DataGetRecordsForEntityOptions builder
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
}

