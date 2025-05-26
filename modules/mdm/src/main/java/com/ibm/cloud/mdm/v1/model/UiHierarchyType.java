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
 * Information about UI Hierarchy Type.
 */
public class UiHierarchyType extends GenericModel {

  @SerializedName("label_settings")
  protected UiLabelSettings labelSettings;

  /**
   * Builder.
   */
  public static class Builder {
    private UiLabelSettings labelSettings;

    private Builder(UiHierarchyType uiHierarchyType) {
      this.labelSettings = uiHierarchyType.labelSettings;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UiHierarchyType.
     *
     * @return the new UiHierarchyType instance
     */
    public UiHierarchyType build() {
      return new UiHierarchyType(this);
    }

    /**
     * Set the labelSettings.
     *
     * @param labelSettings the labelSettings
     * @return the UiHierarchyType builder
     */
    public Builder labelSettings(UiLabelSettings labelSettings) {
      this.labelSettings = labelSettings;
      return this;
    }
  }

  protected UiHierarchyType() { }

  protected UiHierarchyType(Builder builder) {
    labelSettings = builder.labelSettings;
  }

  /**
   * New builder.
   *
   * @return a UiHierarchyType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the labelSettings.
   *
   * Information about UI Label Settings.
   *
   * @return the labelSettings
   */
  public UiLabelSettings labelSettings() {
    return labelSettings;
  }
}

