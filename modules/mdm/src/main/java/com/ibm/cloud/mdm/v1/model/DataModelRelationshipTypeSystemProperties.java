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
 * Defines metadata of system properties of all relationship types.
 */
public class DataModelRelationshipTypeSystemProperties extends GenericModel {

  @SerializedName("from_record_type")
  protected DataModelSystemProperty fromRecordType;
  @SerializedName("to_record_number")
  protected DataModelSystemProperty toRecordNumber;
  @SerializedName("from_record_number")
  protected DataModelSystemProperty fromRecordNumber;
  @SerializedName("relationship_source")
  protected DataModelSystemProperty relationshipSource;
  @SerializedName("from_record_source")
  protected DataModelSystemProperty fromRecordSource;
  @SerializedName("to_record_source")
  protected DataModelSystemProperty toRecordSource;
  @SerializedName("relationship_id")
  protected DataModelSystemProperty relationshipId;
  @SerializedName("relationship_type")
  protected DataModelSystemProperty relationshipType;
  @SerializedName("from_record_id")
  protected DataModelSystemProperty fromRecordId;
  @SerializedName("to_record_id")
  protected DataModelSystemProperty toRecordId;
  @SerializedName("relationship_number")
  protected DataModelSystemProperty relationshipNumber;
  @SerializedName("to_record_type")
  protected DataModelSystemProperty toRecordType;
  @SerializedName("relationship_last_updated")
  protected DataModelSystemProperty relationshipLastUpdated;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelSystemProperty fromRecordType;
    private DataModelSystemProperty toRecordNumber;
    private DataModelSystemProperty fromRecordNumber;
    private DataModelSystemProperty relationshipSource;
    private DataModelSystemProperty fromRecordSource;
    private DataModelSystemProperty toRecordSource;
    private DataModelSystemProperty relationshipId;
    private DataModelSystemProperty relationshipType;
    private DataModelSystemProperty fromRecordId;
    private DataModelSystemProperty toRecordId;
    private DataModelSystemProperty relationshipNumber;
    private DataModelSystemProperty toRecordType;
    private DataModelSystemProperty relationshipLastUpdated;

    private Builder(DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemProperties) {
      this.fromRecordType = dataModelRelationshipTypeSystemProperties.fromRecordType;
      this.toRecordNumber = dataModelRelationshipTypeSystemProperties.toRecordNumber;
      this.fromRecordNumber = dataModelRelationshipTypeSystemProperties.fromRecordNumber;
      this.relationshipSource = dataModelRelationshipTypeSystemProperties.relationshipSource;
      this.fromRecordSource = dataModelRelationshipTypeSystemProperties.fromRecordSource;
      this.toRecordSource = dataModelRelationshipTypeSystemProperties.toRecordSource;
      this.relationshipId = dataModelRelationshipTypeSystemProperties.relationshipId;
      this.relationshipType = dataModelRelationshipTypeSystemProperties.relationshipType;
      this.fromRecordId = dataModelRelationshipTypeSystemProperties.fromRecordId;
      this.toRecordId = dataModelRelationshipTypeSystemProperties.toRecordId;
      this.relationshipNumber = dataModelRelationshipTypeSystemProperties.relationshipNumber;
      this.toRecordType = dataModelRelationshipTypeSystemProperties.toRecordType;
      this.relationshipLastUpdated = dataModelRelationshipTypeSystemProperties.relationshipLastUpdated;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param relationshipLastUpdated the relationshipLastUpdated
     */
    public Builder(DataModelSystemProperty relationshipLastUpdated) {
      this.relationshipLastUpdated = relationshipLastUpdated;
    }

    /**
     * Builds a DataModelRelationshipTypeSystemProperties.
     *
     * @return the new DataModelRelationshipTypeSystemProperties instance
     */
    public DataModelRelationshipTypeSystemProperties build() {
      return new DataModelRelationshipTypeSystemProperties(this);
    }

    /**
     * Set the fromRecordType.
     *
     * @param fromRecordType the fromRecordType
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder fromRecordType(DataModelSystemProperty fromRecordType) {
      this.fromRecordType = fromRecordType;
      return this;
    }

    /**
     * Set the toRecordNumber.
     *
     * @param toRecordNumber the toRecordNumber
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder toRecordNumber(DataModelSystemProperty toRecordNumber) {
      this.toRecordNumber = toRecordNumber;
      return this;
    }

    /**
     * Set the fromRecordNumber.
     *
     * @param fromRecordNumber the fromRecordNumber
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder fromRecordNumber(DataModelSystemProperty fromRecordNumber) {
      this.fromRecordNumber = fromRecordNumber;
      return this;
    }

    /**
     * Set the relationshipSource.
     *
     * @param relationshipSource the relationshipSource
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder relationshipSource(DataModelSystemProperty relationshipSource) {
      this.relationshipSource = relationshipSource;
      return this;
    }

    /**
     * Set the fromRecordSource.
     *
     * @param fromRecordSource the fromRecordSource
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder fromRecordSource(DataModelSystemProperty fromRecordSource) {
      this.fromRecordSource = fromRecordSource;
      return this;
    }

    /**
     * Set the toRecordSource.
     *
     * @param toRecordSource the toRecordSource
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder toRecordSource(DataModelSystemProperty toRecordSource) {
      this.toRecordSource = toRecordSource;
      return this;
    }

    /**
     * Set the relationshipId.
     *
     * @param relationshipId the relationshipId
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder relationshipId(DataModelSystemProperty relationshipId) {
      this.relationshipId = relationshipId;
      return this;
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder relationshipType(DataModelSystemProperty relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }

    /**
     * Set the fromRecordId.
     *
     * @param fromRecordId the fromRecordId
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder fromRecordId(DataModelSystemProperty fromRecordId) {
      this.fromRecordId = fromRecordId;
      return this;
    }

    /**
     * Set the toRecordId.
     *
     * @param toRecordId the toRecordId
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder toRecordId(DataModelSystemProperty toRecordId) {
      this.toRecordId = toRecordId;
      return this;
    }

    /**
     * Set the relationshipNumber.
     *
     * @param relationshipNumber the relationshipNumber
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder relationshipNumber(DataModelSystemProperty relationshipNumber) {
      this.relationshipNumber = relationshipNumber;
      return this;
    }

    /**
     * Set the toRecordType.
     *
     * @param toRecordType the toRecordType
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder toRecordType(DataModelSystemProperty toRecordType) {
      this.toRecordType = toRecordType;
      return this;
    }

    /**
     * Set the relationshipLastUpdated.
     *
     * @param relationshipLastUpdated the relationshipLastUpdated
     * @return the DataModelRelationshipTypeSystemProperties builder
     */
    public Builder relationshipLastUpdated(DataModelSystemProperty relationshipLastUpdated) {
      this.relationshipLastUpdated = relationshipLastUpdated;
      return this;
    }
  }

  protected DataModelRelationshipTypeSystemProperties(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.relationshipLastUpdated,
      "relationshipLastUpdated cannot be null");
    fromRecordType = builder.fromRecordType;
    toRecordNumber = builder.toRecordNumber;
    fromRecordNumber = builder.fromRecordNumber;
    relationshipSource = builder.relationshipSource;
    fromRecordSource = builder.fromRecordSource;
    toRecordSource = builder.toRecordSource;
    relationshipId = builder.relationshipId;
    relationshipType = builder.relationshipType;
    fromRecordId = builder.fromRecordId;
    toRecordId = builder.toRecordId;
    relationshipNumber = builder.relationshipNumber;
    toRecordType = builder.toRecordType;
    relationshipLastUpdated = builder.relationshipLastUpdated;
  }

  /**
   * New builder.
   *
   * @return a DataModelRelationshipTypeSystemProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the fromRecordType.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordType
   */
  public DataModelSystemProperty fromRecordType() {
    return fromRecordType;
  }

  /**
   * Gets the toRecordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordNumber
   */
  public DataModelSystemProperty toRecordNumber() {
    return toRecordNumber;
  }

  /**
   * Gets the fromRecordNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordNumber
   */
  public DataModelSystemProperty fromRecordNumber() {
    return fromRecordNumber;
  }

  /**
   * Gets the relationshipSource.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipSource
   */
  public DataModelSystemProperty relationshipSource() {
    return relationshipSource;
  }

  /**
   * Gets the fromRecordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordSource
   */
  public DataModelSystemProperty fromRecordSource() {
    return fromRecordSource;
  }

  /**
   * Gets the toRecordSource.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordSource
   */
  public DataModelSystemProperty toRecordSource() {
    return toRecordSource;
  }

  /**
   * Gets the relationshipId.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipId
   */
  public DataModelSystemProperty relationshipId() {
    return relationshipId;
  }

  /**
   * Gets the relationshipType.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipType
   */
  public DataModelSystemProperty relationshipType() {
    return relationshipType;
  }

  /**
   * Gets the fromRecordId.
   *
   * Defines metadata of a system property.
   *
   * @return the fromRecordId
   */
  public DataModelSystemProperty fromRecordId() {
    return fromRecordId;
  }

  /**
   * Gets the toRecordId.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordId
   */
  public DataModelSystemProperty toRecordId() {
    return toRecordId;
  }

  /**
   * Gets the relationshipNumber.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipNumber
   */
  public DataModelSystemProperty relationshipNumber() {
    return relationshipNumber;
  }

  /**
   * Gets the toRecordType.
   *
   * Defines metadata of a system property.
   *
   * @return the toRecordType
   */
  public DataModelSystemProperty toRecordType() {
    return toRecordType;
  }

  /**
   * Gets the relationshipLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the relationshipLastUpdated
   */
  public DataModelSystemProperty relationshipLastUpdated() {
    return relationshipLastUpdated;
  }
}

