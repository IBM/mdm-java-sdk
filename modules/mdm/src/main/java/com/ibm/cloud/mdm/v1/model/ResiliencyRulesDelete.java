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
 * Resiliency rules configuration for CRUD operation DELETE.
 */
public class ResiliencyRulesDelete extends GenericModel {

  @SerializedName("original_entity_split")
  protected String originalEntitySplit;
  @SerializedName("singleton_entity_deletion")
  protected String singletonEntityDeletion;

  /**
   * Builder.
   */
  public static class Builder {
    private String originalEntitySplit;
    private String singletonEntityDeletion;

    private Builder(ResiliencyRulesDelete resiliencyRulesDelete) {
      this.originalEntitySplit = resiliencyRulesDelete.originalEntitySplit;
      this.singletonEntityDeletion = resiliencyRulesDelete.singletonEntityDeletion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRulesDelete.
     *
     * @return the new ResiliencyRulesDelete instance
     */
    public ResiliencyRulesDelete build() {
      return new ResiliencyRulesDelete(this);
    }

    /**
     * Set the originalEntitySplit.
     *
     * @param originalEntitySplit the originalEntitySplit
     * @return the ResiliencyRulesDelete builder
     */
    public Builder originalEntitySplit(String originalEntitySplit) {
      this.originalEntitySplit = originalEntitySplit;
      return this;
    }

    /**
     * Set the singletonEntityDeletion.
     *
     * @param singletonEntityDeletion the singletonEntityDeletion
     * @return the ResiliencyRulesDelete builder
     */
    public Builder singletonEntityDeletion(String singletonEntityDeletion) {
      this.singletonEntityDeletion = singletonEntityDeletion;
      return this;
    }
  }

  protected ResiliencyRulesDelete() { }

  protected ResiliencyRulesDelete(Builder builder) {
    originalEntitySplit = builder.originalEntitySplit;
    singletonEntityDeletion = builder.singletonEntityDeletion;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesDelete builder
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
   * Gets the singletonEntityDeletion.
   *
   * @return the singletonEntityDeletion
   */
  public String singletonEntityDeletion() {
    return singletonEntityDeletion;
  }
}

