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
 * The dataGetExportDownload options.
 */
public class DataGetExportDownloadOptions extends GenericModel {

  protected String exportId;

  /**
   * Builder.
   */
  public static class Builder {
    private String exportId;

    private Builder(DataGetExportDownloadOptions dataGetExportDownloadOptions) {
      this.exportId = dataGetExportDownloadOptions.exportId;
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
     * Builds a DataGetExportDownloadOptions.
     *
     * @return the new DataGetExportDownloadOptions instance
     */
    public DataGetExportDownloadOptions build() {
      return new DataGetExportDownloadOptions(this);
    }

    /**
     * Set the exportId.
     *
     * @param exportId the exportId
     * @return the DataGetExportDownloadOptions builder
     */
    public Builder exportId(String exportId) {
      this.exportId = exportId;
      return this;
    }
  }

  protected DataGetExportDownloadOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.exportId,
      "exportId cannot be empty");
    exportId = builder.exportId;
  }

  /**
   * New builder.
   *
   * @return a DataGetExportDownloadOptions builder
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

