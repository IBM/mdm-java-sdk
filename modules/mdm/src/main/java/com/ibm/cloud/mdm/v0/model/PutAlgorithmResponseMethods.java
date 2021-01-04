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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single compare method.
 */
public class PutAlgorithmResponseMethods extends GenericModel {

  @SerializedName("compare_recipe")
  protected List<PutAlgorithmResponseCompareStep> compareRecipe;
  protected List<PutAlgorithmResponseInput> inputs;

  /**
   * Gets the compareRecipe.
   *
   * Collection of compare method steps.
   *
   * @return the compareRecipe
   */
  public List<PutAlgorithmResponseCompareStep> getCompareRecipe() {
    return compareRecipe;
  }

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for this method.
   *
   * @return the inputs
   */
  public List<PutAlgorithmResponseInput> getInputs() {
    return inputs;
  }
}

