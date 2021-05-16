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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The revokeDataBucketCredentials options.
 */
public class RevokeDataBucketCredentialsOptions extends GenericModel {

  protected BucketCredentialsRequestBucketCredentials bucketCredentials;

  /**
   * Builder.
   */
  public static class Builder {
    private BucketCredentialsRequestBucketCredentials bucketCredentials;

    private Builder(RevokeDataBucketCredentialsOptions revokeDataBucketCredentialsOptions) {
      this.bucketCredentials = revokeDataBucketCredentialsOptions.bucketCredentials;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketCredentials the bucketCredentials
     */
    public Builder(BucketCredentialsRequestBucketCredentials bucketCredentials) {
      this.bucketCredentials = bucketCredentials;
    }

    /**
     * Builds a RevokeDataBucketCredentialsOptions.
     *
     * @return the new RevokeDataBucketCredentialsOptions instance
     */
    public RevokeDataBucketCredentialsOptions build() {
      return new RevokeDataBucketCredentialsOptions(this);
    }

    /**
     * Set the bucketCredentials.
     *
     * @param bucketCredentials the bucketCredentials
     * @return the RevokeDataBucketCredentialsOptions builder
     */
    public Builder bucketCredentials(BucketCredentialsRequestBucketCredentials bucketCredentials) {
      this.bucketCredentials = bucketCredentials;
      return this;
    }
  }

  protected RevokeDataBucketCredentialsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketCredentials,
      "bucketCredentials cannot be null");
    bucketCredentials = builder.bucketCredentials;
  }

  /**
   * New builder.
   *
   * @return a RevokeDataBucketCredentialsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketCredentials.
   *
   * Information used to identify existing credentials for a bucket.
   *
   * @return the bucketCredentials
   */
  public BucketCredentialsRequestBucketCredentials bucketCredentials() {
    return bucketCredentials;
  }
}

