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
 * A post filter method.
 */
public class SinglePostFilterMethod extends GenericModel {

  protected Float score;
  protected Map<String, Object> distances;
  protected String name;

  protected SinglePostFilterMethod() { }

  /**
   * Gets the score.
   *
   * The filter method score computed for the current filter method.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the distances.
   *
   * Collection of distances used to calculate the filter method score.
   *
   * @return the distances
   */
  public Map<String, Object> getDistances() {
    return distances;
  }

  /**
   * Gets the name.
   *
   * The name of a filter method e.g. false_positive_filter.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

