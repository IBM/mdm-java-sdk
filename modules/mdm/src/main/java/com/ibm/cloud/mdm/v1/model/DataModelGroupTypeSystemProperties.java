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

  @SerializedName("group_id")
  protected DataModelSystemProperty groupId;
  @SerializedName("created_user")
  protected DataModelSystemProperty createdUser;
  @SerializedName("group_number")
  protected DataModelSystemProperty groupNumber;
  @SerializedName("last_updated_user")
  protected DataModelSystemProperty lastUpdatedUser;
  @SerializedName("created_date")
  protected DataModelSystemProperty createdDate;
  @SerializedName("last_updated_date")
  protected DataModelSystemProperty lastUpdatedDate;
  @SerializedName("group_source")
  protected DataModelSystemProperty groupSource;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty groupId;
    private DataModelSystemProperty createdUser;
    private DataModelSystemProperty groupNumber;
    private DataModelSystemProperty lastUpdatedUser;
    private DataModelSystemProperty createdDate;
    private DataModelSystemProperty lastUpdatedDate;
    private DataModelSystemProperty groupSource;

    /**
     * Instantiates a new Builder from an existing DataModelGroupTypeSystemProperties instance.
     *
     * @param dataModelGroupTypeSystemProperties the instance to initialize the Builder with
     */
    private Builder(DataModelGroupTypeSystemProperties dataModelGroupTypeSystemProperties) {
      this.groupId = dataModelGroupTypeSystemProperties.groupId;
      this.createdUser = dataModelGroupTypeSystemProperties.createdUser;
      this.groupNumber = dataModelGroupTypeSystemProperties.groupNumber;
      this.lastUpdatedUser = dataModelGroupTypeSystemProperties.lastUpdatedUser;
      this.createdDate = dataModelGroupTypeSystemProperties.createdDate;
      this.lastUpdatedDate = dataModelGroupTypeSystemProperties.lastUpdatedDate;
      this.groupSource = dataModelGroupTypeSystemProperties.groupSource;
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
  }

  protected DataModelGroupTypeSystemProperties() { }

  protected DataModelGroupTypeSystemProperties(Builder builder) {
    groupId = builder.groupId;
    createdUser = builder.createdUser;
    groupNumber = builder.groupNumber;
    lastUpdatedUser = builder.lastUpdatedUser;
    createdDate = builder.createdDate;
    lastUpdatedDate = builder.lastUpdatedDate;
    groupSource = builder.groupSource;
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
}

