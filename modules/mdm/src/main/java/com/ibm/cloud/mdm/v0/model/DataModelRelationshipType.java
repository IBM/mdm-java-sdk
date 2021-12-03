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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single relationship type.
 */
public class DataModelRelationshipType extends GenericModel {

  protected Boolean directional;
  protected String label;
  protected List<DataModelRelationshipRule> rules;
  @SerializedName("label_from_source")
  protected String labelFromSource;
  @SerializedName("label_from_target")
  protected String labelFromTarget;
  protected String cardinality;
  protected String description;
  protected Map<String, DataModelAttribute> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean directional;
    private String label;
    private List<DataModelRelationshipRule> rules;
    private String labelFromSource;
    private String labelFromTarget;
    private String cardinality;
    private String description;
    private Map<String, DataModelAttribute> attributes;

    private Builder(DataModelRelationshipType dataModelRelationshipType) {
      this.directional = dataModelRelationshipType.directional;
      this.label = dataModelRelationshipType.label;
      this.rules = dataModelRelationshipType.rules;
      this.labelFromSource = dataModelRelationshipType.labelFromSource;
      this.labelFromTarget = dataModelRelationshipType.labelFromTarget;
      this.cardinality = dataModelRelationshipType.cardinality;
      this.description = dataModelRelationshipType.description;
      this.attributes = dataModelRelationshipType.attributes;
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
     * Builds a DataModelRelationshipType.
     *
     * @return the new DataModelRelationshipType instance
     */
    public DataModelRelationshipType build() {
      return new DataModelRelationshipType(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the DataModelRelationshipType builder
     */
    public Builder addRules(DataModelRelationshipRule rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<DataModelRelationshipRule>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the directional.
     *
     * @param directional the directional
     * @return the DataModelRelationshipType builder
     */
    public Builder directional(Boolean directional) {
      this.directional = directional;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelRelationshipType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the DataModelRelationshipType builder
     */
    public Builder rules(List<DataModelRelationshipRule> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the labelFromSource.
     *
     * @param labelFromSource the labelFromSource
     * @return the DataModelRelationshipType builder
     */
    public Builder labelFromSource(String labelFromSource) {
      this.labelFromSource = labelFromSource;
      return this;
    }

    /**
     * Set the labelFromTarget.
     *
     * @param labelFromTarget the labelFromTarget
     * @return the DataModelRelationshipType builder
     */
    public Builder labelFromTarget(String labelFromTarget) {
      this.labelFromTarget = labelFromTarget;
      return this;
    }

    /**
     * Set the cardinality.
     *
     * @param cardinality the cardinality
     * @return the DataModelRelationshipType builder
     */
    public Builder cardinality(String cardinality) {
      this.cardinality = cardinality;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelRelationshipType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelRelationshipType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected DataModelRelationshipType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    directional = builder.directional;
    label = builder.label;
    rules = builder.rules;
    labelFromSource = builder.labelFromSource;
    labelFromTarget = builder.labelFromTarget;
    cardinality = builder.cardinality;
    description = builder.description;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a DataModelRelationshipType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the directional.
   *
   * True if the relationship is directional, otherwise false. The default value is true.
   *
   * @return the directional
   */
  public Boolean directional() {
    return directional;
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
   * Gets the rules.
   *
   * Collection of defined relationship rules.
   *
   * @return the rules
   */
  public List<DataModelRelationshipRule> rules() {
    return rules;
  }

  /**
   * Gets the labelFromSource.
   *
   * User defined translatable label of 'from' endpoint in the relationship.
   *
   * @return the labelFromSource
   */
  public String labelFromSource() {
    return labelFromSource;
  }

  /**
   * Gets the labelFromTarget.
   *
   * User defined translatable label of 'to' endpoint in the relationship.
   *
   * @return the labelFromTarget
   */
  public String labelFromTarget() {
    return labelFromTarget;
  }

  /**
   * Gets the cardinality.
   *
   * User defined cardinality, one of MULTI, SIMPLE, MANY2ONE, ONE2MANY or ONE2ONE. The default value is MULTI.
   *
   * @return the cardinality
   */
  public String cardinality() {
    return cardinality;
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
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e. employment_detail).
   *
   * @return the attributes
   */
  public Map<String, DataModelAttribute> attributes() {
    return attributes;
  }
}

