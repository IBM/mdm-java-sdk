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
 * Details and credentials of the bucket.
 */
public class BucketCredentialsWrapperBucketCredentials extends GenericModel {

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
   * Gets the apiKeyId.
   *
   * The id of the api key.
   *
   * @return the apiKeyId
   */
  public String getApiKeyId() {
    return apiKeyId;
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
   * Gets the cosCrn.
   *
   * The CRN that points to the Object Storage instance containing the bucket.
   *
   * @return the cosCrn
   */
  public String getCosCrn() {
    return cosCrn;
  }

  /**
   * Gets the bucketLocation.
   *
   * The service location of the bucket.
   *
   * @return the bucketLocation
   */
  public String getBucketLocation() {
    return bucketLocation;
  }
}

