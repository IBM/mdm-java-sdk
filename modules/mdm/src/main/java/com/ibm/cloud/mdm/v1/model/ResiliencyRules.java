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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for resiliency rules.
 */
public class ResiliencyRules extends GenericModel {

  @SerializedName("link_resiliency_rules")
  protected ResiliencyRulesLinkResiliencyRules linkResiliencyRules;

  /**
   * Builder.
   */
  public static class Builder {
    private ResiliencyRulesLinkResiliencyRules linkResiliencyRules;

    private Builder(ResiliencyRules resiliencyRules) {
      this.linkResiliencyRules = resiliencyRules.linkResiliencyRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRules.
     *
     * @return the new ResiliencyRules instance
     */
    public ResiliencyRules build() {
      return new ResiliencyRules(this);
    }

    /**
     * Set the linkResiliencyRules.
     *
     * @param linkResiliencyRules the linkResiliencyRules
     * @return the ResiliencyRules builder
     */
    public Builder linkResiliencyRules(ResiliencyRulesLinkResiliencyRules linkResiliencyRules) {
      this.linkResiliencyRules = linkResiliencyRules;
      return this;
    }
  }

  protected ResiliencyRules() { }

  protected ResiliencyRules(Builder builder) {
    linkResiliencyRules = builder.linkResiliencyRules;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRules builder
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

