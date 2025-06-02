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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single sorting or filtering definition.
 */
public class CompositeRulesSubRuleType extends GenericModel {

  protected String type;
  protected Map<String, Object> params;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Map<String, Object> params;

    /**
     * Instantiates a new Builder from an existing CompositeRulesSubRuleType instance.
     *
     * @param compositeRulesSubRuleType the instance to initialize the Builder with
     */
    private Builder(CompositeRulesSubRuleType compositeRulesSubRuleType) {
      this.type = compositeRulesSubRuleType.type;
      this.params = compositeRulesSubRuleType.params;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompositeRulesSubRuleType.
     *
     * @return the new CompositeRulesSubRuleType instance
     */
    public CompositeRulesSubRuleType build() {
      return new CompositeRulesSubRuleType(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CompositeRulesSubRuleType builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the params.
     *
     * @param params the params
     * @return the CompositeRulesSubRuleType builder
     */
    public Builder params(Map<String, Object> params) {
      this.params = params;
      return this;
    }
  }

  protected CompositeRulesSubRuleType() { }

  protected CompositeRulesSubRuleType(Builder builder) {
    type = builder.type;
    params = builder.params;
  }

  /**
   * New builder.
   *
   * @return a CompositeRulesSubRuleType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Type of composite rules filtering/sorting options. One of: source, frequency, modification_date.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the params.
   *
   * Map of filters/sorters ordered by prefered priorties.
   *
   * @return the params
   */
  public Map<String, Object> params() {
    return params;
  }
}

