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
 * The bulkLoad options.
 */
public class BulkLoadOptions extends GenericModel {

  protected PublishDataRequestCosDetails cosDetails;

  /**
   * Builder.
   */
  public static class Builder {
    private PublishDataRequestCosDetails cosDetails;

    private Builder(BulkLoadOptions bulkLoadOptions) {
      this.cosDetails = bulkLoadOptions.cosDetails;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cosDetails the cosDetails
     */
    public Builder(PublishDataRequestCosDetails cosDetails) {
      this.cosDetails = cosDetails;
    }

    /**
     * Builds a BulkLoadOptions.
     *
     * @return the new BulkLoadOptions instance
     */
    public BulkLoadOptions build() {
      return new BulkLoadOptions(this);
    }

    /**
     * Set the cosDetails.
     *
     * @param cosDetails the cosDetails
     * @return the BulkLoadOptions builder
     */
    public Builder cosDetails(PublishDataRequestCosDetails cosDetails) {
      this.cosDetails = cosDetails;
      return this;
    }
  }

  protected BulkLoadOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosDetails,
      "cosDetails cannot be null");
    cosDetails = builder.cosDetails;
  }

  /**
   * New builder.
   *
   * @return a BulkLoadOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cosDetails.
   *
   * cos details for asset sources.
   *
   * @return the cosDetails
   */
  public PublishDataRequestCosDetails cosDetails() {
    return cosDetails;
  }
}

