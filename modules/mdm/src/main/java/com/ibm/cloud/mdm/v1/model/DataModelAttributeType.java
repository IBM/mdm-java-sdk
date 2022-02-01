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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined attribute type.
 */
public class DataModelAttributeType extends GenericModel {

  protected String label;
  protected String classification;
  @SerializedName("matching_types")
  protected List<String> matchingTypes;
  protected String description;
  protected Map<String, DataModelField> fields;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String classification;
    private List<String> matchingTypes;
    private String description;
    private Map<String, DataModelField> fields;

    private Builder(DataModelAttributeType dataModelAttributeType) {
      this.label = dataModelAttributeType.label;
      this.classification = dataModelAttributeType.classification;
      this.matchingTypes = dataModelAttributeType.matchingTypes;
      this.description = dataModelAttributeType.description;
      this.fields = dataModelAttributeType.fields;
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
     * @param fields the fields
     */
    public Builder(String label, Map<String, DataModelField> fields) {
      this.label = label;
      this.fields = fields;
    }

    /**
     * Builds a DataModelAttributeType.
     *
     * @return the new DataModelAttributeType instance
     */
    public DataModelAttributeType build() {
      return new DataModelAttributeType(this);
    }

    /**
     * Adds an matchingTypes to matchingTypes.
     *
     * @param matchingTypes the new matchingTypes
     * @return the DataModelAttributeType builder
     */
    public Builder addMatchingTypes(String matchingTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchingTypes,
        "matchingTypes cannot be null");
      if (this.matchingTypes == null) {
        this.matchingTypes = new ArrayList<String>();
      }
      this.matchingTypes.add(matchingTypes);
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelAttributeType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the DataModelAttributeType builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }

    /**
     * Set the matchingTypes.
     * Existing matchingTypes will be replaced.
     *
     * @param matchingTypes the matchingTypes
     * @return the DataModelAttributeType builder
     */
    public Builder matchingTypes(List<String> matchingTypes) {
      this.matchingTypes = matchingTypes;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelAttributeType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the fields.
     *
     * @param fields the fields
     * @return the DataModelAttributeType builder
     */
    public Builder fields(Map<String, DataModelField> fields) {
      this.fields = fields;
      return this;
    }
  }

  protected DataModelAttributeType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fields,
      "fields cannot be null");
    label = builder.label;
    classification = builder.classification;
    matchingTypes = builder.matchingTypes;
    description = builder.description;
    fields = builder.fields;
  }

  /**
   * New builder.
   *
   * @return a DataModelAttributeType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the matchingTypes.
   *
   * Collection of matching types, a subset of: PERSONNAME, ORGNAME, GENDER, DATE, EMAIL, SOCIALMEDIA, ADDRESS, PHONE,
   * NATIONALIDENTIFIER, OTHERIDENTIFIER and PAYMENTCARDNUMBER.
   *
   * @return the matchingTypes
   */
  public List<String> matchingTypes() {
    return matchingTypes;
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
   * Gets the fields.
   *
   * Collection of user defined fields.
   *
   * @return the fields
   */
  public Map<String, DataModelField> fields() {
    return fields;
  }
}

