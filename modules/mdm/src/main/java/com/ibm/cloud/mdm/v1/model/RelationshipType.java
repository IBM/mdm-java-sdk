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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Relationship Type definition.
 */
public class RelationshipType extends GenericModel {

  protected String label;
  protected List<Rule> rules;
  @SerializedName("label_from_source")
  protected String labelFromSource;
  @SerializedName("label_from_target")
  protected String labelFromTarget;
  protected Boolean directional;
  protected String description;
  protected String cardinality;
  protected Map<String, Attribute> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private List<Rule> rules;
    private String labelFromSource;
    private String labelFromTarget;
    private Boolean directional;
    private String description;
    private String cardinality;
    private Map<String, Attribute> attributes;

    private Builder(RelationshipType relationshipType) {
      this.label = relationshipType.label;
      this.rules = relationshipType.rules;
      this.labelFromSource = relationshipType.labelFromSource;
      this.labelFromTarget = relationshipType.labelFromTarget;
      this.directional = relationshipType.directional;
      this.description = relationshipType.description;
      this.cardinality = relationshipType.cardinality;
      this.attributes = relationshipType.attributes;
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
     * Builds a RelationshipType.
     *
     * @return the new RelationshipType instance
     */
    public RelationshipType build() {
      return new RelationshipType(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the RelationshipType builder
     */
    public Builder addRules(Rule rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<Rule>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the RelationshipType builder
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
     * @return the RelationshipType builder
     */
    public Builder rules(List<Rule> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the labelFromSource.
     *
     * @param labelFromSource the labelFromSource
     * @return the RelationshipType builder
     */
    public Builder labelFromSource(String labelFromSource) {
      this.labelFromSource = labelFromSource;
      return this;
    }

    /**
     * Set the labelFromTarget.
     *
     * @param labelFromTarget the labelFromTarget
     * @return the RelationshipType builder
     */
    public Builder labelFromTarget(String labelFromTarget) {
      this.labelFromTarget = labelFromTarget;
      return this;
    }

    /**
     * Set the directional.
     *
     * @param directional the directional
     * @return the RelationshipType builder
     */
    public Builder directional(Boolean directional) {
      this.directional = directional;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RelationshipType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the cardinality.
     *
     * @param cardinality the cardinality
     * @return the RelationshipType builder
     */
    public Builder cardinality(String cardinality) {
      this.cardinality = cardinality;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the RelationshipType builder
     */
    public Builder attributes(Map<String, Attribute> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected RelationshipType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    rules = builder.rules;
    labelFromSource = builder.labelFromSource;
    labelFromTarget = builder.labelFromTarget;
    directional = builder.directional;
    description = builder.description;
    cardinality = builder.cardinality;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a RelationshipType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * The displayable text for this relationship element.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the rules.
   *
   * Collection of Relationship Rules.
   *
   * @return the rules
   */
  public List<Rule> rules() {
    return rules;
  }

  /**
   * Gets the labelFromSource.
   *
   * The default label display text of a source record's relationship.
   *
   * @return the labelFromSource
   */
  public String labelFromSource() {
    return labelFromSource;
  }

  /**
   * Gets the labelFromTarget.
   *
   * The default label display text of a target record's relationship.
   *
   * @return the labelFromTarget
   */
  public String labelFromTarget() {
    return labelFromTarget;
  }

  /**
   * Gets the directional.
   *
   * Specifies whether the relationship is directional.
   *
   * @return the directional
   */
  public Boolean directional() {
    return directional;
  }

  /**
   * Gets the description.
   *
   * The description of the model element.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the cardinality.
   *
   * The number of data points the specific property can represent.
   *
   * @return the cardinality
   */
  public String cardinality() {
    return cardinality;
  }

  /**
   * Gets the attributes.
   *
   * Collection of attributes.
   *
   * @return the attributes
   */
  public Map<String, Attribute> attributes() {
    return attributes;
  }
}

