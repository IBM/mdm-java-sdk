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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single comparator.
 */
public class PutAlgorithmResponseCompareMethod extends GenericModel {

  protected List<Float> weights;
  protected List<PutAlgorithmResponseMethods> methods;
  protected String label;

  /**
   * Gets the weights.
   *
   * An array of 11 weights that map to the distance measures from 0 to 10.
   *
   * @return the weights
   */
  public List<Float> getWeights() {
    return weights;
  }

  /**
   * Gets the methods.
   *
   * Collection of compare methods, considered in the same group.
   *
   * @return the methods
   */
  public List<PutAlgorithmResponseMethods> getMethods() {
    return methods;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

