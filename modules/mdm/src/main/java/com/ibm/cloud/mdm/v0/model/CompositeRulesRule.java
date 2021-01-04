/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single composite rule definition.
 */
public class CompositeRulesRule extends GenericModel {

  protected List<String> choices;
  protected List<String> sources;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> choices;
    private List<String> sources;

    private Builder(CompositeRulesRule compositeRulesRule) {
      this.choices = compositeRulesRule.choices;
      this.sources = compositeRulesRule.sources;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param choices the choices
     * @param sources the sources
     */
    public Builder(List<String> choices, List<String> sources) {
      this.choices = choices;
      this.sources = sources;
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
     * Adds an choices to choices.
     *
     * @param choices the new choices
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
     * Adds an sources to sources.
     *
     * @param sources the new sources
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
  }

  protected CompositeRulesRule(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.choices,
      "choices cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sources,
      "sources cannot be null");
    choices = builder.choices;
    sources = builder.sources;
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
}

