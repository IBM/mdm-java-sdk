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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A single read-only entity type.
 */
public class AlgorithmGenerationEntityType extends DynamicModel<Object> {

  @SerializedName("matching_attributes")
  protected List<AlgorithmGenerationAttributeItem> matchingAttributes;
  @SerializedName("auto_link_threshold")
  protected Float autoLinkThreshold;

  public AlgorithmGenerationEntityType() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<AlgorithmGenerationAttributeItem> matchingAttributes;
    private Float autoLinkThreshold;
    private Map<String, Object> dynamicProperties;

    private Builder(AlgorithmGenerationEntityType algorithmGenerationEntityType) {
      this.matchingAttributes = algorithmGenerationEntityType.matchingAttributes;
      this.autoLinkThreshold = algorithmGenerationEntityType.autoLinkThreshold;
      this.dynamicProperties = algorithmGenerationEntityType.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param matchingAttributes the matchingAttributes
     */
    public Builder(List<AlgorithmGenerationAttributeItem> matchingAttributes) {
      this.matchingAttributes = matchingAttributes;
    }

    /**
     * Builds a AlgorithmGenerationEntityType.
     *
     * @return the new AlgorithmGenerationEntityType instance
     */
    public AlgorithmGenerationEntityType build() {
      return new AlgorithmGenerationEntityType(this);
    }

    /**
     * Adds an matchingAttributes to matchingAttributes.
     *
     * @param matchingAttributes the new matchingAttributes
     * @return the AlgorithmGenerationEntityType builder
     */
    public Builder addMatchingAttributes(AlgorithmGenerationAttributeItem matchingAttributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchingAttributes,
        "matchingAttributes cannot be null");
      if (this.matchingAttributes == null) {
        this.matchingAttributes = new ArrayList<AlgorithmGenerationAttributeItem>();
      }
      this.matchingAttributes.add(matchingAttributes);
      return this;
    }

    /**
     * Set the matchingAttributes.
     * Existing matchingAttributes will be replaced.
     *
     * @param matchingAttributes the matchingAttributes
     * @return the AlgorithmGenerationEntityType builder
     */
    public Builder matchingAttributes(List<AlgorithmGenerationAttributeItem> matchingAttributes) {
      this.matchingAttributes = matchingAttributes;
      return this;
    }

    /**
     * Set the autoLinkThreshold.
     *
     * @param autoLinkThreshold the autoLinkThreshold
     * @return the AlgorithmGenerationEntityType builder
     */
    public Builder autoLinkThreshold(Float autoLinkThreshold) {
      this.autoLinkThreshold = autoLinkThreshold;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the AlgorithmGenerationEntityType builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected AlgorithmGenerationEntityType(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchingAttributes,
      "matchingAttributes cannot be null");
    matchingAttributes = builder.matchingAttributes;
    autoLinkThreshold = builder.autoLinkThreshold;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a AlgorithmGenerationEntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the matchingAttributes.
   *
   * Collection of user defined attribute types. The attribute type key must be lower snake case (i.e. address).
   *
   * @return the matchingAttributes
   */
  public List<AlgorithmGenerationAttributeItem> getMatchingAttributes() {
    return this.matchingAttributes;
  }

  /**
   * Sets the matchingAttributes.
   *
   * @param matchingAttributes the new matchingAttributes
   */
  public void setMatchingAttributes(final List<AlgorithmGenerationAttributeItem> matchingAttributes) {
    this.matchingAttributes = matchingAttributes;
  }

  /**
   * Gets the autoLinkThreshold.
   *
   * The minimum matching score between two records to automatically link them together.
   *
   * @return the autoLinkThreshold
   */
  public Float getAutoLinkThreshold() {
    return this.autoLinkThreshold;
  }

  /**
   * Sets the autoLinkThreshold.
   *
   * @param autoLinkThreshold the new autoLinkThreshold
   */
  public void setAutoLinkThreshold(final Float autoLinkThreshold) {
    this.autoLinkThreshold = autoLinkThreshold;
  }
}
