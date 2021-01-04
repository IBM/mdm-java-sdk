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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The modelReplaceSpecResource options.
 */
public class ModelReplaceSpecResourceOptions extends GenericModel {

  protected String crn;
  protected String resourceName;
  protected Map<String, CompareSpecResourceFeatureCategory> featureCategories;
  protected Float typoDistance;
  protected Map<String, Float> featureCoefficients;
  protected String similarCharactersMapResource;
  protected Float similarCharactersDistance;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String resourceName;
    private Map<String, CompareSpecResourceFeatureCategory> featureCategories;
    private Float typoDistance;
    private Map<String, Float> featureCoefficients;
    private String similarCharactersMapResource;
    private Float similarCharactersDistance;

    private Builder(ModelReplaceSpecResourceOptions modelReplaceSpecResourceOptions) {
      this.crn = modelReplaceSpecResourceOptions.crn;
      this.resourceName = modelReplaceSpecResourceOptions.resourceName;
      this.featureCategories = modelReplaceSpecResourceOptions.featureCategories;
      this.typoDistance = modelReplaceSpecResourceOptions.typoDistance;
      this.featureCoefficients = modelReplaceSpecResourceOptions.featureCoefficients;
      this.similarCharactersMapResource = modelReplaceSpecResourceOptions.similarCharactersMapResource;
      this.similarCharactersDistance = modelReplaceSpecResourceOptions.similarCharactersDistance;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param resourceName the resourceName
     * @param featureCategories the featureCategories
     * @param typoDistance the typoDistance
     * @param featureCoefficients the featureCoefficients
     */
    public Builder(String crn, String resourceName, Map<String, CompareSpecResourceFeatureCategory> featureCategories, Float typoDistance, Map<String, Float> featureCoefficients) {
      this.crn = crn;
      this.resourceName = resourceName;
      this.featureCategories = featureCategories;
      this.typoDistance = typoDistance;
      this.featureCoefficients = featureCoefficients;
    }

    /**
     * Builds a ModelReplaceSpecResourceOptions.
     *
     * @return the new ModelReplaceSpecResourceOptions instance
     */
    public ModelReplaceSpecResourceOptions build() {
      return new ModelReplaceSpecResourceOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the resourceName.
     *
     * @param resourceName the resourceName
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder resourceName(String resourceName) {
      this.resourceName = resourceName;
      return this;
    }

    /**
     * Set the featureCategories.
     *
     * @param featureCategories the featureCategories
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder featureCategories(Map<String, CompareSpecResourceFeatureCategory> featureCategories) {
      this.featureCategories = featureCategories;
      return this;
    }

    /**
     * Set the typoDistance.
     *
     * @param typoDistance the typoDistance
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder typoDistance(Float typoDistance) {
      this.typoDistance = typoDistance;
      return this;
    }

    /**
     * Set the featureCoefficients.
     *
     * @param featureCoefficients the featureCoefficients
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder featureCoefficients(Map<String, Float> featureCoefficients) {
      this.featureCoefficients = featureCoefficients;
      return this;
    }

    /**
     * Set the similarCharactersMapResource.
     *
     * @param similarCharactersMapResource the similarCharactersMapResource
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder similarCharactersMapResource(String similarCharactersMapResource) {
      this.similarCharactersMapResource = similarCharactersMapResource;
      return this;
    }

    /**
     * Set the similarCharactersDistance.
     *
     * @param similarCharactersDistance the similarCharactersDistance
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder similarCharactersDistance(Float similarCharactersDistance) {
      this.similarCharactersDistance = similarCharactersDistance;
      return this;
    }

    /**
     * Set the compareSpecResource.
     *
     * @param compareSpecResource the compareSpecResource
     * @return the ModelReplaceSpecResourceOptions builder
     */
    public Builder compareSpecResource(CompareSpecResource compareSpecResource) {
      this.featureCategories = compareSpecResource.featureCategories();
      this.typoDistance = compareSpecResource.typoDistance();
      this.featureCoefficients = compareSpecResource.featureCoefficients();
      this.similarCharactersMapResource = compareSpecResource.similarCharactersMapResource();
      this.similarCharactersDistance = compareSpecResource.similarCharactersDistance();
      return this;
    }
  }

  protected ModelReplaceSpecResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.resourceName,
      "resourceName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureCategories,
      "featureCategories cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typoDistance,
      "typoDistance cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.featureCoefficients,
      "featureCoefficients cannot be null");
    crn = builder.crn;
    resourceName = builder.resourceName;
    featureCategories = builder.featureCategories;
    typoDistance = builder.typoDistance;
    featureCoefficients = builder.featureCoefficients;
    similarCharactersMapResource = builder.similarCharactersMapResource;
    similarCharactersDistance = builder.similarCharactersDistance;
  }

  /**
   * New builder.
   *
   * @return a ModelReplaceSpecResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

