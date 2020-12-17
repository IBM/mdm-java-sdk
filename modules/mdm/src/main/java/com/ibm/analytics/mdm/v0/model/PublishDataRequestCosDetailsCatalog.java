/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Cos details for catalog.
 */
public class PublishDataRequestCosDetailsCatalog extends GenericModel {

  @SerializedName("cos_endpoint")
  protected String cosEndpoint;
  @SerializedName("cos_bucket_name")
  protected String cosBucketName;
  @SerializedName("cos_api_key")
  protected String cosApiKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String cosEndpoint;
    private String cosBucketName;
    private String cosApiKey;

    private Builder(PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalog) {
      this.cosEndpoint = publishDataRequestCosDetailsCatalog.cosEndpoint;
      this.cosBucketName = publishDataRequestCosDetailsCatalog.cosBucketName;
      this.cosApiKey = publishDataRequestCosDetailsCatalog.cosApiKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublishDataRequestCosDetailsCatalog.
     *
     * @return the new PublishDataRequestCosDetailsCatalog instance
     */
    public PublishDataRequestCosDetailsCatalog build() {
      return new PublishDataRequestCosDetailsCatalog(this);
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the PublishDataRequestCosDetailsCatalog builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the cosBucketName.
     *
     * @param cosBucketName the cosBucketName
     * @return the PublishDataRequestCosDetailsCatalog builder
     */
    public Builder cosBucketName(String cosBucketName) {
      this.cosBucketName = cosBucketName;
      return this;
    }

    /**
     * Set the cosApiKey.
     *
     * @param cosApiKey the cosApiKey
     * @return the PublishDataRequestCosDetailsCatalog builder
     */
    public Builder cosApiKey(String cosApiKey) {
      this.cosApiKey = cosApiKey;
      return this;
    }
  }

  protected PublishDataRequestCosDetailsCatalog(Builder builder) {
    cosEndpoint = builder.cosEndpoint;
    cosBucketName = builder.cosBucketName;
    cosApiKey = builder.cosApiKey;
  }

  /**
   * New builder.
   *
   * @return a PublishDataRequestCosDetailsCatalog builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cosEndpoint.
   *
   * Cos endpoint.
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the cosBucketName.
   *
   * Cos bucket name.
   *
   * @return the cosBucketName
   */
  public String cosBucketName() {
    return cosBucketName;
  }

  /**
   * Gets the cosApiKey.
   *
   * Cos api key.
   *
   * @return the cosApiKey
   */
  public String cosApiKey() {
    return cosApiKey;
  }
}

