/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single compare method step.
 */
public class AlgorithmCompareStep extends GenericModel {

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
   * Builder.
   */
  public static class Builder {
    private String comparisonResource;
    private String setResource;
    private String mapResource;
    private List<Long> inputs;
    private String method;
    private List<String> fields;
    private String label;

    private Builder(AlgorithmCompareStep algorithmCompareStep) {
      this.comparisonResource = algorithmCompareStep.comparisonResource;
      this.setResource = algorithmCompareStep.setResource;
      this.mapResource = algorithmCompareStep.mapResource;
      this.inputs = algorithmCompareStep.inputs;
      this.method = algorithmCompareStep.method;
      this.fields = algorithmCompareStep.fields;
      this.label = algorithmCompareStep.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param method the method
     * @param label the label
     */
    public Builder(String method, String label) {
      this.method = method;
      this.label = label;
    }

    /**
     * Builds a AlgorithmCompareStep.
     *
     * @return the new AlgorithmCompareStep instance
     */
    public AlgorithmCompareStep build() {
      return new AlgorithmCompareStep(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmCompareStep builder
     */
    public Builder addInputs(Long inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<Long>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an fields to fields.
     *
     * @param fields the new fields
     * @return the AlgorithmCompareStep builder
     */
    public Builder addFields(String fields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fields,
        "fields cannot be null");
      if (this.fields == null) {
        this.fields = new ArrayList<String>();
      }
      this.fields.add(fields);
      return this;
    }

    /**
     * Set the comparisonResource.
     *
     * @param comparisonResource the comparisonResource
     * @return the AlgorithmCompareStep builder
     */
    public Builder comparisonResource(String comparisonResource) {
      this.comparisonResource = comparisonResource;
      return this;
    }

    /**
     * Set the setResource.
     *
     * @param setResource the setResource
     * @return the AlgorithmCompareStep builder
     */
    public Builder setResource(String setResource) {
      this.setResource = setResource;
      return this;
    }

    /**
     * Set the mapResource.
     *
     * @param mapResource the mapResource
     * @return the AlgorithmCompareStep builder
     */
    public Builder mapResource(String mapResource) {
      this.mapResource = mapResource;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmCompareStep builder
     */
    public Builder inputs(List<Long> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the AlgorithmCompareStep builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set the fields.
     * Existing fields will be replaced.
     *
     * @param fields the fields
     * @return the AlgorithmCompareStep builder
     */
    public Builder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmCompareStep builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected AlgorithmCompareStep(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    comparisonResource = builder.comparisonResource;
    setResource = builder.setResource;
    mapResource = builder.mapResource;
    inputs = builder.inputs;
    method = builder.method;
    fields = builder.fields;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmCompareStep builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the comparisonResource.
   *
   * An existing comparison resource name, if applicable.
   *
   * @return the comparisonResource
   */
  public String comparisonResource() {
    return comparisonResource;
  }

  /**
   * Gets the setResource.
   *
   * An existing set resource name, if applicable.
   *
   * @return the setResource
   */
  public String setResource() {
    return setResource;
  }

  /**
   * Gets the mapResource.
   *
   * An existing map resource name, if applicable.
   *
   * @return the mapResource
   */
  public String mapResource() {
    return mapResource;
  }

  /**
   * Gets the inputs.
   *
   * Collection of numbers, referencing the position of one or more defined inputs. The default value is [1].
   *
   * @return the inputs
   */
  public List<Long> inputs() {
    return inputs;
  }

  /**
   * Gets the method.
   *
   * A compare method. One of: CompareMethod.AddressCompare, CompareMethod.DateCompare, CompareMethod.EmailCompare,
   * CompareMethod.SingleTokenCompare or CompareMethod.NameCompare.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the fields.
   *
   * Collection of field names.
   *
   * @return the fields
   */
  public List<String> fields() {
    return fields;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }
}

