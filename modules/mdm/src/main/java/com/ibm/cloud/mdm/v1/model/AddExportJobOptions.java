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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addExportJob options.
 */
public class AddExportJobOptions extends GenericModel {

  protected String id;
  protected Map<String, String> exportJobs;
  protected String exportsId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, String> exportJobs;
    private String exportsId;

    private Builder(AddExportJobOptions addExportJobOptions) {
      this.id = addExportJobOptions.id;
      this.exportJobs = addExportJobOptions.exportJobs;
      this.exportsId = addExportJobOptions.exportsId;
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
     * Builds a AddExportJobOptions.
     *
     * @return the new AddExportJobOptions instance
     */
    public AddExportJobOptions build() {
      return new AddExportJobOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AddExportJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the exportJobs.
     *
     * @param exportJobs the exportJobs
     * @return the AddExportJobOptions builder
     */
    public Builder exportJobs(Map<String, String> exportJobs) {
      this.exportJobs = exportJobs;
      return this;
    }

    /**
     * Set the exportsId.
     *
     * @param exportsId the exportsId
     * @return the AddExportJobOptions builder
     */
    public Builder exportsId(String exportsId) {
      this.exportsId = exportsId;
      return this;
    }

    /**
     * Set the uiExports.
     *
     * @param uiExports the uiExports
     * @return the AddExportJobOptions builder
     */
    public Builder uiExports(UIExports uiExports) {
      this.exportJobs = uiExports.exportJobs();
      this.exportsId = uiExports.exportsId();
      return this;
    }
  }

  protected AddExportJobOptions() { }

  protected AddExportJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    exportJobs = builder.exportJobs;
    exportsId = builder.exportsId;
  }

  /**
   * New builder.
   *
   * @return a AddExportJobOptions builder
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
   * Gets the exportJobs.
   *
   * @return the exportJobs
   */
  public Map<String, String> exportJobs() {
    return exportJobs;
  }

  /**
   * Gets the exportsId.
   *
   * @return the exportsId
   */
  public String exportsId() {
    return exportsId;
  }
}

