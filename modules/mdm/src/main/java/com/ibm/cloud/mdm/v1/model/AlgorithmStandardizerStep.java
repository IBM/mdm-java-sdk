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
 * A single standardizer step.
 */
public class AlgorithmStandardizerStep extends DynamicModel<Object> {

  @SerializedName("set_resource")
  protected String setResource;
  @SerializedName("inputs")
  protected List<Long> inputs;
  @SerializedName("label")
  protected String label;
  @SerializedName("comparison_resource")
  protected String comparisonResource;
  @SerializedName("map_resource")
  protected String mapResource;
  @SerializedName("method")
  protected String method;
  @SerializedName("fields")
  protected List<String> fields;

  public AlgorithmStandardizerStep() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private String setResource;
    private List<Long> inputs;
    private String label;
    private String comparisonResource;
    private String mapResource;
    private String method;
    private List<String> fields;
    private Map<String, Object> dynamicProperties;

    private Builder(AlgorithmStandardizerStep algorithmStandardizerStep) {
      this.setResource = algorithmStandardizerStep.setResource;
      this.inputs = algorithmStandardizerStep.inputs;
      this.label = algorithmStandardizerStep.label;
      this.comparisonResource = algorithmStandardizerStep.comparisonResource;
      this.mapResource = algorithmStandardizerStep.mapResource;
      this.method = algorithmStandardizerStep.method;
      this.fields = algorithmStandardizerStep.fields;
      this.dynamicProperties = algorithmStandardizerStep.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param label the label
     * @param method the method
     */
    public Builder(String label, String method) {
      this.label = label;
      this.method = method;
    }

    /**
     * Builds a AlgorithmStandardizerStep.
     *
     * @return the new AlgorithmStandardizerStep instance
     */
    public AlgorithmStandardizerStep build() {
      return new AlgorithmStandardizerStep(this);
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the AlgorithmStandardizerStep builder
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
     * @return the AlgorithmStandardizerStep builder
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
     * Set the setResource.
     *
     * @param setResource the setResource
     * @return the AlgorithmStandardizerStep builder
     */
    public Builder setResource(String setResource) {
      this.setResource = setResource;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the AlgorithmStandardizerStep builder
     */
    public Builder inputs(List<Long> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AlgorithmStandardizerStep builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the comparisonResource.
     *
     * @param comparisonResource the comparisonResource
     * @return the AlgorithmStandardizerStep builder
     */
    public Builder comparisonResource(String comparisonResource) {
      this.comparisonResource = comparisonResource;
      return this;
    }

    /**
     * Set the mapResource.
     *
     * @param mapResource the mapResource
     * @return the AlgorithmStandardizerStep builder
     */
    public Builder mapResource(String mapResource) {
      this.mapResource = mapResource;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the AlgorithmStandardizerStep builder
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
     * @return the AlgorithmStandardizerStep builder
     */
    public Builder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the AlgorithmStandardizerStep builder
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

  protected AlgorithmStandardizerStep(Builder builder) {
    super(new TypeToken<Object>() { });
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.method,
      "method cannot be null");
    setResource = builder.setResource;
    inputs = builder.inputs;
    label = builder.label;
    comparisonResource = builder.comparisonResource;
    mapResource = builder.mapResource;
    method = builder.method;
    fields = builder.fields;
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a AlgorithmStandardizerStep builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Sets the setResource.
   *
   * @param setResource the new setResource
   */
  public void setSetResource(final String setResource) {
    this.setResource = setResource;
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
   * Sets the comparisonResource.
   *
   * @param comparisonResource the new comparisonResource
   */
  public void setComparisonResource(final String comparisonResource) {
    this.comparisonResource = comparisonResource;
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
   * Sets the mapResource.
   *
   * @param mapResource the new mapResource
   */
  public void setMapResource(final String mapResource) {
    this.mapResource = mapResource;
  }

  /**
   * Gets the method.
   *
   * A standardizer method. One of: Standardizer.UpperCase, Standardizer.Tokenizer, Standardizer.StopToken,
   * Standardizer.StopCharacter, Standardizer.PickToken, Standardizer.Phone, Standardizer.ParseToken,
   * Standardizer.MapToken, Standardizer.MapCharacter, Standardizer.LowerCase, Standardizer.Length,
   * Standardizer.KeepToken, Standardizer.JoinToken, Standardizer.GNM, Standardizer.Date, Standardizer.Acronym,
   * Standardizer.AlphaNumericTokenizer or Standardizer.NumToWord.
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
   * Collection of field names. The default values are all fields in the given inputs.
   *
   * @return the fields
   */
  public List<String> getFields() {
    return this.fields;
  }

  /**
   * Sets the fields.
   *
   * @param fields the new fields
   */
  public void setFields(final List<String> fields) {
    this.fields = fields;
  }
}
