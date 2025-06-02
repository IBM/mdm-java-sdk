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

import com.google.gson.annotations.SerializedName;
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
    /** entity. */
    String ENTITY = "entity";
    /** source. */
    String SOURCE = "source";
    /** relationship. */
    String RELATIONSHIP = "relationship";
    /** data_quality. */
    String DATA_QUALITY = "data_quality";
    /** hierarchy_type. */
    String HIERARCHY_TYPE = "hierarchy_type";
    /** hierarchy_number. */
    String HIERARCHY_NUMBER = "hierarchy_number";
  }

  public interface DataQualityIssues {
    /** potential_match. */
    String POTENTIAL_MATCH = "potential_match";
    /** potential_overlay. */
    String POTENTIAL_OVERLAY = "potential_overlay";
    /** user_tasks_only. */
    String USER_TASKS_ONLY = "user_tasks_only";
  }

  protected String type;
  protected List<String> values;
  @SerializedName("data_quality_issues")
  protected List<String> dataQualityIssues;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> values;
    private List<String> dataQualityIssues;

    /**
     * Instantiates a new Builder from an existing SearchFilter instance.
     *
     * @param searchFilter the instance to initialize the Builder with
     */
    private Builder(SearchFilter searchFilter) {
      this.type = searchFilter.type;
      this.values = searchFilter.values;
      this.dataQualityIssues = searchFilter.dataQualityIssues;
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
     */
    public Builder(String type) {
      this.type = type;
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
     * Adds a new element to values.
     *
     * @param values the new element to be added
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
     * Adds a new element to dataQualityIssues.
     *
     * @param dataQualityIssues the new element to be added
     * @return the SearchFilter builder
     */
    public Builder addDataQualityIssues(String dataQualityIssues) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(dataQualityIssues,
        "dataQualityIssues cannot be null");
      if (this.dataQualityIssues == null) {
        this.dataQualityIssues = new ArrayList<String>();
      }
      this.dataQualityIssues.add(dataQualityIssues);
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

    /**
     * Set the dataQualityIssues.
     * Existing dataQualityIssues will be replaced.
     *
     * @param dataQualityIssues the dataQualityIssues
     * @return the SearchFilter builder
     */
    public Builder dataQualityIssues(List<String> dataQualityIssues) {
      this.dataQualityIssues = dataQualityIssues;
      return this;
    }
  }

  protected SearchFilter() { }

  protected SearchFilter(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
    values = builder.values;
    dataQualityIssues = builder.dataQualityIssues;
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
   * The values to filter upon, either values or data_quality_issues is required.
   *
   * @return the values
   */
  public List<String> values() {
    return values;
  }

  /**
   * Gets the dataQualityIssues.
   *
   * The issues of data quality, either data_quality_issues or values is required.
   *
   * @return the dataQualityIssues
   */
  public List<String> dataQualityIssues() {
    return dataQualityIssues;
  }
}

