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
 * A filter for a searh.
 */
public class SearchFilterRequest extends GenericModel {

  /**
   * The filter type.
   */
  public interface Type {
    /** record. */
    String RECORD = "record";
    /** collection. */
    String COLLECTION = "collection";
    /** source. */
    String SOURCE = "source";
    /** tag. */
    String TAG = "tag";
  }

  protected String type;
  protected List<String> values;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> values;

    private Builder(SearchFilterRequest searchFilterRequest) {
      this.type = searchFilterRequest.type;
      this.values = searchFilterRequest.values;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SearchFilterRequest.
     *
     * @return the new SearchFilterRequest instance
     */
    public SearchFilterRequest build() {
      return new SearchFilterRequest(this);
    }

    /**
     * Adds an values to values.
     *
     * @param values the new values
     * @return the SearchFilterRequest builder
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
     * @return the SearchFilterRequest builder
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
     * @return the SearchFilterRequest builder
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }

  protected SearchFilterRequest(Builder builder) {
    type = builder.type;
    values = builder.values;
  }

  /**
   * New builder.
   *
   * @return a SearchFilterRequest builder
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

