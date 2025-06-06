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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single relationship type.
 */
public class DataModelRelationshipType extends GenericModel {

  protected Boolean internal;
  @SerializedName("label_from_source")
  protected String labelFromSource;
  @SerializedName("label_from_target")
  protected String labelFromTarget;
  @SerializedName("label_for_relationship")
  protected String labelForRelationship;
  protected Boolean directional;
  protected String description;
  protected List<DataModelRelationshipRule> rules;
  protected Map<String, DataModelAttribute> attributes;
  protected String label;
  protected String classification;
  protected String cardinality;
  @SerializedName("discovery_enabled")
  protected Boolean discoveryEnabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean internal;
    private String labelFromSource;
    private String labelFromTarget;
    private String labelForRelationship;
    private Boolean directional;
    private String description;
    private List<DataModelRelationshipRule> rules;
    private Map<String, DataModelAttribute> attributes;
    private String label;
    private String classification;
    private String cardinality;
    private Boolean discoveryEnabled;

    /**
     * Instantiates a new Builder from an existing DataModelRelationshipType instance.
     *
     * @param dataModelRelationshipType the instance to initialize the Builder with
     */
    private Builder(DataModelRelationshipType dataModelRelationshipType) {
      this.internal = dataModelRelationshipType.internal;
      this.labelFromSource = dataModelRelationshipType.labelFromSource;
      this.labelFromTarget = dataModelRelationshipType.labelFromTarget;
      this.labelForRelationship = dataModelRelationshipType.labelForRelationship;
      this.directional = dataModelRelationshipType.directional;
      this.description = dataModelRelationshipType.description;
      this.rules = dataModelRelationshipType.rules;
      this.attributes = dataModelRelationshipType.attributes;
      this.label = dataModelRelationshipType.label;
      this.classification = dataModelRelationshipType.classification;
      this.cardinality = dataModelRelationshipType.cardinality;
      this.discoveryEnabled = dataModelRelationshipType.discoveryEnabled;
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
     * Adds a new element to rules.
     *
     * @param rules the new element to be added
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
     * Set the internal.
     *
     * @param internal the internal
     * @return the DataModelRelationshipType builder
     */
    public Builder internal(Boolean internal) {
      this.internal = internal;
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
     * Set the labelForRelationship.
     *
     * @param labelForRelationship the labelForRelationship
     * @return the DataModelRelationshipType builder
     */
    public Builder labelForRelationship(String labelForRelationship) {
      this.labelForRelationship = labelForRelationship;
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
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelRelationshipType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
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
     * Set the classification.
     *
     * @param classification the classification
     * @return the DataModelRelationshipType builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
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
     * Set the discoveryEnabled.
     *
     * @param discoveryEnabled the discoveryEnabled
     * @return the DataModelRelationshipType builder
     */
    public Builder discoveryEnabled(Boolean discoveryEnabled) {
      this.discoveryEnabled = discoveryEnabled;
      return this;
    }
  }

  protected DataModelRelationshipType() { }

  protected DataModelRelationshipType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    internal = builder.internal;
    labelFromSource = builder.labelFromSource;
    labelFromTarget = builder.labelFromTarget;
    labelForRelationship = builder.labelForRelationship;
    directional = builder.directional;
    description = builder.description;
    rules = builder.rules;
    attributes = builder.attributes;
    label = builder.label;
    classification = builder.classification;
    cardinality = builder.cardinality;
    discoveryEnabled = builder.discoveryEnabled;
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
   * Gets the internal.
   *
   * True for linkage relationship, otherwise false. The default value is false.
   *
   * @return the internal
   */
  public Boolean internal() {
    return internal;
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
   * Gets the labelForRelationship.
   *
   * User defined translatable label for bidirectional relationship.
   *
   * @return the labelForRelationship
   */
  public String labelForRelationship() {
    return labelForRelationship;
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
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e. employment_detail).
   *
   * @return the attributes
   */
  public Map<String, DataModelAttribute> attributes() {
    return attributes;
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
   * A relationship class type.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
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
   * Gets the discoveryEnabled.
   *
   * True if relationship discovery is enabled.
   *
   * @return the discoveryEnabled
   */
  public Boolean discoveryEnabled() {
    return discoveryEnabled;
  }
}

