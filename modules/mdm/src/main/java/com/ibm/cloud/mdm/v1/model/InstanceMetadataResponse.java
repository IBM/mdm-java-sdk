/*
 * (C) Copyright IBM Corp. 2022.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Wrapper object for instance metadata response.
 */
public class InstanceMetadataResponse extends GenericModel {

  protected List<InstanceMetadataResponseProject> projects;
  @SerializedName("bulkload_bucket")
  protected InstanceMetadataResponseBulkloadBucket bulkloadBucket;
  protected List<InstanceMetadataResponseCatalog> catalogs;
  @SerializedName("job_project_id")
  protected String jobProjectId;
  @SerializedName("cos_endpoint")
  protected String cosEndpoint;
  @SerializedName("cos_crn")
  protected String cosCrn;
  protected String label;

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
   * Gets the label.
   *
   * Label for instance metadata.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

