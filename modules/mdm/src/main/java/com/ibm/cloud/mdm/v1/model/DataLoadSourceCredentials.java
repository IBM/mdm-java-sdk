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
package com.ibm.cloud.mdm.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details of a data source.
 */
public class DataLoadSourceCredentials extends GenericModel {

  /**
   * The origin of the data source.
   */
  public interface Origin {
    /** internal. */
    String INTERNAL = "internal";
    /** external. */
    String EXTERNAL = "external";
  }

  protected String origin;
  protected String endpoint;
  @SerializedName("api_key")
  protected String apiKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String origin;
    private String endpoint;
    private String apiKey;

    private Builder(DataLoadSourceCredentials dataLoadSourceCredentials) {
      this.origin = dataLoadSourceCredentials.origin;
      this.endpoint = dataLoadSourceCredentials.endpoint;
      this.apiKey = dataLoadSourceCredentials.apiKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataLoadSourceCredentials.
     *
     * @return the new DataLoadSourceCredentials instance
     */
    public DataLoadSourceCredentials build() {
      return new DataLoadSourceCredentials(this);
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the DataLoadSourceCredentials builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the DataLoadSourceCredentials builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the DataLoadSourceCredentials builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }
  }

  protected DataLoadSourceCredentials(Builder builder) {
    origin = builder.origin;
    endpoint = builder.endpoint;
    apiKey = builder.apiKey;
  }

  /**
   * New builder.
   *
   * @return a DataLoadSourceCredentials builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the origin.
   *
   * The origin of the data source.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the endpoint.
   *
   * The endpoint for the data source.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the apiKey.
   *
   * The IAM API key for the data source.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }
}

