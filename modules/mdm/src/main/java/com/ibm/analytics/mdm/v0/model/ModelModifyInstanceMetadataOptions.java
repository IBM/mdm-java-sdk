/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The modelModifyInstanceMetadata options.
 */
public class ModelModifyInstanceMetadataOptions extends GenericModel {

  protected String crn;
  protected String jobProjectId;
  protected List<InstanceMetadataProject> projects;
  protected List<InstanceMetadataCatalog> catalogs;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String jobProjectId;
    private List<InstanceMetadataProject> projects;
    private List<InstanceMetadataCatalog> catalogs;
    private String label;

    private Builder(ModelModifyInstanceMetadataOptions modelModifyInstanceMetadataOptions) {
      this.crn = modelModifyInstanceMetadataOptions.crn;
      this.jobProjectId = modelModifyInstanceMetadataOptions.jobProjectId;
      this.projects = modelModifyInstanceMetadataOptions.projects;
      this.catalogs = modelModifyInstanceMetadataOptions.catalogs;
      this.label = modelModifyInstanceMetadataOptions.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a ModelModifyInstanceMetadataOptions.
     *
     * @return the new ModelModifyInstanceMetadataOptions instance
     */
    public ModelModifyInstanceMetadataOptions build() {
      return new ModelModifyInstanceMetadataOptions(this);
    }

    /**
     * Adds an projects to projects.
     *
     * @param projects the new projects
     * @return the ModelModifyInstanceMetadataOptions builder
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
     * @return the ModelModifyInstanceMetadataOptions builder
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
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelModifyInstanceMetadataOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the jobProjectId.
     *
     * @param jobProjectId the jobProjectId
     * @return the ModelModifyInstanceMetadataOptions builder
     */
    public Builder jobProjectId(String jobProjectId) {
      this.jobProjectId = jobProjectId;
      return this;
    }

    /**
     * Set the projects.
     * Existing projects will be replaced.
     *
     * @param projects the projects
     * @return the ModelModifyInstanceMetadataOptions builder
     */
    public Builder projects(List<InstanceMetadataProject> projects) {
      this.projects = projects;
      return this;
    }

    /**
     * Set the catalogs.
     * Existing catalogs will be replaced.
     *
     * @param catalogs the catalogs
     * @return the ModelModifyInstanceMetadataOptions builder
     */
    public Builder catalogs(List<InstanceMetadataCatalog> catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the ModelModifyInstanceMetadataOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the instanceMetadata.
     *
     * @param instanceMetadata the instanceMetadata
     * @return the ModelModifyInstanceMetadataOptions builder
     */
    public Builder instanceMetadata(InstanceMetadata instanceMetadata) {
      this.jobProjectId = instanceMetadata.jobProjectId();
      this.projects = instanceMetadata.projects();
      this.catalogs = instanceMetadata.catalogs();
      this.label = instanceMetadata.label();
      return this;
    }
  }

  protected ModelModifyInstanceMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
    jobProjectId = builder.jobProjectId;
    projects = builder.projects;
    catalogs = builder.catalogs;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a ModelModifyInstanceMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

