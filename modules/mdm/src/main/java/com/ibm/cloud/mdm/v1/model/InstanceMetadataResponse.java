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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Wrapper object for instance metadata response.
 */
public class InstanceMetadataResponse extends GenericModel {

  protected List<InstanceMetadataResponseProject> projects;
  @SerializedName("workflow_configuration_id")
  protected String workflowConfigurationId;
  @SerializedName("generate_connected_data_asset")
  protected Boolean generateConnectedDataAsset;
  protected Map<String, InstanceMetadataResponseWorkflow> workflows;
  protected String label;
  @SerializedName("cos_endpoint")
  protected String cosEndpoint;
  @SerializedName("mode_of_operation")
  protected String modeOfOperation;
  @SerializedName("cos_crn")
  protected String cosCrn;
  @SerializedName("bulkload_bucket")
  protected InstanceMetadataResponseBulkloadBucket bulkloadBucket;
  @SerializedName("connection_id")
  protected String connectionId;
  @SerializedName("governance_enabled")
  protected Boolean governanceEnabled;
  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("stream_connection")
  protected List<InstanceMetadataResponseStreamConnection> streamConnection;
  protected List<InstanceMetadataResponseCatalog> catalogs;
  @SerializedName("job_project_id")
  protected String jobProjectId;
  @SerializedName("workflow_type_id")
  protected String workflowTypeId;

  protected InstanceMetadataResponse() { }

  /**
   * Gets the projects.
   *
   * Collection of project objects as available in Watson Knowledge Catalog (WKC).
   *
   * @return the projects
   */
  public List<InstanceMetadataResponseProject> getProjects() {
    return projects;
  }

  /**
   * Gets the workflowConfigurationId.
   *
   * The workflow configuration id created in WKC workflow for a Match360 instance.
   *
   * @return the workflowConfigurationId
   */
  public String getWorkflowConfigurationId() {
    return workflowConfigurationId;
  }

  /**
   * Gets the generateConnectedDataAsset.
   *
   * Generate connected data asset indicator, true or false.
   *
   * @return the generateConnectedDataAsset
   */
  public Boolean isGenerateConnectedDataAsset() {
    return generateConnectedDataAsset;
  }

  /**
   * Gets the workflows.
   *
   * Collection of workflow objects configured with current instnce.
   *
   * @return the workflows
   */
  public Map<String, InstanceMetadataResponseWorkflow> getWorkflows() {
    return workflows;
  }

  /**
   * Gets the label.
   *
   * Label for instance metadata.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the cosEndpoint.
   *
   * Endpoint of a cloud object storage.
   *
   * @return the cosEndpoint
   */
  public String getCosEndpoint() {
    return cosEndpoint;
  }

  /**
   * Gets the modeOfOperation.
   *
   * Match360 modes of operation-&gt; operational_cache, probabilistic_search or usual mode(when not present).
   *
   * @return the modeOfOperation
   */
  public String getModeOfOperation() {
    return modeOfOperation;
  }

  /**
   * Gets the cosCrn.
   *
   * The cloud resource Name of cloud object storage.
   *
   * @return the cosCrn
   */
  public String getCosCrn() {
    return cosCrn;
  }

  /**
   * Gets the bulkloadBucket.
   *
   * Bulkload Bucket credentials.
   *
   * @return the bulkloadBucket
   */
  public InstanceMetadataResponseBulkloadBucket getBulkloadBucket() {
    return bulkloadBucket;
  }

  /**
   * Gets the connectionId.
   *
   * The unique identifier of a connection to a Match360 instance.
   *
   * @return the connectionId
   */
  public String getConnectionId() {
    return connectionId;
  }

  /**
   * Gets the governanceEnabled.
   *
   * Governance enabled indicator, true or false.
   *
   * @return the governanceEnabled
   */
  public Boolean isGovernanceEnabled() {
    return governanceEnabled;
  }

  /**
   * Gets the apiKey.
   *
   * API key generated from service id.
   *
   * @return the apiKey
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Gets the streamConnection.
   *
   * Stream connection details.
   *
   * @return the streamConnection
   */
  public List<InstanceMetadataResponseStreamConnection> getStreamConnection() {
    return streamConnection;
  }

  /**
   * Gets the catalogs.
   *
   * Collection of catalog objects as available in Watson Knowledge Catalog (WKC).
   *
   * @return the catalogs
   */
  public List<InstanceMetadataResponseCatalog> getCatalogs() {
    return catalogs;
  }

  /**
   * Gets the jobProjectId.
   *
   * The unique identifier of a project for the jobs.
   *
   * @return the jobProjectId
   */
  public String getJobProjectId() {
    return jobProjectId;
  }

  /**
   * Gets the workflowTypeId.
   *
   * The workflow type id created in WKC workflow services.
   *
   * @return the workflowTypeId
   */
  public String getWorkflowTypeId() {
    return workflowTypeId;
  }
}

