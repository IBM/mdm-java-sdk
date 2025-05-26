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
 * A single user defined attribute.
 */
public class DataModelAttribute extends GenericModel {

  protected Boolean indexed;
  @SerializedName("matching_type")
  protected String matchingType;
  protected String description;
  @SerializedName("attribute_type")
  protected String attributeType;
  protected String label;
  protected String classification;
  protected String cardinality;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean indexed;
    private String matchingType;
    private String description;
    private String attributeType;
    private String label;
    private String classification;
    private String cardinality;

    private Builder(DataModelAttribute dataModelAttribute) {
      this.indexed = dataModelAttribute.indexed;
      this.matchingType = dataModelAttribute.matchingType;
      this.description = dataModelAttribute.description;
      this.attributeType = dataModelAttribute.attributeType;
      this.label = dataModelAttribute.label;
      this.classification = dataModelAttribute.classification;
      this.cardinality = dataModelAttribute.cardinality;
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
     * Builds a DataModelAttribute.
     *
     * @return the new DataModelAttribute instance
     */
    public DataModelAttribute build() {
      return new DataModelAttribute(this);
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the DataModelAttribute builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the matchingType.
     *
     * @param matchingType the matchingType
     * @return the DataModelAttribute builder
     */
    public Builder matchingType(String matchingType) {
      this.matchingType = matchingType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelAttribute builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributeType.
     *
     * @param attributeType the attributeType
     * @return the DataModelAttribute builder
     */
    public Builder attributeType(String attributeType) {
      this.attributeType = attributeType;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelAttribute builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the DataModelAttribute builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }

    /**
     * Set the cardinality.
     *
     * @param cardinality the cardinality
     * @return the DataModelAttribute builder
     */
    public Builder cardinality(String cardinality) {
      this.cardinality = cardinality;
      return this;
    }
  }

  protected DataModelAttribute() { }

  protected DataModelAttribute(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributeType,
      "attributeType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    indexed = builder.indexed;
    matchingType = builder.matchingType;
    description = builder.description;
    attributeType = builder.attributeType;
    label = builder.label;
    classification = builder.classification;
    cardinality = builder.cardinality;
  }

  /**
   * New builder.
   *
   * @return a DataModelAttribute builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the indexed.
   *
   * User defined indexed indicator. The default value is true.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the matchingType.
   *
   * User defined matching type (only applicable to record type), one of PERSONNAME, ORGNAME, GENDER, DATE, EMAIL,
   * SOCIALMEDIA, ADDRESS, PHONE, NATIONALIDENTIFIER, OTHERIDENTIFIER, VECTOR or PAYMENTCARDNUMBER.
   *
   * @return the matchingType
   */
  public String matchingType() {
    return matchingType;
  }

  /**
   * Gets the description.
   *
   * User defined translatable description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the attributeType.
   *
   * The type of attribute (i.e. address).
   *
   * @return the attributeType
   */
  public String attributeType() {
    return attributeType;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the classification.
   *
   * User defined classification.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }

  /**
   * Gets the cardinality.
   *
   * User defined cardinality, one of SINGLE, LIST or SET. The default value is LIST.
   *
   * @return the cardinality
   */
  public String cardinality() {
    return cardinality;
  }
}

