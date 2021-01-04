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
 * Credentials for a bucket.
 */
public class BucketCredentialsRequest extends GenericModel {

  @SerializedName("api_key_id")
  protected String apiKeyId;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKeyId;

    private Builder(BucketCredentialsRequest bucketCredentialsRequest) {
      this.apiKeyId = bucketCredentialsRequest.apiKeyId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BucketCredentialsRequest.
     *
     * @return the new BucketCredentialsRequest instance
     */
    public BucketCredentialsRequest build() {
      return new BucketCredentialsRequest(this);
    }

    /**
     * Set the apiKeyId.
     *
     * @param apiKeyId the apiKeyId
     * @return the BucketCredentialsRequest builder
     */
    public Builder apiKeyId(String apiKeyId) {
      this.apiKeyId = apiKeyId;
      return this;
    }
  }

  protected BucketCredentialsRequest(Builder builder) {
    apiKeyId = builder.apiKeyId;
  }

  /**
   * New builder.
   *
   * @return a BucketCredentialsRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiKeyId.
   *
   * The api key for loading data into the bucket.
   *
   * @return the apiKeyId
   */
  public String apiKeyId() {
    return apiKeyId;
  }
}

