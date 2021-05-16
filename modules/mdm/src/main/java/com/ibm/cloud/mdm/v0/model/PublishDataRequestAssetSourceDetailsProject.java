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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The asset source details for project data asset.
 */
public class PublishDataRequestAssetSourceDetailsProject extends GenericModel {

  @SerializedName("cos_bucket_name")
  protected String cosBucketName;
  @SerializedName("cos_api_key")
  protected String cosApiKey;
  @SerializedName("cos_endpoint")
  protected String cosEndpoint;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String cosBucketName;
    private String cosApiKey;
    private String cosEndpoint;
    private String id;

    private Builder(PublishDataRequestAssetSourceDetailsProject publishDataRequestAssetSourceDetailsProject) {
      this.cosBucketName = publishDataRequestAssetSourceDetailsProject.cosBucketName;
      this.cosApiKey = publishDataRequestAssetSourceDetailsProject.cosApiKey;
      this.cosEndpoint = publishDataRequestAssetSourceDetailsProject.cosEndpoint;
      this.id = publishDataRequestAssetSourceDetailsProject.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublishDataRequestAssetSourceDetailsProject.
     *
     * @return the new PublishDataRequestAssetSourceDetailsProject instance
     */
    public PublishDataRequestAssetSourceDetailsProject build() {
      return new PublishDataRequestAssetSourceDetailsProject(this);
    }

    /**
     * Set the cosBucketName.
     *
     * @param cosBucketName the cosBucketName
     * @return the PublishDataRequestAssetSourceDetailsProject builder
     */
    public Builder cosBucketName(String cosBucketName) {
      this.cosBucketName = cosBucketName;
      return this;
    }

    /**
     * Set the cosApiKey.
     *
     * @param cosApiKey the cosApiKey
     * @return the PublishDataRequestAssetSourceDetailsProject builder
     */
    public Builder cosApiKey(String cosApiKey) {
      this.cosApiKey = cosApiKey;
      return this;
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the PublishDataRequestAssetSourceDetailsProject builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PublishDataRequestAssetSourceDetailsProject builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected PublishDataRequestAssetSourceDetailsProject(Builder builder) {
    cosBucketName = builder.cosBucketName;
    cosApiKey = builder.cosApiKey;
    cosEndpoint = builder.cosEndpoint;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a PublishDataRequestAssetSourceDetailsProject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cosBucketName.
   *
   * Bucket Name of data asset file in the Cloud Object Storage.
   *
   * @return the cosBucketName
   */
  public String cosBucketName() {
    return cosBucketName;
  }

  /**
   * Gets the cosApiKey.
   *
   * API Key of the Cloud Object Storage account.
   *
   * @return the cosApiKey
   */
  public String cosApiKey() {
    return cosApiKey;
  }

  /**
   * Gets the cosEndpoint.
   *
   * Endpoint URL of the Cloud Object Storage.
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the id.
   *
   * Identifier of source project or source catalog.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

