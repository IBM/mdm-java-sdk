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
 * The getDataExportDownload options.
 */
public class GetDataExportDownloadOptions extends GenericModel {

  protected String exportId;

  /**
   * Builder.
   */
  public static class Builder {
    private String exportId;

    /**
     * Instantiates a new Builder from an existing GetDataExportDownloadOptions instance.
     *
     * @param getDataExportDownloadOptions the instance to initialize the Builder with
     */
    private Builder(GetDataExportDownloadOptions getDataExportDownloadOptions) {
      this.exportId = getDataExportDownloadOptions.exportId;
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
     * Builds a GetDataExportDownloadOptions.
     *
     * @return the new GetDataExportDownloadOptions instance
     */
    public GetDataExportDownloadOptions build() {
      return new GetDataExportDownloadOptions(this);
    }

    /**
     * Set the exportId.
     *
     * @param exportId the exportId
     * @return the GetDataExportDownloadOptions builder
     */
    public Builder exportId(String exportId) {
      this.exportId = exportId;
      return this;
    }
  }

  protected GetDataExportDownloadOptions() { }

  protected GetDataExportDownloadOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.exportId,
      "exportId cannot be empty");
    exportId = builder.exportId;
  }

  /**
   * New builder.
   *
   * @return a GetDataExportDownloadOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the exportId.
   *
   * The ID of the export. This ID is equivalent to the job ID of the export job.
   *
   * @return the exportId
   */
  public String exportId() {
    return exportId;
  }
}

