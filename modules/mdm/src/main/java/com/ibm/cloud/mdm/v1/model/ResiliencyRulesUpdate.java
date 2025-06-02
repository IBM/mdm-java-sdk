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
 * Resiliency rules configuration for CRUD operation UPDATE.
 */
public class ResiliencyRulesUpdate extends GenericModel {

  @SerializedName("original_entity_split")
  protected String originalEntitySplit;
  @SerializedName("record_becoming_singleton")
  protected String recordBecomingSingleton;
  @SerializedName("join_existing_entity")
  protected String joinExistingEntity;
  @SerializedName("merge_entities")
  protected String mergeEntities;

  /**
   * Builder.
   */
  public static class Builder {
    private String originalEntitySplit;
    private String recordBecomingSingleton;
    private String joinExistingEntity;
    private String mergeEntities;

    /**
     * Instantiates a new Builder from an existing ResiliencyRulesUpdate instance.
     *
     * @param resiliencyRulesUpdate the instance to initialize the Builder with
     */
    private Builder(ResiliencyRulesUpdate resiliencyRulesUpdate) {
      this.originalEntitySplit = resiliencyRulesUpdate.originalEntitySplit;
      this.recordBecomingSingleton = resiliencyRulesUpdate.recordBecomingSingleton;
      this.joinExistingEntity = resiliencyRulesUpdate.joinExistingEntity;
      this.mergeEntities = resiliencyRulesUpdate.mergeEntities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRulesUpdate.
     *
     * @return the new ResiliencyRulesUpdate instance
     */
    public ResiliencyRulesUpdate build() {
      return new ResiliencyRulesUpdate(this);
    }

    /**
     * Set the originalEntitySplit.
     *
     * @param originalEntitySplit the originalEntitySplit
     * @return the ResiliencyRulesUpdate builder
     */
    public Builder originalEntitySplit(String originalEntitySplit) {
      this.originalEntitySplit = originalEntitySplit;
      return this;
    }

    /**
     * Set the recordBecomingSingleton.
     *
     * @param recordBecomingSingleton the recordBecomingSingleton
     * @return the ResiliencyRulesUpdate builder
     */
    public Builder recordBecomingSingleton(String recordBecomingSingleton) {
      this.recordBecomingSingleton = recordBecomingSingleton;
      return this;
    }

    /**
     * Set the joinExistingEntity.
     *
     * @param joinExistingEntity the joinExistingEntity
     * @return the ResiliencyRulesUpdate builder
     */
    public Builder joinExistingEntity(String joinExistingEntity) {
      this.joinExistingEntity = joinExistingEntity;
      return this;
    }

    /**
     * Set the mergeEntities.
     *
     * @param mergeEntities the mergeEntities
     * @return the ResiliencyRulesUpdate builder
     */
    public Builder mergeEntities(String mergeEntities) {
      this.mergeEntities = mergeEntities;
      return this;
    }
  }

  protected ResiliencyRulesUpdate() { }

  protected ResiliencyRulesUpdate(Builder builder) {
    originalEntitySplit = builder.originalEntitySplit;
    recordBecomingSingleton = builder.recordBecomingSingleton;
    joinExistingEntity = builder.joinExistingEntity;
    mergeEntities = builder.mergeEntities;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the originalEntitySplit.
   *
   * @return the originalEntitySplit
   */
  public String originalEntitySplit() {
    return originalEntitySplit;
  }

  /**
   * Gets the recordBecomingSingleton.
   *
   * @return the recordBecomingSingleton
   */
  public String recordBecomingSingleton() {
    return recordBecomingSingleton;
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

