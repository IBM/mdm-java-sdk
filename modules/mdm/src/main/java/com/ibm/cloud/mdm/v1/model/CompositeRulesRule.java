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
 * A single composite rule definition.
 */
public class CompositeRulesRule extends GenericModel {

  protected List<String> sources;
  protected Long limit;
  protected List<String> exclude;
  @SerializedName("sort_by")
  protected List<CompositeRulesSubRuleType> sortBy;
  protected List<CompositeRulesSubRuleType> filters;
  protected List<String> choices;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> sources;
    private Long limit;
    private List<String> exclude;
    private List<CompositeRulesSubRuleType> sortBy;
    private List<CompositeRulesSubRuleType> filters;
    private List<String> choices;

    /**
     * Instantiates a new Builder from an existing CompositeRulesRule instance.
     *
     * @param compositeRulesRule the instance to initialize the Builder with
     */
    private Builder(CompositeRulesRule compositeRulesRule) {
      this.sources = compositeRulesRule.sources;
      this.limit = compositeRulesRule.limit;
      this.exclude = compositeRulesRule.exclude;
      this.sortBy = compositeRulesRule.sortBy;
      this.filters = compositeRulesRule.filters;
      this.choices = compositeRulesRule.choices;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompositeRulesRule.
     *
     * @return the new CompositeRulesRule instance
     */
    public CompositeRulesRule build() {
      return new CompositeRulesRule(this);
    }

    /**
     * Adds a new element to sources.
     *
     * @param sources the new element to be added
     * @return the CompositeRulesRule builder
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
     * Adds a new element to exclude.
     *
     * @param exclude the new element to be added
     * @return the CompositeRulesRule builder
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
     * Adds a new element to sortBy.
     *
     * @param sortBy the new element to be added
     * @return the CompositeRulesRule builder
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
     * @return the CompositeRulesRule builder
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
     * @return the CompositeRulesRule builder
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
     * Set the sources.
     * Existing sources will be replaced.
     *
     * @param sources the sources
     * @return the CompositeRulesRule builder
     */
    public Builder sources(List<String> sources) {
      this.sources = sources;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the CompositeRulesRule builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the exclude.
     * Existing exclude will be replaced.
     *
     * @param exclude the exclude
     * @return the CompositeRulesRule builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }

    /**
     * Set the sortBy.
     * Existing sortBy will be replaced.
     *
     * @param sortBy the sortBy
     * @return the CompositeRulesRule builder
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
     * @return the CompositeRulesRule builder
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
     * @return the CompositeRulesRule builder
     */
    public Builder choices(List<String> choices) {
      this.choices = choices;
      return this;
    }
  }

  protected CompositeRulesRule() { }

  protected CompositeRulesRule(Builder builder) {
    sources = builder.sources;
    limit = builder.limit;
    exclude = builder.exclude;
    sortBy = builder.sortBy;
    filters = builder.filters;
    choices = builder.choices;
  }

  /**
   * New builder.
   *
   * @return a CompositeRulesRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sources.
   *
   * Collection of sources ordered by prefered priorties.
   *
   * @return the sources
   */
  public List<String> sources() {
    return sources;
  }

  /**
   * Gets the limit.
   *
   * Integer limit of attributes to include in composite view.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the exclude.
   *
   * Collection of fields to exclude from attribute.
   *
   * @return the exclude
   */
  public List<String> exclude() {
    return exclude;
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
   * Collection of composite rules in prefered order. A subset of : mca, mfa, source and uniques. The default value is
   * [mca, mfa, source].
   *
   * @return the choices
   */
  public List<String> choices() {
    return choices;
  }
}

