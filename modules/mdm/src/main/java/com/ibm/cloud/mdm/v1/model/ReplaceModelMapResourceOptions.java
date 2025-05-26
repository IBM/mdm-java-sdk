/*
 * (C) Copyright IBM Corp. 2025.
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

import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceModelMapResource options.
 */
public class ReplaceModelMapResourceOptions extends GenericModel {

  protected String resourceName;
  protected Map<String, List<MapResourceEntry>> requestBody;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceName;
    private Map<String, List<MapResourceEntry>> requestBody;

    private Builder(ReplaceModelMapResourceOptions replaceModelMapResourceOptions) {
      this.resourceName = replaceModelMapResourceOptions.resourceName;
      this.requestBody = replaceModelMapResourceOptions.requestBody;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resourceName the resourceName
     * @param requestBody the requestBody
     */
    public Builder(String resourceName, Map<String, List<MapResourceEntry>> requestBody) {
      this.resourceName = resourceName;
      this.requestBody = requestBody;
    }

    /**
     * Builds a ReplaceModelMapResourceOptions.
     *
     * @return the new ReplaceModelMapResourceOptions instance
     */
    public ReplaceModelMapResourceOptions build() {
      return new ReplaceModelMapResourceOptions(this);
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the ReplaceModelMapResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    /**
     * Set the requestBody.
     *
     * @param requestBody the requestBody
     * @return the ReplaceModelMapResourceOptions builder
     */
    public Builder requestBody(Map<String, List<MapResourceEntry>> requestBody) {
      this.requestBody = requestBody;
      return this;
    }
  }

  protected ReplaceModelMapResourceOptions() { }

  protected ReplaceModelMapResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.requestBody,
      "requestBody cannot be null");
    resourceName = builder.resourceName;
    requestBody = builder.requestBody;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelMapResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceName.
   *
   * The unique identifier for the configuration for the equivalent words.
   *
   * @return the resourceName
   */
  public String resourceName() {
    return resourceName;
  }

  /**
   * Gets the requestBody.
   *
   * A single map resource used for matching algorithm like for handling equivalent values. Map resource key must be
   * lower snake case (i.e. nickname).
   *
   * @return the requestBody
   */
  public Map<String, List<MapResourceEntry>> requestBody() {
    return requestBody;
  }
}

