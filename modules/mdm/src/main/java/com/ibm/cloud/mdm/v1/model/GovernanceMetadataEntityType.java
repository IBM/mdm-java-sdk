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
 * A single entity type.
 */
public class GovernanceMetadataEntityType extends GenericModel {

  @SerializedName("apply_governance")
  protected Boolean applyGovernance;
  @SerializedName("asset_id")
  protected String assetId;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean applyGovernance;
    private String assetId;

    /**
     * Instantiates a new Builder from an existing GovernanceMetadataEntityType instance.
     *
     * @param governanceMetadataEntityType the instance to initialize the Builder with
     */
    private Builder(GovernanceMetadataEntityType governanceMetadataEntityType) {
      this.applyGovernance = governanceMetadataEntityType.applyGovernance;
      this.assetId = governanceMetadataEntityType.assetId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assetId the assetId
     */
    public Builder(String assetId) {
      this.assetId = assetId;
    }

    /**
     * Builds a GovernanceMetadataEntityType.
     *
     * @return the new GovernanceMetadataEntityType instance
     */
    public GovernanceMetadataEntityType build() {
      return new GovernanceMetadataEntityType(this);
    }

    /**
     * Set the applyGovernance.
     *
     * @param applyGovernance the applyGovernance
     * @return the GovernanceMetadataEntityType builder
     */
    public Builder applyGovernance(Boolean applyGovernance) {
      this.applyGovernance = applyGovernance;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the GovernanceMetadataEntityType builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }
  }

  protected GovernanceMetadataEntityType() { }

  protected GovernanceMetadataEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    applyGovernance = builder.applyGovernance;
    assetId = builder.assetId;
  }

  /**
   * New builder.
   *
   * @return a GovernanceMetadataEntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the applyGovernance.
   *
   * Apply governance indicator, true or false.
   *
   * @return the applyGovernance
   */
  public Boolean applyGovernance() {
    return applyGovernance;
  }

  /**
   * Gets the assetId.
   *
   * The unique identifier of a connected data asset.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }
}

