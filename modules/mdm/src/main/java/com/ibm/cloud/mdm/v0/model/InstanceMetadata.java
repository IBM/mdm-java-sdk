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
package com.ibm.cloud.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Wrapper object for instance metadata.
 */
public class InstanceMetadata extends GenericModel {

  protected List<InstanceMetadataProject> projects;
  @SerializedName("job_project_id")
  protected String jobProjectId;
  protected List<InstanceMetadataCatalog> catalogs;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private List<InstanceMetadataProject> projects;
    private String jobProjectId;
    private List<InstanceMetadataCatalog> catalogs;
    private String label;

    private Builder(InstanceMetadata instanceMetadata) {
      this.projects = instanceMetadata.projects;
      this.jobProjectId = instanceMetadata.jobProjectId;
      this.catalogs = instanceMetadata.catalogs;
      this.label = instanceMetadata.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadata.
     *
     * @return the new InstanceMetadata instance
     */
    public InstanceMetadata build() {
      return new InstanceMetadata(this);
    }

    /**
     * Adds an projects to projects.
     *
     * @param projects the new projects
     * @return the InstanceMetadata builder
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
     * Adds an catalogs to catalogs.
     *
     * @param catalogs the new catalogs
     * @return the InstanceMetadata builder
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
     * @return the InstanceMetadata builder
     */
    public Builder projects(List<InstanceMetadataProject> projects) {
      this.projects = projects;
      return this;
    }

    /**
     * Set the jobProjectId.
     *
     * @param jobProjectId the jobProjectId
     * @return the InstanceMetadata builder
     */
    public Builder jobProjectId(String jobProjectId) {
      this.jobProjectId = jobProjectId;
      return this;
    }

    /**
     * Set the catalogs.
     * Existing catalogs will be replaced.
     *
     * @param catalogs the catalogs
     * @return the InstanceMetadata builder
     */
    public Builder catalogs(List<InstanceMetadataCatalog> catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the InstanceMetadata builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected InstanceMetadata(Builder builder) {
    projects = builder.projects;
    jobProjectId = builder.jobProjectId;
    catalogs = builder.catalogs;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadata builder
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
   * Gets the label.
   *
   * Label for instance metadata.
   *
   * @return the label
   */
  public String label() {
    return label;
  }
}

