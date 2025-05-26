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
 * The replaceModelGovernanceMetadata options.
 */
public class ReplaceModelGovernanceMetadataOptions extends GenericModel {

  protected Map<String, GovernanceMetadataEntityType> entityTypes;
  protected Map<String, GovernanceMetadataRecordType> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, GovernanceMetadataEntityType> entityTypes;
    private Map<String, GovernanceMetadataRecordType> recordTypes;

    private Builder(ReplaceModelGovernanceMetadataOptions replaceModelGovernanceMetadataOptions) {
      this.entityTypes = replaceModelGovernanceMetadataOptions.entityTypes;
      this.recordTypes = replaceModelGovernanceMetadataOptions.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceModelGovernanceMetadataOptions.
     *
     * @return the new ReplaceModelGovernanceMetadataOptions instance
     */
    public ReplaceModelGovernanceMetadataOptions build() {
      return new ReplaceModelGovernanceMetadataOptions(this);
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the ReplaceModelGovernanceMetadataOptions builder
     */
    public Builder entityTypes(Map<String, GovernanceMetadataEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the ReplaceModelGovernanceMetadataOptions builder
     */
    public Builder recordTypes(Map<String, GovernanceMetadataRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the governanceMetadata.
     *
     * @param governanceMetadata the governanceMetadata
     * @return the ReplaceModelGovernanceMetadataOptions builder
     */
    public Builder governanceMetadata(GovernanceMetadata governanceMetadata) {
      this.entityTypes = governanceMetadata.entityTypes();
      this.recordTypes = governanceMetadata.recordTypes();
      return this;
    }
  }

  protected ReplaceModelGovernanceMetadataOptions() { }

  protected ReplaceModelGovernanceMetadataOptions(Builder builder) {
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelGovernanceMetadataOptions builder
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

