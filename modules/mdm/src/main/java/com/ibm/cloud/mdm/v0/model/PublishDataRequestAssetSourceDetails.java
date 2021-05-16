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
 * The asset source details for the data asset to be published.
 */
public class PublishDataRequestAssetSourceDetails extends GenericModel {

  protected PublishDataRequestAssetSourceDetailsProject project;
  protected PublishDataRequestAssetSourceDetailsCatalog catalog;

  /**
   * Builder.
   */
  public static class Builder {
    private PublishDataRequestAssetSourceDetailsProject project;
    private PublishDataRequestAssetSourceDetailsCatalog catalog;

    private Builder(PublishDataRequestAssetSourceDetails publishDataRequestAssetSourceDetails) {
      this.project = publishDataRequestAssetSourceDetails.project;
      this.catalog = publishDataRequestAssetSourceDetails.catalog;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublishDataRequestAssetSourceDetails.
     *
     * @return the new PublishDataRequestAssetSourceDetails instance
     */
    public PublishDataRequestAssetSourceDetails build() {
      return new PublishDataRequestAssetSourceDetails(this);
    }

    /**
     * Set the project.
     *
     * @param project the project
     * @return the PublishDataRequestAssetSourceDetails builder
     */
    public Builder project(PublishDataRequestAssetSourceDetailsProject project) {
      this.project = project;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PublishDataRequestAssetSourceDetails builder
     */
    public Builder catalog(PublishDataRequestAssetSourceDetailsCatalog catalog) {
      this.catalog = catalog;
      return this;
    }
  }

  protected PublishDataRequestAssetSourceDetails(Builder builder) {
    project = builder.project;
    catalog = builder.catalog;
  }

  /**
   * New builder.
   *
   * @return a PublishDataRequestAssetSourceDetails builder
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
  public PublishDataRequestAssetSourceDetailsProject project() {
    return project;
  }

  /**
   * Gets the catalog.
   *
   * The asset source details for catalog data asset.
   *
   * @return the catalog
   */
  public PublishDataRequestAssetSourceDetailsCatalog catalog() {
    return catalog;
  }
}

