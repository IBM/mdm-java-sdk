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
 * The dataGetExport options.
 */
public class DataGetExportOptions extends GenericModel {

  protected String exportId;

  /**
   * Builder.
   */
  public static class Builder {
    private String exportId;

    private Builder(DataGetExportOptions dataGetExportOptions) {
      this.exportId = dataGetExportOptions.exportId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param exportId the exportId
     */
    public Builder(String exportId) {
      this.exportId = exportId;
    }

    /**
     * Builds a DataGetExportOptions.
     *
     * @return the new DataGetExportOptions instance
     */
    public DataGetExportOptions build() {
      return new DataGetExportOptions(this);
    }

    /**
     * Set the exportId.
     *
     * @param exportId the exportId
     * @return the DataGetExportOptions builder
     */
    public Builder exportId(String exportId) {
      this.exportId = exportId;
      return this;
    }
  }

  protected DataGetExportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.exportId,
      "exportId cannot be empty");
    exportId = builder.exportId;
  }

  /**
   * New builder.
   *
   * @return a DataGetExportOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the exportId.
   *
   * The ID of the export.
   *
   * @return the exportId
   */
  public String exportId() {
    return exportId;
  }
}

