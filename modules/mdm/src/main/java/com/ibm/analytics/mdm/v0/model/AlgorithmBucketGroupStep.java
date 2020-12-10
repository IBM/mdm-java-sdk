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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single bucket generator group step.
 */
public class AlgorithmBucketGroupStep extends GenericModel {

  protected List<Long> inputs;
  protected Boolean order;
  protected String method;
  protected List<List<String>> fields;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Long> inputs;
    private Boolean order;
    private String method;
    private List<List<String>> fields;
    private String label;

    private Builder(AlgorithmBucketGroupStep algorithmBucketGroupStep) {
      this.inputs = algorithmBucketGroupStep.inputs;
      this.order = algorithmBucketGroupStep.order;
      this.method = algorithmBucketGroupStep.method;
      this.fields = algorithmBucketGroupStep.fields;
      this.label = algorithmBucketGroupStep.label;
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
     * @param method the method
     * @param fields the fields
     * @param label the label
     */
    public Builder(List<Long> inputs, String method, List<List<String>> fields, String label) {
      this.inputs = inputs;
      this.method = method;
      this.fields = fields;
      this.label = label;
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
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmBucketGroupStep builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected AlgorithmBucketGroupStep(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.inputs,
      "inputs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fields,
      "fields cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    inputs = builder.inputs;
    order = builder.order;
    method = builder.method;
    fields = builder.fields;
    label = builder.label;
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
  public List<Long> inputs() {
    return inputs;
  }

  /**
   * Gets the order.
   *
   * True the tokens within the same input will be pre-sorted alphabetically.
   *
   * @return the order
   */
  public Boolean order() {
    return order;
  }

  /**
   * Gets the method.
   *
   * A bucket generator method. Accepted value is BucketGenerator.StopToken.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the fields.
   *
   * Collection of collection of field names.
   *
   * @return the fields
   */
  public List<List<String>> fields() {
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

