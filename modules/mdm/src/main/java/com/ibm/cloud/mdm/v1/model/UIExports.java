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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about UI exports.
 */
public class UIExports extends GenericModel {

  @SerializedName("export_jobs")
  protected Map<String, String> exportJobs;
  @SerializedName("exports_id")
  protected String exportsId;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> exportJobs;
    private String exportsId;

    private Builder(UIExports uiExports) {
      this.exportJobs = uiExports.exportJobs;
      this.exportsId = uiExports.exportsId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIExports.
     *
     * @return the new UIExports instance
     */
    public UIExports build() {
      return new UIExports(this);
    }

    /**
     * Set the exportJobs.
     *
     * @param exportJobs the exportJobs
     * @return the UIExports builder
     */
    public Builder exportJobs(Map<String, String> exportJobs) {
      this.exportJobs = exportJobs;
      return this;
    }

    /**
     * Set the exportsId.
     *
     * @param exportsId the exportsId
     * @return the UIExports builder
     */
    public Builder exportsId(String exportsId) {
      this.exportsId = exportsId;
      return this;
    }
  }

  protected UIExports() { }

  protected UIExports(Builder builder) {
    exportJobs = builder.exportJobs;
    exportsId = builder.exportsId;
  }

  /**
   * New builder.
   *
   * @return a UIExports builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

