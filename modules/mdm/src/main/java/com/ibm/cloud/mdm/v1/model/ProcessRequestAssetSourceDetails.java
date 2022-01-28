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
 * The asset source details for the data asset to be published for publish_data process.
 */
public class ProcessRequestAssetSourceDetails extends GenericModel {

  protected ProcessRequestAssetSourceDetailsProject project;
  protected ProcessRequestAssetSourceDetailsCatalog catalog;

  /**
   * Builder.
   */
  public static class Builder {
    private ProcessRequestAssetSourceDetailsProject project;
    private ProcessRequestAssetSourceDetailsCatalog catalog;

    private Builder(ProcessRequestAssetSourceDetails processRequestAssetSourceDetails) {
      this.project = processRequestAssetSourceDetails.project;
      this.catalog = processRequestAssetSourceDetails.catalog;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ProcessRequestAssetSourceDetails.
     *
     * @return the new ProcessRequestAssetSourceDetails instance
     */
    public ProcessRequestAssetSourceDetails build() {
      return new ProcessRequestAssetSourceDetails(this);
    }

    /**
     * Set the project.
     *
     * @param project the project
     * @return the ProcessRequestAssetSourceDetails builder
     */
    public Builder project(ProcessRequestAssetSourceDetailsProject project) {
      this.project = project;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the ProcessRequestAssetSourceDetails builder
     */
    public Builder catalog(ProcessRequestAssetSourceDetailsCatalog catalog) {
      this.catalog = catalog;
      return this;
    }
  }

  protected ProcessRequestAssetSourceDetails(Builder builder) {
    project = builder.project;
    catalog = builder.catalog;
  }

  /**
   * New builder.
   *
   * @return a ProcessRequestAssetSourceDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the project.
   *
   * The asset source details for project data asset.
   *
   * @return the project
   */
  public ProcessRequestAssetSourceDetailsProject project() {
    return project;
  }

  /**
   * Gets the catalog.
   *
   * The asset source details for catalog data asset.
   *
   * @return the catalog
   */
  public ProcessRequestAssetSourceDetailsCatalog catalog() {
    return catalog;
  }
}

