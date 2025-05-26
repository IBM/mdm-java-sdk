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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Stream connection details.
 */
public class InstanceMetadataConnenctionDetails extends GenericModel {

  @SerializedName("asset_scope")
  protected String assetScope;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("container_id")
  protected String containerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetScope;
    private String assetId;
    private String containerId;

    private Builder(InstanceMetadataConnenctionDetails instanceMetadataConnenctionDetails) {
      this.assetScope = instanceMetadataConnenctionDetails.assetScope;
      this.assetId = instanceMetadataConnenctionDetails.assetId;
      this.containerId = instanceMetadataConnenctionDetails.containerId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetScope the assetScope
     * @param assetId the assetId
     * @param containerId the containerId
     */
    public Builder(String assetScope, String assetId, String containerId) {
      this.assetScope = assetScope;
      this.assetId = assetId;
      this.containerId = containerId;
    }

    /**
     * Builds a InstanceMetadataConnenctionDetails.
     *
     * @return the new InstanceMetadataConnenctionDetails instance
     */
    public InstanceMetadataConnenctionDetails build() {
      return new InstanceMetadataConnenctionDetails(this);
    }

    /**
     * Set the assetScope.
     *
     * @param assetScope the assetScope
     * @return the InstanceMetadataConnenctionDetails builder
     */
    public Builder assetScope(String assetScope) {
      this.assetScope = assetScope;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the InstanceMetadataConnenctionDetails builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the InstanceMetadataConnenctionDetails builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }
  }

  protected InstanceMetadataConnenctionDetails() { }

  protected InstanceMetadataConnenctionDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetScope,
      "assetScope cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    assetScope = builder.assetScope;
    assetId = builder.assetId;
    containerId = builder.containerId;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataConnenctionDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetScope.
   *
   * Asset scope for given Stream connection.
   *
   * @return the assetScope
   */
  public String assetScope() {
    return assetScope;
  }

  /**
   * Gets the assetId.
   *
   * Asset id.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the containerId.
   *
   * Container id.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }
}

