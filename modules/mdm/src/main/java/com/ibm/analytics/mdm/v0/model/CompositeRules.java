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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object of composite rules.
 */
public class CompositeRules extends GenericModel {

  protected CompositeRulesRules rules;
  protected String locale;

  /**
   * Builder.
   */
  public static class Builder {
    private CompositeRulesRules rules;
    private String locale;

    private Builder(CompositeRules compositeRules) {
      this.rules = compositeRules.rules;
      this.locale = compositeRules.locale;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rules the rules
     * @param locale the locale
     */
    public Builder(CompositeRulesRules rules, String locale) {
      this.rules = rules;
      this.locale = locale;
    }

    /**
     * Builds a CompositeRules.
     *
     * @return the new CompositeRules instance
     */
    public CompositeRules build() {
      return new CompositeRules(this);
    }

    /**
     * Set the rules.
     *
     * @param rules the rules
     * @return the CompositeRules builder
     */
    public Builder rules(CompositeRulesRules rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the CompositeRules builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }
  }

  protected CompositeRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    rules = builder.rules;
    locale = builder.locale;
  }

  /**
   * New builder.
   *
   * @return a CompositeRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rules.
   *
   * Collection of composite rule definitions.
   *
   * @return the rules
   */
  public CompositeRulesRules rules() {
    return rules;
  }

  /**
   * Gets the locale.
   *
   * The request language and location (i.e. enUS).
   *
   * @return the locale
   */
  public String locale() {
    return locale;
  }
}

