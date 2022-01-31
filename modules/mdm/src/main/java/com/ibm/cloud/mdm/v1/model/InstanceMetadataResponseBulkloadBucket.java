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
 * Bulkload Bucket credentials.
 */
public class InstanceMetadataResponseBulkloadBucket extends GenericModel {

  @SerializedName("cos_bucket_name")
  protected String cosBucketName;
  @SerializedName("cos_bucket_location")
  protected String cosBucketLocation;
  @SerializedName("cos_bucket_api_key")
  protected String cosBucketApiKey;

  /**
   * Gets the cosBucketName.
   *
   * Name of a bucket on cloud object storage.
   *
   * @return the cosBucketName
   */
  public String getCosBucketName() {
    return cosBucketName;
  }

  /**
   * Gets the cosBucketLocation.
   *
   * The location of the cloud object storage bucket.
   *
   * @return the cosBucketLocation
   */
  public String getCosBucketLocation() {
    return cosBucketLocation;
  }

  /**
   * Gets the cosBucketApiKey.
   *
   * Bucket API key of a cloud object storage.
   *
   * @return the cosBucketApiKey
   */
  public String getCosBucketApiKey() {
    return cosBucketApiKey;
  }
}

