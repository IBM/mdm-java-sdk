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
 * Information about a relationship.
 */
public class Relationship extends GenericModel {

  protected String type;
  protected String id;
  protected Map<String, Object> attributes;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("from_record_id")
  protected String fromRecordId;
  @SerializedName("from_record_source")
  protected String fromRecordSource;
  @SerializedName("from_record_number")
  protected String fromRecordNumber;
  @SerializedName("from_record_type")
  protected String fromRecordType;
  @SerializedName("to_record_id")
  protected String toRecordId;
  @SerializedName("to_record_source")
  protected String toRecordSource;
  @SerializedName("to_record_type")
  protected String toRecordType;
  @SerializedName("to_record_number")
  protected String toRecordNumber;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String id;
    private Map<String, Object> attributes;
    private String typeName;
    private String fromRecordId;
    private String fromRecordSource;
    private String fromRecordNumber;
    private String fromRecordType;
    private String toRecordId;
    private String toRecordSource;
    private String toRecordType;
    private String toRecordNumber;

    private Builder(Relationship relationship) {
      this.type = relationship.type;
      this.id = relationship.id;
      this.attributes = relationship.attributes;
      this.typeName = relationship.typeName;
      this.fromRecordId = relationship.fromRecordId;
      this.fromRecordSource = relationship.fromRecordSource;
      this.fromRecordNumber = relationship.fromRecordNumber;
      this.fromRecordType = relationship.fromRecordType;
      this.toRecordId = relationship.toRecordId;
      this.toRecordSource = relationship.toRecordSource;
      this.toRecordType = relationship.toRecordType;
      this.toRecordNumber = relationship.toRecordNumber;
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
     * Builds a Relationship.
     *
     * @return the new Relationship instance
     */
    public Relationship build() {
      return new Relationship(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Relationship builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Relationship builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the Relationship builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the Relationship builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the fromRecordId.
     *
     * @param fromRecordId the fromRecordId
     * @return the Relationship builder
     */
    public Builder fromRecordId(String fromRecordId) {
      this.fromRecordId = fromRecordId;
      return this;
    }

    /**
     * Set the fromRecordSource.
     *
     * @param fromRecordSource the fromRecordSource
     * @return the Relationship builder
     */
    public Builder fromRecordSource(String fromRecordSource) {
      this.fromRecordSource = fromRecordSource;
      return this;
    }

    /**
     * Set the fromRecordNumber.
     *
     * @param fromRecordNumber the fromRecordNumber
     * @return the Relationship builder
     */
    public Builder fromRecordNumber(String fromRecordNumber) {
      this.fromRecordNumber = fromRecordNumber;
      return this;
    }

    /**
     * Set the fromRecordType.
     *
     * @param fromRecordType the fromRecordType
     * @return the Relationship builder
     */
    public Builder fromRecordType(String fromRecordType) {
      this.fromRecordType = fromRecordType;
      return this;
    }

    /**
     * Set the toRecordId.
     *
     * @param toRecordId the toRecordId
     * @return the Relationship builder
     */
    public Builder toRecordId(String toRecordId) {
      this.toRecordId = toRecordId;
      return this;
    }

    /**
     * Set the toRecordSource.
     *
     * @param toRecordSource the toRecordSource
     * @return the Relationship builder
     */
    public Builder toRecordSource(String toRecordSource) {
      this.toRecordSource = toRecordSource;
      return this;
    }

    /**
     * Set the toRecordType.
     *
     * @param toRecordType the toRecordType
     * @return the Relationship builder
     */
    public Builder toRecordType(String toRecordType) {
      this.toRecordType = toRecordType;
      return this;
    }

    /**
     * Set the toRecordNumber.
     *
     * @param toRecordNumber the toRecordNumber
     * @return the Relationship builder
     */
    public Builder toRecordNumber(String toRecordNumber) {
      this.toRecordNumber = toRecordNumber;
      return this;
    }
  }

  protected Relationship(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    type = builder.type;
    id = builder.id;
    attributes = builder.attributes;
    typeName = builder.typeName;
    fromRecordId = builder.fromRecordId;
    fromRecordSource = builder.fromRecordSource;
    fromRecordNumber = builder.fromRecordNumber;
    fromRecordType = builder.fromRecordType;
    toRecordId = builder.toRecordId;
    toRecordSource = builder.toRecordSource;
    toRecordType = builder.toRecordType;
    toRecordNumber = builder.toRecordNumber;
  }

  /**
   * New builder.
   *
   * @return a Relationship builder
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
   * The name of the relationship type.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the fromRecordId.
   *
   * The record id of the source record.
   *
   * @return the fromRecordId
   */
  public String fromRecordId() {
    return fromRecordId;
  }

  /**
   * Gets the fromRecordSource.
   *
   * The source name of the source record.
   *
   * @return the fromRecordSource
   */
  public String fromRecordSource() {
    return fromRecordSource;
  }

  /**
   * Gets the fromRecordNumber.
   *
   * The unique id of the source record.
   *
   * @return the fromRecordNumber
   */
  public String fromRecordNumber() {
    return fromRecordNumber;
  }

  /**
   * Gets the fromRecordType.
   *
   * The name of the source record type.
   *
   * @return the fromRecordType
   */
  public String fromRecordType() {
    return fromRecordType;
  }

  /**
   * Gets the toRecordId.
   *
   * The id of the target record.
   *
   * @return the toRecordId
   */
  public String toRecordId() {
    return toRecordId;
  }

  /**
   * Gets the toRecordSource.
   *
   * The source name of the target record.
   *
   * @return the toRecordSource
   */
  public String toRecordSource() {
    return toRecordSource;
  }

  /**
   * Gets the toRecordType.
   *
   * The name of the target record type.
   *
   * @return the toRecordType
   */
  public String toRecordType() {
    return toRecordType;
  }

  /**
   * Gets the toRecordNumber.
   *
   * The unique id of the target record.
   *
   * @return the toRecordNumber
   */
  public String toRecordNumber() {
    return toRecordNumber;
  }
}

