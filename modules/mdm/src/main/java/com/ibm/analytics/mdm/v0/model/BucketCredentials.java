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
 * The credentials for a bucket.
 */
public class BucketCredentials extends GenericModel {

  @SerializedName("cos_crn")
  protected String cosCrn;
  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("api_key_id")
  protected String apiKeyId;
  @SerializedName("bucket_name")
  protected String bucketName;
  @SerializedName("bucket_location")
  protected String bucketLocation;

  /**
   * Gets the cosCrn.
   *
   * The CRN that points to the COS Instance.
   *
   * @return the cosCrn
   */
  public String getCosCrn() {
    return cosCrn;
  }

  /**
   * Gets the apiKey.
   *
   * The api key for loading data into the bucket.
   *
   * @return the apiKey
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Gets the apiKeyId.
   *
   * The api key id of the api key.
   *
   * @return the apiKeyId
   */
  public String getApiKeyId() {
    return apiKeyId;
  }

  /**
   * Gets the bucketName.
   *
   * The unique bucket name for a tenant.
   *
   * @return the bucketName
   */
  public String getBucketName() {
    return bucketName;
  }

  /**
   * Gets the bucketLocation.
   *
   * The location of the bucket name.
   *
   * @return the bucketLocation
   */
  public String getBucketLocation() {
    return bucketLocation;
  }
}

