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
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceModelInstanceMetadata options.
 */
public class ReplaceModelInstanceMetadataOptions extends GenericModel {

  protected String label;
  protected Map<String, Object> bulkloadBucket;
  protected List<InstanceMetadataCatalog> catalogs;
  protected String jobProjectId;
  protected List<InstanceMetadataProject> projects;
  protected String cosCrn;
  protected String cosEndpoint;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private Map<String, Object> bulkloadBucket;
    private List<InstanceMetadataCatalog> catalogs;
    private String jobProjectId;
    private List<InstanceMetadataProject> projects;
    private String cosCrn;
    private String cosEndpoint;

    private Builder(ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions) {
      this.label = replaceModelInstanceMetadataOptions.label;
      this.bulkloadBucket = replaceModelInstanceMetadataOptions.bulkloadBucket;
      this.catalogs = replaceModelInstanceMetadataOptions.catalogs;
      this.jobProjectId = replaceModelInstanceMetadataOptions.jobProjectId;
      this.projects = replaceModelInstanceMetadataOptions.projects;
      this.cosCrn = replaceModelInstanceMetadataOptions.cosCrn;
      this.cosEndpoint = replaceModelInstanceMetadataOptions.cosEndpoint;
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
     * Adds an catalogs to catalogs.
     *
     * @param catalogs the new catalogs
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
     * Adds an projects to projects.
     *
     * @param projects the new projects
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
     * Set the bulkloadBucket.
     *
     * @param bulkloadBucket the bulkloadBucket
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder bulkloadBucket(Map<String, Object> bulkloadBucket) {
      this.bulkloadBucket = bulkloadBucket;
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
     * Set the cosEndpoint.
     *
     * @param cosEndpoint the cosEndpoint
     * @return the ReplaceModelInstanceMetadataOptions builder
     */
    public Builder cosEndpoint(String cosEndpoint) {
      this.cosEndpoint = cosEndpoint;
      return this;
    }
  }

  protected ReplaceModelInstanceMetadataOptions(Builder builder) {
    label = builder.label;
    bulkloadBucket = builder.bulkloadBucket;
    catalogs = builder.catalogs;
    jobProjectId = builder.jobProjectId;
    projects = builder.projects;
    cosCrn = builder.cosCrn;
    cosEndpoint = builder.cosEndpoint;
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
   * Gets the bulkloadBucket.
   *
   * Bulkload Bucket credentials.
   *
   * @return the bulkloadBucket
   */
  public Map<String, Object> bulkloadBucket() {
    return bulkloadBucket;
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
   * Gets the cosEndpoint.
   *
   * Endpoint of a cloud object storage.
   *
   * @return the cosEndpoint
   */
  public String cosEndpoint() {
    return cosEndpoint;
  }
}

