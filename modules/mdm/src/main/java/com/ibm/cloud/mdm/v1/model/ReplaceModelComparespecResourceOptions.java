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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceModelComparespecResource options.
 */
public class ReplaceModelComparespecResourceOptions extends GenericModel {

  protected String resourceName;
  protected Map<String, CompareSpecResourceFeatureCategory> featureCategories;
  protected Map<String, Float> featureCoefficients;
  protected Float typoDistance;
  protected Boolean similarCharactersEnabled;
  protected String similarCharactersMapResource;
  protected Boolean rawEditDistanceEnabled;
  protected Float maxGeoDistance;
  protected Float similarCharactersDistance;

  /**
   * Builder.
   */
  public static class Builder {
    private String resourceName;
    private Map<String, CompareSpecResourceFeatureCategory> featureCategories;
    private Map<String, Float> featureCoefficients;
    private Float typoDistance;
    private Boolean similarCharactersEnabled;
    private String similarCharactersMapResource;
    private Boolean rawEditDistanceEnabled;
    private Float maxGeoDistance;
    private Float similarCharactersDistance;

    /**
     * Instantiates a new Builder from an existing ReplaceModelComparespecResourceOptions instance.
     *
     * @param replaceModelComparespecResourceOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions) {
      this.resourceName = replaceModelComparespecResourceOptions.resourceName;
      this.featureCategories = replaceModelComparespecResourceOptions.featureCategories;
      this.featureCoefficients = replaceModelComparespecResourceOptions.featureCoefficients;
      this.typoDistance = replaceModelComparespecResourceOptions.typoDistance;
      this.similarCharactersEnabled = replaceModelComparespecResourceOptions.similarCharactersEnabled;
      this.similarCharactersMapResource = replaceModelComparespecResourceOptions.similarCharactersMapResource;
      this.rawEditDistanceEnabled = replaceModelComparespecResourceOptions.rawEditDistanceEnabled;
      this.maxGeoDistance = replaceModelComparespecResourceOptions.maxGeoDistance;
      this.similarCharactersDistance = replaceModelComparespecResourceOptions.similarCharactersDistance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resourceName the resourceName
     * @param featureCategories the featureCategories
     * @param featureCoefficients the featureCoefficients
     */
    public Builder(String resourceName, Map<String, CompareSpecResourceFeatureCategory> featureCategories, Map<String, Float> featureCoefficients) {
      this.resourceName = resourceName;
      this.featureCategories = featureCategories;
      this.featureCoefficients = featureCoefficients;
    }

    /**
     * Builds a ReplaceModelComparespecResourceOptions.
     *
     * @return the new ReplaceModelComparespecResourceOptions instance
     */
    public ReplaceModelComparespecResourceOptions build() {
      return new ReplaceModelComparespecResourceOptions(this);
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    /**
     * Set the featureCategories.
     *
     * @param featureCategories the featureCategories
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder featureCategories(Map<String, CompareSpecResourceFeatureCategory> featureCategories) {
      this.featureCategories = featureCategories;
      return this;
    }

    /**
     * Set the featureCoefficients.
     *
     * @param featureCoefficients the featureCoefficients
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder featureCoefficients(Map<String, Float> featureCoefficients) {
      this.featureCoefficients = featureCoefficients;
      return this;
    }

    /**
     * Set the typoDistance.
     *
     * @param typoDistance the typoDistance
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder typoDistance(Float typoDistance) {
      this.typoDistance = typoDistance;
      return this;
    }

    /**
     * Set the similarCharactersEnabled.
     *
     * @param similarCharactersEnabled the similarCharactersEnabled
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder similarCharactersEnabled(Boolean similarCharactersEnabled) {
      this.similarCharactersEnabled = similarCharactersEnabled;
      return this;
    }

    /**
     * Set the similarCharactersMapResource.
     *
     * @param similarCharactersMapResource the similarCharactersMapResource
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder similarCharactersMapResource(String similarCharactersMapResource) {
      this.similarCharactersMapResource = similarCharactersMapResource;
      return this;
    }

    /**
     * Set the rawEditDistanceEnabled.
     *
     * @param rawEditDistanceEnabled the rawEditDistanceEnabled
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder rawEditDistanceEnabled(Boolean rawEditDistanceEnabled) {
      this.rawEditDistanceEnabled = rawEditDistanceEnabled;
      return this;
    }

    /**
     * Set the maxGeoDistance.
     *
     * @param maxGeoDistance the maxGeoDistance
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder maxGeoDistance(Float maxGeoDistance) {
      this.maxGeoDistance = maxGeoDistance;
      return this;
    }

    /**
     * Set the similarCharactersDistance.
     *
     * @param similarCharactersDistance the similarCharactersDistance
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder similarCharactersDistance(Float similarCharactersDistance) {
      this.similarCharactersDistance = similarCharactersDistance;
      return this;
    }

    /**
     * Set the compareSpecResource.
     *
     * @param compareSpecResource the compareSpecResource
     * @return the ReplaceModelComparespecResourceOptions builder
     */
    public Builder compareSpecResource(CompareSpecResource compareSpecResource) {
      this.featureCategories = compareSpecResource.featureCategories();
      this.featureCoefficients = compareSpecResource.featureCoefficients();
      this.typoDistance = compareSpecResource.typoDistance();
      this.similarCharactersEnabled = compareSpecResource.similarCharactersEnabled();
      this.similarCharactersMapResource = compareSpecResource.similarCharactersMapResource();
      this.rawEditDistanceEnabled = compareSpecResource.rawEditDistanceEnabled();
      this.maxGeoDistance = compareSpecResource.maxGeoDistance();
      this.similarCharactersDistance = compareSpecResource.similarCharactersDistance();
      return this;
    }
  }

  protected ReplaceModelComparespecResourceOptions() { }

  protected ReplaceModelComparespecResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureCategories,
      "featureCategories cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureCoefficients,
      "featureCoefficients cannot be null");
    resourceName = builder.resourceName;
    featureCategories = builder.featureCategories;
    featureCoefficients = builder.featureCoefficients;
    typoDistance = builder.typoDistance;
    similarCharactersEnabled = builder.similarCharactersEnabled;
    similarCharactersMapResource = builder.similarCharactersMapResource;
    rawEditDistanceEnabled = builder.rawEditDistanceEnabled;
    maxGeoDistance = builder.maxGeoDistance;
    similarCharactersDistance = builder.similarCharactersDistance;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelComparespecResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resourceName.
   *
   * The unique identifier for the comparison parameters.
   *
   * @return the resourceName
   */
  public String resourceName() {
    return resourceName;
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

