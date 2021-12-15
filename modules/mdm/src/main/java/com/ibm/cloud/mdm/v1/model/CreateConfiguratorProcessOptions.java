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
package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createConfiguratorProcess options.
 */
public class CreateConfiguratorProcessOptions extends GenericModel {

  protected String processName;
  protected Boolean doDerive;
  protected String assetIds;
  protected ProcessRequestAssetSourceDetails assetSourceDetails;
  protected String recordType;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private String processName;
    private Boolean doDerive;
    private String assetIds;
    private ProcessRequestAssetSourceDetails assetSourceDetails;
    private String recordType;
    private String entityType;

    private Builder(CreateConfiguratorProcessOptions createConfiguratorProcessOptions) {
      this.processName = createConfiguratorProcessOptions.processName;
      this.doDerive = createConfiguratorProcessOptions.doDerive;
      this.assetIds = createConfiguratorProcessOptions.assetIds;
      this.assetSourceDetails = createConfiguratorProcessOptions.assetSourceDetails;
      this.recordType = createConfiguratorProcessOptions.recordType;
      this.entityType = createConfiguratorProcessOptions.entityType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param processName the processName
     */
    public Builder(String processName) {
      this.processName = processName;
    }

    /**
     * Builds a CreateConfiguratorProcessOptions.
     *
     * @return the new CreateConfiguratorProcessOptions instance
     */
    public CreateConfiguratorProcessOptions build() {
      return new CreateConfiguratorProcessOptions(this);
    }

    /**
     * Set the processName.
     *
     * @param processName the processName
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder processName(String processName) {
      this.processName = processName;
      return this;
    }

    /**
     * Set the doDerive.
     *
     * @param doDerive the doDerive
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doDerive(Boolean doDerive) {
      this.doDerive = doDerive;
      return this;
    }

    /**
     * Set the assetIds.
     *
     * @param assetIds the assetIds
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder assetIds(String assetIds) {
      this.assetIds = assetIds;
      return this;
    }

    /**
     * Set the assetSourceDetails.
     *
     * @param assetSourceDetails the assetSourceDetails
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder assetSourceDetails(ProcessRequestAssetSourceDetails assetSourceDetails) {
      this.assetSourceDetails = assetSourceDetails;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected CreateConfiguratorProcessOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.processName,
      "processName cannot be null");
    processName = builder.processName;
    doDerive = builder.doDerive;
    assetIds = builder.assetIds;
    assetSourceDetails = builder.assetSourceDetails;
    recordType = builder.recordType;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a CreateConfiguratorProcessOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the processName.
   *
   * The name of the Process to be created.
   *
   * @return the processName
   */
  public String processName() {
    return processName;
  }

  /**
   * Gets the doDerive.
   *
   * Flag to enable/disable derive operation for match process.
   *
   * @return the doDerive
   */
  public Boolean doDerive() {
    return doDerive;
  }

  /**
   * Gets the assetIds.
   *
   * Asset ids of assets to be deleted, separated by commas, for the delete_assets process.
   *
   * @return the assetIds
   */
  public String assetIds() {
    return assetIds;
  }

  /**
   * Gets the assetSourceDetails.
   *
   * The asset source details for the data asset to be published for publish_data process.
   *
   * @return the assetSourceDetails
   */
  public ProcessRequestAssetSourceDetails assetSourceDetails() {
    return assetSourceDetails;
  }

  /**
   * Gets the recordType.
   *
   * The record type which needs to be processed for match and publish_data processes.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * The entity type which needs to be processed for match process.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }
}

