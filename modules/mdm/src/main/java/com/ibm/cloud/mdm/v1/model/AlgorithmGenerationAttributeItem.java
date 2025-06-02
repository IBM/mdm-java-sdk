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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AlgorithmGenerationAttributeItem.
 */
public class AlgorithmGenerationAttributeItem extends GenericModel {

  @SerializedName("overall_score_contribution")
  protected Boolean overallScoreContribution;
  protected List<String> attributes;
  @SerializedName("matching_fields")
  protected List<String> matchingFields;
  @SerializedName("post_filter_methods")
  protected List<String> postFilterMethods;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean overallScoreContribution;
    private List<String> attributes;
    private List<String> matchingFields;
    private List<String> postFilterMethods;

    /**
     * Instantiates a new Builder from an existing AlgorithmGenerationAttributeItem instance.
     *
     * @param algorithmGenerationAttributeItem the instance to initialize the Builder with
     */
    private Builder(AlgorithmGenerationAttributeItem algorithmGenerationAttributeItem) {
      this.overallScoreContribution = algorithmGenerationAttributeItem.overallScoreContribution;
      this.attributes = algorithmGenerationAttributeItem.attributes;
      this.matchingFields = algorithmGenerationAttributeItem.matchingFields;
      this.postFilterMethods = algorithmGenerationAttributeItem.postFilterMethods;
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
    public Builder(List<String> attributes) {
      this.attributes = attributes;
    }

    /**
     * Builds a AlgorithmGenerationAttributeItem.
     *
     * @return the new AlgorithmGenerationAttributeItem instance
     */
    public AlgorithmGenerationAttributeItem build() {
      return new AlgorithmGenerationAttributeItem(this);
    }

    /**
     * Adds a new element to attributes.
     *
     * @param attributes the new element to be added
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder addAttributes(String attributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attributes,
        "attributes cannot be null");
      if (this.attributes == null) {
        this.attributes = new ArrayList<String>();
      }
      this.attributes.add(attributes);
      return this;
    }

    /**
     * Adds a new element to matchingFields.
     *
     * @param matchingFields the new element to be added
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder addMatchingFields(String matchingFields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchingFields,
        "matchingFields cannot be null");
      if (this.matchingFields == null) {
        this.matchingFields = new ArrayList<String>();
      }
      this.matchingFields.add(matchingFields);
      return this;
    }

    /**
     * Adds a new element to postFilterMethods.
     *
     * @param postFilterMethods the new element to be added
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder addPostFilterMethods(String postFilterMethods) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(postFilterMethods,
        "postFilterMethods cannot be null");
      if (this.postFilterMethods == null) {
        this.postFilterMethods = new ArrayList<String>();
      }
      this.postFilterMethods.add(postFilterMethods);
      return this;
    }

    /**
     * Set the overallScoreContribution.
     *
     * @param overallScoreContribution the overallScoreContribution
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder overallScoreContribution(Boolean overallScoreContribution) {
      this.overallScoreContribution = overallScoreContribution;
      return this;
    }

    /**
     * Set the attributes.
     * Existing attributes will be replaced.
     *
     * @param attributes the attributes
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder attributes(List<String> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the matchingFields.
     * Existing matchingFields will be replaced.
     *
     * @param matchingFields the matchingFields
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder matchingFields(List<String> matchingFields) {
      this.matchingFields = matchingFields;
      return this;
    }

    /**
     * Set the postFilterMethods.
     * Existing postFilterMethods will be replaced.
     *
     * @param postFilterMethods the postFilterMethods
     * @return the AlgorithmGenerationAttributeItem builder
     */
    public Builder postFilterMethods(List<String> postFilterMethods) {
      this.postFilterMethods = postFilterMethods;
      return this;
    }
  }

  protected AlgorithmGenerationAttributeItem() { }

  protected AlgorithmGenerationAttributeItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    overallScoreContribution = builder.overallScoreContribution;
    attributes = builder.attributes;
    matchingFields = builder.matchingFields;
    postFilterMethods = builder.postFilterMethods;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmGenerationAttributeItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the overallScoreContribution.
   *
   * whether or not the corresponding compare_method should contribute to overall score.
   *
   * @return the overallScoreContribution
   */
  public Boolean overallScoreContribution() {
    return overallScoreContribution;
  }

  /**
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e. employment_detail).
   *
   * @return the attributes
   */
  public List<String> attributes() {
    return attributes;
  }

  /**
   * Gets the matchingFields.
   *
   * the fields to be modified.
   *
   * @return the matchingFields
   */
  public List<String> matchingFields() {
    return matchingFields;
  }

  /**
   * Gets the postFilterMethods.
   *
   * Collection of post_filter_method that attributes contribute to.
   *
   * @return the postFilterMethods
   */
  public List<String> postFilterMethods() {
    return postFilterMethods;
  }
}

