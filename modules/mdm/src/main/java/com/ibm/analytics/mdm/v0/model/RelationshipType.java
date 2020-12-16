/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Relationship Type.
 */
public class RelationshipType extends GenericModel {

  @SerializedName("label_from_source")
  protected String labelFromSource;
  @SerializedName("label_from_target")
  protected String labelFromTarget;
  protected Boolean directional;
  protected List<Rule> rules;
  protected String description;
  protected String cardinality;
  protected Map<String, Attribute> attributes;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private String labelFromSource;
    private String labelFromTarget;
    private Boolean directional;
    private List<Rule> rules;
    private String description;
    private String cardinality;
    private Map<String, Attribute> attributes;
    private String label;

    private Builder(RelationshipType relationshipType) {
      this.labelFromSource = relationshipType.labelFromSource;
      this.labelFromTarget = relationshipType.labelFromTarget;
      this.directional = relationshipType.directional;
      this.rules = relationshipType.rules;
      this.description = relationshipType.description;
      this.cardinality = relationshipType.cardinality;
      this.attributes = relationshipType.attributes;
      this.label = relationshipType.label;
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
  }

  protected RelationshipType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    labelFromSource = builder.labelFromSource;
    labelFromTarget = builder.labelFromTarget;
    directional = builder.directional;
    rules = builder.rules;
    description = builder.description;
    cardinality = builder.cardinality;
    attributes = builder.attributes;
    label = builder.label;
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
   * Gets the labelFromSource.
   *
   * label from source.
   *
   * @return the labelFromSource
   */
  public String labelFromSource() {
    return labelFromSource;
  }

  /**
   * Gets the labelFromTarget.
   *
   * label from target.
   *
   * @return the labelFromTarget
   */
  public String labelFromTarget() {
    return labelFromTarget;
  }

  /**
   * Gets the directional.
   *
   * is directional.
   *
   * @return the directional
   */
  public Boolean directional() {
    return directional;
  }

  /**
   * Gets the rules.
   *
   * rules.
   *
   * @return the rules
   */
  public List<Rule> rules() {
    return rules;
  }

  /**
   * Gets the description.
   *
   * description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the cardinality.
   *
   * cardinality.
   *
   * @return the cardinality
   */
  public String cardinality() {
    return cardinality;
  }

  /**
   * Gets the attributes.
   *
   * attributes.
   *
   * @return the attributes
   */
  public Map<String, Attribute> attributes() {
    return attributes;
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
}

