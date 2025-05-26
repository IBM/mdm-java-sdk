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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getModelComparespecResource options.
 */
public class GetModelComparespecResourceOptions extends GenericModel {

  protected String resourceName;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceName;

    private Builder(GetModelComparespecResourceOptions getModelComparespecResourceOptions) {
      this.resourceName = getModelComparespecResourceOptions.resourceName;
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
     * Builds a GetModelComparespecResourceOptions.
     *
     * @return the new GetModelComparespecResourceOptions instance
     */
    public GetModelComparespecResourceOptions build() {
      return new GetModelComparespecResourceOptions(this);
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the GetModelComparespecResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }
  }

  protected GetModelComparespecResourceOptions() { }

  protected GetModelComparespecResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    resourceName = builder.resourceName;
  }

  /**
   * New builder.
   *
   * @return a GetModelComparespecResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceName.
   *
   * The unique identifier for the comparison parameters.
   *
   * @return the resourceName
   */
  public String resourceName() {
    return resourceName;
  }
}

