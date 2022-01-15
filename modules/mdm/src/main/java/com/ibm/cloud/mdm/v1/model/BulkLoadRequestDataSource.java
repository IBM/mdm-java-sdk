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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about the source of the data.
 */
public class BulkLoadRequestDataSource extends GenericModel {

  /**
   * The type of data source to bulk-load data from.
   */
  public interface Type {
    /** dfs. */
    String DFS = "dfs";
    /** sample. */
    String SAMPLE = "sample";
    /** wkc. */
    String WKC = "wkc";
  }

  /**
   * The directory reference for the sample data.
   */
  public interface DirectoryRef {
    /** sample_contract_small. */
    String SAMPLE_CONTRACT_SMALL = "sample_contract_small";
    /** sample_consent_small. */
    String SAMPLE_CONSENT_SMALL = "sample_consent_small";
    /** sample_contract. */
    String SAMPLE_CONTRACT = "sample_contract";
    /** sample_consent. */
    String SAMPLE_CONSENT = "sample_consent";
  }

  protected String type;
  @SerializedName("directory_path")
  protected String directoryPath;
  @SerializedName("directory_ref")
  protected String directoryRef;
  protected DataLoadSourceCredentials details;
  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("project_id")
  protected String projectId;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String directoryPath;
    private String directoryRef;
    private DataLoadSourceCredentials details;
    private String catalogId;
    private String projectId;

    private Builder(BulkLoadRequestDataSource bulkLoadRequestDataSource) {
      this.type = bulkLoadRequestDataSource.type;
      this.directoryPath = bulkLoadRequestDataSource.directoryPath;
      this.directoryRef = bulkLoadRequestDataSource.directoryRef;
      this.details = bulkLoadRequestDataSource.details;
      this.catalogId = bulkLoadRequestDataSource.catalogId;
      this.projectId = bulkLoadRequestDataSource.projectId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a BulkLoadRequestDataSource.
     *
     * @return the new BulkLoadRequestDataSource instance
     */
    public BulkLoadRequestDataSource build() {
      return new BulkLoadRequestDataSource(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the BulkLoadRequestDataSource builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the directoryPath.
     *
     * @param directoryPath the directoryPath
     * @return the BulkLoadRequestDataSource builder
     */
    public Builder directoryPath(String directoryPath) {
      this.directoryPath = directoryPath;
      return this;
    }

    /**
     * Set the directoryRef.
     *
     * @param directoryRef the directoryRef
     * @return the BulkLoadRequestDataSource builder
     */
    public Builder directoryRef(String directoryRef) {
      this.directoryRef = directoryRef;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the BulkLoadRequestDataSource builder
     */
    public Builder details(DataLoadSourceCredentials details) {
      this.details = details;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the BulkLoadRequestDataSource builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the BulkLoadRequestDataSource builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }
  }

  protected BulkLoadRequestDataSource(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
    directoryPath = builder.directoryPath;
    directoryRef = builder.directoryRef;
    details = builder.details;
    catalogId = builder.catalogId;
    projectId = builder.projectId;
  }

  /**
   * New builder.
   *
   * @return a BulkLoadRequestDataSource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The type of data source to bulk-load data from.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the directoryPath.
   *
   * The absolute path to the directory containing the source data.
   *
   * @return the directoryPath
   */
  public String directoryPath() {
    return directoryPath;
  }

  /**
   * Gets the directoryRef.
   *
   * The directory reference for the sample data.
   *
   * @return the directoryRef
   */
  public String directoryRef() {
    return directoryRef;
  }

  /**
   * Gets the details.
   *
   * The details of a data source.
   *
   * @return the details
   */
  public DataLoadSourceCredentials details() {
    return details;
  }

  /**
   * Gets the catalogId.
   *
   * The id of the WKC catalog containing the bulk load data.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the projectId.
   *
   * The id of the WKC project containing the bulk load data.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }
}

