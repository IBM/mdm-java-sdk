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
 * Information about how the data is structured on the storage system.
 */
public class DataStructureRequest extends GenericModel {

  @SerializedName("record_path")
  protected String recordPath;
  @SerializedName("record_properties")
  protected String recordProperties;
  @SerializedName("relationship_path")
  protected String relationshipPath;
  @SerializedName("relationship_properties")
  protected String relationshipProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordPath;
    private String recordProperties;
    private String relationshipPath;
    private String relationshipProperties;

    private Builder(DataStructureRequest dataStructureRequest) {
      this.recordPath = dataStructureRequest.recordPath;
      this.recordProperties = dataStructureRequest.recordProperties;
      this.relationshipPath = dataStructureRequest.relationshipPath;
      this.relationshipProperties = dataStructureRequest.relationshipProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataStructureRequest.
     *
     * @return the new DataStructureRequest instance
     */
    public DataStructureRequest build() {
      return new DataStructureRequest(this);
    }

    /**
     * Set the recordPath.
     *
     * @param recordPath the recordPath
     * @return the DataStructureRequest builder
     */
    public Builder recordPath(String recordPath) {
      this.recordPath = recordPath;
      return this;
    }

    /**
     * Set the recordProperties.
     *
     * @param recordProperties the recordProperties
     * @return the DataStructureRequest builder
     */
    public Builder recordProperties(String recordProperties) {
      this.recordProperties = recordProperties;
      return this;
    }

    /**
     * Set the relationshipPath.
     *
     * @param relationshipPath the relationshipPath
     * @return the DataStructureRequest builder
     */
    public Builder relationshipPath(String relationshipPath) {
      this.relationshipPath = relationshipPath;
      return this;
    }

    /**
     * Set the relationshipProperties.
     *
     * @param relationshipProperties the relationshipProperties
     * @return the DataStructureRequest builder
     */
    public Builder relationshipProperties(String relationshipProperties) {
      this.relationshipProperties = relationshipProperties;
      return this;
    }
  }

  protected DataStructureRequest(Builder builder) {
    recordPath = builder.recordPath;
    recordProperties = builder.recordProperties;
    relationshipPath = builder.relationshipPath;
    relationshipProperties = builder.relationshipProperties;
  }

  /**
   * New builder.
   *
   * @return a DataStructureRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordPath.
   *
   * The relative path from directory_path to the file or directory containing record data.
   *
   * @return the recordPath
   */
  public String recordPath() {
    return recordPath;
  }

  /**
   * Gets the recordProperties.
   *
   * The relative path from directory_path to the record properties file.
   *
   * @return the recordProperties
   */
  public String recordProperties() {
    return recordProperties;
  }

  /**
   * Gets the relationshipPath.
   *
   * The relative path from directory_path to the file or directory containing relationship data.
   *
   * @return the relationshipPath
   */
  public String relationshipPath() {
    return relationshipPath;
  }

  /**
   * Gets the relationshipProperties.
   *
   * The relative path from directory_path to the relationship properties file.
   *
   * @return the relationshipProperties
   */
  public String relationshipProperties() {
    return relationshipProperties;
  }
}

