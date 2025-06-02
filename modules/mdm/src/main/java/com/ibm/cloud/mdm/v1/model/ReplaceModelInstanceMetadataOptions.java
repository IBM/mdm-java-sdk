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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceModelInstanceMetadata options.
 */
public class ReplaceModelInstanceMetadataOptions extends GenericModel {

  protected List<InstanceMetadataProject> projects;
  protected String workflowConfigurationId;
  protected Boolean generateConnectedDataAsset;
  protected Map<String, InstanceMetadataWorkflow> workflows;
  protected String label;
  protected String cosEndpoint;
  protected String modeOfOperation;
  protected String cosCrn;
  protected InstanceMetadataBulkloadBucket bulkloadBucket;
  protected String connectionId;
  protected Boolean governanceEnabled;
  protected Boolean createApiKey;
  protected List<InstanceMetadataStreamConnection> streamConnection;
  protected List<InstanceMetadataCatalog> catalogs;
  protected String jobProjectId;
  protected String workflowTypeId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<InstanceMetadataProject> projects;
    private String workflowConfigurationId;
    private Boolean generateConnectedDataAsset;
    private Map<String, InstanceMetadataWorkflow> workflows;
    private String label;
    private String cosEndpoint;
    private String modeOfOperation;
    private String cosCrn;
    private InstanceMetadataBulkloadBucket bulkloadBucket;
    private String connectionId;
    private Boolean governanceEnabled;
    private Boolean createApiKey;
    private List<InstanceMetadataStreamConnection> streamConnection;
    private List<InstanceMetadataCatalog> catalogs;
    private String jobProjectId;
    private String workflowTypeId;

    /**
     * Instantiates a new Builder from an existing ReplaceModelInstanceMetadataOptions instance.
     *
     * @param replaceModelInstanceMetadataOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions) {
      this.projects = replaceModelInstanceMetadataOptions.projects;
      this.workflowConfigurationId = replaceModelInstanceMetadataOptions.workflowConfigurationId;
      this.generateConnectedDataAsset = replaceModelInstanceMetadataOptions.generateConnectedDataAsset;
      this.workflows = replaceModelInstanceMetadataOptions.workflows;
      this.label = replaceModelInstanceMetadataOptions.label;
      this.cosEndpoint = replaceModelInstanceMetadataOptions.cosEndpoint;
      this.modeOfOperation = replaceModelInstanceMetadataOptions.modeOfOperation;
      this.cosCrn = replaceModelInstanceMetadataOptions.cosCrn;
      this.bulkloadBucket = replaceModelInstanceMetadataOptions.bulkloadBucket;
      this.connectionId = replaceModelInstanceMetadataOptions.connectionId;
      this.governanceEnabled = replaceModelInstanceMetadataOptions.governanceEnabled;
      this.createApiKey = replaceModelInstanceMetadataOptions.createApiKey;
      this.streamConnection = replaceModelInstanceMetadataOptions.streamConnection;
      this.catalogs = replaceModelInstanceMetadataOptions.catalogs;
      this.jobProjectId = replaceModelInstanceMetadataOptions.jobProjectId;
      this.workflowTypeId = replaceModelInstanceMetadataOptions.workflowTypeId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReplaceModelInstanceMetadataOptions.
     *
     * @return the new ReplaceModelInstanceMetadataOptions instance
     */
    public ReplaceModelInstanceMetadataOptions build() {
      return new ReplaceModelInstanceMetadataOptions(this);
    }

    /**
     * Adds a new element to projects.
     *
     * @param projects the new element to be added
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder addProjects(InstanceMetadataProject projects) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(projects,
        "projects cannot be null");
      if (this.projects == null) {
        this.projects = new ArrayList<InstanceMetadataProject>();
      }
      this.projects.add(projects);
      return this;
    }

    /**
     * Adds a new element to streamConnection.
     *
     * @param streamConnection the new element to be added
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder addStreamConnection(InstanceMetadataStreamConnection streamConnection) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(streamConnection,
        "streamConnection cannot be null");
      if (this.streamConnection == null) {
        this.streamConnection = new ArrayList<InstanceMetadataStreamConnection>();
      }
      this.streamConnection.add(streamConnection);
      return this;
    }

    /**
     * Adds a new element to catalogs.
     *
     * @param catalogs the new element to be added
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder addCatalogs(InstanceMetadataCatalog catalogs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogs,
        "catalogs cannot be null");
      if (this.catalogs == null) {
        this.catalogs = new ArrayList<InstanceMetadataCatalog>();
      }
      this.catalogs.add(catalogs);
      return this;
    }

    /**
     * Set the projects.
     * Existing projects will be replaced.
     *
     * @param projects the projects
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder projects(List<InstanceMetadataProject> projects) {
      this.projects = projects;
      return this;
    }

    /**
     * Set the workflowConfigurationId.
     *
     * @param workflowConfigurationId the workflowConfigurationId
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder workflowConfigurationId(String workflowConfigurationId) {
      this.workflowConfigurationId = workflowConfigurationId;
      return this;
    }

    /**
     * Set the generateConnectedDataAsset.
     *
     * @param generateConnectedDataAsset the generateConnectedDataAsset
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder generateConnectedDataAsset(Boolean generateConnectedDataAsset) {
      this.generateConnectedDataAsset = generateConnectedDataAsset;
      return this;
    }

    /**
     * Set the workflows.
     *
     * @param workflows the workflows
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder workflows(Map<String, InstanceMetadataWorkflow> workflows) {
      this.workflows = workflows;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }

    /**
     * Set the modeOfOperation.
     *
     * @param modeOfOperation the modeOfOperation
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder modeOfOperation(String modeOfOperation) {
      this.modeOfOperation = modeOfOperation;
      return this;
    }

    /**
     * Set the cosCrn.
     *
     * @param cosCrn the cosCrn
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder cosCrn(String cosCrn) {
      this.cosCrn = cosCrn;
      return this;
    }

    /**
     * Set the bulkloadBucket.
     *
     * @param bulkloadBucket the bulkloadBucket
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder bulkloadBucket(InstanceMetadataBulkloadBucket bulkloadBucket) {
      this.bulkloadBucket = bulkloadBucket;
      return this;
    }

    /**
     * Set the connectionId.
     *
     * @param connectionId the connectionId
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder connectionId(String connectionId) {
      this.connectionId = connectionId;
      return this;
    }

    /**
     * Set the governanceEnabled.
     *
     * @param governanceEnabled the governanceEnabled
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder governanceEnabled(Boolean governanceEnabled) {
      this.governanceEnabled = governanceEnabled;
      return this;
    }

    /**
     * Set the createApiKey.
     *
     * @param createApiKey the createApiKey
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder createApiKey(Boolean createApiKey) {
      this.createApiKey = createApiKey;
      return this;
    }

    /**
     * Set the streamConnection.
     * Existing streamConnection will be replaced.
     *
     * @param streamConnection the streamConnection
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder streamConnection(List<InstanceMetadataStreamConnection> streamConnection) {
      this.streamConnection = streamConnection;
      return this;
    }

    /**
     * Set the catalogs.
     * Existing catalogs will be replaced.
     *
     * @param catalogs the catalogs
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder catalogs(List<InstanceMetadataCatalog> catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Set the jobProjectId.
     *
     * @param jobProjectId the jobProjectId
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder jobProjectId(String jobProjectId) {
      this.jobProjectId = jobProjectId;
      return this;
    }

    /**
     * Set the workflowTypeId.
     *
     * @param workflowTypeId the workflowTypeId
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder workflowTypeId(String workflowTypeId) {
      this.workflowTypeId = workflowTypeId;
      return this;
    }
  }

  protected ReplaceModelInstanceMetadataOptions() { }

  protected ReplaceModelInstanceMetadataOptions(Builder builder) {
    projects = builder.projects;
    workflowConfigurationId = builder.workflowConfigurationId;
    generateConnectedDataAsset = builder.generateConnectedDataAsset;
    workflows = builder.workflows;
    label = builder.label;
    cosEndpoint = builder.cosEndpoint;
    modeOfOperation = builder.modeOfOperation;
    cosCrn = builder.cosCrn;
    bulkloadBucket = builder.bulkloadBucket;
    connectionId = builder.connectionId;
    governanceEnabled = builder.governanceEnabled;
    createApiKey = builder.createApiKey;
    streamConnection = builder.streamConnection;
    catalogs = builder.catalogs;
    jobProjectId = builder.jobProjectId;
    workflowTypeId = builder.workflowTypeId;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelInstanceMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projects.
   *
   * Collection of project objects as available in Watson Knowledge Catalog (WKC).
   *
   * @return the projects
   */
  public List<InstanceMetadataProject> projects() {
    return projects;
  }

  /**
   * Gets the workflowConfigurationId.
   *
   * The workflow configuration id created in WKC workflow for a Match360 instance.
   *
   * @return the workflowConfigurationId
   */
  public String workflowConfigurationId() {
    return workflowConfigurationId;
  }

  /**
   * Gets the generateConnectedDataAsset.
   *
   * Generate connected data asset indicator, true or false.
   *
   * @return the generateConnectedDataAsset
   */
  public Boolean generateConnectedDataAsset() {
    return generateConnectedDataAsset;
  }

  /**
   * Gets the workflows.
   *
   * Collection of workflow objects configured with current instnce.
   *
   * @return the workflows
   */
  public Map<String, InstanceMetadataWorkflow> workflows() {
    return workflows;
  }

  /**
   * Gets the label.
   *
   * Label for instance metadata.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the cosEndpoint.
   *
   * Endpoint of a cloud object storage.
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the modeOfOperation.
   *
   * Match360 modes of operation-&gt; operational_cache, probabilistic_search or usual mode(when not present).
   *
   * @return the modeOfOperation
   */
  public String modeOfOperation() {
    return modeOfOperation;
  }

  /**
   * Gets the cosCrn.
   *
   * The cloud resource Name of cloud object storage.
   *
   * @return the cosCrn
   */
  public String cosCrn() {
    return cosCrn;
  }

  /**
   * Gets the bulkloadBucket.
   *
   * Bulkload Bucket credentials.
   *
   * @return the bulkloadBucket
   */
  public InstanceMetadataBulkloadBucket bulkloadBucket() {
    return bulkloadBucket;
  }

  /**
   * Gets the connectionId.
   *
   * The unique identifier of a connection to a Match360 instance.
   *
   * @return the connectionId
   */
  public String connectionId() {
    return connectionId;
  }

  /**
   * Gets the governanceEnabled.
   *
   * Governance enabled indicator, true or false.
   *
   * @return the governanceEnabled
   */
  public Boolean governanceEnabled() {
    return governanceEnabled;
  }

  /**
   * Gets the createApiKey.
   *
   * Generate API key from service id, true or false.
   *
   * @return the createApiKey
   */
  public Boolean createApiKey() {
    return createApiKey;
  }

  /**
   * Gets the streamConnection.
   *
   * Stream connection details.
   *
   * @return the streamConnection
   */
  public List<InstanceMetadataStreamConnection> streamConnection() {
    return streamConnection;
  }

  /**
   * Gets the catalogs.
   *
   * Collection of catalog objects as available in Watson Knowledge Catalog (WKC).
   *
   * @return the catalogs
   */
  public List<InstanceMetadataCatalog> catalogs() {
    return catalogs;
  }

  /**
   * Gets the jobProjectId.
   *
   * The unique identifier of a project for the jobs.
   *
   * @return the jobProjectId
   */
  public String jobProjectId() {
    return jobProjectId;
  }

  /**
   * Gets the workflowTypeId.
   *
   * The workflow type id created in WKC workflow services.
   *
   * @return the workflowTypeId
   */
  public String workflowTypeId() {
    return workflowTypeId;
  }
}

