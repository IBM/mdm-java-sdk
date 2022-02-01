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
public class InstanceMetadataBulkloadBucket extends GenericModel {

  @SerializedName("cos_bucket_location")
  protected String cosBucketLocation;
  @SerializedName("cos_bucket_api_key")
  protected String cosBucketApiKey;
  @SerializedName("cos_bucket_name")
  protected String cosBucketName;

  /**
   * Builder.
   */
  public static class Builder {
    private String cosBucketLocation;
    private String cosBucketApiKey;
    private String cosBucketName;

    private Builder(InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucket) {
      this.cosBucketLocation = instanceMetadataBulkloadBucket.cosBucketLocation;
      this.cosBucketApiKey = instanceMetadataBulkloadBucket.cosBucketApiKey;
      this.cosBucketName = instanceMetadataBulkloadBucket.cosBucketName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cosBucketApiKey the cosBucketApiKey
     * @param cosBucketName the cosBucketName
     */
    public Builder(String cosBucketApiKey, String cosBucketName) {
      this.cosBucketApiKey = cosBucketApiKey;
      this.cosBucketName = cosBucketName;
    }

    /**
     * Builds a InstanceMetadataBulkloadBucket.
     *
     * @return the new InstanceMetadataBulkloadBucket instance
     */
    public InstanceMetadataBulkloadBucket build() {
      return new InstanceMetadataBulkloadBucket(this);
    }

    /**
     * Set the cosBucketLocation.
     *
     * @param cosBucketLocation the cosBucketLocation
     * @return the InstanceMetadataBulkloadBucket builder
     */
    public Builder cosBucketLocation(String cosBucketLocation) {
      this.cosBucketLocation = cosBucketLocation;
      return this;
    }

    /**
     * Set the cosBucketApiKey.
     *
     * @param cosBucketApiKey the cosBucketApiKey
     * @return the InstanceMetadataBulkloadBucket builder
     */
    public Builder cosBucketApiKey(String cosBucketApiKey) {
      this.cosBucketApiKey = cosBucketApiKey;
      return this;
    }

    /**
     * Set the cosBucketName.
     *
     * @param cosBucketName the cosBucketName
     * @return the InstanceMetadataBulkloadBucket builder
     */
    public Builder cosBucketName(String cosBucketName) {
      this.cosBucketName = cosBucketName;
      return this;
    }
  }

  protected InstanceMetadataBulkloadBucket(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosBucketApiKey,
      "cosBucketApiKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cosBucketName,
      "cosBucketName cannot be null");
    cosBucketLocation = builder.cosBucketLocation;
    cosBucketApiKey = builder.cosBucketApiKey;
    cosBucketName = builder.cosBucketName;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataBulkloadBucket builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cosBucketLocation.
   *
   * The location of the cloud object storage bucket.
   *
   * @return the cosBucketLocation
   */
  public String cosBucketLocation() {
    return cosBucketLocation;
  }

  /**
   * Gets the cosBucketApiKey.
   *
   * Bucket API key of a cloud object storage.
   *
   * @return the cosBucketApiKey
   */
  public String cosBucketApiKey() {
    return cosBucketApiKey;
  }

  /**
   * Gets the cosBucketName.
   *
   * Name of a bucket on cloud object storage.
   *
   * @return the cosBucketName
   */
  public String cosBucketName() {
    return cosBucketName;
  }
}

