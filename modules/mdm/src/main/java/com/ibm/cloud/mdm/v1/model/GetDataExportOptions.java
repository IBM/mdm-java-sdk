/*
 * (C) Copyright IBM Corp. 2022.
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
 * The getDataExport options.
 */
public class GetDataExportOptions extends GenericModel {

  protected String exportId;

  /**
   * Builder.
   */
  public static class Builder {
    private String exportId;

    private Builder(GetDataExportOptions getDataExportOptions) {
      this.exportId = getDataExportOptions.exportId;
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
     * Builds a GetDataExportOptions.
     *
     * @return the new GetDataExportOptions instance
     */
    public GetDataExportOptions build() {
      return new GetDataExportOptions(this);
    }

    /**
     * Set the exportId.
     *
     * @param exportId the exportId
     * @return the GetDataExportOptions builder
     */
    public Builder exportId(String exportId) {
      this.exportId = exportId;
      return this;
    }
  }

  protected GetDataExportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.exportId,
      "exportId cannot be empty");
    exportId = builder.exportId;
  }

  /**
   * New builder.
   *
   * @return a GetDataExportOptions builder
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

