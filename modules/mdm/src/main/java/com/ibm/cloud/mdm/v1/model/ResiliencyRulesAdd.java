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
 * Resiliency rules configuration for CRUD operation ADD.
 */
public class ResiliencyRulesAdd extends GenericModel {

  @SerializedName("join_existing_entity")
  protected String joinExistingEntity;
  @SerializedName("merge_entities")
  protected String mergeEntities;

  /**
   * Builder.
   */
  public static class Builder {
    private String joinExistingEntity;
    private String mergeEntities;

    /**
     * Instantiates a new Builder from an existing ResiliencyRulesAdd instance.
     *
     * @param resiliencyRulesAdd the instance to initialize the Builder with
     */
    private Builder(ResiliencyRulesAdd resiliencyRulesAdd) {
      this.joinExistingEntity = resiliencyRulesAdd.joinExistingEntity;
      this.mergeEntities = resiliencyRulesAdd.mergeEntities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRulesAdd.
     *
     * @return the new ResiliencyRulesAdd instance
     */
    public ResiliencyRulesAdd build() {
      return new ResiliencyRulesAdd(this);
    }

    /**
     * Set the joinExistingEntity.
     *
     * @param joinExistingEntity the joinExistingEntity
     * @return the ResiliencyRulesAdd builder
     */
    public Builder joinExistingEntity(String joinExistingEntity) {
      this.joinExistingEntity = joinExistingEntity;
      return this;
    }

    /**
     * Set the mergeEntities.
     *
     * @param mergeEntities the mergeEntities
     * @return the ResiliencyRulesAdd builder
     */
    public Builder mergeEntities(String mergeEntities) {
      this.mergeEntities = mergeEntities;
      return this;
    }
  }

  protected ResiliencyRulesAdd() { }

  protected ResiliencyRulesAdd(Builder builder) {
    joinExistingEntity = builder.joinExistingEntity;
    mergeEntities = builder.mergeEntities;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesAdd builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the joinExistingEntity.
   *
   * @return the joinExistingEntity
   */
  public String joinExistingEntity() {
    return joinExistingEntity;
  }

  /**
   * Gets the mergeEntities.
   *
   * @return the mergeEntities
   */
  public String mergeEntities() {
    return mergeEntities;
  }
}

