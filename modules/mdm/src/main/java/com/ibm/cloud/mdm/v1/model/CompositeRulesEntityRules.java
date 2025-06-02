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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of composite rules per entity type.
 */
public class CompositeRulesEntityRules extends GenericModel {

  @SerializedName("attribute_rules")
  protected Map<String, CompositeRulesRule> attributeRules;
  protected List<String> sources;
  @SerializedName("sort_by")
  protected List<CompositeRulesSubRuleType> sortBy;
  protected List<CompositeRulesSubRuleType> filters;
  protected List<String> choices;
  @SerializedName("single_values")
  protected Boolean singleValues;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, CompositeRulesRule> attributeRules;
    private List<String> sources;
    private List<CompositeRulesSubRuleType> sortBy;
    private List<CompositeRulesSubRuleType> filters;
    private List<String> choices;
    private Boolean singleValues;

    /**
     * Instantiates a new Builder from an existing CompositeRulesEntityRules instance.
     *
     * @param compositeRulesEntityRules the instance to initialize the Builder with
     */
    private Builder(CompositeRulesEntityRules compositeRulesEntityRules) {
      this.attributeRules = compositeRulesEntityRules.attributeRules;
      this.sources = compositeRulesEntityRules.sources;
      this.sortBy = compositeRulesEntityRules.sortBy;
      this.filters = compositeRulesEntityRules.filters;
      this.choices = compositeRulesEntityRules.choices;
      this.singleValues = compositeRulesEntityRules.singleValues;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompositeRulesEntityRules.
     *
     * @return the new CompositeRulesEntityRules instance
     */
    public CompositeRulesEntityRules build() {
      return new CompositeRulesEntityRules(this);
    }

    /**
     * Adds a new element to sources.
     *
     * @param sources the new element to be added
     * @return the CompositeRulesEntityRules builder
     */
    public Builder addSources(String sources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sources,
        "sources cannot be null");
      if (this.sources == null) {
        this.sources = new ArrayList<String>();
      }
      this.sources.add(sources);
      return this;
    }

    /**
     * Adds a new element to sortBy.
     *
     * @param sortBy the new element to be added
     * @return the CompositeRulesEntityRules builder
     */
    public Builder addSortBy(CompositeRulesSubRuleType sortBy) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sortBy,
        "sortBy cannot be null");
      if (this.sortBy == null) {
        this.sortBy = new ArrayList<CompositeRulesSubRuleType>();
      }
      this.sortBy.add(sortBy);
      return this;
    }

    /**
     * Adds a new element to filters.
     *
     * @param filters the new element to be added
     * @return the CompositeRulesEntityRules builder
     */
    public Builder addFilters(CompositeRulesSubRuleType filters) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filters,
        "filters cannot be null");
      if (this.filters == null) {
        this.filters = new ArrayList<CompositeRulesSubRuleType>();
      }
      this.filters.add(filters);
      return this;
    }

    /**
     * Adds a new element to choices.
     *
     * @param choices the new element to be added
     * @return the CompositeRulesEntityRules builder
     */
    public Builder addChoices(String choices) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(choices,
        "choices cannot be null");
      if (this.choices == null) {
        this.choices = new ArrayList<String>();
      }
      this.choices.add(choices);
      return this;
    }

    /**
     * Set the attributeRules.
     *
     * @param attributeRules the attributeRules
     * @return the CompositeRulesEntityRules builder
     */
    public Builder attributeRules(Map<String, CompositeRulesRule> attributeRules) {
      this.attributeRules = attributeRules;
      return this;
    }

    /**
     * Set the sources.
     * Existing sources will be replaced.
     *
     * @param sources the sources
     * @return the CompositeRulesEntityRules builder
     */
    public Builder sources(List<String> sources) {
      this.sources = sources;
      return this;
    }

    /**
     * Set the sortBy.
     * Existing sortBy will be replaced.
     *
     * @param sortBy the sortBy
     * @return the CompositeRulesEntityRules builder
     */
    public Builder sortBy(List<CompositeRulesSubRuleType> sortBy) {
      this.sortBy = sortBy;
      return this;
    }

    /**
     * Set the filters.
     * Existing filters will be replaced.
     *
     * @param filters the filters
     * @return the CompositeRulesEntityRules builder
     */
    public Builder filters(List<CompositeRulesSubRuleType> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * Set the choices.
     * Existing choices will be replaced.
     *
     * @param choices the choices
     * @return the CompositeRulesEntityRules builder
     */
    public Builder choices(List<String> choices) {
      this.choices = choices;
      return this;
    }

    /**
     * Set the singleValues.
     *
     * @param singleValues the singleValues
     * @return the CompositeRulesEntityRules builder
     */
    public Builder singleValues(Boolean singleValues) {
      this.singleValues = singleValues;
      return this;
    }
  }

  protected CompositeRulesEntityRules() { }

  protected CompositeRulesEntityRules(Builder builder) {
    attributeRules = builder.attributeRules;
    sources = builder.sources;
    sortBy = builder.sortBy;
    filters = builder.filters;
    choices = builder.choices;
    singleValues = builder.singleValues;
  }

  /**
   * New builder.
   *
   * @return a CompositeRulesEntityRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the attributeRules.
   *
   * Collection of composite rule definitions at attribute level.
   *
   * @return the attributeRules
   */
  public Map<String, CompositeRulesRule> attributeRules() {
    return attributeRules;
  }

  /**
   * Gets the sources.
   *
   * Collection of sources ordered by preferred priorities.
   *
   * @return the sources
   */
  public List<String> sources() {
    return sources;
  }

  /**
   * Gets the sortBy.
   *
   * Collection of sorting configuration of composite rules in prefered order.
   *
   * @return the sortBy
   */
  public List<CompositeRulesSubRuleType> sortBy() {
    return sortBy;
  }

  /**
   * Gets the filters.
   *
   * Collection of filters ordered by prefered priorties.
   *
   * @return the filters
   */
  public List<CompositeRulesSubRuleType> filters() {
    return filters;
  }

  /**
   * Gets the choices.
   *
   * Collection of composite rules in preferred order. A subset of : mca, mfa, source and uniques. The default value is
   * [mca, mfa, source].
   *
   * @return the choices
   */
  public List<String> choices() {
    return choices;
  }

  /**
   * Gets the singleValues.
   *
   * True for single values only, false for list or single values. Default is false.
   *
   * @return the singleValues
   */
  public Boolean singleValues() {
    return singleValues;
  }
}

