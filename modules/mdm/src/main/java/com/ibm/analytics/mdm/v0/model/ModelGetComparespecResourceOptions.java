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
 * The modelGetComparespecResource options.
 */
public class ModelGetComparespecResourceOptions extends GenericModel {

  protected String crn;
  protected String resourceName;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String resourceName;

    private Builder(ModelGetComparespecResourceOptions modelGetComparespecResourceOptions) {
      this.crn = modelGetComparespecResourceOptions.crn;
      this.resourceName = modelGetComparespecResourceOptions.resourceName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param resourceName the resourceName
     */
    public Builder(String crn, String resourceName) {
      this.crn = crn;
      this.resourceName = resourceName;
    }

    /**
     * Builds a ModelGetComparespecResourceOptions.
     *
     * @return the new ModelGetComparespecResourceOptions instance
     */
    public ModelGetComparespecResourceOptions build() {
      return new ModelGetComparespecResourceOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelGetComparespecResourceOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the ModelGetComparespecResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }
  }

  protected ModelGetComparespecResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    crn = builder.crn;
    resourceName = builder.resourceName;
  }

  /**
   * New builder.
   *
   * @return a ModelGetComparespecResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

