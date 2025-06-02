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
 * Stream connection properties.
 */
public class InstanceMetadataResponseConnenctionDetails extends GenericModel {

  @SerializedName("asset_scope")
  protected String assetScope;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("container_id")
  protected String containerId;

  protected InstanceMetadataResponseConnenctionDetails() { }

  /**
   * Gets the assetScope.
   *
   * Asset scope for given Stream connection.
   *
   * @return the assetScope
   */
  public String getAssetScope() {
    return assetScope;
  }

  /**
   * Gets the assetId.
   *
   * Asset id.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the containerId.
   *
   * Container id.
   *
   * @return the containerId
   */
  public String getContainerId() {
    return containerId;
  }
}

