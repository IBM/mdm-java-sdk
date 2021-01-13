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
 * A single standardizer definition.
 */
public class PutAlgorithmResponseStandardizer extends GenericModel {

  protected List<PutAlgorithmResponseInput> inputs;
  @SerializedName("standardizer_recipe")
  protected List<PutAlgorithmResponseStandardizerStep> standardizerRecipe;
  protected String label;

  /**
   * Gets the inputs.
   *
   * Collection of input definitions used for standardization.
   *
   * @return the inputs
   */
  public List<PutAlgorithmResponseInput> getInputs() {
    return inputs;
  }

  /**
   * Gets the standardizerRecipe.
   *
   * Collection of standardizer steps.
   *
   * @return the standardizerRecipe
   */
  public List<PutAlgorithmResponseStandardizerStep> getStandardizerRecipe() {
    return standardizerRecipe;
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

