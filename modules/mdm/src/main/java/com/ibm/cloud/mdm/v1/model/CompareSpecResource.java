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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single comparison resource used to customize comparison logic of a matching algorithm.
 */
public class CompareSpecResource extends GenericModel {

  @SerializedName("feature_categories")
  protected Map<String, CompareSpecResourceFeatureCategory> featureCategories;
  @SerializedName("typo_distance")
  protected Float typoDistance;
  @SerializedName("similar_characters_enabled")
  protected Boolean similarCharactersEnabled;
  @SerializedName("similar_characters_map_resource")
  protected String similarCharactersMapResource;
  @SerializedName("raw_edit_distance_enabled")
  protected Boolean rawEditDistanceEnabled;
  @SerializedName("max_geo_distance")
  protected Float maxGeoDistance;
  @SerializedName("feature_coefficients")
  protected Map<String, Float> featureCoefficients;
  @SerializedName("similar_characters_distance")
  protected Float similarCharactersDistance;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, CompareSpecResourceFeatureCategory> featureCategories;
    private Float typoDistance;
    private Boolean similarCharactersEnabled;
    private String similarCharactersMapResource;
    private Boolean rawEditDistanceEnabled;
    private Float maxGeoDistance;
    private Map<String, Float> featureCoefficients;
    private Float similarCharactersDistance;

    private Builder(CompareSpecResource compareSpecResource) {
      this.featureCategories = compareSpecResource.featureCategories;
      this.typoDistance = compareSpecResource.typoDistance;
      this.similarCharactersEnabled = compareSpecResource.similarCharactersEnabled;
      this.similarCharactersMapResource = compareSpecResource.similarCharactersMapResource;
      this.rawEditDistanceEnabled = compareSpecResource.rawEditDistanceEnabled;
      this.maxGeoDistance = compareSpecResource.maxGeoDistance;
      this.featureCoefficients = compareSpecResource.featureCoefficients;
      this.similarCharactersDistance = compareSpecResource.similarCharactersDistance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param featureCategories the featureCategories
     * @param featureCoefficients the featureCoefficients
     */
    public Builder(Map<String, CompareSpecResourceFeatureCategory> featureCategories, Map<String, Float> featureCoefficients) {
      this.featureCategories = featureCategories;
      this.featureCoefficients = featureCoefficients;
    }

    /**
     * Builds a CompareSpecResource.
     *
     * @return the new CompareSpecResource instance
     */
    public CompareSpecResource build() {
      return new CompareSpecResource(this);
    }

    /**
     * Set the featureCategories.
     *
     * @param featureCategories the featureCategories
     * @return the CompareSpecResource builder
     */
    public Builder featureCategories(Map<String, CompareSpecResourceFeatureCategory> featureCategories) {
      this.featureCategories = featureCategories;
      return this;
    }

    /**
     * Set the typoDistance.
     *
     * @param typoDistance the typoDistance
     * @return the CompareSpecResource builder
     */
    public Builder typoDistance(Float typoDistance) {
      this.typoDistance = typoDistance;
      return this;
    }

    /**
     * Set the similarCharactersEnabled.
     *
     * @param similarCharactersEnabled the similarCharactersEnabled
     * @return the CompareSpecResource builder
     */
    public Builder similarCharactersEnabled(Boolean similarCharactersEnabled) {
      this.similarCharactersEnabled = similarCharactersEnabled;
      return this;
    }

    /**
     * Set the similarCharactersMapResource.
     *
     * @param similarCharactersMapResource the similarCharactersMapResource
     * @return the CompareSpecResource builder
     */
    public Builder similarCharactersMapResource(String similarCharactersMapResource) {
      this.similarCharactersMapResource = similarCharactersMapResource;
      return this;
    }

    /**
     * Set the rawEditDistanceEnabled.
     *
     * @param rawEditDistanceEnabled the rawEditDistanceEnabled
     * @return the CompareSpecResource builder
     */
    public Builder rawEditDistanceEnabled(Boolean rawEditDistanceEnabled) {
      this.rawEditDistanceEnabled = rawEditDistanceEnabled;
      return this;
    }

    /**
     * Set the maxGeoDistance.
     *
     * @param maxGeoDistance the maxGeoDistance
     * @return the CompareSpecResource builder
     */
    public Builder maxGeoDistance(Float maxGeoDistance) {
      this.maxGeoDistance = maxGeoDistance;
      return this;
    }

    /**
     * Set the featureCoefficients.
     *
     * @param featureCoefficients the featureCoefficients
     * @return the CompareSpecResource builder
     */
    public Builder featureCoefficients(Map<String, Float> featureCoefficients) {
      this.featureCoefficients = featureCoefficients;
      return this;
    }

    /**
     * Set the similarCharactersDistance.
     *
     * @param similarCharactersDistance the similarCharactersDistance
     * @return the CompareSpecResource builder
     */
    public Builder similarCharactersDistance(Float similarCharactersDistance) {
      this.similarCharactersDistance = similarCharactersDistance;
      return this;
    }
  }

  protected CompareSpecResource() { }

  protected CompareSpecResource(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureCategories,
      "featureCategories cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureCoefficients,
      "featureCoefficients cannot be null");
    featureCategories = builder.featureCategories;
    typoDistance = builder.typoDistance;
    similarCharactersEnabled = builder.similarCharactersEnabled;
    similarCharactersMapResource = builder.similarCharactersMapResource;
    rawEditDistanceEnabled = builder.rawEditDistanceEnabled;
    maxGeoDistance = builder.maxGeoDistance;
    featureCoefficients = builder.featureCoefficients;
    similarCharactersDistance = builder.similarCharactersDistance;
  }

  /**
   * New builder.
   *
   * @return a CompareSpecResource builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the featureCategories.
   *
   * Collection of user defined comparison feature categories. The feature category key must be lower snake case.
   *
   * @return the featureCategories
   */
  public Map<String, CompareSpecResourceFeatureCategory> featureCategories() {
    return featureCategories;
  }

  /**
   * Gets the typoDistance.
   *
   * The distance factor for each occurence of typographical error. The value must be between 0 to 1.
   *
   * @return the typoDistance
   */
  public Float typoDistance() {
    return typoDistance;
  }

  /**
   * Gets the similarCharactersEnabled.
   *
   * The indicator of using similarity edit distance. The default value is false.
   *
   * @return the similarCharactersEnabled
   */
  public Boolean similarCharactersEnabled() {
    return similarCharactersEnabled;
  }

  /**
   * Gets the similarCharactersMapResource.
   *
   * An existing map resource name for lookalike characters.
   *
   * @return the similarCharactersMapResource
   */
  public String similarCharactersMapResource() {
    return similarCharactersMapResource;
  }

  /**
   * Gets the rawEditDistanceEnabled.
   *
   * The indicator of using the raw edit distance value instead of the weighted one. The default value is false.
   *
   * @return the rawEditDistanceEnabled
   */
  public Boolean rawEditDistanceEnabled() {
    return rawEditDistanceEnabled;
  }

  /**
   * Gets the maxGeoDistance.
   *
   * The max distance for geo compare should consider.
   *
   * @return the maxGeoDistance
   */
  public Float maxGeoDistance() {
    return maxGeoDistance;
  }

  /**
   * Gets the featureCoefficients.
   *
   * Collection of feature coefficients used for distance measurement. The feature coefficient key must be lower snake
   * case (i.e. name_similar90, name_exact).
   *
   * @return the featureCoefficients
   */
  public Map<String, Float> featureCoefficients() {
    return featureCoefficients;
  }

  /**
   * Gets the similarCharactersDistance.
   *
   * The distance factor for each occurence of lookalike characters (i.e. 8 vs B, 0 vs O). The value must be between 0
   * to 1.
   *
   * @return the similarCharactersDistance
   */
  public Float similarCharactersDistance() {
    return similarCharactersDistance;
  }
}

