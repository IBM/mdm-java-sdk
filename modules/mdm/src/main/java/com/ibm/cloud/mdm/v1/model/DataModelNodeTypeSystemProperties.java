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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines metadata of system properties of node types.
 */
public class DataModelNodeTypeSystemProperties extends GenericModel {

  @SerializedName("node_number")
  protected DataModelSystemProperty nodeNumber;
  @SerializedName("created_user")
  protected DataModelSystemProperty createdUser;
  @SerializedName("last_updated_user")
  protected DataModelSystemProperty lastUpdatedUser;
  @SerializedName("context_id")
  protected DataModelSystemProperty contextId;
  @SerializedName("created_date")
  protected DataModelSystemProperty createdDate;
  @SerializedName("last_updated_date")
  protected DataModelSystemProperty lastUpdatedDate;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty nodeNumber;
    private DataModelSystemProperty createdUser;
    private DataModelSystemProperty lastUpdatedUser;
    private DataModelSystemProperty contextId;
    private DataModelSystemProperty createdDate;
    private DataModelSystemProperty lastUpdatedDate;

    /**
     * Instantiates a new Builder from an existing DataModelNodeTypeSystemProperties instance.
     *
     * @param dataModelNodeTypeSystemProperties the instance to initialize the Builder with
     */
    private Builder(DataModelNodeTypeSystemProperties dataModelNodeTypeSystemProperties) {
      this.nodeNumber = dataModelNodeTypeSystemProperties.nodeNumber;
      this.createdUser = dataModelNodeTypeSystemProperties.createdUser;
      this.lastUpdatedUser = dataModelNodeTypeSystemProperties.lastUpdatedUser;
      this.contextId = dataModelNodeTypeSystemProperties.contextId;
      this.createdDate = dataModelNodeTypeSystemProperties.createdDate;
      this.lastUpdatedDate = dataModelNodeTypeSystemProperties.lastUpdatedDate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelNodeTypeSystemProperties.
     *
     * @return the new DataModelNodeTypeSystemProperties instance
     */
    public DataModelNodeTypeSystemProperties build() {
      return new DataModelNodeTypeSystemProperties(this);
    }

    /**
     * Set the nodeNumber.
     *
     * @param nodeNumber the nodeNumber
     * @return the DataModelNodeTypeSystemProperties builder
     */
    public Builder nodeNumber(DataModelSystemProperty nodeNumber) {
      this.nodeNumber = nodeNumber;
      return this;
    }

    /**
     * Set the createdUser.
     *
     * @param createdUser the createdUser
     * @return the DataModelNodeTypeSystemProperties builder
     */
    public Builder createdUser(DataModelSystemProperty createdUser) {
      this.createdUser = createdUser;
      return this;
    }

    /**
     * Set the lastUpdatedUser.
     *
     * @param lastUpdatedUser the lastUpdatedUser
     * @return the DataModelNodeTypeSystemProperties builder
     */
    public Builder lastUpdatedUser(DataModelSystemProperty lastUpdatedUser) {
      this.lastUpdatedUser = lastUpdatedUser;
      return this;
    }

    /**
     * Set the contextId.
     *
     * @param contextId the contextId
     * @return the DataModelNodeTypeSystemProperties builder
     */
    public Builder contextId(DataModelSystemProperty contextId) {
      this.contextId = contextId;
      return this;
    }

    /**
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the DataModelNodeTypeSystemProperties builder
     */
    public Builder createdDate(DataModelSystemProperty createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the lastUpdatedDate.
     *
     * @param lastUpdatedDate the lastUpdatedDate
     * @return the DataModelNodeTypeSystemProperties builder
     */
    public Builder lastUpdatedDate(DataModelSystemProperty lastUpdatedDate) {
      this.lastUpdatedDate = lastUpdatedDate;
      return this;
    }
  }

  protected DataModelNodeTypeSystemProperties() { }

  protected DataModelNodeTypeSystemProperties(Builder builder) {
    nodeNumber = builder.nodeNumber;
    createdUser = builder.createdUser;
    lastUpdatedUser = builder.lastUpdatedUser;
    contextId = builder.contextId;
    createdDate = builder.createdDate;
    lastUpdatedDate = builder.lastUpdatedDate;
  }

  /**
   * New builder.
   *
   * @return a DataModelNodeTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the nodeNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the nodeNumber
   */
  public DataModelSystemProperty nodeNumber() {
    return nodeNumber;
  }

  /**
   * Gets the createdUser.
   *
   * Defines metadata of a system property.
   *
   * @return the createdUser
   */
  public DataModelSystemProperty createdUser() {
    return createdUser;
  }

  /**
   * Gets the lastUpdatedUser.
   *
   * Defines metadata of a system property.
   *
   * @return the lastUpdatedUser
   */
  public DataModelSystemProperty lastUpdatedUser() {
    return lastUpdatedUser;
  }

  /**
   * Gets the contextId.
   *
   * Defines metadata of a system property.
   *
   * @return the contextId
   */
  public DataModelSystemProperty contextId() {
    return contextId;
  }

  /**
   * Gets the createdDate.
   *
   * Defines metadata of a system property.
   *
   * @return the createdDate
   */
  public DataModelSystemProperty createdDate() {
    return createdDate;
  }

  /**
   * Gets the lastUpdatedDate.
   *
   * Defines metadata of a system property.
   *
   * @return the lastUpdatedDate
   */
  public DataModelSystemProperty lastUpdatedDate() {
    return lastUpdatedDate;
  }
}

