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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single catalog as available in WKC.
 */
public class InstanceMetadataCatalog extends GenericModel {

  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("catalog_instance")
  protected String catalogInstance;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String catalogInstance;

    private Builder(InstanceMetadataCatalog instanceMetadataCatalog) {
      this.catalogId = instanceMetadataCatalog.catalogId;
      this.catalogInstance = instanceMetadataCatalog.catalogInstance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     */
    public Builder(String catalogId) {
      this.catalogId = catalogId;
    }

    /**
     * Builds a InstanceMetadataCatalog.
     *
     * @return the new InstanceMetadataCatalog instance
     */
    public InstanceMetadataCatalog build() {
      return new InstanceMetadataCatalog(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the InstanceMetadataCatalog builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the catalogInstance.
     *
     * @param catalogInstance the catalogInstance
     * @return the InstanceMetadataCatalog builder
     */
    public Builder catalogInstance(String catalogInstance) {
      this.catalogInstance = catalogInstance;
      return this;
    }
  }

  protected InstanceMetadataCatalog(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogId,
      "catalogId cannot be null");
    catalogId = builder.catalogId;
    catalogInstance = builder.catalogInstance;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataCatalog builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * Unique Identifier of the catalog associated with instance.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the catalogInstance.
   *
   * Name of the catalog associated with instance.
   *
   * @return the catalogInstance
   */
  public String catalogInstance() {
    return catalogInstance;
  }
}

