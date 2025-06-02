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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about UI Member Label Setting.
 */
public class UiMemberLabelSettings extends GenericModel {

  @SerializedName("record_types")
  protected Map<String, UiCustomEnabledLabelSetting> recordTypes;
  @SerializedName("entity_types")
  protected Map<String, UiCustomEnabledLabelSetting> entityTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, UiCustomEnabledLabelSetting> recordTypes;
    private Map<String, UiCustomEnabledLabelSetting> entityTypes;

    /**
     * Instantiates a new Builder from an existing UiMemberLabelSettings instance.
     *
     * @param uiMemberLabelSettings the instance to initialize the Builder with
     */
    private Builder(UiMemberLabelSettings uiMemberLabelSettings) {
      this.recordTypes = uiMemberLabelSettings.recordTypes;
      this.entityTypes = uiMemberLabelSettings.entityTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UiMemberLabelSettings.
     *
     * @return the new UiMemberLabelSettings instance
     */
    public UiMemberLabelSettings build() {
      return new UiMemberLabelSettings(this);
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the UiMemberLabelSettings builder
     */
    public Builder recordTypes(Map<String, UiCustomEnabledLabelSetting> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the UiMemberLabelSettings builder
     */
    public Builder entityTypes(Map<String, UiCustomEnabledLabelSetting> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }
  }

  protected UiMemberLabelSettings() { }

  protected UiMemberLabelSettings(Builder builder) {
    recordTypes = builder.recordTypes;
    entityTypes = builder.entityTypes;
  }

  /**
   * New builder.
   *
   * @return a UiMemberLabelSettings builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordTypes.
   *
   * @return the recordTypes
   */
  public Map<String, UiCustomEnabledLabelSetting> recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * @return the entityTypes
   */
  public Map<String, UiCustomEnabledLabelSetting> entityTypes() {
    return entityTypes;
  }
}

