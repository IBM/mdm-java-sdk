/*
 * (C) Copyright IBM Corp. 2022.
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
 * A filter to apply to a search.
 */
public class SearchFilter extends GenericModel {

  /**
   * The filter type.
   */
  public interface Type {
    /** record. */
    String RECORD = "record";
    /** source. */
    String SOURCE = "source";
  }

  protected String type;
  protected List<String> values;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> values;

    private Builder(SearchFilter searchFilter) {
      this.type = searchFilter.type;
      this.values = searchFilter.values;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param values the values
     */
    public Builder(String type, List<String> values) {
      this.type = type;
      this.values = values;
    }

    /**
     * Builds a SearchFilter.
     *
     * @return the new SearchFilter instance
     */
    public SearchFilter build() {
      return new SearchFilter(this);
    }

    /**
     * Adds an values to values.
     *
     * @param values the new values
     * @return the SearchFilter builder
     */
    public Builder addValues(String values) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(values,
        "values cannot be null");
      if (this.values == null) {
        this.values = new ArrayList<String>();
      }
      this.values.add(values);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SearchFilter builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the values.
     * Existing values will be replaced.
     *
     * @param values the values
     * @return the SearchFilter builder
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }

  protected SearchFilter(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.values,
      "values cannot be null");
    type = builder.type;
    values = builder.values;
  }

  /**
   * New builder.
   *
   * @return a SearchFilter builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The filter type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the values.
   *
   * The values to filter upon.
   *
   * @return the values
   */
  public List<String> values() {
    return values;
  }
}

