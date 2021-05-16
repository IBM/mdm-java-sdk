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
 * The getModelSetResource options.
 */
public class GetModelSetResourceOptions extends GenericModel {

  protected String resourceName;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceName;

    private Builder(GetModelSetResourceOptions getModelSetResourceOptions) {
      this.resourceName = getModelSetResourceOptions.resourceName;
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
     */
    public Builder(String resourceName) {
      this.resourceName = resourceName;
    }

    /**
     * Builds a GetModelSetResourceOptions.
     *
     * @return the new GetModelSetResourceOptions instance
     */
    public GetModelSetResourceOptions build() {
      return new GetModelSetResourceOptions(this);
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the GetModelSetResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }
  }

  protected GetModelSetResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    resourceName = builder.resourceName;
  }

  /**
   * New builder.
   *
   * @return a GetModelSetResourceOptions builder
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
}

