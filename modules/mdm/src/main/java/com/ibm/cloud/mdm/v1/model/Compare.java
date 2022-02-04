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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object for comparing records.
 */
public class Compare extends GenericModel {

  @SerializedName("compare_methods")
  protected List<SingleCompareMethod> compareMethods;
  protected Float score;

  /**
   * Gets the compareMethods.
   *
   * Collection of comparators used for comparing the records.
   *
   * @return the compareMethods
   */
  public List<SingleCompareMethod> getCompareMethods() {
    return compareMethods;
  }

  /**
   * Gets the score.
   *
   * The overall comparison score of the record(s).
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }
}

