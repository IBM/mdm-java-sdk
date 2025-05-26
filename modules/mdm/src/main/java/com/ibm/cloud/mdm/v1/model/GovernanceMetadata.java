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
 * Wrapper object for connected data asset for record types and entity types.
 */
public class GovernanceMetadata extends GenericModel {

  @SerializedName("entity_types")
  protected Map<String, GovernanceMetadataEntityType> entityTypes;
  @SerializedName("record_types")
  protected Map<String, GovernanceMetadataRecordType> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, GovernanceMetadataEntityType> entityTypes;
    private Map<String, GovernanceMetadataRecordType> recordTypes;

    private Builder(GovernanceMetadata governanceMetadata) {
      this.entityTypes = governanceMetadata.entityTypes;
      this.recordTypes = governanceMetadata.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GovernanceMetadata.
     *
     * @return the new GovernanceMetadata instance
     */
    public GovernanceMetadata build() {
      return new GovernanceMetadata(this);
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the GovernanceMetadata builder
     */
    public Builder entityTypes(Map<String, GovernanceMetadataEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the GovernanceMetadata builder
     */
    public Builder recordTypes(Map<String, GovernanceMetadataRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected GovernanceMetadata() { }

  protected GovernanceMetadata(Builder builder) {
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a GovernanceMetadata builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityTypes.
   *
   * Collection of applicable entity types.
   *
   * @return the entityTypes
   */
  public Map<String, GovernanceMetadataEntityType> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Collection of user defined record types.
   *
   * @return the recordTypes
   */
  public Map<String, GovernanceMetadataRecordType> recordTypes() {
    return recordTypes;
  }
}

