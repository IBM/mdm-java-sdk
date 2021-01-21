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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A single standardizer step.
 */
public class PutAlgorithmResponseStandardizerStep extends DynamicModel<Object> {

  @SerializedName("set_resource")
  protected String setResource;
  @SerializedName("map_resource")
  protected String mapResource;
  @SerializedName("inputs")
  protected List<Long> inputs;
  @SerializedName("comparison_resource")
  protected String comparisonResource;
  @SerializedName("fields")
  protected List<String> fields;
  @SerializedName("method")
  protected String method;
  @SerializedName("label")
  protected String label;

  public PutAlgorithmResponseStandardizerStep() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the setResource.
   *
   * An existing set resource name, if applicable.
   *
   * @return the setResource
   */
  public String getSetResource() {
    return this.setResource;
  }

  /**
   * Gets the mapResource.
   *
   * An existing map resource name, if applicable.
   *
   * @return the mapResource
   */
  public String getMapResource() {
    return this.mapResource;
  }

  /**
   * Gets the inputs.
   *
   * Collection of numbers, referencing the position of one or more defined inputs. The default value is [1].
   *
   * @return the inputs
   */
  public List<Long> getInputs() {
    return this.inputs;
  }

  /**
   * Gets the comparisonResource.
   *
   * An existing comparison resource name, if applicable.
   *
   * @return the comparisonResource
   */
  public String getComparisonResource() {
    return this.comparisonResource;
  }

  /**
   * Gets the fields.
   *
   * Collection of field names. The default values are all fields in the given inputs.
   *
   * @return the fields
   */
  public List<String> getFields() {
    return this.fields;
  }

  /**
   * Gets the method.
   *
   * A standardizer method. One of: Standardizer.UpperCase, Standardizer.Tokenizer, Standardizer.StopToken,
   * Standardizer.StopCharacter, Standardizer.PickToken, Standardizer.Phone, Standardizer.ParseToken,
   * Standardizer.MapToken, Standardizer.MapCharacter, Standardizer.LowerCase, Standardizer.Length,
   * Standardizer.KeepToken, Standardizer.JoinToken, Standardizer.GNM, Standardizer.Date or Standardizer.Acronym.
   *
   * @return the method
   */
  public String getMethod() {
    return this.method;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String getLabel() {
    return this.label;
  }
}
