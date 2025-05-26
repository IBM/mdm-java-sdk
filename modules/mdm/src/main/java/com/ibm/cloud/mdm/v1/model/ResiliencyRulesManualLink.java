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
 * Resiliency rules configuration for manual link.
 */
public class ResiliencyRulesManualLink extends GenericModel {

  @SerializedName("merge_entities")
  protected Boolean mergeEntities;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean mergeEntities;

    private Builder(ResiliencyRulesManualLink resiliencyRulesManualLink) {
      this.mergeEntities = resiliencyRulesManualLink.mergeEntities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRulesManualLink.
     *
     * @return the new ResiliencyRulesManualLink instance
     */
    public ResiliencyRulesManualLink build() {
      return new ResiliencyRulesManualLink(this);
    }

    /**
     * Set the mergeEntities.
     *
     * @param mergeEntities the mergeEntities
     * @return the ResiliencyRulesManualLink builder
     */
    public Builder mergeEntities(Boolean mergeEntities) {
      this.mergeEntities = mergeEntities;
      return this;
    }
  }

  protected ResiliencyRulesManualLink() { }

  protected ResiliencyRulesManualLink(Builder builder) {
    mergeEntities = builder.mergeEntities;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesManualLink builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mergeEntities.
   *
   * @return the mergeEntities
   */
  public Boolean mergeEntities() {
    return mergeEntities;
  }
}

