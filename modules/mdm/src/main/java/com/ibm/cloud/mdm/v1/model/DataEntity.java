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

import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Information about an entity.
 */
public class DataEntity extends ElementWithAttributes {

  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("record_count")
  protected Long recordCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> attributes;
    private String typeName;
    private Long recordCount;

    public Builder(DataEntity dataEntity) {
      this.id = dataEntity.id;
      this.attributes = dataEntity.attributes;
      this.typeName = dataEntity.typeName;
      this.recordCount = dataEntity.recordCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributes the attributes
     * @param typeName the typeName
     * @param recordCount the recordCount
     */
    public Builder(Map<String, Object> attributes, String typeName, Long recordCount) {
      this.attributes = attributes;
      this.typeName = typeName;
      this.recordCount = recordCount;
    }

    /**
     * Builds a DataEntity.
     *
     * @return the new DataEntity instance
     */
    public DataEntity build() {
      return new DataEntity(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataEntity builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataEntity builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the DataEntity builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the recordCount.
     *
     * @param recordCount the recordCount
     * @return the DataEntity builder
     */
    public Builder recordCount(long recordCount) {
      this.recordCount = recordCount;
      return this;
    }
  }

  protected DataEntity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordCount,
      "recordCount cannot be null");
    id = builder.id;
    attributes = builder.attributes;
    typeName = builder.typeName;
    recordCount = builder.recordCount;
  }

  /**
   * New builder.
   *
   * @return a DataEntity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the typeName.
   *
   * The name of the entity type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the recordCount.
   *
   * The number of records linked into the entity.
   *
   * @return the recordCount
   */
  public Long recordCount() {
    return recordCount;
  }
}

