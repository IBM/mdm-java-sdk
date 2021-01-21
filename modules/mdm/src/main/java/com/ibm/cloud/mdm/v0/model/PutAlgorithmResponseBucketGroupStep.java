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
 * A single bucket generator group step.
 */
public class PutAlgorithmResponseBucketGroupStep extends DynamicModel<Object> {

  @SerializedName("order")
  protected Boolean order;
  @SerializedName("inputs")
  protected List<Long> inputs;
  @SerializedName("fields")
  protected List<List<String>> fields;
  @SerializedName("method")
  protected String method;
  @SerializedName("label")
  protected String label;

  public PutAlgorithmResponseBucketGroupStep() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the order.
   *
   * True the tokens within the same input will be pre-sorted alphabetically.
   *
   * @return the order
   */
  public Boolean isOrder() {
    return this.order;
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
   * Gets the fields.
   *
   * Collection of collection of field names.
   *
   * @return the fields
   */
  public List<List<String>> getFields() {
    return this.fields;
  }

  /**
   * Gets the method.
   *
   * A bucket generator method. Accepted value is BucketGenerator.StopToken.
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
