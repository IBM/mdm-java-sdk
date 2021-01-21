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
 * Record Type.
 */
public class RecordType extends GenericModel {

  protected String label;
  @SerializedName("entity_types")
  protected Map<String, EntityType> entityTypes;
  protected String description;
  protected Map<String, Attribute> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private Map<String, EntityType> entityTypes;
    private String description;
    private Map<String, Attribute> attributes;

    private Builder(RecordType recordType) {
      this.label = recordType.label;
      this.entityTypes = recordType.entityTypes;
      this.description = recordType.description;
      this.attributes = recordType.attributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param label the label
     */
    public Builder(String label) {
      this.label = label;
    }

    /**
     * Builds a RecordType.
     *
     * @return the new RecordType instance
     */
    public RecordType build() {
      return new RecordType(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the RecordType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the RecordType builder
     */
    public Builder entityTypes(Map<String, EntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RecordType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the RecordType builder
     */
    public Builder attributes(Map<String, Attribute> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected RecordType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    entityTypes = builder.entityTypes;
    description = builder.description;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a RecordType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the entityTypes.
   *
   * entity Types.
   *
   * @return the entityTypes
   */
  public Map<String, EntityType> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the description.
   *
   * record description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * record attributes.
   *
   * @return the attributes
   */
  public Map<String, Attribute> attributes() {
    return attributes;
  }
}

