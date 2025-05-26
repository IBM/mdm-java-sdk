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
 * Information about UI key mapping.
 */
public class UIKeyMapping extends GenericModel {

  @SerializedName("source_key")
  protected String sourceKey;
  @SerializedName("target_key")
  protected String targetKey;
  protected String condition;

  /**
   * Builder.
   */
  public static class Builder {
    private String sourceKey;
    private String targetKey;
    private String condition;

    private Builder(UIKeyMapping uiKeyMapping) {
      this.sourceKey = uiKeyMapping.sourceKey;
      this.targetKey = uiKeyMapping.targetKey;
      this.condition = uiKeyMapping.condition;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIKeyMapping.
     *
     * @return the new UIKeyMapping instance
     */
    public UIKeyMapping build() {
      return new UIKeyMapping(this);
    }

    /**
     * Set the sourceKey.
     *
     * @param sourceKey the sourceKey
     * @return the UIKeyMapping builder
     */
    public Builder sourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
      return this;
    }

    /**
     * Set the targetKey.
     *
     * @param targetKey the targetKey
     * @return the UIKeyMapping builder
     */
    public Builder targetKey(String targetKey) {
      this.targetKey = targetKey;
      return this;
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the UIKeyMapping builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }
  }

  protected UIKeyMapping() { }

  protected UIKeyMapping(Builder builder) {
    sourceKey = builder.sourceKey;
    targetKey = builder.targetKey;
    condition = builder.condition;
  }

  /**
   * New builder.
   *
   * @return a UIKeyMapping builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sourceKey.
   *
   * @return the sourceKey
   */
  public String sourceKey() {
    return sourceKey;
  }

  /**
   * Gets the targetKey.
   *
   * @return the targetKey
   */
  public String targetKey() {
    return targetKey;
  }

  /**
   * Gets the condition.
   *
   * @return the condition
   */
  public String condition() {
    return condition;
  }
}

