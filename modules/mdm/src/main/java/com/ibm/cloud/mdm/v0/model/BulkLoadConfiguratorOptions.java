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
 * The bulkLoadConfigurator options.
 */
public class BulkLoadConfiguratorOptions extends GenericModel {

  protected PublishDataRequestAssetSourceDetails assetSourceDetails;

  /**
   * Builder.
   */
  public static class Builder {
    private PublishDataRequestAssetSourceDetails assetSourceDetails;

    private Builder(BulkLoadConfiguratorOptions bulkLoadConfiguratorOptions) {
      this.assetSourceDetails = bulkLoadConfiguratorOptions.assetSourceDetails;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetSourceDetails the assetSourceDetails
     */
    public Builder(PublishDataRequestAssetSourceDetails assetSourceDetails) {
      this.assetSourceDetails = assetSourceDetails;
    }

    /**
     * Builds a BulkLoadConfiguratorOptions.
     *
     * @return the new BulkLoadConfiguratorOptions instance
     */
    public BulkLoadConfiguratorOptions build() {
      return new BulkLoadConfiguratorOptions(this);
    }

    /**
     * Set the assetSourceDetails.
     *
     * @param assetSourceDetails the assetSourceDetails
     * @return the BulkLoadConfiguratorOptions builder
     */
    public Builder assetSourceDetails(PublishDataRequestAssetSourceDetails assetSourceDetails) {
      this.assetSourceDetails = assetSourceDetails;
      return this;
    }
  }

  protected BulkLoadConfiguratorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetSourceDetails,
      "assetSourceDetails cannot be null");
    assetSourceDetails = builder.assetSourceDetails;
  }

  /**
   * New builder.
   *
   * @return a BulkLoadConfiguratorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetSourceDetails.
   *
   * The asset source details for the data asset to be published.
   *
   * @return the assetSourceDetails
   */
  public PublishDataRequestAssetSourceDetails assetSourceDetails() {
    return assetSourceDetails;
  }
}

