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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single comparison resource used to customize comparison logic of a matching algorithm.
 */
public class PutCompareSpecResourcesResponseCompareSpecResources extends GenericModel {

  @SerializedName("typo_distance")
  protected Float typoDistance;
  @SerializedName("similar_characters_map_resource")
  protected String similarCharactersMapResource;
  @SerializedName("feature_coefficients")
  protected Map<String, Float> featureCoefficients;
  @SerializedName("similar_characters_distance")
  protected Float similarCharactersDistance;
  @SerializedName("feature_categories")
  protected Map<String, PutCompareSpecResourcesResponseFeatureCategory> featureCategories;

  /**
   * Gets the typoDistance.
   *
   * The distance factor for each occurence of typographical error. The value must be between 0 to 1.
   *
   * @return the typoDistance
   */
  public Float getTypoDistance() {
    return typoDistance;
  }

  /**
   * Gets the similarCharactersMapResource.
   *
   * An existing map resource name for lookalike characters.
   *
   * @return the similarCharactersMapResource
   */
  public String getSimilarCharactersMapResource() {
    return similarCharactersMapResource;
  }

  /**
   * Gets the featureCoefficients.
   *
   * Collection of feature coefficients used for distance measurement. The feature coefficient key must be lower snake
   * case (i.e. name_similar90, name_exact).
   *
   * @return the featureCoefficients
   */
  public Map<String, Float> getFeatureCoefficients() {
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
  public Float getSimilarCharactersDistance() {
    return similarCharactersDistance;
  }

  /**
   * Gets the featureCategories.
   *
   * Collection of user defined comparison feature categories. The feature category key must be lower snake case.
   *
   * @return the featureCategories
   */
  public Map<String, PutCompareSpecResourcesResponseFeatureCategory> getFeatureCategories() {
    return featureCategories;
  }
}

