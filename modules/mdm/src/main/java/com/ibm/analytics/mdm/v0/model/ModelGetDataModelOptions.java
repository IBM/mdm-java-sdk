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
 * The modelGetDataModel options.
 */
public class ModelGetDataModelOptions extends GenericModel {

  protected String crn;
  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String version;

    private Builder(ModelGetDataModelOptions modelGetDataModelOptions) {
      this.crn = modelGetDataModelOptions.crn;
      this.version = modelGetDataModelOptions.version;
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
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a ModelGetDataModelOptions.
     *
     * @return the new ModelGetDataModelOptions instance
     */
    public ModelGetDataModelOptions build() {
      return new ModelGetDataModelOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelGetDataModelOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the ModelGetDataModelOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected ModelGetDataModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a ModelGetDataModelOptions builder
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
   * Gets the version.
   *
   * The identifier for a given state of the data model, ie. current, draft.
   *
   * @return the version
   */
  public String version() {
    return version;
  }
}

