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
 * cos details for asset sources.
 */
public class PublishDataRequestCosDetails extends GenericModel {

  protected PublishDataRequestCosDetailsProject project;
  protected PublishDataRequestCosDetailsCatalog catalog;

  /**
   * Builder.
   */
  public static class Builder {
    private PublishDataRequestCosDetailsProject project;
    private PublishDataRequestCosDetailsCatalog catalog;

    private Builder(PublishDataRequestCosDetails publishDataRequestCosDetails) {
      this.project = publishDataRequestCosDetails.project;
      this.catalog = publishDataRequestCosDetails.catalog;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublishDataRequestCosDetails.
     *
     * @return the new PublishDataRequestCosDetails instance
     */
    public PublishDataRequestCosDetails build() {
      return new PublishDataRequestCosDetails(this);
    }

    /**
     * Set the project.
     *
     * @param project the project
     * @return the PublishDataRequestCosDetails builder
     */
    public Builder project(PublishDataRequestCosDetailsProject project) {
      this.project = project;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PublishDataRequestCosDetails builder
     */
    public Builder catalog(PublishDataRequestCosDetailsCatalog catalog) {
      this.catalog = catalog;
      return this;
    }
  }

  protected PublishDataRequestCosDetails(Builder builder) {
    project = builder.project;
    catalog = builder.catalog;
  }

  /**
   * New builder.
   *
   * @return a PublishDataRequestCosDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the project.
   *
   * Cos details for project.
   *
   * @return the project
   */
  public PublishDataRequestCosDetailsProject project() {
    return project;
  }

  /**
   * Gets the catalog.
   *
   * Cos details for catalog.
   *
   * @return the catalog
   */
  public PublishDataRequestCosDetailsCatalog catalog() {
    return catalog;
  }
}

