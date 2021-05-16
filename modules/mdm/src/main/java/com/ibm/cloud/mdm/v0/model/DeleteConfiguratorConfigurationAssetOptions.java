/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteConfiguratorConfigurationAsset options.
 */
public class DeleteConfiguratorConfigurationAssetOptions extends GenericModel {

  protected String assetIds;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetIds;

    private Builder(DeleteConfiguratorConfigurationAssetOptions deleteConfiguratorConfigurationAssetOptions) {
      this.assetIds = deleteConfiguratorConfigurationAssetOptions.assetIds;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetIds the assetIds
     */
    public Builder(String assetIds) {
      this.assetIds = assetIds;
    }

    /**
     * Builds a DeleteConfiguratorConfigurationAssetOptions.
     *
     * @return the new DeleteConfiguratorConfigurationAssetOptions instance
     */
    public DeleteConfiguratorConfigurationAssetOptions build() {
      return new DeleteConfiguratorConfigurationAssetOptions(this);
    }

    /**
     * Set the assetIds.
     *
     * @param assetIds the assetIds
     * @return the DeleteConfiguratorConfigurationAssetOptions builder
     */
    public Builder assetIds(String assetIds) {
      this.assetIds = assetIds;
      return this;
    }
  }

  protected DeleteConfiguratorConfigurationAssetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetIds,
      "assetIds cannot be null");
    assetIds = builder.assetIds;
  }

  /**
   * New builder.
   *
   * @return a DeleteConfiguratorConfigurationAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetIds.
   *
   * Asset ids of assets to be deleted, separated by commas.
   *
   * @return the assetIds
   */
  public String assetIds() {
    return assetIds;
  }
}

