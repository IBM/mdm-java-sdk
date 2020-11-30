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
 * The dataGetEntity options.
 */
public class DataGetEntityOptions extends GenericModel {

  protected String id;
  protected List<String> include;
  protected List<String> exclude;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> include;
    private List<String> exclude;

    private Builder(DataGetEntityOptions dataGetEntityOptions) {
      this.id = dataGetEntityOptions.id;
      this.include = dataGetEntityOptions.include;
      this.exclude = dataGetEntityOptions.exclude;
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
     * Builds a DataGetEntityOptions.
     *
     * @return the new DataGetEntityOptions instance
     */
    public DataGetEntityOptions build() {
      return new DataGetEntityOptions(this);
    }

    /**
     * Adds an include to include.
     *
     * @param include the new include
     * @return the DataGetEntityOptions builder
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
     * @return the DataGetEntityOptions builder
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
     * @return the DataGetEntityOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the DataGetEntityOptions builder
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
     * @return the DataGetEntityOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }
  }

  protected DataGetEntityOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    include = builder.include;
    exclude = builder.exclude;
  }

  /**
   * New builder.
   *
   * @return a DataGetEntityOptions builder
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

