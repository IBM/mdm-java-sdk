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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of the Data Model Attribute.
 */
public class Attribute extends GenericModel {

  protected String description;
  protected String classification;
  protected Boolean indexed;
  @SerializedName("attribute_type")
  protected String attributeType;
  protected String label;
  protected String cardinality;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String classification;
    private Boolean indexed;
    private String attributeType;
    private String label;
    private String cardinality;

    private Builder(Attribute attribute) {
      this.description = attribute.description;
      this.classification = attribute.classification;
      this.indexed = attribute.indexed;
      this.attributeType = attribute.attributeType;
      this.label = attribute.label;
      this.cardinality = attribute.cardinality;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributeType the attributeType
     * @param label the label
     */
    public Builder(String attributeType, String label) {
      this.attributeType = attributeType;
      this.label = label;
    }

    /**
     * Builds a Attribute.
     *
     * @return the new Attribute instance
     */
    public Attribute build() {
      return new Attribute(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Attribute builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the Attribute builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the Attribute builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the attributeType.
     *
     * @param attributeType the attributeType
     * @return the Attribute builder
     */
    public Builder attributeType(String attributeType) {
      this.attributeType = attributeType;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the Attribute builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the cardinality.
     *
     * @param cardinality the cardinality
     * @return the Attribute builder
     */
    public Builder cardinality(String cardinality) {
      this.cardinality = cardinality;
      return this;
    }
  }

  protected Attribute(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeType,
      "attributeType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    description = builder.description;
    classification = builder.classification;
    indexed = builder.indexed;
    attributeType = builder.attributeType;
    label = builder.label;
    cardinality = builder.cardinality;
  }

  /**
   * New builder.
   *
   * @return a Attribute builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * The description of this Data Model Attribute.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the classification.
   *
   * The classification of this Data Model Attribute.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }

  /**
   * Gets the indexed.
   *
   * Specifies whether the field property is indexed for text searches.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the attributeType.
   *
   * The data type of this Attribute element.
   *
   * @return the attributeType
   */
  public String attributeType() {
    return attributeType;
  }

  /**
   * Gets the label.
   *
   * The displayable text for this Attribute element.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the cardinality.
   *
   * The number of data points the specific attribute can represen.
   *
   * @return the cardinality
   */
  public String cardinality() {
    return cardinality;
  }
}

