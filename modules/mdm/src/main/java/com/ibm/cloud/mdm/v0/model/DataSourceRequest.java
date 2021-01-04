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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The data source request.
 */
public class DataSourceRequest extends GenericModel {

  /**
   * The type of data being bulk-loaded.
   */
  public interface Type {
    /** dfs. */
    String DFS = "dfs";
    /** sample. */
    String SAMPLE = "sample";
  }

  /**
   * The directory containing sample bulk load data.
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
  protected DataSourceDetailsRequest details;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String directoryPath;
    private String directoryRef;
    private DataSourceDetailsRequest details;

    private Builder(DataSourceRequest dataSourceRequest) {
      this.type = dataSourceRequest.type;
      this.directoryPath = dataSourceRequest.directoryPath;
      this.directoryRef = dataSourceRequest.directoryRef;
      this.details = dataSourceRequest.details;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataSourceRequest.
     *
     * @return the new DataSourceRequest instance
     */
    public DataSourceRequest build() {
      return new DataSourceRequest(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DataSourceRequest builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the directoryPath.
     *
     * @param directoryPath the directoryPath
     * @return the DataSourceRequest builder
     */
    public Builder directoryPath(String directoryPath) {
      this.directoryPath = directoryPath;
      return this;
    }

    /**
     * Set the directoryRef.
     *
     * @param directoryRef the directoryRef
     * @return the DataSourceRequest builder
     */
    public Builder directoryRef(String directoryRef) {
      this.directoryRef = directoryRef;
      return this;
    }

    /**
     * Set the details.
     *
     * @param details the details
     * @return the DataSourceRequest builder
     */
    public Builder details(DataSourceDetailsRequest details) {
      this.details = details;
      return this;
    }
  }

  protected DataSourceRequest(Builder builder) {
    type = builder.type;
    directoryPath = builder.directoryPath;
    directoryRef = builder.directoryRef;
    details = builder.details;
  }

  /**
   * New builder.
   *
   * @return a DataSourceRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The type of data being bulk-loaded.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the directoryPath.
   *
   * The absolute path to the directory containing bulk load data.
   *
   * @return the directoryPath
   */
  public String directoryPath() {
    return directoryPath;
  }

  /**
   * Gets the directoryRef.
   *
   * The directory containing sample bulk load data.
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
  public DataSourceDetailsRequest details() {
    return details;
  }
}

