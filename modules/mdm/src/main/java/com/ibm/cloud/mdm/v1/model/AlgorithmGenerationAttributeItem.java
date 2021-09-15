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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * AlgorithmGenerationAttributeItem.
 */
public class AlgorithmGenerationAttributeItem extends GenericModel {

  @SerializedName("matching_fields")
  protected List<String> matchingFields;
  protected List<String> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> matchingFields;
    private List<String> attributes;

    private Builder(AlgorithmGenerationAttributeItem algorithmGenerationAttributeItem) {
      this.matchingFields = algorithmGenerationAttributeItem.matchingFields;
      this.attributes = algorithmGenerationAttributeItem.attributes;
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
     * Adds an matchingFields to matchingFields.
     *
     * @param matchingFields the new matchingFields
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
     * Adds an attributes to attributes.
     *
     * @param attributes the new attributes
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
  }

  protected AlgorithmGenerationAttributeItem(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    matchingFields = builder.matchingFields;
    attributes = builder.attributes;
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
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e. employment_detail).
   *
   * @return the attributes
   */
  public List<String> attributes() {
    return attributes;
  }
}

