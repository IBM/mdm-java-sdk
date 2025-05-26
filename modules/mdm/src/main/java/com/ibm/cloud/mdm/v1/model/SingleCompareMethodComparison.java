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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a single compared values.
 */
public class SingleCompareMethodComparison extends GenericModel {

  protected Float score;
  protected List<String> types;
  protected Float distance;
  @SerializedName("feature_vector")
  protected Map<String, Object> featureVector;
  protected List<String> values;
  protected Map<String, Object> details;

  /**
   * Gets the score.
   *
   * The comparison score of compared values.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the types.
   *
   * Pair of attribute types.
   *
   * @return the types
   */
  public List<String> getTypes() {
    return types;
  }

  /**
   * Gets the distance.
   *
   * The distance measure of compared values.
   *
   * @return the distance
   */
  public Float getDistance() {
    return distance;
  }

  /**
   * Gets the featureVector.
   *
   * Collection of feature outcomes of the current compared values.
   *
   * @return the featureVector
   */
  public Map<String, Object> getFeatureVector() {
    return featureVector;
  }

  /**
   * Gets the values.
   *
   * Pair of compared values.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }

  /**
   * Gets the details.
   *
   * Collection of details of compared tokens.
   *
   * @return the details
   */
  public Map<String, Object> getDetails() {
    return details;
  }
}

