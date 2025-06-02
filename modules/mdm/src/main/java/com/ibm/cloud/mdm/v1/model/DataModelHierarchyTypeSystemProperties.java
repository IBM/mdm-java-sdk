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
 * Defines metadata of system properties of hierarchy types.
 */
public class DataModelHierarchyTypeSystemProperties extends GenericModel {

  @SerializedName("hierarchy_id")
  protected DataModelSystemProperty hierarchyId;
  @SerializedName("created_user")
  protected DataModelSystemProperty createdUser;
  @SerializedName("hierarchy_source")
  protected DataModelSystemProperty hierarchySource;
  @SerializedName("last_updated_user")
  protected DataModelSystemProperty lastUpdatedUser;
  @SerializedName("created_date")
  protected DataModelSystemProperty createdDate;
  @SerializedName("last_updated_date")
  protected DataModelSystemProperty lastUpdatedDate;
  @SerializedName("hierarchy_number")
  protected DataModelSystemProperty hierarchyNumber;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty hierarchyId;
    private DataModelSystemProperty createdUser;
    private DataModelSystemProperty hierarchySource;
    private DataModelSystemProperty lastUpdatedUser;
    private DataModelSystemProperty createdDate;
    private DataModelSystemProperty lastUpdatedDate;
    private DataModelSystemProperty hierarchyNumber;

    /**
     * Instantiates a new Builder from an existing DataModelHierarchyTypeSystemProperties instance.
     *
     * @param dataModelHierarchyTypeSystemProperties the instance to initialize the Builder with
     */
    private Builder(DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemProperties) {
      this.hierarchyId = dataModelHierarchyTypeSystemProperties.hierarchyId;
      this.createdUser = dataModelHierarchyTypeSystemProperties.createdUser;
      this.hierarchySource = dataModelHierarchyTypeSystemProperties.hierarchySource;
      this.lastUpdatedUser = dataModelHierarchyTypeSystemProperties.lastUpdatedUser;
      this.createdDate = dataModelHierarchyTypeSystemProperties.createdDate;
      this.lastUpdatedDate = dataModelHierarchyTypeSystemProperties.lastUpdatedDate;
      this.hierarchyNumber = dataModelHierarchyTypeSystemProperties.hierarchyNumber;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelHierarchyTypeSystemProperties.
     *
     * @return the new DataModelHierarchyTypeSystemProperties instance
     */
    public DataModelHierarchyTypeSystemProperties build() {
      return new DataModelHierarchyTypeSystemProperties(this);
    }

    /**
     * Set the hierarchyId.
     *
     * @param hierarchyId the hierarchyId
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder hierarchyId(DataModelSystemProperty hierarchyId) {
      this.hierarchyId = hierarchyId;
      return this;
    }

    /**
     * Set the createdUser.
     *
     * @param createdUser the createdUser
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder createdUser(DataModelSystemProperty createdUser) {
      this.createdUser = createdUser;
      return this;
    }

    /**
     * Set the hierarchySource.
     *
     * @param hierarchySource the hierarchySource
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder hierarchySource(DataModelSystemProperty hierarchySource) {
      this.hierarchySource = hierarchySource;
      return this;
    }

    /**
     * Set the lastUpdatedUser.
     *
     * @param lastUpdatedUser the lastUpdatedUser
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder lastUpdatedUser(DataModelSystemProperty lastUpdatedUser) {
      this.lastUpdatedUser = lastUpdatedUser;
      return this;
    }

    /**
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder createdDate(DataModelSystemProperty createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the lastUpdatedDate.
     *
     * @param lastUpdatedDate the lastUpdatedDate
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder lastUpdatedDate(DataModelSystemProperty lastUpdatedDate) {
      this.lastUpdatedDate = lastUpdatedDate;
      return this;
    }

    /**
     * Set the hierarchyNumber.
     *
     * @param hierarchyNumber the hierarchyNumber
     * @return the DataModelHierarchyTypeSystemProperties builder
     */
    public Builder hierarchyNumber(DataModelSystemProperty hierarchyNumber) {
      this.hierarchyNumber = hierarchyNumber;
      return this;
    }
  }

  protected DataModelHierarchyTypeSystemProperties() { }

  protected DataModelHierarchyTypeSystemProperties(Builder builder) {
    hierarchyId = builder.hierarchyId;
    createdUser = builder.createdUser;
    hierarchySource = builder.hierarchySource;
    lastUpdatedUser = builder.lastUpdatedUser;
    createdDate = builder.createdDate;
    lastUpdatedDate = builder.lastUpdatedDate;
    hierarchyNumber = builder.hierarchyNumber;
  }

  /**
   * New builder.
   *
   * @return a DataModelHierarchyTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hierarchyId.
   *
   * Defines metadata of a system property.
   *
   * @return the hierarchyId
   */
  public DataModelSystemProperty hierarchyId() {
    return hierarchyId;
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
   * Gets the hierarchySource.
   *
   * Defines metadata of a system property.
   *
   * @return the hierarchySource
   */
  public DataModelSystemProperty hierarchySource() {
    return hierarchySource;
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
   * Gets the hierarchyNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the hierarchyNumber
   */
  public DataModelSystemProperty hierarchyNumber() {
    return hierarchyNumber;
  }
}

