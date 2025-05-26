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
 * Defines metadata of system properties of group types.
 */
public class DataModelGroupTypeSystemProperties extends GenericModel {

  @SerializedName("created_user")
  protected DataModelSystemProperty createdUser;
  @SerializedName("group_number")
  protected DataModelSystemProperty groupNumber;
  @SerializedName("group_id")
  protected DataModelSystemProperty groupId;
  @SerializedName("last_updated_user")
  protected DataModelSystemProperty lastUpdatedUser;
  @SerializedName("group_source")
  protected DataModelSystemProperty groupSource;
  @SerializedName("created_date")
  protected DataModelSystemProperty createdDate;
  @SerializedName("last_updated_date")
  protected DataModelSystemProperty lastUpdatedDate;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty createdUser;
    private DataModelSystemProperty groupNumber;
    private DataModelSystemProperty groupId;
    private DataModelSystemProperty lastUpdatedUser;
    private DataModelSystemProperty groupSource;
    private DataModelSystemProperty createdDate;
    private DataModelSystemProperty lastUpdatedDate;

    private Builder(DataModelGroupTypeSystemProperties dataModelGroupTypeSystemProperties) {
      this.createdUser = dataModelGroupTypeSystemProperties.createdUser;
      this.groupNumber = dataModelGroupTypeSystemProperties.groupNumber;
      this.groupId = dataModelGroupTypeSystemProperties.groupId;
      this.lastUpdatedUser = dataModelGroupTypeSystemProperties.lastUpdatedUser;
      this.groupSource = dataModelGroupTypeSystemProperties.groupSource;
      this.createdDate = dataModelGroupTypeSystemProperties.createdDate;
      this.lastUpdatedDate = dataModelGroupTypeSystemProperties.lastUpdatedDate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelGroupTypeSystemProperties.
     *
     * @return the new DataModelGroupTypeSystemProperties instance
     */
    public DataModelGroupTypeSystemProperties build() {
      return new DataModelGroupTypeSystemProperties(this);
    }

    /**
     * Set the createdUser.
     *
     * @param createdUser the createdUser
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder createdUser(DataModelSystemProperty createdUser) {
      this.createdUser = createdUser;
      return this;
    }

    /**
     * Set the groupNumber.
     *
     * @param groupNumber the groupNumber
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder groupNumber(DataModelSystemProperty groupNumber) {
      this.groupNumber = groupNumber;
      return this;
    }

    /**
     * Set the groupId.
     *
     * @param groupId the groupId
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder groupId(DataModelSystemProperty groupId) {
      this.groupId = groupId;
      return this;
    }

    /**
     * Set the lastUpdatedUser.
     *
     * @param lastUpdatedUser the lastUpdatedUser
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder lastUpdatedUser(DataModelSystemProperty lastUpdatedUser) {
      this.lastUpdatedUser = lastUpdatedUser;
      return this;
    }

    /**
     * Set the groupSource.
     *
     * @param groupSource the groupSource
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder groupSource(DataModelSystemProperty groupSource) {
      this.groupSource = groupSource;
      return this;
    }

    /**
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder createdDate(DataModelSystemProperty createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the lastUpdatedDate.
     *
     * @param lastUpdatedDate the lastUpdatedDate
     * @return the DataModelGroupTypeSystemProperties builder
     */
    public Builder lastUpdatedDate(DataModelSystemProperty lastUpdatedDate) {
      this.lastUpdatedDate = lastUpdatedDate;
      return this;
    }
  }

  protected DataModelGroupTypeSystemProperties() { }

  protected DataModelGroupTypeSystemProperties(Builder builder) {
    createdUser = builder.createdUser;
    groupNumber = builder.groupNumber;
    groupId = builder.groupId;
    lastUpdatedUser = builder.lastUpdatedUser;
    groupSource = builder.groupSource;
    createdDate = builder.createdDate;
    lastUpdatedDate = builder.lastUpdatedDate;
  }

  /**
   * New builder.
   *
   * @return a DataModelGroupTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the groupNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the groupNumber
   */
  public DataModelSystemProperty groupNumber() {
    return groupNumber;
  }

  /**
   * Gets the groupId.
   *
   * Defines metadata of a system property.
   *
   * @return the groupId
   */
  public DataModelSystemProperty groupId() {
    return groupId;
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
   * Gets the groupSource.
   *
   * Defines metadata of a system property.
   *
   * @return the groupSource
   */
  public DataModelSystemProperty groupSource() {
    return groupSource;
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

