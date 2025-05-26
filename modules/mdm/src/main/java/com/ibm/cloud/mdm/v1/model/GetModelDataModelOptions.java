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
 * The getModelDataModel options.
 */
public class GetModelDataModelOptions extends GenericModel {

  protected String version;

  /**
   * Builder.
   */
  public static class Builder {
    private String version;

    private Builder(GetModelDataModelOptions getModelDataModelOptions) {
      this.version = getModelDataModelOptions.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetModelDataModelOptions.
     *
     * @return the new GetModelDataModelOptions instance
     */
    public GetModelDataModelOptions build() {
      return new GetModelDataModelOptions(this);
    }

    /**
     * Set the version.
     *
     * @param version the version
     * @return the GetModelDataModelOptions builder
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }

  protected GetModelDataModelOptions() { }

  protected GetModelDataModelOptions(Builder builder) {
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a GetModelDataModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

