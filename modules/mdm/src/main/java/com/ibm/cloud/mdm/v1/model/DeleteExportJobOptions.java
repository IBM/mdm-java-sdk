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
 * The deleteExportJob options.
 */
public class DeleteExportJobOptions extends GenericModel {

  protected String id;
  protected String exportJobId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String exportJobId;

    private Builder(DeleteExportJobOptions deleteExportJobOptions) {
      this.id = deleteExportJobOptions.id;
      this.exportJobId = deleteExportJobOptions.exportJobId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DeleteExportJobOptions.
     *
     * @return the new DeleteExportJobOptions instance
     */
    public DeleteExportJobOptions build() {
      return new DeleteExportJobOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteExportJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the exportJobId.
     *
     * @param exportJobId the exportJobId
     * @return the DeleteExportJobOptions builder
     */
    public Builder exportJobId(String exportJobId) {
      this.exportJobId = exportJobId;
      return this;
    }
  }

  protected DeleteExportJobOptions() { }

  protected DeleteExportJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    exportJobId = builder.exportJobId;
  }

  /**
   * New builder.
   *
   * @return a DeleteExportJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the exports doc.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the exportJobId.
   *
   * Export Job Id to be deleted.
   *
   * @return the exportJobId
   */
  public String exportJobId() {
    return exportJobId;
  }
}

