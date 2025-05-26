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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createConfiguratorProcess options.
 */
public class CreateConfiguratorProcessOptions extends GenericModel {

  protected String processName;
  protected String recordType;
  protected String entityType;
  protected Boolean doDerive;
  protected Boolean doMatch;
  protected Boolean doSync;
  protected Boolean doReport;
  protected String assetIds;
  protected ProcessRequestAssetSourceDetails assetSourceDetails;
  protected String initiator;
  protected Boolean doForceMatching;
  protected Boolean doForceDerive;
  protected Boolean doForceEntitySync;
  protected String reportJobList;

  /**
   * Builder.
   */
  public static class Builder {
    private String processName;
    private String recordType;
    private String entityType;
    private Boolean doDerive;
    private Boolean doMatch;
    private Boolean doSync;
    private Boolean doReport;
    private String assetIds;
    private ProcessRequestAssetSourceDetails assetSourceDetails;
    private String initiator;
    private Boolean doForceMatching;
    private Boolean doForceDerive;
    private Boolean doForceEntitySync;
    private String reportJobList;

    private Builder(CreateConfiguratorProcessOptions createConfiguratorProcessOptions) {
      this.processName = createConfiguratorProcessOptions.processName;
      this.recordType = createConfiguratorProcessOptions.recordType;
      this.entityType = createConfiguratorProcessOptions.entityType;
      this.doDerive = createConfiguratorProcessOptions.doDerive;
      this.doMatch = createConfiguratorProcessOptions.doMatch;
      this.doSync = createConfiguratorProcessOptions.doSync;
      this.doReport = createConfiguratorProcessOptions.doReport;
      this.assetIds = createConfiguratorProcessOptions.assetIds;
      this.assetSourceDetails = createConfiguratorProcessOptions.assetSourceDetails;
      this.initiator = createConfiguratorProcessOptions.initiator;
      this.doForceMatching = createConfiguratorProcessOptions.doForceMatching;
      this.doForceDerive = createConfiguratorProcessOptions.doForceDerive;
      this.doForceEntitySync = createConfiguratorProcessOptions.doForceEntitySync;
      this.reportJobList = createConfiguratorProcessOptions.reportJobList;
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
     * Set the doMatch.
     *
     * @param doMatch the doMatch
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doMatch(Boolean doMatch) {
      this.doMatch = doMatch;
      return this;
    }

    /**
     * Set the doSync.
     *
     * @param doSync the doSync
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doSync(Boolean doSync) {
      this.doSync = doSync;
      return this;
    }

    /**
     * Set the doReport.
     *
     * @param doReport the doReport
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doReport(Boolean doReport) {
      this.doReport = doReport;
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
     * Set the initiator.
     *
     * @param initiator the initiator
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder initiator(String initiator) {
      this.initiator = initiator;
      return this;
    }

    /**
     * Set the doForceMatching.
     *
     * @param doForceMatching the doForceMatching
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doForceMatching(Boolean doForceMatching) {
      this.doForceMatching = doForceMatching;
      return this;
    }

    /**
     * Set the doForceDerive.
     *
     * @param doForceDerive the doForceDerive
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doForceDerive(Boolean doForceDerive) {
      this.doForceDerive = doForceDerive;
      return this;
    }

    /**
     * Set the doForceEntitySync.
     *
     * @param doForceEntitySync the doForceEntitySync
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder doForceEntitySync(Boolean doForceEntitySync) {
      this.doForceEntitySync = doForceEntitySync;
      return this;
    }

    /**
     * Set the reportJobList.
     *
     * @param reportJobList the reportJobList
     * @return the CreateConfiguratorProcessOptions builder
     */
    public Builder reportJobList(String reportJobList) {
      this.reportJobList = reportJobList;
      return this;
    }
  }

  protected CreateConfiguratorProcessOptions() { }

  protected CreateConfiguratorProcessOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.processName,
      "processName cannot be null");
    processName = builder.processName;
    recordType = builder.recordType;
    entityType = builder.entityType;
    doDerive = builder.doDerive;
    doMatch = builder.doMatch;
    doSync = builder.doSync;
    doReport = builder.doReport;
    assetIds = builder.assetIds;
    assetSourceDetails = builder.assetSourceDetails;
    initiator = builder.initiator;
    doForceMatching = builder.doForceMatching;
    doForceDerive = builder.doForceDerive;
    doForceEntitySync = builder.doForceEntitySync;
    reportJobList = builder.reportJobList;
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

  /**
   * Gets the doDerive.
   *
   * Flag to enable/disable derive operation for matching process. If do_derive flag is set to true, the rest of the
   * match jobs (do-match, do-sync, report) will get executed even if they are set to false.
   *
   * @return the doDerive
   */
  public Boolean doDerive() {
    return doDerive;
  }

  /**
   * Gets the doMatch.
   *
   * Flag to enable/disable Bulkmatch operation for matching process. If do_match flag is set to true, the rest of the
   * match jobs (do-sync, report) will get executed even if they are set to false.
   *
   * @return the doMatch
   */
  public Boolean doMatch() {
    return doMatch;
  }

  /**
   * Gets the doSync.
   *
   * Flag to enable/disable PersistEntity operation for matching process. If do_sync flag is set to true, the rest of
   * the match jobs (report) will get executed even if they are set to false.
   *
   * @return the doSync
   */
  public Boolean doSync() {
    return doSync;
  }

  /**
   * Gets the doReport.
   *
   * Flag to enable/disable Reporting operation for matching process. If do_sync flag is set to true, the rest of the
   * match jobs (report) will get executed even if they are set to false.
   *
   * @return the doReport
   */
  public Boolean doReport() {
    return doReport;
  }

  /**
   * Gets the assetIds.
   *
   * Comma separated asset ids of assets to be processed by delete_assets and publish_data processes.
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
   * Gets the initiator.
   *
   * User identifier of the initiator of processes. This identifier will be available in the headers of the messaging
   * queue events generated by the initiated process.
   *
   * @return the initiator
   */
  public String initiator() {
    return initiator;
  }

  /**
   * Gets the doForceMatching.
   *
   * Flag to enable/disable force match operation.
   *
   * @return the doForceMatching
   */
  public Boolean doForceMatching() {
    return doForceMatching;
  }

  /**
   * Gets the doForceDerive.
   *
   * Flag to enable/disable force derive operation.
   *
   * @return the doForceDerive
   */
  public Boolean doForceDerive() {
    return doForceDerive;
  }

  /**
   * Gets the doForceEntitySync.
   *
   * Flag to enable/disable force entity sync operation.
   *
   * @return the doForceEntitySync
   */
  public Boolean doForceEntitySync() {
    return doForceEntitySync;
  }

  /**
   * Gets the reportJobList.
   *
   * The list of jobs that should be considered during reporting.
   *
   * @return the reportJobList
   */
  public String reportJobList() {
    return reportJobList;
  }
}

