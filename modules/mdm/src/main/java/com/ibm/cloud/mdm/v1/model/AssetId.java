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
 * Details of Data Asset id for which asset mapping suggestion will be suggested.
 */
public class AssetId extends GenericModel {

  @SerializedName("asset_id")
  protected String assetId;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetId;

    /**
     * Instantiates a new Builder from an existing AssetId instance.
     *
     * @param assetId the instance to initialize the Builder with
     */
    private Builder(AssetId assetId) {
      this.assetId = assetId.assetId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AssetId.
     *
     * @return the new AssetId instance
     */
    public AssetId build() {
      return new AssetId(this);
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the AssetId builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }
  }

  protected AssetId() { }

  protected AssetId(Builder builder) {
    assetId = builder.assetId;
  }

  /**
   * New builder.
   *
   * @return a AssetId builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetId.
   *
   * The asset id of the Asset.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }
}

