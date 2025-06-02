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
 * Information about a Json UI Settings Response.
 */
public class JsonUISettingsResponse extends GenericModel {

  @SerializedName("ui_settings")
  protected UISettings uiSettings;
  protected Metadata metadata;

  protected JsonUISettingsResponse() { }

  /**
   * Gets the uiSettings.
   *
   * Information about UI settings.
   *
   * @return the uiSettings
   */
  public UISettings getUiSettings() {
    return uiSettings;
  }

  /**
   * Gets the metadata.
   *
   * Supplemental information about a resource.
   *
   * @return the metadata
   */
  public Metadata getMetadata() {
    return metadata;
  }
}

