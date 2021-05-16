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
 * Information used to identify existing credentials for a bucket.
 */
public class BucketCredentialsRequestBucketCredentials extends GenericModel {

  @SerializedName("api_key_id")
  protected String apiKeyId;
  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("bucket_name")
  protected String bucketName;
  @SerializedName("cos_crn")
  protected String cosCrn;
  @SerializedName("bucket_location")
  protected String bucketLocation;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKeyId;

    private Builder(BucketCredentialsRequestBucketCredentials bucketCredentialsRequestBucketCredentials) {
      this.apiKeyId = bucketCredentialsRequestBucketCredentials.apiKeyId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param apiKeyId the apiKeyId
     */
    public Builder(String apiKeyId) {
      this.apiKeyId = apiKeyId;
    }

    /**
     * Builds a BucketCredentialsRequestBucketCredentials.
     *
     * @return the new BucketCredentialsRequestBucketCredentials instance
     */
    public BucketCredentialsRequestBucketCredentials build() {
      return new BucketCredentialsRequestBucketCredentials(this);
    }

    /**
     * Set the apiKeyId.
     *
     * @param apiKeyId the apiKeyId
     * @return the BucketCredentialsRequestBucketCredentials builder
     */
    public Builder apiKeyId(String apiKeyId) {
      this.apiKeyId = apiKeyId;
      return this;
    }
  }

  protected BucketCredentialsRequestBucketCredentials(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apiKeyId,
      "apiKeyId cannot be null");
    apiKeyId = builder.apiKeyId;
  }

  /**
   * New builder.
   *
   * @return a BucketCredentialsRequestBucketCredentials builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiKeyId.
   *
   * The id of the api key.
   *
   * @return the apiKeyId
   */
  public String apiKeyId() {
    return apiKeyId;
  }

  /**
   * Gets the apiKey.
   *
   * The api key for loading data into the bucket.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the bucketName.
   *
   * The unique bucket name for a tenant.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the cosCrn.
   *
   * The CRN that points to the Object Storage instance containing the bucket.
   *
   * @return the cosCrn
   */
  public String cosCrn() {
    return cosCrn;
  }

  /**
   * Gets the bucketLocation.
   *
   * The service location of the bucket.
   *
   * @return the bucketLocation
   */
  public String bucketLocation() {
    return bucketLocation;
  }
}

