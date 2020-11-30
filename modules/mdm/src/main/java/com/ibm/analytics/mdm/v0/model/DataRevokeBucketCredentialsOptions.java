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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataRevokeBucketCredentials options.
 */
public class DataRevokeBucketCredentialsOptions extends GenericModel {

  protected BucketCredentialsRequest bucketCredentials;

  /**
   * Builder.
   */
  public static class Builder {
    private BucketCredentialsRequest bucketCredentials;

    private Builder(DataRevokeBucketCredentialsOptions dataRevokeBucketCredentialsOptions) {
      this.bucketCredentials = dataRevokeBucketCredentialsOptions.bucketCredentials;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataRevokeBucketCredentialsOptions.
     *
     * @return the new DataRevokeBucketCredentialsOptions instance
     */
    public DataRevokeBucketCredentialsOptions build() {
      return new DataRevokeBucketCredentialsOptions(this);
    }

    /**
     * Set the bucketCredentials.
     *
     * @param bucketCredentials the bucketCredentials
     * @return the DataRevokeBucketCredentialsOptions builder
     */
    public Builder bucketCredentials(BucketCredentialsRequest bucketCredentials) {
      this.bucketCredentials = bucketCredentials;
      return this;
    }
  }

  protected DataRevokeBucketCredentialsOptions(Builder builder) {
    bucketCredentials = builder.bucketCredentials;
  }

  /**
   * New builder.
   *
   * @return a DataRevokeBucketCredentialsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketCredentials.
   *
   * Credentials for a bucket.
   *
   * @return the bucketCredentials
   */
  public BucketCredentialsRequest bucketCredentials() {
    return bucketCredentials;
  }
}

