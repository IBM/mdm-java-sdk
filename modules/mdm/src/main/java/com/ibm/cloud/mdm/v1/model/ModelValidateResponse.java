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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for model validation.
 */
public class ModelValidateResponse extends GenericModel {

  @SerializedName("algorithm_compatible")
  protected Boolean algorithmCompatible;
  @SerializedName("composite_rules_compatible")
  protected Boolean compositeRulesCompatible;
  @SerializedName("data_model_compatible")
  protected Boolean dataModelCompatible;

  /**
   * Gets the algorithmCompatible.
   *
   * Boolean value to indicate if the supplied algorithms are compatible or not.
   *
   * @return the algorithmCompatible
   */
  public Boolean isAlgorithmCompatible() {
    return algorithmCompatible;
  }

  /**
   * Gets the compositeRulesCompatible.
   *
   * Boolean value to indicate if the supplied composite rules are compatible or not.
   *
   * @return the compositeRulesCompatible
   */
  public Boolean isCompositeRulesCompatible() {
    return compositeRulesCompatible;
  }

  /**
   * Gets the dataModelCompatible.
   *
   * Boolean value to indicate if the supplied data model is compatible or not.
   *
   * @return the dataModelCompatible
   */
  public Boolean isDataModelCompatible() {
    return dataModelCompatible;
  }
}

