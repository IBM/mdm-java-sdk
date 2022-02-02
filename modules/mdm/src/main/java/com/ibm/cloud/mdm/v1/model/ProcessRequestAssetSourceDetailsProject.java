/*
 * (C) Copyright IBM Corp. 2022.
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
 * The asset source details for project data asset.
 */
public class ProcessRequestAssetSourceDetailsProject extends GenericModel {

  @SerializedName("cos_api_key")
  protected String cosApiKey;
  @SerializedName("cos_bucket_name")
  protected String cosBucketName;
  @SerializedName("cos_endpoint")
  protected String cosEndpoint;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String cosApiKey;
    private String cosBucketName;
    private String cosEndpoint;
    private String id;

    private Builder(ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProject) {
      this.cosApiKey = processRequestAssetSourceDetailsProject.cosApiKey;
      this.cosBucketName = processRequestAssetSourceDetailsProject.cosBucketName;
      this.cosEndpoint = processRequestAssetSourceDetailsProject.cosEndpoint;
      this.id = processRequestAssetSourceDetailsProject.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ProcessRequestAssetSourceDetailsProject.
     *
     * @return the new ProcessRequestAssetSourceDetailsProject instance
     */
    public ProcessRequestAssetSourceDetailsProject build() {
      return new ProcessRequestAssetSourceDetailsProject(this);
    }

    /**
     * Set the cosApiKey.
     *
     * @param cosApiKey the cosApiKey
     * @return the ProcessRequestAssetSourceDetailsProject builder
     */
    public Builder cosApiKey(String cosApiKey) {
      this.cosApiKey = cosApiKey;
      return this;
    }

    /**
     * Set the cosBucketName.
     *
     * @param cosBucketName the cosBucketName
     * @return the ProcessRequestAssetSourceDetailsProject builder
     */
    public Builder cosBucketName(String cosBucketName) {
      this.cosBucketName = cosBucketName;
      return this;
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the ProcessRequestAssetSourceDetailsProject builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ProcessRequestAssetSourceDetailsProject builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ProcessRequestAssetSourceDetailsProject(Builder builder) {
    cosApiKey = builder.cosApiKey;
    cosBucketName = builder.cosBucketName;
    cosEndpoint = builder.cosEndpoint;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ProcessRequestAssetSourceDetailsProject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

