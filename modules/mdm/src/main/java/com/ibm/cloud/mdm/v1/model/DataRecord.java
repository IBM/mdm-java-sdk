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
 * Information about a record.
 */
public class DataRecord extends ElementWithAttributes {

  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("record_number")
  protected Long recordNumber;
  @SerializedName("entity_count")
  protected Long entityCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> attributes;
    private String typeName;

    public Builder(DataRecord dataRecord) {
      this.id = dataRecord.id;
      this.attributes = dataRecord.attributes;
      this.typeName = dataRecord.typeName;
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
     */
    public Builder(Map<String, Object> attributes, String typeName) {
      this.attributes = attributes;
      this.typeName = typeName;
    }

    /**
     * Builds a DataRecord.
     *
     * @return the new DataRecord instance
     */
    public DataRecord build() {
      return new DataRecord(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataRecord builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataRecord builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the DataRecord builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }
  }

  protected DataRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    id = builder.id;
    attributes = builder.attributes;
    typeName = builder.typeName;
  }

  /**
   * New builder.
   *
   * @return a DataRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the typeName.
   *
   * The name of the record type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of the record on the graph.
   *
   * @return the recordNumber
   */
  public Long recordNumber() {
    return recordNumber;
  }

  /**
   * Gets the entityCount.
   *
   * The number of entities linked from the record.
   *
   * @return the entityCount
   */
  public Long entityCount() {
    return entityCount;
  }
}

