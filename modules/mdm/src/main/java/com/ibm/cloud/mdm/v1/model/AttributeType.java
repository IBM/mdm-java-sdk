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
package com.ibm.cloud.mdm.v1.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper with details of attribute type.
 */
public class AttributeType extends GenericModel {

  protected String label;
  protected String description;
  protected String classification;
  protected Map<String, FieldType> fields;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String description;
    private String classification;
    private Map<String, FieldType> fields;

    private Builder(AttributeType attributeType) {
      this.label = attributeType.label;
      this.description = attributeType.description;
      this.classification = attributeType.classification;
      this.fields = attributeType.fields;
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
     * Builds a AttributeType.
     *
     * @return the new AttributeType instance
     */
    public AttributeType build() {
      return new AttributeType(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AttributeType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the AttributeType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the AttributeType builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }

    /**
     * Set the fields.
     *
     * @param fields the fields
     * @return the AttributeType builder
     */
    public Builder fields(Map<String, FieldType> fields) {
      this.fields = fields;
      return this;
    }
  }

  protected AttributeType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    description = builder.description;
    classification = builder.classification;
    fields = builder.fields;
  }

  /**
   * New builder.
   *
   * @return a AttributeType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * The displayable text for this attribute type.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the description.
   *
   * The description of the attribute type.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the classification.
   *
   * The classification of the attribute type.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }

  /**
   * Gets the fields.
   *
   * Collection of fields of the attribute type.
   *
   * @return the fields
   */
  public Map<String, FieldType> fields() {
    return fields;
  }
}

