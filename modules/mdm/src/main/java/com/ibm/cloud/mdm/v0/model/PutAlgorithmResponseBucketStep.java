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
 * A single bucket generator step.
 */
public class PutAlgorithmResponseBucketStep extends GenericModel {

  protected Boolean order;
  @SerializedName("comparison_resource")
  protected String comparisonResource;
  @SerializedName("set_resource")
  protected String setResource;
  @SerializedName("map_resource")
  protected String mapResource;
  protected List<Long> inputs;
  protected String method;
  protected List<String> fields;
  protected String label;

  /**
   * Gets the order.
   *
   * True the tokens within the same input will be pre-sorted alphabetically.
   *
   * @return the order
   */
  public Boolean isOrder() {
    return order;
  }

  /**
   * Gets the comparisonResource.
   *
   * An existing comparison resource name, if applicable.
   *
   * @return the comparisonResource
   */
  public String getComparisonResource() {
    return comparisonResource;
  }

  /**
   * Gets the setResource.
   *
   * An existing set resource name, if applicable.
   *
   * @return the setResource
   */
  public String getSetResource() {
    return setResource;
  }

  /**
   * Gets the mapResource.
   *
   * An existing map resource name, if applicable.
   *
   * @return the mapResource
   */
  public String getMapResource() {
    return mapResource;
  }

  /**
   * Gets the inputs.
   *
   * Collection of numbers, referencing the position of one or more defined inputs. The default value is [1].
   *
   * @return the inputs
   */
  public List<Long> getInputs() {
    return inputs;
  }

  /**
   * Gets the method.
   *
   * A bucket generator method. One of: BucketGenerator.StopToken, BucketGenerator.NGram, BucketGenerator.Normphone,
   * BucketGenerator.PickToken or BucketGenerator.MapToken.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Gets the fields.
   *
   * Collection of field names.
   *
   * @return the fields
   */
  public List<String> getFields() {
    return fields;
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

