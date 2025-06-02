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
 * The exportModelData options.
 */
public class ExportModelDataOptions extends GenericModel {

  protected String outputPath;

  /**
   * Builder.
   */
  public static class Builder {
    private String outputPath;

    /**
     * Instantiates a new Builder from an existing ExportModelDataOptions instance.
     *
     * @param exportModelDataOptions the instance to initialize the Builder with
     */
    private Builder(ExportModelDataOptions exportModelDataOptions) {
      this.outputPath = exportModelDataOptions.outputPath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExportModelDataOptions.
     *
     * @return the new ExportModelDataOptions instance
     */
    public ExportModelDataOptions build() {
      return new ExportModelDataOptions(this);
    }

    /**
     * Set the outputPath.
     *
     * @param outputPath the outputPath
     * @return the ExportModelDataOptions builder
     */
    public Builder outputPath(String outputPath) {
      this.outputPath = outputPath;
      return this;
    }
  }

  protected ExportModelDataOptions() { }

  protected ExportModelDataOptions(Builder builder) {
    outputPath = builder.outputPath;
  }

  /**
   * New builder.
   *
   * @return a ExportModelDataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the outputPath.
   *
   * The output path under for the exported data.
   *
   * @return the outputPath
   */
  public String outputPath() {
    return outputPath;
  }
}

