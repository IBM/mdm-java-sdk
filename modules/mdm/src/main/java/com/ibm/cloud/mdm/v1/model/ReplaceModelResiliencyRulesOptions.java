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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceModelResiliencyRules options.
 */
public class ReplaceModelResiliencyRulesOptions extends GenericModel {

  protected ResiliencyRulesLinkResiliencyRules linkResiliencyRules;

  /**
   * Builder.
   */
  public static class Builder {
    private ResiliencyRulesLinkResiliencyRules linkResiliencyRules;

    /**
     * Instantiates a new Builder from an existing ReplaceModelResiliencyRulesOptions instance.
     *
     * @param replaceModelResiliencyRulesOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceModelResiliencyRulesOptions replaceModelResiliencyRulesOptions) {
      this.linkResiliencyRules = replaceModelResiliencyRulesOptions.linkResiliencyRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceModelResiliencyRulesOptions.
     *
     * @return the new ReplaceModelResiliencyRulesOptions instance
     */
    public ReplaceModelResiliencyRulesOptions build() {
      return new ReplaceModelResiliencyRulesOptions(this);
    }

    /**
     * Set the linkResiliencyRules.
     *
     * @param linkResiliencyRules the linkResiliencyRules
     * @return the ReplaceModelResiliencyRulesOptions builder
     */
    public Builder linkResiliencyRules(ResiliencyRulesLinkResiliencyRules linkResiliencyRules) {
      this.linkResiliencyRules = linkResiliencyRules;
      return this;
    }

    /**
     * Set the resiliencyRules.
     *
     * @param resiliencyRules the resiliencyRules
     * @return the ReplaceModelResiliencyRulesOptions builder
     */
    public Builder resiliencyRules(ResiliencyRules resiliencyRules) {
      this.linkResiliencyRules = resiliencyRules.linkResiliencyRules();
      return this;
    }
  }

  protected ReplaceModelResiliencyRulesOptions() { }

  protected ReplaceModelResiliencyRulesOptions(Builder builder) {
    linkResiliencyRules = builder.linkResiliencyRules;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelResiliencyRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the linkResiliencyRules.
   *
   * Collection of records and entities with resiliency rules configuration.
   *
   * @return the linkResiliencyRules
   */
  public ResiliencyRulesLinkResiliencyRules linkResiliencyRules() {
    return linkResiliencyRules;
  }
}

