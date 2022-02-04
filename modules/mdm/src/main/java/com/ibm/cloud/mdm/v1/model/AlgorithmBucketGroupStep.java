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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * A single bucket generator group step.
 */
public class AlgorithmBucketGroupStep extends DynamicModel<Object> {

  @SerializedName("inputs")
  protected List<Long> inputs;
  @SerializedName("order")
  protected Boolean order;
  @SerializedName("label")
  protected String label;
  @SerializedName("method")
  protected String method;
  @SerializedName("fields")
  protected List<List<String>> fields;

  public AlgorithmBucketGroupStep() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private List<Long> inputs;
    private Boolean order;
    private String label;
    private String method;
    private List<List<String>> fields;
    private Map<String, Object> dynamicProperties;

    private Builder(AlgorithmBucketGroupStep algorithmBucketGroupStep) {
      this.inputs = algorithmBucketGroupStep.inputs;
      this.order = algorithmBucketGroupStep.order;
      this.label = algorithmBucketGroupStep.label;
      this.method = algorithmBucketGroupStep.method;
      this.fields = algorithmBucketGroupStep.fields;
      this.dynamicProperties = algorithmBucketGroupStep.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param inputs the inputs
     * @param label the label
     * @param method the method
     * @param fields the fields
     */
    public Builder(List<Long> inputs, String label, String method, List<List<String>> fields) {
      this.inputs = inputs;
      this.label = label;
      this.method = method;
      this.fields = fields;
    }

    /**
     * Builds a AlgorithmBucketGroupStep.
     *
     * @return the new AlgorithmBucketGroupStep instance
     */
    public AlgorithmBucketGroupStep build() {
      return new AlgorithmBucketGroupStep(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmBucketGroupStep builder
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
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder addFields(List<String> fields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fields,
        "fields cannot be null");
      if (this.fields == null) {
        this.fields = new ArrayList<List<String>>();
      }
      this.fields.add(fields);
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder inputs(List<Long> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the order.
     *
     * @param order the order
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder order(Boolean order) {
      this.order = order;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the AlgorithmBucketGroupStep builder
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
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder fields(List<List<String>> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected AlgorithmBucketGroupStep(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputs,
      "inputs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fields,
      "fields cannot be null");
    inputs = builder.inputs;
    order = builder.order;
    label = builder.label;
    method = builder.method;
    fields = builder.fields;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a AlgorithmBucketGroupStep builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Sets the inputs.
   *
   * @param inputs the new inputs
   */
  public void setInputs(final List<Long> inputs) {
    this.inputs = inputs;
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
   * Sets the order.
   *
   * @param order the new order
   */
  public void setOrder(final Boolean order) {
    this.order = order;
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

  /**
   * Sets the label.
   *
   * @param label the new label
   */
  public void setLabel(final String label) {
    this.label = label;
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
   * Sets the method.
   *
   * @param method the new method
   */
  public void setMethod(final String method) {
    this.method = method;
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
   * Sets the fields.
   *
   * @param fields the new fields
   */
  public void setFields(final List<List<String>> fields) {
    this.fields = fields;
  }
}
