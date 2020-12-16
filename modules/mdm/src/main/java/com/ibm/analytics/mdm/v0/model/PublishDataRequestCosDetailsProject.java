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
 * Cos details for project.
 */
public class PublishDataRequestCosDetailsProject extends GenericModel {

  @SerializedName("cos_endpoint")
  protected String cosEndpoint;
  @SerializedName("cos_bucket_name")
  protected String cosBucketName;
  @SerializedName("cos_api_key")
  protected String cosApiKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String cosEndpoint;
    private String cosBucketName;
    private String cosApiKey;

    private Builder(PublishDataRequestCosDetailsProject publishDataRequestCosDetailsProject) {
      this.cosEndpoint = publishDataRequestCosDetailsProject.cosEndpoint;
      this.cosBucketName = publishDataRequestCosDetailsProject.cosBucketName;
      this.cosApiKey = publishDataRequestCosDetailsProject.cosApiKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublishDataRequestCosDetailsProject.
     *
     * @return the new PublishDataRequestCosDetailsProject instance
     */
    public PublishDataRequestCosDetailsProject build() {
      return new PublishDataRequestCosDetailsProject(this);
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the PublishDataRequestCosDetailsProject builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the cosBucketName.
     *
     * @param cosBucketName the cosBucketName
     * @return the PublishDataRequestCosDetailsProject builder
     */
    public Builder cosBucketName(String cosBucketName) {
      this.cosBucketName = cosBucketName;
      return this;
    }

    /**
     * Set the cosApiKey.
     *
     * @param cosApiKey the cosApiKey
     * @return the PublishDataRequestCosDetailsProject builder
     */
    public Builder cosApiKey(String cosApiKey) {
      this.cosApiKey = cosApiKey;
      return this;
    }
  }

  protected PublishDataRequestCosDetailsProject(Builder builder) {
    cosEndpoint = builder.cosEndpoint;
    cosBucketName = builder.cosBucketName;
    cosApiKey = builder.cosApiKey;
  }

  /**
   * New builder.
   *
   * @return a PublishDataRequestCosDetailsProject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cosEndpoint.
   *
   * Cos endpoint.
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the cosBucketName.
   *
   * Cos bucket name.
   *
   * @return the cosBucketName
   */
  public String cosBucketName() {
    return cosBucketName;
  }

  /**
   * Gets the cosApiKey.
   *
   * Cos api key.
   *
   * @return the cosApiKey
   */
  public String cosApiKey() {
    return cosApiKey;
  }
}

