/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single compare method.
 */
public class SingleCompareMethodMethod extends GenericModel {

  protected List<SingleCompareMethodComparison> comparisons;
  protected Float score;
  protected Long method;

  /**
   * Gets the comparisons.
   *
   * Collection of details of all compared values.
   *
   * @return the comparisons
   */
  public List<SingleCompareMethodComparison> getComparisons() {
    return comparisons;
  }

  /**
   * Gets the score.
   *
   * The comparison score of the current compare method.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the method.
   *
   * Internal identifier of a compare method.
   *
   * @return the method
   */
  public Long getMethod() {
    return method;
  }
}

