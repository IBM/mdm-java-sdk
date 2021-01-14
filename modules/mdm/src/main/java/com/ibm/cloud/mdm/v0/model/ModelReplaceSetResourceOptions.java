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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The modelReplaceSetResource options.
 */
public class ModelReplaceSetResourceOptions extends GenericModel {

  protected String resourceName;
  protected Map<String, SetResourceEntry> requestBody;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceName;
    private Map<String, SetResourceEntry> requestBody;

    private Builder(ModelReplaceSetResourceOptions modelReplaceSetResourceOptions) {
      this.resourceName = modelReplaceSetResourceOptions.resourceName;
      this.requestBody = modelReplaceSetResourceOptions.requestBody;
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
    public Builder(String resourceName, Map<String, SetResourceEntry> requestBody) {
      this.resourceName = resourceName;
      this.requestBody = requestBody;
    }

    /**
     * Builds a ModelReplaceSetResourceOptions.
     *
     * @return the new ModelReplaceSetResourceOptions instance
     */
    public ModelReplaceSetResourceOptions build() {
      return new ModelReplaceSetResourceOptions(this);
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the ModelReplaceSetResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    /**
     * Set the requestBody.
     *
     * @param requestBody the requestBody
     * @return the ModelReplaceSetResourceOptions builder
     */
    public Builder requestBody(Map<String, SetResourceEntry> requestBody) {
      this.requestBody = requestBody;
      return this;
    }
  }

  protected ModelReplaceSetResourceOptions(Builder builder) {
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
   * @return a ModelReplaceSetResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceName.
   *
   * he unique identifier for the configuration for the anonymous set of words.
   *
   * @return the resourceName
   */
  public String resourceName() {
    return resourceName;
  }

  /**
   * Gets the requestBody.
   *
   * A single set resource used for matching algorithm like for handling anonymous values. Set resource key must be
   * lower snake case (i.e. anonymous).
   *
   * @return the requestBody
   */
  public Map<String, SetResourceEntry> requestBody() {
    return requestBody;
  }
}

