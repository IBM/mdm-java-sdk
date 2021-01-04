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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The information about a record.
 */
public class Record extends GenericModel {

  protected String type;
  protected String id;
  protected Map<String, Object> attributes;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("entity_count")
  protected Long entityCount;
  @SerializedName("record_number")
  protected Long recordNumber;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String id;
    private Map<String, Object> attributes;
    private String typeName;
    private Long entityCount;
    private Long recordNumber;

    private Builder(Record record) {
      this.type = record.type;
      this.id = record.id;
      this.attributes = record.attributes;
      this.typeName = record.typeName;
      this.entityCount = record.entityCount;
      this.recordNumber = record.recordNumber;
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
     */
    public Builder(Map<String, Object> attributes) {
      this.attributes = attributes;
    }

    /**
     * Builds a Record.
     *
     * @return the new Record instance
     */
    public Record build() {
      return new Record(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Record builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Record builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the Record builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the Record builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the entityCount.
     *
     * @param entityCount the entityCount
     * @return the Record builder
     */
    public Builder entityCount(long entityCount) {
      this.entityCount = entityCount;
      return this;
    }

    /**
     * Set the recordNumber.
     *
     * @param recordNumber the recordNumber
     * @return the Record builder
     */
    public Builder recordNumber(long recordNumber) {
      this.recordNumber = recordNumber;
      return this;
    }
  }

  protected Record(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    type = builder.type;
    id = builder.id;
    attributes = builder.attributes;
    typeName = builder.typeName;
    entityCount = builder.entityCount;
    recordNumber = builder.recordNumber;
  }

  /**
   * New builder.
   *
   * @return a Record builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The type of the element.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the id.
   *
   * The id of the element.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the attributes.
   *
   * list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> attributes() {
    return attributes;
  }

  /**
   * Gets the typeName.
   *
   * The name of the record type.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the entityCount.
   *
   * The number of entities derived and linked from the record.
   *
   * @return the entityCount
   */
  public Long entityCount() {
    return entityCount;
  }

  /**
   * Gets the recordNumber.
   *
   * @return the recordNumber
   */
  public Long recordNumber() {
    return recordNumber;
  }
}

