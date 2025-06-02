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
 * Defines metadata of a system property.
 */
public class DataModelSystemProperty extends GenericModel {

  protected Boolean settable;
  protected Boolean indexed;
  protected Boolean editable;
  protected Boolean deprecated;
  @SerializedName("data_type")
  protected String dataType;
  protected String description;
  protected String label;
  protected String classification;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean settable;
    private Boolean indexed;
    private Boolean editable;
    private Boolean deprecated;
    private String dataType;
    private String description;
    private String label;
    private String classification;

    /**
     * Instantiates a new Builder from an existing DataModelSystemProperty instance.
     *
     * @param dataModelSystemProperty the instance to initialize the Builder with
     */
    private Builder(DataModelSystemProperty dataModelSystemProperty) {
      this.settable = dataModelSystemProperty.settable;
      this.indexed = dataModelSystemProperty.indexed;
      this.editable = dataModelSystemProperty.editable;
      this.deprecated = dataModelSystemProperty.deprecated;
      this.dataType = dataModelSystemProperty.dataType;
      this.description = dataModelSystemProperty.description;
      this.label = dataModelSystemProperty.label;
      this.classification = dataModelSystemProperty.classification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataType the dataType
     * @param label the label
     */
    public Builder(String dataType, String label) {
      this.dataType = dataType;
      this.label = label;
    }

    /**
     * Builds a DataModelSystemProperty.
     *
     * @return the new DataModelSystemProperty instance
     */
    public DataModelSystemProperty build() {
      return new DataModelSystemProperty(this);
    }

    /**
     * Set the settable.
     *
     * @param settable the settable
     * @return the DataModelSystemProperty builder
     */
    public Builder settable(Boolean settable) {
      this.settable = settable;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the DataModelSystemProperty builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the DataModelSystemProperty builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }

    /**
     * Set the deprecated.
     *
     * @param deprecated the deprecated
     * @return the DataModelSystemProperty builder
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the DataModelSystemProperty builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelSystemProperty builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelSystemProperty builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the DataModelSystemProperty builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }
  }

  protected DataModelSystemProperty() { }

  protected DataModelSystemProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    settable = builder.settable;
    indexed = builder.indexed;
    editable = builder.editable;
    deprecated = builder.deprecated;
    dataType = builder.dataType;
    description = builder.description;
    label = builder.label;
    classification = builder.classification;
  }

  /**
   * New builder.
   *
   * @return a DataModelSystemProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the settable.
   *
   * System pre-defined settable indicator. The default value is false.
   *
   * @return the settable
   */
  public Boolean settable() {
    return settable;
  }

  /**
   * Gets the indexed.
   *
   * System pre-defined indexed indicator. The default value is true.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the editable.
   *
   * System pre-defined editable indicator. The default value is false.
   *
   * @return the editable
   */
  public Boolean editable() {
    return editable;
  }

  /**
   * Gets the deprecated.
   *
   * System pre-defined deprecated indicator. The default value is false.
   *
   * @return the deprecated
   */
  public Boolean deprecated() {
    return deprecated;
  }

  /**
   * Gets the dataType.
   *
   * System pre-defined data type. One of: String or Long.
   *
   * @return the dataType
   */
  public String dataType() {
    return dataType;
  }

  /**
   * Gets the description.
   *
   * System pre-defined description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * System pre-defined label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the classification.
   *
   * System defined classification of the property.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }
}

