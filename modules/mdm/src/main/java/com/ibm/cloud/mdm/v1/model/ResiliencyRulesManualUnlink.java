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
 * Resiliency rules configuration for manual unlink.
 */
public class ResiliencyRulesManualUnlink extends GenericModel {

  @SerializedName("original_entity_split")
  protected Boolean originalEntitySplit;
  @SerializedName("record_becoming_singleton")
  protected Boolean recordBecomingSingleton;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean originalEntitySplit;
    private Boolean recordBecomingSingleton;

    /**
     * Instantiates a new Builder from an existing ResiliencyRulesManualUnlink instance.
     *
     * @param resiliencyRulesManualUnlink the instance to initialize the Builder with
     */
    private Builder(ResiliencyRulesManualUnlink resiliencyRulesManualUnlink) {
      this.originalEntitySplit = resiliencyRulesManualUnlink.originalEntitySplit;
      this.recordBecomingSingleton = resiliencyRulesManualUnlink.recordBecomingSingleton;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRulesManualUnlink.
     *
     * @return the new ResiliencyRulesManualUnlink instance
     */
    public ResiliencyRulesManualUnlink build() {
      return new ResiliencyRulesManualUnlink(this);
    }

    /**
     * Set the originalEntitySplit.
     *
     * @param originalEntitySplit the originalEntitySplit
     * @return the ResiliencyRulesManualUnlink builder
     */
    public Builder originalEntitySplit(Boolean originalEntitySplit) {
      this.originalEntitySplit = originalEntitySplit;
      return this;
    }

    /**
     * Set the recordBecomingSingleton.
     *
     * @param recordBecomingSingleton the recordBecomingSingleton
     * @return the ResiliencyRulesManualUnlink builder
     */
    public Builder recordBecomingSingleton(Boolean recordBecomingSingleton) {
      this.recordBecomingSingleton = recordBecomingSingleton;
      return this;
    }
  }

  protected ResiliencyRulesManualUnlink() { }

  protected ResiliencyRulesManualUnlink(Builder builder) {
    originalEntitySplit = builder.originalEntitySplit;
    recordBecomingSingleton = builder.recordBecomingSingleton;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesManualUnlink builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the originalEntitySplit.
   *
   * @return the originalEntitySplit
   */
  public Boolean originalEntitySplit() {
    return originalEntitySplit;
  }

  /**
   * Gets the recordBecomingSingleton.
   *
   * @return the recordBecomingSingleton
   */
  public Boolean recordBecomingSingleton() {
    return recordBecomingSingleton;
  }
}

