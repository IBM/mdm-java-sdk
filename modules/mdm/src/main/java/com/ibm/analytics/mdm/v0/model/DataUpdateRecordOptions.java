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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataUpdateRecord options.
 */
public class DataUpdateRecordOptions extends GenericModel {

  protected Long id;
  protected Map<String, Object> newAttributes;
  protected String newType;
  protected String newId;
  protected String newTypeName;
  protected Long newEntityCount;
  protected Long newRecordNumber;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private Map<String, Object> newAttributes;
    private String newType;
    private String newId;
    private String newTypeName;
    private Long newEntityCount;
    private Long newRecordNumber;

    private Builder(DataUpdateRecordOptions dataUpdateRecordOptions) {
      this.id = dataUpdateRecordOptions.id;
      this.newAttributes = dataUpdateRecordOptions.newAttributes;
      this.newType = dataUpdateRecordOptions.newType;
      this.newId = dataUpdateRecordOptions.newId;
      this.newTypeName = dataUpdateRecordOptions.newTypeName;
      this.newEntityCount = dataUpdateRecordOptions.newEntityCount;
      this.newRecordNumber = dataUpdateRecordOptions.newRecordNumber;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param newAttributes the newAttributes
     */
    public Builder(Long id, Map<String, Object> newAttributes) {
      this.id = id;
      this.newAttributes = newAttributes;
    }

    /**
     * Builds a DataUpdateRecordOptions.
     *
     * @return the new DataUpdateRecordOptions instance
     */
    public DataUpdateRecordOptions build() {
      return new DataUpdateRecordOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataUpdateRecordOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the newAttributes.
     *
     * @param newAttributes the newAttributes
     * @return the DataUpdateRecordOptions builder
     */
    public Builder newAttributes(Map<String, Object> newAttributes) {
      this.newAttributes = newAttributes;
      return this;
    }

    /**
     * Set the newType.
     *
     * @param newType the newType
     * @return the DataUpdateRecordOptions builder
     */
    public Builder newType(String newType) {
      this.newType = newType;
      return this;
    }

    /**
     * Set the newId.
     *
     * @param newId the newId
     * @return the DataUpdateRecordOptions builder
     */
    public Builder newId(String newId) {
      this.newId = newId;
      return this;
    }

    /**
     * Set the newTypeName.
     *
     * @param newTypeName the newTypeName
     * @return the DataUpdateRecordOptions builder
     */
    public Builder newTypeName(String newTypeName) {
      this.newTypeName = newTypeName;
      return this;
    }

    /**
     * Set the newEntityCount.
     *
     * @param newEntityCount the newEntityCount
     * @return the DataUpdateRecordOptions builder
     */
    public Builder newEntityCount(long newEntityCount) {
      this.newEntityCount = newEntityCount;
      return this;
    }

    /**
     * Set the newRecordNumber.
     *
     * @param newRecordNumber the newRecordNumber
     * @return the DataUpdateRecordOptions builder
     */
    public Builder newRecordNumber(long newRecordNumber) {
      this.newRecordNumber = newRecordNumber;
      return this;
    }

    /**
     * Set the record.
     *
     * @param record the record
     * @return the DataUpdateRecordOptions builder
     */
    public Builder record(Record record) {
      this.newAttributes = record.attributes();
      this.newType = record.type();
      this.newId = record.id();
      this.newTypeName = record.typeName();
      this.newEntityCount = record.entityCount();
      this.newRecordNumber = record.recordNumber();
      return this;
    }
  }

  protected DataUpdateRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newAttributes,
      "newAttributes cannot be null");
    id = builder.id;
    newAttributes = builder.newAttributes;
    newType = builder.newType;
    newId = builder.newId;
    newTypeName = builder.newTypeName;
    newEntityCount = builder.newEntityCount;
    newRecordNumber = builder.newRecordNumber;
  }

  /**
   * New builder.
   *
   * @return a DataUpdateRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the record.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the newAttributes.
   *
   * list of the attributes of the element.
   *
   * @return the newAttributes
   */
  public Map<String, Object> newAttributes() {
    return newAttributes;
  }

  /**
   * Gets the newType.
   *
   * The type of the element.
   *
   * @return the newType
   */
  public String newType() {
    return newType;
  }

  /**
   * Gets the newId.
   *
   * The id of the element.
   *
   * @return the newId
   */
  public String newId() {
    return newId;
  }

  /**
   * Gets the newTypeName.
   *
   * The name of the record type.
   *
   * @return the newTypeName
   */
  public String newTypeName() {
    return newTypeName;
  }

  /**
   * Gets the newEntityCount.
   *
   * The number of entities derived and linked from the record.
   *
   * @return the newEntityCount
   */
  public Long newEntityCount() {
    return newEntityCount;
  }

  /**
   * Gets the newRecordNumber.
   *
   * @return the newRecordNumber
   */
  public Long newRecordNumber() {
    return newRecordNumber;
  }
}

